package defpackage;

import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

/* loaded from: classes6.dex */
public abstract class kfn0 {
    public final ofn0 a;
    public final String b;
    public final String c;
    public final int d;
    public final ten0 e;
    public final Integer f;
    public final String g;
    public final boolean h;
    public final ScootersOnTheWayAction i;

    public kfn0(ofn0 ofn0Var, String str, String str2, int i, ten0 ten0Var, Integer num, String str3, ScootersOnTheWayAction scootersOnTheWayAction, int i2) {
        i = (i2 & 8) != 0 ? xng0.controlMinor : i;
        ten0Var = (i2 & 16) != 0 ? qen0.a : ten0Var;
        num = (i2 & 32) != 0 ? null : num;
        str3 = (i2 & 64) != 0 ? null : str3;
        boolean z = (i2 & 128) == 0;
        this.a = ofn0Var;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = ten0Var;
        this.f = num;
        this.g = str3;
        this.h = z;
        this.i = scootersOnTheWayAction;
    }

    public final ScootersOnTheWayAction a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                ny61.t("null cannot be cast to non-null type ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction");
                return false;
            }
            kfn0 kfn0Var = (kfn0) obj;
            if (this.a.equals(kfn0Var.a) && jl40.l(this.b, kfn0Var.b) && this.c.equals(kfn0Var.c) && this.d == kfn0Var.d && jl40.l(this.e, kfn0Var.e) && jl40.l(this.f, kfn0Var.f) && jl40.l(this.g, kfn0Var.g) && this.h == kfn0Var.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.d);
        Boolean valueOf2 = Boolean.valueOf(this.h);
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = (valueOf.hashCode() + ((this.c.hashCode() + (hashCode * 31)) * 31)) * 31;
        ten0 ten0Var = this.e;
        int hashCode3 = (hashCode2 + (ten0Var != null ? ten0Var.hashCode() : 0)) * 31;
        Integer num = this.f;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.g;
        return valueOf2.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
