package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: TabbarSettingsModalChooseGroup.kt */
/* loaded from: classes6.dex */
public final class yvn0 {

    /* compiled from: TabbarSettingsModalChooseGroup.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<UserId, s3q0> b;
        public final /* synthetic */ sh00 c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super UserId, s3q0> izsVar, sh00 sh00Var) {
            this.b = izsVar;
            this.c = sh00Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(this.c.a);
            return s3q0.a;
        }
    }

    /* compiled from: TabbarSettingsModalChooseGroup.kt */
    public static final class b implements izs<tgi0, s3q0> {
        public static final b b = new b();

        @Override // xsna.izs
        public final s3q0 invoke(tgi0 tgi0Var) {
            qgi0.h(tgi0Var, "");
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ d230 b;
        public final /* synthetic */ wow c;

        public c(d230 d230Var, wow wowVar) {
            this.b = d230Var;
            this.c = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return this.b.invoke(this.c.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public d(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ izs c;

        public e(wow wowVar, izs izsVar) {
            this.b = wowVar;
            this.c = izsVar;
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
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                sh00 sh00Var = (sh00) this.b.b.get(intValue);
                aVar2.K(-1917521867);
                q630 h = txj0.h(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1, q630.a.a), 40.0f);
                izs izsVar = this.c;
                boolean J = aVar2.J(izsVar) | aVar2.y(sh00Var);
                Object x = aVar2.x();
                Object obj = a.C0011a.a;
                if (J || x == obj) {
                    x = new a(izsVar, sh00Var);
                    aVar2.R(x);
                }
                q630 E = ahn.E(ojc.c(h, false, null, null, (gzs) x, 15), "CHOOSE_MANAGE_COMMUNITY_TITLE_TABBAR_TAG");
                lg90 l = fwu0.l(js5.a((int) (cn70.a() * 28.0f), sh00Var.c), null, null, null, aVar2, 0, 62);
                Object x2 = aVar2.x();
                if (x2 == obj) {
                    x2 = b.b;
                    aVar2.R(x2);
                }
                wiu0.b(E, false, com.vk.core.compose.component.cell.content.e.b(phw.a.a(l, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar2, 196616, 14), 28.0f, null, aVar2, 100663344, 252), Cell$Middle.a.a(Cell$Middle.d.b.a(sh00Var.b, null, null, 1, null, null, aVar2, 12610560, 102), null, null, null, aVar2, 196608, 30), null, null, null, aVar2, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
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

    public static final void a(List list, izs izsVar, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1883209143);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1883209143, i2, -1, "com.vk.tabbar.settings.impl.compose.ContentTabbarSettingsModalChooseGroup (TabbarSettingsModalChooseGroup.kt:69)");
            }
            String N = d370.N(R.string.tabbar_settings_choose_community, 0, M);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(N, null, null, null, null, M, 196608, 30);
            boolean J = M.J(N);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new bsf(N, 2);
                M.R(x);
            }
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(a3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 6);
            String N2 = d370.N(R.string.close, 0, M);
            boolean z = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new vhk(2, gzsVar);
                M.R(x2);
            }
            muv0.h(a4, null, null, null, null, TopBar$Before.d.a.a(N2, (gzs) x2, null, null, M, 24576, 12), null, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 100663296, 0, 7902);
            f9t.e(txj0.h(aVar2, 2.0f), M, 6);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new tn0(28, list, izsVar);
                M.R(x3);
            }
            x1v0.a(null, null, null, null, null, null, false, null, (izs) x3, M, 0, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bqg(list, izsVar, gzsVar, i, 6);
        }
    }

    public static final void b(List list, izs izsVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1632467545);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1632467545, i2, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsModalChooseGroup (TabbarSettingsModalChooseGroup.kt:45)");
            }
            Mode mode = Mode.DynamicHeight;
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "MODAL_CHOOSE_GROUP_TAG");
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new l70(3, gzsVar);
                M.R(x);
            }
            aVar2 = M;
            a030.b(mode, (gzs) x, E, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, new mw0((byte) 0, 7), false, null, null, false, null, null, kai.c(-1181402569, new wkl0(list, izsVar, gzsVar), M), aVar2, 805306758, 100663296, 259576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new zdl0(list, izsVar, gzsVar, q630Var2, i);
        }
    }
}
