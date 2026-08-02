package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes2.dex */
public final class hhk implements ev31 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        String str;
        rr51 rr51Var;
        ghk ghkVar = (ghk) obj;
        Throwable th = ghkVar.d;
        if (ghkVar.b) {
            String str2 = ghkVar.e;
            return str2 != null ? new ohk(new eal(new pks0(str2), false, null, 6)) : new ohk(null);
        }
        if (!ghkVar.c && (rr51Var = ghkVar.a) != null) {
            return new mhk(rr51Var);
        }
        rbv c = gao.c(th);
        Text f = gao.f(th, gao.a);
        Text b = gao.b(th, gao.b);
        mzz0 mzz0Var = th instanceof mzz0 ? (mzz0) th : null;
        if (mzz0Var == null || (str = mzz0Var.getTraceId()) == null) {
            str = null;
        }
        return new nhk(f, b, c, str != null ? new lzz0(str) : null);
    }
}
