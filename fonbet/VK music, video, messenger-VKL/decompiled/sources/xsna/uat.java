package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GamesCatalogDetailPage.kt */
/* loaded from: classes17.dex */
public final class uat {
    public final String a;
    public final List<com.vk.games.model.a> b;
    public final boolean c;

    public uat() {
        this(7, (List) null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uat)) {
            return false;
        }
        uat uatVar = (uat) obj;
        return epx.f(this.a, uatVar.a) && epx.f(this.b, uatVar.b) && this.c == uatVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogDetailPage(title=");
        sb.append(this.a);
        sb.append(", sections=");
        sb.append(this.b);
        sb.append(", hasNext=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uat(String str, List<? extends com.vk.games.model.a> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public uat(int i, List list, boolean z) {
        this((String) null, (List<? extends com.vk.games.model.a>) ((i & 2) != 0 ? EmptyList.b : list), (i & 4) != 0 ? false : z);
    }
}
