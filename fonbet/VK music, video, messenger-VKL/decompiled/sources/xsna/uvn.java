package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: OverrideDomainConfig.kt */
/* loaded from: classes.dex */
public final class uvn {
    public static final uvn b = new uvn(EmptySet.b);
    public final Set<String> a;

    /* compiled from: OverrideDomainConfig.kt */
    public static final class a {
        public static uvn a(String str) {
            if (drm0.N(str)) {
                return uvn.b;
            }
            List c0 = drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                String obj = drm0.p0((String) it.next()).toString();
                if (obj.length() <= 0) {
                    obj = null;
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return new uvn(j5g.S0(arrayList));
        }
    }

    public uvn(Set<String> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvn) && epx.f(this.a, ((uvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ur.c(new StringBuilder("DomainsList(domains="), this.a, ')');
    }
}
