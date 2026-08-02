package defpackage;

import com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebJsApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class gvl0 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafetyCenterWebJsApi b;

    public /* synthetic */ gvl0(SafetyCenterWebJsApi safetyCenterWebJsApi, int i) {
        this.a = i;
        this.b = safetyCenterWebJsApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        SafetyCenterWebJsApi safetyCenterWebJsApi = this.b;
        switch (i) {
            case 0:
                safetyCenterWebJsApi.showEmailInput(str, strArr);
                break;
            case 1:
                safetyCenterWebJsApi.showPhotoInput(str, strArr);
                break;
            case 2:
                safetyCenterWebJsApi.showChooseContacts(str, strArr);
                break;
            case 3:
                safetyCenterWebJsApi.forceUpdate(str, strArr);
                break;
            case 4:
                safetyCenterWebJsApi.requestHide(str, strArr);
                break;
            case 5:
                safetyCenterWebJsApi.sendAnalyticsEvent(str, strArr);
                break;
            case 6:
                safetyCenterWebJsApi.showSupport(str, strArr);
                break;
            case 7:
                safetyCenterWebJsApi.showStory(str, strArr);
                break;
            case 8:
                safetyCenterWebJsApi.shareUrl(str, strArr);
                break;
            case 9:
                safetyCenterWebJsApi.showEmergencyCall(str, strArr);
                break;
            case 10:
                safetyCenterWebJsApi.showFallbackScreen(str, strArr);
                break;
            default:
                safetyCenterWebJsApi.webViewReadyCallback(str, strArr);
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
            case 7:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 9:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 10:
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
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "showEmailInput", "showEmailInput(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "showPhotoInput", "showPhotoInput(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "showChooseContacts", "showChooseContacts(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "forceUpdate", "forceUpdate(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "requestHide", "requestHide(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 5:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 6:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "showSupport", "showSupport(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 7:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "showStory", "showStory(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 8:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "shareUrl", "shareUrl(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 9:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "showEmergencyCall", "showEmergencyCall(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 10:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "showFallbackScreen", "showFallbackScreen(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, SafetyCenterWebJsApi.class, "webViewReadyCallback", "webViewReadyCallback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
