package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState;
import java.util.Arrays;
import java.util.List;
import xsna.au00;
import xsna.cri;
import xsna.dt1;
import xsna.n1b0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mt implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mt(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = xzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d9  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        u1c0 u1c0Var;
        androidx.compose.runtime.a aVar;
        int i = this.b;
        q630.a aVar2 = q630.a.a;
        ol60 ol60Var = null;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rt.a((List) obj5, (mc90) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((wse) obj5).h((ite) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.reviews.impl.communities.yclients.b) obj5).h((com.vk.ecomm.reviews.impl.communities.yclients.i) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                kuj.b((q630) obj5, (gho0) obj3, (jai) obj4, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 4:
                Attachment attachment = (Attachment) obj5;
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj3;
                com.vk.lists.b<u1c0> bVar = entriesListPresenter.c;
                NewsEntry newsEntry = (NewsEntry) obj4;
                Integer num = (Integer) obj;
                u1c0 u1c0Var2 = (u1c0) obj2;
                if (u1c0Var2 instanceof u880) {
                    u880 u880Var = (u880) u1c0Var2;
                    if (lbs.a(u880Var, attachment)) {
                        u1c0Var = lbs.i(u880Var);
                        if (u1c0Var != null) {
                            ol60 ol60Var2 = u1c0Var2.h;
                            if (ol60Var2 != null) {
                                i2c0 i2c0Var = entriesListPresenter.B;
                                int i2 = u1c0Var2.c;
                                i2c0Var.getClass();
                                ol60Var = i2c0.s(i2, newsEntry, attachment, ol60Var2);
                            }
                            u1c0Var.h = ol60Var;
                            bVar.F(num.intValue(), u1c0Var);
                        }
                        if (u1c0Var2 instanceof w84) {
                            w84 w84Var = (w84) u1c0Var2;
                            if (w84Var.q.contains(attachment)) {
                                bVar.F(num.intValue(), lbs.e(w84Var, attachment));
                            }
                        }
                        return s3q0.a;
                    }
                }
                if (u1c0Var2 instanceof k5i) {
                    k5i k5iVar = (k5i) u1c0Var2;
                    if (epx.f(k5iVar.q, attachment)) {
                        u1c0Var = lbs.g(k5iVar, attachment);
                        if (u1c0Var != null) {
                        }
                        if (u1c0Var2 instanceof w84) {
                        }
                        return s3q0.a;
                    }
                }
                if (u1c0Var2 instanceof lsi) {
                    lsi lsiVar = (lsi) u1c0Var2;
                    if (epx.f(lsiVar.q, attachment)) {
                        u1c0Var = lbs.h(lsiVar, attachment);
                        if (u1c0Var != null) {
                        }
                        if (u1c0Var2 instanceof w84) {
                        }
                        return s3q0.a;
                    }
                }
                if (u1c0Var2 instanceof r74) {
                    r74 r74Var = (r74) u1c0Var2;
                    if (epx.f(r74Var.q, attachment)) {
                        u1c0Var = lbs.d(r74Var, attachment);
                        if (u1c0Var != null) {
                        }
                        if (u1c0Var2 instanceof w84) {
                        }
                        return s3q0.a;
                    }
                }
                u1c0Var = null;
                if (u1c0Var != null) {
                }
                if (u1c0Var2 instanceof w84) {
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                fk70.a((NotificationsState) obj5, (q630) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((i1b0) obj5).j((n1b0.b) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 7:
                yed0 yed0Var = (yed0) obj5;
                lfd0 lfd0Var = (lfd0) obj3;
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1381117795, intValue, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.ThemedContent.<anonymous> (PrivacySettingsContentView.kt:76)");
                    }
                    n0u0[] n0u0VarArr = {lfd0Var.a};
                    int i3 = ComposeView.n;
                    fm50 fm50Var = (fm50) yed0Var.d(ok50.a, (n0u0[]) Arrays.copyOf(n0u0VarArr, 1), aVar3, 512).getValue();
                    q630 f = txj0.f(aVar2, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    yed0Var.l(512, aVar3, izsVar, null);
                    if (fm50Var instanceof ifd0) {
                        aVar3.K(-1183833276);
                        aVar = aVar3;
                        yed0Var.j((ifd0) fm50Var, izsVar, null, aVar, 4096);
                    } else {
                        aVar = aVar3;
                        aVar.K(-1187724396);
                    }
                    aVar.j();
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 8:
                String str = (String) obj5;
                String str2 = (String) obj3;
                gzs gzsVar = (gzs) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(343095274, intValue2, -1, "com.vk.ecomm.market.good.ui.OzonPrimaryCallButtonContent.<anonymous> (ProductButtonsBinderImpl.kt:466)");
                    }
                    q630 E = ahn.E(aVar2, "product_card_cta_call_primary_button_compose");
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    qzu0.a.getClass();
                    lg90 G0 = qzu0.G0(aVar5);
                    uco ucoVar = new uco(byc0.b(53, 20));
                    Object x = aVar5.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new zos(19);
                        aVar5.R(x);
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    Object x2 = aVar5.x();
                    if (x2 == c0012a) {
                        x2 = new z410(14);
                        aVar5.R(x2);
                    }
                    zt00.a(gzsVar, buttonStyle, buttonAppearance, E, null, au00.b.a.a(str, null, G0, ucoVar, str2, a2, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar5, 805331456, 266), false, null, null, aVar5, X2.b.f, 2000);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 9:
                dmb0 dmb0Var = (dmb0) obj5;
                uxe0 uxe0Var = (uxe0) obj3;
                ((Float) obj2).getClass();
                ((wh50) obj4).setValue(Integer.valueOf(rxe0.d(Float.intBitsToFloat((int) (((xlb0) obj).c >> 32)), dmb0Var.I0(uxe0Var.a), dmb0Var.I0(uxe0Var.c))));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                img0.b(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj5, (izs) obj4, (q630) obj3);
                return s3q0.a;
        }
    }

    public /* synthetic */ mt(int i, String str, izs izsVar, q630 q630Var) {
        this.b = 10;
        this.d = str;
        this.c = izsVar;
        this.e = q630Var;
    }

    public /* synthetic */ mt(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }
}
