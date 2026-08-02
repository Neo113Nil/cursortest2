package xsna;

import android.graphics.drawable.Drawable;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import java.util.ArrayList;

/* compiled from: DiscoverMediaVideoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class b6n extends ol60 {
    public final String h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final Drawable o;
    public final Drawable p;
    public final y5n q;
    public final ArrayList r;
    public final DiscoverGridItem s;

    public b6n(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, n6n n6nVar, l3n l3nVar, y5n y5nVar, ArrayList arrayList, DiscoverGridItem discoverGridItem) {
        super(1207, 0, 0, 0, null);
        this.h = str;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = str2;
        this.o = n6nVar;
        this.p = l3nVar;
        this.q = y5nVar;
        this.r = arrayList;
        this.s = discoverGridItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6n)) {
            return false;
        }
        b6n b6nVar = (b6n) obj;
        return epx.f(this.h, b6nVar.h) && this.i == b6nVar.i && this.j == b6nVar.j && this.k == b6nVar.k && this.l == b6nVar.l && this.m == b6nVar.m && epx.f(this.n, b6nVar.n) && epx.f(this.o, b6nVar.o) && epx.f(this.p, b6nVar.p) && epx.f(this.q, b6nVar.q) && epx.f(this.r, b6nVar.r) && epx.f(this.s, b6nVar.s);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        String str = this.h;
        int a = urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.i, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        Drawable drawable = this.o;
        int hashCode = (a + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.p;
        int hashCode2 = (hashCode + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        y5n y5nVar = this.q;
        return Integer.hashCode(0) + ((this.s.hashCode() + qr.a(this.r, (hashCode2 + (y5nVar == null ? 0 : y5nVar.hashCode())) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DiscoverMediaVideoHolderUiDto(imageUrl=" + this.h + ", iconResId=" + this.i + ", isIconVisible=" + this.j + ", shouldShowText=" + this.k + ", isSmallCell=" + this.l + ", isOzonClip=" + this.m + ", contentDescription=" + this.n + ", shadowDrawable=" + this.o + ", foregroundDrawable=" + this.p + ", textStyle=" + this.q + ", tags=" + this.r + ", gridItem=" + this.s + ", seqId=0)";
    }
}
