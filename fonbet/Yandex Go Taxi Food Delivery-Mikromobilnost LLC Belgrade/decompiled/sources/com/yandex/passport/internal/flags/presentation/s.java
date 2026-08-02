package com.yandex.passport.internal.flags.presentation;

import android.webkit.WebView;
import com.google.ar.core.ImageMetadata;
import com.yandex.passport.api.c3;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import defpackage.agc;
import defpackage.bts;
import defpackage.cyk0;
import defpackage.dgc;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.lfb1;
import defpackage.m4m0;
import defpackage.qke;
import defpackage.rfb1;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class s implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.w;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                rfb1.a(null, cyk0.c(16.0f), lfb1.a(((agc) ((bts) fidVar).m(dgc.a)).F, 0L, 0L, fidVar, 14), null, wwg.S(1802052158, true, new r((u) obj5, (sls) obj4, (sls) obj6, (tls) obj3), fidVar), fidVar, ImageMetadata.EDGE_MODE, 25);
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c(((com.yandex.passport.internal.ui.challenge.logout.v) obj5).b, fidVar2), false, wwg.S(-366852676, true, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q(i2, (LogoutBottomSheetComposeActivity) obj4, (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s) obj6, (PassportLogoutPropertiesImpl) obj3), fidVar2), fidVar2, 384, 2);
                return zy11Var;
            default:
                f530 f530Var = (f530) obj6;
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        return zy11Var;
                    }
                }
                com.yandex.passport.user_id.models.h hVar = (com.yandex.passport.user_id.models.h) obj5;
                if (jl40.l(hVar, com.yandex.passport.user_id.models.f.a)) {
                    bts btsVar4 = (bts) fidVar3;
                    btsVar4.e0(-432733826);
                    if (((c3) obj4).getShowLoading()) {
                        com.yandex.passport.user_id.ui.f.a(m4m0.b(f530Var, ((agc) btsVar4.m(dgc.a)).n, qke.q), btsVar4, 0);
                    }
                    btsVar4.t(false);
                } else {
                    if (!jl40.l(hVar, com.yandex.passport.user_id.models.g.a)) {
                        throw unr0.y(-291055430, (bts) fidVar3, false);
                    }
                    bts btsVar5 = (bts) fidVar3;
                    btsVar5.e0(-432455508);
                    com.yandex.passport.user_id.ui.f.b(f530Var, (WebView) obj3, btsVar5, 0);
                    btsVar5.t(false);
                }
                return zy11Var;
        }
    }
}
