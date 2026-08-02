package xsna;

import java.io.File;
import ru.ok.gleffects.EffectRegistry;

/* compiled from: HolidayInteractionFeatureState.kt */
/* loaded from: classes7.dex */
public abstract class vav {

    /* compiled from: HolidayInteractionFeatureState.kt */
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

    /* compiled from: HolidayInteractionFeatureState.kt */
    public static final class b extends vav {
        public static final b a = new b();
    }

    /* compiled from: HolidayInteractionFeatureState.kt */
    public static final class c extends vav {
        public final boolean a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;

        public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2) {
            this.a = z;
            this.b = z2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = str8;
        }
    }

    /* compiled from: HolidayInteractionFeatureState.kt */
    public static final class d extends vav {
        public final String a;
        public final g b;
        public final a c;

        public d(String str, g gVar, a aVar) {
            this.a = str;
            this.b = gVar;
            this.c = aVar;
        }
    }

    /* compiled from: HolidayInteractionFeatureState.kt */
    public static final class e extends vav {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public e(String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }
    }

    /* compiled from: HolidayInteractionFeatureState.kt */
    public static final class f extends vav {
        public final String a;
        public final String b;

        public f(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: HolidayInteractionFeatureState.kt */
    public static final class g {
        public final long a;

        public g(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("Vibration(durationMs="));
        }
    }
}
