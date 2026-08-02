package xsna;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Lazy;

/* compiled from: CursorAnchorInfoController.android.kt */
@ozl
/* loaded from: classes11.dex */
public final class ylk {
    public final p52 a;
    public final i2x b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public tho0 j;
    public ljo0 k;
    public uv70 l;
    public zhf0 n;
    public zhf0 o;
    public final Object c = new Object();
    public izs<? super en10, s3q0> m = xlk.i;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = en10.a();
    public final Matrix r = new Matrix();

    public ylk(p52 p52Var, i2x i2xVar) {
        this.a = p52Var;
        this.b = i2xVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        Lazy lazy;
        int i;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        i2x i2xVar = this.b;
        ?? r2 = i2xVar.b;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view = i2xVar.a;
        if (inputMethodManager.isActive(view)) {
            izs<? super en10, s3q0> izsVar = this.m;
            float[] fArr = this.q;
            izsVar.invoke(new en10(fArr));
            this.a.d(fArr);
            Matrix matrix = this.r;
            alk.w(matrix, fArr);
            tho0 tho0Var = this.j;
            uv70 uv70Var = this.l;
            ljo0 ljo0Var = this.k;
            zhf0 zhf0Var = this.n;
            zhf0 zhf0Var2 = this.o;
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            long j = tho0Var.b;
            qko0 qko0Var = tho0Var.c;
            int f = qko0.f(j);
            builder.setSelectionRange(f, qko0.e(tho0Var.b));
            if (!z || f < 0) {
                lazy = r2;
                i = 1;
            } else {
                int b = uv70Var.b(f);
                zhf0 c = ljo0Var.c(b);
                i = 1;
                lazy = r2;
                float f2 = swe0.f(c.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (ljo0Var.c >> 32));
                boolean a = vlk.a(zhf0Var, f2, c.b);
                boolean a2 = vlk.a(zhf0Var, f2, c.d);
                boolean z5 = ljo0Var.a(b) == ResolvedTextDirection.Rtl;
                int i2 = (a || a2) ? 1 : 0;
                if (!a || !a2) {
                    i2 |= 2;
                }
                if (z5) {
                    i2 |= 4;
                }
                float f3 = c.b;
                float f4 = c.d;
                builder.setInsertionMarkerLocation(f2, f3, f4, f4, i2);
            }
            if (z2) {
                int f5 = qko0Var != null ? qko0.f(qko0Var.a) : -1;
                int e = qko0Var != null ? qko0.e(qko0Var.a) : -1;
                if (f5 >= 0 && f5 < e) {
                    builder.setComposingText(f5, tho0Var.a.c.subSequence(f5, e));
                    int b2 = uv70Var.b(f5);
                    int b3 = uv70Var.b(e);
                    float[] fArr2 = new float[(b3 - b2) * 4];
                    ljo0Var.b.a(jgz.c(b2, b3), fArr2);
                    int i3 = f5;
                    while (i3 < e) {
                        int b4 = uv70Var.b(i3);
                        int i4 = (b4 - b2) * 4;
                        float f6 = fArr2[i4];
                        float f7 = fArr2[i4 + 1];
                        int i5 = e;
                        float f8 = fArr2[i4 + 2];
                        float f9 = fArr2[i4 + 3];
                        int i6 = b2;
                        int i7 = (zhf0Var.a < f8 ? i : 0) & (f6 < zhf0Var.c ? i : 0) & (zhf0Var.b < f9 ? i : 0) & (f7 < zhf0Var.d ? i : 0);
                        if (!vlk.a(zhf0Var, f6, f7) || !vlk.a(zhf0Var, f8, f9)) {
                            i7 |= 2;
                        }
                        if (ljo0Var.a(b4) == ResolvedTextDirection.Rtl) {
                            i7 |= 4;
                        }
                        builder.addCharacterBounds(i3, f6, f7, f8, f9, i7);
                        i3++;
                        e = i5;
                        b2 = i6;
                    }
                }
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33 && z3) {
                editorBounds = y13.b().setEditorBounds(zjq.o(zhf0Var2));
                handwritingBounds = editorBounds.setHandwritingBounds(zjq.o(zhf0Var2));
                build = handwritingBounds.build();
                builder.setEditorBoundsInfo(build);
            }
            if (i8 >= 34 && z4 && !zhf0Var.g()) {
                m540 m540Var = ljo0Var.b;
                int i9 = m540Var.f - 1;
                if (i9 < 0) {
                    i9 = 0;
                }
                int g = swe0.g(m540Var.e(zhf0Var.b), 0, i9);
                int g2 = swe0.g(m540Var.e(zhf0Var.d), 0, i9);
                if (g <= g2) {
                    while (true) {
                        builder.addVisibleLineBounds(ljo0Var.h(g), m540Var.g(g), ljo0Var.i(g), m540Var.b(g));
                        if (g == g2) {
                            break;
                        } else {
                            g++;
                        }
                    }
                }
            }
            ((InputMethodManager) lazy.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
