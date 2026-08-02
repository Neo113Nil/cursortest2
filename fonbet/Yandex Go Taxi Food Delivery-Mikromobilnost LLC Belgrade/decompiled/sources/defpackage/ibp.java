package defpackage;

import com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class ibp implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ FamilyJsNativeApi b;

    public /* synthetic */ ibp(FamilyJsNativeApi familyJsNativeApi, int i) {
        this.a = i;
        this.b = familyJsNativeApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        FamilyJsNativeApi familyJsNativeApi = this.b;
        switch (i) {
            case 0:
                familyJsNativeApi.chooseContacts(str, strArr);
                break;
            case 1:
                familyJsNativeApi.createPostcard(str, strArr);
                break;
            case 2:
                familyJsNativeApi.webViewReadyCallback(str, strArr);
                break;
            case 3:
                familyJsNativeApi.requestHideWebView(str, strArr);
                break;
            case 4:
                familyJsNativeApi.sendAnalyticsEvent(str, strArr);
                break;
            case 5:
                familyJsNativeApi.forceUpdate(str, strArr);
                break;
            case 6:
                familyJsNativeApi.showLoading(str, strArr);
                break;
            default:
                familyJsNativeApi.hideLoading(str, strArr);
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
            case 2:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 6:
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
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "chooseContacts", "chooseContacts(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "createPostcard", "createPostcard(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "webViewReadyCallback", "webViewReadyCallback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "requestHideWebView", "requestHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 5:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "forceUpdate", "forceUpdate(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 6:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "showLoading", "showLoading(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, FamilyJsNativeApi.class, "hideLoading", "hideLoading(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
