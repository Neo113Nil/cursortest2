package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class rze0 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ mze0 c;
    public final /* synthetic */ izs d;

    public rze0(ArrayList arrayList, mze0 mze0Var, izs izsVar) {
        this.b = arrayList;
        this.c = mze0Var;
        this.d = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            hv30 hv30Var = (hv30) this.b.get(intValue);
            aVar2.K(1068588879);
            qtd0 qtd0Var = hv30Var.b;
            int i2 = qtd0Var.B2() == UserSex.FEMALE ? R.plurals.im_msg_reacted_users_content_description_female : R.plurals.im_msg_reacted_users_content_description_male;
            String name = qtd0Var.name();
            mze0 mze0Var = this.c;
            Object F = d370.F(i2, 1, new Object[]{name, mze0Var.g1.c(hv30Var.a, mze0Var.requireContext())}, aVar2, 48);
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(txj0.h(aVar3, 40), 1.0f);
            String string = mze0Var.getString(R.string.im_msg_reaction_navigate_to_profile_of_reacted_user, qtd0Var.d6(UserNameCase.GEN));
            izs izsVar = this.d;
            boolean J = aVar2.J(izsVar) | aVar2.y(hv30Var);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new nze0(izsVar, hv30Var);
                aVar2.R(x);
            }
            float f2 = 16;
            q630 F2 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ojc.c(f, false, string, null, (gzs) x, 13));
            boolean J2 = aVar2.J(F);
            Object x2 = aVar2.x();
            if (J2 || x2 == obj) {
                x2 = new gd10(F, 1);
                aVar2.R(x2);
            }
            q630 b = egi0.b(F2, true, (izs) x2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar2, 48);
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, b);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c, cri.a.d);
            mze0Var.co(qtd0Var, aVar2, 0);
            String name2 = qtd0Var.name();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            q630 F3 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d = defpackage.j0.d(1.0f, F3, true);
            Object x3 = aVar2.x();
            if (x3 == obj) {
                x3 = oze0.c;
                aVar2.R(x3);
            }
            yqv0.c(name2, egi0.b(d, false, (izs) x3), j, null, null, 0, 0, null, 2, false, 0, 0, null, frv0Var, aVar2, 100663296, 0, 7928);
            mze0Var.ho(hv30Var.a, iah0.a(28), fki.a, aVar2, 384);
            aVar2.G();
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
