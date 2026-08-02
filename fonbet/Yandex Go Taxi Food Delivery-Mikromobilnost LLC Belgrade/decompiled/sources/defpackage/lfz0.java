package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lfz0 implements mfz0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public lfz0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // defpackage.mfz0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfz0)) {
            return false;
        }
        lfz0 lfz0Var = (lfz0) obj;
        return jl40.l(this.a, lfz0Var.a) && jl40.l(this.b, lfz0Var.b) && jl40.l(this.c, lfz0Var.c) && this.d == lfz0Var.d;
    }

    @Override // defpackage.mfz0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // defpackage.mfz0
    public final boolean isEmpty() {
        return jl40.h(avu0.i(this.c), 0.0d);
    }

    @Override // defpackage.mfz0
    public final boolean isSelected() {
        return this.d;
    }

    public final String toString() {
        return nnm.i(this.c, ", isSelected=", Extension.C_BRAKE, b64.v("PredefinedTipModel(choiceId=", this.a, ", title=", this.b, ", decimalValue="), this.d);
    }
}
