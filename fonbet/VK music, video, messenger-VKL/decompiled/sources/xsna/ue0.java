package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.InstreamAd;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import one.video.ad.model.Advertisement;
import xsna.c8x;
import xsna.kd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ue0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ue0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        float f;
        switch (this.b) {
            case 0:
                ye0 ye0Var = (ye0) this.c;
                Advertisement advertisement = (Advertisement) this.d;
                long j = advertisement.c;
                int i2 = advertisement.b;
                d8x d8xVar = (d8x) this.e;
                e8x e8xVar = (e8x) this.f;
                c8x.c cVar = (c8x.c) this.g;
                String str = (String) obj;
                Context context = ye0Var.a;
                ze0 ze0Var = ye0Var.g;
                InstreamAd instreamAd = ze0Var.a;
                od0 od0Var = ze0Var.b;
                boolean z = ((Boolean) ye0Var.o.getValue()).booleanValue() && dmx0.i.get() && dmx0.c();
                if (drm0.N(str)) {
                    str = null;
                }
                kd0.b a = od0Var.a();
                c8x c8xVar = str == null ? a == null ? new c8x(i2, new mnh0(), context) : new c8x(i2, a, context) : a == null ? new c8x(str, new mnh0(), context) : new c8x(str, a, context);
                c8xVar.f(d8xVar);
                if (e8xVar != null) {
                    c8xVar.k = e8xVar;
                    p7z0 p7z0Var = c8xVar.i;
                    if (p7z0Var != null) {
                        n0z0 n0z0Var = p7z0Var.e;
                        n0z0Var.b = e8xVar;
                        e8xVar.f(n0z0Var);
                    }
                }
                u6z0 u6z0Var = c8xVar.a;
                u6z0Var.d = 360;
                float[] fArr = advertisement.h;
                if (j == 0) {
                    float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (fArr != null) {
                        i = 360;
                        for (float f3 : fArr) {
                            if (f2 < f3) {
                                f2 = f3;
                            }
                        }
                    } else {
                        i = 360;
                    }
                    f = f2 + 1.0f;
                } else {
                    i = 360;
                    f = j;
                }
                c8xVar.e(f);
                qnk qnkVar = u6z0Var.a;
                vua0 vua0Var = new vua0();
                int i3 = advertisement.d;
                String str2 = advertisement.g;
                qnkVar.g("_SITEZONE", String.valueOf(i3));
                String str3 = advertisement.f;
                if (!TextUtils.isEmpty(str3) && !str3.equals("0")) {
                    qnkVar.g("genre", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    qnkVar.g("tc", str2);
                }
                qnkVar.g("content_id", advertisement.e);
                qnkVar.g("duration", String.valueOf(j));
                int i4 = advertisement.i;
                if (i4 > 0) {
                    qnkVar.g("exp_id", String.valueOf(i4));
                }
                if (fArr != null && fArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (float f4 : fArr) {
                        if (sb.length() > 0) {
                            sb.append(',');
                        }
                        sb.append((int) f4);
                    }
                    qnkVar.g("midrollPoints", sb.toString());
                }
                qnkVar.g("stream", String.valueOf(0));
                qnkVar.g("videoQuality", String.valueOf(i));
                Objects.toString(vua0Var);
                for (Map.Entry<String, String> entry : instreamAd.d.entrySet()) {
                    qnkVar.g(entry.getKey(), entry.getValue());
                }
                if (fxc0.B().i().h()) {
                    qnkVar.g("preview", "1");
                }
                String i5 = fxc0.B().i().i();
                if (!drm0.N(i5)) {
                    qnkVar.g("creativeType", i5);
                }
                if (z) {
                    qnkVar.g("is_whitelist_internet", "1");
                }
                ye0Var.i = c8xVar;
                int i6 = instreamAd.g;
                if (i6 < 5) {
                    gu8.c(null, "InstreamAd: Unable to set ad loading timeout < 5, set to 5 seconds");
                    c8xVar.m = 5;
                } else {
                    gu8.c(null, "InstreamAd: Ad loading timeout set to " + i6 + " seconds");
                    c8xVar.m = i6;
                }
                p7z0 p7z0Var2 = c8xVar.i;
                if (p7z0Var2 != null) {
                    p7z0Var2.u = c8xVar.m;
                }
                c8xVar.l = cVar;
                if (c8xVar.c.compareAndSet(false, true)) {
                    String str4 = c8xVar.d;
                    String str5 = c8xVar.g;
                    udz0 udz0Var = str5 != null ? new udz0(str4, UUID.randomUUID().toString(), -1, 2, 1, v5z0.a) : new udz0(str4, null, Integer.valueOf(u6z0Var.g), 2, 0, v5z0.a);
                    u6z0Var.b(udz0Var);
                    udz0Var.c(0);
                    s3z0 a2 = c8xVar.b.a();
                    w8z0 w8z0Var = str5 != null ? new w8z0(null, c8xVar.a, c8xVar.b, 1, str5) : new w8z0(null, c8xVar.a, c8xVar.b, c8xVar.m, null);
                    w8z0Var.d = new gv(c8xVar, 25);
                    w8z0Var.e(a2, c8xVar.e);
                } else {
                    gu8.c(null, "InstreamAd: Doesn't support multiple load");
                    u6z0Var.j.a(0, 0, 1, null, null);
                    c8xVar.c(null, xla.a(iaz0.t));
                }
                break;
            default:
                List list = (List) this.c;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
                rid0 rid0Var = (rid0) this.e;
                LinkedHashSet linkedHashSet = rid0Var.d;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) this.f;
                tmc tmcVar = (tmc) this.g;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                pmc pmcVar = (pmc) linkedHashMap.get((omc) list.get(intValue));
                if (pmcVar != null) {
                    if (linkedHashSet.contains(pmcVar)) {
                        break;
                    } else {
                        linkedHashSet.add(pmcVar);
                        if (pmcVar instanceof c5u) {
                            lt00 lt00Var = (lt00) rid0Var.b.d;
                            c5u c5uVar = (c5u) pmcVar;
                            Long valueOf = Long.valueOf(c5uVar.a);
                            Long valueOf2 = Long.valueOf(c5uVar.b.b);
                            if (intValue <= 0) {
                                num = null;
                            }
                            lt00.h(lt00Var, valueOf, valueOf2, num, commonMarketStat$TypeRefSource, null, Integer.valueOf(tmcVar.a), Long.valueOf(tmcVar.b.b), CommonMarketStat$TypeMarketContextContent.Type.CLIP, 16);
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
