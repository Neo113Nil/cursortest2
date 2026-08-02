package xsna;

import android.graphics.drawable.Drawable;
import com.ironsource.InterfaceC4319fe;
import java.util.List;

/* compiled from: DiscoverMediaPhotoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class k4n extends ol60 {
    public final String h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final Drawable n;
    public final Drawable o;
    public final y5n p;
    public final List<ean> q;

    public k4n(String str, int i, boolean z, boolean z2, boolean z3, String str2, n6n n6nVar, l3n l3nVar, y5n y5nVar, List list) {
        super(InterfaceC4319fe.a.e, 0, 0, 0, null);
        this.h = str;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str2;
        this.n = n6nVar;
        this.o = l3nVar;
        this.p = y5nVar;
        this.q = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4n)) {
            return false;
        }
        k4n k4nVar = (k4n) obj;
        return epx.f(this.h, k4nVar.h) && this.i == k4nVar.i && this.j == k4nVar.j && this.k == k4nVar.k && this.l == k4nVar.l && epx.f(this.m, k4nVar.m) && epx.f(this.n, k4nVar.n) && epx.f(this.o, k4nVar.o) && epx.f(this.p, k4nVar.p) && epx.f(this.q, k4nVar.q);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        String str = this.h;
        int a = urd0.a(qoy.b(qoy.b(qoy.b(shy.a(this.i, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        Drawable drawable = this.n;
        int hashCode = (a + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.o;
        int hashCode2 = (hashCode + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        y5n y5nVar = this.p;
        return Integer.hashCode(0) + fw3.a((hashCode2 + (y5nVar == null ? 0 : y5nVar.hashCode())) * 31, 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverMediaPhotoHolderUiDto(imageUrl=");
        sb.append(this.h);
        sb.append(", iconResId=");
        sb.append(this.i);
        sb.append(", isIconVisible=");
        sb.append(this.j);
        sb.append(", shouldShowText=");
        sb.append(this.k);
        sb.append(", isSmallCell=");
        sb.append(this.l);
        sb.append(", contentDescription=");
        sb.append(this.m);
        sb.append(", shadowDrawable=");
        sb.append(this.n);
        sb.append(", foregroundDrawable=");
        sb.append(this.o);
        sb.append(", textStyle=");
        sb.append(this.p);
        sb.append(", tags=");
        return vp.b(", seqId=0)", sb, this.q);
    }
}
