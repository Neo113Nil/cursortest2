package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextFieldScroll.kt */
/* loaded from: classes11.dex */
public final class xgo0 {
    public static final fh9 g = q6x.C(new o7j0(6), new d69(0, 7));
    public final kg50 a;
    public final kg50 b;
    public final rg50 c;
    public zhf0 d;
    public long e;
    public final wh50 f;

    public xgo0(Orientation orientation, float f) {
        this.a = androidx.compose.runtime.d.a(f);
        this.b = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.c = androidx.compose.runtime.i.a(0);
        this.d = zhf0.e;
        int i = qko0.c;
        this.e = qko0.b;
        this.f = androidx.compose.runtime.k.a(orientation, k0x.c);
    }

    public final void a(Orientation orientation, zhf0 zhf0Var, int i, int i2) {
        float f = i2 - i;
        ((vak0) this.b).g(f);
        float f2 = zhf0Var.a;
        float f3 = zhf0Var.b;
        zhf0 zhf0Var2 = this.d;
        float f4 = zhf0Var2.a;
        kg50 kg50Var = this.a;
        if (f2 != f4 || f3 != zhf0Var2.b) {
            boolean z = orientation == Orientation.Vertical;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? zhf0Var.d : zhf0Var.c;
            vak0 vak0Var = (vak0) kg50Var;
            float floatValue = vak0Var.getFloatValue();
            float f6 = i;
            float f7 = floatValue + f6;
            ((vak0) kg50Var).g(vak0Var.getFloatValue() + ((f5 <= f7 && (f2 >= floatValue || f5 - f2 <= f6)) ? (f2 >= floatValue || f5 - f2 > f6) ? 0.0f : f2 - floatValue : f5 - f7));
            this.d = zhf0Var;
        }
        ((vak0) kg50Var).g(swe0.f(((vak0) kg50Var).getFloatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
        ((wak0) this.c).C(i);
    }

    public /* synthetic */ xgo0(Orientation orientation) {
        this(orientation, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public xgo0() {
        this(Orientation.Vertical);
    }
}
