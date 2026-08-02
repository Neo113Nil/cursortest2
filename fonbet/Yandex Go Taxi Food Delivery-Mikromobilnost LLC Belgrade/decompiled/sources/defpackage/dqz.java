package defpackage;

import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes12.dex */
public final class dqz implements cqz {
    public final uq1 a;
    public final zuj0 b;

    public dqz(uq1 uq1Var, zuj0 zuj0Var) {
        this.a = uq1Var;
        this.b = zuj0Var;
    }

    public final void a(sls slsVar, String str) {
        AlertDialog a = this.a.a();
        a.setMessage(str);
        a.setPositiveButton(((avj0) this.b).h(kyh0.common_got_it), new ijs(8, slsVar));
        a.show();
    }
}
