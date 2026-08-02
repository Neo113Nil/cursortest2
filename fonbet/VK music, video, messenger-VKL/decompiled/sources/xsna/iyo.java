package xsna;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AndroidOverscroll.android.kt */
/* loaded from: classes11.dex */
public final class iyo {
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

    public iyo(Context context, int i) {
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
        return !((Build.VERSION.SDK_INT >= 31 ? uw2.b(edgeEffect) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final EdgeEffect a(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect a = i >= 31 ? uw2.a(context) : new r2u(context);
        a.setColor(this.b);
        if (!q9x.b(this.c, 0L)) {
            if (orientation == Orientation.Vertical) {
                long j = this.c;
                a.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return a;
            }
            long j2 = this.c;
            a.setSize((int) (j2 & 4294967295L), (int) (j2 >> 32));
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
