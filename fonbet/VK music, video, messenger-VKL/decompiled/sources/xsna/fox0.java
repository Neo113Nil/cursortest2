package xsna;

/* compiled from: WidgetSettingsTabMvi.kt */
/* loaded from: classes6.dex */
public abstract class fox0 implements kj50 {

    /* compiled from: WidgetSettingsTabMvi.kt */
    public static final class a extends fox0 {
        public final tnx0 b;
        public final boolean c;

        public a(tnx0 tnx0Var, boolean z) {
            this.b = tnx0Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditWidgetSettings(item=");
            sb.append(this.b);
            sb.append(", checked=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: WidgetSettingsTabMvi.kt */
    public static final class b extends fox0 {
        public static final b b = new b();
    }
}
