package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.u7p0;

/* compiled from: InviteFriendsMviViewExt.kt */
/* loaded from: classes14.dex */
public final class nrx {
    public static final void a(krx krxVar, g48 g48Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-108331595);
        int i2 = i | (M.J(g48Var) ? 32 : 16) | 384 | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-108331595, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsBottomBar (InviteFriendsMviViewExt.kt:65)");
            }
            boolean z = g48Var != null;
            rpp e = anp.e(null, 3);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new wr0(26);
                M.R(x);
            }
            rpp b = e.b(anp.m(null, (izs) x, 1));
            e5q b2 = anp.p(3, null).b(anp.f(null, 3));
            jai c = kai.c(1880288909, new azf(1, g48Var, izsVar), M);
            q630.a aVar2 = q630.a.a;
            mm2.f(z, aVar2, b, b2, null, c, M, 200112, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j3m(krxVar, g48Var, q630Var2, izsVar, i);
        }
    }

    public static final void b(krx krxVar, u7p0 u7p0Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        final u7p0 u7p0Var2;
        final izs izsVar2;
        q630 q630Var2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> mrxVar;
        u7p0.a aVar2 = u7p0Var.b;
        androidx.compose.runtime.a M = aVar.M(1932192757);
        int i2 = i | (M.J(u7p0Var) ? 32 : 16) | 384 | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1932192757, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsTopBar (InviteFriendsMviViewExt.kt:25)");
            }
            String d = kq01.d(u7p0Var.a, M);
            if (d == null) {
                d = zq.a(M, 1411375137, R.string.invite_to_community, M, 0);
            } else {
                M.K(1411374145);
                M.j();
            }
            final String str = d;
            if (aVar2 == null) {
                M.K(803059333);
                TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, 196608, 30), null, null, null, M, 14);
                String N = d370.N(R.string.accessibility_close, 0, M);
                boolean z = (i2 & 7168) == 2048;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new m77(izsVar, 5);
                    M.R(x);
                }
                muv0.h(a, null, null, null, null, TopBar$Before.d.a.a(N, (gzs) x, null, null, M, 24576, 12), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    mrxVar = new n77(krxVar, u7p0Var, izsVar, i, 2);
                    s.d = mrxVar;
                }
                return;
            }
            u7p0Var2 = u7p0Var;
            izsVar2 = izsVar;
            M.K(801862733);
            M.j();
            xh2.a(Boolean.valueOf(aVar2.b), null, null, null, null, null, kai.c(1495525880, new zzs() { // from class: xsna.lrx
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1495525880, intValue, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsTopBar.<anonymous> (InviteFriendsMviViewExt.kt:44)");
                    }
                    u7p0 u7p0Var3 = u7p0.this;
                    izs izsVar3 = izsVar2;
                    if (booleanValue) {
                        aVar3.K(1515771307);
                        ksx.b(0, aVar3, u7p0Var3.b.a, izsVar3, q630.a.a);
                        aVar3.j();
                    } else {
                        aVar3.K(1515966824);
                        ksx.a(str, null, u7p0Var3.b.a, izsVar3, aVar3, 0);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1572864, 62);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            u7p0Var2 = u7p0Var;
            izsVar2 = izsVar;
            M.h();
            q630Var2 = q630Var;
        }
        s = M.s();
        if (s != null) {
            mrxVar = new mrx(krxVar, u7p0Var2, q630Var2, izsVar2, i);
            s.d = mrxVar;
        }
    }
}
