package defpackage;

import com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class px9 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChargersDvizhSubscriptionJsApi b;

    public /* synthetic */ px9(ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi, int i) {
        this.a = i;
        this.b = chargersDvizhSubscriptionJsApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi = this.b;
        switch (i) {
            case 0:
                chargersDvizhSubscriptionJsApi.forceUpdate(str, strArr);
                break;
            case 1:
                chargersDvizhSubscriptionJsApi.sendAnalyticsEvent(str, strArr);
                break;
            case 2:
                chargersDvizhSubscriptionJsApi.showStories(str, strArr);
                break;
            default:
                chargersDvizhSubscriptionJsApi.showPlus(str, strArr);
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
                return new FunctionReferenceImpl(2, this.b, ChargersDvizhSubscriptionJsApi.class, "forceUpdate", "forceUpdate(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, ChargersDvizhSubscriptionJsApi.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, ChargersDvizhSubscriptionJsApi.class, "showStories", "showStories(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, ChargersDvizhSubscriptionJsApi.class, "showPlus", "showPlus(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
