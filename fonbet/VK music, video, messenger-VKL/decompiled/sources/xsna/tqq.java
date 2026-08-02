package xsna;

import com.vk.fave.entities.FavePage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FavePagesDto.kt */
/* loaded from: classes4.dex */
public final class tqq {
    public final List<FavePage> a;
    public final int b;
    public final String c;

    public tqq(List<FavePage> list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public static tqq a(tqq tqqVar, ArrayList arrayList) {
        int i = tqqVar.b;
        String str = tqqVar.c;
        tqqVar.getClass();
        return new tqq(arrayList, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqq)) {
            return false;
        }
        tqq tqqVar = (tqq) obj;
        return epx.f(this.a, tqqVar.a) && this.b == tqqVar.b && epx.f(this.c, tqqVar.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavePagesDto(pages=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }
}
