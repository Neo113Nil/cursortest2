package defpackage;

import android.text.Spanned;
import com.yandex.go.payments.domain.l;
import com.yandex.go.promocodes.base.api.domain.entities.status.PromoCodeStatus;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDecorationDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDecorationIdDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeErrorDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$DeeplinkActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$PromoCodeCopyActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$PromocodeUrlActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$UnknownActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeStatusDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeTextDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class imf0 {
    public final k7x0 a;
    public final l b;

    public imf0(k7x0 k7x0Var, l lVar) {
        this.a = k7x0Var;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wlf0 a(PromoCodeDto promoCodeDto) {
        PromoCodeStatus promoCodeStatus;
        String str;
        String str2;
        jmf0 jmf0Var;
        String str3;
        String str4;
        CharSequence charSequence;
        boolean z;
        ArrayList arrayList;
        Object obj;
        String str5;
        CharSequence charSequence2;
        Object obj2;
        PromoCodeStatus promoCodeStatus2;
        PromoCodeStatusDto promoCodeStatusDto = promoCodeDto.e;
        List list = promoCodeDto.k;
        PromoCodeErrorDto promoCodeErrorDto = promoCodeDto.h;
        int i = promoCodeStatusDto == null ? -1 : hmf0.a[promoCodeStatusDto.ordinal()];
        if (i != -1) {
            if (i == 1) {
                promoCodeStatus2 = PromoCodeStatus.VALID;
            } else if (i == 2) {
                promoCodeStatus2 = PromoCodeStatus.INVALID;
            } else if (i == 3) {
                promoCodeStatus2 = PromoCodeStatus.RESTRICTED;
            } else if (i != 4) {
                w511.b();
                return null;
            }
            promoCodeStatus = promoCodeStatus2;
            if (promoCodeStatus != null) {
                return null;
            }
            ief iefVar = promoCodeDto.i;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            String str6 = promoCodeDto.g;
            if (str6 != null) {
                str = str6.length() == 0 ? null : ((m7x0) this.a).a(str6);
            } else {
                str = null;
            }
            String str7 = promoCodeDto.l;
            String str8 = promoCodeDto.b;
            l lVar = this.b;
            Spanned a = lVar.a(h, str8);
            CharSequence charSequence3 = a == null ? "" : a;
            CharSequence a2 = promoCodeErrorDto != null ? lVar.a(h, promoCodeErrorDto.b) : lVar.a(h, promoCodeDto.d);
            String str9 = (a2 == null && (a2 = promoCodeDto.c) == null) ? "" : a2;
            String str10 = list.isEmpty() ? "" : (String) list.get(0);
            String str11 = promoCodeDto.a;
            cmf0 cmf0Var = null;
            if (promoCodeErrorDto != null) {
                String str12 = promoCodeErrorDto.a;
                str2 = str10;
                jmf0Var = new jmf0(str12, promoCodeErrorDto.b, "ERROR_CREDITCARD_REQUIRED".equals(str12) || "ERROR_CREDITCARD_ONLY".equals(str12), "ERROR_CREDITCARD_ONLY".equals(str12), "ERROR_TOO_LATE".equals(str12));
            } else {
                str2 = str10;
                jmf0Var = null;
            }
            PromoCodeActionDto promoCodeActionDto = promoCodeDto.j;
            if (promoCodeActionDto != null) {
                String str13 = promoCodeActionDto.b;
                if (str13 == null) {
                    str13 = "";
                }
                Spanned a3 = lVar.a(h, str13);
                String obj3 = a3 != null ? a3.toString() : null;
                String str14 = obj3 == null ? "" : obj3;
                List list2 = promoCodeActionDto.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    Spanned a4 = lVar.a(h, ((PromoCodeTextDto) it.next()).a);
                    String obj4 = a4 != null ? a4.toString() : null;
                    if (obj4 != null) {
                        arrayList2.add(obj4);
                    }
                    it = it2;
                }
                List list3 = promoCodeActionDto.d;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    String str15 = str;
                    Spanned a5 = lVar.a(h, ((PromoCodeTextDto) it3.next()).a);
                    String obj5 = a5 != null ? a5.toString() : null;
                    if (obj5 != null) {
                        arrayList3.add(obj5);
                    }
                    str = str15;
                }
                str3 = str;
                Iterator it4 = promoCodeActionDto.e.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        arrayList = arrayList3;
                        obj = null;
                        break;
                    }
                    obj = it4.next();
                    arrayList = arrayList3;
                    Iterator it5 = it4;
                    if (((PromoCodeDecorationDto) obj).a == PromoCodeDecorationIdDto.IMAGE_TAG) {
                        break;
                    }
                    it4 = it5;
                    arrayList3 = arrayList;
                }
                PromoCodeDecorationDto promoCodeDecorationDto = (PromoCodeDecorationDto) obj;
                String str16 = promoCodeDecorationDto != null ? promoCodeDecorationDto.b : null;
                List list4 = promoCodeActionDto.f;
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    i iVar = (i) it6.next();
                    Iterator it7 = it6;
                    if (iVar instanceof PromoCodeItemActionDto$PromoCodeCopyActionDto) {
                        PromoCodeItemActionDto$PromoCodeCopyActionDto promoCodeItemActionDto$PromoCodeCopyActionDto = (PromoCodeItemActionDto$PromoCodeCopyActionDto) iVar;
                        str5 = str7;
                        charSequence2 = charSequence3;
                        obj2 = new emf0(promoCodeItemActionDto$PromoCodeCopyActionDto.a, promoCodeItemActionDto$PromoCodeCopyActionDto.b, promoCodeItemActionDto$PromoCodeCopyActionDto.c);
                    } else {
                        str5 = str7;
                        charSequence2 = charSequence3;
                        if (iVar instanceof PromoCodeItemActionDto$DeeplinkActionDto) {
                            PromoCodeItemActionDto$DeeplinkActionDto promoCodeItemActionDto$DeeplinkActionDto = (PromoCodeItemActionDto$DeeplinkActionDto) iVar;
                            obj2 = new fmf0(promoCodeItemActionDto$DeeplinkActionDto.b, promoCodeItemActionDto$DeeplinkActionDto.c, promoCodeItemActionDto$DeeplinkActionDto.a);
                        } else if (iVar instanceof PromoCodeItemActionDto$PromocodeUrlActionDto) {
                            PromoCodeItemActionDto$PromocodeUrlActionDto promoCodeItemActionDto$PromocodeUrlActionDto = (PromoCodeItemActionDto$PromocodeUrlActionDto) iVar;
                            obj2 = new gmf0(promoCodeItemActionDto$PromocodeUrlActionDto.a, promoCodeItemActionDto$PromocodeUrlActionDto.b, promoCodeItemActionDto$PromocodeUrlActionDto.c);
                        } else {
                            if (!(iVar instanceof PromoCodeItemActionDto$UnknownActionDto)) {
                                w511.b();
                                return null;
                            }
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        arrayList4.add(obj2);
                    }
                    it6 = it7;
                    str7 = str5;
                    charSequence3 = charSequence2;
                }
                str4 = str7;
                charSequence = charSequence3;
                cmf0Var = new cmf0(str14, arrayList2, arrayList, str16, arrayList4);
            } else {
                str3 = str;
                str4 = str7;
                charSequence = charSequence3;
            }
            boolean z2 = promoCodeDto.f;
            boolean z3 = promoCodeStatusDto != PromoCodeStatusDto.INVALID && list.contains(TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
            List list5 = promoCodeDto.k;
            List list6 = promoCodeDto.m;
            if (promoCodeErrorDto == null || promoCodeStatusDto != PromoCodeStatusDto.RESTRICTED) {
                z = false;
            } else {
                String str17 = promoCodeErrorDto.a;
                z = "ERROR_CREDITCARD_REQUIRED".equals(str17) || "ERROR_CREDITCARD_ONLY".equals(str17);
            }
            return new wlf0(str3, str4, charSequence, str9, str2, str11, promoCodeStatus, jmf0Var, cmf0Var, z2, z3, list5, list6, z, lVar.a(h, promoCodeDto.n));
        }
        promoCodeStatus = null;
        if (promoCodeStatus != null) {
        }
    }
}
