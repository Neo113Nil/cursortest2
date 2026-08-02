package defpackage;

import android.app.Activity;
import com.yandex.go.taxi.order.provider.a;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes9.dex */
public final class pc5 extends jey {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jey, defpackage.iey
    public void onDestroy() {
        switch (this.a) {
            case 1:
                pzt0 pzt0Var = ((aj7) this.b).c;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onPause() {
        switch (this.a) {
            case 0:
                ((qc5) this.b).pause();
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onResume() {
        switch (this.a) {
            case 0:
                ((qc5) this.b).resume();
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onStart() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((qc5) obj).onStart();
                break;
            case 2:
                fm10 fm10Var = (fm10) obj;
                h9a0 h9a0Var = (h9a0) fm10Var.n();
                if (!h9a0Var.d && h9a0Var.a && ((a) fm10Var.H).l().size() > 1) {
                    AlertDialog alertDialog = fm10Var.J;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    fm10Var.J = new AlertDialog((Activity) fm10Var.D).setMessage(kyh0.payment_method_changed_multiple_orders).setPositiveButton(kyh0.common_ok, (Runnable) null).show();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onStop() {
        switch (this.a) {
            case 0:
                ((qc5) this.b).Lg();
                break;
        }
    }
}
