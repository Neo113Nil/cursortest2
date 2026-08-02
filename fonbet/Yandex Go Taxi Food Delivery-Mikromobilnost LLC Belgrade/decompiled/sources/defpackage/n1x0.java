package defpackage;

import android.media.MediaCodec;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.f;
import java.io.IOException;

/* loaded from: classes10.dex */
public class n1x0 implements mb10 {
    public static MediaCodec a(lb10 lb10Var) {
        lb10Var.a.getClass();
        String str = lb10Var.a.a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // defpackage.mb10
    public final pb10 o(lb10 lb10Var) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = a(lb10Var);
            Trace.beginSection("configureCodec");
            Surface surface = lb10Var.d;
            mediaCodec.configure(lb10Var.b, surface, lb10Var.e, (surface == null && lb10Var.a.k && tw21.a >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            f fVar = lb10Var.f;
            zxs0 zxs0Var = new zxs0();
            zxs0Var.a = mediaCodec;
            zxs0Var.b = fVar;
            if (tw21.a >= 35 && fVar != null) {
                fVar.a(mediaCodec);
            }
            return zxs0Var;
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
