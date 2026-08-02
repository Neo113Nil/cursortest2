package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vkontakte.android.R;
import xsna.fgt0;

/* compiled from: VideoSettingsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ggt0 extends s770 {
    public final /* synthetic */ fgt0 c;

    public ggt0(fgt0 fgt0Var) {
        this.c = fgt0Var;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        TextView textView;
        fgt0.b bVar = (fgt0.b) obj;
        CharSequence charSequence = bVar.b;
        ViewGroup viewGroup = (ViewGroup) hkpVar.f(R.id.action_content);
        boolean z = bVar.c;
        viewGroup.setEnabled(z);
        TextView textView2 = (TextView) hkpVar.f(R.id.action_title);
        fgt0.a aVar = bVar.a;
        textView2.setText(aVar.i());
        textView2.setAlpha(z ? 1.0f : 0.4f);
        boolean z2 = bVar.d;
        fgt0 fgt0Var = this.c;
        if (z2) {
            k640 d = fgt0Var.d();
            int i2 = aVar.i();
            d.getClass();
            l640.a.getClass();
            if (viewGroup instanceof ConstraintLayout) {
                ViewGroup viewGroup2 = viewGroup;
                while (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                    ViewParent parent = viewGroup2.getParent();
                    viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) constraintLayout.findViewWithTag("video_multitrack_highlighter");
                if (vkOnboardingHighlighter == null) {
                    TextView textView3 = (TextView) constraintLayout.findViewById(R.id.action_title);
                    if (textView3 == null) {
                        vkOnboardingHighlighter = null;
                    } else {
                        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                        int indexOfChild = constraintLayout.indexOfChild(textView3);
                        constraintLayout.removeView(textView3);
                        VkOnboardingHighlighter vkOnboardingHighlighter2 = new VkOnboardingHighlighter(constraintLayout.getContext(), null, 6);
                        vkOnboardingHighlighter2.setHighlighterType(VkOnboarding$HighlighterMarkerType.Type1);
                        vkOnboardingHighlighter2.setTag("video_multitrack_highlighter");
                        vkOnboardingHighlighter2.setHighlighterColor(VkOnboarding$TintColor.Azure);
                        vkOnboardingHighlighter2.setClipChildren(false);
                        vkOnboardingHighlighter2.setClipToPadding(false);
                        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        vkOnboardingHighlighter2.addView(textView3);
                        constraintLayout.addView(vkOnboardingHighlighter2, indexOfChild, layoutParams);
                        vkOnboardingHighlighter = vkOnboardingHighlighter2;
                    }
                }
                if (vkOnboardingHighlighter != null) {
                    View childAt = vkOnboardingHighlighter.getChildAt(0);
                    textView = childAt instanceof TextView ? (TextView) childAt : null;
                    if (textView != null) {
                        textView.post(new rih(textView, constraintLayout.getContext().getString(R.string.onboarding_higlighted_text, constraintLayout.getContext().getString(i2)), vkOnboardingHighlighter, 1));
                    }
                }
            }
        } else {
            fgt0Var.d().getClass();
            l640.a.getClass();
            if (viewGroup instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewGroup;
                VkOnboardingHighlighter vkOnboardingHighlighter3 = (VkOnboardingHighlighter) constraintLayout2.findViewWithTag("video_multitrack_highlighter");
                if (vkOnboardingHighlighter3 != null) {
                    View childAt2 = vkOnboardingHighlighter3.getChildAt(0);
                    textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
                    if (textView == null) {
                        constraintLayout2.removeView(vkOnboardingHighlighter3);
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = vkOnboardingHighlighter3.getLayoutParams();
                        int indexOfChild2 = constraintLayout2.indexOfChild(vkOnboardingHighlighter3);
                        vkOnboardingHighlighter3.c(false);
                        vkOnboardingHighlighter3.removeView(textView);
                        constraintLayout2.removeView(vkOnboardingHighlighter3);
                        textView.setLayoutParams(layoutParams2);
                        constraintLayout2.addView(textView, indexOfChild2);
                    }
                }
            }
        }
        TextView textView4 = (TextView) hkpVar.f(R.id.action_subtitle);
        if (charSequence.length() == 0) {
            textView4.setVisibility(8);
        } else {
            textView4.setText(charSequence);
            textView4.setVisibility(0);
            textView4.setAlpha(z ? 1.0f : 0.4f);
        }
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(aVar.h());
        imageView.setAlpha(z ? 1.0f : 0.4f);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_content));
        hkpVar.d(view.findViewById(R.id.action_title));
        hkpVar.d(view.findViewById(R.id.action_subtitle));
        View findViewById = view.findViewById(R.id.action_icon);
        ((ImageView) findViewById).setColorFilter(dhr0.Y(R.attr.vk_ui_icon_accent_themed, view.getContext()));
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
