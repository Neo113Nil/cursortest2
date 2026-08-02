package defpackage;

import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;

/* loaded from: classes8.dex */
public final /* synthetic */ class nks implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullscreenSuperappSuggestModalView b;

    public /* synthetic */ nks(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, int i) {
        this.a = i;
        this.b = fullscreenSuperappSuggestModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String cartsDeeplink_delegate$lambda$0;
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = this.a;
        FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = this.b;
        switch (i) {
            case 0:
                cartsDeeplink_delegate$lambda$0 = FullscreenSuperappSuggestModalView.cartsDeeplink_delegate$lambda$0(fullscreenSuperappSuggestModalView);
                return cartsDeeplink_delegate$lambda$0;
            case 1:
                zy11Var = FullscreenSuperappSuggestModalView.setupFloatingInputField$lambda$0(fullscreenSuperappSuggestModalView);
                return zy11Var;
            default:
                zy11Var2 = FullscreenSuperappSuggestModalView.setupFloatingInputField$lambda$1$0(fullscreenSuperappSuggestModalView);
                return zy11Var2;
        }
    }
}
