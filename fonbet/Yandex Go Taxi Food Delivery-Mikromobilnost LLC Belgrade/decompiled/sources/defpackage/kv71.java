package defpackage;

import java.util.Locale;

/* loaded from: classes7.dex */
public final class kv71 implements kq71 {
    public static final kv71 w = new kv71(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public kv71(float f, float f2) {
        if (f <= 0.0f) {
            w511.q();
            throw null;
        }
        if (f2 <= 0.0f) {
            w511.q();
            throw null;
        }
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kv71.class == obj.getClass()) {
            kv71 kv71Var = (kv71) obj;
            if (this.a == kv71Var.a && this.b == kv71Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = rf71.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
