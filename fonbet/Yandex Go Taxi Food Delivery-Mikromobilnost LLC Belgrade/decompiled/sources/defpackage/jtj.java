package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jtj {
    public static ktj a(ktj ktjVar, ktj ktjVar2, a aVar, Float f, Float f2) {
        float f3 = aVar.c;
        if (aVar.a() || (f != null && f2 != null && f2.floatValue() >= f.floatValue())) {
            return ktjVar;
        }
        float f4 = ktjVar.c;
        float f5 = ktjVar.a;
        float f6 = ((f4 - f5) - f3) - aVar.d;
        float f7 = ktjVar.d;
        float f8 = ktjVar.b;
        float f9 = aVar.a;
        float f10 = ((f7 - f8) - f9) - aVar.b;
        if (f6 > 0.0f && f10 > 0.0f) {
            float f11 = f5 + f3;
            float f12 = f8 + f9;
            float f13 = f6 + f11;
            float max = Math.max(f11, ktjVar2.a);
            float max2 = Math.max(f12, ktjVar2.b);
            float min = Math.min(f13, ktjVar2.c);
            float min2 = Math.min(f10 + f12, ktjVar2.d);
            ktj ktjVar3 = (max >= min || max2 >= min2) ? null : new ktj(max, max2, min, min2);
            if (ktjVar3 != null && ktjVar3.c - ktjVar3.a > 0.0f && ktjVar3.d - ktjVar3.b > 0.0f) {
                return ktjVar3;
            }
        }
        return ktjVar;
    }

    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean a() {
            return this.a == 0.0f && this.b == 0.0f && this.c == 0.0f && this.d == 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return ly3.q(oo31.k("Insets(top=", this.a, ", bottom=", this.b, ", left="), this.c, ", right=", this.d, Extension.C_BRAKE);
        }

        public a() {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }
}
