package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.deeplink.ApplinkPaymentDeeplinkAction;
import com.yandex.go.ypay.impl.YPayGoActivity;
import java.util.LinkedHashMap;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes15.dex */
public final class ht51 implements zu51 {
    public final ij51 a;

    public ht51(ij51 ij51Var) {
        this.a = ij51Var;
    }

    @Override // defpackage.zu51
    public final void a(Uri uri) {
        String str;
        String uri2 = uri.toString();
        ij51 ij51Var = this.a;
        ij51Var.getClass();
        if (ij51Var.b.getBoolean("ypay_is_enabled", false)) {
            f23 f23Var = new f23();
            TaxiApplication taxiApplication = ((zzf) ij51Var.a).a;
            g0c a = qoi0.a(YPayGoActivity.class);
            f23Var.a.getClass();
            h0w a2 = g23.a(uri2);
            if (a2 == null) {
                return;
            }
            f23Var.b.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) a2.c;
            if (h23.a[((ApplinkPaymentDeeplinkAction) a2.b).ordinal()] != 1) {
                w511.b();
                return;
            }
            if (!jl40.l((String) linkedHashMap.get(StateEntry.COLUMN_PATH), "/payment") || (str = (String) linkedHashMap.get("url")) == null) {
                return;
            }
            Intent intent = new Intent(taxiApplication, (Class<?>) a.a());
            intent.setFlags(intent.getFlags() | 872415232);
            intent.putExtra("BY_DEEPLINK", true);
            intent.putExtra("url", str);
            taxiApplication.startActivity(intent);
        }
    }

    @Override // defpackage.zu51
    public final q5u b(Uri uri) {
        String uri2 = uri.toString();
        if (this.a.b.getBoolean("ypay_is_enabled", false)) {
            new f23().a.getClass();
            if (g23.a(uri2) != null) {
                return new p5u(uri);
            }
        }
        return xpb1.H;
    }
}
