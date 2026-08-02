package defpackage;

import android.view.View;
import androidx.compose.foundation.text.selection.j;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes11.dex */
public abstract class amb1 {
    public static au2 a;

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("MinusL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(3.0f, 13.0f);
        uq90Var.g(18.0f);
        uq90Var.p(-2.0f);
        uq90Var.f(3.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final boolean f(j jVar, boolean z) {
        rzx c;
        oay oayVar = jVar.d;
        if (oayVar == null || (c = oayVar.c()) == null) {
            return false;
        }
        return rx91.d(rx91.g(c), jVar.m(z));
    }

    public abstract Pair a();

    public abstract Triple b();

    public abstract View d();

    public abstract Triple e();
}
