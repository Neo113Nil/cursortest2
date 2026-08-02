package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.asy0;
import defpackage.dry0;
import defpackage.eja1;
import defpackage.fia1;
import defpackage.g9y;
import defpackage.gtq0;
import defpackage.h0w;
import defpackage.hm40;
import defpackage.hoy0;
import defpackage.iv60;
import defpackage.jif;
import defpackage.n810;
import defpackage.rzx;
import defpackage.tls;
import defpackage.wdb1;
import defpackage.y6i0;
import defpackage.zii0;

/* loaded from: classes10.dex */
public final class c {
    public final tls a;
    public final h0w b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public hoy0 j;
    public dry0 k;
    public iv60 l;
    public zii0 m;
    public zii0 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = n810.a();
    public final Matrix q = new Matrix();

    public c(tls tlsVar, h0w h0wVar) {
        this.a = tlsVar;
        this.b = h0wVar;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        h0w h0wVar = this.b;
        InputMethodManager l = h0wVar.l();
        View view = (View) h0wVar.b;
        if (!l.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        n810.d(fArr);
        rzx rzxVar = (rzx) ((g9y) ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1) this.a).$node).w.getValue();
        if (rzxVar != null) {
            if (!rzxVar.d()) {
                rzxVar = null;
            }
            if (rzxVar != null) {
                rzxVar.b0(fArr);
            }
        }
        zii0 zii0Var = this.n;
        n810.g(fArr, -zii0Var.a, -zii0Var.b);
        Matrix matrix = this.q;
        gtq0.M(matrix, fArr);
        hoy0 hoy0Var = this.j;
        long j = hoy0Var.b;
        iv60 iv60Var = this.l;
        dry0 dry0Var = this.k;
        hm40 hm40Var = dry0Var.b;
        zii0 zii0Var2 = this.m;
        float f = zii0Var2.d;
        float f2 = zii0Var2.b;
        zii0 zii0Var3 = this.n;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder2 = this.o;
        builder2.reset();
        builder2.setMatrix(matrix);
        asy0 asy0Var = hoy0Var.c;
        int f3 = asy0.f(j);
        builder2.setSelectionRange(f3, asy0.e(j));
        if (!z || f3 < 0) {
            builder = builder2;
        } else {
            int r = iv60Var.r(f3);
            zii0 c = dry0Var.c(r);
            float c2 = y6i0.c(c.a, 0.0f, (int) (dry0Var.c >> 32));
            boolean i = wdb1.i(zii0Var2, c2, c.b);
            boolean i2 = wdb1.i(zii0Var2, c2, c.d);
            boolean z5 = dry0Var.a(r) == ResolvedTextDirection.Rtl;
            int i3 = (i || i2) ? 1 : 0;
            if (!i || !i2) {
                i3 |= 2;
            }
            if (z5) {
                i3 |= 4;
            }
            float f4 = c.b;
            float f5 = c.d;
            builder2.setInsertionMarkerLocation(c2, f4, f5, f5, i3);
            builder = builder2;
        }
        if (z2) {
            int f6 = asy0Var != null ? asy0.f(asy0Var.a) : -1;
            int e = asy0Var != null ? asy0.e(asy0Var.a) : -1;
            if (f6 >= 0 && f6 < e) {
                builder.setComposingText(f6, hoy0Var.a.b.subSequence(f6, e));
                int r2 = iv60Var.r(f6);
                int r3 = iv60Var.r(e);
                float[] fArr2 = new float[(r3 - r2) * 4];
                hm40Var.a(eja1.c(r2, r3), fArr2);
                while (f6 < e) {
                    int r4 = iv60Var.r(f6);
                    int i4 = (r4 - r2) * 4;
                    float f7 = fArr2[i4];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f8 = fArr2[i4 + 1];
                    int i5 = e;
                    float f9 = fArr2[i4 + 2];
                    float f10 = fArr2[i4 + 3];
                    int i6 = r2;
                    int i7 = (zii0Var2.a < f9 ? 1 : 0) & (f7 < zii0Var2.c ? 1 : 0) & (f2 < f10 ? 1 : 0) & (f8 < f ? 1 : 0);
                    if (!wdb1.i(zii0Var2, f7, f8) || !wdb1.i(zii0Var2, f9, f10)) {
                        i7 |= 2;
                    }
                    if (dry0Var.a(r4) == ResolvedTextDirection.Rtl) {
                        i7 |= 4;
                    }
                    int i8 = f6;
                    builder3.addCharacterBounds(i8, f7, f8, f9, f10, i7);
                    builder = builder3;
                    f6 = i8 + 1;
                    e = i5;
                    r2 = i6;
                }
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 && z3) {
            editorBounds = jif.l().setEditorBounds(fia1.f(zii0Var3));
            handwritingBounds = editorBounds.setHandwritingBounds(fia1.f(zii0Var3));
            build = handwritingBounds.build();
            builder.setEditorBoundsInfo(build);
        }
        if (i9 >= 34 && z4 && !zii0Var2.g()) {
            int i10 = hm40Var.f - 1;
            if (i10 < 0) {
                i10 = 0;
            }
            int d = y6i0.d(hm40Var.e(f2), 0, i10);
            int d2 = y6i0.d(hm40Var.e(f), 0, i10);
            if (d <= d2) {
                while (true) {
                    builder.addVisibleLineBounds(dry0Var.i(d), hm40Var.f(d), dry0Var.j(d), hm40Var.b(d));
                    if (d == d2) {
                        break;
                    } else {
                        d++;
                    }
                }
            }
        }
        h0wVar.l().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
