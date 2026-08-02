package xsna;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;

/* compiled from: Authenticator.kt */
/* loaded from: classes11.dex */
public final class a75 implements tsn {
    public static final a75 b = new a75();

    public static final byte[] b(String str) {
        try {
            return str.getBytes(Charset.forName("ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static final boolean d(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i <= bArr.length) {
            Iterable k9xVar = new k9x(0, bArr2.length - 1, 1);
            if (!(k9xVar instanceof Collection) || !((Collection) k9xVar).isEmpty()) {
                j9x it = k9xVar.iterator();
                while (it.hasNext()) {
                    int nextInt = it.nextInt();
                    if (bArr[i + nextInt] != bArr2[nextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.tsn
    public List a(String str) {
        try {
            return rl3.u0(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    public void c(ipg0 ipg0Var, okhttp3.u uVar) {
    }
}
