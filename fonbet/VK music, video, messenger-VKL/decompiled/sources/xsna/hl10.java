package xsna;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import xsna.ulp0;

/* compiled from: Regex.kt */
/* loaded from: classes8.dex */
public final class hl10 implements zk10 {
    public final Matcher a;
    public final CharSequence b;
    public final b c = new b();
    public a d;

    /* compiled from: Regex.kt */
    public static final class a extends ff<String> {
        public a() {
        }

        @Override // xsna.qd, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // xsna.ff, java.util.List
        public final Object get(int i) {
            String group = hl10.this.a.group(i);
            return group == null ? "" : group;
        }

        @Override // xsna.ff, xsna.qd
        public final int getSize() {
            return hl10.this.a.groupCount() + 1;
        }

        @Override // xsna.ff, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // xsna.ff, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    /* compiled from: Regex.kt */
    public static final class b extends qd<uk10> implements vk10 {
        public b() {
        }

        public final uk10 c(int i) {
            hl10 hl10Var = hl10.this;
            Matcher matcher = hl10Var.a;
            k9x q = swe0.q(matcher.start(i), matcher.end(i));
            if (q.b >= 0) {
                return new uk10(hl10Var.a.group(i), q);
            }
            return null;
        }

        @Override // xsna.qd, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof uk10) {
                return super.contains((uk10) obj);
            }
            return false;
        }

        @Override // xsna.vk10
        public final uk10 get(String str) {
            vwx vwxVar = qta0.a;
            Matcher matcher = hl10.this.a;
            vwxVar.getClass();
            int start = matcher.start(str);
            k9x k9xVar = new k9x(start, matcher.end(str) - 1, 1);
            if (start >= 0) {
                return new uk10(matcher.group(str), k9xVar);
            }
            return null;
        }

        @Override // xsna.qd
        public final int getSize() {
            return hl10.this.a.groupCount() + 1;
        }

        @Override // xsna.qd, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<uk10> iterator() {
            return new ulp0.a(new ulp0(new i5g(e43.g(this)), new qcl(this, 27)));
        }
    }

    public hl10(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
    }

    @Override // xsna.zk10
    public final b a() {
        return this.c;
    }

    @Override // xsna.zk10
    public final List<String> b() {
        if (this.d == null) {
            this.d = new a();
        }
        return this.d;
    }

    @Override // xsna.zk10
    public final k9x c() {
        Matcher matcher = this.a;
        return swe0.q(matcher.start(), matcher.end());
    }

    @Override // xsna.zk10
    public final String getValue() {
        return this.a.group();
    }

    @Override // xsna.zk10
    public final hl10 next() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        if (matcher2.find(end)) {
            return new hl10(matcher2, charSequence);
        }
        return null;
    }
}
