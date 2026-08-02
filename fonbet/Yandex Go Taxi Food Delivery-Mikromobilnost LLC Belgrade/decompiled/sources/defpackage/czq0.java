package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.v;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class czq0 {
    public final ImmutableMap a;
    public final ImmutableList b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Uri g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public czq0(bzq0 bzq0Var) {
        this.a = ImmutableMap.a(bzq0Var.a);
        this.b = bzq0Var.b.g();
        String str = bzq0Var.d;
        int i = tw21.a;
        this.c = str;
        this.d = bzq0Var.e;
        this.e = bzq0Var.f;
        this.g = bzq0Var.g;
        this.h = bzq0Var.h;
        this.f = bzq0Var.c;
        this.i = bzq0Var.i;
        this.j = bzq0Var.k;
        this.k = bzq0Var.l;
        this.l = bzq0Var.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && czq0.class == obj.getClass()) {
            czq0 czq0Var = (czq0) obj;
            if (this.f == czq0Var.f) {
                ImmutableMap immutableMap = czq0Var.a;
                ImmutableMap immutableMap2 = this.a;
                immutableMap2.getClass();
                if (v.b(immutableMap, immutableMap2) && this.b.equals(czq0Var.b) && Objects.equals(this.d, czq0Var.d) && Objects.equals(this.c, czq0Var.c) && Objects.equals(this.e, czq0Var.e) && Objects.equals(this.l, czq0Var.l) && Objects.equals(this.g, czq0Var.g) && Objects.equals(this.j, czq0Var.j) && Objects.equals(this.k, czq0Var.k) && Objects.equals(this.h, czq0Var.h) && Objects.equals(this.i, czq0Var.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f) * 31;
        String str4 = this.l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
