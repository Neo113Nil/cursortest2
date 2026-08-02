package defpackage;

import com.yandex.go.slot.dto.SlotItemBodyDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemLineDto;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class pik0 {
    public final zuj0 a;

    public pik0(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3, types: [ru.yandex.taxi.common_models.net.o] */
    /* JADX WARN: Type inference failed for: r12v4, types: [ru.yandex.taxi.common_models.net.FormattedText$h] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final SlotItemDto a(SlotItemDto slotItemDto, String str) {
        FormattedText formattedText;
        FormattedText formattedText2;
        String str2;
        FormattedText formattedText3;
        FormattedText.h e;
        String str3 = str;
        FormattedText formattedText4 = null;
        if (slotItemDto.d.isEmpty()) {
            return null;
        }
        List<SlotItemBodyDto> list = slotItemDto.d;
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (SlotItemBodyDto slotItemBodyDto : list) {
            List<SlotItemLineDto> list2 = slotItemBodyDto.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, i));
            for (SlotItemLineDto slotItemLineDto : list2) {
                FormattedText formattedText5 = slotItemLineDto.c;
                if (formattedText5 == null) {
                    formattedText = formattedText4;
                    formattedText2 = formattedText;
                } else {
                    List<??> list3 = formattedText5.a;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list3, i));
                    for (?? r12 : list3) {
                        if (r12 instanceof FormattedText.h) {
                            zuj0 zuj0Var = this.a;
                            if (str3 != null) {
                                FormattedText.h hVar = (FormattedText.h) r12;
                                if (jl40.l(hVar.a, "<<content>>")) {
                                    FormattedText.h e2 = FormattedText.h.e(hVar, str3, null, null, 2046);
                                    int length = e2.a.length();
                                    r12 = e2;
                                    if (length == 0) {
                                        r12 = FormattedText.h.e(hVar, ((avj0) zuj0Var).h(kyh0.common_loading), null, null, 2046);
                                    }
                                    formattedText3 = null;
                                }
                            }
                            r12 = (FormattedText.h) r12;
                            String str4 = r12.a;
                            switch (str4.hashCode()) {
                                case -1925239466:
                                    if (str4.equals("common_done")) {
                                        str2 = ((avj0) zuj0Var).h(kyh0.common_done);
                                        break;
                                    }
                                    str2 = null;
                                    break;
                                case -1773219814:
                                    if (str4.equals("route_point")) {
                                        str2 = ((avj0) zuj0Var).h(kyh0.route_point);
                                        break;
                                    }
                                    str2 = null;
                                    break;
                                case -1463373430:
                                    if (str4.equals("ride_card_pickup_point_label")) {
                                        str2 = ((avj0) zuj0Var).h(kyh0.ride_card_pickup_point_label);
                                        break;
                                    }
                                    str2 = null;
                                    break;
                                case -1317497112:
                                    if (str4.equals("common_loading")) {
                                        str2 = ((avj0) zuj0Var).h(kyh0.common_loading);
                                        break;
                                    }
                                    str2 = null;
                                    break;
                                case 1056397409:
                                    if (str4.equals("your_arrived")) {
                                        str2 = ((avj0) zuj0Var).h(kyh0.your_arrived);
                                        break;
                                    }
                                    str2 = null;
                                    break;
                                case 1309361602:
                                    if (str4.equals("due_chart_arrival_label")) {
                                        str2 = ((avj0) zuj0Var).h(kyh0.due_chart_arrival_label);
                                        break;
                                    }
                                    str2 = null;
                                    break;
                                case 1377628753:
                                    if (str4.equals("order_details")) {
                                        str2 = ((avj0) zuj0Var).h(kyh0.order_details);
                                        break;
                                    }
                                    str2 = null;
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                formattedText3 = null;
                                e = FormattedText.h.e(r12, str2, null, null, 2046);
                            } else {
                                formattedText3 = null;
                                if (!evu0.J(str4)) {
                                    e = FormattedText.h.e(r12, ((avj0) zuj0Var).h(kyh0.common_loading), null, null, 2046);
                                }
                            }
                            r12 = e;
                        } else {
                            formattedText3 = formattedText4;
                        }
                        arrayList3.add(r12);
                        formattedText4 = formattedText3;
                        str3 = str;
                    }
                    formattedText = formattedText4;
                    formattedText2 = new FormattedText(arrayList3);
                }
                arrayList2.add(new SlotItemLineDto(slotItemLineDto.a, slotItemLineDto.b, formattedText2));
                formattedText4 = formattedText;
                i = 10;
                str3 = str;
            }
            arrayList.add(new SlotItemBodyDto(arrayList2, slotItemBodyDto.b));
            formattedText4 = formattedText4;
            i = 10;
            str3 = str;
        }
        return SlotItemDto.a(slotItemDto, arrayList);
    }
}
