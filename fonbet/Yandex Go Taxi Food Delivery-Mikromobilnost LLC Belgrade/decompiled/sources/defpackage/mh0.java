package defpackage;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import java.util.List;

/* loaded from: classes13.dex */
public final class mh0 implements xh0 {
    public final String a;
    public final String b;
    public final List c;
    public final oh0 d;
    public final uh0 e;
    public final List f;
    public final qh0 g;
    public final vh0 h;
    public final AddPaymentHomeResponse.DisplayType i;
    public final String j;

    public mh0(String str, String str2, List list, oh0 oh0Var, uh0 uh0Var, List list2, qh0 qh0Var, vh0 vh0Var, AddPaymentHomeResponse.DisplayType displayType, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = oh0Var;
        this.e = uh0Var;
        this.f = list2;
        this.g = qh0Var;
        this.h = vh0Var;
        this.i = displayType;
        this.j = str3;
    }

    public static mh0 b(mh0 mh0Var, String str) {
        return new mh0(mh0Var.a, mh0Var.b, mh0Var.c, mh0Var.d, mh0Var.e, mh0Var.f, mh0Var.g, mh0Var.h, mh0Var.i, str);
    }

    @Override // defpackage.xh0
    public final boolean a() {
        return this.i == AddPaymentHomeResponse.DisplayType.FULLSCREEN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh0)) {
            return false;
        }
        mh0 mh0Var = (mh0) obj;
        return jl40.l(this.a, mh0Var.a) && jl40.l(this.b, mh0Var.b) && jl40.l(this.c, mh0Var.c) && jl40.l(this.d, mh0Var.d) && jl40.l(this.e, mh0Var.e) && jl40.l(this.f, mh0Var.f) && jl40.l(this.g, mh0Var.g) && jl40.l(this.h, mh0Var.h) && this.i == mh0Var.i && jl40.l(this.j, mh0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        oh0 oh0Var = this.d;
        int c2 = unr0.c((this.e.hashCode() + ((c + (oh0Var == null ? 0 : oh0Var.hashCode())) * 31)) * 31, 31, this.f);
        qh0 qh0Var = this.g;
        int hashCode2 = (c2 + (qh0Var == null ? 0 : qh0Var.hashCode())) * 31;
        vh0 vh0Var = this.h;
        int hashCode3 = (hashCode2 + (vh0Var == null ? 0 : vh0Var.hashCode())) * 31;
        AddPaymentHomeResponse.DisplayType displayType = this.i;
        int hashCode4 = (hashCode3 + (displayType == null ? 0 : displayType.hashCode())) * 31;
        String str2 = this.j;
        return Boolean.hashCode(false) + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Content(title=", this.a, ", subtitle=", this.b, ", buttons=");
        v.append(this.c);
        v.append(", footer=");
        v.append(this.d);
        v.append(", prerequisiteScreen=");
        v.append(this.e);
        v.append(", inputFields=");
        v.append(this.f);
        v.append(", infoScreen=");
        v.append(this.g);
        v.append(", toolbar=");
        v.append(this.h);
        v.append(", displayType=");
        v.append(this.i);
        v.append(", bindingError=");
        v.append(this.j);
        v.append(", isBindingStarted=false)");
        return v.toString();
    }
}
