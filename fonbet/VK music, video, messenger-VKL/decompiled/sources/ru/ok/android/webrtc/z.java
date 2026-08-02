package ru.ok.android.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.Predicate;
import ru.ok.android.webrtc.OKDefaultVideoDecoderFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class z implements Predicate {
    @Override // org.webrtc.Predicate
    public final boolean test(Object obj) {
        return OKDefaultVideoDecoderFactory.MyHardwareVideoDecoderFactory.a((MediaCodecInfo) obj);
    }
}
