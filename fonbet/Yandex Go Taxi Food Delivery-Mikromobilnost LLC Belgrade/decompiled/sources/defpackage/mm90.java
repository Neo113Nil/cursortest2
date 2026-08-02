package defpackage;

import android.content.SharedPreferences;
import com.ybsdk.feature.persistence.api.StorageType;
import java.util.Collections;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes3.dex */
public final class mm90 {
    public static final /* synthetic */ kgx[] b;
    public final ew2 a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("isLoyaltyAgreementInfoAvailable", 0, "isLoyaltyAgreementInfoAvailable()Z", mm90.class);
        qoi0.a.getClass();
        b = new kgx[]{mutablePropertyReference1Impl};
    }

    public mm90(y4a0 y4a0Var) {
        SharedPreferences a = ((c1b0) ((a1b0) y4a0Var.b)).a(StorageType.WALLET_LOYALTY_WIDGET);
        Long l = (Long) ((di51) y4a0Var.c).m().getValue();
        String l2 = l != null ? l.toString() : null;
        if (l2 == null) {
            x4c.g("Passport uid is null", null, null, Collections.singletonList(orp0.h), 6);
        }
        this.a = new ew2((Object) a, (Object) b64.j(l2, "::is_loyalty_agreement_accepted"), false);
    }
}
