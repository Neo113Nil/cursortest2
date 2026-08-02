package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.attachpicker.collages.CollageOnboardingBannerView;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: StoryPickerGalleryToolbarConfigurator.kt */
/* loaded from: classes15.dex */
public final class j8m0 implements l5t {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.l5t
    public final LinearLayout b(Context context, p3h p3hVar, nwk nwkVar, cws cwsVar) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.picker_stories_toolbar_new, a);
        VkTopBar vkTopBar = (VkTopBar) a.findViewById(R.id.toolbar);
        vkTopBar.setBefore(new VkTopBar.c.d(null, new i8m0(p3hVar, 0), null, com.vk.core.compose.component.semantics.b.a(null, new ie90(vkTopBar, 19), 3), 5));
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.story_picker_toolbar_title), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new rgl0(5), 3), 14), cVar, objArr, objArr2, 14));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_settings_outline_28), new tlo0.f(R.string.picker_accessibility_settings), new bbb0(nwkVar, 25), null, null, com.vk.core.compose.component.semantics.b.a(null, new fyi0(3), 3), 24), null, 6));
        bwt0.i0(inflate.findViewById(R.id.action), new q9i0(cwsVar, 6));
        CollageOnboardingBannerView collageOnboardingBannerView = (CollageOnboardingBannerView) inflate.findViewById(R.id.onboarding_banner);
        if (collageOnboardingBannerView != null) {
            collageOnboardingBannerView.setupWithHint(HintId.STORIES_COLLAGE_ONBOARDING);
        }
        return a;
    }

    @Override // xsna.l5t
    public final void c(LinearLayout linearLayout) {
        linearLayout.findViewById(R.id.action).setVisibility(8);
    }

    @Override // xsna.l5t
    public final CustomSpinner d(Context context, LinearLayout linearLayout) {
        CustomSpinner customSpinner = (CustomSpinner) linearLayout.findViewById(R.id.spinner);
        h(customSpinner);
        return customSpinner;
    }

    @Override // xsna.l5t
    public final void h(CustomSpinner customSpinner) {
        customSpinner.setPopupBackgroundResource(R.drawable.story_picker_toolbar_spinner_popup_background);
        customSpinner.setBackgroundDrawable(null);
        bwt0.S(customSpinner, new h8m0(customSpinner, 0));
        customSpinner.setUseMaxWidthLogic(false);
    }
}
