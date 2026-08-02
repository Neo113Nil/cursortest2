package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import java.util.List;
import java.util.Objects;

/* compiled from: SitpostingHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class twj0 extends ol60 {
    public final CharSequence h;
    public final CharSequence i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final List<String> n;
    public final boolean o;
    public final CharSequence p;
    public final boolean q;
    public final boolean r;
    public final SituationalSuggest s;
    public final int t;

    public twj0(CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, CharSequence charSequence3, boolean z4, boolean z5, SituationalSuggest situationalSuggest, int i) {
        super(1105, 0, i, 6, null);
        this.h = charSequence;
        this.i = charSequence2;
        this.j = str;
        this.k = str2;
        this.l = z;
        this.m = z2;
        this.n = list;
        this.o = z3;
        this.p = charSequence3;
        this.q = z4;
        this.r = z5;
        this.s = situationalSuggest;
        this.t = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!twj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        twj0 twj0Var = (twj0) obj;
        return Objects.equals(this.h, twj0Var.h) && Objects.equals(this.i, twj0Var.i) && Objects.equals(this.j, twj0Var.j) && Objects.equals(this.k, twj0Var.k) && Boolean.valueOf(this.l).equals(Boolean.valueOf(twj0Var.l)) && Boolean.valueOf(this.m).equals(Boolean.valueOf(twj0Var.m)) && Objects.equals(this.n, twj0Var.n) && Boolean.valueOf(this.o).equals(Boolean.valueOf(twj0Var.o)) && Objects.equals(this.p, twj0Var.p) && Boolean.valueOf(this.q).equals(Boolean.valueOf(twj0Var.q)) && Boolean.valueOf(this.r).equals(Boolean.valueOf(twj0Var.r));
    }

    @Override // xsna.ol60
    public final int f() {
        return this.t;
    }

    public final int hashCode() {
        return Objects.hash(this.h, this.i, this.j, this.k, Boolean.valueOf(this.l), Boolean.valueOf(this.m), this.n, Boolean.valueOf(this.o), this.p, Boolean.valueOf(this.q), Boolean.valueOf(this.r));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SitpostingHolderUiDto(titleText=");
        sb.append((Object) this.h);
        sb.append(", subtitleText=");
        sb.append((Object) this.i);
        sb.append(", imageUrl=");
        sb.append(this.j);
        sb.append(", imageDarkUrl=");
        sb.append(this.k);
        sb.append(", isImageRounded=");
        sb.append(this.l);
        sb.append(", isImageDarkRounded=");
        sb.append(this.m);
        sb.append(", friendsPhotosUrls=");
        sb.append(this.n);
        sb.append(", areFriendsPhotosVisible=");
        sb.append(this.o);
        sb.append(", friendsText=");
        sb.append((Object) this.p);
        sb.append(", isFriendsTextVisible=");
        sb.append(this.q);
        sb.append(", areFriendsVisible=");
        sb.append(this.r);
        sb.append(", raw=");
        sb.append(this.s);
        sb.append(", seqId=");
        return vu5.b(sb, this.t, ')');
    }
}
