package okcalls;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.internal.MutableMediaOptions;

/* loaded from: classes8.dex */
public final /* synthetic */ class p extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        return ((MutableMediaOptions) this.receiver).getVideoState();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        ((MutableMediaOptions) this.receiver).setVideoState((MediaOptionState) obj);
    }
}
