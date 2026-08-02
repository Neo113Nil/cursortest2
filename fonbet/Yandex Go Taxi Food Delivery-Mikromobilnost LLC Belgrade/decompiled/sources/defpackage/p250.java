package defpackage;

import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;

/* loaded from: classes5.dex */
public final /* synthetic */ class p250 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativeApi b;

    public /* synthetic */ p250(NativeApi nativeApi, int i) {
        this.a = i;
        this.b = nativeApi;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 handleDisableSwipe$lambda$0;
        zy11 handleOnWebViewReady$lambda$0;
        zy11 handleRequestHideWebView$lambda$0;
        zy11 handleEnableSwipe$lambda$0;
        int i = this.a;
        NativeApi nativeApi = this.b;
        switch (i) {
            case 0:
                handleDisableSwipe$lambda$0 = NativeApi.handleDisableSwipe$lambda$0(nativeApi);
                return handleDisableSwipe$lambda$0;
            case 1:
                handleOnWebViewReady$lambda$0 = NativeApi.handleOnWebViewReady$lambda$0(nativeApi);
                return handleOnWebViewReady$lambda$0;
            case 2:
                handleRequestHideWebView$lambda$0 = NativeApi.handleRequestHideWebView$lambda$0(nativeApi);
                return handleRequestHideWebView$lambda$0;
            default:
                handleEnableSwipe$lambda$0 = NativeApi.handleEnableSwipe$lambda$0(nativeApi);
                return handleEnableSwipe$lambda$0;
        }
    }
}
