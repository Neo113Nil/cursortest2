package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.ApplinkPaymentParseResult$RedirectHost;

/* loaded from: classes12.dex */
public final class gli0 extends yr31 {
    public final i6g b;
    public boolean c;

    public gli0(Context context, hrw hrwVar, ApplinkPaymentParseResult$RedirectHost applinkPaymentParseResult$RedirectHost) {
        n3w n3wVar = j6g.a;
        String appLink = applinkPaymentParseResult$RedirectHost.getAppLink();
        DefaultEnvironment j = v891.j(applinkPaymentParseResult$RedirectHost.getEnvironment());
        bvf0.c(new a2w(BottomSheetMode.DISABLED, 2));
        jp90 jp90Var = hrwVar.a;
        PayEnvironment environment = applinkPaymentParseResult$RedirectHost.getEnvironment();
        Region region = applinkPaymentParseResult$RedirectHost.getRegion();
        new tzq0();
        rzq0 rzq0Var = new rzq0(tzq0.a(null));
        appLink.getClass();
        j.getClass();
        environment.getClass();
        region.getClass();
        this.b = new i6g(new a8o(), new rqt0(), new pr41(), new eli0(), appLink, context, j, jp90Var, environment, region, rzq0Var);
        this.c = true;
    }
}
