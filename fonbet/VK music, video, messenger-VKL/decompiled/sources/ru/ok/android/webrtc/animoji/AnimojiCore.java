package ru.ok.android.webrtc.animoji;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import okcalls.a;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.animoji.recv.AnimojiReceiver;
import ru.ok.android.webrtc.animoji.recv.AnimojiRecvDataPackage;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderDispatch;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource;
import ru.ok.android.webrtc.animoji.send.AnimojiSender;
import ru.ok.android.webrtc.animoji.stats.AnimojiStat;
import ru.ok.android.webrtc.animoji.stats.AnimojiStatCollector;
import ru.ok.android.webrtc.animoji.util.AnimojiChannelBehavior;
import ru.ok.android.webrtc.animoji.util.ParticipantResolver;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.bk1;
import xsna.epx;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiCore {
    public final Call a;
    public final RTCLog b;
    public final MappingProcessor c;
    public final AnimojiDataSupplierInterface d;
    public final MutableMediaSettings e;
    public final AnimojiStatCollector f;
    public final AnimojiNativeControl g;
    public final CopyOnWriteArraySet h;
    public final AnimojiRenderDispatch i;
    public final boolean j;
    public volatile boolean k;
    public volatile Integer l;

    public AnimojiCore(Call call, SharedPeerConnectionFactory sharedPeerConnectionFactory, RTCLog rTCLog, MappingProcessor mappingProcessor, AnimojiDataSupplierInterface animojiDataSupplierInterface, MutableMediaSettings mutableMediaSettings, EglBase eglBase) {
        this.a = call;
        this.b = rTCLog;
        this.c = mappingProcessor;
        this.d = animojiDataSupplierInterface;
        this.e = mutableMediaSettings;
        AnimojiStatCollector animojiStatCollector = new AnimojiStatCollector();
        this.f = animojiStatCollector;
        AnimojiNativeControl animojiNativeControl = new AnimojiNativeControl(this, sharedPeerConnectionFactory, animojiDataSupplierInterface, animojiStatCollector);
        this.g = animojiNativeControl;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.h = copyOnWriteArraySet;
        this.i = new AnimojiRenderDispatch(this, new ParticipantResolver(call, mappingProcessor), animojiDataSupplierInterface, eglBase, animojiStatCollector, new a(1, this, AnimojiCore.class, "shouldRenderLocally", "shouldRenderLocally(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Z", 0));
        this.j = animojiDataSupplierInterface.enabled();
        animojiNativeControl.setConsumer(new bk1(this, 1));
        copyOnWriteArraySet.add(new AnimojiLandmarkConsumer() { // from class: ru.ok.android.webrtc.animoji.AnimojiCore.2
            @Override // ru.ok.android.webrtc.animoji.AnimojiLandmarkConsumer
            public void onBgColor(int i) {
                CallParticipant.ParticipantId participantId = AnimojiCore.this.a.getCurrentUserCallParticipant().getParticipantId();
                if (participantId != null) {
                    AnimojiCore.this.i.dispatchLocalBgColor$webrtc_android_sdk_release(i, participantId);
                }
            }

            @Override // ru.ok.android.webrtc.animoji.AnimojiLandmarkConsumer
            public void onLandmarks(Double[] dArr) {
                CallParticipant.ParticipantId participantId = AnimojiCore.this.a.getCurrentUserCallParticipant().getParticipantId();
                if (participantId != null) {
                    AnimojiCore animojiCore = AnimojiCore.this;
                    int length = dArr.length;
                    float[] fArr = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr[i] = (float) dArr[i].doubleValue();
                    }
                    animojiCore.i.dispatchLocalLandmarks$webrtc_android_sdk_release(fArr, participantId);
                }
            }

            @Override // ru.ok.android.webrtc.animoji.AnimojiLandmarkConsumer
            public void onEndOfStream() {
            }
        });
    }

    public static final void a(AnimojiCore animojiCore, Double[] dArr) {
        if (animojiCore.j && animojiCore.k) {
            Iterator it = animojiCore.h.iterator();
            while (it.hasNext()) {
                ((AnimojiLandmarkConsumer) it.next()).onLandmarks(dArr);
            }
        }
        animojiCore.f.onMlLandmarks();
    }

    public static final boolean access$shouldRenderLocally(AnimojiCore animojiCore, CallParticipant.ParticipantId participantId) {
        if (animojiCore.a.params.getExperiments().v() && animojiCore.a.topologyIdentity() == Topology.SERVER) {
            return epx.f(participantId, animojiCore.a.getCurrentUserCallParticipant().getParticipantId());
        }
        return true;
    }

    public final void addLandmarkConsumer(AnimojiLandmarkConsumer animojiLandmarkConsumer) {
        if (this.j) {
            this.h.add(animojiLandmarkConsumer);
            Integer num = this.l;
            if (num != null) {
                animojiLandmarkConsumer.onBgColor(num.intValue());
            }
        }
    }

    public final AnimojiChannelBehavior getBehavior() {
        return this.d.getBehavior();
    }

    public final RTCLog getLogger$webrtc_android_sdk_release() {
        return this.b;
    }

    public final MappingProcessor getMappingProcessor$webrtc_android_sdk_release() {
        return this.c;
    }

    public final AnimojiStat getStat() {
        return this.f.createStat();
    }

    public final void handleParticipantAnimojiChanged(JSONObject jSONObject) {
        CallParticipant.ParticipantId fromStringValueSafe;
        if (this.j && (fromStringValueSafe = CallParticipant.ParticipantId.fromStringValueSafe(jSONObject.optString(SignalingProtocol.KEY_PARTICIPANT_ID))) != null) {
            this.d.handleAnimojiChanged(fromStringValueSafe);
            this.i.handleAnimojiChanged(fromStringValueSafe);
        }
    }

    public final AnimojiReceiver makeReceiver() {
        return new AnimojiReceiver(this, this.f);
    }

    public final AnimojiSender makeSender(Integer num) {
        return new AnimojiSender(this, this.f, num);
    }

    public final void onAnimojiSvgReady(CallParticipant.ParticipantId participantId, AnimojiSvgResource animojiSvgResource) {
        if (this.j && this.k && epx.f(this.a.getCurrentUserCallParticipant().getParticipantId(), participantId)) {
            int bgColorRGB = animojiSvgResource.bgColorRGB();
            this.l = Integer.valueOf(bgColorRGB);
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((AnimojiLandmarkConsumer) it.next()).onBgColor(bgColorRGB);
            }
        }
    }

    public final void onMyAnimojiSettingsChanged(boolean z) {
        if (this.j) {
            this.k = z;
            this.i.onParticipantAnimojiStateChanged(this.a.getCurrentUserCallParticipant(), z);
            MutableMediaSettings mutableMediaSettings = this.e;
            if (mutableMediaSettings != null) {
                mutableMediaSettings.enableAnimoji(z);
            }
            if (z) {
                return;
            }
            this.l = null;
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((AnimojiLandmarkConsumer) it.next()).onEndOfStream();
            }
        }
    }

    public final void onParticipantAnimojiStateChanged(CallParticipant callParticipant, boolean z) {
        if (this.j) {
            this.i.onParticipantAnimojiStateChanged(callParticipant, z);
        }
    }

    public final void onRemoteAnimojiData(AnimojiRecvDataPackage animojiRecvDataPackage) {
        if (this.j) {
            this.i.onPackage(animojiRecvDataPackage);
        }
    }

    public final void release() {
        this.g.setEnabled(false);
        this.i.release();
    }

    public final void removeConsumer(AnimojiLandmarkConsumer animojiLandmarkConsumer) {
        if (this.j) {
            this.h.remove(animojiLandmarkConsumer);
        }
    }

    public final void setEnabled(boolean z, boolean z2) {
        CallParticipant.ParticipantId participantId;
        if (this.j) {
            this.g.setEnabled(z);
            if (!z2 || (participantId = this.a.getCurrentUserCallParticipant().getParticipantId()) == null) {
                return;
            }
            this.d.handleAnimojiChanged(participantId);
            this.i.handleAnimojiChanged(participantId);
        }
    }

    public final void setRenderers(CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
        if (this.j && callVideoTrackParticipantKey.getType() == VideoTrackType.ANIMOJI) {
            this.i.setVideoSinks(callVideoTrackParticipantKey.getParticipantId(), list);
        }
    }

    public final void updateDisplayLayout(List<CallDisplayLayoutItem> list) {
        if (this.j) {
            this.i.applyDisplayLayouts(list);
        }
    }

    public /* synthetic */ AnimojiCore(Call call, SharedPeerConnectionFactory sharedPeerConnectionFactory, RTCLog rTCLog, MappingProcessor mappingProcessor, AnimojiDataSupplierInterface animojiDataSupplierInterface, MutableMediaSettings mutableMediaSettings, EglBase eglBase, int i, zcl zclVar) {
        this(call, sharedPeerConnectionFactory, rTCLog, mappingProcessor, animojiDataSupplierInterface, (i & 32) != 0 ? null : mutableMediaSettings, eglBase);
    }
}
