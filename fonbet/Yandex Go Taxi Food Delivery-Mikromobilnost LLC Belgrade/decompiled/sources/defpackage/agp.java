package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lagp;", "Lxn11;", "Lc6z;", "Companion", "zfp", "yfp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class agp implements xn11, c6z {
    public static final zfp Companion = new zfp();
    public static final i3y[] m = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(22)), null, null, null, null, null, null, null, null, null};
    public static final agp n = new agp(0);
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;

    public /* synthetic */ agp(int i, boolean z, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, String str2, String str3) {
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
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z4;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z5;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z6;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z7;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str2;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agp)) {
            return false;
        }
        agp agpVar = (agp) obj;
        return this.b == agpVar.b && jl40.l(this.c, agpVar.c) && this.d == agpVar.d && this.e == agpVar.e && this.f == agpVar.f && this.g == agpVar.g && this.h == agpVar.h && this.i == agpVar.i && jl40.l(this.j, agpVar.j) && jl40.l(this.k, agpVar.k) && jl40.l(this.l, agpVar.l);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return this.l.hashCode() + unr0.b(unr0.b(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder l = nnm.l("FavoriteEditSettingsExperiment(isEnabled=", ", l10n=", ", isHideEntrance=", this.c, this.b);
        nnm.v(", isHideDeliverySection=", ", isHideSelectAsDestination=", l, this.d, this.e);
        nnm.v(", isHideTitle=", ", isHideAddressSubtitle=", l, this.f, this.g);
        nnm.v(", isAutoBackAfterSaving=", ", editFavoriteEmptyNameErrorTk=", l, this.h, this.i);
        g8e.D(l, this.j, ", editFavoriteDriverCommentTitleTk=", this.k, ", editFavoriteCourierCommentTitleTk=");
        return oyr.t(l, this.l, Extension.C_BRAKE);
    }

    public agp() {
        this(0);
    }

    public agp(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = "";
        this.k = "";
        this.l = "";
    }
}
