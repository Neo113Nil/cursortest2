package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.author.CircularAuthorViewHolder;
import com.vk.dto.group.Group;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialogViewState;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.Arrays;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cr7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cr7(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        wh50 c;
        int i = this.b;
        int i2 = 8;
        q630.a aVar = q630.a.a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                BookingMastersScreenFragmentMvi2 bookingMastersScreenFragmentMvi2 = (BookingMastersScreenFragmentMvi2) obj5;
                yw90 yw90Var = (yw90) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = BookingMastersScreenFragmentMvi2.S;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(179436386, intValue, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2.onCreateView.<anonymous>.<anonymous> (BookingMastersScreenFragmentMvi2.kt:87)");
                    }
                    nzw nzwVar = bookingMastersScreenFragmentMvi2.Q;
                    qcy<Object> qcyVar = BookingMastersScreenFragmentMvi2.S[0];
                    or7 or7Var = (or7) nzwVar.getValue();
                    View view = bookingMastersScreenFragmentMvi2.getView();
                    boolean y = aVar2.y(bookingMastersScreenFragmentMvi2);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new iz(bookingMastersScreenFragmentMvi2, 3);
                        aVar2.R(x);
                    }
                    mr7.a(or7Var, this.d, yw90Var, view, (izs) x, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar3 = (com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) obj5;
                z37 z37Var = (z37) obj3;
                gzs gzsVar = (gzs) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2006618810, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServices.<anonymous> (BookingServicesScreen.kt:129)");
                    }
                    boolean J = aVar4.J(z37Var);
                    Object x2 = aVar4.x();
                    if (J || x2 == c0012a) {
                        x2 = new com.vk.movika.sdk.base.observable.o(z37Var, i2);
                        aVar4.R(x2);
                    }
                    BookingServicesScreenKt.d(aVar3, (izs) x2, gzsVar, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                CircularAuthorViewHolder circularAuthorViewHolder = (CircularAuthorViewHolder) obj5;
                ComposeView composeView = (ComposeView) obj3;
                Group group = (Group) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1551631734, intValue3, -1, "com.vk.catalog2.common.ui.holders.author.CircularAuthorViewHolder.createView.<anonymous>.<anonymous>.<anonymous> (CircularAuthorViewHolder.kt:70)");
                    }
                    q630 d = rte0.d(txj0.v(aVar, 96), vog0.b(8));
                    boolean y2 = aVar5.y(circularAuthorViewHolder) | aVar5.y(composeView) | aVar5.y(group);
                    Object x3 = aVar5.x();
                    if (y2 || x3 == c0012a) {
                        x3 = new xo8(circularAuthorViewHolder, composeView, group, r11 ? 1 : 0);
                        aVar5.R(x3);
                    }
                    q630 c2 = ojc.c(d, false, null, null, (gzs) x3, 15);
                    float f = kqu0.r;
                    q630 G = s200.G(c2, f, f, f, kqu0.t);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar5, 48);
                    int hashCode = Long.hashCode(n34.n(aVar5));
                    sy90 D = aVar5.D();
                    q630 c3 = qri.c(aVar5, G);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar6);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, a, cri.a.f);
                    k9q0.w(aVar5, D, cri.a.e);
                    k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar5, cri.a.h);
                    k9q0.w(aVar5, c3, cri.a.d);
                    float f2 = 88;
                    vjw.a(fwu0.l(null, js5.a(iah0.a(f2), group.f), null, null, aVar5, 0, 61), null, rte0.d(txj0.q(aVar, f2), vog0.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar5, 56, 120);
                    f9t.e(txj0.h(aVar, 6), aVar5, 6);
                    yqv0.c(group.d, null, wlb0.h(aVar5).getText().m, null, null, 0, 3, null, 2, false, 0, 1, null, wlb0.l(aVar5).s0, aVar5, 100663296, 48, 5818);
                    f9t.e(txj0.h(aVar, 2), aVar5, 6);
                    frv0 frv0Var = wlb0.l(aVar5).s0;
                    long j = wlb0.h(aVar5).getText().p;
                    DecimalFormat decimalFormat = z8s.a;
                    yqv0.c(z8s.b(composeView.getResources(), group.v, R.plurals.followers_count, R.string.video_subscribers_count_formatted).toString(), null, j, null, null, 0, 3, null, 2, false, 0, 2, null, frv0Var, aVar5, 100663296, 48, 5818);
                    aVar5.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((lte) obj5).g((cue) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                jwv.a((String) obj5, (d5p0) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((q510) obj5).h((n610) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 6:
                dlv0 dlv0Var = (dlv0) obj5;
                yb70.g gVar = (yb70.g) obj3;
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(12554173, intValue4, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ContentSurface.<anonymous> (NotificationListView.kt:193)");
                    }
                    zc70.d(dlv0Var, gVar.b, izsVar, aVar7, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                cg80.f(ne7.I(1), (androidx.compose.runtime.a) obj, (izs) obj3, (hh80) obj5, (mc90) obj4);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                cx80.a((ix80) obj5, (pu80) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((wab0) obj5).k((jbb0) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 10:
                com.vk.newsfeed.posting.privacy_picker.presentation.a aVar8 = (com.vk.newsfeed.posting.privacy_picker.presentation.a) obj5;
                lfd0 lfd0Var = (lfd0) obj3;
                izs izsVar2 = (izs) obj4;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(504289433, intValue5, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsNewContentView.ThemedContent.<anonymous> (PrivacySettingsNewContentView.kt:81)");
                    }
                    fm50 fm50Var = (fm50) aVar8.d(ok50.a, (n0u0[]) Arrays.copyOf(new n0u0[]{lfd0Var.a}, 1), aVar9, 512).getValue();
                    ifd0 ifd0Var = fm50Var instanceof ifd0 ? (ifd0) fm50Var : null;
                    yzt0<PrivacyViewState> yzt0Var = ifd0Var != null ? ifd0Var.c : null;
                    if (yzt0Var == null) {
                        aVar9.K(367562090);
                        aVar9.j();
                        c = null;
                    } else {
                        aVar9.K(1535877495);
                        c = jk50.c(yzt0Var, aVar9);
                        aVar9.j();
                    }
                    if (c == null) {
                        aVar9.K(367600841);
                        ck70.b(aVar, 1, aVar9, 6);
                    } else {
                        if (oq.h(1535875986, aVar9)) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar9.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(aVar, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar9, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar9));
                        sy90 D2 = aVar9.D();
                        q630 c4 = qri.c(aVar9, m);
                        cri.h7.getClass();
                        LayoutNode.a aVar10 = cri.a.b;
                        if (aVar9.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar9.H();
                        if (aVar9.L()) {
                            aVar9.I(aVar10);
                        } else {
                            aVar9.f();
                        }
                        k9q0.w(aVar9, a2, cri.a.f);
                        k9q0.w(aVar9, D2, cri.a.e);
                        k9q0.w(aVar9, Integer.valueOf(hashCode2), cri.a.g);
                        k9q0.t(aVar9, cri.a.h);
                        k9q0.w(aVar9, c4, cri.a.d);
                        com.vk.newsfeed.posting.privacy_picker.presentation.b.f(((PrivacyViewState) c.getValue()).a, izsVar2, txj0.f(aVar, 1.0f), aVar9, 384);
                        com.vk.newsfeed.posting.privacy_picker.presentation.b.b(((PrivacyViewState) c.getValue()).b, izsVar2, p490.D(aVar, p490.x(aVar9), 14), aVar9, 0);
                        aVar9.G();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                com.vk.ecomm.product_list.presentation.g.h((upd0) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                bbe0.a((PublicationDateDialogViewState) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ cr7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
