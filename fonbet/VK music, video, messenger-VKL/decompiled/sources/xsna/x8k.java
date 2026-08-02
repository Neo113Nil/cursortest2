package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.s8k;

/* compiled from: CreateMarketItemReviewReducer.kt */
/* loaded from: classes18.dex */
public final class x8k extends dm50<g9k, s8k, c9k> {
    public final sni d;

    public x8k(sni sniVar) {
        super(new c9k(0));
        this.d = sniVar;
    }

    public static y9k i(w9k w9kVar) {
        return w9kVar != null ? new y9k(w9kVar.a, w9kVar.d, true, 1.0f) : new y9k(false, 11);
    }

    @Override // xsna.dm50
    public final c9k c(c9k c9kVar, s8k s8kVar) {
        c9k c9kVar2 = c9kVar;
        s8k s8kVar2 = s8kVar;
        w9k w9kVar = c9kVar2.h;
        w9k w9kVar2 = c9kVar2.e;
        w9k w9kVar3 = c9kVar2.k;
        a8k a8kVar = c9kVar2.c;
        boolean z = s8kVar2 instanceof s8k.d;
        sni sniVar = this.d;
        if (z) {
            a8k a8kVar2 = ((s8k.d) s8kVar2).b;
            List<dak> list = a8kVar2.a;
            String str = c9kVar2.j;
            sniVar.getClass();
            w9k r = sni.r(w9kVar3, list, str);
            List<dak> list2 = a8kVar2.a;
            List<dak> list3 = a8kVar2.b;
            List<dak> list4 = a8kVar2.c;
            int g = sni.g(list2);
            return c9k.a(c9kVar2, a8kVar2, null, sni.r(w9kVar2, list4, c9kVar2.d), Integer.valueOf(sni.g(list4)), null, sni.r(w9kVar, list3, c9kVar2.g), Integer.valueOf(sni.g(list3)), null, r, Integer.valueOf(g), null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, null, false, false, null, null, null, 268433701);
        }
        if (s8kVar2 instanceof v8k) {
            v8k v8kVar = (v8k) s8kVar2;
            CreateMarketItemReviewData createMarketItemReviewData = v8kVar.n;
            Long l = v8kVar.e;
            boolean z2 = v8kVar.l;
            boolean z3 = v8kVar.m;
            String str2 = v8kVar.i;
            String str3 = v8kVar.h;
            String str4 = v8kVar.f;
            UserId userId = v8kVar.g;
            List<UploadImageModel> list5 = v8kVar.k;
            String str5 = v8kVar.d;
            String str6 = v8kVar.b;
            String str7 = v8kVar.c;
            float f = v8kVar.j;
            List<dak> list6 = a8kVar != null ? a8kVar.a : null;
            sniVar.getClass();
            return c9k.a(c9kVar2, null, str6, sni.r(w9kVar2, a8kVar != null ? a8kVar.c : null, v8kVar.b), null, str7, sni.r(w9kVar, a8kVar != null ? a8kVar.b : null, v8kVar.c), null, str5, sni.r(w9kVar3, list6, str5), null, l, str4, userId, str3, str2, f, null, null, false, false, list5, z2, z3, createMarketItemReviewData, null, null, 205390995);
        }
        if (s8kVar2 instanceof u8k) {
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, null, true, false, null, null, null, 260046847);
        }
        if (s8kVar2 instanceof t8k) {
            t8k t8kVar = (t8k) s8kVar2;
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, null, false, true, null, t8kVar.b, t8kVar.c, 41943039);
        }
        if (s8kVar2 instanceof s8k.i) {
            s8k.i iVar = (s8k.i) s8kVar2;
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iVar.b, iVar.c, false, false, null, false, false, null, null, null, 266469375);
        }
        if (s8kVar2 instanceof s8k.f) {
            String str8 = ((s8k.f) s8kVar2).b;
            List<dak> list7 = a8kVar != null ? a8kVar.c : null;
            sniVar.getClass();
            return c9k.a(c9kVar2, null, str8, sni.r(w9kVar2, list7, str8), null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, null, false, false, null, null, null, 268435443);
        }
        if (s8kVar2 instanceof s8k.c) {
            String str9 = ((s8k.c) s8kVar2).b;
            List<dak> list8 = a8kVar != null ? a8kVar.b : null;
            sniVar.getClass();
            return c9k.a(c9kVar2, null, null, null, null, str9, sni.r(w9kVar, list8, str9), null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, null, false, false, null, null, null, 268435359);
        }
        if (s8kVar2 instanceof s8k.b) {
            String str10 = ((s8k.b) s8kVar2).b;
            List<dak> list9 = a8kVar != null ? a8kVar.a : null;
            sniVar.getClass();
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, str10, sni.r(w9kVar3, list9, str10), null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, null, false, false, null, null, null, 268434687);
        }
        if (s8kVar2 instanceof s8k.g) {
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((s8k.g) s8kVar2).b, null, null, false, false, null, false, false, null, null, null, 268369919);
        }
        if (s8kVar2 instanceof s8k.e) {
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, ((s8k.e) s8kVar2).b, false, null, false, false, null, null, null, 267386879);
        }
        if (s8kVar2 instanceof s8k.h) {
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, null, false, false, null, null, null, 267386879);
        }
        if (s8kVar2 instanceof s8k.a) {
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, ((s8k.a) s8kVar2).b, null, false, false, null, null, null, 266338303);
        }
        if (s8kVar2 instanceof s8k.j.a) {
            return c9k.a(c9kVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, false, ((s8k.j.a) s8kVar2).b, false, false, null, null, null, 264241151);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final g9k d() {
        return new g9k(e(new vl1(this, 23)), e(new p60(20)), e(new com.vk.movika.sdk.base.observable.u(19)), e(new rd1(12)));
    }

    @Override // xsna.dm50
    public final void h(c9k c9kVar, g9k g9kVar) {
        c9k c9kVar2 = c9kVar;
        g9k g9kVar2 = g9kVar;
        if (c9kVar2.s) {
            f(g9kVar2.b, c9kVar2);
            return;
        }
        if (c9kVar2.y) {
            f(g9kVar2.c, c9kVar2);
        } else if (c9kVar2.z) {
            f(g9kVar2.d, c9kVar2);
        } else {
            f(g9kVar2.a, c9kVar2);
        }
    }
}
