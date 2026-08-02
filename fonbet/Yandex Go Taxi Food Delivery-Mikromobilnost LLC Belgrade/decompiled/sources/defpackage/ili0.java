package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.ApplinkPaymentParseResult$RedirectHost;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class ili0 {
    public static RedirectHostFragment a(ApplinkPaymentParseResult$RedirectHost applinkPaymentParseResult$RedirectHost) {
        RedirectHostFragment redirectHostFragment = new RedirectHostFragment();
        redirectHostFragment.setArguments(wwg.g(new Pair("redirect_host_parse_result", applinkPaymentParseResult$RedirectHost)));
        return redirectHostFragment;
    }
}
