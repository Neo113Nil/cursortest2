package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.feature.FeatureFlag;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.pay.InternalSessionDependencies;
import com.yandex.pay.base.api.MerchantData;
import com.yandex.pay.payment.PaymentData;
import java.util.Set;

/* loaded from: classes12.dex */
public final class a23 extends yr31 {
    public final lwf b;
    public boolean c;

    public a23(Context context, IntentArgs intentArgs, hrw hrwVar) {
        String a;
        n3w n3wVar = mwf.a;
        pm5 pm5Var = new pm5(16, intentArgs.getCanBeAnonymous());
        DefaultEnvironment j = v891.j(intentArgs.getConfig().getEnvironment());
        b2w b2wVar = new b2w(new a2w(BottomSheetMode.DISABLED, 2));
        String merchantClientId = intentArgs.getMerchantClientId();
        ko10 ko10Var = merchantClientId != null ? new ko10(merchantClientId) : null;
        MerchantData merchantData = intentArgs.getConfig().getMerchantData();
        jp90 jp90Var = hrwVar.a;
        PayboxScenario payboxScenario = intentArgs.getPayboxScenario();
        PayEnvironment environment = intentArgs.getConfig().getEnvironment();
        PaymentData paymentData = intentArgs.getPaymentData();
        Region region = intentArgs.getRegion();
        Set<FeatureFlag> featureFlags = intentArgs.getFeatureFlags();
        InternalSessionDependencies sessionDependencies = intentArgs.getSessionDependencies();
        if (sessionDependencies == null || (a = sessionDependencies.getSessionId()) == null) {
            new tzq0();
            a = tzq0.a(intentArgs.getConfig().getMerchantData().getId().getValue());
        }
        rzq0 rzq0Var = new rzq0(a);
        j.getClass();
        merchantData.getClass();
        payboxScenario.getClass();
        environment.getClass();
        paymentData.getClass();
        region.getClass();
        featureFlags.getClass();
        lwf lwfVar = new lwf(new kh5(), new a8o(), new rqt0(), new zr41(), pm5Var, context, j, b2wVar, intentArgs, ko10Var, jp90Var, payboxScenario, environment, paymentData, region, featureFlags, rzq0Var);
        this.b = lwfVar;
        this.c = true;
        ((a) lwfVar.getAnalytics()).a(axv.c);
    }
}
