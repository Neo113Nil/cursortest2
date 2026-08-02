package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.transfer.version2.api.CrossBorderScenario;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.internal.screens.a;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class m2h implements k3h {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ccf b;

    public m2h(ccf ccfVar) {
        this.b = ccfVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        ccf ccfVar = this.b;
        EmptyList emptyList = EmptyList.a;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Transfer)) {
                    return x0hVar;
                }
                TransferMainScreenArguments arguments = ((DeeplinkAction.Transfer) baseDeeplinkAction).getArguments();
                return (!ccfVar.b || arguments.getCountryCode() == null) ? new v0h(Collections.singletonList(a.f(arguments)), null, 6) : new v0h(emptyList, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Transfer)) {
                    return x0hVar;
                }
                TransferMainScreenArguments arguments2 = ((DeeplinkAction.Transfer) baseDeeplinkAction).getArguments();
                String countryCode = arguments2.getCountryCode();
                if (arguments2.getScenario() != TransferScenario.CROSS_BORDER || countryCode == null) {
                    return x0hVar;
                }
                CrossBorderScenario crossBorderScenario = arguments2.getCrossBorderScenario();
                String title = arguments2.getTitle();
                gl01 gl01Var = ccfVar.a;
                return ((gl01Var != null ? ((Boolean) gl01Var.invoke(countryCode, crossBorderScenario, title)).booleanValue() : false) || ccfVar.b) ? new v0h(emptyList, null, 6) : x0hVar;
        }
    }

    public m2h(ccf ccfVar, ju01 ju01Var) {
        this.b = ccfVar;
    }
}
