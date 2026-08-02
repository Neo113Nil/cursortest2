package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.proxy.ProxyProvisionNativeApi;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkJsNativeApi;

/* loaded from: classes6.dex */
public final /* synthetic */ class kxf0 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kxf0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ProxyProvisionNativeApi) obj).handleGetEndpointDescription(str, strArr);
                break;
            case 1:
                ((WebViewFromDeeplinkJsNativeApi) obj).shareText(str, strArr);
                break;
            default:
                ((wls) obj).invoke(str, strArr);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(2, (ProxyProvisionNativeApi) obj, ProxyProvisionNativeApi.class, "handleGetEndpointDescription", "handleGetEndpointDescription(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, (WebViewFromDeeplinkJsNativeApi) obj, WebViewFromDeeplinkJsNativeApi.class, "shareText", "shareText(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return (wls) obj;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
