package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: LauncherIconsConfig.kt */
/* loaded from: classes11.dex */
public final class dny {
    public static final a d = new a();
    public static final dny e = new dny(0);
    public final int a;
    public final List<String> b;
    public final int c;

    /* compiled from: LauncherIconsConfig.kt */
    public static final class a {
    }

    public dny() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dny)) {
            return false;
        }
        dny dnyVar = (dny) obj;
        return this.a == dnyVar.a && epx.f(this.b, dnyVar.b) && this.c == dnyVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LauncherIconsConfig(minApiVersion=");
        sb.append(this.a);
        sb.append(", launchersWhiteList=");
        sb.append(this.b);
        sb.append(", storeMask=");
        return vu5.b(sb, this.c, ')');
    }

    public dny(int i, List<String> list, int i2) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public dny(int i) {
        this(Integer.MAX_VALUE, EmptyList.b, 0);
    }
}
