package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import xsna.lc0;

/* compiled from: AdsBundleAnalyticsDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class cv0 implements zu0 {
    public final x9l0 a;
    public final bpn0 b = new bpn0(new bv0(0));

    public cv0(x9l0 x9l0Var) {
        this.a = x9l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e5  */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    @Override // xsna.zu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Bundle bundle) {
        lc0.a cVar;
        boolean z;
        Integer num;
        String str;
        ?? r12;
        Parcelable parcelable;
        Object parcelable2;
        ((lc0) this.b.getValue()).getClass();
        String string = bundle.getString("stat_event_type_key");
        if (string != null) {
            int hashCode = string.hashCode();
            int i = 0;
            if (hashCode != -896023090) {
                if (hashCode == 2228017 && string.equals("banner_ad_event")) {
                    VkBridgeAnalytics.BannerAdEvent bannerAdEvent = (VkBridgeAnalytics.BannerAdEvent) rl3.S(bundle.getInt("banner_ad_event_key", -1), VkBridgeAnalytics.BannerAdEvent.h().toArray(new VkBridgeAnalytics.BannerAdEvent[0]));
                    if (bannerAdEvent == null) {
                        cVar = new lc0.a.c();
                    } else {
                        boolean z2 = bundle.getBoolean("has_ad_key");
                        List integerArrayList = bundle.getIntegerArrayList("skipped_slots_id_key");
                        if (integerArrayList == null) {
                            integerArrayList = EmptyList.b;
                        }
                        AdSlotSkipReason[] adSlotSkipReasonArr = (AdSlotSkipReason[]) AdSlotSkipReason.h().toArray(new AdSlotSkipReason[0]);
                        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("skipped_reasons_key");
                        if (integerArrayList2 != null) {
                            r12 = new ArrayList();
                            Iterator it = integerArrayList2.iterator();
                            while (it.hasNext()) {
                                AdSlotSkipReason adSlotSkipReason = (AdSlotSkipReason) rl3.S(((Integer) it.next()).intValue(), adSlotSkipReasonArr);
                                if (adSlotSkipReason != null) {
                                    r12.add(adSlotSkipReason);
                                }
                            }
                        } else {
                            r12 = EmptyList.b;
                        }
                        MapBuilder mapBuilder = new MapBuilder();
                        int size = integerArrayList.size();
                        while (i < size) {
                            mapBuilder.put(integerArrayList.get(i), (i < 0 || i >= r12.size()) ? AdSlotSkipReason.NETWORK_ERROR : r12.get(i));
                            i++;
                        }
                        mc0 mc0Var = new mc0(bo8.d(bundle, "actual_slot_id_key"), bo8.d(bundle, "ad_source_key"), mapBuilder.h());
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable2 = bundle.getParcelable("banner_params_key", BannerParamsSnapshot.class);
                            parcelable = (Parcelable) parcelable2;
                        } else {
                            Parcelable parcelable3 = bundle.getParcelable("banner_params_key");
                            parcelable = (BannerParamsSnapshot) (parcelable3 instanceof BannerParamsSnapshot ? parcelable3 : null);
                        }
                        cVar = new lc0.a.C3259a(bannerAdEvent, z2, mc0Var, (BannerParamsSnapshot) parcelable, bundle.getString("ad_request_id_key"));
                    }
                }
            } else if (string.equals("ad_request_event")) {
                AdRequestEvent.EventType eventType = (AdRequestEvent.EventType) rl3.S(bundle.getInt("event_type_key", -1), AdRequestEvent.EventType.h().toArray(new AdRequestEvent.EventType[0]));
                if (eventType == null) {
                    cVar = new lc0.a.c();
                } else {
                    AdRequestEvent.RequestType requestType = (AdRequestEvent.RequestType) rl3.S(bundle.getInt("request_type_key", -1), AdRequestEvent.RequestType.h().toArray(new AdRequestEvent.RequestType[0]));
                    if (requestType == null) {
                        cVar = new lc0.a.c();
                    } else {
                        AdRequestEvent.RequestSubtype requestSubtype = (AdRequestEvent.RequestSubtype) rl3.S(bundle.getInt("request_subtype_key", -1), AdRequestEvent.RequestSubtype.h().toArray(new AdRequestEvent.RequestSubtype[0]));
                        if (requestSubtype == null) {
                            cVar = new lc0.a.c();
                        } else {
                            Integer d = bo8.d(bundle, "error_code_key");
                            String string2 = bundle.getString("error_message_key");
                            if (string2 == null) {
                                string2 = "";
                            }
                            Integer d2 = bo8.d(bundle, "ad_source_key");
                            Integer d3 = bo8.d(bundle, "slot_id_key");
                            AdRequestEvent.AdFormat adFormat = (AdRequestEvent.AdFormat) rl3.S(bundle.getInt("ad_format_key", -1), AdRequestEvent.AdFormat.h().toArray(new AdRequestEvent.AdFormat[0]));
                            String string3 = bundle.getString("ad_request_id_key");
                            if (d != null) {
                                num = d;
                                str = string2;
                            } else {
                                num = null;
                                str = null;
                            }
                            cVar = new lc0.a.b(new AdRequestEvent(adFormat, string3, eventType, requestType, requestSubtype, num, str, d2, d3, null, null));
                        }
                    }
                }
            }
            z = cVar instanceof lc0.a.C3259a;
            x9l0 x9l0Var = this.a;
            if (!z) {
                VkBridgeAnalytics vkBridgeAnalytics = (VkBridgeAnalytics) x9l0Var.invoke();
                if (vkBridgeAnalytics != null) {
                    lc0.a.C3259a c3259a = (lc0.a.C3259a) cVar;
                    vkBridgeAnalytics.a(c3259a.a, c3259a.b, c3259a.c, c3259a.d, c3259a.e);
                    return;
                }
                return;
            }
            if (!(cVar instanceof lc0.a.b)) {
                if (!(cVar instanceof lc0.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                VkBridgeAnalytics vkBridgeAnalytics2 = (VkBridgeAnalytics) x9l0Var.invoke();
                if (vkBridgeAnalytics2 != null) {
                    vkBridgeAnalytics2.b(((lc0.a.b) cVar).a);
                    return;
                }
                return;
            }
        }
        cVar = new lc0.a.c();
        z = cVar instanceof lc0.a.C3259a;
        x9l0 x9l0Var2 = this.a;
        if (!z) {
        }
    }
}
