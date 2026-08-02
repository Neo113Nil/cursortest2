package ru.ok.android.webrtc.animoji;

import org.webrtc.NativeDoubleArrayConsumer;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.animoji.AnimojiNativeControl;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle;
import xsna.dt;
import xsna.epx;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiNativeControl {
    public static final Companion Companion = new Companion(null);
    public static final NativeDoubleArrayConsumer.Consumer h = new dt(2);
    public final AnimojiCore a;
    public final SharedPeerConnectionFactory b;
    public final AnimojiDataSupplierInterface c;
    public final AnimojiStatHandle d;
    public Boolean e;
    public String f = "";
    public NativeDoubleArrayConsumer.Consumer g = h;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public AnimojiNativeControl(AnimojiCore animojiCore, SharedPeerConnectionFactory sharedPeerConnectionFactory, AnimojiDataSupplierInterface animojiDataSupplierInterface, AnimojiStatHandle animojiStatHandle) {
        this.a = animojiCore;
        this.b = sharedPeerConnectionFactory;
        this.c = animojiDataSupplierInterface;
        this.d = animojiStatHandle;
    }

    public static final void a(Double[] dArr) {
    }

    public final String getConfigFilePath() {
        return this.f;
    }

    public final NativeDoubleArrayConsumer.Consumer getConsumerProp() {
        return this.g;
    }

    public final Boolean getEnabled() {
        return this.e;
    }

    public final void setConsumer(NativeDoubleArrayConsumer.Consumer consumer) {
        setConsumerProp(consumer);
    }

    public final void setConsumerProp(NativeDoubleArrayConsumer.Consumer consumer) {
        if (epx.f(this.g, consumer)) {
            return;
        }
        this.g = consumer;
        a();
    }

    public final void setEnabled(boolean z) {
        if (this.c.enabled()) {
            String modelPath = this.c.getModelPath();
            if (epx.f(this.e, Boolean.valueOf(z)) && epx.f(this.f, modelPath)) {
                return;
            }
            this.e = Boolean.valueOf(z);
            this.f = modelPath;
            a();
        }
    }

    public final void a() {
        this.d.onMlParams(this.e, this.f);
        Boolean bool = this.e;
        if (bool != null) {
            final boolean booleanValue = bool.booleanValue();
            this.b.getExecutor().submit(new Runnable() { // from class: xsna.tr2
                @Override // java.lang.Runnable
                public final void run() {
                    AnimojiNativeControl.a(AnimojiNativeControl.this, booleanValue);
                }
            });
            this.a.onMyAnimojiSettingsChanged(booleanValue);
        }
    }

    public static final void a(AnimojiNativeControl animojiNativeControl, boolean z) {
        PeerConnectionFactory factory = animojiNativeControl.b.getFactory();
        if (factory != null) {
            factory.setAnimojiParams(z, animojiNativeControl.f, animojiNativeControl.g);
        }
    }
}
