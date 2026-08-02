package defpackage;

import android.content.Intent;
import android.provider.ContactsContract;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.f;
import defpackage.b3b1;
import defpackage.bts;
import defpackage.did;
import defpackage.ds31;
import defpackage.f5z;
import defpackage.fbe;
import defpackage.fid;
import defpackage.gbe;
import defpackage.hbe;
import defpackage.ibe;
import defpackage.j2m0;
import defpackage.j50;
import defpackage.kla1;
import defpackage.l4z;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sk7;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.vfc;
import defpackage.w511;
import defpackage.w791;
import defpackage.w8f;
import defpackage.wls;
import defpackage.yd00;
import defpackage.yt0;
import defpackage.yur;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class ebe implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk7 b;

    public /* synthetic */ ebe(sk7 sk7Var, int i) {
        this.a = i;
        this.b = sk7Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final sk7 sk7Var = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a((hwy0) sk7Var.c, wwg.S(-1818487126, true, new ebe(sk7Var, i2), btsVar), btsVar, 56);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-1116168557, true, new wls() { // from class: ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            yd00 yd00Var;
                            Intent intent;
                            List list;
                            d dVar = (d) sk7.this.w;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            boolean V = btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2);
                            zy11 zy11Var2 = zy11.a;
                            if (!V) {
                                btsVar3.Y();
                                return zy11Var2;
                            }
                            String obj5 = dVar.toString();
                            yt0 yt0Var = new yt0((j2m0) btsVar3.m(l4z.a), dVar, 4);
                            rs31 a = f5z.a(btsVar3);
                            if (a == null) {
                                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return null;
                            }
                            final d dVar2 = (d) ooc.G(qoi0.a(d.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3);
                            oz40 b = f.b(dVar2.y, btsVar3);
                            oz40 b2 = f.b(dVar2.A, btsVar3);
                            oz40 b3 = f.b(dVar2.C, btsVar3);
                            oz40 a2 = f.a(dVar2.D, null, null, btsVar3, 48, 2);
                            Object Q = btsVar3.Q();
                            Object obj6 = did.a;
                            if (Q == obj6) {
                                Q = vfc.g(btsVar3);
                            }
                            yur yurVar = (yur) Q;
                            Object Q2 = btsVar3.Q();
                            if (Q2 == obj6) {
                                Q2 = new Intent("android.intent.action.PICK").setDataAndType(ContactsContract.Contacts.CONTENT_URI, "vnd.android.cursor.dir/phone_v2");
                                btsVar3.o0(Q2);
                            }
                            Intent intent2 = (Intent) Q2;
                            j50 j50Var = new j50();
                            boolean e = btsVar3.e(dVar2);
                            Object Q3 = btsVar3.Q();
                            if (e || Q3 == obj6) {
                                Q3 = new tls() { // from class: ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.b
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj7) {
                                        Intent intent3;
                                        ActivityResult activityResult = (ActivityResult) obj7;
                                        boolean z = activityResult.getResultCode() == -1;
                                        if (z) {
                                            intent3 = activityResult.getData();
                                        } else {
                                            if (z) {
                                                w511.b();
                                                return null;
                                            }
                                            intent3 = null;
                                        }
                                        d dVar3 = d.this;
                                        tje.N(ds31.a(dVar3), null, null, new ContactPickerViewModel$onExternalContactPicked$1(intent3, dVar3, null), 3);
                                        return zy11.a;
                                    }
                                };
                                btsVar3.o0(Q3);
                            }
                            yd00 e2 = kla1.e(j50Var, (tls) Q3, btsVar3, 0);
                            boolean e3 = btsVar3.e(dVar2);
                            Object Q4 = btsVar3.Q();
                            if (e3 || Q4 == obj6) {
                                yd00Var = e2;
                                intent = intent2;
                                list = null;
                                Object contactPickerScreen$getView$1$1$1$1$1$1 = new ContactPickerScreen$getView$1$1$1$1$1$1(0, dVar2, d.class, "onDismissClicked", "onDismissClicked()V", 0);
                                btsVar3.o0(contactPickerScreen$getView$1$1$1$1$1$1);
                                Q4 = contactPickerScreen$getView$1$1$1$1$1$1;
                            } else {
                                yd00Var = e2;
                                intent = intent2;
                                list = null;
                            }
                            b3b1.a(false, (sls) ((tfx) Q4), btsVar3, 0, 1);
                            yd00 yd00Var2 = yd00Var;
                            boolean e4 = btsVar3.e(dVar2) | btsVar3.e(yd00Var2) | btsVar3.e(intent);
                            Object Q5 = btsVar3.Q();
                            if (e4 || Q5 == obj6) {
                                Object contactPickerScreen$getView$1$1$1$1$2$1 = new ContactPickerScreen$getView$1$1$1$1$2$1(dVar2, yurVar, yd00Var2, intent, null);
                                dVar2 = dVar2;
                                btsVar3.o0(contactPickerScreen$getView$1$1$1$1$2$1);
                                Q5 = contactPickerScreen$getView$1$1$1$1$2$1;
                            }
                            zpn.e(btsVar3, (wls) Q5, zy11Var2);
                            gbe gbeVar = (gbe) b.getValue();
                            ibe ibeVar = (ibe) b2.getValue();
                            hbe hbeVar = (hbe) b3.getValue();
                            List list2 = hbeVar != null ? hbeVar.a : list;
                            fbe fbeVar = (fbe) a2.getValue();
                            boolean e5 = btsVar3.e(dVar2);
                            Object Q6 = btsVar3.Q();
                            if (e5 || Q6 == obj6) {
                                Object contactPickerScreen$getView$1$1$1$1$3$1 = new ContactPickerScreen$getView$1$1$1$1$3$1(0, dVar2, d.class, "onConfirmClicked", "onConfirmClicked()V", 0);
                                btsVar3.o0(contactPickerScreen$getView$1$1$1$1$3$1);
                                Q6 = contactPickerScreen$getView$1$1$1$1$3$1;
                            }
                            sls slsVar = (sls) ((tfx) Q6);
                            boolean e6 = btsVar3.e(dVar2);
                            Object Q7 = btsVar3.Q();
                            if (e6 || Q7 == obj6) {
                                Object contactPickerScreen$getView$1$1$1$1$4$1 = new ContactPickerScreen$getView$1$1$1$1$4$1(1, dVar2, d.class, "onItemsClicked", "onItemsClicked(Lru/yandex/taxi/sdk/delivery_screen_contact_picker/impl/ui/data/ContactItem;)V", 0);
                                btsVar3.o0(contactPickerScreen$getView$1$1$1$1$4$1);
                                Q7 = contactPickerScreen$getView$1$1$1$1$4$1;
                            }
                            tls tlsVar = (tls) ((tfx) Q7);
                            boolean e7 = btsVar3.e(dVar2);
                            Object Q8 = btsVar3.Q();
                            if (e7 || Q8 == obj6) {
                                Q8 = new ContactPickerScreen$getView$1$1$1$1$5$1(1, dVar2, d.class, "onPhoneInputFieldValueChanged", "onPhoneInputFieldValueChanged(Lru/yandex/taxi/sdk/delivery_screen_contact_picker/impl/ui/data/PhoneInputValue;)V", 0);
                                btsVar3.o0(Q8);
                            }
                            tls tlsVar2 = (tls) ((tfx) Q8);
                            boolean e8 = btsVar3.e(dVar2);
                            Object Q9 = btsVar3.Q();
                            if (e8 || Q9 == obj6) {
                                Object contactPickerScreen$getView$1$1$1$1$6$1 = new ContactPickerScreen$getView$1$1$1$1$6$1(0, dVar2, d.class, "onPickExternalContactClicked", "onPickExternalContactClicked()V", 0);
                                btsVar3.o0(contactPickerScreen$getView$1$1$1$1$6$1);
                                Q9 = contactPickerScreen$getView$1$1$1$1$6$1;
                            }
                            w791.a(gbeVar, ibeVar, list2, fbeVar, yurVar, slsVar, tlsVar, tlsVar2, (sls) ((tfx) Q9), btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT);
                            return zy11Var2;
                        }
                    }, btsVar2), btsVar2, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
