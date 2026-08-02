package defpackage;

import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class bhb1 {
    public static final Map a(el9 el9Var) {
        if (el9Var instanceof bl9) {
            return ((bl9) el9Var).e;
        }
        if (el9Var instanceof al9) {
            return ((al9) el9Var).e;
        }
        if (el9Var instanceof zk9) {
            return ((zk9) el9Var).e;
        }
        if (el9Var instanceof dl9) {
            return null;
        }
        w511.b();
        return null;
    }

    public static final noz b(noz nozVar) {
        LayoutNode layoutNode = nozVar.I.I;
        while (true) {
            LayoutNode s = layoutNode.s();
            if ((s != null ? s.A : null) == null) {
                return ((s) layoutNode.a0.e).Z0();
            }
            layoutNode.s();
            layoutNode = layoutNode.s().A;
        }
    }

    public static final void c(InputStream inputStream, OutputStream outputStream) {
        if (Build.VERSION.SDK_INT >= 33) {
            inputStream.transferTo(outputStream);
            return;
        }
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
