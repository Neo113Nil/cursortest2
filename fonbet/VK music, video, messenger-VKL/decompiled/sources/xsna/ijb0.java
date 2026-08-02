package xsna;

import java.util.ArrayList;

/* compiled from: ComposePodcastSliderVh.kt */
/* loaded from: classes16.dex */
public final class ijb0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final boolean d;
    public final boolean e;

    public ijb0(String str, String str2, ArrayList arrayList, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijb0)) {
            return false;
        }
        ijb0 ijb0Var = (ijb0) obj;
        return this.a.equals(ijb0Var.a) && this.b.equals(ijb0Var.b) && this.c.equals(ijb0Var.c) && this.d == ijb0Var.d && this.e == ijb0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qr.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastSliderTileModel(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", thumbs=");
        kr.d(this.c, sb, ", hasBadge=");
        sb.append(this.d);
        sb.append(", isSearch=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
