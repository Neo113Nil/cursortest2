package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public final class adg {
    public final RippleDrawable a;
    public final wky0 b;
    public final wky0 c;
    public final View.OnClickListener d;
    public final wky0 e;
    public final List f;
    public final mz6 g;
    public final String h;
    public final shr0 i;
    public final shr0 j;

    public adg(RippleDrawable rippleDrawable, wky0 wky0Var, wky0 wky0Var2, View.OnClickListener onClickListener, wky0 wky0Var3, List list, mz6 mz6Var, String str, shr0 shr0Var, shr0 shr0Var2) {
        this.a = rippleDrawable;
        this.b = wky0Var;
        this.c = wky0Var2;
        this.d = onClickListener;
        this.e = wky0Var3;
        this.f = list;
        this.g = mz6Var;
        this.h = str;
        this.i = shr0Var;
        this.j = shr0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adg)) {
            return false;
        }
        adg adgVar = (adg) obj;
        return jl40.l(this.a, adgVar.a) && jl40.l(this.b, adgVar.b) && jl40.l(this.c, adgVar.c) && jl40.l(this.d, adgVar.d) && jl40.l(this.e, adgVar.e) && jl40.l(this.f, adgVar.f) && jl40.l(this.g, adgVar.g) && jl40.l(this.h, adgVar.h) && jl40.l(this.i, adgVar.i) && jl40.l(this.j, adgVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wky0 wky0Var = this.c;
        int hashCode2 = (hashCode + (wky0Var == null ? 0 : wky0Var.hashCode())) * 31;
        View.OnClickListener onClickListener = this.d;
        int hashCode3 = (hashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        wky0 wky0Var2 = this.e;
        int hashCode4 = (hashCode3 + (wky0Var2 == null ? 0 : wky0Var2.hashCode())) * 31;
        List list = this.f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        mz6 mz6Var = this.g;
        int b = unr0.b((hashCode5 + (mz6Var == null ? 0 : mz6Var.hashCode())) * 31, 31, this.h);
        shr0 shr0Var = this.i;
        int hashCode6 = (b + (shr0Var == null ? 0 : shr0Var.hashCode())) * 31;
        shr0 shr0Var2 = this.j;
        return hashCode6 + (shr0Var2 != null ? shr0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DailyBottomContent(background=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", rootClickListener=" + this.d + ", description=" + this.e + ", serviceUrls=" + this.f + ", button=" + this.g + ", contentDescription=" + this.h + ", leftConfettiContent=" + this.i + ", rightConfettiContent=" + this.j + ')';
    }
}
