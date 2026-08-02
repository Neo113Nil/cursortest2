package yads;

import android.media.MediaCodec;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class h63 implements cl1 {
    public static MediaCodec b(bl1 bl1Var) {
        bl1Var.a.getClass();
        String str = bl1Var.a.a;
        h83.a("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        h83.a();
        return createByCodecName;
    }

    @Override // yads.cl1
    public final el1 a(bl1 bl1Var) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = b(bl1Var);
            h83.a("configureCodec");
            mediaCodec.configure(bl1Var.b, bl1Var.d, bl1Var.e, 0);
            h83.a();
            h83.a("startCodec");
            mediaCodec.start();
            h83.a();
            return new i63(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
