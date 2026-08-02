package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import defpackage.k6w;
import defpackage.vm2;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class f {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public f(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? vm2.e(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect a = i >= 31 ? vm2.a(context) : new GlowEdgeEffectCompat(context);
        a.setColor(this.b);
        if (!k6w.a(this.c, 0L)) {
            Orientation orientation2 = Orientation.Vertical;
            long j = this.c;
            if (orientation == orientation2) {
                a.setSize((int) (j >> 32), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return a;
            }
            a.setSize((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j), (int) (j >> 32));
        }
        return a;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(Orientation.Vertical);
        this.e = a;
        return a;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(Orientation.Horizontal);
        this.f = a;
        return a;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(Orientation.Horizontal);
        this.g = a;
        return a;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(Orientation.Vertical);
        this.d = a;
        return a;
    }
}
