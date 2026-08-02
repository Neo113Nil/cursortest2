package defpackage;

import com.yandex.plus.core.user.SubscriptionStatus;
import java.util.Locale;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class at90 {
    public final String a;
    public final String b;
    public final String c;
    public final ead0 d;
    public final ueo e;
    public final n4u0 f;
    public final sls g;
    public final ead0 h;

    public at90(String str, String str2, String str3, ead0 ead0Var, ueo ueoVar, r0 r0Var, sls slsVar, ead0 ead0Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ead0Var;
        this.e = ueoVar;
        this.f = r0Var;
        this.g = slsVar;
        this.h = ead0Var2;
    }

    public final o370 a() {
        String str;
        String str2;
        String l;
        String str3 = (String) this.d.invoke();
        n4u0 n4u0Var = this.f;
        Long id = ((lj) n4u0Var.getValue()).getId();
        String str4 = (id == null || (l = id.toString()) == null) ? "no_value" : l;
        ueo ueoVar = this.e;
        k2d0 k2d0Var = (k2d0) ueoVar.invoke();
        String str5 = (k2d0Var == null || (str2 = k2d0Var.a) == null) ? "no_value" : str2;
        k2d0 k2d0Var2 = (k2d0) ueoVar.invoke();
        String str6 = (k2d0Var2 == null || (str = k2d0Var2.b) == null) ? "no_value" : str;
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) this.g.invoke();
        return new o370(this.a, this.b, this.c, n4u0Var.getValue() instanceof jj ? PayEvgenSubscriptionState.NotLoggedIn : subscriptionStatus == SubscriptionStatus.NO_SUBSCRIPTION ? PayEvgenSubscriptionState.NoSubscription : subscriptionStatus == SubscriptionStatus.SUBSCRIPTION_PLUS ? PayEvgenSubscriptionState.Active : PayEvgenSubscriptionState.Unknown, str5, str6, str4, str3, ((Locale) this.h.invoke()).getLanguage());
    }
}
