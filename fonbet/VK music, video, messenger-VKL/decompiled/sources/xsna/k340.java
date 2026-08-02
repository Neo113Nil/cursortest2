package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.screendata.MultiAccountData;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.PinCodeAnalyticsParams;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.api.analytics.VkAnalyticsUserType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.usi0;

/* compiled from: MultiAccountRouterImpl.kt */
/* loaded from: classes6.dex */
public final class k340 implements com.vk.superapp.multiaccount.api.e {
    public final mui0 a;

    public k340(mui0 mui0Var) {
        this.a = mui0Var;
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final boolean a(FragmentManager fragmentManager) {
        Fragment H = fragmentManager.H("[TAG] EcosystemMultiAccountSwitcherFragment");
        txo txoVar = H instanceof txo ? (txo) H : null;
        return txoVar != null && txoVar.isVisible();
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void c(Context context, UserId userId, PinCodeAnalyticsParams pinCodeAnalyticsParams) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        String str = pinCodeAnalyticsParams.b;
        LinkedHashMap m = pn00.m(new Pair("modal", "create-pincode"));
        if (str.length() > 0) {
            m.put("flow_service", str);
        }
        superappUiRouterBridge.M(context, userId, m);
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void f(FragmentManager fragmentManager, UserId userId) {
        int i = osf0.q1;
        Fragment H = fragmentManager.H("[TAG] PinCodeInputBottomSheetFragment");
        osf0 osf0Var = H instanceof osf0 ? (osf0) H : null;
        if (osf0Var == null) {
            osf0Var = new osf0();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("arg_clicked_user", userId);
            osf0Var.setArguments(bundle);
        }
        osf0Var.Td(fragmentManager, "[TAG] PinCodeInputBottomSheetFragment");
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void g(Context context, MultiAccountEntryPoint multiAccountEntryPoint) {
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        r55 r55Var = r55.a;
        r55.b();
        Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
        EmptyList emptyList = EmptyList.b;
        usi0.a i = this.a.i();
        intent.putExtra("multiAccountData", new MultiAccountData(emptyList, true, sv1.x(multiAccountEntryPoint, i != null ? i instanceof usi0.a.b ? VkAnalyticsUserType.Related : VkAnalyticsUserType.Master : null, VkAnalyticsUserType.Master), 0, 8, null));
        context.startActivity(intent);
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void i(Context context, ArrayList arrayList, MultiAccountEntryPoint multiAccountEntryPoint) {
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        r55 r55Var = r55.a;
        r55.b();
        Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
        usi0.a i = this.a.i();
        intent.putExtra("multiAccountData", new MultiAccountData(arrayList, false, sv1.x(multiAccountEntryPoint, i != null ? i instanceof usi0.a.b ? VkAnalyticsUserType.Related : VkAnalyticsUserType.Master : null, VkAnalyticsUserType.Master), 0, 8, null));
        context.startActivity(intent);
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void j(FragmentManager fragmentManager, MultiAccountEntryPoint multiAccountEntryPoint, SwitcherLaunchMode switcherLaunchMode, SwitcherUiMode switcherUiMode) {
        try {
            Fragment H = fragmentManager.H("[TAG] EcosystemMultiAccountSwitcherFragment");
            txo txoVar = H instanceof txo ? (txo) H : null;
            if (txoVar == null) {
                txoVar = new txo();
                Bundle bundle = new Bundle(3);
                bundle.putParcelable("arg_from", multiAccountEntryPoint);
                bundle.putParcelable("arg_ui_mode", switcherUiMode);
                bundle.putParcelable("arg_launch_mode", switcherLaunchMode);
                txoVar.setArguments(bundle);
            }
            if (txoVar.isAdded()) {
                return;
            }
            txoVar.Td(fragmentManager, "[TAG] EcosystemMultiAccountSwitcherFragment");
        } catch (Exception e) {
            par0.a.getClass();
            par0.d(e);
        }
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void l(Context context, UserId userId) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.M(context, userId, on00.f(new Pair("modal", "create-related-user")));
    }
}
