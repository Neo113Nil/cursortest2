package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class k23 {
    public static ApplinkPaymentFragment a(IntentArgs intentArgs) {
        ApplinkPaymentFragment applinkPaymentFragment = new ApplinkPaymentFragment();
        applinkPaymentFragment.setArguments(wwg.g(new Pair("intent_args", intentArgs)));
        return applinkPaymentFragment;
    }
}
