package xsna;

import java.io.File;
import ru.ok.gleffects.EffectRegistry;

/* compiled from: HolidayInteractionPerfomanceState.kt */
/* loaded from: classes7.dex */
public abstract class xav {

    /* compiled from: HolidayInteractionPerfomanceState.kt */
    public static final class a extends xav {
        public static final a a = new a();
    }

    /* compiled from: HolidayInteractionPerfomanceState.kt */
    public static final class b extends xav {
        public final C3990b a;
        public final a b;

        /* compiled from: HolidayInteractionPerfomanceState.kt */
        public static final class a {
            public final EffectRegistry.EffectId a;
            public final File b;

            public a(EffectRegistry.EffectId effectId, File file) {
                this.a = effectId;
                this.b = file;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                File file = this.b;
                return hashCode + (file == null ? 0 : file.hashCode());
            }

            public final String toString() {
                return "CallEffect(id=" + this.a + ", resourcePack=" + this.b + ')';
            }
        }

        /* compiled from: HolidayInteractionPerfomanceState.kt */
        /* renamed from: xsna.xav$b$b, reason: collision with other inner class name */
        public static final class C3990b {
            public final long a;

            public C3990b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3990b) && this.a == ((C3990b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("Vibration(durationMs="));
            }
        }

        public b(C3990b c3990b, a aVar) {
            this.a = c3990b;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.a) * 31);
        }

        public final String toString() {
            return "Enabled(vibration=" + this.a + ", callEffect=" + this.b + ')';
        }
    }
}
