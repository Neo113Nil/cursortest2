package defpackage;

import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.custom.CustomActionHandler;
import com.yandex.fintechsdk.core.bdui.api.state.BduiStateTag;
import java.util.Collections;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class agt implements jg5 {
    public final /* synthetic */ int a;
    public final FlexAdapter b;

    public /* synthetic */ agt(FlexAdapter flexAdapter, int i) {
        this.a = i;
        this.b = flexAdapter;
    }

    public void a(boolean z) {
        sh5 stateManager;
        FlexAdapter flexAdapter = this.b;
        if (flexAdapter == null || (stateManager = flexAdapter.getStateManager()) == null) {
            return;
        }
        stateManager.update(gw00.e(new Pair("TransportGlobalState", gw00.e(new Pair("isNfcEnabled", Boolean.valueOf(z))))), Collections.singletonList(BduiStateTag.SEND_TO_BACKEND));
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        View handle$lambda$0;
        nh5 currentRouteHandler;
        int i = this.a;
        FlexAdapter flexAdapter = this.b;
        switch (i) {
            case 0:
                if ((ig5Var instanceof zft) && flexAdapter != null) {
                    zft zftVar = (zft) ig5Var;
                    handle$lambda$0 = CustomActionHandler.handle$lambda$0((CustomActionHandler) jh5Var.b.b, zftVar.a);
                    if (handle$lambda$0 != null) {
                        handle$lambda$0.getLocationOnScreen(new int[2]);
                        String str = zftVar.d;
                        if (str != null) {
                            flexAdapter.updateVariable(str, Long.valueOf(r0[0]));
                        }
                        String str2 = zftVar.e;
                        if (str2 != null) {
                            flexAdapter.updateVariable(str2, Long.valueOf(r0[1]));
                        }
                        String str3 = zftVar.c;
                        if (str3 != null) {
                            flexAdapter.updateVariable(str3, Long.valueOf(handle$lambda$0.getWidth()));
                        }
                        String str4 = zftVar.b;
                        if (str4 != null) {
                            flexAdapter.updateVariable(str4, Long.valueOf(handle$lambda$0.getHeight()));
                            break;
                        }
                    }
                }
                break;
            default:
                if ((ig5Var instanceof t6e0) && flexAdapter != null && (currentRouteHandler = flexAdapter.getCurrentRouteHandler()) != null) {
                    currentRouteHandler.popToRoot(((t6e0) ig5Var).a.a);
                    break;
                }
                break;
        }
    }
}
