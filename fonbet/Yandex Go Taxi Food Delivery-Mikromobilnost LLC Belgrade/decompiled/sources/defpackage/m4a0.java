package defpackage;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserUIState$ShowAddCardAtBottomConfig;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public final class m4a0 {
    public static final m4a0 h;
    public final List a;
    public final Runnable b;
    public final PaymentMethodChooserUIState$ShowAddCardAtBottomConfig c;
    public final String d;
    public final boolean e;
    public final PaymentsScreen f;
    public final p4m g;

    static {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new gzy());
        }
        h = new m4a0(arrayList, null, null, null, false, null, HProv.PP_DELETE_SAVED_PASSWD);
    }

    public m4a0(List list, Runnable runnable, PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig, String str, boolean z, p4m p4mVar, int i) {
        runnable = (i & 2) != 0 ? pwf0.c : runnable;
        paymentMethodChooserUIState$ShowAddCardAtBottomConfig = (i & 4) != 0 ? PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.GONE : paymentMethodChooserUIState$ShowAddCardAtBottomConfig;
        str = (i & 8) != 0 ? null : str;
        z = (i & 16) != 0 ? false : z;
        PaymentsScreen paymentsScreen = PaymentsScreen.MENU;
        p4mVar = (i & 64) != 0 ? l4m.a : p4mVar;
        this.a = list;
        this.b = runnable;
        this.c = paymentMethodChooserUIState$ShowAddCardAtBottomConfig;
        this.d = str;
        this.e = z;
        this.f = paymentsScreen;
        this.g = p4mVar;
    }
}
