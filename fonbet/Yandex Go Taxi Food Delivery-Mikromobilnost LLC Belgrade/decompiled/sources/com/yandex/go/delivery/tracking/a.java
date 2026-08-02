package com.yandex.go.delivery.tracking;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.PlainAddress;
import defpackage.bgq0;
import defpackage.bhh;
import defpackage.eqh;
import defpackage.gyh;
import defpackage.hit;
import defpackage.hxx;
import defpackage.i5s;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.t4s;
import defpackage.y5i;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormRestoreAddressModel;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.delivery.preorder.a a;
    public final ru.yandex.taxi.logistics.deliveries.a b;
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.d c;
    public final hit d;
    public final y5i e;
    public final eqh f;
    public final com.yandex.go.route.interactor.b g;
    public final oep0 h;

    public a(ru.yandex.taxi.delivery.preorder.a aVar, ru.yandex.taxi.logistics.deliveries.a aVar2, ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.d dVar, hit hitVar, y5i y5iVar, eqh eqhVar, com.yandex.go.route.interactor.b bVar, oep0 oep0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = dVar;
        this.d = hitVar;
        this.e = y5iVar;
        this.f = eqhVar;
        this.g = bVar;
        this.h = oep0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r15 != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r0.b(r14, r15, r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        DeliveryRestorePreorderInteractor$openForm$1 deliveryRestorePreorderInteractor$openForm$1;
        int i;
        ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.d dVar = aVar.c;
        if (continuationImpl instanceof DeliveryRestorePreorderInteractor$openForm$1) {
            deliveryRestorePreorderInteractor$openForm$1 = (DeliveryRestorePreorderInteractor$openForm$1) continuationImpl;
            int i2 = deliveryRestorePreorderInteractor$openForm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRestorePreorderInteractor$openForm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryRestorePreorderInteractor$openForm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRestorePreorderInteractor$openForm$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bhh bhhVar = new bhh(23, aVar);
                    deliveryRestorePreorderInteractor$openForm$1.L$0 = str;
                    deliveryRestorePreorderInteractor$openForm$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        i5s i5sVar = (i5s) obj;
                        if (i5sVar != null) {
                            oep0 oep0Var = aVar.h;
                            ((pep0) oep0Var).f((m950) aVar.f.get(), new gyh(i5sVar.a, null, null, null, new t4s("order_tracking"), null, false, false, null, i5sVar.b, null, 1454), hxx.a);
                        }
                        return zy11.a;
                    }
                    str = (String) deliveryRestorePreorderInteractor$openForm$1.L$0;
                    kotlin.b.b(obj);
                }
                deliveryRestorePreorderInteractor$openForm$1.L$0 = null;
                deliveryRestorePreorderInteractor$openForm$1.label = 2;
                obj = dVar.a(str, deliveryRestorePreorderInteractor$openForm$1);
            }
        }
        deliveryRestorePreorderInteractor$openForm$1 = new DeliveryRestorePreorderInteractor$openForm$1(aVar, continuationImpl);
        Object obj2 = deliveryRestorePreorderInteractor$openForm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRestorePreorderInteractor$openForm$1.label;
        if (i != 0) {
        }
        deliveryRestorePreorderInteractor$openForm$1.L$0 = null;
        deliveryRestorePreorderInteractor$openForm$1.label = 2;
        obj2 = dVar.a(str, deliveryRestorePreorderInteractor$openForm$1);
    }

    public static PlainAddress b(FormRestoreAddressModel formRestoreAddressModel) {
        bgq0 bgq0Var;
        String porch = formRestoreAddressModel.getPorch();
        String comment = formRestoreAddressModel.getComment();
        zzs zzsVar = new zzs(formRestoreAddressModel.getCoordinates().getLatitude(), formRestoreAddressModel.getCoordinates().getLongitude(), 0, null, null, 28);
        String subtitle = formRestoreAddressModel.getSubtitle();
        String uri = formRestoreAddressModel.getUri();
        String title = formRestoreAddressModel.getTitle();
        String fullText = formRestoreAddressModel.getFullText();
        ContactDto contact = formRestoreAddressModel.getContact();
        if (contact != null) {
            String name = contact.getName();
            if (name == null) {
                name = "";
            }
            bgq0Var = new bgq0(name, contact.getPhone(), (SelectedFrom) null, 12);
        } else {
            bgq0Var = null;
        }
        String str = null;
        GeoObjectType geoObjectType = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AddressDTO addressDTO = new AddressDTO(zzsVar, formRestoreAddressModel.getLocality(), porch, fullText, title, subtitle, str, geoObjectType, str2, uri, str3, str4, str5, formRestoreAddressModel.getApartment(), formRestoreAddressModel.getFloor(), formRestoreAddressModel.getDoorPhone(), comment, bgq0Var, null, null, null, 31521672);
        PlainAddress.Companion.getClass();
        return new PlainAddress(addressDTO);
    }
}
