package com.yandex.passport.internal.ui.bouncer.social;

import android.net.Uri;
import androidx.core.app.a1;
import com.yandex.passport.common.ui.progress.p;
import com.yandex.passport.internal.report.i;
import com.yandex.passport.internal.report.jb;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.reporters.SocialActionReporter$Flow;
import com.yandex.passport.internal.report.reporters.v0;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.SocialContentData;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.model.k2;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.bouncer.v;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cvw;
import defpackage.did;
import defpackage.fid;
import defpackage.kla1;
import defpackage.o430;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.yd00;
import defpackage.zpn;
import defpackage.zy11;
import kotlin.Result;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void a(v vVar, final BouncerUiState$SocialAction bouncerUiState$SocialAction, fid fidVar, int i) {
        final int i2;
        Object obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-130876163);
        int i3 = (btsVar.k(vVar) ? 4 : 2) | i | (btsVar.k(bouncerUiState$SocialAction) ? 32 : 16);
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            final t wishSource = vVar.getWishSource();
            final v0 socialActionReporter = vVar.getSocialActionReporter();
            final int i4 = 0;
            Object[] objArr = new Object[0];
            btsVar.e0(-927885085);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj2 = Q;
            if (Q == o430Var) {
                a1 a1Var = new a1(18);
                btsVar.o0(a1Var);
                obj2 = a1Var;
            }
            btsVar.t(false);
            oz40 oz40Var = (oz40) cvw.V(objArr, (sls) obj2, btsVar, 48);
            p.d(null, null, false, btsVar, 0, 7);
            SocialContentData data = bouncerUiState$SocialAction.getData();
            boolean z = data instanceof SocialContentData.BrowserOnly;
            zy11 zy11Var = zy11.a;
            if (z) {
                btsVar.e0(1300487013);
                c cVar = new c();
                btsVar.e0(-927876072);
                int i5 = i3 & 112;
                boolean k = btsVar.k(socialActionReporter) | btsVar.e(wishSource) | (i5 == 32);
                Object Q2 = btsVar.Q();
                Object obj3 = Q2;
                if (k || Q2 == o430Var) {
                    tls tlsVar = new tls() { // from class: com.yandex.passport.internal.ui.bouncer.social.a
                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            int i6 = i4;
                            zy11 zy11Var2 = zy11.a;
                            BouncerUiState$SocialAction bouncerUiState$SocialAction2 = bouncerUiState$SocialAction;
                            t tVar = wishSource;
                            v0 v0Var = socialActionReporter;
                            switch (i6) {
                                case 0:
                                    Uri uri = (Uri) obj4;
                                    String queryParameter = uri != null ? uri.getQueryParameter("task_id") : null;
                                    SocialActionReporter$Flow socialActionReporter$Flow = SocialActionReporter$Flow.BROWSER;
                                    boolean z2 = queryParameter == null;
                                    v0Var.getClass();
                                    v0Var.f(jb.w, new md(socialActionReporter$Flow.getValue(), 25, false), new i(z2, 18));
                                    if (queryParameter == null) {
                                        tVar.a(f2.b);
                                        break;
                                    } else {
                                        tVar.a(new k2(queryParameter, ((SocialContentData.BrowserOnly) bouncerUiState$SocialAction2.getData()).getAmUri().toString()));
                                        break;
                                    }
                                default:
                                    Result result = (Result) obj4;
                                    SocialActionReporter$Flow socialActionReporter$Flow2 = SocialActionReporter$Flow.ESIA_APP_2_APP;
                                    Object value = result.getValue();
                                    if (value instanceof Result.Failure) {
                                        value = null;
                                    }
                                    com.yandex.passport.internal.social.esia.c cVar2 = (com.yandex.passport.internal.social.esia.c) value;
                                    boolean z3 = (cVar2 != null ? cVar2.a : null) == null;
                                    v0Var.getClass();
                                    v0Var.f(jb.w, new md(socialActionReporter$Flow2.getValue(), 25, false), new i(z3, 18));
                                    Object value2 = result.getValue();
                                    if (!(value2 instanceof Result.Failure)) {
                                        tVar.a(new k2(((com.yandex.passport.internal.social.esia.c) value2).a, ((SocialContentData.EsiaApp2App) bouncerUiState$SocialAction2.getData()).getAmUri().toString()));
                                    }
                                    if (Result.a(value2) != null) {
                                        tVar.a(f2.b);
                                        break;
                                    }
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar.o0(tlsVar);
                    obj3 = tlsVar;
                }
                btsVar.t(false);
                yd00 e = kla1.e(cVar, (tls) obj3, btsVar, 0);
                if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    btsVar.e0(-927849341);
                    boolean e2 = btsVar.e(e) | (i5 == 32) | btsVar.k(oz40Var);
                    Object Q3 = btsVar.Q();
                    Object obj4 = Q3;
                    if (e2 || Q3 == o430Var) {
                        BouncerSocialContentKt$BouncerSocialContent$1$1 bouncerSocialContentKt$BouncerSocialContent$1$1 = new BouncerSocialContentKt$BouncerSocialContent$1$1(e, bouncerUiState$SocialAction, oz40Var, null);
                        btsVar.o0(bouncerSocialContentKt$BouncerSocialContent$1$1);
                        obj4 = bouncerSocialContentKt$BouncerSocialContent$1$1;
                    }
                    btsVar.t(false);
                    zpn.e(btsVar, (wls) obj4, zy11Var);
                }
                btsVar.t(false);
            } else {
                if (!(data instanceof SocialContentData.EsiaApp2App)) {
                    throw unr0.y(-927880798, btsVar, false);
                }
                btsVar.e0(1301788486);
                EsiaBindActivity.a aVar = new EsiaBindActivity.a();
                btsVar.e0(-927834245);
                int i6 = i3 & 112;
                boolean k2 = btsVar.k(socialActionReporter) | btsVar.e(wishSource) | (i6 == 32);
                Object Q4 = btsVar.Q();
                if (k2 || Q4 == o430Var) {
                    i2 = 1;
                    tls tlsVar2 = new tls() { // from class: com.yandex.passport.internal.ui.bouncer.social.a
                        @Override // defpackage.tls
                        public final Object invoke(Object obj42) {
                            int i62 = i2;
                            zy11 zy11Var2 = zy11.a;
                            BouncerUiState$SocialAction bouncerUiState$SocialAction2 = bouncerUiState$SocialAction;
                            t tVar = wishSource;
                            v0 v0Var = socialActionReporter;
                            switch (i62) {
                                case 0:
                                    Uri uri = (Uri) obj42;
                                    String queryParameter = uri != null ? uri.getQueryParameter("task_id") : null;
                                    SocialActionReporter$Flow socialActionReporter$Flow = SocialActionReporter$Flow.BROWSER;
                                    boolean z2 = queryParameter == null;
                                    v0Var.getClass();
                                    v0Var.f(jb.w, new md(socialActionReporter$Flow.getValue(), 25, false), new i(z2, 18));
                                    if (queryParameter == null) {
                                        tVar.a(f2.b);
                                        break;
                                    } else {
                                        tVar.a(new k2(queryParameter, ((SocialContentData.BrowserOnly) bouncerUiState$SocialAction2.getData()).getAmUri().toString()));
                                        break;
                                    }
                                default:
                                    Result result = (Result) obj42;
                                    SocialActionReporter$Flow socialActionReporter$Flow2 = SocialActionReporter$Flow.ESIA_APP_2_APP;
                                    Object value = result.getValue();
                                    if (value instanceof Result.Failure) {
                                        value = null;
                                    }
                                    com.yandex.passport.internal.social.esia.c cVar2 = (com.yandex.passport.internal.social.esia.c) value;
                                    boolean z3 = (cVar2 != null ? cVar2.a : null) == null;
                                    v0Var.getClass();
                                    v0Var.f(jb.w, new md(socialActionReporter$Flow2.getValue(), 25, false), new i(z3, 18));
                                    Object value2 = result.getValue();
                                    if (!(value2 instanceof Result.Failure)) {
                                        tVar.a(new k2(((com.yandex.passport.internal.social.esia.c) value2).a, ((SocialContentData.EsiaApp2App) bouncerUiState$SocialAction2.getData()).getAmUri().toString()));
                                    }
                                    if (Result.a(value2) != null) {
                                        tVar.a(f2.b);
                                        break;
                                    }
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar.o0(tlsVar2);
                    obj = tlsVar2;
                } else {
                    i2 = 1;
                    obj = Q4;
                }
                btsVar.t(false);
                yd00 e3 = kla1.e(aVar, (tls) obj, btsVar, 0);
                if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    btsVar.e0(-927808381);
                    int i7 = (btsVar.e(e3) ? 1 : 0) | (i6 != 32 ? 0 : i2) | (btsVar.k(oz40Var) ? 1 : 0);
                    Object Q5 = btsVar.Q();
                    Object obj5 = Q5;
                    if (i7 != 0 || Q5 == o430Var) {
                        BouncerSocialContentKt$BouncerSocialContent$2$1 bouncerSocialContentKt$BouncerSocialContent$2$1 = new BouncerSocialContentKt$BouncerSocialContent$2$1(e3, bouncerUiState$SocialAction, oz40Var, null);
                        btsVar.o0(bouncerSocialContentKt$BouncerSocialContent$2$1);
                        obj5 = bouncerSocialContentKt$BouncerSocialContent$2$1;
                    }
                    btsVar.t(false);
                    zpn.e(btsVar, (wls) obj5, zy11Var);
                }
                btsVar.t(false);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, bouncerUiState$SocialAction, i, 11);
        }
    }
}
