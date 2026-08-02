package xsna;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final /* synthetic */ class mk01 implements Callable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ yi01 d;

    public /* synthetic */ mk01(boolean z, String str, yi01 yi01Var) {
        this.b = z;
        this.c = str;
        this.d = yi01Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.b;
        String str = this.c;
        yi01 yi01Var = this.d;
        String str2 = (z || !sm01.b(str, yi01Var, true, false).a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        exc0.i(messageDigest);
        byte[] digest = messageDigest.digest(yi01Var.e);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : digest) {
            char[] cArr2 = ro.c;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
            i2 += 2;
        }
        StringBuilder b2 = i5s.b(str2, ": pkg=", str, ", sha256=", new String(cArr));
        b2.append(", atk=");
        b2.append(z);
        b2.append(", ver=12451000.false");
        return b2.toString();
    }
}
