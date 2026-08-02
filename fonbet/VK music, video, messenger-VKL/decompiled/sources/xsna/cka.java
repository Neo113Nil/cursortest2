package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.z890;

/* compiled from: CategoriesState.kt */
/* loaded from: classes18.dex */
public final class cka implements lm50 {
    public final int b;
    public final List<MarketBridgeCategory> c;
    public final z890 d;

    public cka(int i, List<MarketBridgeCategory> list, z890 z890Var) {
        this.b = i;
        this.c = list;
        this.d = z890Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cka)) {
            return false;
        }
        cka ckaVar = (cka) obj;
        return this.b == ckaVar.b && epx.f(this.c, ckaVar.c) && epx.f(this.d, ckaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return "CategoriesState(pageNumber=" + this.b + ", categoryStack=" + this.c + ", page=" + this.d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cka() {
        this(0, r0, z890.a.b);
        EmptyList emptyList = EmptyList.b;
        z890.a.getClass();
    }
}
