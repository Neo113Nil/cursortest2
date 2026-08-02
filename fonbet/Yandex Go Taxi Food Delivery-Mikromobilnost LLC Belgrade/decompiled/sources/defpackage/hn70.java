package defpackage;

import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;

/* loaded from: classes14.dex */
public final class hn70 {
    public final CharSequence a;
    public final kdc b;
    public final Boolean c;
    public final SpannableTextStrategyInteractor.SpannableTextStrategy d;
    public final Integer e;
    public final boolean f;
    public final Integer g;
    public final int h;
    public final CharSequence i;
    public final kdc j;
    public final nm70 k;
    public final fn70 l;
    public final boolean m;
    public final float n;
    public final int o;
    public final int p;
    public final Float q;
    public final boolean r;
    public final long s;
    public final long t;
    public final String u;
    public final String v;

    public /* synthetic */ hn70(CharSequence charSequence, kdc kdcVar, Boolean bool, SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy, Integer num, boolean z, Integer num2, CharSequence charSequence2, kdc kdcVar2, nm70 nm70Var, fn70 fn70Var, boolean z2, int i, Float f, boolean z3, long j, long j2, String str, int i2) {
        this((i2 & 1) != 0 ? null : charSequence, (i2 & 2) != 0 ? null : kdcVar, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE : spannableTextStrategy, (i2 & 16) != 0 ? Integer.valueOf(f1h0.ic_chevron_next_circle) : num, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : num2, 800, (i2 & 256) != 0 ? null : charSequence2, (i2 & 512) != 0 ? null : kdcVar2, (i2 & 1024) != 0 ? null : nm70Var, (i2 & 2048) != 0 ? null : fn70Var, (i2 & 4096) != 0 ? false : z2, 40.0f, (i2 & 16384) != 0 ? 0 : 2, (32768 & i2) != 0 ? 0 : i, (65536 & i2) != 0 ? null : f, (131072 & i2) != 0 ? false : z3, (262144 & i2) != 0 ? 0L : j, (524288 & i2) == 0 ? j2 : 0L, (i2 & 1048576) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v6, types: [fn70] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.CharSequence] */
    public static hn70 a(hn70 hn70Var, String str, SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy, Integer num, String str2, lm70 lm70Var, int i) {
        String str3 = (i & 1) != 0 ? hn70Var.a : str;
        kdc kdcVar = hn70Var.b;
        Boolean bool = hn70Var.c;
        SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy2 = (i & 8) != 0 ? hn70Var.d : spannableTextStrategy;
        Integer num2 = (i & 16) != 0 ? hn70Var.e : num;
        boolean z = hn70Var.f;
        Integer num3 = hn70Var.g;
        int i2 = hn70Var.h;
        String str4 = (i & 256) != 0 ? hn70Var.i : str2;
        kdc kdcVar2 = hn70Var.j;
        nm70 nm70Var = hn70Var.k;
        lm70 lm70Var2 = (i & 2048) != 0 ? hn70Var.l : lm70Var;
        boolean z2 = hn70Var.m;
        float f = (i & 8192) != 0 ? hn70Var.n : 61.0f;
        int i3 = hn70Var.o;
        int i4 = hn70Var.p;
        Float f2 = hn70Var.q;
        boolean z3 = hn70Var.r;
        long j = hn70Var.s;
        long j2 = hn70Var.t;
        String str5 = hn70Var.u;
        hn70Var.getClass();
        return new hn70(str3, kdcVar, bool, spannableTextStrategy2, num2, z, num3, i2, str4, kdcVar2, nm70Var, lm70Var2, z2, f, i3, i4, f2, z3, j, j2, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn70)) {
            return false;
        }
        hn70 hn70Var = (hn70) obj;
        return jl40.l(this.a, hn70Var.a) && jl40.l(this.b, hn70Var.b) && jl40.l(this.c, hn70Var.c) && this.d == hn70Var.d && jl40.l(this.e, hn70Var.e) && this.f == hn70Var.f && jl40.l(this.g, hn70Var.g) && this.h == hn70Var.h && jl40.l(this.i, hn70Var.i) && jl40.l(this.j, hn70Var.j) && jl40.l(this.k, hn70Var.k) && jl40.l(this.l, hn70Var.l) && this.m == hn70Var.m && Float.compare(this.n, hn70Var.n) == 0 && this.o == hn70Var.o && this.p == hn70Var.p && jl40.l(this.q, hn70Var.q) && this.r == hn70Var.r && this.s == hn70Var.s && this.t == hn70Var.t && jl40.l(this.u, hn70Var.u);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        Integer num = this.e;
        int e = unr0.e((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
        Integer num2 = this.g;
        int b = oyr.b(this.h, (e + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        CharSequence charSequence2 = this.i;
        int hashCode4 = (b + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        kdc kdcVar2 = this.j;
        int hashCode5 = (hashCode4 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        nm70 nm70Var = this.k;
        int hashCode6 = (hashCode5 + (nm70Var == null ? 0 : nm70Var.hashCode())) * 31;
        fn70 fn70Var = this.l;
        int b2 = oyr.b(this.p, oyr.b(this.o, g8e.c(this.n, unr0.e((hashCode6 + (fn70Var == null ? 0 : fn70Var.hashCode())) * 31, 31, this.m), 31), 31), 31);
        Float f = this.q;
        int c = qv10.c(qv10.c(unr0.e((b2 + (f == null ? 0 : f.hashCode())) * 31, 31, this.r), 31, this.s), 31, this.t);
        String str = this.u;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderCardHeaderUiState(title=");
        sb.append((Object) this.a);
        sb.append(", titleColor=");
        sb.append(this.b);
        sb.append(", isTitleColorForced=");
        sb.append(this.c);
        sb.append(", titleSpannableStrategy=");
        sb.append(this.d);
        sb.append(", titleEndDrawableRes=");
        sb.append(this.e);
        sb.append(", animateTitleProgress=");
        sb.append(this.f);
        sb.append(", titleProgressAnimationColor=");
        sb.append(this.g);
        sb.append(", titleProgressAnimationDuration=");
        sb.append(this.h);
        sb.append(", subtitle=");
        sb.append((Object) this.i);
        sb.append(", subtitleColor=");
        sb.append(this.j);
        sb.append(", lead=");
        sb.append(this.k);
        sb.append(", trail=");
        sb.append(this.l);
        sb.append(", isTrailClickable=");
        sb.append(this.m);
        sb.append(", trailSizeDp=");
        sb.append(this.n);
        sb.append(", trailImportantForAccessibilityMode=");
        vfc.u(this.o, this.p, ", trailGravity=", ", trailPaddingEndDp=", sb);
        sb.append(this.q);
        sb.append(", isProgressBarVisible=");
        sb.append(this.r);
        sb.append(", progressBarDuration=");
        sb.append(this.s);
        x4e.A(this.t, ", progressBarStartTime=", ", contentDescriptionPrefix=", sb);
        return oyr.t(sb, this.u, Extension.C_BRAKE);
    }

    public hn70(CharSequence charSequence, kdc kdcVar, Boolean bool, SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy, Integer num, boolean z, Integer num2, int i, CharSequence charSequence2, kdc kdcVar2, nm70 nm70Var, fn70 fn70Var, boolean z2, float f, int i2, int i3, Float f2, boolean z3, long j, long j2, String str) {
        String str2 = str;
        this.a = charSequence;
        this.b = kdcVar;
        this.c = bool;
        this.d = spannableTextStrategy;
        this.e = num;
        this.f = z;
        this.g = num2;
        this.h = i;
        this.i = charSequence2;
        this.j = kdcVar2;
        this.k = nm70Var;
        this.l = fn70Var;
        this.m = z2;
        this.n = f;
        this.o = i2;
        this.p = i3;
        this.q = f2;
        this.r = z3;
        this.s = j;
        this.t = j2;
        this.u = str2;
        charSequence = (charSequence == null || evu0.J(charSequence)) ? null : charSequence;
        charSequence2 = (charSequence2 == null || evu0.J(charSequence2)) ? null : charSequence2;
        this.v = (charSequence == null && charSequence2 == null) ? null : a.X(j73.A(new CharSequence[]{(str2 == null || evu0.J(str2)) ? null : str2, charSequence, charSequence2}), Extension.FIX_SPACE, null, null, null, 62);
    }

    public hn70() {
        this(null, null, null, null, null, false, null, null, null, null, null, false, 0, null, false, 0L, 0L, null, 2097151);
    }
}
