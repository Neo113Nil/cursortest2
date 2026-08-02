package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes14.dex */
public final class ki6 implements fnu0 {
    public final ui2 a;
    public final zuj0 b;

    public ki6(ui2 ui2Var, zuj0 zuj0Var) {
        this.a = ui2Var;
        this.b = zuj0Var;
    }

    @Override // defpackage.fnu0
    public final void a(String str) {
    }

    @Override // defpackage.fnu0
    public final Rect b(String str) {
        ui2 ui2Var = this.a;
        float f = ui2Var.a;
        zuj0 zuj0Var = this.b;
        int round = Math.round(tje.x(((avj0) zuj0Var).a, f));
        float f2 = ui2Var.b;
        return new Rect(round, Math.round(tje.x(((avj0) zuj0Var).a, f2)), Math.round(tje.x(((avj0) zuj0Var).a, ui2Var.a + ui2Var.c)), Math.round(tje.x(((avj0) zuj0Var).a, f2 + ui2Var.d)));
    }

    @Override // defpackage.fnu0
    public final View c(String str) {
        return null;
    }

    @Override // defpackage.fnu0
    public final void d(String str) {
    }

    @Override // defpackage.fnu0
    public final void e() {
    }
}
