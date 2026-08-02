package com.ybsdk.common.repositiories.payment;

import android.content.Context;
import android.net.Uri;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.entities.YBAutoTopupStatus;
import com.ybsdk.api.entities.YBPaymentMethodProductType;
import com.ybsdk.api.entities.YBPaymentMethodType;
import com.ybsdk.common.repositiories.payment.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.UzApi;
import com.ybsdk.network.dto.AutoTopupInfo;
import com.ybsdk.network.dto.PaymentMethodProductType;
import com.ybsdk.network.dto.SplitInfoOverdue;
import com.ybsdk.network.dto.WalletInfoAction;
import com.ybsdk.network.dto.WalletsInfoResponse;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.YbAllowedApiCountryCodes;
import defpackage.abm;
import defpackage.af51;
import defpackage.bf51;
import defpackage.bob1;
import defpackage.bvf0;
import defpackage.cf51;
import defpackage.dvc;
import defpackage.dzh0;
import defpackage.e5z0;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.ip51;
import defpackage.ivt0;
import defpackage.jl40;
import defpackage.job1;
import defpackage.jvt0;
import defpackage.kvt0;
import defpackage.mf51;
import defpackage.n2m0;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qe01;
import defpackage.qxy0;
import defpackage.r6a0;
import defpackage.rev;
import defpackage.sls;
import defpackage.t6a0;
import defpackage.th51;
import defpackage.tje;
import defpackage.vam;
import defpackage.w511;
import defpackage.w530;
import defpackage.wf51;
import defpackage.x4c;
import defpackage.xf51;
import defpackage.zf51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class b implements r6a0 {
    public final Context a;
    public final Api b;
    public final UzApi c;
    public final AppAnalyticsReporter d;
    public final nbp0 e;
    public final com.ybsdk.utils.poller.b f;
    public final com.ybsdk.rconfig.b g;
    public final w530 h;
    public final r0 i = bvf0.c(null);
    public final n0 j;
    public final eci0 k;
    public final i3y l;
    public final i3y m;
    public final i3y n;
    public final i3y o;
    public final i3y p;
    public final i3y q;
    public final String r;
    public final i3y s;
    public final i3y t;
    public final i3y u;
    public final i3y v;
    public final i3y w;
    public final i3y x;
    public volatile pzt0 y;

    public b(Context context, Api api, UzApi uzApi, AppAnalyticsReporter appAnalyticsReporter, nbp0 nbp0Var, com.ybsdk.utils.poller.b bVar, com.ybsdk.rconfig.b bVar2, w530 w530Var) {
        this.a = context;
        this.b = api;
        this.c = uzApi;
        this.d = appAnalyticsReporter;
        this.e = nbp0Var;
        this.f = bVar;
        this.g = bVar2;
        this.h = w530Var;
        final int i = 0;
        final int i2 = 7;
        n0 c = ffx.c(0, 0, null, 7);
        this.j = c;
        this.k = e.c(c);
        this.l = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                b bVar3 = this.b;
                switch (i3) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i3 = 5;
        this.m = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i4 = 6;
        this.n = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i4;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        this.o = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i2;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i5 = 8;
        this.p = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i5;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i6 = 9;
        this.q = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i6;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        this.r = "";
        final int i7 = 10;
        this.s = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i7;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i8 = 11;
        this.t = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i8;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i9 = 1;
        this.u = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i9;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i10 = 2;
        this.v = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i10;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i11 = 3;
        this.w = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i11;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
        final int i12 = 4;
        this.x = kotlin.a.a(new sls(this) { // from class: s6a0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i12;
                b bVar3 = this.b;
                switch (i32) {
                    case 0:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_title);
                    case 1:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_yandex_wallet);
                    case 2:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_pro_card);
                    case 3:
                        return new dvc(bVar3.a, rxg0.ybsdk_ic_payment_credit_limit_card);
                    case 4:
                        boolean isEnabled = ((CommonFeatureFlag) bVar3.g.d(wlp.h0).getData()).isEnabled();
                        Context context2 = bVar3.a;
                        return isEnabled ? new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16_v2) : new dvc(context2, rxg0.ybsdk_ic_yandex_logo_16);
                    case 5:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promotion_payment_method_default_subtitle);
                    case 6:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_action_title);
                    case 7:
                        return bVar3.a.getString(dzh0.ybsdk_payments_promo_action_title);
                    case 8:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_subtitle);
                    case 9:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_pro_title);
                    case 10:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_title);
                    default:
                        return bVar3.a.getString(dzh0.ybsdk_payments_payment_method_default_credit_limit_subtitle);
                }
            }
        });
    }

    public static af51 i(AutoTopupInfo autoTopupInfo) {
        YBAutoTopupStatus yBAutoTopupStatus;
        int i = t6a0.b[autoTopupInfo.getStatus().ordinal()];
        if (i == 1) {
            yBAutoTopupStatus = YBAutoTopupStatus.ENABLED;
        } else if (i == 2) {
            yBAutoTopupStatus = YBAutoTopupStatus.DISABLED;
        } else if (i == 3) {
            yBAutoTopupStatus = YBAutoTopupStatus.AVAILABLE_AFTER_UPGRADE;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            yBAutoTopupStatus = YBAutoTopupStatus.UNAVAILABLE;
        }
        String action = autoTopupInfo.getAction();
        return new af51(yBAutoTopupStatus, action != null ? YBSdk.INSTANCE.resolveUri(Uri.parse(action)) : null);
    }

    public final xf51 a(String str) {
        YBPaymentMethodType yBPaymentMethodType = YBPaymentMethodType.WALLET;
        String str2 = (String) this.l.getValue();
        String str3 = (String) this.p.getValue();
        dvc dvcVar = (dvc) this.u.getValue();
        i3y i3yVar = this.n;
        return new xf51(yBPaymentMethodType, str, str2, str3, dvcVar, null, new wf51((String) i3yVar.getValue(), (String) i3yVar.getValue(), th51.a, null), YBPaymentMethodProductType.WALLET, null, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(1:(6:12|13|14|15|(1:17)|18)(2:21|22))(6:23|24|(1:26)|15|(0)|18))(1:29))(1:35)|30|31|(1:33)|24|(0)|15|(0)|18))|39|6|7|(0)(0)|30|31|(0)|24|(0)|15|(0)|18) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (e((com.ybsdk.network.dto.WalletsInfoResponse) r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #0 {all -> 0x0087, blocks: (B:12:0x002a, B:13:0x0083, B:26:0x006c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PaymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1 paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1;
        int i;
        Object obj;
        Throwable a;
        Object c;
        if (continuationImpl instanceof PaymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1) {
            paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1 = (PaymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1) continuationImpl;
            int i2 = paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PaymentMethodRepositoryImpl$getCompactHorizontalWidgetData$2 paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$2 = new PaymentMethodRepositoryImpl$getCompactHorizontalWidgetData$2(this, null);
                    paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.label = 1;
                    c = c.c(paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$2, paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            obj = paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.L$0;
                            kotlin.b.b(obj2);
                            if (!(obj instanceof Result.Failure)) {
                                WalletsInfoResponse.WalletInfo walletInfo = (WalletsInfoResponse.WalletInfo) kotlin.collections.a.P(((WalletsInfoResponse) obj).getWalletsInfo());
                                paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.L$0 = null;
                                paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.label = 3;
                                obj2 = f(walletInfo, paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1);
                            }
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return obj;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        Object failure = (mf51) obj2;
                        obj = failure;
                        a = Result.a(obj);
                        if (a != null) {
                            e5z0 e5z0Var = i5z0.a;
                            e5z0Var.m("PaymentMethodRepository");
                            e5z0Var.a("requestPaymentMethods: error: " + a, new Object[0]);
                        }
                        return obj;
                    }
                    kotlin.b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                obj = c;
                if (!(obj instanceof Result.Failure)) {
                    paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.L$0 = obj;
                    paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.label = 2;
                }
                if (!(obj instanceof Result.Failure)) {
                }
                a = Result.a(obj);
                if (a != null) {
                }
                return obj;
            }
        }
        paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1 = new PaymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1(this, continuationImpl);
        Object obj22 = paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodRepositoryImpl$getCompactHorizontalWidgetData$1.label;
        if (i != 0) {
        }
        obj = c;
        if (!(obj instanceof Result.Failure)) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(1:(5:12|13|14|(1:16)|17)(2:19|20))(7:21|22|23|(3:25|(2:28|13)|27)|14|(0)|17))(1:30))(1:36)|31|(3:33|(2:35|27)|22)|23|(0)|14|(0)|17))|40|6|7|(0)(0)|31|(0)|23|(0)|14|(0)|17) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        r8 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:21:0x0036, B:22:0x0066, B:33:0x005b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PaymentMethodRepositoryImpl$requestPaymentMethods$1 paymentMethodRepositoryImpl$requestPaymentMethods$1;
        int i;
        Object failure;
        Object obj;
        Throwable a;
        if (continuationImpl instanceof PaymentMethodRepositoryImpl$requestPaymentMethods$1) {
            paymentMethodRepositoryImpl$requestPaymentMethods$1 = (PaymentMethodRepositoryImpl$requestPaymentMethods$1) continuationImpl;
            int i2 = paymentMethodRepositoryImpl$requestPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodRepositoryImpl$requestPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodRepositoryImpl$requestPaymentMethods$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodRepositoryImpl$requestPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PaymentMethodRepositoryImpl$requestPaymentMethods$2 paymentMethodRepositoryImpl$requestPaymentMethods$2 = new PaymentMethodRepositoryImpl$requestPaymentMethods$2(this, null);
                    paymentMethodRepositoryImpl$requestPaymentMethods$1.label = 1;
                    failure = c.c(paymentMethodRepositoryImpl$requestPaymentMethods$2, paymentMethodRepositoryImpl$requestPaymentMethods$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = paymentMethodRepositoryImpl$requestPaymentMethods$1.L$0;
                            kotlin.b.b(obj2);
                            failure = obj;
                            a = Result.a(failure);
                            if (a != null) {
                                e5z0 e5z0Var = i5z0.a;
                                e5z0Var.m("PaymentMethodRepository");
                                e5z0Var.a("requestPaymentMethods: error: " + a, new Object[0]);
                            }
                            return failure;
                        }
                        kotlin.b.b(obj2);
                        failure = (List) obj2;
                        if (!(failure instanceof Result.Failure)) {
                            paymentMethodRepositoryImpl$requestPaymentMethods$1.L$0 = failure;
                            paymentMethodRepositoryImpl$requestPaymentMethods$1.label = 3;
                            this.i.emit((List) failure, paymentMethodRepositoryImpl$requestPaymentMethods$1);
                            if (zy11.a != obj3) {
                                obj = failure;
                                failure = obj;
                            }
                            return obj3;
                        }
                        a = Result.a(failure);
                        if (a != null) {
                        }
                        return failure;
                    }
                    kotlin.b.b(obj2);
                    failure = ((Result) obj2).getValue();
                }
                if (!(failure instanceof Result.Failure)) {
                    paymentMethodRepositoryImpl$requestPaymentMethods$1.label = 2;
                    obj2 = g((WalletsInfoResponse) failure, paymentMethodRepositoryImpl$requestPaymentMethods$1);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    failure = (List) obj2;
                }
                if (!(failure instanceof Result.Failure)) {
                }
                a = Result.a(failure);
                if (a != null) {
                }
                return failure;
            }
        }
        paymentMethodRepositoryImpl$requestPaymentMethods$1 = new PaymentMethodRepositoryImpl$requestPaymentMethods$1(this, continuationImpl);
        Object obj22 = paymentMethodRepositoryImpl$requestPaymentMethods$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodRepositoryImpl$requestPaymentMethods$1.label;
        if (i != 0) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return failure;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(6:12|13|14|15|(1:17)|18)(2:21|22))(6:23|24|25|26|(1:(1:35)(1:31))(1:(1:37))|32))(1:38))(1:44)|39|(6:41|(2:43|34)|25|26|(0)(0)|32)|15|(0)|18))|48|6|7|(0)(0)|39|(0)|15|(0)|18) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r9 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0067, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #0 {all -> 0x00b6, blocks: (B:12:0x002a, B:13:0x00b2, B:24:0x0039, B:25:0x007b, B:29:0x008b, B:32:0x00a7, B:35:0x0092, B:37:0x00a4, B:41:0x006e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1 paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1;
        int i;
        Object failure;
        Throwable a;
        WalletsInfoResponse walletsInfoResponse;
        boolean l;
        if (continuationImpl instanceof PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1) {
            paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1 = (PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1) continuationImpl;
            int i2 = paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2 paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2 = new PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2(str, ((YbAllowedApiCountryCodes) this.g.d(ip51.a).getData()).getCountryCodes(), this, null);
                    paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label = 1;
                    failure = c.c(paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2, paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                    failure = ((Result) obj).getValue();
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        failure = (zf51) obj;
                        a = Result.a(failure);
                        if (a != null) {
                            e5z0 e5z0Var = i5z0.a;
                            e5z0Var.m("PaymentMethodRepository");
                            e5z0Var.a("requestPaymentMethodsAndPromos error: " + a, new Object[0]);
                        }
                        return failure;
                    }
                    walletsInfoResponse = (WalletsInfoResponse) paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.L$0;
                    kotlin.b.b(obj);
                    l = jl40.l(walletsInfoResponse.getShouldPoll(), Boolean.TRUE);
                    pzt0 pzt0Var = this.y;
                    if (l) {
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                    } else if (pzt0Var == null || !pzt0Var.isActive()) {
                        this.y = tje.N(this.e.a, null, null, new PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1(this, null), 3);
                    }
                    paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.L$0 = null;
                    paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label = 3;
                    obj = h(walletsInfoResponse, paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1);
                }
                if (!(failure instanceof Result.Failure)) {
                    walletsInfoResponse = (WalletsInfoResponse) failure;
                    paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.L$0 = walletsInfoResponse;
                    paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label = 2;
                    if (e(walletsInfoResponse, paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1) == obj2) {
                        return obj2;
                    }
                    l = jl40.l(walletsInfoResponse.getShouldPoll(), Boolean.TRUE);
                    pzt0 pzt0Var2 = this.y;
                    if (l) {
                    }
                    paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.L$0 = null;
                    paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label = 3;
                    obj = h(walletsInfoResponse, paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1);
                }
                a = Result.a(failure);
                if (a != null) {
                }
                return failure;
            }
        }
        paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1 = new PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1(this, continuationImpl);
        Object obj3 = paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$1.label;
        if (i != 0) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(WalletsInfoResponse walletsInfoResponse, ContinuationImpl continuationImpl) {
        PaymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1 paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1;
        int i;
        Object obj;
        pz40 pz40Var;
        try {
            if (continuationImpl instanceof PaymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1) {
                paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1 = (PaymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1) continuationImpl;
                int i2 = paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.label;
                    obj = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        r0 r0Var = this.i;
                        paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.L$0 = r0Var;
                        paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.label = 1;
                        Object g = g(walletsInfoResponse, paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1);
                        if (g != obj3) {
                            obj2 = g;
                            pz40Var = r0Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.b.b(obj2);
                                return obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pz40Var = (pz40) paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.L$0;
                        kotlin.b.b(obj2);
                    }
                    paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.L$0 = null;
                    paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.label = 2;
                    ((r0) pz40Var).emit(obj2, paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1);
                    return obj != obj3 ? obj3 : obj;
                }
            }
            if (i != 0) {
            }
            paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.L$0 = null;
            paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.label = 2;
            ((r0) pz40Var).emit(obj2, paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1);
            if (obj != obj3) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            x4c.g("failed to transform wallet info response to payment methods", th, null, null, 12);
            return obj;
        }
        paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1 = new PaymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1(this, continuationImpl);
        Object obj22 = paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodRepositoryImpl$sendPaymentMethodsUpdate$1.label;
        obj = zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(WalletsInfoResponse.WalletInfo walletInfo, ContinuationImpl continuationImpl) {
        PaymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1 paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1;
        int i;
        String str;
        WalletsInfoResponse.WalletInfo walletInfo2;
        if (continuationImpl instanceof PaymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1) {
            paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1 = (PaymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1) continuationImpl;
            int i2 = paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (walletInfo.getBalance() == null) {
                        return new mf51(walletInfo.getTitle(), walletInfo.getSubtitle(), g8e.p(walletInfo.getSubtitle(), " ", walletInfo.getTitle()), bf51.a);
                    }
                    String a = w530.a(this.h, walletInfo.getBalance().getAmount(), walletInfo.getBalance().getCurrency(), false, null, false, 60);
                    ThemedImageUrlEntity c = qxy0.c(walletInfo.getThemedLogo(), walletInfo.getLogo());
                    vam vamVar = new vam(rev.h);
                    paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.L$0 = walletInfo;
                    paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.L$1 = a;
                    paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.label = 1;
                    Object a2 = job1.a(c, context, vamVar, paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = a;
                    obj = a2;
                    walletInfo2 = walletInfo;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.L$1;
                    walletInfo2 = (WalletsInfoResponse.WalletInfo) paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.L$0;
                    kotlin.b.b(obj);
                }
                abm abmVar = (abm) obj;
                return new mf51(walletInfo2.getTitle(), null, context.getString(dzh0.ybsdk_payments_accessibility_compact_horizontal_widget, walletInfo2.getTitle(), walletInfo2.getSubtitle(), str), new cf51(str, abmVar == null ? new dvc(abmVar.b(), abmVar.a()) : (dvc) this.x.getValue()));
            }
        }
        paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1 = new PaymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1(this, continuationImpl);
        Object obj2 = paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodRepositoryImpl$toCompactHorizontalWidgetData$1.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        abm abmVar2 = (abm) obj2;
        return new mf51(walletInfo2.getTitle(), null, context2.getString(dzh0.ybsdk_payments_accessibility_compact_horizontal_widget, walletInfo2.getTitle(), walletInfo2.getSubtitle(), str), new cf51(str, abmVar2 == null ? new dvc(abmVar2.b(), abmVar2.a()) : (dvc) this.x.getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r0v5, types: [vh51] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [tf51] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1, types: [wf51] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [af51] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [af51] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x008f -> B:10:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(WalletsInfoResponse walletsInfoResponse, ContinuationImpl continuationImpl) {
        PaymentMethodRepositoryImpl$toPaymentMethodsList$1 paymentMethodRepositoryImpl$toPaymentMethodsList$1;
        int i;
        Iterator it;
        Collection collection;
        ?? r18;
        Object xf51Var;
        String str;
        Object obj;
        YBPaymentMethodProductType yBPaymentMethodProductType;
        b bVar = this;
        if (continuationImpl instanceof PaymentMethodRepositoryImpl$toPaymentMethodsList$1) {
            paymentMethodRepositoryImpl$toPaymentMethodsList$1 = (PaymentMethodRepositoryImpl$toPaymentMethodsList$1) continuationImpl;
            int i2 = paymentMethodRepositoryImpl$toPaymentMethodsList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodRepositoryImpl$toPaymentMethodsList$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodRepositoryImpl$toPaymentMethodsList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodRepositoryImpl$toPaymentMethodsList$1.label;
                String str2 = null;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<WalletsInfoResponse.WalletInfo> walletsInfo = walletsInfoResponse.getWalletsInfo();
                    ArrayList arrayList = new ArrayList();
                    it = walletsInfo.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b bVar2 = (b) paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$4;
                    WalletsInfoResponse.WalletInfo walletInfo = (WalletsInfoResponse.WalletInfo) paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$3;
                    WalletsInfoResponse.WalletInfo walletInfo2 = (WalletsInfoResponse.WalletInfo) paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$2;
                    it = (Iterator) paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$1;
                    collection = (Collection) paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$0;
                    kotlin.b.b(obj2);
                    abm abmVar = (abm) obj2;
                    dvc dvcVar = abmVar == null ? new dvc(abmVar.b(), abmVar.a()) : (dvc) bVar.u.getValue();
                    Money balance = walletInfo2.getBalance();
                    if (balance == null) {
                        w530 w530Var = bVar.h;
                        r18 = qe01.a(bob1.g(balance, w530Var), w530Var);
                    } else {
                        r18 = str2;
                    }
                    bVar2.getClass();
                    YBPaymentMethodType yBPaymentMethodType = YBPaymentMethodType.WALLET;
                    String paymentMethodId = walletInfo.getPaymentMethodId();
                    if (paymentMethodId == null) {
                        paymentMethodId = "";
                    }
                    String str3 = paymentMethodId;
                    String title = walletInfo.getTitle();
                    String subtitle = walletInfo.getSubtitle();
                    WalletInfoAction action = walletInfo.getAction();
                    PaymentMethodProductType productType = walletInfo.getProductType();
                    th51 th51Var = th51.a;
                    if (action != null) {
                        i3y i3yVar = bVar2.o;
                        str = str2;
                        obj = (productType == PaymentMethodProductType.WALLET || productType == null) ? new wf51((String) i3yVar.getValue(), (String) i3yVar.getValue(), th51Var, str2) : str2;
                    } else {
                        String title2 = action.getTitle();
                        str = str2;
                        String title3 = action.getTitle();
                        ?? resolveUri = YBSdk.INSTANCE.resolveUri(Uri.parse(action.getDeeplink()));
                        if (resolveUri != 0) {
                            th51Var = resolveUri;
                        }
                        obj = new wf51(title2, title3, th51Var, action.getDeeplink());
                    }
                    ?? r19 = obj;
                    PaymentMethodProductType productType2 = walletInfo.getProductType();
                    int i4 = productType2 != null ? -1 : t6a0.a[productType2.ordinal()];
                    if (i4 == -1) {
                        int i5 = 1;
                        if (i4 == 1) {
                            yBPaymentMethodProductType = YBPaymentMethodProductType.PRO;
                        } else if (i4 == 2) {
                            yBPaymentMethodProductType = YBPaymentMethodProductType.CREDIT_LIMIT;
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                w511.b();
                                return str;
                            }
                            xf51Var = str;
                            if (xf51Var != null) {
                                collection.add(xf51Var);
                            }
                            bVar = this;
                            str2 = str;
                            i3 = i5;
                            if (it.hasNext()) {
                                return kotlin.collections.a.J0((List) collection);
                            }
                            walletInfo = (WalletsInfoResponse.WalletInfo) it.next();
                            ThemedImageUrlEntity c = qxy0.c(walletInfo.getThemedImage(), walletInfo.getImage());
                            vam vamVar = new vam(rev.l);
                            paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$0 = collection;
                            paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$1 = it;
                            paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$2 = walletInfo;
                            paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$3 = walletInfo;
                            paymentMethodRepositoryImpl$toPaymentMethodsList$1.L$4 = bVar;
                            paymentMethodRepositoryImpl$toPaymentMethodsList$1.label = i3;
                            obj2 = job1.a(c, bVar.a, vamVar, paymentMethodRepositoryImpl$toPaymentMethodsList$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar2 = bVar;
                            walletInfo2 = walletInfo;
                            abm abmVar2 = (abm) obj2;
                            dvc dvcVar2 = abmVar2 == null ? new dvc(abmVar2.b(), abmVar2.a()) : (dvc) bVar.u.getValue();
                            Money balance2 = walletInfo2.getBalance();
                            if (balance2 == null) {
                            }
                            bVar2.getClass();
                            YBPaymentMethodType yBPaymentMethodType2 = YBPaymentMethodType.WALLET;
                            String paymentMethodId2 = walletInfo.getPaymentMethodId();
                            if (paymentMethodId2 == null) {
                            }
                            String str32 = paymentMethodId2;
                            String title4 = walletInfo.getTitle();
                            String subtitle2 = walletInfo.getSubtitle();
                            WalletInfoAction action2 = walletInfo.getAction();
                            PaymentMethodProductType productType3 = walletInfo.getProductType();
                            th51 th51Var2 = th51.a;
                            if (action2 != null) {
                            }
                            ?? r192 = obj;
                            PaymentMethodProductType productType22 = walletInfo.getProductType();
                            if (productType22 != null) {
                            }
                            if (i4 == -1) {
                                i5 = 1;
                            }
                        }
                        YBPaymentMethodProductType yBPaymentMethodProductType2 = yBPaymentMethodProductType;
                        AutoTopupInfo autoTopupInfo = walletInfo.getAutoTopupInfo();
                        ?? i6 = autoTopupInfo == null ? i(autoTopupInfo) : str;
                        AutoTopupInfo autoFundInfo = walletInfo.getAutoFundInfo();
                        xf51Var = new xf51(yBPaymentMethodType2, str32, title4, subtitle2, dvcVar2, r18, r192, yBPaymentMethodProductType2, i6, autoFundInfo == null ? i(autoFundInfo) : str);
                        if (xf51Var != null) {
                        }
                        bVar = this;
                        str2 = str;
                        i3 = i5;
                        if (it.hasNext()) {
                        }
                    }
                    yBPaymentMethodProductType = YBPaymentMethodProductType.WALLET;
                    YBPaymentMethodProductType yBPaymentMethodProductType22 = yBPaymentMethodProductType;
                    AutoTopupInfo autoTopupInfo2 = walletInfo.getAutoTopupInfo();
                    if (autoTopupInfo2 == null) {
                    }
                    AutoTopupInfo autoFundInfo2 = walletInfo.getAutoFundInfo();
                    xf51Var = new xf51(yBPaymentMethodType2, str32, title4, subtitle2, dvcVar2, r18, r192, yBPaymentMethodProductType22, i6, autoFundInfo2 == null ? i(autoFundInfo2) : str);
                    if (xf51Var != null) {
                    }
                    bVar = this;
                    str2 = str;
                    i3 = i5;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        paymentMethodRepositoryImpl$toPaymentMethodsList$1 = new PaymentMethodRepositoryImpl$toPaymentMethodsList$1(bVar, continuationImpl);
        Object obj22 = paymentMethodRepositoryImpl$toPaymentMethodsList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodRepositoryImpl$toPaymentMethodsList$1.label;
        String str22 = null;
        int i32 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(WalletsInfoResponse walletsInfoResponse, ContinuationImpl continuationImpl) {
        PaymentMethodRepositoryImpl$toPaymentMethodsResponse$1 paymentMethodRepositoryImpl$toPaymentMethodsResponse$1;
        int i;
        WalletsInfoResponse.SplitInfo splitInfo;
        kvt0 kvt0Var;
        Money amount;
        if (continuationImpl instanceof PaymentMethodRepositoryImpl$toPaymentMethodsResponse$1) {
            paymentMethodRepositoryImpl$toPaymentMethodsResponse$1 = (PaymentMethodRepositoryImpl$toPaymentMethodsResponse$1) continuationImpl;
            int i2 = paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.L$0 = walletsInfoResponse;
                    paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.label = 1;
                    obj = g(walletsInfoResponse, paymentMethodRepositoryImpl$toPaymentMethodsResponse$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    walletsInfoResponse = (WalletsInfoResponse) paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((xf51) obj3).b.length() == 0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (((xf51) obj4).b.length() > 0) {
                        arrayList2.add(obj4);
                    }
                }
                splitInfo = walletsInfoResponse.getSplitInfo();
                if (splitInfo == null) {
                    boolean isUserUpgraded = splitInfo.isUserUpgraded();
                    Money total = splitInfo.getLimit().getTotal();
                    w530 w530Var = this.h;
                    ivt0 ivt0Var = new ivt0(qe01.a(bob1.g(total, w530Var), w530Var), qe01.a(bob1.g(splitInfo.getLimit().getRemaining(), w530Var), w530Var), splitInfo.getLimit().getHasActiveSplit());
                    SplitInfoOverdue overdue = splitInfo.getOverdue();
                    kvt0Var = new kvt0(isUserUpgraded, ivt0Var, (overdue == null || (amount = overdue.getAmount()) == null) ? null : new jvt0(qe01.a(bob1.g(amount, w530Var), w530Var)), splitInfo.getAccountUrl(), splitInfo.getOnboardingUrl(), splitInfo.getFuturePaymentsUrl());
                } else {
                    kvt0Var = null;
                }
                WalletsInfoResponse.SaverInfo saverInfo = walletsInfoResponse.getSaverInfo();
                return new zf51(arrayList2, arrayList, kvt0Var, saverInfo != null ? new n2m0(saverInfo.getShouldShowPromo(), saverInfo.getMaxInterestRate(), saverInfo.getAction()) : null);
            }
        }
        paymentMethodRepositoryImpl$toPaymentMethodsResponse$1 = new PaymentMethodRepositoryImpl$toPaymentMethodsResponse$1(this, continuationImpl);
        Object obj5 = paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodRepositoryImpl$toPaymentMethodsResponse$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj5;
        ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r14.hasNext()) {
        }
        splitInfo = walletsInfoResponse.getSplitInfo();
        if (splitInfo == null) {
        }
        WalletsInfoResponse.SaverInfo saverInfo2 = walletsInfoResponse.getSaverInfo();
        return new zf51(arrayList22, arrayList3, kvt0Var, saverInfo2 != null ? new n2m0(saverInfo2.getShouldShowPromo(), saverInfo2.getMaxInterestRate(), saverInfo2.getAction()) : null);
    }
}
