package xsna;

import android.text.TextUtils;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.requests.WallGetMain;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.Pair;
import xsna.khw0;
import xsna.uhu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class thu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ thu(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if ((((java.lang.Math.min(r2.c, r3.c) - java.lang.Math.max(r2.a, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * (java.lang.Math.min(r2.d, r3.d) - java.lang.Math.max(r2.b, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) / (((int) (r13.a() >> 32)) * ((int) (r13.a() & 4294967295L)))) >= 1.0f) goto L12;
     */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Pair<String, String> pair;
        switch (this.b) {
            case 0:
                uhu uhuVar = (uhu) this.d;
                uhu.a.b bVar = (uhu.a.b) this.e;
                wt2 wt2Var = (wt2) obj;
                uhuVar.p.a(false);
                VoipCallSource voipCallSource = uhuVar.l;
                if (voipCallSource == null) {
                    voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.JOIN_DEEPLINK, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE_ANONYMOUS);
                }
                uhuVar.o.d(new khw0.a(jnw0.b(wt2Var, this.c, true), voipCallSource, null, null, null, 28));
                bVar.invoke();
                break;
            case 1:
                GroupCardItemVh groupCardItemVh = (GroupCardItemVh) this.d;
                Group group = (Group) this.e;
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) obj;
                int i = group.C;
                boolean z = group.j;
                boolean l = groupCardItemVh.l(group);
                groupCardItemVh.t = GroupSubscriptionState.NotSubscribed;
                groupCardItemVh.s(group);
                o0r0 e = xwk.e();
                UserId e2 = fkq0.e(group.c);
                UIBlockGroup uIBlockGroup = groupCardItemVh.e;
                groupCardItemVh.u = o0r0.e(e, e2, uIBlockGroup != null ? uIBlockGroup.r() : null, null, adminLeaveAction, 4).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new mf1(new aju(l, group, this.c, groupCardItemVh), 28), new ubq(new bju(group, i, z, groupCardItemVh), 6));
                break;
            case 2:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                lsq0 lsq0Var = (lsq0) this.e;
                ?? r2 = lsq0Var.r0;
                WallGetMain.Result result = (WallGetMain.Result) obj;
                boolean f = epx.f(cVar.j(), "0");
                cVar.s(result.s1());
                sa30 sa30Var = lsq0Var.g0;
                pxq0 pxq0Var = lsq0Var.d0;
                boolean z2 = this.c;
                boolean z3 = z2 || f;
                if (z3) {
                    lsq0Var.n0 = 0;
                }
                if (!z3 || result.isEmpty()) {
                    lsq0Var.n0 = result.size() + lsq0Var.n0;
                } else {
                    NewsEntry newsEntry = result.get(0);
                    lsq0Var.m0 = (na60.e(newsEntry) && na60.f(newsEntry)) ? Integer.valueOf(di60.u(newsEntry)) : null;
                    lsq0Var.n0 = result.size();
                }
                Integer num = lsq0Var.m0;
                sa30Var.getClass();
                sa30.g(result, num);
                pxq0Var.g3();
                lsq0Var.f0();
                if (!z2) {
                    sa30.N(result, lsq0Var.d);
                }
                pxq0Var.v0(lsq0Var.n0);
                if (!result.isEmpty()) {
                    lsq0Var.o(result, null);
                    com.vk.lists.c cVar2 = lsq0Var.g;
                    if (cVar2 != null) {
                        cVar2.s(result.s1());
                    }
                    lsq0Var.g0();
                    if (((Boolean) lsq0Var.u0.getValue()).booleanValue() && lsq0Var.e0.a(lsq0Var.h0) && !lsq0Var.d0().n() && epx.f(lsq0Var.i0, Boolean.TRUE) && lsq0Var.d0().p(HintId.USER_PROFILE_MAIN_WALL_POST_OPTIONS_ONBOARDING.getId()) == null && (pair = lsq0Var.j0) != null) {
                        String d = pair.d();
                        String g = pair.g();
                        ((q7v0) r2.getValue()).init();
                        ((q7v0) r2.getValue()).c(new z2d0(lsq0Var, d, g, 4));
                    }
                }
                if (f) {
                    pxq0Var.Jk();
                }
                if (TextUtils.isEmpty(result.s1()) || result.isEmpty()) {
                    cVar.r(false);
                }
                if (z2 && lsq0Var.l0 != null) {
                    pxq0Var.Ne();
                    lsq0Var.l0 = null;
                }
                pxq0Var.g3();
                break;
            default:
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                tny tnyVar = (tny) obj;
                wh50Var.setValue(tnyVar);
                if (this.c) {
                    boolean z4 = true;
                    zhf0 j = jgz.j(tnyVar, true);
                    tny y = tnyVar.y();
                    if (y != null) {
                        zhf0 j2 = jgz.j(y, true);
                        break;
                    }
                    z4 = false;
                    wh50Var2.setValue(Boolean.valueOf(z4));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ thu(uhu uhuVar, boolean z, uhu.a.b bVar) {
        this.b = 0;
        this.d = uhuVar;
        this.c = z;
        this.e = bVar;
    }

    public /* synthetic */ thu(boolean z, wh50 wh50Var, wh50 wh50Var2) {
        this.b = 3;
        this.c = z;
        this.d = wh50Var;
        this.e = wh50Var2;
    }
}
