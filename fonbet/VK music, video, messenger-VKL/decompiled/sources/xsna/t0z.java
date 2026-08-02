package xsna;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.ma2;

/* compiled from: LegacyCursorAnchorInfoController.android.kt */
/* loaded from: classes11.dex */
public final class t0z {
    public final ma2.a.b a;
    public final j2x b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public tho0 j;
    public ljo0 k;
    public uv70 l;
    public zhf0 m;
    public zhf0 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = en10.a();
    public final Matrix q = new Matrix();

    public t0z(ma2.a.b bVar, j2x j2xVar) {
        this.a = bVar;
        this.b = j2xVar;
    }

    public final void a() {
        j2x j2xVar;
        int i;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        j2x j2xVar2 = this.b;
        InputMethodManager b = j2xVar2.b();
        View view = j2xVar2.a;
        if (!b.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        en10.e(fArr);
        tny j0 = this.a.$node.j0();
        if (j0 != null) {
            if (!j0.e()) {
                j0 = null;
            }
            if (j0 != null) {
                j0.k0(fArr);
            }
        }
        s3q0 s3q0Var = s3q0.a;
        zhf0 zhf0Var = this.n;
        en10.i(-zhf0Var.a, -zhf0Var.b, fArr);
        Matrix matrix = this.q;
        alk.w(matrix, fArr);
        tho0 tho0Var = this.j;
        uv70 uv70Var = this.l;
        ljo0 ljo0Var = this.k;
        zhf0 zhf0Var2 = this.m;
        zhf0 zhf0Var3 = this.n;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        long j = tho0Var.b;
        qko0 qko0Var = tho0Var.c;
        int f = qko0.f(j);
        builder.setSelectionRange(f, qko0.e(tho0Var.b));
        if (!z || f < 0) {
            j2xVar = j2xVar2;
            i = 1;
        } else {
            int b2 = uv70Var.b(f);
            zhf0 c = ljo0Var.c(b2);
            i = 1;
            j2xVar = j2xVar2;
            float f2 = swe0.f(c.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (ljo0Var.c >> 32));
            boolean a = s0z.a(zhf0Var2, f2, c.b);
            boolean a2 = s0z.a(zhf0Var2, f2, c.d);
            boolean z5 = ljo0Var.a(b2) == ResolvedTextDirection.Rtl;
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
                int b3 = uv70Var.b(f5);
                int b4 = uv70Var.b(e);
                float[] fArr2 = new float[(b4 - b3) * 4];
                ljo0Var.b.a(jgz.c(b3, b4), fArr2);
                int i3 = f5;
                while (i3 < e) {
                    int b5 = uv70Var.b(i3);
                    int i4 = (b5 - b3) * 4;
                    float f6 = fArr2[i4];
                    float f7 = fArr2[i4 + 1];
                    int i5 = e;
                    float f8 = fArr2[i4 + 2];
                    float f9 = fArr2[i4 + 3];
                    int i6 = b3;
                    int i7 = (zhf0Var2.a < f8 ? i : 0) & (f6 < zhf0Var2.c ? i : 0) & (zhf0Var2.b < f9 ? i : 0) & (f7 < zhf0Var2.d ? i : 0);
                    if (!s0z.a(zhf0Var2, f6, f7) || !s0z.a(zhf0Var2, f8, f9)) {
                        i7 |= 2;
                    }
                    if (ljo0Var.a(b5) == ResolvedTextDirection.Rtl) {
                        i7 |= 4;
                    }
                    builder.addCharacterBounds(i3, f6, f7, f8, f9, i7);
                    i3++;
                    e = i5;
                    b3 = i6;
                }
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33 && z3) {
            editorBounds = y13.b().setEditorBounds(zjq.o(zhf0Var3));
            handwritingBounds = editorBounds.setHandwritingBounds(zjq.o(zhf0Var3));
            build = handwritingBounds.build();
            builder.setEditorBoundsInfo(build);
        }
        if (i8 >= 34 && z4 && !zhf0Var2.g()) {
            m540 m540Var = ljo0Var.b;
            int i9 = m540Var.f - 1;
            if (i9 < 0) {
                i9 = 0;
            }
            int g = swe0.g(m540Var.e(zhf0Var2.b), 0, i9);
            int g2 = swe0.g(m540Var.e(zhf0Var2.d), 0, i9);
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
        j2xVar.b().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
