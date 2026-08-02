package xsna;

import com.vk.dto.common.Peer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes11.dex */
public final class mq9 {
    public static final con0 a = new con0("RESUME_TOKEN");

    public static final Peer a(w2w w2wVar) {
        Peer Q0 = w2wVar.Q0();
        Q0.getClass();
        return Q0.Ab(Peer.Type.GROUP) ? Q0 : w2wVar.H0();
    }

    public static final p190 b(OutputStream outputStream) {
        Logger logger = ez70.a;
        return new p190(outputStream, new mxo0());
    }

    public static p190 c(File file) throws FileNotFoundException {
        Logger logger = ez70.a;
        return b(new FileOutputStream(file, false));
    }

    public static final i3x d(InputStream inputStream) {
        Logger logger = ez70.a;
        return new i3x(inputStream, new mxo0());
    }
}
