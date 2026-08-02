package defpackage;

import com.yandex.go.taxi.order.custom_tips_input.mvp.CustomTipsInputModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class cmf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CustomTipsInputModalView b;

    public /* synthetic */ cmf(CustomTipsInputModalView customTipsInputModalView, int i) {
        this.a = i;
        this.b = customTipsInputModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CustomTipsInputModalView customTipsInputModalView = this.b;
        switch (i) {
            case 0:
                customTipsInputModalView.confirmClicked();
                break;
            default:
                CustomTipsInputModalView.onAppearAnimationComplete$lambda$0(customTipsInputModalView);
                break;
        }
    }
}
