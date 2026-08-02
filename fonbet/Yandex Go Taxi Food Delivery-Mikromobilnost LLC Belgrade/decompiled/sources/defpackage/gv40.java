package defpackage;

import androidx.compose.ui.focus.FocusStateImpl;
import com.yandex.messaging.core.db.AppDatabaseRoom;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.adapter.internal.CompositeOfferImpl;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final /* synthetic */ class gv40 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ gv40(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.util.ArrayList] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onEmailFocusChanged$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new mv40((String) obj));
                break;
            case 1:
                tlsVar.invoke(new ov40(((Integer) obj).intValue()));
                break;
            case 2:
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("offset", tlsVar);
                break;
            case 3:
                String str = (String) obj;
                if (str != null) {
                    tlsVar.invoke(str);
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                tlsVar.invoke(bool);
                break;
            case 6:
                tlsVar.invoke(((ked0) obj).a);
                break;
            case 7:
                tlsVar.invoke(((med0) obj).a);
                break;
            case 8:
                tlsVar.invoke(new q4b0((String) obj));
                break;
            case 9:
                onEmailFocusChanged$lambda$0 = PersonalInfoView.onEmailFocusChanged$lambda$0(tlsVar, ((Boolean) obj).booleanValue());
                break;
            case 10:
                hoy0 hoy0Var = (hoy0) obj;
                String str2 = hoy0Var.a.b;
                long j = hoy0Var.b;
                int i2 = asy0.c;
                tlsVar.invoke(new efb0(str2, (int) (j >> 32)));
                break;
            case 11:
                Boolean bool2 = (Boolean) obj;
                tlsVar.invoke(Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true));
                break;
            case 12:
                shq0 shq0Var = ((hfa0) obj).b;
                tlsVar.invoke(shq0Var != null ? shq0Var.a : null);
                break;
            case 13:
                Object obj2 = (List) obj;
                if (tlsVar != null) {
                    Iterable iterable = (Iterable) obj2;
                    ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CompositeOfferImpl((PlusPayCompositeOffers.Offer) it.next()));
                    }
                    List<PlusPaySdkAdapter$CompositeOffer> list = (List) tlsVar.invoke(arrayList);
                    obj2 = new ArrayList();
                    for (PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer : list) {
                        CompositeOfferImpl compositeOfferImpl = plusPaySdkAdapter$CompositeOffer instanceof CompositeOfferImpl ? (CompositeOfferImpl) plusPaySdkAdapter$CompositeOffer : null;
                        PlusPayCompositeOffers.Offer actualOffer = compositeOfferImpl != null ? compositeOfferImpl.getActualOffer() : null;
                        if (actualOffer != null) {
                            obj2.add(actualOffer);
                        }
                    }
                    break;
                }
                break;
            case 14:
                tyj0 tyj0Var = (tyj0) obj;
                if (tyj0Var.c()) {
                    break;
                } else {
                    YSError ySError = tyj0Var.b;
                    c.b(ySError);
                    break;
                }
            case 15:
                tlsVar.invoke(obj);
                break;
            case 16:
                ((AppDatabaseRoom) obj).P(tlsVar);
                break;
            case 17:
                String str3 = (String) obj;
                StringBuilder sb = new StringBuilder();
                int length = str3.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str3.charAt(i3);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                tlsVar.invoke(new vdg0(sb.toString()));
                break;
            case 18:
                tlsVar.invoke(aeg0.a);
                break;
            case 19:
                tlsVar.invoke(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 20:
                tlsVar.invoke(new bzj0(((Result) obj).getValue()));
                break;
            case 21:
                tlsVar.invoke(new czj0(((Result) obj).getValue()));
                break;
            case 22:
                tlsVar.invoke(new f7k0(((Boolean) obj).booleanValue()));
                break;
            case 23:
                tlsVar.invoke(new h7k0((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & ((k6w) obj).a)));
                break;
            case 24:
                tlsVar.invoke(new k2l0((r2l0) obj));
                break;
            case 25:
                tlsVar.invoke((ib11) obj);
                break;
            case 26:
                tlsVar.invoke((ib11) obj);
                break;
            case 27:
                tlsVar.invoke((ib11) obj);
                break;
            case 28:
                tlsVar.invoke(Boolean.valueOf(((FocusStateImpl) ((ivr) obj)).b()));
                break;
            default:
                tlsVar.invoke(new xdl0(((Integer) obj).intValue()));
                break;
        }
        return zy11Var;
    }
}
