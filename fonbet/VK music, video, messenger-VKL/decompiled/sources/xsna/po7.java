package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.kdh0;
import xsna.q5b0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class po7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ po7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                qo7 qo7Var = (qo7) this.c;
                BookingEditScreenState.g gVar = (BookingEditScreenState.g) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-420339351, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditDeleteConfirmationModalImpl.Content.<anonymous> (BookingEditDeleteConfirmationModal.kt:72)");
                    }
                    q630 q630Var = qo7Var.d;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar, 48);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, q630Var);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    f9t.e(qo7Var.e, aVar, 0);
                    qzu0.a.getClass();
                    pzu0.b(qzu0.C(aVar), null, null, wlb0.h(aVar).getIcon().a, aVar, 56, 4);
                    f9t.e(qo7Var.f, aVar, 0);
                    yqv0.c(d370.N(R.string.booking_edit_delete_service_title, 0, aVar), null, wlb0.h(aVar).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar).C, aVar, 0, 0, 8186);
                    f9t.e(qo7Var.i, aVar, 0);
                    yqv0.c(d370.O(R.string.booking_edit_delete_service_description, new Object[]{gVar.b.c}, aVar), null, wlb0.h(aVar).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar).d0, aVar, 0, 0, 8122);
                    f9t.e(qo7Var.g, aVar, 0);
                    q630 q630Var2 = qo7Var.c;
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Negative;
                    String N = d370.N(R.string.booking_edit_delete_service_confirm, 0, aVar);
                    boolean J = aVar.J(qo7Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new qc(qo7Var, 5);
                        aVar.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, q630Var2, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar, X2.b.f, 0, 0, 4190176);
                    f9t.e(qo7Var.h, aVar, 0);
                    q630 q630Var3 = qo7Var.c;
                    ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                    String N2 = d370.N(R.string.booking_edit_delete_service_cancel, 0, aVar);
                    boolean J2 = aVar.J(qo7Var);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new s5(qo7Var, 10);
                        aVar.R(x2);
                    }
                    bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance2, q630Var3, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar, X2.b.f, 0, 0, 4190176);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                kdh0.a aVar3 = (kdh0.a) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(845519244, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.middleSettingsItems.<anonymous> (Loaded.kt:199)");
                    }
                    uzi0 uzi0Var = aVar3.l;
                    boolean J3 = aVar4.J(izsVar);
                    Object x3 = aVar4.x();
                    if (J3 || x3 == a.C0011a.a) {
                        x3 = new fr0(izsVar, 2);
                        aVar4.R(x3);
                    }
                    tzi0.a(uzi0Var, (gzs) x3, ahn.E(q630.a.a, "LoadedTags.PRIVACY_COMMENTS_CELL"), null, aVar4, 384, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                com.vk.messagetemplates.impl.details.f fVar = (com.vk.messagetemplates.impl.details.f) this.c;
                izs izsVar2 = (izs) this.d;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar5.J(s890Var) ? 4 : 2;
                }
                if (aVar5.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-331418433, intValue3, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsScreenContent.<anonymous> (TemplateDetailsScreenContent.kt:37)");
                    }
                    q630 C = s200.C(p490.D(q630.a.a, p490.x(aVar5), 14), s890Var);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar5, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar5));
                    sy90 D2 = aVar5.D();
                    q630 c2 = qri.c(aVar5, C);
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
                    k9q0.w(aVar5, a2, cri.a.f);
                    k9q0.w(aVar5, D2, cri.a.e);
                    k9q0.w(aVar5, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar5, cri.a.h);
                    k9q0.w(aVar5, c2, cri.a.d);
                    String N3 = d370.N(R.string.template_details_title_description, 0, aVar5);
                    String N4 = d370.N(R.string.template_details_title_placeholder, 0, aVar5);
                    i4m i4mVar = fVar.d;
                    h4m h4mVar = i4mVar.a;
                    boolean J4 = aVar5.J(izsVar2);
                    Object x4 = aVar5.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (J4 || x4 == c0012a2) {
                        x4 = new f430(izsVar2, 2);
                        aVar5.R(x4);
                    }
                    m8o0.a(N3, N4, h4mVar, true, "template_title_field", null, (izs) x4, aVar5, 27648);
                    String N5 = d370.N(R.string.template_details_content_description, 0, aVar5);
                    String N6 = d370.N(R.string.template_details_content_placeholder, 0, aVar5);
                    h4m h4mVar2 = i4mVar.b;
                    boolean J5 = aVar5.J(izsVar2);
                    Object x5 = aVar5.x();
                    if (J5 || x5 == c0012a2) {
                        x5 = new uft(izsVar2, 1);
                        aVar5.R(x5);
                    }
                    m8o0.a(N5, N6, h4mVar2, false, "template_text_field", null, (izs) x5, aVar5, 27648);
                    o8o0.a(i4mVar, izsVar2, aVar5, 0);
                    aVar5.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            default:
                vmt0 vmt0Var = (vmt0) this.c;
                izs izsVar3 = (izs) this.d;
                q630 q630Var4 = (q630) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar7.J(q630Var4) ? 4 : 2;
                }
                if (aVar7.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-952283795, intValue4, -1, "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView.BlockView.ContentImpl.<anonymous> (VideoTrailerView.kt:223)");
                    }
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode3 = Long.hashCode(n34.n(aVar7));
                    sy90 D3 = aVar7.D();
                    q630 c3 = qri.c(aVar7, q630Var4);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (aVar7.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar7.H();
                    if (aVar7.L()) {
                        aVar7.I(aVar8);
                    } else {
                        aVar7.f();
                    }
                    k9q0.w(aVar7, d, cri.a.f);
                    k9q0.w(aVar7, D3, cri.a.e);
                    k9q0.w(aVar7, Integer.valueOf(hashCode3), cri.a.g);
                    k9q0.t(aVar7, cri.a.h);
                    k9q0.w(aVar7, c3, cri.a.d);
                    q5b0 q5b0Var = vmt0Var.d;
                    if (q5b0Var == null) {
                        aVar7.K(58617514);
                    } else {
                        q5b0.b bVar = q5b0Var.a;
                        aVar7.K(58617515);
                        dai.d<VideoTextureView> a3 = bVar.a();
                        boolean J6 = aVar7.J(izsVar3) | aVar7.J(vmt0Var);
                        Object x6 = aVar7.x();
                        a.C0011a.C0012a c0012a3 = a.C0011a.a;
                        if (J6 || x6 == c0012a3) {
                            x6 = new tbs0(3, izsVar3, vmt0Var);
                            aVar7.R(x6);
                        }
                        a3.c((izs) x6, aVar7, 0);
                        dai.c b = bVar.b();
                        boolean J7 = aVar7.J(izsVar3) | aVar7.J(vmt0Var);
                        Object x7 = aVar7.x();
                        if (J7 || x7 == c0012a3) {
                            x7 = new ge0(23, izsVar3, vmt0Var);
                            aVar7.R(x7);
                        }
                        b.c((gzs) x7, aVar7, 0);
                        p5b0.b(q5b0Var, txj0.d(q630.a.a, 1.0f), aVar7, 48);
                    }
                    aVar7.j();
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
        }
    }
}
