package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: VkSearchParamsDialogSheet.kt */
/* loaded from: classes5.dex */
public final class giv0 {
    public final dw20 a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();

    public giv0(FragmentActivity fragmentActivity, lcv0 lcv0Var) {
        this.a = new dw20.b(fragmentActivity, null).D0(lcv0Var, false).v0(R.string.vk_discover_search_params_title).m(R.attr.vk_legacy_background_content).H(new r6i0(lcv0Var, 25)).f0(new b3m0(this, 21)).G(R.string.vk_discover_search_params_clear).c(new cpo(false, 0, 7)).a();
    }
}
