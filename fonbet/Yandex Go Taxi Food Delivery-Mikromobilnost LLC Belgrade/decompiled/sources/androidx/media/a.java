package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import defpackage.o72;
import defpackage.xf3;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class a {
    public static final AudioAttributesCompat g;
    public final int a;
    public final o72 b;
    public final Handler c;
    public final AudioAttributesCompat d;
    public final boolean e;
    public final AudioFocusRequest f;

    static {
        AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
        ((AudioAttributes.Builder) aVar.a.b).setUsage(1);
        g = aVar.a();
    }

    public a(int i, o72 o72Var, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = audioAttributesCompat;
        this.e = z;
        this.b = o72Var;
        this.f = xf3.a(i, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.a.getAudioAttributes() : null, z, o72Var, handler);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.e == aVar.e && this.b == aVar.b && this.c.equals(aVar.c) && Objects.equals(this.d, aVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
