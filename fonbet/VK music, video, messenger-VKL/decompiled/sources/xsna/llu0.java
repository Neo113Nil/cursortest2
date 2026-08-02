package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.id.UserId;
import com.vk.multiaccount.api.domain.model.VkClientOpenSwitcherConfig;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.PinCodeAnalyticsParams;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.ikv0;

/* compiled from: VkClientMultiAccountRouterImpl.kt */
/* loaded from: classes3.dex */
public final class llu0 implements jlu0 {
    public final com.vk.superapp.multiaccount.api.e a;
    public final mui0 b;
    public final com.vk.superapp.multiaccount.api.d c;

    /* compiled from: VkClientMultiAccountRouterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkClientOpenSwitcherConfig.values().length];
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_SWITCHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public llu0(com.vk.superapp.multiaccount.api.e eVar, mui0 mui0Var, nn nnVar, com.vk.superapp.multiaccount.api.d dVar) {
        this.a = eVar;
        this.b = mui0Var;
        this.c = dVar;
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final boolean a(FragmentManager fragmentManager) {
        return this.a.a(fragmentManager);
    }

    @Override // xsna.jlu0
    public final boolean b(String str) {
        return epx.f(jeq0.g(brm0.A(str, "#", "")).getPath(), "/multiaccount_switcher");
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void c(Context context, UserId userId, PinCodeAnalyticsParams pinCodeAnalyticsParams) {
        this.a.c(context, userId, pinCodeAnalyticsParams);
    }

    @Override // xsna.jlu0
    public final VkClientOpenSwitcherConfig d(MultiAccountEntryPoint multiAccountEntryPoint) {
        return (!MultiAccountEntryPoint.c.contains(multiAccountEntryPoint.getClass()) || this.b.e().size() >= 2 || this.c.d().size() >= 2) ? VkClientOpenSwitcherConfig.OPEN_SWITCHER : VkClientOpenSwitcherConfig.OPEN_AUTH;
    }

    @Override // xsna.jlu0
    public final void e(FragmentImpl fragmentImpl, MultiAccountEntryPoint multiAccountEntryPoint) {
        FragmentManager childFragmentManager;
        Context requireContext = fragmentImpl.requireContext();
        vbs Ln = fragmentImpl.Ln();
        if (Ln == null || (childFragmentManager = Ln.a) == null) {
            childFragmentManager = fragmentImpl.getChildFragmentManager();
        }
        new klu0(this, multiAccountEntryPoint, requireContext, childFragmentManager).invoke();
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void f(FragmentManager fragmentManager, UserId userId) {
        this.a.f(fragmentManager, userId);
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void g(Context context, MultiAccountEntryPoint multiAccountEntryPoint) {
        this.a.g(context, multiAccountEntryPoint);
    }

    @Override // xsna.jlu0
    public final void h(FragmentActivity fragmentActivity, MultiAccountEntryPoint multiAccountEntryPoint) {
        new klu0(this, multiAccountEntryPoint, fragmentActivity, fragmentActivity.getSupportFragmentManager()).invoke();
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void i(Context context, ArrayList arrayList, MultiAccountEntryPoint multiAccountEntryPoint) {
        this.a.i(context, arrayList, multiAccountEntryPoint);
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void j(FragmentManager fragmentManager, MultiAccountEntryPoint multiAccountEntryPoint, SwitcherLaunchMode switcherLaunchMode, SwitcherUiMode switcherUiMode) {
        this.a.j(fragmentManager, multiAccountEntryPoint, switcherLaunchMode, switcherUiMode);
    }

    @Override // xsna.jlu0
    public final void k(Context context, wku0 wku0Var) {
        ikv0.a aVar = new ikv0.a(context);
        String str = wku0Var.b;
        if (str == null) {
            str = "";
        }
        aVar.t = new ikv0.c.a(new c.d(str, null));
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.multiacc_changed).concat(wku0Var.a), 1), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.k = 1;
        aVar.l = 1;
        pkv0.f(aVar);
    }

    @Override // com.vk.superapp.multiaccount.api.e
    public final void l(Context context, UserId userId) {
        this.a.l(context, userId);
    }
}
