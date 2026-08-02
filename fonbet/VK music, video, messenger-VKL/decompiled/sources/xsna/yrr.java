package xsna;

import android.app.Activity;
import com.vk.clips.design.view.floatingbutton.model.FloatingButtonAnalyticsEvent;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.y31;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yrr implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yrr(Ref$ObjectRef ref$ObjectRef, bsr bsrVar, xgq xgqVar, Activity activity, zgq zgqVar) {
        this.d = ref$ObjectRef;
        this.e = bsrVar;
        this.f = xgqVar;
        this.c = activity;
        this.g = zgqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        WebApiApplication v;
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                bsr bsrVar = (bsr) this.e;
                xgq xgqVar = (xgq) this.f;
                zgq zgqVar = (zgq) this.g;
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                lh3 lh3Var = bsrVar.a;
                if (lh3Var != null) {
                    lh3Var.b(xgqVar.a, FloatingButtonAnalyticsEvent.MODAL_CARD_CTA_BUTTON_CLICK);
                }
                bsrVar.c.invoke(this.c, zgqVar.d.a);
                break;
            default:
                n1y n1yVar = (n1y) this.d;
                WebAdConfig webAdConfig = (WebAdConfig) this.e;
                Long l = (Long) this.f;
                List<? extends AdvertisementType> list = (List) this.g;
                int i = webAdConfig.c;
                Activity activity = this.c;
                if (i == 622) {
                    n1yVar.e.e.a(activity, new kc4((byte) 0, 6));
                }
                if (!n1yVar.n) {
                    long longValue = l.longValue();
                    WebAdConfig e = webAdConfig.e();
                    boolean z = false;
                    boolean z2 = ((Boolean) n1yVar.g.getValue()).booleanValue() && e.f;
                    xwv0 xwv0Var = n1yVar.b;
                    if (xwv0Var != null && (v = xwv0Var.v()) != null && (!v.t || v.r)) {
                        z = true;
                    }
                    if (!z2) {
                        n1yVar.m(activity, longValue, list, webAdConfig);
                    } else if (z) {
                        j1y j1yVar = new j1y(longValue, activity, webAdConfig, list, n1yVar);
                        n1yVar = n1yVar;
                        r31 r31Var = new r31();
                        n1yVar.h().i(activity, longValue, e, new y31.d(r31Var, new tkk0(r31Var, new ncg(n1yVar, 29)), j1yVar));
                    } else {
                        wh0 d = n1yVar.d();
                        AdvertisementType advertisementType = AdvertisementType.INTERSTITIAL;
                        d.getClass();
                        AdRequestEvent.AdFormat a = in00.a(advertisementType);
                        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
                        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.SPLASH;
                        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
                        String concat = "App is not ready: ".concat("Game has install screen");
                        VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) d.a.invoke();
                        if (vkBridgeAnalytics != null) {
                            vkBridgeAnalytics.b(new AdRequestEvent(a, null, eventType, requestType, requestSubtype, 1312, concat, null, null, null, null));
                        }
                        n1yVar.m(activity, longValue, list, webAdConfig);
                    }
                    n1yVar.n = true;
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yrr(n1y n1yVar, WebAdConfig webAdConfig, Activity activity, Long l, List list) {
        this.d = n1yVar;
        this.e = webAdConfig;
        this.c = activity;
        this.f = l;
        this.g = list;
    }
}
