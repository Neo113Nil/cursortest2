package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.models.net.experiment.c;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes6.dex */
public final class az21 extends v96 {
    public final Context a;
    public final a201 b;
    public final s0g c;
    public final djj0 d;
    public final z880 e;
    public final oep0 f;

    public az21(Context context, a201 a201Var, s0g s0gVar, djj0 djj0Var, z880 z880Var, oep0 oep0Var) {
        this.a = context;
        this.b = a201Var;
        this.c = s0gVar;
        this.d = djj0Var;
        this.e = z880Var;
        this.f = oep0Var;
    }

    @Override // defpackage.v96
    public final boolean b() {
        djj0 djj0Var = this.d;
        fnx0 n = ((k) djj0Var.b).n();
        c b = djj0Var.e.b();
        final int i = 0;
        if (n == null || !b.b || !djj0Var.c.c(n.c, n.d, EmptyList.a, b, cdj0.a).b()) {
            axm axmVar = (axm) this.b.b;
            if (!axmVar.c() || axmVar.a.a.S.d > 0) {
                return false;
            }
            final int i2 = 1;
            if (!(axmVar.b() != null ? !((nf7) r0.c).b(r1) : false)) {
                new AlertDialog((Activity) this.a).setMessage(kyh0.preorder_due_past_time_alert_message).setNegativeButton(kyh0.common_no, new Runnable(this) { // from class: zy21
                    public final /* synthetic */ az21 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        az21 az21Var = this.b;
                        switch (i3) {
                            case 0:
                                ((axm) az21Var.b.b).a(qtb1.D);
                                break;
                            default:
                                ((pep0) az21Var.f).f(new rwo0(new pv01(24, az21Var), az21Var.c), new qvm(DueAnalyticDisplayContext.SUMMARY), hxx.a);
                                break;
                        }
                    }
                }).setPositiveButton(kyh0.preorder_due_past_time_choose_another, new Runnable(this) { // from class: zy21
                    public final /* synthetic */ az21 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        az21 az21Var = this.b;
                        switch (i3) {
                            case 0:
                                ((axm) az21Var.b.b).a(qtb1.D);
                                break;
                            default:
                                ((pep0) az21Var.f).f(new rwo0(new pv01(24, az21Var), az21Var.c), new qvm(DueAnalyticDisplayContext.SUMMARY), hxx.a);
                                break;
                        }
                    }
                }).setButtonsOrientation(BaseDialog.ButtonsOrientation.VERTICAL).show();
                return true;
            }
        }
        return false;
    }
}
