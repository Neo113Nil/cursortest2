package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunitySuggestionsState.kt */
/* loaded from: classes5.dex */
public final class ztg implements km50 {
    public final String b;
    public final boolean c;
    public final List<i3i> d;
    public final String e;
    public final Throwable f;
    public final sd80 g;
    public final int h;

    public ztg(String str, boolean z, List<i3i> list, String str2, Throwable th, sd80 sd80Var, int i) {
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = str2;
        this.f = th;
        this.g = sd80Var;
        this.h = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ztg a(ztg ztgVar, boolean z, ArrayList arrayList, String str, Throwable th, sd80 sd80Var, int i, int i2) {
        boolean z2 = z;
        String str2 = ztgVar.b;
        if ((i2 & 2) != 0) {
            z2 = ztgVar.c;
        }
        List list = arrayList;
        if ((i2 & 4) != 0) {
            list = ztgVar.d;
        }
        if ((i2 & 8) != 0) {
            str = ztgVar.e;
        }
        if ((i2 & 16) != 0) {
            th = ztgVar.f;
        }
        if ((i2 & 32) != 0) {
            sd80Var = ztgVar.g;
        }
        if ((i2 & 64) != 0) {
            i = ztgVar.h;
        }
        int i3 = i;
        ztgVar.getClass();
        sd80 sd80Var2 = sd80Var;
        Throwable th2 = th;
        String str3 = str;
        return new ztg(str2, z2, list, str3, th2, sd80Var2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztg)) {
            return false;
        }
        ztg ztgVar = (ztg) obj;
        return epx.f(this.b, ztgVar.b) && this.c == ztgVar.c && epx.f(this.d, ztgVar.d) && epx.f(this.e, ztgVar.e) && epx.f(this.f, ztgVar.f) && epx.f(this.g, ztgVar.g) && this.h == ztgVar.h;
    }

    public final int hashCode() {
        int a = fw3.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.f;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        sd80 sd80Var = this.g;
        return Integer.hashCode(this.h) + ((hashCode2 + (sd80Var != null ? sd80Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCategorySuggestionsState(title=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", items=");
        sb.append(this.d);
        sb.append(", nextFrom=");
        sb.append(this.e);
        sb.append(", error=");
        sb.append(this.f);
        sb.append(", onboardingInfo=");
        sb.append(this.g);
        sb.append(", adminLevel=");
        return vu5.b(sb, this.h, ')');
    }
}
