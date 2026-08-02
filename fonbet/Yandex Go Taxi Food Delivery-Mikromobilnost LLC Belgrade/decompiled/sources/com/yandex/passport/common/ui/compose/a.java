package com.yandex.passport.common.ui.compose;

import android.webkit.WebView;
import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$CallConfirm;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.flags.presentation.c1;
import com.yandex.passport.internal.flags.presentation.v;
import com.yandex.passport.internal.flags.presentation.w;
import com.yandex.passport.internal.ui.bouncer.loading.h;
import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.internal.ui.bouncer.r;
import com.yandex.passport.internal.ui.bouncer.roundabout.n;
import com.yandex.passport.internal.ui.challenge.vpn.f;
import com.yandex.passport.internal.ui.challenge.webview.m;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.call.e;
import com.yandex.passport.internal.ui.domik.q;
import com.yandex.passport.internal.ui.sloth.webcard.h0;
import com.yandex.passport.internal.ui.sloth.webcard.k;
import defpackage.f530;
import defpackage.fid;
import defpackage.gw00;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(e eVar, q qVar) {
        this.a = 15;
        this.b = eVar;
        this.c = qVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                d.a((tpr) obj4, (wls) obj3, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c1.d((v) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c1.f((w) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                r.c((com.yandex.passport.internal.ui.bouncer.v) obj4, (c2) obj3, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                r.e((com.yandex.passport.internal.ui.bouncer.v) obj4, (v1) obj3, (fid) obj, vng.O(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                r.f((com.yandex.passport.internal.ui.bouncer.v) obj4, (x1) obj3, (fid) obj, vng.O(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                r.b((com.yandex.passport.internal.ui.bouncer.v) obj4, (u1) obj3, (fid) obj, vng.O(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                r.d((com.yandex.passport.internal.ui.bouncer.v) obj4, (z1) obj3, (fid) obj, vng.O(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.bouncer.fallback.a.a((com.yandex.passport.internal.ui.bouncer.v) obj4, (w1) obj3, (fid) obj, vng.O(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                h.a((com.yandex.passport.internal.ui.bouncer.v) obj4, (a2) obj3, (fid) obj, vng.O(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                n.a((com.yandex.passport.internal.ui.bouncer.v) obj4, (y1) obj3, (fid) obj, vng.O(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.bouncer.social.b.a((com.yandex.passport.internal.ui.bouncer.v) obj4, (BouncerUiState$SocialAction) obj3, (fid) obj, vng.O(1));
                break;
            case 12:
                fid fidVar = (fid) obj;
                ((Integer) obj2).getClass();
                int O = vng.O(49);
                com.yandex.passport.internal.ui.challenge.logout.bottomsheet.b.a(O, fidVar, (f530) obj3, (List) obj4);
                break;
            case 13:
                ((Integer) obj2).getClass();
                f.a((String) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                m.a((String) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 15:
                q qVar = (q) obj3;
                ((e) obj4).C.g(DomikScreenSuccessMessages$CallConfirm.successPhonishAuth);
                b0 b0Var = qVar.d;
                b0Var.d(b0Var.x, DomikStatefulReporter$Event.AUTH_SUCCESS, gw00.e(new Pair("unsubscribe_from_maillists", ((RegTrack) obj).getUnsubscribeMailing().getAnalyticStatus())));
                qVar.a.E.m((DomikResult) obj2);
                break;
            case 16:
                ((Integer) obj2).getClass();
                k.a((h0) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(49));
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.passport.user_id.ui.f.b((f530) obj4, (WebView) obj3, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
