package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.payment.common.result.ResultType;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class li3 extends keo {
    public final /* synthetic */ int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public li3(Scenario scenario) {
        super("api_method_call", r0.j());
        String str;
        this.c = 15;
        MapBuilder mapBuilder = new MapBuilder();
        if (scenario instanceof Scenario.Payment) {
            str = "payment";
        } else if (scenario instanceof Scenario.CardBinding) {
            str = "card_binding";
        } else if (scenario instanceof Scenario.SelectMethod) {
            str = "select";
        } else if (scenario instanceof Scenario.SbpTokenBinding) {
            str = "spb_token_binding";
        } else if (scenario instanceof Scenario.TransportCards) {
            str = "transport_cards";
        } else if (scenario instanceof Scenario.Verification) {
            str = "verification";
        } else if (scenario instanceof Scenario.GooglePlayBinding) {
            str = "googlepay_binding";
        } else if (scenario instanceof Scenario.DynamicLinkFlow) {
            str = "dynamic_link_flow";
        } else if (scenario instanceof Scenario.Unbinding) {
            str = "unbind_payment_method";
        } else if (scenario instanceof Scenario.TransportBanner) {
            str = "transport_banner";
        } else {
            if (!(scenario instanceof Scenario.Widget)) {
                w511.b();
                throw null;
            }
            str = "widget";
        }
        mapBuilder.put("api_method", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li3(String str) {
        super(str);
        this.c = 17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li3(boolean z) {
        super("auth_checked", g8e.z("is_authorized", String.valueOf(z)));
        this.c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li3(int i, String str, Map map) {
        super(str, map);
        this.c = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public li3(Scenario scenario, FinishFlowStatus finishFlowStatus) {
        super(g8e.p(dab1.c(scenario), "_", r3));
        String str;
        this.c = 16;
        int i = g3a0.a[finishFlowStatus.ordinal()];
        if (i == 1) {
            str = "success";
        } else if (i == 2) {
            str = ResultType.RESULT_TYPE_FAILURE;
        } else if (i == 3) {
            str = "cancel";
        } else if (i == 4) {
            str = "unknown";
        } else {
            w511.b();
            throw null;
        }
    }
}
