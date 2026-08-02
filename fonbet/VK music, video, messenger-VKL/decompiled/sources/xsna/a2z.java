package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: LegoRedesignConfig.kt */
/* loaded from: classes11.dex */
public final class a2z {
    public static final a c = new a();
    public static final a2z d = new a2z(EmptyList.b, false);
    public final List<String> a;
    public final boolean b;

    /* compiled from: LegoRedesignConfig.kt */
    public static final class a {
    }

    public a2z(List<String> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2z)) {
            return false;
        }
        a2z a2zVar = (a2z) obj;
        return epx.f(this.a, a2zVar.a) && this.b == a2zVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegoRedesignConfig(redesignedScreens=");
        sb.append(this.a);
        sb.append(", isEnabledEverywhere=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
