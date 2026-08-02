package xsna;

import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;

/* compiled from: MusicPlayerInformerState.kt */
/* loaded from: classes3.dex */
public final class nx40 implements km50 {
    public final ArtistArtistPromoDto b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public nx40() {
        this(0);
    }

    public static nx40 a(nx40 nx40Var, ArtistArtistPromoDto artistArtistPromoDto, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            artistArtistPromoDto = nx40Var.b;
        }
        ArtistArtistPromoDto artistArtistPromoDto2 = artistArtistPromoDto;
        if ((i & 2) != 0) {
            z = nx40Var.c;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = nx40Var.d;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = nx40Var.e;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = nx40Var.f;
        }
        nx40Var.getClass();
        return new nx40(artistArtistPromoDto2, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx40)) {
            return false;
        }
        nx40 nx40Var = (nx40) obj;
        return epx.f(this.b, nx40Var.b) && this.c == nx40Var.c && this.d == nx40Var.d && this.e == nx40Var.e && this.f == nx40Var.f;
    }

    public final int hashCode() {
        ArtistArtistPromoDto artistArtistPromoDto = this.b;
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b((artistArtistPromoDto == null ? 0 : artistArtistPromoDto.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlayerInformerState(artistPromo=");
        sb.append(this.b);
        sb.append(", isMusicScreen=");
        sb.append(this.c);
        sb.append(", stickyBannerIsVisible=");
        sb.append(this.d);
        sb.append(", isAd=");
        sb.append(this.e);
        sb.append(", isSupportsHidingInformerOpen=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public /* synthetic */ nx40(int i) {
        this(null, false, false, false, false);
    }

    public nx40(ArtistArtistPromoDto artistArtistPromoDto, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = artistArtistPromoDto;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }
}
