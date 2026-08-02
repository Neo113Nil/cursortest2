package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lagf;", "Ln96;", "Lc6z;", "Companion", "zff", "yff", "current_location_in_suggest"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class agf extends n96 implements c6z {
    public static final zff Companion = new zff();
    public static final i3y[] i = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(19)), null, null, null, null, null};
    public static final agf j = new agf(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ agf(int i2, boolean z, Map map, String str, String str2, String str3, boolean z2, boolean z3) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i2 & 64) == 0) {
            this.h = true;
        } else {
            this.h = z3;
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
        if (!(obj instanceof agf)) {
            return false;
        }
        agf agfVar = (agf) obj;
        return this.b == agfVar.b && jl40.l(this.c, agfVar.c) && jl40.l(this.d, agfVar.d) && jl40.l(this.e, agfVar.e) && jl40.l(this.f, agfVar.f) && this.g == agfVar.g && this.h == agfVar.h;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + unr0.e(unr0.b(unr0.b(unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder l = nnm.l("CurrentLocationInFavouritesExperiment(enabled=", ", l10n=", ", titleKey=", this.c, this.b);
        g8e.D(l, this.d, ", subtitleKey=", this.e, ", imageTag=");
        tse0.y(this.f, ", alwaysVisible=", ", isSticky=", l, this.g);
        return x4e.i(l, this.h, Extension.C_BRAKE);
    }

    public agf() {
        this(0);
    }

    public agf(int i2) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = false;
        this.h = true;
    }
}
