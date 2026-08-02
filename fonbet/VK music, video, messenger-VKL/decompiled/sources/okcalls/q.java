package okcalls;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.internal.MutableMediaOptions;

/* loaded from: classes8.dex */
public final /* synthetic */ class q extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        return ((MutableMediaOptions) this.receiver).getScreenshareState();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        ((MutableMediaOptions) this.receiver).setScreenshareState((MediaOptionState) obj);
    }
}
