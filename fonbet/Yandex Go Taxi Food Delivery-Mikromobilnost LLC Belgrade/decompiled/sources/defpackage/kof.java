package defpackage;

import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.divkit.bind.DKButtonLoadingAnimatedView;
import com.yandex.payment.divkit.bind.view.DKCardContainer;
import com.yandex.payment.divkit.challenger.DKChallengerInputView;
import com.yandex.payment.divkit.select.DkCvvInputView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes2.dex */
public final class kof implements plk {
    public final unf b;
    public final iu31 c;
    public final rwo d;

    public kof(unf unfVar, iu31 iu31Var, rwo rwoVar) {
        this.b = unfVar;
        this.c = iu31Var;
        this.d = rwoVar;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DkCvvInputView) {
                this.b.a.invoke((qwl) childAt);
                ((DkCvvInputView) childAt).focusInput();
            } else {
                boolean z = childAt instanceof DKCardContainer;
                iu31 iu31Var = this.c;
                if (z) {
                    iu31Var.a.invoke((ViewGroup) childAt);
                } else if (childAt instanceof DKButtonLoadingAnimatedView) {
                    iu31Var.a.invoke((ViewGroup) childAt);
                } else if (childAt instanceof DKChallengerInputView) {
                    iu31Var.a.invoke((ViewGroup) childAt);
                    ((DKChallengerInputView) childAt).focusInput();
                }
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        FrameLayout frameLayout = new FrameLayout(div2View.getContext());
        String str = clkVar.j;
        switch (str.hashCode()) {
            case -2004438503:
                if (str.equals("spinner")) {
                    View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(ulh0.paymentsdk_dk_progress_layout, (ViewGroup) frameLayout, false);
                    int i = l9h0.progress_bar;
                    if (((ProgressBar) cma1.O(i, inflate)) != null) {
                        frameLayout.addView((LinearLayout) inflate);
                        return frameLayout;
                    }
                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                    return null;
                }
                return frameLayout;
            case -485753505:
                if (str.equals("cvv_confirm_fragment_cvv_input_type")) {
                    DkCvvInputView dkCvvInputView = new DkCvvInputView(div2View.getContext(), null, 0, 6, null);
                    dkCvvInputView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    dkCvvInputView.setEventReporter(this.d);
                    frameLayout.addView(dkCvvInputView);
                    return frameLayout;
                }
                return frameLayout;
            case 945008251:
                if (str.equals("blur_animated")) {
                    frameLayout.addView(new DKButtonLoadingAnimatedView(div2View.getContext(), null, 2, null));
                    return frameLayout;
                }
                return frameLayout;
            case 983673307:
                if (str.equals("card_input")) {
                    DKCardContainer dKCardContainer = new DKCardContainer(frameLayout.getContext(), null, 2, null);
                    dKCardContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    frameLayout.addView(dKCardContainer);
                    frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return frameLayout;
                }
                return frameLayout;
            case 1525678537:
                if (str.equals("apply_button_progress")) {
                    View inflate2 = LayoutInflater.from(frameLayout.getContext()).inflate(ulh0.paymentsdk_progress_layout, (ViewGroup) frameLayout, false);
                    if (inflate2 == null) {
                        ny61.t("rootView");
                        return null;
                    }
                    ProgressBar progressBar = (ProgressBar) inflate2;
                    progressBar.setIndeterminateTintList(ColorStateList.valueOf(i891.h(frameLayout.getContext().getTheme(), ong0.paymentsdk_is_light_theme, true) ? -1 : ModalContentViewContainer.BASE_SHADOW_COLOR));
                    frameLayout.addView(progressBar);
                    return frameLayout;
                }
                return frameLayout;
            case 1997126686:
                if (str.equals("challengerTextField")) {
                    DKChallengerInputView dKChallengerInputView = new DKChallengerInputView(frameLayout.getContext(), null, 0, 6, null);
                    dKChallengerInputView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    frameLayout.addView(dKChallengerInputView);
                    return frameLayout;
                }
                return frameLayout;
            default:
                return frameLayout;
        }
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return str.equals("cvv_confirm_fragment_cvv_input_type") || str.equals("apply_button_progress") || str.equals("card_input") || str.equals("blur_animated") || str.equals("spinner") || str.equals("challengerTextField");
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
