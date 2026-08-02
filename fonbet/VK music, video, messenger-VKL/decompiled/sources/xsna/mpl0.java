package xsna;

import java.util.ArrayList;

/* compiled from: StorefrontViewedGoods.kt */
/* loaded from: classes18.dex */
public final class mpl0 {
    public final int a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public mpl0(int i, int i2, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpl0)) {
            return false;
        }
        mpl0 mpl0Var = (mpl0) obj;
        return this.a == mpl0Var.a && epx.f(this.b, mpl0Var.b) && this.c == mpl0Var.c && this.d.equals(mpl0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontViewedGoods(albumId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", items=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
