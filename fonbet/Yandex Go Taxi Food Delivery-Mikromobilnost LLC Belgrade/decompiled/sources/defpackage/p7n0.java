package defpackage;

import com.yandex.go.scooters.misc.common_dialog.ScootersCommonDialogAnalytics$CloseReason;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class p7n0 {
    public final lx4 a;
    public final s7n0 b;

    public p7n0(lx4 lx4Var, s7n0 s7n0Var) {
        this.a = lx4Var;
        this.b = s7n0Var;
    }

    public final void a(ScootersCommonDialogAnalytics$CloseReason scootersCommonDialogAnalytics$CloseReason) {
        s7n0 s7n0Var = this.b;
        String j = b64.j(s7n0Var.e, ".Closed");
        String str = s7n0Var.a;
        i d = ((j) this.a).d(j);
        d.d("type", str);
        d.d("close_reason", scootersCommonDialogAnalytics$CloseReason.getCloseReasonName());
        d.m();
    }
}
