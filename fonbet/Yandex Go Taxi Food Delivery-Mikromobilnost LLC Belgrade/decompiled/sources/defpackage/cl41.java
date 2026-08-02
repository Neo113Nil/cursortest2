package defpackage;

import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;

/* loaded from: classes2.dex */
public final /* synthetic */ class cl41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebStoriesView b;

    public /* synthetic */ cl41(WebStoriesView webStoriesView, int i) {
        this.a = i;
        this.b = webStoriesView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        aou0 webViewController_delegate$lambda$2;
        fn acqSdkButtonSectionContainerViewController_delegate$lambda$3;
        qs90 hostPayAnimationController_delegate$lambda$5;
        npu errorViewController_delegate$lambda$6;
        zy11 showContent$lambda$8;
        String str;
        int i = this.a;
        WebStoriesView webStoriesView = this.b;
        switch (i) {
            case 0:
                webViewController_delegate$lambda$2 = WebStoriesView.webViewController_delegate$lambda$2(webStoriesView);
                return webViewController_delegate$lambda$2;
            case 1:
                acqSdkButtonSectionContainerViewController_delegate$lambda$3 = WebStoriesView.acqSdkButtonSectionContainerViewController_delegate$lambda$3(webStoriesView);
                return acqSdkButtonSectionContainerViewController_delegate$lambda$3;
            case 2:
                hostPayAnimationController_delegate$lambda$5 = WebStoriesView.hostPayAnimationController_delegate$lambda$5(webStoriesView);
                return hostPayAnimationController_delegate$lambda$5;
            case 3:
                errorViewController_delegate$lambda$6 = WebStoriesView.errorViewController_delegate$lambda$6(webStoriesView);
                return errorViewController_delegate$lambda$6;
            case 4:
                showContent$lambda$8 = WebStoriesView.showContent$lambda$8(webStoriesView);
                return showContent$lambda$8;
            default:
                str = webStoriesView.storiesData;
                return str;
        }
    }
}
