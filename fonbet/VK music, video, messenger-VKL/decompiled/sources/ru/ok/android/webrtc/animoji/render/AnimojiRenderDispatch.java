package ru.ok.android.webrtc.animoji.render;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import okcalls.b;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.animoji.recv.AnimojiRecvDataPackage;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderDispatch;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource;
import ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle;
import ru.ok.android.webrtc.animoji.util.AnimojiDataPackagePayload;
import ru.ok.android.webrtc.animoji.util.ParticipantResolver;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.ColorUtils;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.as2;
import xsna.cs2;
import xsna.hfr;
import xsna.i5g;
import xsna.izs;
import xsna.jq;
import xsna.rli0;
import xsna.sf1;
import xsna.vr2;
import xsna.yr2;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiRenderDispatch {

    @Deprecated
    public static final String TAG = "AniRenderDispatch";
    public final AnimojiCore a;
    public final ParticipantResolver b;
    public final AnimojiDataSupplierInterface c;
    public final AnimojiStatHandle d;
    public final izs e;
    public final HandlerThread f;
    public final Handler g;
    public final HandlerThread h;
    public final Handler i;
    public final HashMap j;
    public final ConcurrentHashMap k;
    public HashMap l;
    public final HashMap m;
    public final LinkedHashSet n;
    public final Point o;
    public final RTCLog p;
    public final CallOpenGLRenderer q;
    public volatile boolean r;

    public AnimojiRenderDispatch(AnimojiCore animojiCore, ParticipantResolver participantResolver, AnimojiDataSupplierInterface animojiDataSupplierInterface, EglBase eglBase, AnimojiStatHandle animojiStatHandle, izs<? super CallParticipant.ParticipantId, Boolean> izsVar) {
        this.a = animojiCore;
        this.b = participantResolver;
        this.c = animojiDataSupplierInterface;
        this.d = animojiStatHandle;
        this.e = izsVar;
        HandlerThread handlerThread = new HandlerThread("AniRDControl");
        this.f = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("AniRDOutput");
        this.h = handlerThread2;
        this.j = new HashMap();
        this.k = new ConcurrentHashMap();
        this.m = new HashMap();
        this.n = new LinkedHashSet();
        this.o = new Point();
        RTCLog logger$webrtc_android_sdk_release = animojiCore.getLogger$webrtc_android_sdk_release();
        this.p = logger$webrtc_android_sdk_release;
        this.q = new CallOpenGLRenderer(logger$webrtc_android_sdk_release, eglBase.getEglBaseContext(), EglBase.CONFIG_PLAIN, "CallOpenGLAnimoji");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
        handlerThread2.start();
        this.i = new Handler(handlerThread2.getLooper());
    }

    public static final void a(AnimojiRenderDispatch animojiRenderDispatch, CallParticipant.ParticipantId participantId, VideoFrame videoFrame) {
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) animojiRenderDispatch.k.get(participantId);
            if (copyOnWriteArraySet != null) {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((VideoSink) it.next()).onFrame(videoFrame);
                }
            }
            videoFrame.release();
            animojiRenderDispatch.d.onDispatchFrame(participantId);
        } catch (Throwable th) {
            videoFrame.release();
            throw th;
        }
    }

    public final void applyDisplayLayouts(List<CallDisplayLayoutItem> list) {
        Point point = new Point();
        HashMap hashMap = new HashMap();
        hfr.a aVar = new hfr.a(rli0.j(new i5g(list), new sf1(this, 2)));
        while (aVar.hasNext()) {
            CallDisplayLayoutItem a = a(point, (CallDisplayLayoutItem) aVar.next());
            CallParticipant.ParticipantId participantId = a.getVideoTrackParticipantKey().getParticipantId();
            CallDisplayLayoutItem callDisplayLayoutItem = (CallDisplayLayoutItem) hashMap.get(a.getVideoTrackParticipantKey().getParticipantId());
            if (callDisplayLayoutItem != null) {
                VideoDisplayLayout layout = callDisplayLayoutItem.getLayout();
                VideoDisplayLayout layout2 = a.getLayout();
                if (layout.getHeight() * layout.getWidth() > layout2.getHeight() * layout2.getWidth()) {
                    a = callDisplayLayoutItem;
                }
            }
            hashMap.put(participantId, a);
        }
        StringBuilder sb = new StringBuilder("layouts: {");
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(((CallParticipant.ParticipantId) entry.getKey()).id);
            sb.append(" -> ");
            sb.append(((CallDisplayLayoutItem) entry.getValue()).getLayout().getWidth());
            sb.append('x');
            sb.append(((CallDisplayLayoutItem) entry.getValue()).getLayout().getHeight());
            sb.append(" , ");
        }
        sb.append("}");
        this.p.log(TAG, sb.toString());
        this.g.post(new as2(this, hashMap, point, 0));
    }

    public final void b(CallParticipant.ParticipantId participantId) {
        if (this.r) {
            return;
        }
        this.p.log(TAG, "Renderer for " + participantId + " can not be created right now, postpone creation for a while");
        this.n.add(participantId);
    }

    public final AnimojiRenderWrapper c(CallParticipant.ParticipantId participantId) {
        AnimojiRenderWrapper animojiRenderWrapper = (AnimojiRenderWrapper) this.j.get(participantId);
        if (animojiRenderWrapper != null) {
            return animojiRenderWrapper;
        }
        boolean z = false;
        if (this.c.enabled()) {
            HashMap hashMap = this.l;
            if ((hashMap != null ? hashMap.containsKey(participantId) : false) && this.c.requestResolveParticipantIdFromInternal(participantId)) {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        this.p.log(TAG, "creating renderer for: " + participantId);
        AnimojiRenderWrapperImpl a = a(participantId);
        if (a == null) {
            return null;
        }
        this.j.put(participantId, a);
        this.p.log(TAG, "created renderer for: " + participantId);
        a.startDrawing();
        return a;
    }

    public final void d(CallParticipant.ParticipantId participantId) {
        if (this.r) {
            return;
        }
        this.p.log(TAG, "Postponed renderer for " + participantId + " is no longer needed, remove it from waiting list");
        this.n.remove(participantId);
    }

    public final void dispatchFrame(final CallParticipant.ParticipantId participantId, final VideoFrame videoFrame) {
        if (this.r) {
            return;
        }
        videoFrame.retain();
        try {
            if (this.i.post(new Runnable() { // from class: xsna.wr2
                @Override // java.lang.Runnable
                public final void run() {
                    AnimojiRenderDispatch.a(AnimojiRenderDispatch.this, participantId, videoFrame);
                }
            })) {
                return;
            }
            videoFrame.release();
        } catch (IllegalStateException unused) {
            videoFrame.release();
        }
    }

    public final void dispatchLoadedSvg(CallParticipant.ParticipantId participantId, AnimojiSvgResource animojiSvgResource) {
        if (this.r) {
            return;
        }
        this.a.onAnimojiSvgReady(participantId, animojiSvgResource);
    }

    public final void dispatchLocalBgColor$webrtc_android_sdk_release(final int i, final CallParticipant.ParticipantId participantId) {
        this.g.post(new Runnable() { // from class: xsna.zr2
            @Override // java.lang.Runnable
            public final void run() {
                AnimojiRenderDispatch.a(AnimojiRenderDispatch.this, participantId, i);
            }
        });
    }

    public final void dispatchLocalLandmarks$webrtc_android_sdk_release(final float[] fArr, final CallParticipant.ParticipantId participantId) {
        this.g.post(new Runnable() { // from class: xsna.xr2
            @Override // java.lang.Runnable
            public final void run() {
                AnimojiRenderDispatch.a(AnimojiRenderDispatch.this, participantId, fArr);
            }
        });
    }

    public final void handleAnimojiChanged(CallParticipant.ParticipantId participantId) {
        this.g.post(new yr2(0, this, participantId));
    }

    public final void onPackage(AnimojiRecvDataPackage animojiRecvDataPackage) {
        if (this.r) {
            return;
        }
        this.g.post(new vr2(0, this, animojiRecvDataPackage));
    }

    public final void onParticipantAnimojiStateChanged(CallParticipant callParticipant, final boolean z) {
        final CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
        if (participantId == null) {
            return;
        }
        this.g.post(new Runnable() { // from class: xsna.bs2
            @Override // java.lang.Runnable
            public final void run() {
                AnimojiRenderDispatch.a(z, this, participantId);
            }
        });
    }

    public final void release() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.g.removeCallbacksAndMessages(null);
        this.g.postAtFrontOfQueue(new cs2(this, 0));
        this.q.release();
        this.f.quitSafely();
        this.k.clear();
        this.h.quitSafely();
        this.c.release();
    }

    public final void setVideoSinks(CallParticipant.ParticipantId participantId, List<? extends VideoSink> list) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.k;
        Object obj = concurrentHashMap.get(participantId);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(participantId, (obj = new CopyOnWriteArraySet()))) != null) {
            obj = putIfAbsent;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) obj;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.addAll(list);
    }

    public static final void a(AnimojiRenderDispatch animojiRenderDispatch, AnimojiRecvDataPackage animojiRecvDataPackage) {
        animojiRenderDispatch.a(animojiRecvDataPackage);
    }

    public final void a(Integer num, CallParticipant.ParticipantId participantId, int i) {
        AnimojiRenderWrapper c = participantId != null ? c(participantId) : null;
        if (c == null) {
            RTCLog rTCLog = this.p;
            StringBuilder d = jq.d(num, "renderer is not ready to process background color (", ColorUtils.INSTANCE.colorToHex(i), ") for ssrc:participant (", StringUtils.PROCESS_POSTFIX_DELIMITER);
            d.append(participantId);
            d.append(")");
            rTCLog.log(TAG, d.toString());
            this.m.put(num, Integer.valueOf(i));
            return;
        }
        this.m.remove(num);
        c.onBgColor(i);
        this.d.onDispatchBgColor(participantId);
    }

    public final void a(Integer num, CallParticipant.ParticipantId participantId, float[] fArr) {
        Integer num2;
        AnimojiRenderWrapper c = participantId != null ? c(participantId) : null;
        if (c != null) {
            if (!this.m.isEmpty() && (num2 = (Integer) this.m.get(num)) != null) {
                int intValue = num2.intValue();
                RTCLog rTCLog = this.p;
                StringBuilder d = jq.d(num, "renderer processes pending background color (", ColorUtils.INSTANCE.colorToHex(intValue), ") for ssrc:participant (", StringUtils.PROCESS_POSTFIX_DELIMITER);
                d.append(participantId);
                d.append(")");
                rTCLog.log(TAG, d.toString());
                this.m.remove(num);
                c.onBgColor(intValue);
                this.d.onDispatchBgColor(participantId);
            }
            c.onLandmarks(fArr);
            this.d.onDispatchLandmarks(participantId);
        }
    }

    public final void a(AnimojiRecvDataPackage animojiRecvDataPackage) {
        CallParticipant.ParticipantId resolve = this.b.resolve(animojiRecvDataPackage.getSsrc());
        if (resolve == null) {
            this.a.getLogger$webrtc_android_sdk_release().log(TAG, "unknown ssrc: " + animojiRecvDataPackage.getSsrc());
        }
        AnimojiDataPackagePayload payload = animojiRecvDataPackage.getPayload();
        if (payload instanceof AnimojiDataPackagePayload.AnimojiData) {
            a(Integer.valueOf(animojiRecvDataPackage.getSsrc()), resolve, ((AnimojiDataPackagePayload.AnimojiData) animojiRecvDataPackage.getPayload()).getData());
            return;
        }
        if (payload instanceof AnimojiDataPackagePayload.BgColor) {
            a(Integer.valueOf(animojiRecvDataPackage.getSsrc()), resolve, ((AnimojiDataPackagePayload.BgColor) animojiRecvDataPackage.getPayload()).getColor());
            return;
        }
        if (payload instanceof AnimojiDataPackagePayload.EOS) {
            return;
        }
        if (payload instanceof AnimojiDataPackagePayload.Unknown) {
            Throwable th = new Throwable("Unknown animoji message type");
            RTCLog rTCLog = this.p;
            String message = th.getMessage();
            if (message == null) {
                message = "animoji error";
            }
            rTCLog.reportException(TAG, message, th);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void a(AnimojiRenderDispatch animojiRenderDispatch, CallParticipant.ParticipantId participantId, float[] fArr) {
        animojiRenderDispatch.a((Integer) null, participantId, fArr);
    }

    public static final void a(AnimojiRenderDispatch animojiRenderDispatch, CallParticipant.ParticipantId participantId, int i) {
        animojiRenderDispatch.a((Integer) null, participantId, i);
    }

    public final AnimojiRenderWrapperImpl a(CallParticipant.ParticipantId participantId) {
        CallDisplayLayoutItem callDisplayLayoutItem;
        AnimojiRenderWrapper.AntiAlias antiAlias;
        String resourcePackPath = this.c.getResourcePackPath();
        try {
            AnimojiSvgResource svg = this.c.getSvg(participantId);
            this.n.remove(participantId);
            AnimojiRenderWrapperImpl animojiRenderWrapperImpl = new AnimojiRenderWrapperImpl(this, participantId, this.p, this.q, new b(1, this.c, AnimojiDataSupplierInterface.class, "createRender", "createRender(Lkotlin/jvm/functions/Function1;)V", 0), resourcePackPath, svg, this.d);
            HashMap hashMap = this.l;
            if (hashMap != null && (callDisplayLayoutItem = (CallDisplayLayoutItem) hashMap.get(participantId)) != null) {
                int width = callDisplayLayoutItem.getLayout().getWidth();
                int height = callDisplayLayoutItem.getLayout().getHeight();
                int width2 = callDisplayLayoutItem.getLayout().getWidth();
                int height2 = callDisplayLayoutItem.getLayout().getHeight();
                Point point = this.o;
                if (width2 >= point.x && height2 >= point.y) {
                    antiAlias = AnimojiRenderWrapper.AntiAlias.PRIMARY;
                } else {
                    antiAlias = AnimojiRenderWrapper.AntiAlias.LIGHT;
                }
                animojiRenderWrapperImpl.onSetFrameSize(width, height, antiAlias);
            }
            return animojiRenderWrapperImpl;
        } catch (Exception e) {
            this.p.log(TAG, "failed to create wrapper for " + participantId + ": " + e);
            return null;
        }
    }

    public static final void a(boolean z, AnimojiRenderDispatch animojiRenderDispatch, CallParticipant.ParticipantId participantId) {
        if (z) {
            if (animojiRenderDispatch.c(participantId) == null) {
                animojiRenderDispatch.b(participantId);
            }
        } else {
            animojiRenderDispatch.d(participantId);
            AnimojiRenderWrapper animojiRenderWrapper = (AnimojiRenderWrapper) animojiRenderDispatch.j.get(participantId);
            if (animojiRenderWrapper != null) {
                animojiRenderWrapper.stopDrawing();
            }
        }
    }

    public static final boolean a(AnimojiRenderDispatch animojiRenderDispatch, CallDisplayLayoutItem callDisplayLayoutItem) {
        Pair pair = new Pair(callDisplayLayoutItem.getVideoTrackParticipantKey(), callDisplayLayoutItem.getLayout());
        CallVideoTrackParticipantKey callVideoTrackParticipantKey = (CallVideoTrackParticipantKey) pair.d();
        VideoDisplayLayout videoDisplayLayout = (VideoDisplayLayout) pair.g();
        return videoDisplayLayout.getWidth() != 0 && videoDisplayLayout.getHeight() != 0 && callVideoTrackParticipantKey.getType() == VideoTrackType.ANIMOJI && ((Boolean) animojiRenderDispatch.e.invoke(callVideoTrackParticipantKey.getParticipantId())).booleanValue();
    }

    public static final CallDisplayLayoutItem a(Point point, CallDisplayLayoutItem callDisplayLayoutItem) {
        point.x = Integer.max(point.x, callDisplayLayoutItem.getLayout().getWidth());
        point.y = Integer.max(point.y, callDisplayLayoutItem.getLayout().getHeight());
        return callDisplayLayoutItem;
    }

    public static final void a(AnimojiRenderDispatch animojiRenderDispatch, HashMap hashMap, Point point) {
        AnimojiRenderWrapper.AntiAlias antiAlias;
        animojiRenderDispatch.l = hashMap;
        Point point2 = animojiRenderDispatch.o;
        point2.x = point.x;
        point2.y = point.y;
        Iterator it = animojiRenderDispatch.j.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            CallDisplayLayoutItem callDisplayLayoutItem = (CallDisplayLayoutItem) hashMap.get(entry.getKey());
            AnimojiRenderWrapper animojiRenderWrapper = (AnimojiRenderWrapper) entry.getValue();
            if (callDisplayLayoutItem == null) {
                animojiRenderWrapper.release();
                it.remove();
            } else {
                int width = callDisplayLayoutItem.getLayout().getWidth();
                int height = callDisplayLayoutItem.getLayout().getHeight();
                Point point3 = animojiRenderDispatch.o;
                if (width >= point3.x && height >= point3.y) {
                    antiAlias = AnimojiRenderWrapper.AntiAlias.PRIMARY;
                } else {
                    antiAlias = AnimojiRenderWrapper.AntiAlias.LIGHT;
                }
                animojiRenderWrapper.onSetFrameSize(callDisplayLayoutItem.getLayout().getWidth(), callDisplayLayoutItem.getLayout().getHeight(), antiAlias);
            }
        }
        animojiRenderDispatch.a();
    }

    public static final void a(AnimojiRenderDispatch animojiRenderDispatch) {
        animojiRenderDispatch.n.clear();
        Iterator it = animojiRenderDispatch.j.entrySet().iterator();
        while (it.hasNext()) {
            ((AnimojiRenderWrapper) ((Map.Entry) it.next()).getValue()).release();
        }
        animojiRenderDispatch.j.clear();
        animojiRenderDispatch.k.clear();
    }

    public static final void a(AnimojiRenderDispatch animojiRenderDispatch, CallParticipant.ParticipantId participantId) {
        AnimojiRenderWrapper animojiRenderWrapper = (AnimojiRenderWrapper) animojiRenderDispatch.j.get(participantId);
        if (animojiRenderWrapper != null) {
            animojiRenderWrapper.notifyAnimojiChanged();
        }
    }

    public final void a() {
        if (this.r || this.n.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.n);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) obj;
            if (c(participantId) == null) {
                this.p.log(TAG, "Postponed renderer for " + participantId + " still can not be created");
            }
        }
    }
}
