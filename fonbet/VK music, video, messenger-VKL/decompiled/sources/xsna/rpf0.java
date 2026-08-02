package xsna;

import java.util.regex.Pattern;

/* compiled from: RegexCache.java */
/* loaded from: classes8.dex */
public final class rpf0 {
    public final a<String, Pattern> a;

    /* compiled from: RegexCache.java */
    public static class a<K, V> {
        public qpf0 a;
        public int b;
    }

    public rpf0(int i) {
        a<String, Pattern> aVar = new a<>();
        aVar.b = i;
        aVar.a = new qpf0(aVar, dq.b(i, 4, 3, 1));
        this.a = aVar;
    }

    public final Pattern a(String str) {
        Object obj;
        a<String, Pattern> aVar = this.a;
        synchronized (aVar) {
            obj = aVar.a.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        a<String, Pattern> aVar2 = this.a;
        synchronized (aVar2) {
            aVar2.a.put(str, compile);
        }
        return compile;
    }
}
