package xsna;

import com.vk.fave.entities.FavePage;
import kotlin.Pair;

/* compiled from: FaveEntries.kt */
/* loaded from: classes18.dex */
public final class z990 {
    public final FavePage a;
    public final Pair<Integer, Integer> b;

    public z990(FavePage favePage, Pair pair) {
        this.a = favePage;
        this.b = pair;
    }

    public static z990 a(z990 z990Var, FavePage favePage) {
        Pair<Integer, Integer> pair = z990Var.b;
        z990Var.getClass();
        z990Var.getClass();
        return new z990(favePage, pair);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z990)) {
            return false;
        }
        z990 z990Var = (z990) obj;
        return epx.f(this.a, z990Var.a) && epx.f(this.b, z990Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Pair<Integer, Integer> pair = this.b;
        return (hashCode + (pair == null ? 0 : pair.hashCode())) * 31;
    }

    public final String toString() {
        return "PageSearchRes(page=" + this.a + ", nameStartEnd=" + this.b + ", descStartEnd=null)";
    }
}
