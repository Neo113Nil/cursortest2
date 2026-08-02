package xsna;

import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ImageTranscoder.kt */
/* loaded from: classes12.dex */
public interface fmw {
    boolean canResize(rip ripVar, eng0 eng0Var, x9g0 x9g0Var);

    boolean canTranscode(siw siwVar);

    String getIdentifier();

    emw transcode(rip ripVar, OutputStream outputStream, eng0 eng0Var, x9g0 x9g0Var, siw siwVar, Integer num, ColorSpace colorSpace) throws IOException;
}
