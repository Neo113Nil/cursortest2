package xsna;

/* compiled from: FallbackUploadHelper.kt */
/* loaded from: classes2.dex */
public final class ckq<RESULT> {
    public final izs<String, akv> a;
    public final k7r0<RESULT> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ckq(izs<? super String, akv> izsVar, k7r0<RESULT> k7r0Var) {
        this.a = izsVar;
        this.b = k7r0Var;
    }

    public final RESULT a(ocq0 ocq0Var, m7r0 m7r0Var) {
        k7r0<RESULT> k7r0Var = this.b;
        String str = ocq0Var.a;
        izs<String, akv> izsVar = this.a;
        try {
            return (RESULT) bz2.e(izsVar.invoke(str), m7r0Var, k7r0Var);
        } catch (Exception e) {
            String str2 = ocq0Var.b;
            if (str2 == null || str2.equals(str)) {
                throw e;
            }
            return (RESULT) bz2.e(izsVar.invoke(str2), m7r0Var, k7r0Var);
        }
    }
}
