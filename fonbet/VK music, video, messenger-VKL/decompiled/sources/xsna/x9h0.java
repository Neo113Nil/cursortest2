package xsna;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

/* compiled from: ScopeConfiguratorBuilder.java */
/* loaded from: classes8.dex */
public final class x9h0<T> {
    public final ArrayList a = new ArrayList();

    /* compiled from: ScopeConfiguratorBuilder.java */
    public static final class a<T> {
        public final String toString() {
            StringJoiner stringJoiner = new StringJoiner(", ", "Condition{", "}");
            stringJoiner.add("scopeMatcher=null");
            stringJoiner.add("scopeConfig=null");
            return stringJoiner.toString();
        }
    }

    /* compiled from: ScopeConfiguratorBuilder.java */
    public static class b<T> implements Function {
        public final List<a<T>> a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Iterator<a<T>> it = this.a.iterator();
            if (!it.hasNext()) {
                return null;
            }
            it.next().getClass();
            throw null;
        }

        public final String toString() {
            StringJoiner stringJoiner = new StringJoiner(", ", "ScopeConfiguratorImpl{", "}");
            stringJoiner.add("conditions=" + ((String) this.a.stream().map(new y9h0(0)).collect(Collectors.joining(StringUtils.COMMA, X3.j.d, X3.j.e))));
            return stringJoiner.toString();
        }
    }
}
