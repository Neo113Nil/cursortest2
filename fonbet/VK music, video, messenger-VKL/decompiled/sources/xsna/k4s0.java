package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: VideoAv1SoCsListConfig.kt */
/* loaded from: classes11.dex */
public final class k4s0 {
    public static final a b = new a();
    public final List<Regex> a;

    /* compiled from: VideoAv1SoCsListConfig.kt */
    public static final class a {
    }

    public k4s0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4s0) && epx.f(this.a, ((k4s0) obj).a);
    }

    public final int hashCode() {
        List<Regex> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoAv1SoCsListConfig(chipsetRegexs="), this.a);
    }
}
