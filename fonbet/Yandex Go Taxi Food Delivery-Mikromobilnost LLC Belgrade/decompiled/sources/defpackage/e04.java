package defpackage;

import com.ybsdk.core.common.data.network.dto.PaymentMethodDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SavingsNoticeDto;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class e04 {
    public final w530 a;
    public final gdb0 b;

    public e04(w530 w530Var, gdb0 gdb0Var) {
        this.a = w530Var;
        this.b = gdb0Var;
    }

    public static List a(List list, FullScreenEntity$Type fullScreenEntity$Type) {
        ArrayList arrayList;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(yua1.c((FullScreenDto) it.next(), fullScreenEntity$Type));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.a : arrayList;
    }

    public final pz3 b(SavingsNoticeDto savingsNoticeDto) {
        String title = savingsNoticeDto.getTitle();
        String buttonText = savingsNoticeDto.getButtonText();
        List<PaymentMethodDto> paymentMethods = savingsNoticeDto.getPaymentMethods();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paymentMethods.iterator();
        while (it.hasNext()) {
            h5a0 a = j5a0.a((PaymentMethodDto) it.next(), this.a, false);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new pz3(title, buttonText, arrayList);
    }
}
