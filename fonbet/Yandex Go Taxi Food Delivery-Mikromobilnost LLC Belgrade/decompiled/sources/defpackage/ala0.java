package defpackage;

import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsAnalyticsInteractor$VisibilityState;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;
import kotlinx.coroutines.sync.a;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class ala0 {
    public final tse a;
    public final zf b;
    public final a c = gtq0.a();
    public final r0 d = bvf0.c(PaymentWidgetsAnalyticsInteractor$VisibilityState.NO_SECTION);

    public ala0(tse tseVar, zf zfVar) {
        this.a = tseVar;
        this.b = zfVar;
    }

    public static final void a(ala0 ala0Var, boolean z) {
        zf zfVar = ala0Var.b;
        if (z) {
            zfVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(MetaDataField.SCREEN_FIELD, "superapp_main");
            zfVar.a.a("PaymentWidgets.Section.Expanded", hashMap, 1, new HashMap());
            return;
        }
        zfVar.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(MetaDataField.SCREEN_FIELD, "superapp_main");
        zfVar.a.a("PaymentWidgets.Section.Collapsed", hashMap2, 1, new HashMap());
    }
}
