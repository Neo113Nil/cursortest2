package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.uze0;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q3h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q3h(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ColorFilter porterDuffColorFilter;
        switch (this.b) {
            case 0:
                d4h d4hVar = (d4h) this.c;
                uch uchVar = (uch) this.d;
                Address address = (Address) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId e = fkq0.e(d4hVar.m);
                String str = uchVar.c;
                Context mo2getContext = d3hVar.a.mo2getContext();
                if (mo2getContext != null) {
                    xqg.b((xqg) d3hVar.r.getValue(), mo2getContext, e, str, address, null, booleanValue, null, 80);
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((q6x) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                mze0 mze0Var = (mze0) this.c;
                wh50 wh50Var = (wh50) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1808050440, intValue, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.Content.<anonymous> (ReactedPeersModal.kt:90)");
                    }
                    boolean z = ((Configuration) aVar.r(AndroidCompositionLocals_androidKt.a)).orientation == 2;
                    q630.a aVar2 = q630.a.a;
                    q630 m = hr80.m(txj0.c(txj0.f(s200.D(aVar2, 8), 1.0f), z ? 1.0f : 0.5f), wlb0.h(aVar).getBackground().r, vog0.b(12));
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar, c, dVar);
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c2 = qri.c(aVar, aVar2);
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cVar);
                    k9q0.w(aVar, D2, eVar);
                    ur.d(hashCode2, aVar, bVar, aVar, c2678a);
                    k9q0.w(aVar, c2, dVar);
                    ty6.b bVar2 = dt1.a.l;
                    q630 D3 = s200.D(aVar2, 4);
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar2, aVar, 48);
                    int hashCode3 = Long.hashCode(n34.n(aVar));
                    sy90 D4 = aVar.D();
                    q630 c3 = qri.c(aVar, D3);
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a2, cVar);
                    k9q0.w(aVar, D4, eVar);
                    ur.d(hashCode3, aVar, bVar, aVar, c2678a);
                    k9q0.w(aVar, c3, dVar);
                    lg90 a3 = pg90.a(R.drawable.vk_icon_cancel_outline_28, 0, aVar);
                    String string = mze0Var.getString(R.string.close);
                    long j = wlb0.h(aVar).getIcon().b;
                    int i = 5;
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        i = 5;
                    }
                    oe7 oe7Var = new oe7(j, i, porterDuffColorFilter);
                    q630 q = txj0.q(aVar2, 48);
                    boolean y = aVar.y(mze0Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new z4d0(mze0Var, 3);
                        aVar.R(x);
                    }
                    vjw.a(a3, string, ojc.c(q, false, null, null, (gzs) x, 15), null, wkj.a.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, aVar, 24584, 40);
                    yqv0.c(mze0Var.getString(R.string.im_reacted_peers_modal_title), null, wlb0.h(aVar).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar).g, aVar, 0, 0, 8186);
                    androidx.compose.runtime.a aVar4 = aVar;
                    aVar4.G();
                    uze0 uze0Var = (uze0) wh50Var.getValue();
                    if (epx.f(uze0Var, uze0.b.a)) {
                        aVar4.K(-267275656);
                        q630 f = txj0.f(aVar2, 1.0f);
                        cp10 d2 = ja8.d(dt1.a.f, false);
                        int hashCode4 = Long.hashCode(n34.n(aVar4));
                        sy90 D5 = aVar4.D();
                        q630 c4 = qri.c(aVar4, f);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar3);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, d2, cVar);
                        k9q0.w(aVar4, D5, eVar);
                        ur.d(hashCode4, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c4, dVar);
                        x2e0.b(null, wlb0.h(aVar4).getIcon().f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0, aVar4, 0, 29);
                        aVar4.G();
                        aVar4.j();
                    } else if (uze0Var instanceof uze0.c) {
                        aVar4.K(-266956325);
                        eze0 eze0Var = ((uze0.c) ((uze0) wh50Var.getValue())).a;
                        boolean y2 = aVar4.y(mze0Var);
                        Object x2 = aVar4.x();
                        if (y2 || x2 == c0012a) {
                            x2 = new lw20(mze0Var, 25);
                            aVar4.R(x2);
                        }
                        mze0Var.fo(eze0Var, (izs) x2, aVar4, 0);
                        aVar4.j();
                    } else {
                        if (!epx.f(uze0Var, uze0.a.a)) {
                            throw alb0.c(1515397654, aVar4);
                        }
                        aVar4.K(-266519876);
                        yqv0.c(mze0Var.getString(R.string.loading_error), s200.D(aVar2, 16), wlb0.h(aVar4).getText().k, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar4).D, aVar4, 48, 0, 8184);
                        aVar4 = aVar4;
                        aVar4.j();
                    }
                    if (kr.f(aVar4)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ q3h(q6x q6xVar, znj znjVar, int i) {
        this.b = 1;
        this.c = q6xVar;
        this.d = znjVar;
    }
}
