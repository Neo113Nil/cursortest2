package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: DatePickerDialog.android.kt */
/* loaded from: classes11.dex */
public final class kyk {
    public static final u890 a;
    public static final float b;
    public static final float c = 12;

    static {
        float f = 8;
        a = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, f, 3);
        b = f;
    }

    public static final void a(final gzs gzsVar, final jai jaiVar, q630 q630Var, final wzs wzsVar, r5j0 r5j0Var, float f, vxk vxkVar, xim ximVar, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final r5j0 r5j0Var2;
        final float f2;
        final vxk vxkVar2;
        final xim ximVar2;
        int i2;
        xim ximVar3;
        vxk vxkVar3;
        float f3;
        androidx.compose.runtime.a M = aVar.M(219718641);
        int i3 = i | (M.y(gzsVar) ? 4 : 2) | 13312384;
        if (M.t(i3 & 1, (38347923 & i3) != 38347922)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                ayk aykVar = ayk.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(700927667, 6, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:770)");
                }
                r5j0 a2 = p6j0.a(zzk.c, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                float f4 = ayk.c;
                ayk aykVar2 = ayk.a;
                vxk c2 = ayk.c(6, M);
                i2 = i3 & (-3727361);
                ximVar3 = new xim(false, 3);
                r5j0Var2 = a2;
                vxkVar3 = c2;
                f3 = f4;
                q630Var2 = q630.a.a;
            } else {
                M.h();
                i2 = i3 & (-3727361);
                q630Var2 = q630Var;
                r5j0Var2 = r5j0Var;
                f3 = f;
                vxkVar3 = vxkVar;
                ximVar3 = ximVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(219718641, i2, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:74)");
            }
            xim ximVar4 = ximVar3;
            es1.d(gzsVar, txj0.z(q630Var2, null, 3), ximVar4, kai.c(1108953335, new jyk(r5j0Var2, vxkVar3, f3, jaiVar2, wzsVar, jaiVar), M), M, (i2 & 14) | 3456);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f5 = f3;
            vxkVar2 = vxkVar3;
            f2 = f5;
            ximVar2 = ximVar4;
        } else {
            M.h();
            q630Var2 = q630Var;
            r5j0Var2 = r5j0Var;
            f2 = f;
            vxkVar2 = vxkVar;
            ximVar2 = ximVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(jaiVar, q630Var2, wzsVar, r5j0Var2, f2, vxkVar2, ximVar2, jaiVar2, i) { // from class: xsna.fyk
                public final /* synthetic */ jai c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ r5j0 f;
                public final /* synthetic */ float g;
                public final /* synthetic */ vxk h;
                public final /* synthetic */ xim i;
                public final /* synthetic */ jai j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(100666417);
                    kyk.a(gzs.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
