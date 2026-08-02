package defpackage;

import com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class is21 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserProfileJsNativeApi b;

    public /* synthetic */ is21(UserProfileJsNativeApi userProfileJsNativeApi, int i) {
        this.a = i;
        this.b = userProfileJsNativeApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        UserProfileJsNativeApi userProfileJsNativeApi = this.b;
        switch (i) {
            case 0:
                userProfileJsNativeApi.getAvatarUrl(str, strArr);
                break;
            case 1:
                userProfileJsNativeApi.webViewReadyCallback(str, strArr);
                break;
            case 2:
                userProfileJsNativeApi.requestHideWebView(str, strArr);
                break;
            case 3:
                userProfileJsNativeApi.sendAnalyticsEvent(str, strArr);
                break;
            case 4:
                userProfileJsNativeApi.forceUpdate(str, strArr);
                break;
            case 5:
                userProfileJsNativeApi.generateHapticFeedback(str, strArr);
                break;
            default:
                userProfileJsNativeApi.showStory(str, strArr);
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
                return new FunctionReferenceImpl(2, this.b, UserProfileJsNativeApi.class, "getAvatarUrl", "getAvatarUrl(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, UserProfileJsNativeApi.class, "webViewReadyCallback", "webViewReadyCallback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, UserProfileJsNativeApi.class, "requestHideWebView", "requestHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, UserProfileJsNativeApi.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, this.b, UserProfileJsNativeApi.class, "forceUpdate", "forceUpdate(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 5:
                return new FunctionReferenceImpl(2, this.b, UserProfileJsNativeApi.class, "generateHapticFeedback", "generateHapticFeedback(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, UserProfileJsNativeApi.class, "showStory", "showStory(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
