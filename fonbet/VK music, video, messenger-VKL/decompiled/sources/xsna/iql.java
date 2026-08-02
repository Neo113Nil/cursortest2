package xsna;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes.dex */
public final class iql implements hgq0 {
    public final String a;
    public final g1u b;

    public iql(Set<s2z> set, g1u g1uVar) {
        this.a = a(set);
        this.b = g1uVar;
    }

    public static String a(Set<s2z> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<s2z> it = set.iterator();
        while (it.hasNext()) {
            s2z next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // xsna.hgq0
    public final String getUserAgent() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String str = this.a;
        g1u g1uVar = this.b;
        synchronized (g1uVar.a) {
            unmodifiableSet = Collections.unmodifiableSet(g1uVar.a);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder b = v1v.b(str, ' ');
        synchronized (g1uVar.a) {
            unmodifiableSet2 = Collections.unmodifiableSet(g1uVar.a);
        }
        b.append(a(unmodifiableSet2));
        return b.toString();
    }
}
