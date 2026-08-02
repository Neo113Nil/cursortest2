package xsna;

import android.view.View;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.hints.HintId;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import xsna.r7v;

/* compiled from: CallsPromoBottomNavigationHintDelegate.kt */
/* loaded from: classes.dex */
public final class bd9 implements r7v.a {
    @Override // xsna.r7v.a
    public final void a(NavigationDelegateActivity navigationDelegateActivity, FragmentImpl fragmentImpl, td5 td5Var) {
        View view = (View) td5Var.invoke(Integer.valueOf(R.id.tab_messages));
        if (view == null) {
            return;
        }
        pla.e().b().l(view, HintId.VOIP_PROMO_CALLS_TAB_BAR.getId(), null);
    }

    @Override // xsna.r7v.a
    public final boolean b(FragmentImpl fragmentImpl) {
        return pla.e().b().a(HintId.VOIP_PROMO_CALLS_TAB_BAR.getId()) && (fragmentImpl != null && !(fragmentImpl instanceof ies));
    }
}
