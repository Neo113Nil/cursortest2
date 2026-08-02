package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lggf;", "Ln96;", "Lc6z;", "Companion", "fgf", "egf", "current_location_in_suggest"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ggf extends n96 implements c6z {
    public static final fgf Companion = new fgf();
    public static final i3y[] k = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new cue(10)), null, null, null, null, null, null, null};
    public static final ggf l = new ggf(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public /* synthetic */ ggf(int i, boolean z, Map map, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i & 64) == 0) {
            this.h = true;
        } else {
            this.h = z3;
        }
        if ((i & 128) == 0) {
            this.i = true;
        } else {
            this.i = z4;
        }
        if ((i & 256) == 0) {
            this.j = false;
        } else {
            this.j = z5;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && d6z.Y(this, this.d).length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggf)) {
            return false;
        }
        ggf ggfVar = (ggf) obj;
        return this.b == ggfVar.b && jl40.l(this.c, ggfVar.c) && jl40.l(this.d, ggfVar.d) && jl40.l(this.e, ggfVar.e) && jl40.l(this.f, ggfVar.f) && this.g == ggfVar.g && this.h == ggfVar.h && this.i == ggfVar.i && this.j == ggfVar.j;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + unr0.e(unr0.e(unr0.e(unr0.b(unr0.b(unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder l2 = nnm.l("CurrentLocationInSuggestsExperiment(enabled=", ", l10n=", ", titleKey=", this.c, this.b);
        g8e.D(l2, this.d, ", subtitleKey=", this.e, ", imageTag=");
        tse0.y(this.f, ", alwaysVisible=", ", isSticky=", l2, this.g);
        nnm.v(", isGeoTap=", ", replaceTitleInSuggestInput=", l2, this.h, this.i);
        return x4e.i(l2, this.j, Extension.C_BRAKE);
    }

    public ggf() {
        this(0);
    }

    public ggf(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = false;
        this.h = true;
        this.i = true;
        this.j = false;
    }
}
