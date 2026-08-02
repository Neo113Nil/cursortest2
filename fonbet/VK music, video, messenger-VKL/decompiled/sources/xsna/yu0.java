package xsna;

import android.os.Bundle;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AdsBridgeAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final class yu0 implements wu0 {
    public final izs<Bundle, s3q0> a;
    public final bpn0 b = new bpn0(new xu0(0));

    /* JADX WARN: Multi-variable type inference failed */
    public yu0(izs<? super Bundle, s3q0> izsVar) {
        this.a = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wu0
    public final void a(VkBridgeAnalytics.BannerAdEvent bannerAdEvent, boolean z, h16 h16Var, BannerParamsSnapshot bannerParamsSnapshot, String str) {
        Set<Map.Entry<Integer, AdSlotSkipReason>> entrySet;
        ((lc0) this.b.getValue()).getClass();
        Bundle bundle = new Bundle();
        bundle.putString("stat_event_type_key", "banner_ad_event");
        bundle.putInt("banner_ad_event_key", bannerAdEvent.ordinal());
        bundle.putBoolean("has_ad_key", z);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map<Integer, AdSlotSkipReason> a = h16Var.a();
        if (a != null && (entrySet = a.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(entry.getKey());
                arrayList2.add(Integer.valueOf(((AdSlotSkipReason) entry.getValue()).ordinal()));
            }
        }
        bundle.putIntegerArrayList("skipped_slots_id_key", arrayList);
        bundle.putIntegerArrayList("skipped_reasons_key", arrayList2);
        Integer d = h16Var.d();
        if (d != null) {
            bundle.putInt("actual_slot_id_key", d.intValue());
        }
        Integer g = h16Var.g();
        if (g != null) {
            bundle.putInt("ad_source_key", g.intValue());
        }
        bundle.putParcelable("banner_params_key", bannerParamsSnapshot);
        bundle.putString("ad_request_id_key", str);
        this.a.invoke(bundle);
    }

    @Override // xsna.wu0
    public final void b(AdRequestEvent adRequestEvent) {
        ((lc0) this.b.getValue()).getClass();
        Bundle bundle = new Bundle();
        bundle.putString("stat_event_type_key", "ad_request_event");
        AdRequestEvent.AdFormat adFormat = adRequestEvent.a;
        if (adFormat != null) {
            bundle.putInt("ad_format_key", adFormat.ordinal());
        }
        bundle.putInt("event_type_key", adRequestEvent.c.ordinal());
        bundle.putInt("request_type_key", adRequestEvent.d.ordinal());
        bundle.putInt("request_subtype_key", adRequestEvent.e.ordinal());
        Integer num = adRequestEvent.h;
        if (num != null) {
            bundle.putInt("ad_source_key", num.intValue());
        }
        Integer num2 = adRequestEvent.i;
        if (num2 != null) {
            bundle.putInt("slot_id_key", num2.intValue());
        }
        Integer num3 = adRequestEvent.f;
        if (num3 != null) {
            bundle.putInt("error_code_key", num3.intValue());
        }
        bundle.putString("error_message_key", adRequestEvent.g);
        bundle.putString("ad_request_id_key", adRequestEvent.b);
        this.a.invoke(bundle);
    }
}
