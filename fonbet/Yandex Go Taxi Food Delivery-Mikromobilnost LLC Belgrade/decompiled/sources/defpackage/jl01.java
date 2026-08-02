package defpackage;

import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.semantics.f;
import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import com.yandex.go.multimodal_route.ui.transport_route_part.s;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.trusted_contacts.ui.TrustedContactsModalView;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.internal.domain.PartnersEntity;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResultWithId;
import com.ybsdk.feature.transfer.internal.screens.phone.adapter.ListContentData$Partner$Status;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.c;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.b;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import defpackage.agd;
import defpackage.bgd;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.fvx0;
import defpackage.ga11;
import defpackage.jl40;
import defpackage.kub1;
import defpackage.la11;
import defpackage.o2y0;
import defpackage.q911;
import defpackage.r911;
import defpackage.s911;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.xfd;
import defpackage.yfd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class jl01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05d0  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 renderData$lambda$14$lambda$13;
        vvz0 vvz0Var;
        rbv nbvVar;
        rbv nbvVar2;
        hcq0 hcq0Var;
        List list;
        sl slVar;
        boolean l;
        ThemedImageUrlEntity headerImage;
        rbv f;
        g render$lambda$23;
        zy11 viewBinding$lambda$4$lambda$2;
        YbButtonView.a render$lambda$5;
        r0 r0Var;
        Object value;
        TransferStatus transferStatus;
        AutoTopupWidgetDto autoTopupWidgetDto;
        j5x0 render$lambda$13$lambda$11$lambda$10;
        g render$lambda$13$lambda$11$lambda$9$lambda$8;
        zy11 inputWatcher$lambda$2;
        stz0 render$lambda$13$lambda$6;
        zy11 render$lambda$4$lambda$1;
        Object value2;
        Set set;
        zy11 onAttachedToWindow$lambda$0;
        int i = this.a;
        int i2 = 10;
        int i3 = 9;
        mw3 mw3Var = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return wk01.b((wk01) obj, null, null, null, null, null, null, (wjq0) obj2, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -257, 15);
            case 1:
                renderData$lambda$14$lambda$13 = TransferMe2MeConfirmPullFragment.renderData$lambda$14$lambda$13((TransferMe2MeConfirmPullFragment) obj2, (String) obj);
                return renderData$lambda$14$lambda$13;
            case 2:
                return lm01.a((lm01) obj, null, new gcq0(zsb1.e(((lm01) obj2).b)), 27);
            case 3:
                pm01 pm01Var = (pm01) obj2;
                lm01 lm01Var = (lm01) obj;
                s910 s910Var = lm01Var.a;
                e910 e910Var = s910Var.a;
                PageHeaderEntity pageHeaderEntity = s910Var.g;
                Text.Constant constant = e910Var.a;
                Text.Constant constant2 = e910Var.b;
                gl1 gl1Var = lm01Var.b;
                String str = gl1Var.e;
                if (str != null) {
                    Text.Constant i4 = g8e.i(Text.Companion, str);
                    String str2 = gl1Var.g;
                    vvz0Var = new vvz0(i4, str2 != null ? new Text.Constant(str2) : null, job1.f(gl1Var.h, new ri01(23)));
                } else {
                    vvz0Var = null;
                }
                UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = s910Var.d;
                if (unconditionalLimitWidgetEntity == null) {
                    unconditionalLimitWidgetEntity = gl1Var.i;
                }
                px11 b = unconditionalLimitWidgetEntity != null ? nx11.b(unconditionalLimitWidgetEntity) : null;
                Text.Constant i5 = g8e.i(Text.Companion, pageHeaderEntity.getTitle());
                ThemedImageUrlEntity image = pageHeaderEntity.getImage();
                ptz0 ptz0Var = (image == null || (f = job1.f(image, new ri01(25))) == null) ? null : new ptz0(f);
                Text.Constant constant3 = new Text.Constant(gl1Var.b);
                Text.Constant constant4 = new Text.Constant(gl1Var.c);
                AgreementImageEntity agreementImageEntity = gl1Var.d;
                if (agreementImageEntity == null || (headerImage = agreementImageEntity.getHeaderImage()) == null || (nbvVar = job1.f(headerImage, new ri01(26))) == null) {
                    nbvVar = new nbv(txg0.ybsdk_ic_yandex_logo_sqare_16, null);
                }
                eu01 eu01Var = new eu01(i5, lm01Var.e, nbvVar, constant3, constant4, ptz0Var, 64);
                e910 e910Var2 = s910Var.a;
                PartnerEntity partnerEntity = e910Var2.d;
                vfi0 vfi0Var = e910Var2.c;
                ThemedImageUrlEntity themedImage = partnerEntity.getThemedImage();
                if (themedImage == null || (nbvVar2 = job1.f(themedImage, new ri01(24))) == null) {
                    nbvVar2 = new nbv(txg0.ybsdk_ic_bank_placeholder_without_background, null);
                }
                gzt0 gzt0Var = new gzt0(nbvVar2, Integer.valueOf(nyg0.ybsdk_circle_button_background), ImageView.ScaleType.CENTER_INSIDE, null, Integer.valueOf(txg0.ybsdk_ic_arrow_long_top_white), Integer.valueOf(nyg0.ybsdk_circle_right_button_background), new Text.Resource(dzh0.ybsdk_transfer_accessibility_make_transfer), new Text.Constant(vfi0Var.b), 0, null, new Text.Constant(vfi0Var.a), 3, true, false, false, null, 7875328);
                gcq0 gcq0Var = lm01Var.c;
                if (gcq0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    sl slVar2 = gcq0Var.a;
                    List list2 = lm01Var.d;
                    sl e = zsb1.e(gl1Var);
                    ArrayList arrayList2 = s910Var.c;
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((gl1) it.next()).a, e.a)) {
                                if (e == null) {
                                    e = (sl) a.R(list2);
                                }
                                int i6 = 0;
                                for (Object obj3 : list2) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    sl slVar3 = (sl) obj3;
                                    if (slVar2 != null) {
                                        list = list2;
                                        slVar = slVar2;
                                        l = jl40.l(slVar2.a, slVar3.a);
                                    } else {
                                        list = list2;
                                        slVar = slVar2;
                                        l = jl40.l(e != null ? e.a : null, slVar3.a);
                                    }
                                    boolean z = l;
                                    Drawable t = vng.t(z ? txg0.ybsdk_ic_selected_payment_method : txg0.ybsdk_ic_unselected_payment_method, pm01Var.a);
                                    String str3 = slVar3.a;
                                    rbv rbvVar = slVar3.d;
                                    pm01 pm01Var2 = pm01Var;
                                    Text.Constant i8 = g8e.i(Text.Companion, slVar3.b);
                                    String str4 = slVar3.c;
                                    arrayList.add(new ddq0(str3, rbvVar, i8, str4 != null ? new Text.Constant(str4) : null, t, new edq0(slVar3, true), true, z));
                                    if (i6 != scc.f(list)) {
                                        arrayList.add(giy.c);
                                    }
                                    pm01Var = pm01Var2;
                                    i6 = i7;
                                    list2 = list;
                                    slVar2 = slVar;
                                }
                                hcq0Var = new hcq0(new pdq0(arrayList, s910Var.b, null, null, null, 48));
                            }
                        }
                    }
                    e = null;
                    if (e == null) {
                    }
                    int i62 = 0;
                    while (r7.hasNext()) {
                    }
                    hcq0Var = new hcq0(new pdq0(arrayList, s910Var.b, null, null, null, 48));
                } else {
                    hcq0Var = null;
                }
                return new mm01(eu01Var, constant, constant2, b, gzt0Var, vvz0Var, hcq0Var);
            case 4:
                render$lambda$23 = TransferPhoneInputFragment.render$lambda$23((on01) obj2, (g) obj);
                return render$lambda$23;
            case 5:
                c cVar = (c) obj2;
                SelectedPartner selectedPartner = (SelectedPartner) obj;
                cVar.i0().h(selectedPartner != null);
                if (selectedPartner != null) {
                    cVar.l0(selectedPartner);
                }
                return zy11Var;
            case 6:
                viewBinding$lambda$4$lambda$2 = TransferReceiverNameFragment.getViewBinding$lambda$4$lambda$2((TransferReceiverNameFragment) obj2, (Editable) obj);
                return viewBinding$lambda$4$lambda$2;
            case 7:
                render$lambda$5 = TransferReceiverNameFragment.render$lambda$5((zn01) obj2, (YbButtonView.a) obj);
                return render$lambda$5;
            case 8:
                b bVar = (b) obj2;
                SelectedPartner selectedPartner2 = (SelectedPartner) obj;
                pz40 Y = bVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, yn01.a((yn01) value, null, false, 1)));
                if (selectedPartner2 != null) {
                    bVar.Z(new xn01(selectedPartner2, bVar.D.getInputSource()));
                }
                return zy11Var;
            case 9:
                TransferResultWithId transferResultWithId = (TransferResultWithId) obj;
                ((com.ybsdk.feature.transfer.internal.data.a) obj2).c.getClass();
                int i9 = vr01.b[transferResultWithId.getStatus().ordinal()];
                if (i9 == 1) {
                    transferStatus = TransferStatus.SUCCESS;
                } else if (i9 == 2) {
                    transferStatus = TransferStatus.PROCESSING;
                } else {
                    if (i9 != 3) {
                        w511.b();
                        return null;
                    }
                    transferStatus = TransferStatus.FAILED;
                }
                TransferStatus transferStatus2 = transferStatus;
                String transferId = transferResultWithId.getTransferId();
                String message = transferResultWithId.getMessage();
                String description = transferResultWithId.getDescription();
                List<AutoTopupWidgetDto> widgets = transferResultWithId.getWidgets();
                if (widgets != null && (autoTopupWidgetDto = (AutoTopupWidgetDto) a.R(widgets)) != null) {
                    mw3Var = ow3.a(autoTopupWidgetDto);
                }
                return new et01(transferStatus2, transferId, message, description, mw3Var);
            case 10:
                r0 r0Var2 = ((com.yandex.go.transfer_requirement.card_state.a) obj2).e.a;
                r0Var2.m(null, yo01.a((yo01) r0Var2.getValue(), null, null, null, null, 0, null, (String) obj, null, 159));
                return zy11Var;
            case 11:
                n70 n70Var = (n70) obj;
                n70Var.W(new dl01(7, n70Var, (vq01) obj2));
                return zy11Var;
            case 12:
                render$lambda$13$lambda$11$lambda$10 = TransferRequisiteFragment.render$lambda$13$lambda$11$lambda$10((j5x0) obj2, (j5x0) obj);
                return render$lambda$13$lambda$11$lambda$10;
            case 13:
                return ((tq01) obj).e((vqj0) obj2);
            case 14:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new dl01(i2, n70Var2, (dk01) obj2));
                return zy11Var;
            case 15:
                render$lambda$13$lambda$11$lambda$9$lambda$8 = TransferTargetsFragment.render$lambda$13$lambda$11$lambda$9$lambda$8((au01) obj2, (g) obj);
                return render$lambda$13$lambda$11$lambda$9$lambda$8;
            case 16:
                inputWatcher$lambda$2 = TransferTargetsFragment.inputWatcher$lambda$2((TransferTargetsFragment) obj2, (Editable) obj);
                return inputWatcher$lambda$2;
            case 17:
                render$lambda$13$lambda$6 = TransferTargetsFragment.render$lambda$13$lambda$6((bu01) obj2, (stz0) obj);
                return render$lambda$13$lambda$6;
            case 18:
                PartnersEntity partnersEntity = (PartnersEntity) obj2;
                pt01 pt01Var = (pt01) obj;
                List<PartnerEntity> partners = partnersEntity.getPartners();
                ArrayList arrayList3 = new ArrayList(tcc.n(partners, 10));
                Iterator<T> it2 = partners.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new ary((PartnerEntity) it2.next(), ListContentData$Partner$Status.DEFAULT));
                }
                return pt01.a(pt01Var, new r8j0(arrayList3, null, 14), null, partnersEntity.getTransferInfo().getTransferId(), 6);
            case 19:
                render$lambda$4$lambda$1 = TransferToolbarView.render$lambda$4$lambda$1((TransferToolbarView) obj2, ((Boolean) obj).booleanValue());
                return render$lambda$4$lambda$1;
            case 20:
                return new w50(21, (zx01) obj2);
            case 21:
                f.l((mnq0) obj, ((e711) obj2).a);
                return zy11Var;
            case 22:
                final s911 s911Var = (s911) obj2;
                final yfd yfdVar = (yfd) obj;
                final r911 r911Var = new r911(s911Var);
                s sVar = s911Var.Q;
                o2y0 o2y0Var = ((q911) ((agd) yfdVar).a).a;
                agd agdVar = (agd) yfdVar;
                q911 q911Var = (q911) agdVar.a;
                agdVar.c = sVar.b(o2y0Var, q911Var.b, q911Var.c);
                agdVar.e = new tls() { // from class: com.yandex.go.multimodal_route.ui.transport_tracking.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        s911 s911Var2 = s911Var;
                        tje.N(s911Var2.o(), null, null, new TransportTrackingCardRouter$content$1$1$1(s911Var2, yfdVar, (ga11) obj4, r911Var, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.g = new androidx.compose.runtime.internal.a(932202568, new bms() { // from class: com.yandex.go.multimodal_route.ui.transport_tracking.b
                    @Override // defpackage.bms
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i10;
                        Object obj8;
                        xfd xfdVar = (xfd) obj4;
                        la11 la11Var = (la11) obj5;
                        fid fidVar = (fid) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        if ((intValue & 6) == 0) {
                            i10 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i10 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i10 |= (intValue & 64) == 0 ? ((bts) fidVar).k(la11Var) : fidVar.e(la11Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        if (btsVar.V(i10 & 1, (i10 & 147) != 146)) {
                            final yfd yfdVar2 = yfd.this;
                            boolean z2 = ((q911) ((agd) yfdVar2).a).d;
                            boolean l2 = jl40.l(((q911) ((agd) yfdVar2).a).c, "scooter_multimodal");
                            ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
                            final s911 s911Var2 = s911Var;
                            boolean e2 = btsVar.e(s911Var2);
                            Object Q = btsVar.Q();
                            Object obj9 = did.a;
                            if (e2 || Q == obj9) {
                                obj8 = obj9;
                                Q = new TransportTrackingCardRouter$content$1$2$1$1(1, s911Var2, s911.class, "onAnchoredHeightChanged", "onAnchoredHeightChanged(I)V", 0);
                                btsVar.o0(Q);
                            } else {
                                obj8 = obj9;
                            }
                            tls tlsVar = (tls) ((tfx) Q);
                            boolean e3 = btsVar.e(yfdVar2) | btsVar.e(s911Var2);
                            final r911 r911Var2 = r911Var;
                            boolean k = e3 | btsVar.k(r911Var2);
                            Object Q2 = btsVar.Q();
                            if (k || Q2 == obj8) {
                                Q2 = new wls() { // from class: com.yandex.go.multimodal_route.ui.transport_tracking.c
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj10, Object obj11) {
                                        String str5 = (String) obj10;
                                        fvx0 fvx0Var = (fvx0) obj11;
                                        yfd yfdVar3 = yfd.this;
                                        o2y0 o2y0Var2 = ((q911) ((agd) yfdVar3).a).a;
                                        if (o2y0Var2 != null) {
                                            s911 s911Var3 = s911Var2;
                                            tje.N(s911Var3.o(), null, null, new TransportTrackingCardRouter$content$1$2$2$1$1$1(s911Var3, str5, yfdVar3, o2y0Var2, fvx0Var, r911Var2, null), 3);
                                        }
                                        return zy11.a;
                                    }
                                };
                                btsVar.o0(Q2);
                            }
                            kub1.b(z2, l2, la11Var, composeContentKt$ContentImpl$scope$1$1$action$1, tlsVar, (wls) Q2, btsVar, (i10 << 3) & 896);
                        } else {
                            btsVar.Y();
                        }
                        return zy11.a;
                    }
                }, true);
                return zy11Var;
            case 23:
                uio0 uio0Var = (uio0) obj2;
                ya11 ya11Var = (ya11) obj;
                oy7 oy7Var = (oy7) ((eg01) uio0Var.a).a;
                bb11 bb11Var = (bb11) uio0Var.c;
                a2v a2vVar = (a2v) uio0Var.f;
                dxu dxuVar = (dxu) uio0Var.d;
                if (ya11Var instanceof va11) {
                    ((o7r0) uio0Var.b).g(hta1.f(((va11) ya11Var).a), TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), "Back", rnb1.a(a2vVar));
                    oy7Var.r(new qu(i3));
                } else {
                    boolean z2 = ya11Var instanceof ua11;
                    Set set2 = EmptySet.a;
                    if (z2) {
                        List list3 = ((ua11) ya11Var).a;
                        r0 r0Var3 = bb11Var.e;
                        gci0 gci0Var = bb11Var.f;
                        if (!jl40.l(r0Var3.getValue(), bb11Var.d)) {
                            fyu fyuVar = (fyu) uio0Var.e;
                            if (((Set) gci0Var.a.getValue()).size() != bb11Var.c) {
                                set2 = (Set) gci0Var.a.getValue();
                            }
                            kgx[] kgxVarArr = fyu.g;
                            fyuVar.d(set2, false);
                        }
                        o7r0 o7r0Var = (o7r0) uio0Var.b;
                        List<qa11> list4 = list3;
                        ArrayList arrayList4 = new ArrayList(tcc.n(list4, 10));
                        for (qa11 qa11Var : list4) {
                            arrayList4.add(qa11.a(qa11Var, ((Set) gci0Var.a.getValue()).contains(qa11Var.a)));
                        }
                        o7r0Var.g(hta1.f(arrayList4), TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), "Apply", rnb1.a(a2vVar));
                        oy7Var.r(new qu(i3));
                    } else if (ya11Var instanceof wa11) {
                        r0 r0Var4 = bb11Var.e;
                        r0Var4.getClass();
                        r0Var4.m(null, set2);
                        o7r0 o7r0Var2 = (o7r0) uio0Var.b;
                        List list5 = ((wa11) ya11Var).a;
                        ArrayList arrayList5 = new ArrayList(tcc.n(list5, 10));
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(qa11.a((qa11) it3.next(), false));
                        }
                        o7r0Var2.g(hta1.f(arrayList5), TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), "ClearAll", rnb1.a(a2vVar));
                    } else {
                        if (!(ya11Var instanceof xa11)) {
                            w511.b();
                            return null;
                        }
                        String str5 = ((xa11) ya11Var).a;
                        r0 r0Var5 = bb11Var.e;
                        do {
                            value2 = r0Var5.getValue();
                            set = (Set) value2;
                        } while (!r0Var5.k(value2, set.contains(str5) ? v4r0.f(set, str5) : v4r0.i(set, str5)));
                        o7r0 o7r0Var3 = (o7r0) uio0Var.b;
                        TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration = TransitRoutesHubAnalytics$HubGeneration.Second;
                        String a = dxuVar.a.a();
                        boolean contains = ((Set) bb11Var.f.a.getValue()).contains(str5);
                        TransitRoutesHubAnalytics$MobilityHubOrigin a2 = rnb1.a(a2vVar);
                        o7r0Var3.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
                        hashMap.put("hub_session_id", a);
                        hashMap.put("option_id", str5);
                        hashMap.put("option_is_selected", Boolean.valueOf(contains));
                        hashMap.put("origin", a2.getEventValue());
                        o7r0Var3.a.a("TransitRoutesHub.TransportTypeSelector.Option.Tapped", hashMap, 2, new HashMap());
                    }
                }
                return zy11Var;
            case 24:
                nf11 nf11Var = (nf11) obj2;
                h0c h0cVar = (h0c) obj;
                h0cVar.a("first", nf11Var.a.getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("second", nf11Var.b.getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("third", nf11Var.c.getDescriptor(), (r3 & 8) == 0);
                return zy11Var;
            case 25:
                com.yandex.payment.sdk.transportcards.nfc.a aVar = (com.yandex.payment.sdk.transportcards.nfc.a) obj2;
                aVar.h();
                AppCompatActivity b2 = aVar.b();
                if (b2 != null) {
                    b2.unregisterReceiver(aVar.i);
                    NfcAdapter nfcAdapter = aVar.d;
                    if (nfcAdapter != null) {
                        nfcAdapter.disableReaderMode(aVar.b());
                    }
                }
                return zy11Var;
            case 26:
                ErrorScreenAction errorScreenAction = (ErrorScreenAction) obj2;
                elr0 elr0Var = (elr0) obj;
                switch (elr0Var.a) {
                    case 0:
                        elr0Var.b.invoke(errorScreenAction);
                        return zy11Var;
                    default:
                        ((com.yandex.go.trusted_contacts.ui.b) elr0Var.b).invoke(errorScreenAction);
                        return zy11Var;
                }
            case 27:
                onAttachedToWindow$lambda$0 = TrustedContactsModalView.onAttachedToWindow$lambda$0((TrustedContactsModalView) obj2, (fz4) obj);
                return onAttachedToWindow$lambda$0;
            case 28:
                int intValue = ((Integer) obj).intValue();
                View view = ((dl11) obj2).h.getView();
                view.setPadding(view.getPaddingLeft(), intValue, view.getPaddingRight(), view.getPaddingBottom());
                return zy11Var;
            default:
                qxx0 qxx0Var = (qxx0) obj2;
                pn4 pn4Var = (pn4) obj;
                switch (pn4Var.a) {
                    case 0:
                        zsa zsaVar = (zsa) pn4Var.b;
                        zsaVar.r(new qu(i3));
                        ((tls) zsaVar.F).invoke(qxx0Var);
                        return zy11Var;
                    default:
                        xx70 xx70Var = (xx70) pn4Var.b;
                        xx70Var.r(new qu(i3));
                        ((k200) xx70Var.E).invoke(qxx0Var);
                        return zy11Var;
                }
        }
    }
}
