package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mhy0 {
    public final rbv a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final qc70 d;
    public final YbButtonViewGroup.b e;

    public mhy0(rbv rbvVar, Text.Constant constant, Text.Constant constant2, qc70 qc70Var, YbButtonViewGroup.b bVar) {
        this.a = rbvVar;
        this.b = constant;
        this.c = constant2;
        this.d = qc70Var;
        this.e = bVar;
    }

    public final YbButtonViewGroup.b a() {
        return this.e;
    }

    public final Text b() {
        return this.c;
    }

    public final rbv c() {
        return this.a;
    }

    public final qc70 d() {
        return this.d;
    }

    public final Text e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhy0)) {
            return false;
        }
        mhy0 mhy0Var = (mhy0) obj;
        return this.a.equals(mhy0Var.a) && this.b.equals(mhy0Var.b) && this.c.equals(mhy0Var.c) && this.d.equals(mhy0Var.d) && jl40.l(this.e, mhy0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        YbButtonViewGroup.b bVar = this.e;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "TestPaymentStatusViewState(memberImage=" + this.a + ", title=" + this.b + ", description=" + this.c + ", operationIcon=" + this.d + ", buttonsState=" + this.e + Extension.C_BRAKE;
    }
}
