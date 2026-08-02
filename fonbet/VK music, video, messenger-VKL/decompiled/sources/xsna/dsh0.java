package xsna;

import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;

/* compiled from: SearchFeatureRequest.kt */
/* loaded from: classes5.dex */
public final class dsh0 {
    public final String a;
    public final String b;
    public final SearchInputMethod c;
    public final String d;
    public final boolean e;
    public final SearchParams f;
    public final boolean g;

    public dsh0(String str, String str2, SearchInputMethod searchInputMethod, String str3, boolean z, SearchParams searchParams, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = searchInputMethod;
        this.d = str3;
        this.e = z;
        this.f = searchParams;
        this.g = z2;
    }

    public static dsh0 a(dsh0 dsh0Var, SearchInputMethod searchInputMethod, boolean z, int i) {
        String str = dsh0Var.a;
        String str2 = dsh0Var.b;
        if ((i & 4) != 0) {
            searchInputMethod = dsh0Var.c;
        }
        SearchInputMethod searchInputMethod2 = searchInputMethod;
        String str3 = dsh0Var.d;
        boolean z2 = dsh0Var.e;
        SearchParams searchParams = dsh0Var.f;
        if ((i & 64) != 0) {
            z = dsh0Var.g;
        }
        dsh0Var.getClass();
        return new dsh0(str, str2, searchInputMethod2, str3, z2, searchParams, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsh0)) {
            return false;
        }
        dsh0 dsh0Var = (dsh0) obj;
        return epx.f(this.a, dsh0Var.a) && epx.f(this.b, dsh0Var.b) && this.c == dsh0Var.c && epx.f(this.d, dsh0Var.d) && this.e == dsh0Var.e && epx.f(this.f, dsh0Var.f) && this.g == dsh0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SearchInputMethod searchInputMethod = this.c;
        int hashCode3 = (hashCode2 + (searchInputMethod == null ? 0 : searchInputMethod.hashCode())) * 31;
        String str2 = this.d;
        int b = qoy.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        SearchParams searchParams = this.f;
        return Boolean.hashCode(this.g) + ((b + (searchParams != null ? searchParams.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFeatureRequest(query=");
        sb.append(this.a);
        sb.append(", queryTrackCode=");
        sb.append(this.b);
        sb.append(", inputMethod=");
        sb.append(this.c);
        sb.append(", searchContext=");
        sb.append(this.d);
        sb.append(", ignoreSpellcheck=");
        sb.append(this.e);
        sb.append(", searchParams=");
        sb.append(this.f);
        sb.append(", showSuggest=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
