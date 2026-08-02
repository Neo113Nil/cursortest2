package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.cxs;
import xsna.gi0;
import xsna.r31;
import xsna.ukk0;

/* compiled from: SplashAdShowRequest.kt */
/* loaded from: classes6.dex */
public final class vkk0 implements cxs.a {
    public boolean a;
    public final /* synthetic */ ukk0 b;
    public final /* synthetic */ uh0 c;
    public final /* synthetic */ gi0.a d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ AdvertisementType f;
    public final /* synthetic */ long g;
    public final /* synthetic */ List<gi0.a> h;

    public vkk0(ukk0 ukk0Var, uh0 uh0Var, gi0.a aVar, Activity activity, AdvertisementType advertisementType, long j, List<gi0.a> list) {
        this.b = ukk0Var;
        this.c = uh0Var;
        this.d = aVar;
        this.e = activity;
        this.f = advertisementType;
        this.g = j;
        this.h = list;
    }

    public static void f(r31 r31Var, gi0.a aVar) {
        r31Var.c = Integer.valueOf(aVar.a);
        r31Var.d = aVar.c;
        r31Var.e = Integer.valueOf(aVar.d);
    }

    @Override // xsna.cxs.a
    public final void a() {
        String str = (String) this.c.b;
        ukk0 ukk0Var = this.b;
        ukk0.a aVar = ukk0Var.d;
        r31 r31Var = aVar.a;
        gi0.a aVar2 = this.d;
        int i = aVar2.a;
        r31Var.g = new r31.a(r31Var.b, aVar2.c, Integer.valueOf(aVar2.d), Integer.valueOf(i), (LinkedHashMap) r31Var.h());
        AdvertisementType advertisementType = AdvertisementType.REWARD;
        AdvertisementType advertisementType2 = this.f;
        if (advertisementType2 == advertisementType) {
            ukk0Var.f = false;
            return;
        }
        aVar.b.d(str, new ei0(aVar2), AdRequestPurpose.SHOW_INSTANCE);
        f(aVar.a, aVar2);
        ukk0Var.a.c(advertisementType2, str);
    }

    @Override // xsna.cxs.a
    public final void b(cxs.b bVar) {
        this.a = true;
    }

    @Override // xsna.cxs.a
    public final void c(j11 j11Var) {
        ukk0 ukk0Var = this.b;
        vh0 vh0Var = ukk0Var.d.b;
        String str = (String) this.c.b;
        vh0.c(vh0Var, str, new ei0(this.d), j11Var);
        x19.O(xgx0.a, "Fullscreen ad display error: " + j11Var.b);
        ukk0Var.a.b(this.f, j11Var, str);
    }

    @Override // xsna.cxs.a
    public final void d(j11 j11Var) {
        ukk0 ukk0Var = this.b;
        ukk0.a aVar = ukk0Var.d;
        vh0 vh0Var = aVar.b;
        uh0 uh0Var = this.c;
        String str = (String) uh0Var.b;
        gi0.a aVar2 = this.d;
        vh0Var.b(str, new ei0(aVar2), (AdRequestPurpose) uh0Var.a, j11Var);
        r31 r31Var = aVar.a;
        Pair pair = new Pair(Integer.valueOf(aVar2.a), new hi0(this.f, AdSlotSkipReason.NETWORK_NO_AD));
        Map map = r31Var.f;
        if (map == null) {
            map = jgp.b;
        }
        r31Var.f = pn00.o(map, pair);
        ukk0Var.a(uh0Var, this.e, this.g, j5g.S(this.h, 1), j11Var);
    }

    @Override // xsna.cxs.a
    public final void e(cxs cxsVar) {
        int i;
        List<AdvertisementConfig.ConfigItem> a;
        AdvertisementConfig.SlotConfig g;
        ukk0 ukk0Var = this.b;
        vh0 vh0Var = ukk0Var.d.b;
        uh0 uh0Var = this.c;
        String str = (String) uh0Var.b;
        gi0.a aVar = this.d;
        vh0Var.a(str, new ei0(aVar), (AdRequestPurpose) uh0Var.a);
        int i2 = aVar.d;
        gnl gnlVar = e370.m;
        Object obj = null;
        if (gnlVar == null) {
            gnlVar = null;
        }
        com.vk.superapp.advertisement.b f = gnlVar.a().f();
        AdvertisementConfig v = f.v();
        if (v != null && (a = v.a()) != null) {
            Iterator<T> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((AdvertisementConfig.ConfigItem) next).c() == i2) {
                    obj = next;
                    break;
                }
            }
            AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
            if (configItem != null && (g = configItem.g()) != null) {
                i = g.b();
                f.u().c(this.f, this.g, i);
                cxsVar.b(ukk0Var.e);
                cxsVar.show(this.e);
            }
        }
        i = 0;
        f.u().c(this.f, this.g, i);
        cxsVar.b(ukk0Var.e);
        cxsVar.show(this.e);
    }

    @Override // xsna.cxs.a
    public final void onClick() {
        this.b.a.g((String) this.c.b);
    }

    @Override // xsna.cxs.a
    public final void onCompleted() {
        String str = (String) this.c.b;
        ukk0 ukk0Var = this.b;
        ukk0.a aVar = ukk0Var.d;
        AdvertisementType advertisementType = AdvertisementType.REWARD;
        AdvertisementType advertisementType2 = this.f;
        if (advertisementType2 == advertisementType) {
            vh0 vh0Var = aVar.b;
            gi0.a aVar2 = this.d;
            vh0Var.d(str, new ei0(aVar2), AdRequestPurpose.SHOW_INSTANCE);
            f(aVar.a, aVar2);
            ukk0Var.a.c(advertisementType2, str);
            ukk0Var.f = true;
        }
    }

    @Override // xsna.cxs.a
    public final void onDismiss() {
        ukk0 ukk0Var = this.b;
        ukk0.a aVar = ukk0Var.d;
        vh0 vh0Var = aVar.b;
        boolean z = this.a;
        uh0 uh0Var = this.c;
        String str = (String) uh0Var.b;
        gi0.a aVar2 = this.d;
        vh0Var.f(z, str, new ei0(aVar2), null);
        AdvertisementType advertisementType = AdvertisementType.REWARD;
        AdvertisementType advertisementType2 = this.f;
        if (advertisementType2 != advertisementType || ukk0Var.f) {
            return;
        }
        f(aVar.a, aVar2);
        tkk0 tkk0Var = ukk0Var.a;
        String str2 = (String) uh0Var.b;
        ncg ncgVar = tkk0Var.b;
        r31 r31Var = tkk0Var.a;
        Integer num = r31Var.c;
        Integer num2 = r31Var.e;
        try {
            VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) ncgVar.invoke();
            if (vkBridgeAnalytics != null) {
                JsMethod.MethodScope methodScope = JsMethod.MethodScope.INTERNAL;
                vkBridgeAnalytics.e(true, r31Var, VkBridgeAnalytics.NativeAdEventType.HIDE_BY_USER);
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (Throwable unused) {
        }
        r31Var.i();
        AdRequestEvent.AdFormat a = in00.a(advertisementType2);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.REQUEST;
        AdRequestEvent.RequestType requestType = AdRequestEvent.RequestType.SPLASH;
        AdRequestEvent.RequestSubtype requestSubtype = AdRequestEvent.RequestSubtype.SHOW;
        VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) ncgVar.invoke();
        if (vkBridgeAnalytics2 != null) {
            vkBridgeAnalytics2.b(new AdRequestEvent(a, str2, eventType, requestType, requestSubtype, 401, "Ad closed before impression", num2, num, null, null));
        }
    }
}
