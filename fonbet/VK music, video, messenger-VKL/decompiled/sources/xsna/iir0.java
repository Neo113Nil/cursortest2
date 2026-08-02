package xsna;

import androidx.window.core.VerificationMode;

/* compiled from: SpecificationComputer.kt */
/* loaded from: classes12.dex */
public final class iir0<T> extends b920 {
    public final T c;
    public final String d = "nlj0";
    public final VerificationMode e;
    public final aqw f;

    /* JADX WARN: Multi-variable type inference failed */
    public iir0(Object obj, VerificationMode verificationMode, aqw aqwVar) {
        this.c = obj;
        this.e = verificationMode;
        this.f = aqwVar;
    }

    @Override // xsna.b920
    public final T f() {
        return this.c;
    }

    @Override // xsna.b920
    public final b920 p(String str, izs<? super T, Boolean> izsVar) {
        if (izsVar.invoke(this.c).booleanValue()) {
            return this;
        }
        return new fjq(this.c, this.d, str, this.f, this.e);
    }
}
