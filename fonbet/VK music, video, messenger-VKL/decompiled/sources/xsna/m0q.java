package xsna;

import kotlin.random.Random;

/* compiled from: EventState.kt */
/* loaded from: classes11.dex */
public final class m0q {
    public final zzp a = new zzp(0);
    public a b;
    public a c;

    /* compiled from: EventState.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }
    }

    public final int a() {
        a aVar = this.b;
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.a) : null;
        zzp zzpVar = this.a;
        if (valueOf == null) {
            valueOf = Integer.valueOf(((Random) ((bpn0) zzpVar.a).getValue()).l(1000, 10000000));
        } else {
            zzpVar.getClass();
        }
        return valueOf.intValue() + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0q.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0q m0qVar = (m0q) obj;
        return epx.f(this.b, m0qVar.b) && epx.f(this.c, m0qVar.c);
    }

    public final int hashCode() {
        a aVar = this.b;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a aVar2 = this.c;
        return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
