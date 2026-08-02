package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.dry0;
import defpackage.gtq0;
import defpackage.hoy0;
import defpackage.i3y;
import defpackage.iv60;
import defpackage.mub1;
import defpackage.n810;
import defpackage.tls;
import defpackage.zii0;

/* loaded from: classes.dex */
public final class a {
    public final AndroidComposeView a;
    public final b b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public hoy0 j;
    public dry0 k;
    public iv60 l;
    public zii0 n;
    public zii0 o;
    public final Object c = new Object();
    public tls m = CursorAnchorInfoController$textFieldToRootTransform$1.w;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = n810.a();
    public final Matrix r = new Matrix();

    public a(AndroidComposeView androidComposeView, b bVar) {
        this.a = androidComposeView;
        this.b = bVar;
    }

    public final void a() {
        b bVar = this.b;
        i3y i3yVar = bVar.b;
        InputMethodManager inputMethodManager = (InputMethodManager) i3yVar.getValue();
        View view = bVar.a;
        if (inputMethodManager.isActive(view)) {
            tls tlsVar = this.m;
            float[] fArr = this.q;
            tlsVar.invoke(new n810(fArr));
            this.a.mo64localToScreen58bKbWc(fArr);
            Matrix matrix = this.r;
            gtq0.M(matrix, fArr);
            ((InputMethodManager) i3yVar.getValue()).updateCursorAnchorInfo(view, mub1.b(this.p, this.j, this.l, this.k, matrix, this.n, this.o, this.f, this.g, this.h, this.i));
            this.e = false;
        }
    }
}
