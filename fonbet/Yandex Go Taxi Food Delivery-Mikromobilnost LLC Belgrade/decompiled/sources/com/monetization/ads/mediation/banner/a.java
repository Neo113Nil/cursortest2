package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import defpackage.aj81;
import defpackage.bq71;
import defpackage.cf71;
import defpackage.cr71;
import defpackage.dq71;
import defpackage.j471;
import defpackage.kgx;
import defpackage.qha1;
import defpackage.r581;
import defpackage.sg61;
import defpackage.sp81;
import defpackage.zs81;
import java.util.LinkedHashMap;
import kotlin.Pair;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.f5;
import yads.hm2;
import yads.im2;
import yads.zp1;

/* loaded from: classes7.dex */
public final class a implements MediatedBannerAdapter.MediatedBannerAdapterListener {
    public static final /* synthetic */ kgx[] g = {qha1.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/banner/BannerAdLoadController;"), qha1.a(a.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;")};
    public final aj81 a;
    public final zs81 b;
    public final sg61 c;
    public final r581 d;
    public final r581 e;
    public boolean f;

    public a(j471 j471Var, bq71 bq71Var, aj81 aj81Var, zs81 zs81Var) {
        sg61 sg61Var = new sg61();
        this.a = aj81Var;
        this.b = zs81Var;
        this.c = sg61Var;
        this.d = new r581(j471Var);
        this.e = new r581(bq71Var.d);
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
        zp1 zp1Var;
        int code = mediatedAdRequestError.getCode();
        String str = mediatedAdRequestError.getRu.yandex.video.m3.player.utils.DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION java.lang.String();
        mediatedAdRequestError.getRu.yandex.video.m3.player.utils.DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION java.lang.String();
        boolean z = this.f;
        aj81 aj81Var = this.a;
        if (z) {
            Context context = aj81Var.g;
            cr71 cr71Var = aj81Var.h;
            if (cr71Var != null) {
                aj81Var.d.a(context, hm2.d, (zp1) cr71Var.c, ((sp81) cr71Var.w).a().getNetworkName(), kotlin.collections.b.i(new Pair(ACSPConstants.STATUS, "error"), new Pair("error_code", Integer.valueOf(code))));
            }
            Context context2 = aj81Var.g;
            aj81Var.a(context2);
            aj81Var.b(context2, this);
            return;
        }
        cr71 cr71Var2 = aj81Var.h;
        aj81Var.b.c(f5.c, new cf71(23, im2.d, (cr71Var2 == null || (zp1Var = (zp1) cr71Var2.c) == null) ? null : zp1Var.b), null);
        Context context3 = aj81Var.g;
        LinkedHashMap l = kotlin.collections.b.l(new Pair(ACSPConstants.STATUS, "error"), new Pair("error_code", Integer.valueOf(code)), new Pair("error_description", str));
        cr71 cr71Var3 = aj81Var.h;
        if (cr71Var3 != null) {
            sp81 sp81Var = (sp81) cr71Var3.w;
            l.putAll(dq71.a(sp81Var));
            aj81Var.d.a(context3, hm2.g, (zp1) cr71Var3.c, sp81Var.a().getNetworkName(), l);
        }
        Context context4 = aj81Var.g;
        aj81Var.a(context4);
        aj81Var.b(context4, this);
    }
}
