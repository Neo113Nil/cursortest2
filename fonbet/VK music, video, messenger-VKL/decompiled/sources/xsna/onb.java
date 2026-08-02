package xsna;

import androidx.compose.runtime.a;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.im.engine.models.messages.Msg;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.p4i;
import xsna.q630;
import xsna.wmb;
import xsna.wra0;
import xsna.xn50;
import xsna.zra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class onb implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ onb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.b) {
            case 0:
                ynb ynbVar = (ynb) this.c;
                wmb.k kVar = new wmb.k(((Msg) this.d).d, (Integer) obj, (Integer) obj2);
                ynbVar.getClass();
                xn50.a.c(ynbVar, kVar);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((kkd) this.c).a((gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                p4i p4iVar = (p4i) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                ((Integer) obj2).getClass();
                return new p4i.a(p4iVar, false, (RecyclerView) obj, recyclerView, null, 16);
            case 3:
                nk40 nk40Var = (nk40) this.c;
                Map map = (Map) this.d;
                UIBlockList uIBlockList = (UIBlockList) obj;
                nk40Var.getClass();
                edi.y(uIBlockList, new l22(19, map, nk40Var), new vam(map, 29));
                return uIBlockList;
            case 4:
                ((Integer) obj2).getClass();
                web0.a((gzs) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                kmd0.a(ne7.I(49), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                return s3q0.a;
            case 6:
                szm0 szm0Var = (szm0) this.c;
                sdh0 sdh0Var = (sdh0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z = false;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2071631040, intValue, -1, "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder.setContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubscriptionProposalHolder.kt:169)");
                    }
                    vl20 a = zra0.a.a(d370.N(R.string.video_screencast_subscription_proposal_title, 0, aVar), null, d370.N(R.string.video_screencast_subscription_proposal_description, 0, aVar), null, aVar, 196608, 26);
                    if (szm0Var.d.b() && szm0Var.j != 0) {
                        z = true;
                    }
                    if (z) {
                        i = R.string.video_screencast_subscription_proposal_button_subscribe;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.video_screencast_subscription_proposal_button_subscribe_anonymous;
                    }
                    String O = d370.O(i, new Object[]{String.valueOf(szm0Var.j)}, aVar);
                    boolean J = aVar.J(szm0Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new z260(szm0Var, 29);
                        aVar.R(x);
                    }
                    y48 a2 = wra0.b.a(wra0.a.C3954a.a(O, (gzs) x, ButtonSize.Small, ButtonStyle.Primary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, aVar, 28032, 12582912, 131040), null, null, aVar, 14);
                    PlaceholderMode placeholderMode = PlaceholderMode.Overlay;
                    q630.a aVar2 = q630.a.a;
                    ldv0.d(s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.z(aVar2, null, 3)), null, a, a2, placeholderMode, null, false, aVar, 1597446, 34);
                    f9t.e(txj0.h(aVar2, 16), aVar, 6);
                    rrv0.e(true, null, null, null, null, null, kai.c(-981719747, new jkd(7, szm0Var, sdh0Var), aVar), aVar, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((com.vk.messagetemplates.impl.keyboard.b) this.c).b((ck3) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ onb(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
