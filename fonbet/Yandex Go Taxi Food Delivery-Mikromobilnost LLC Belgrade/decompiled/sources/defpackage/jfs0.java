package defpackage;

import com.yandex.plus.home.feature.webviews.internal.simple.SimpleWebViewLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class jfs0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimpleWebViewLayout b;

    public /* synthetic */ jfs0(SimpleWebViewLayout simpleWebViewLayout, int i) {
        this.a = i;
        this.b = simpleWebViewLayout;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 errorViewController_delegate$lambda$4$lambda$3;
        wu41 wu41Var;
        hfs0 webViewController_delegate$lambda$2;
        npu errorViewController_delegate$lambda$4;
        zy11 showWebViewContent$lambda$5;
        int i = this.a;
        SimpleWebViewLayout simpleWebViewLayout = this.b;
        switch (i) {
            case 0:
                errorViewController_delegate$lambda$4$lambda$3 = SimpleWebViewLayout.errorViewController_delegate$lambda$4$lambda$3(simpleWebViewLayout);
                return errorViewController_delegate$lambda$4$lambda$3;
            case 1:
                wu41Var = SimpleWebViewLayout.toolbarController_delegate$lambda$0(simpleWebViewLayout);
                return wu41Var;
            case 2:
                webViewController_delegate$lambda$2 = SimpleWebViewLayout.webViewController_delegate$lambda$2(simpleWebViewLayout);
                return webViewController_delegate$lambda$2;
            case 3:
                errorViewController_delegate$lambda$4 = SimpleWebViewLayout.errorViewController_delegate$lambda$4(simpleWebViewLayout);
                return errorViewController_delegate$lambda$4;
            default:
                showWebViewContent$lambda$5 = SimpleWebViewLayout.showWebViewContent$lambda$5(simpleWebViewLayout);
                return showWebViewContent$lambda$5;
        }
    }
}
