package xsna;

import com.facebook.imagepipeline.nativecode.NativeImageTranscoderFactory;

/* compiled from: MultiImageTranscoderFactory.kt */
/* loaded from: classes.dex */
public final class g540 implements gmw {
    public final int a;
    public final gmw b;
    public final Integer c;

    public g540(int i, gmw gmwVar, Integer num) {
        this.a = i;
        this.b = gmwVar;
        this.c = num;
    }

    @Override // xsna.gmw
    public final fmw createImageTranscoder(siw siwVar, boolean z) {
        fmw fmwVar = null;
        gmw gmwVar = this.b;
        fmw createImageTranscoder = gmwVar != null ? gmwVar.createImageTranscoder(siwVar, z) : null;
        int i = this.a;
        if (createImageTranscoder == null) {
            Integer num = this.c;
            if (num != null) {
                if (num.intValue() == 0) {
                    fmwVar = NativeImageTranscoderFactory.getNativeImageTranscoderFactory(i, false, true).createImageTranscoder(siwVar, z);
                } else {
                    if (num.intValue() != 1) {
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                    }
                    fmwVar = (zqj0) new arj0(i).createImageTranscoder(siwVar, z);
                }
            }
            createImageTranscoder = fmwVar;
        }
        if (createImageTranscoder == null) {
            createImageTranscoder = NativeImageTranscoderFactory.getNativeImageTranscoderFactory(i, false, true).createImageTranscoder(siwVar, z);
        }
        return createImageTranscoder == null ? (zqj0) new arj0(i).createImageTranscoder(siwVar, z) : createImageTranscoder;
    }
}
