package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lljr0;", "Lxn11;", "Lc6z;", "Companion", "kjr0", "jjr0", "share_favorites"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ljr0 implements xn11, c6z {
    public static final kjr0 Companion = new kjr0();
    public static final i3y[] n = {null, null, null, null, null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(28))};
    public static final ljr0 o = new ljr0(0);
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Map m;

    public /* synthetic */ ljr0(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
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
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str6;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str7;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str8;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str9;
        }
        if ((i & 2048) == 0) {
            this.m = b.f();
        } else {
            this.m = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljr0)) {
            return false;
        }
        ljr0 ljr0Var = (ljr0) obj;
        return this.b == ljr0Var.b && this.c == ljr0Var.c && jl40.l(this.d, ljr0Var.d) && jl40.l(this.e, ljr0Var.e) && jl40.l(this.f, ljr0Var.f) && jl40.l(this.g, ljr0Var.g) && jl40.l(this.h, ljr0Var.h) && jl40.l(this.i, ljr0Var.i) && jl40.l(this.j, ljr0Var.j) && jl40.l(this.k, ljr0Var.k) && jl40.l(this.l, ljr0Var.l) && jl40.l(this.m, ljr0Var.m);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ShareCurrentLocationAndFavoritesExperiment(enabled=", ", showFavoritesSection=", ", shareLink=", this.b, this.c);
        g8e.D(u, this.d, ", shareScreenTitle=", this.e, ", shareText=");
        g8e.D(u, this.f, ", shareCurrentLocationTitle=", this.g, ", saveCurrentLocationTitle=");
        g8e.D(u, this.h, ", shareCurrentLocationSubtitle=", this.i, ", saveCurrentLocationSubtitle=");
        g8e.D(u, this.j, ", saveCurrentLocationSectionTitle=", this.k, ", shareFavoritesSectionTitleTk=");
        u.append(this.l);
        u.append(", l10n=");
        u.append(this.m);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public ljr0() {
        this(0);
    }

    public ljr0(int i) {
        Map f = b.f();
        this.b = false;
        this.c = false;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = f;
    }
}
