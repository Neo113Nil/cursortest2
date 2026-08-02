package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.search_address.feature.state.UnableToLoadSuggestionsException;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SearchAddressState.kt */
/* loaded from: classes18.dex */
public final class omh0 implements km50 {
    public final String b;
    public final Coordinates c;
    public final List<kt0> d;
    public final boolean e;
    public final boolean f;
    public final Throwable g;

    public omh0() {
        this(null, null, false, 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Throwable] */
    public static omh0 a(omh0 omh0Var, String str, List list, boolean z, UnableToLoadSuggestionsException unableToLoadSuggestionsException, int i) {
        if ((i & 1) != 0) {
            str = omh0Var.b;
        }
        String str2 = str;
        Coordinates coordinates = omh0Var.c;
        if ((i & 4) != 0) {
            list = omh0Var.d;
        }
        List list2 = list;
        boolean z2 = omh0Var.e;
        UnableToLoadSuggestionsException unableToLoadSuggestionsException2 = unableToLoadSuggestionsException;
        if ((i & 32) != 0) {
            unableToLoadSuggestionsException2 = omh0Var.g;
        }
        omh0Var.getClass();
        return new omh0(str2, coordinates, list2, z2, z, unableToLoadSuggestionsException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omh0)) {
            return false;
        }
        omh0 omh0Var = (omh0) obj;
        return epx.f(this.b, omh0Var.b) && epx.f(this.c, omh0Var.c) && epx.f(this.d, omh0Var.d) && this.e == omh0Var.e && this.f == omh0Var.f && epx.f(this.g, omh0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Coordinates coordinates = this.c;
        int b = qoy.b(qoy.b(fw3.a((hashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Throwable th = this.g;
        return b + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchAddressState(query=");
        sb.append(this.b);
        sb.append(", coordinates=");
        sb.append(this.c);
        sb.append(", addressSuggestions=");
        sb.append(this.d);
        sb.append(", isCustomAddressEnabled=");
        sb.append(this.e);
        sb.append(", isSearching=");
        sb.append(this.f);
        sb.append(", error=");
        return oq.c(sb, this.g, ')');
    }

    public omh0(String str, Coordinates coordinates, List<kt0> list, boolean z, boolean z2, Throwable th) {
        this.b = str;
        this.c = coordinates;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = th;
    }

    public omh0(String str, Coordinates coordinates, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : coordinates, EmptyList.b, (i & 8) != 0 ? false : z, false, null);
    }
}
