package xsna;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventDoubles;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.live.media.audio.AudioPlayerNative;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.objects.GLSSBO;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class po4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ po4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Context context;
        double d;
        Iterator it;
        View view;
        switch (this.b) {
            case 0:
                AudioFocusRequestHelper.unmute$lambda$8((AudioFocusRequestHelper) this.c);
                break;
            case 1:
                iwq iwqVar = (iwq) this.c;
                ArrayList arrayList = iwqVar.s;
                if (!arrayList.isEmpty()) {
                    iwqVar.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventDoubles(i7o0.a(arrayList))));
                    arrayList.clear();
                    break;
                }
                break;
            case 2:
                ((p7w) this.c).b();
                break;
            case 3:
                qkz qkzVar = (qkz) this.c;
                if (qkzVar.b != null) {
                    pkz pkzVar = qkzVar.b;
                    pkzVar.l = false;
                    pkzVar.d.t();
                }
                if (qkzVar.b == null) {
                    okz okzVar = qkzVar.d;
                    if (okzVar != null) {
                        okzVar.d();
                        okzVar.f = null;
                        okzVar.a();
                        qkzVar.d = null;
                    }
                    k kVar = qkzVar.e;
                    if (kVar != null) {
                        kVar.d();
                        kVar.f = null;
                        kVar.a();
                        qkzVar.e = null;
                    }
                    AudioPlayerNative audioPlayerNative = qkzVar.f;
                    if (audioPlayerNative != null) {
                        audioPlayerNative.stop();
                        qkzVar.f = null;
                    }
                    HandlerThread handlerThread = qkzVar.c;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                        qkzVar.c = null;
                    }
                    qkzVar.o = null;
                    break;
                }
                break;
            case 4:
                yb00 yb00Var = (yb00) this.c;
                yb00Var.c = true;
                yb00Var.b = false;
                break;
            case 5:
                ((GLSSBO) this.c).release();
                break;
            case 6:
                RemoteSettingsShared._init_$lambda$0((RemoteSettingsShared) this.c);
                break;
            case 7:
                VideoDialog videoDialog = VideoDialog.this;
                videoDialog.B0 = true;
                videoDialog.x0.w0(videoDialog.D0);
                if (videoDialog.C0) {
                    videoDialog.C0 = false;
                    try {
                        videoDialog.N0.a(videoDialog.mo2getContext(), videoDialog.r0.e.a1(), Long.valueOf(videoDialog.w0.getPosition()), null);
                    } catch (Exception e) {
                        com.vk.metrics.eventtracking.b.a.a(e);
                    }
                }
                VideoDialog.vo(videoDialog);
                videoDialog.D0 = false;
                break;
            case 8:
                ((p9s0) this.c).invoke();
                break;
            default:
                suy0 suy0Var = (suy0) this.c;
                float elapsedRealtime = (SystemClock.elapsedRealtime() - suy0Var.b) / 1000.0f;
                WeakReference weakReference = suy0Var.g;
                if (weakReference == null || (view = (View) weakReference.get()) == null) {
                    context = null;
                    d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                } else {
                    d = c1z0.a(view);
                    context = view.getContext();
                }
                b6z0 b6z0Var = suy0Var.e;
                b6z0 b6z0Var2 = suy0Var.d;
                List list = b6z0Var2.c;
                if (!list.isEmpty() || !b6z0Var.c.isEmpty()) {
                    if (context == null) {
                        Iterator it2 = b6z0Var.c.iterator();
                        while (it2.hasNext()) {
                            ((oiz0) it2.next()).j = -1.0f;
                        }
                        break;
                    } else {
                        b6z0 a = b6z0Var2.a();
                        List list2 = a.c;
                        while (!list.isEmpty()) {
                            int size = list.size() - 1;
                            if (b920.b(((ghy0) list.get(size)).i, elapsedRealtime) == 1) {
                                it = b6z0Var.c.iterator();
                                while (it.hasNext()) {
                                    oiz0 oiz0Var = (oiz0) it.next();
                                    int i = oiz0Var.f;
                                    float f = oiz0Var.j;
                                    boolean z = d < ((double) i);
                                    boolean z2 = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    if (z) {
                                        oiz0Var.j = -1.0f;
                                    } else if (z2) {
                                        oiz0Var.j = elapsedRealtime;
                                    } else if (b920.b(elapsedRealtime - f, oiz0Var.h) != -1) {
                                        if (oiz0Var.i) {
                                            list2.add(oiz0Var);
                                        }
                                        it.remove();
                                    }
                                }
                                h8z0.h(a, suy0Var.h);
                                break;
                            } else {
                                ghy0 ghy0Var = (ghy0) list.remove(size);
                                int i2 = ghy0Var.f;
                                boolean z3 = ghy0Var.h;
                                boolean z4 = ((double) i2) <= d;
                                if ((z4 && z3) || (!z4 && !z3)) {
                                    list2.add(ghy0Var);
                                }
                            }
                        }
                        it = b6z0Var.c.iterator();
                        while (it.hasNext()) {
                        }
                        h8z0.h(a, suy0Var.h);
                    }
                }
                break;
        }
    }
}
