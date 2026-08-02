package xsna;

import com.vk.ecomm.shop_conditions.impl.ui.dovdialog.data.model.ConditionType;

/* compiled from: ShopConditionParams.kt */
/* loaded from: classes18.dex */
public final class jej0 {
    public final ConditionType a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final ely e;

    public jej0(ConditionType conditionType, String str, CharSequence charSequence, String str2, ely elyVar) {
        this.a = conditionType;
        this.b = str;
        this.c = charSequence;
        this.d = str2;
        this.e = elyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jej0)) {
            return false;
        }
        jej0 jej0Var = (jej0) obj;
        return this.a == jej0Var.a && epx.f(this.b, jej0Var.b) && epx.f(this.c, jej0Var.c) && epx.f(this.d, jej0Var.d) && epx.f(this.e, jej0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(u11.c(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ely elyVar = this.e;
        return a + (elyVar == null ? 0 : elyVar.hashCode());
    }

    public final String toString() {
        return "ShopConditionUnitedParagraph(conditionType=" + this.a + ", title=" + this.b + ", text=" + ((Object) this.c) + ", onTextEmpty=" + this.d + ", labelIcon=" + this.e + ')';
    }
}
