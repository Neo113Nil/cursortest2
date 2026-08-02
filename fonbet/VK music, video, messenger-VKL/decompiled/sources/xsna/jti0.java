package xsna;

import android.graphics.Canvas;
import xsna.mlo;
import xsna.qu90;

/* compiled from: SessionDrawer.kt */
/* loaded from: classes4.dex */
public interface jti0 {
    default qu90 c() {
        return qu90.a.b;
    }

    default mlo d() {
        return mlo.a.b;
    }

    default void f() {
        c().clear();
    }

    default void g(Canvas canvas, uap uapVar) {
        if (uapVar instanceof jio) {
            c().clear();
            ((jio) uapVar).a(c());
            c().d(canvas);
        }
    }
}
