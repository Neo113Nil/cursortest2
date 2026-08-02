package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ContentProductsState.kt */
/* loaded from: classes18.dex */
public final class mkj implements lm50 {
    public final String b;
    public final List<hpd0> c;
    public final List<hpd0> d;
    public final boolean e;
    public final Exception f;
    public final boolean g;
    public final int h;
    public final String i;

    public mkj() {
        this(255);
    }

    public static mkj a(mkj mkjVar, String str, List list, List list2, boolean z, Exception exc, boolean z2, int i, String str2, int i2) {
        if ((i2 & 1) != 0) {
            str = mkjVar.b;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            list = mkjVar.c;
        }
        List list3 = list;
        if ((i2 & 4) != 0) {
            list2 = mkjVar.d;
        }
        List list4 = list2;
        if ((i2 & 8) != 0) {
            z = mkjVar.e;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            exc = mkjVar.f;
        }
        Exception exc2 = exc;
        if ((i2 & 32) != 0) {
            z2 = mkjVar.g;
        }
        boolean z4 = z2;
        int i3 = (i2 & 64) != 0 ? mkjVar.h : i;
        String str4 = (i2 & 128) != 0 ? mkjVar.i : str2;
        mkjVar.getClass();
        return new mkj(str3, list3, list4, z3, exc2, z4, i3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkj)) {
            return false;
        }
        mkj mkjVar = (mkj) obj;
        return epx.f(this.b, mkjVar.b) && epx.f(this.c, mkjVar.c) && epx.f(this.d, mkjVar.d) && this.e == mkjVar.e && epx.f(this.f, mkjVar.f) && this.g == mkjVar.g && this.h == mkjVar.h && epx.f(this.i, mkjVar.i);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        Exception exc = this.f;
        int a = shy.a(this.h, qoy.b((b + (exc == null ? 0 : exc.hashCode())) * 31, 31, this.g), 31);
        String str = this.i;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentProductsState(title=");
        sb.append(this.b);
        sb.append(", postItems=");
        sb.append(this.c);
        sb.append(", shopItems=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", exception=");
        sb.append(this.f);
        sb.append(", hasCart=");
        sb.append(this.g);
        sb.append(", cartAmount=");
        sb.append(this.h);
        sb.append(", marketLink=");
        return ho8.a(sb, this.i, ')');
    }

    public mkj(String str, List<hpd0> list, List<hpd0> list2, boolean z, Exception exc, boolean z2, int i, String str2) {
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = exc;
        this.g = z2;
        this.h = i;
        this.i = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mkj(int i) {
        this("", r2, r2, (i & 8) == 0, null, false, 0, null);
        EmptyList emptyList = EmptyList.b;
    }
}
