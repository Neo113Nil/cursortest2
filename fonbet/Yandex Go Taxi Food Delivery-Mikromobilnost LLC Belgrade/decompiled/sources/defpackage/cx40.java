package defpackage;

import java.io.Closeable;
import java.nio.charset.Charset;
import okio.ByteString;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class cx40 implements Closeable {
    public final ng70 A;
    public final qq6 a;
    public final ByteString b;
    public final ByteString c;
    public int w;
    public boolean x;
    public boolean y;
    public bx40 z;

    public cx40(qq6 qq6Var, String str) {
        this.a = qq6Var;
        yp6 yp6Var = new yp6();
        yp6Var.x0("--");
        yp6Var.x0(str);
        this.b = yp6Var.l0(yp6Var.b);
        yp6 yp6Var2 = new yp6();
        yp6Var2.x0("\r\n--");
        yp6Var2.x0(str);
        this.c = yp6Var2.l0(yp6Var2.b);
        String p = oyr.p("\r\n--", str, "--");
        Charset charset = uza.a;
        ByteString byteString = new ByteString(p.getBytes(charset));
        byteString.b = p;
        ByteString byteString2 = new ByteString(Constants.LINE_SEPARATOR.getBytes(charset));
        byteString2.b = Constants.LINE_SEPARATOR;
        ByteString byteString3 = new ByteString("--".getBytes(charset));
        byteString3.b = "--";
        ByteString byteString4 = new ByteString(" ".getBytes(charset));
        byteString4.b = " ";
        ByteString byteString5 = new ByteString("\t".getBytes(charset));
        byteString5.b = "\t";
        this.A = ffx.b0(byteString, byteString2, byteString3, byteString4, byteString5);
    }

    public final long a(long j) {
        ByteString byteString = this.c;
        long h = byteString.h();
        qq6 qq6Var = this.a;
        qq6Var.B1(h);
        long J = qq6Var.h().J(byteString);
        return J == -1 ? Math.min(j, (qq6Var.h().b - byteString.h()) + 1) : Math.min(j, J);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.z = null;
        this.a.close();
    }
}
