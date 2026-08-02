package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.taxi.order.models.api.preorder.Transfer;
import java.util.Calendar;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes14.dex */
public final class cz21 extends v96 {
    public final Context a;
    public final oep0 b;
    public final cp01 c;
    public final y501 d;

    public cz21(Context context, oep0 oep0Var, cp01 cp01Var, y501 y501Var) {
        this.a = context;
        this.b = oep0Var;
        this.c = cp01Var;
        this.d = y501Var;
    }

    @Override // defpackage.v96
    public final boolean b() {
        dp01 dp01Var = (dp01) this.c;
        Transfer transfer = dp01Var.b().a.a.T;
        Calendar a = transfer != null ? transfer.getA() : null;
        final int i = 0;
        if (a != null) {
            Calendar calendar = ((up01) dp01Var.b().c.getValue()).b;
            final int i2 = 1;
            boolean z = calendar == null || dp01Var.a.b(calendar);
            if (dp01Var.a.b(a) || z) {
                new AlertDialog((Activity) this.a).setMessage(kyh0.preorder_due_past_time_alert_message).setNegativeButton(kyh0.common_no, new Runnable(this) { // from class: bz21
                    public final /* synthetic */ cz21 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        cz21 cz21Var = this.b;
                        switch (i3) {
                            case 0:
                                ((dp01) cz21Var.c).a();
                                break;
                            default:
                                oep0.b(cz21Var.b, (m950) cz21Var.d.get());
                                break;
                        }
                    }
                }).setPositiveButton(kyh0.preorder_due_past_time_choose_another, new Runnable(this) { // from class: bz21
                    public final /* synthetic */ cz21 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        cz21 cz21Var = this.b;
                        switch (i3) {
                            case 0:
                                ((dp01) cz21Var.c).a();
                                break;
                            default:
                                oep0.b(cz21Var.b, (m950) cz21Var.d.get());
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
