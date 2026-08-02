package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* loaded from: classes11.dex */
public final class lye0 extends ThreadLocal {
    public final /* synthetic */ mye0 a;

    public lye0(mye0 mye0Var) {
        this.a = mye0Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        mye0 mye0Var = this.a;
        try {
            s1o s1oVar = s1o.c;
            Mac mac = (Mac) s1oVar.a.n(mye0Var.b);
            mac.init(mye0Var.c);
            return mac;
        } catch (GeneralSecurityException e) {
            ny61.o(e);
            return null;
        }
    }
}
