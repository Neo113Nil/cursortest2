package xsna;

import java.util.List;

/* compiled from: DisclaimerState.kt */
/* loaded from: classes17.dex */
public final class g1n {
    public final a a;
    public final boolean b;

    /* compiled from: DisclaimerState.kt */
    public interface a {

        /* compiled from: DisclaimerState.kt */
        /* renamed from: xsna.g1n$a$a, reason: collision with other inner class name */
        public static final class C2909a implements a {
            public final List<tlo0> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C2909a(List<? extends tlo0> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2909a) && epx.f(this.a, ((C2909a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Multi(textSources="), this.a);
            }
        }

        /* compiled from: DisclaimerState.kt */
        public static final class b implements a {
            public final tlo0 a;

            public b(tlo0 tlo0Var) {
                this.a = tlo0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return bt.a(new StringBuilder("Single(textSource="), this.a, ')');
            }
        }
    }

    public g1n(a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1n)) {
            return false;
        }
        g1n g1nVar = (g1n) obj;
        return epx.f(this.a, g1nVar.a) && this.b == g1nVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisclaimerState(textState=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
