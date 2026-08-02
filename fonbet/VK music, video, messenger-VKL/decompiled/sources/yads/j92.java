package yads;

import android.util.Base64;
import xsna.emb;

/* loaded from: classes10.dex */
public final class j92 implements i92 {
    public final hn a;

    public /* synthetic */ j92() {
        this(new hn());
    }

    public final String a(xq2 xq2Var) {
        byte[] bArr = xq2Var.b.a;
        if (bArr == null) {
            return null;
        }
        String c = u01.c(xq2Var.c, w11.T);
        if (c != null && !Boolean.parseBoolean(c)) {
            return new String(bArr, emb.b);
        }
        this.a.getClass();
        try {
            return new String(Base64.decode(bArr, 0), emb.b);
        } catch (Exception unused) {
            return new String(bArr, emb.b);
        }
    }

    public j92(hn hnVar) {
        this.a = hnVar;
    }
}
