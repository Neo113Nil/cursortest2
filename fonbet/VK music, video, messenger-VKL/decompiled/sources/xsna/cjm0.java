package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.attachpicker.collages.CollageOnboardingBannerView;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;

/* compiled from: StoryTemplateGalleryToolbarConfigurator.kt */
/* loaded from: classes15.dex */
public final class cjm0 implements l5t {
    @Override // xsna.l5t
    public final LinearLayout b(Context context, p3h p3hVar, nwk nwkVar, cws cwsVar) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View inflate = LayoutInflater.from(context).inflate(R.layout.media_picker_stories_template_toolbar, a);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        vkTopBar.setBack(new VkTopBar.b(new i8m0(p3hVar, 1), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new euc0(context, 1), 3), 14));
        VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.story_template_picker_toolbar_title), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new rgl0(6), 3), 14);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(title, null, null, null, 14));
        bwt0.d0(inflate.findViewById(R.id.action), true);
        CollageOnboardingBannerView collageOnboardingBannerView = (CollageOnboardingBannerView) inflate.findViewById(R.id.onboarding_banner);
        if (collageOnboardingBannerView != null) {
            collageOnboardingBannerView.setupWithHint(HintId.STORIES_COLLAGE_ONBOARDING);
        }
        return a;
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
        bwt0.S(customSpinner, new h8m0(customSpinner, 1));
        customSpinner.setUseMaxWidthLogic(false);
    }

    @Override // xsna.l5t
    public final void c(LinearLayout linearLayout) {
    }
}
