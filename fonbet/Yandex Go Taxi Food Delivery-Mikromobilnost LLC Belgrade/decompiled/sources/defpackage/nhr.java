package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class nhr implements rhr {
    public final vlr a;
    public final RecyclerView.g b;
    public final tpr c;
    public final tpr d;
    public final Drawable e;
    public final Integer f;
    public final Integer g;
    public final tls h;
    public final ljr i;
    public final String j;
    public final boolean k;
    public final rmr l;
    public final boolean m;

    public nhr(vlr vlrVar, wgw0 wgw0Var, tpr tprVar, tpr tprVar2, GradientDrawable gradientDrawable, Integer num, tls tlsVar, ljr ljrVar, String str, rmr rmrVar, int i) {
        wgw0Var = (i & 2) != 0 ? null : wgw0Var;
        tpr tprVar3 = (i & 8) != 0 ? null : tprVar2;
        GradientDrawable gradientDrawable2 = (i & 16) != 0 ? null : gradientDrawable;
        Integer num2 = (i & 32) != 0 ? null : num;
        Integer num3 = (i & 64) != 0 ? null : -1;
        tls dsgVar = (i & 128) != 0 ? new dsg(21) : tlsVar;
        ljr ljrVar2 = (i & 256) != 0 ? null : ljrVar;
        String str2 = (i & 512) == 0 ? str : null;
        boolean z = (i & 1024) == 0;
        rmr rmrVar2 = (i & 2048) != 0 ? pmr.a : rmrVar;
        boolean z2 = (i & 4096) == 0;
        this.a = vlrVar;
        this.b = wgw0Var;
        this.c = tprVar;
        this.d = tprVar3;
        this.e = gradientDrawable2;
        this.f = num2;
        this.g = num3;
        this.h = dsgVar;
        this.i = ljrVar2;
        this.j = str2;
        this.k = z;
        this.l = rmrVar2;
        this.m = z2;
    }

    @Override // defpackage.rhr
    public final tls b() {
        return this.h;
    }

    @Override // defpackage.rhr
    public final String c() {
        return this.j;
    }

    @Override // defpackage.rhr
    public final RecyclerView.g d() {
        return this.b;
    }

    @Override // defpackage.rhr
    public final boolean e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhr)) {
            return false;
        }
        nhr nhrVar = (nhr) obj;
        return jl40.l(this.a, nhrVar.a) && jl40.l(this.b, nhrVar.b) && jl40.l(this.c, nhrVar.c) && jl40.l(this.d, nhrVar.d) && jl40.l(this.e, nhrVar.e) && jl40.l(this.f, nhrVar.f) && jl40.l(this.g, nhrVar.g) && jl40.l(this.h, nhrVar.h) && jl40.l(this.i, nhrVar.i) && jl40.l(this.j, nhrVar.j) && this.k == nhrVar.k && jl40.l(this.l, nhrVar.l) && this.m == nhrVar.m;
    }

    @Override // defpackage.rhr
    public final vlr f() {
        return this.a;
    }

    @Override // defpackage.rhr
    public final tpr getActions() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RecyclerView.g gVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        tpr tprVar = this.d;
        int hashCode3 = (hashCode2 + (tprVar == null ? 0 : tprVar.hashCode())) * 31;
        Drawable drawable = this.e;
        int hashCode4 = (hashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int a = ly3.a((hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.h);
        ljr ljrVar = this.i;
        int hashCode6 = (a + (ljrVar == null ? 0 : ljrVar.hashCode())) * 31;
        String str = this.j;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + unr0.e((hashCode6 + (str != null ? str.hashCode() : 0)) * 31, 31, this.k)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Fullscreen(flexSdkConfig=");
        sb.append(this.a);
        sb.append(", onScrollListener=");
        sb.append(this.b);
        sb.append(", actions=");
        sb.append(this.c);
        sb.append(", isStatusBarLightFlow=");
        sb.append(this.d);
        sb.append(", contentBackgroundDrawable=");
        sb.append(this.e);
        sb.append(", backgroundColor=");
        sb.append(this.f);
        sb.append(", closeButtonColor=");
        sb.append(this.g);
        sb.append(", actionHandler=");
        sb.append(this.h);
        sb.append(", flexInsetParams=");
        sb.append(this.i);
        sb.append(", screenName=");
        sb.append(this.j);
        sb.append(", canHandleScreenTracking=");
        sb.append(this.k);
        sb.append(", flexViewAnimationDelegate=");
        sb.append(this.l);
        sb.append(", hasCloseButton=");
        return x4e.i(sb, this.m, Extension.C_BRAKE);
    }
}
