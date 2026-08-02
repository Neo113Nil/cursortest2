package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;

/* compiled from: ShareToStoryViewHolderDelegate.kt */
/* loaded from: classes2.dex */
public final class l9j0 implements cpj0 {
    public final h7v b;
    public View c;

    public l9j0(h7v h7vVar) {
        this.b = h7vVar;
    }

    @Override // xsna.cpj0
    public final void a(ViewGroup viewGroup, brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.im_share_to_story_action_view, viewGroup, true);
        HintId hintId = HintId.STORIES_SHARING_FROM_IM;
        h7v h7vVar = this.b;
        boolean m = h7vVar.m(hintId);
        VkText vkText = (VkText) inflate.findViewById(R.id.text);
        String obj = vkText.getText().toString();
        if (m) {
            vkText.setText("<u>" + obj + "</u>");
            VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) inflate.findViewById(R.id.highlighter);
            vkOnboardingHighlighter.setHighlightedTextColor(Integer.valueOf(dhr0.Y(dhr0.M() ? R.attr.vk_ui_text_contrast_themed : R.attr.vk_ui_text_primary, inflate.getContext())));
            vkOnboardingHighlighter.addOnLayoutChangeListener(new j9j0(vkText, vkOnboardingHighlighter));
            h7vVar.b(hintId.getId());
        }
        jjc.g(inflate, new mh4(26, izsVar, brj0Var));
        this.c = inflate;
        inflate.setContentDescription(obj);
    }

    @Override // xsna.cpj0
    public final void b() {
        View view = this.c;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.c = null;
    }
}
