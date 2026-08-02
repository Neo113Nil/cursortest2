package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import okio.ByteString;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public final class ax40 extends m5j0 {
    public static final wg10 f;
    public static final wg10 g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final ByteString b;
    public final List c;
    public final wg10 d;
    public long e;

    static {
        Regex regex = wg10.e;
        f = qje.o("multipart/mixed");
        qje.o("multipart/alternative");
        qje.o("multipart/digest");
        qje.o("multipart/parallel");
        g = qje.o("multipart/form-data");
        h = new byte[]{58, BlobHeaderStructure.BLOB_VERSION};
        i = new byte[]{PKIBody._RP, 10};
        j = new byte[]{Alerts.alert_certificate_expired, Alerts.alert_certificate_expired};
    }

    public ax40(ByteString byteString, wg10 wg10Var, List list) {
        this.b = byteString;
        this.c = list;
        Regex regex = wg10.e;
        this.d = qje.o(wg10Var + "; boundary=" + byteString.w());
        this.e = -1L;
    }

    @Override // defpackage.m5j0
    public final long a() {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long e = e(null, true);
        this.e = e;
        return e;
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        return this.d;
    }

    @Override // defpackage.m5j0
    public final boolean c() {
        List list = this.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((zw40) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        e(oq6Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(oq6 oq6Var, boolean z) {
        yp6 yp6Var;
        oq6 oq6Var2;
        if (z) {
            oq6Var2 = new yp6();
            yp6Var = oq6Var2;
        } else {
            yp6Var = 0;
            oq6Var2 = oq6Var;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            ByteString byteString = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                oq6Var2.write(bArr);
                oq6Var2.N0(byteString);
                oq6Var2.write(bArr);
                oq6Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                long j3 = j2 + yp6Var.b;
                yp6Var.clear();
                return j3;
            }
            zw40 zw40Var = (zw40) list.get(i2);
            meu meuVar = zw40Var.a;
            m5j0 m5j0Var = zw40Var.b;
            oq6Var2.write(bArr);
            oq6Var2.N0(byteString);
            oq6Var2.write(bArr2);
            int size2 = meuVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                oq6Var2.p1(meuVar.b(i3)).write(h).p1(meuVar.f(i3)).write(bArr2);
            }
            wg10 b = m5j0Var.b();
            if (b != null) {
                oq6Var2.p1("Content-Type: ").p1(b.a).write(bArr2);
            }
            long a = m5j0Var.a();
            if (a == -1 && z) {
                yp6Var.clear();
                return -1L;
            }
            oq6Var2.write(bArr2);
            if (z) {
                j2 += a;
            } else {
                m5j0Var.d(oq6Var2);
            }
            oq6Var2.write(bArr2);
            i2++;
        }
    }
}
