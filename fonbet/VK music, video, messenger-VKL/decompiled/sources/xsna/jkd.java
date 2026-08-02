package xsna;

import android.content.res.Resources;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.g8s;
import xsna.h8s;
import xsna.jpl0;
import xsna.q630;
import xsna.q8z;
import xsna.s2x;
import xsna.sdh0;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jkd implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jkd(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        us2 n;
        int i;
        switch (this.b) {
            case 0:
                kkd kkdVar = (kkd) this.c;
                jai jaiVar = (jai) this.d;
                ((Integer) obj2).getClass();
                kkdVar.b(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar);
                return s3q0.a;
            case 1:
                final izs izsVar = (izs) this.c;
                final wqh wqhVar = (wqh) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1813501039, intValue, -1, "com.vk.music.screens.about.CommunityProfileLinksScreen.<anonymous> (CommunityProfileLinksComponent.kt:36)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    phv0.b(txj0.d(q630.a.a, 1.0f), kai.c(143141336, new a86(izsVar, 5), aVar), null, null, null, 0, ylu0Var.d().a, 0L, kai.c(1653378797, new yzs() { // from class: xsna.kqh
                        @Override // xsna.yzs
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1653378797, intValue2, -1, "com.vk.music.screens.about.CommunityProfileLinksScreen.<anonymous>.<anonymous> (CommunityProfileLinksComponent.kt:47)");
                                }
                                pqh.a(wqh.this, izsVar, null, aVar2, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 805306422, 380);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                fsk fskVar = (fsk) this.c;
                jai jaiVar2 = (jai) this.d;
                ((Integer) obj2).getClass();
                fskVar.k(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar2);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                qsp.a((rsp) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((k150) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                nmo nmoVar = (nmo) this.c;
                hod0 hod0Var = (hod0) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-574623630, intValue2, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterDropdownHolder.bind.<anonymous>.<anonymous> (ProductFilterDropdownHolder.kt:33)");
                    }
                    boolean y = aVar2.y(nmoVar);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new w910(nmoVar, 16);
                        aVar2.R(x);
                    }
                    com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    wqd0 wqd0Var = nmoVar.e;
                    if (wqd0Var == null || (str = wqd0Var.c) == null) {
                        str = "";
                    }
                    String str2 = nmoVar.h;
                    boolean y2 = aVar2.y(hod0Var) | aVar2.y(nmoVar);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new com.vk.movika.sdk.base.ui.p(17, hod0Var, nmoVar);
                        aVar2.R(x2);
                    }
                    u2x a2 = g8s.b.a.a(s2x.b.a.a(str, (gzs) x2, str2, 0L, null, a, aVar2, 805306368, 248), null, nmoVar.k, null, aVar2, 24576, 10);
                    String str3 = nmoVar.i;
                    nvu0.a(a2, q630.a.a, h8s.a.a(str3 == null ? "" : str3, false, null, null, null, aVar2, 196608, 30), null, null, aVar2, 48, 24);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                lll0.b((izs) this.c, (jpl0.a.d) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                final szm0 szm0Var = (szm0) this.c;
                sdh0 sdh0Var = (sdh0) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-981719747, intValue3, -1, "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder.setContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubscriptionProposalHolder.kt:210)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var2.getText().m;
                    Resources resources = szm0Var.c;
                    String string = resources.getString(R.string.video_screencast_subscription_proposal_offer);
                    String string2 = resources.getString(R.string.video_screencast_subscription_proposal_license);
                    String string3 = resources.getString(R.string.video_screencast_subscription_proposal_policy);
                    String string4 = resources.getString(R.string.video_screencast_subscription_proposal_conditions, string, string2, string3);
                    try {
                        us2.b bVar = new us2.b(string4);
                        int K = drm0.K(0, 2, string4, string, true);
                        bVar.a(new q8z.a(string, new tjo0(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, (hik0) null, 14), new i9z() { // from class: xsna.kzm0
                            @Override // xsna.i9z
                            public final void a(q8z q8zVar) {
                                szm0.this.g.invoke(new c.v0("https://money.mail.ru/oferta/payfast"));
                            }
                        }), K, string.length() + K);
                        int K2 = drm0.K(0, 2, string4, string2, true);
                        bVar.a(new q8z.a(string2, new tjo0(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, (hik0) null, 14), new i9z() { // from class: xsna.lzm0
                            @Override // xsna.i9z
                            public final void a(q8z q8zVar) {
                                szm0.this.g.invoke(new c.v0("https://music.vk.ru/rules/videosub"));
                            }
                        }), K2, string2.length() + K2);
                        int K3 = drm0.K(0, 2, string4, string3, true);
                        bVar.a(new q8z.a(string3, new tjo0(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, (hik0) null, 14), new i9z() { // from class: xsna.mzm0
                            @Override // xsna.i9z
                            public final void a(q8z q8zVar) {
                                szm0.this.g.invoke(new c.v0("https://vkvideo.ru/legal/privacy"));
                            }
                        }), K3, string3.length() + K3);
                        n = bVar.n();
                    } catch (Exception unused) {
                        n = new us2.b(string4).n();
                    }
                    us2 us2Var = n;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var3.getText().p;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.M0;
                    boolean z = ((sdh0.b) sdh0Var).c;
                    if (z) {
                        i = 20;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 8;
                    }
                    yqv0.d(us2Var, txj0.f(txj0.z(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, 7), null, 3), 1.0f), j2, 3, null, 0, false, 0, null, null, frv0Var, aVar3, 0, 0, 8120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                jxn0.c(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ jkd(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
