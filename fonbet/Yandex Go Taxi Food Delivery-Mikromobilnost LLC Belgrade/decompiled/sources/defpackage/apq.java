package defpackage;

import com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button.FeedOnboardingButton;

/* loaded from: classes12.dex */
public final /* synthetic */ class apq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedOnboardingButton b;

    public /* synthetic */ apq(FeedOnboardingButton feedOnboardingButton, int i) {
        this.a = i;
        this.b = feedOnboardingButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FeedOnboardingButton feedOnboardingButton = this.b;
        switch (i) {
            case 0:
                feedOnboardingButton.setVisibility(4);
                break;
            default:
                FeedOnboardingButton.setIconAndShow$lambda$0(feedOnboardingButton);
                break;
        }
    }
}
