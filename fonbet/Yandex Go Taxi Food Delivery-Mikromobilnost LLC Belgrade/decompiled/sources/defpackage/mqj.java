package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class mqj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DiscountsModalView b;

    public /* synthetic */ mqj(DiscountsModalView discountsModalView, int i) {
        this.a = i;
        this.b = discountsModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DiscountsModalView discountsModalView = this.b;
        switch (i) {
            case 0:
                DiscountsModalView.toolbarRequestAccessibilityFocus$lambda$0(discountsModalView);
                break;
            case 1:
                DiscountsModalView.initUi$lambda$0(discountsModalView);
                break;
            default:
                DiscountsModalView.initUi$lambda$1(discountsModalView);
                break;
        }
    }
}
