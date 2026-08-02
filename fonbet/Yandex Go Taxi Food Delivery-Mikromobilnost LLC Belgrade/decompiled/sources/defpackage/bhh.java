package defpackage;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.delivery.router.DeliveryCommonChildModalView;
import com.yandex.go.delivery.sdd_slots_selector.DeliverySddIntervalsModalView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.route.interactor.b;
import defpackage.jl40;
import defpackage.qrh;
import defpackage.qu;
import defpackage.rrh;
import defpackage.srh;
import defpackage.tje;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormRestoreAddressModel;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.ui.recycler.a;
import ru.yandex.taxi.favorites.rides.delete_modal.c;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.DeliveryExplicitCommentCourierView;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$C2CStub;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class bhh implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bhh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        zy11 insetsType$lambda$0;
        zy11 initViews$lambda$1$1;
        s8i s8iVar;
        zy11 insetsType$lambda$02;
        zy11 insetsType$lambda$03;
        int i = this.a;
        int i2 = 10;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ra4 ra4Var = (ra4) obj2;
                ra4Var.c = ((Boolean) obj).booleanValue();
                break;
            case 1:
                final c cVar = (c) obj2;
                final yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = cVar.J.e;
                tls tlsVar = new tls() { // from class: ru.yandex.taxi.favorites.rides.delete_modal.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        srh srhVar = (srh) obj3;
                        boolean l = jl40.l(srhVar, qrh.a);
                        c cVar2 = c.this;
                        if (l) {
                            tje.N(cVar2.o(), null, null, new DeleteModalRouterImpl$content$1$1$1(cVar2, yfdVar, null), 3);
                        } else {
                            if (!jl40.l(srhVar, rrh.a)) {
                                w511.b();
                                return null;
                            }
                            cVar2.r(new qu(9));
                        }
                        return zy11.a;
                    }
                };
                agd agdVar = (agd) yfdVar;
                agdVar.e = tlsVar;
                n6d.a.getClass();
                agdVar.g = n6d.b;
                break;
            case 2:
                UUID uuid = (UUID) obj2;
                isi isiVar = (isi) obj;
                if ((isiVar instanceof DeliveryStub$C2CStub) && jl40.l(((DeliveryStub$C2CStub) isiVar).getLocalUuid(), uuid)) {
                    z = true;
                }
                break;
            case 3:
                bgq0 bgq0Var = (bgq0) obj;
                r0 r0Var = (r0) ((fvh) obj2).A.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, yr0.a((yr0) value, null, null, null, null, null, bgq0Var, 63)));
            case 4:
                a aVar = (a) obj2;
                String str = (String) obj;
                if (aVar.F() != -1) {
                    aVar.c0.b(aVar.F(), aVar.V.d(), "delete_photo_comment");
                    hki hkiVar = aVar.e0;
                    if (hkiVar != null) {
                        aVar.a0.a(new pq(str, hkiVar));
                        break;
                    }
                }
                break;
            case 5:
                ((com.yandex.go.logistics.cargo_flow.a) obj2).R();
                break;
            case 6:
                ((ic0) obj2).invoke((Address) obj);
                break;
            case 7:
                ((bmh) obj2).invoke();
                break;
            case 8:
                ((dke) obj2).invoke((Address) obj);
                break;
            case 9:
                break;
            case 10:
                insetsType$lambda$0 = DeliveryCommonChildModalView.insetsType$lambda$0((DeliveryCommonChildModalView) obj2, (t1w) obj);
                break;
            case 11:
                initViews$lambda$1$1 = DeliveryContactsModalView.initViews$lambda$1$1((DeliveryContactsModalView) obj2, ((Boolean) obj).booleanValue());
                break;
            case 12:
                String str2 = (String) obj;
                s8iVar = ((ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.a) obj2).a.presenter;
                s8iVar.y.a.c = evu0.J(str2) ? null : str2;
                break;
            case 13:
                ((d) obj2).A = null;
                break;
            case 14:
                insetsType$lambda$02 = DeliveryExplicitCommentCourierView.insetsType$lambda$0((DeliveryExplicitCommentCourierView) obj2, (t1w) obj);
                break;
            case 15:
                ((gai) obj2).r(new yd0((Address) obj, 11));
                break;
            case 16:
                ((n3h) ((m640) obj2).F).a(Uri.parse((String) obj), DeeplinkSource.UNSPECIFIED);
                break;
            case 17:
                ((ru.yandex.taxi.logistics.common.a) ((oei) obj2).f).d(((ji50) obj).c());
                break;
            case 18:
                rgi rgiVar = (rgi) obj2;
                rgiVar.a.a(((Boolean) obj).booleanValue());
                ((j) rgiVar.c.a).d("Summary.Requirements.PaidInsuranceTapped").m();
                break;
            case 19:
                ((ru.yandex.taxi.logistics.photocomment.a) obj2).d();
                break;
            case 20:
                break;
            case 21:
                y5i.n(((kki) ((hyf) obj2).H.get()).a, r0.a.h.size() - 1, e991.e((bgq0) obj), null, null, null, null, null, null, 508);
                break;
            case 22:
                ((ru.yandex.taxi.delivery.router.primary.a) obj2).V = false;
                break;
            case 23:
                com.yandex.go.delivery.tracking.a aVar2 = (com.yandex.go.delivery.tracking.a) obj2;
                List list = (List) obj;
                y5i y5iVar = aVar2.e;
                b bVar = aVar2.g;
                PlainAddress b = com.yandex.go.delivery.tracking.a.b((FormRestoreAddressModel) list.get(0));
                List subList = list.subList(Math.min(1, list.size()), list.size());
                ArrayList arrayList = new ArrayList(tcc.n(subList, 10));
                Iterator it = subList.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.yandex.go.delivery.tracking.a.b((FormRestoreAddressModel) it.next()));
                }
                bVar.j();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bVar.a((Address) it2.next());
                }
                bVar.m(new ZoneAddress(b, 2), null);
                y5iVar.p(qke.A(b));
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(qke.A((Address) it3.next()));
                }
                y5iVar.o(arrayList2);
                break;
            case 24:
                insetsType$lambda$03 = DeliverySddIntervalsModalView.insetsType$lambda$0((DeliverySddIntervalsModalView) obj2, (t1w) obj);
                break;
            case 25:
                ((goi) obj2).F.a().setMessage(kyh0.common_unknown_error).setPositiveButton(kyh0.common_ok).setCancelableOnTouchOutside(true).show();
                ((ioi) obj).n0();
                break;
            case 26:
                GoLinearLayout goLinearLayout = (GoLinearLayout) obj;
                ru.yandex.taxi.delivery.impl.requirement.special.a a = ((spi) obj2).a();
                ca1 ca1Var = new ca1(goLinearLayout, i2);
                a.a(goLinearLayout);
                break;
            case 27:
                ((auh) ((i3y) ((lui) obj2).K).getValue()).i();
                ((sy60) obj).a();
                break;
            case 28:
                ((v370) obj2).c.invoke();
                break;
            default:
                ru.yandex.taxi.delivery.web.b bVar2 = (ru.yandex.taxi.delivery.web.b) obj2;
                ((scg) ((ff41) bVar2.G.getValue())).b().i();
                bVar2.r(new wwb((String) obj, 12));
                break;
        }
        return zy11Var;
    }
}
