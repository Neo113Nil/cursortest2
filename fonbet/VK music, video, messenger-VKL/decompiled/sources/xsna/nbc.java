package xsna;

import com.vk.auth.enterphone.choosecountry.Country;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChooseCountryViewModel.kt */
/* loaded from: classes15.dex */
public final class nbc {
    public final String a;
    public final List<Country> b;
    public final boolean c;
    public final Throwable d;

    public nbc() {
        this(null, 15);
    }

    public static nbc a(nbc nbcVar, String str, List list, boolean z, Throwable th, int i) {
        if ((i & 1) != 0) {
            str = nbcVar.a;
        }
        if ((i & 2) != 0) {
            list = nbcVar.b;
        }
        if ((i & 4) != 0) {
            z = nbcVar.c;
        }
        if ((i & 8) != 0) {
            th = nbcVar.d;
        }
        nbcVar.getClass();
        return new nbc(str, list, z, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbc)) {
            return false;
        }
        nbc nbcVar = (nbc) obj;
        return epx.f(this.a, nbcVar.a) && epx.f(this.b, nbcVar.b) && this.c == nbcVar.c && epx.f(this.d, nbcVar.d);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Throwable th = this.d;
        return b + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseCountryState(locale=");
        sb.append(this.a);
        sb.append(", countries=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", error=");
        return oq.c(sb, this.d, ')');
    }

    public nbc(Throwable th, int i) {
        this("", EmptyList.b, (i & 4) == 0, (i & 8) != 0 ? null : th);
    }

    public nbc(String str, List<Country> list, boolean z, Throwable th) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = th;
    }
}
