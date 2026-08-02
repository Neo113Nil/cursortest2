package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: OverrideDomainConfig.kt */
/* loaded from: classes.dex */
public final class rvn {
    public static final /* synthetic */ int c = 0;
    public final Map<String, String> a;
    public final bpn0 b = new bpn0(new zf6(this, 6));

    /* compiled from: OverrideDomainConfig.kt */
    public static final class a {
        public static rvn a(String str) {
            if (str.length() == 0) {
                return new rvn(jgp.b);
            }
            List c0 = drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = c0.iterator();
            while (true) {
                Pair pair = null;
                if (!it.hasNext()) {
                    break;
                }
                List c02 = drm0.c0((String) it.next(), new String[]{"="}, 2, 2);
                if (c02.size() == 2 && ((CharSequence) c02.get(0)).length() > 0 && ((CharSequence) c02.get(1)).length() > 0) {
                    pair = new Pair(c02.get(0), c02.get(1));
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map s = pn00.s(arrayList);
            if (s.isEmpty()) {
                return null;
            }
            return new rvn(s);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((String) ((Map.Entry) t2).getKey()).length()), Integer.valueOf(((String) ((Map.Entry) t).getKey()).length()));
        }
    }

    static {
        new rvn(jgp.b);
    }

    public rvn(Map<String, String> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvn) && epx.f(this.a, ((rvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("DomainOverride(mapping="), this.a, ')');
    }
}
