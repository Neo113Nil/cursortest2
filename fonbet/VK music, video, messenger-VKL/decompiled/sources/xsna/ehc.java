package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogFragment;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleFragment;
import com.vk.ecomm.catalog.impl.geo.ClassifiedsGeoData;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.sgc;
import xsna.zgc;

/* compiled from: ClassifiedsRouterImpl.kt */
/* loaded from: classes18.dex */
public final class ehc implements dhc {
    /* JADX WARN: Type inference failed for: r9v8, types: [T, xsna.dw20] */
    @Override // xsna.dhc
    public final dw20 a(Context context, dz00 dz00Var, izs izsVar, g3b g3bVar, yte yteVar, a23 a23Var) {
        int i = zgc.a.f.a;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? a = new sgc.a(context, new ClassifiedsGeoData(dz00Var != null ? dz00Var.a : null, String.valueOf(dz00Var != null ? Double.valueOf(dz00Var.b) : null), String.valueOf(dz00Var != null ? Double.valueOf(dz00Var.c) : null), true), i).a0(new tx(6, ((ysg0) com.vk.ecomm.catalog.impl.geo.e.a.getValue()).a.subscribe(new pf1(new ng3(5, ref$ObjectRef, izsVar), 7)), g3bVar)).c0(new t14(1, yteVar)).X(new com.vk.movika.sdk.base.logic.processor.actions.d(a23Var, 13)).a();
        ref$ObjectRef.element = a;
        return a;
    }

    @Override // xsna.dhc
    public final Class<? extends FragmentImpl> b() {
        return ClassifiedsCatalogFragment.class;
    }

    @Override // xsna.dhc
    public final void c(Context context, cgc cgcVar) {
        ClassifiedsCatalogFragment.a aVar = new ClassifiedsCatalogFragment.a();
        Integer num = cgcVar.a;
        if (num != null) {
            aVar.m.a.putInt("KEY_CATEGORY_ID", num.intValue());
        }
        String str = cgcVar.b;
        if (str != null) {
            aVar.D(str);
        }
        UserId userId = cgcVar.c;
        if (userId != null) {
            aVar.E(userId);
        }
        boolean z = cgcVar.d;
        yfc yfcVar = aVar.n;
        if (z) {
            yfcVar.a.putBoolean("KEY_OPEN_VOICE_SEARCH", true);
        }
        if (cgcVar.e) {
            yfcVar.a.putBoolean("KEY_MODE_SEARCH_ONLY", true);
        }
        String str2 = cgcVar.f;
        if (str2 != null) {
            yfcVar.a.putString("KEY_SEARCH_SECTION_ID", str2);
        }
        MarketAnalyticsParams marketAnalyticsParams = cgcVar.g;
        if (marketAnalyticsParams != null) {
            aVar.C(marketAnalyticsParams);
        }
        aVar.k(context);
    }

    @Override // xsna.dhc
    public final void d(Context context, ngc ngcVar) {
        ClassifiedsCatalogSimpleFragment.a aVar = new ClassifiedsCatalogSimpleFragment.a();
        Integer num = ngcVar.a;
        yfc yfcVar = aVar.m;
        if (num != null) {
            yfcVar.a.putInt("KEY_CATEGORY_ID", num.intValue());
        }
        String str = ngcVar.b;
        if (str != null) {
            aVar.F(str);
        }
        String str2 = ngcVar.c;
        if (str2 != null) {
            aVar.D(str2);
        }
        UserId userId = ngcVar.d;
        if (userId != null) {
            aVar.E(userId);
        }
        Long l = ngcVar.e;
        if (l != null) {
            yfcVar.a.putLong("KEY_PRICE_MIN", l.longValue());
        }
        Long l2 = ngcVar.f;
        if (l2 != null) {
            yfcVar.a.putLong("KEY_PRICE_MAX", l2.longValue());
        }
        String str3 = ngcVar.k;
        if (str3 != null) {
            yfcVar.a.putString("KEY_SORTING_OPTION_ID", str3);
        }
        String str4 = ngcVar.g;
        if (str4 != null) {
            yfcVar.a.putString("KEY_STATUS_ID", str4);
        }
        MarketAnalyticsParams marketAnalyticsParams = ngcVar.l;
        if (marketAnalyticsParams != null) {
            aVar.C(marketAnalyticsParams);
        }
        Integer num2 = ngcVar.m;
        if (num2 != null) {
            aVar.B(num2.intValue());
        }
        String str5 = ngcVar.o;
        Bundle bundle = aVar.j;
        if (str5 != null) {
            bundle.putString("title", str5);
        }
        Boolean bool = ngcVar.h;
        if (bool != null) {
            yfcVar.a.putBoolean("discount_enabled", bool.booleanValue());
        }
        Boolean bool2 = ngcVar.i;
        if (bool2 != null) {
            yfcVar.a.putBoolean("friends_reviews_enabled", bool2.booleanValue());
        }
        Boolean bool3 = ngcVar.j;
        if (bool3 != null) {
            yfcVar.a.putBoolean("friends_wishlist_enabled", bool3.booleanValue());
        }
        if (ngcVar.p) {
            bundle.putBoolean("is_show_all", true);
        }
        aVar.k(context);
    }
}
