package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import kotlin.LazyThreadSafetyMode;

/* compiled from: JsVkClientMultiaccountDelegateVkClientImpl.kt */
/* loaded from: classes6.dex */
public final class d7y implements j5y, w8i {
    public final x6y b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new cnh(this, 17));

    public d7y(x6y x6yVar) {
        this.b = x6yVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j5y
    public final void a() {
        gvv0 view;
        Context B0;
        boolean z;
        x6y x6yVar = this.b;
        fvv0 M = x6yVar.M();
        if (M == null || (view = M.getView()) == null || (B0 = view.B0()) == null) {
            return;
        }
        while (true) {
            z = B0 instanceof FragmentActivity;
            if (z || !(B0 instanceof ContextWrapper)) {
                break;
            } else {
                B0 = ((ContextWrapper) B0).getBaseContext();
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) B0 : null);
        if (fragmentActivity != null) {
            fvv0 M2 = x6yVar.M();
            ((VkClientMultiAccountComponent) this.c.getValue()).a().j(fragmentActivity.getSupportFragmentManager(), (M2 == null || M2.getAppId() != InternalMiniApps.ACCOUNT.h().a) ? MultiAccountEntryPoint.Miniapp.d : MultiAccountEntryPoint.LK.d, SwitcherLaunchMode.DefaultMode.b, SwitcherUiMode.EcoplateLK.b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j5y
    public final boolean b() {
        return ((VkClientMultiAccountComponent) this.c.getValue()).getExperiments().a();
    }
}
