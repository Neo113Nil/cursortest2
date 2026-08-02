package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodItem$LeftImageType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class odq0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(Context context, List list, String str, String str2, boolean z) {
        boolean z2;
        SelectPaymentMethodItem$LeftImageType selectPaymentMethodItem$LeftImageType;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                h5a0 h5a0Var = (h5a0) obj;
                boolean equals = str != null ? str.equals(h5a0Var.getId()) : jl40.l(str2, h5a0Var.getId());
                Drawable t = vng.t(equals ? txg0.ybsdk_ic_selected_payment_method : txg0.ybsdk_ic_unselected_payment_method, context);
                if ((h5a0Var instanceof g5a0) || (h5a0Var instanceof f5a0)) {
                    z2 = 1;
                } else {
                    if (!(h5a0Var instanceof c5a0) && !(h5a0Var instanceof e5a0)) {
                        w511.b();
                        return null;
                    }
                    z2 = i;
                }
                String id = h5a0Var.getId();
                rbv a = h5a0Var.a(context);
                ThemedImageUrlEntity c = h5a0Var.c();
                rbv d = c != null ? j5a0.d(c, i, 1) : null;
                Text title = h5a0Var.getTitle();
                String description = h5a0Var.getDescription();
                Text.Constant i4 = description != null ? g8e.i(Text.Companion, description) : null;
                kdq0 kdq0Var = new kdq0(h5a0Var, z2);
                if (h5a0Var instanceof c5a0) {
                    selectPaymentMethodItem$LeftImageType = SelectPaymentMethodItem$LeftImageType.RECTANGLE;
                } else {
                    if (!(h5a0Var instanceof g5a0) && !(h5a0Var instanceof f5a0) && !(h5a0Var instanceof e5a0)) {
                        w511.b();
                        return null;
                    }
                    selectPaymentMethodItem$LeftImageType = SelectPaymentMethodItem$LeftImageType.CIRCLE;
                }
                arrayList.add(new ddq0(id, a, d, title, i4, t, kdq0Var, true, equals, selectPaymentMethodItem$LeftImageType));
                if (z || i2 != scc.f(list)) {
                    arrayList.add(giy.c);
                }
                i2 = i3;
                i = 0;
            }
        }
        return arrayList;
    }

    public static final pdq0 b(Context context, String str, String str2, uda0 uda0Var, Text text, Integer num) {
        List list = uda0Var != null ? uda0Var.a : null;
        List list2 = uda0Var != null ? uda0Var.b : null;
        List list3 = list2;
        int i = 0;
        ArrayList arrayList = new ArrayList(a(context, list, str, str2, !(list3 == null || list3.isEmpty())));
        if (list2 != null) {
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                el0 el0Var = (el0) obj;
                String i3 = oyr.i(i, "button_");
                rbv rbvVar = el0Var.c;
                Text.Constant i4 = g8e.i(Text.Companion, el0Var.a);
                String str3 = el0Var.b;
                arrayList.add(new ddq0(i3, rbvVar, null, i4, str3 != null ? new Text.Constant(str3) : null, vng.t(txg0.ybsdk_ic_arrow_short_forward, context), new idq0(el0Var), false, false, SelectPaymentMethodItem$LeftImageType.RECTANGLE));
                if (i != scc.f(list2)) {
                    arrayList.add(giy.c);
                }
                i = i2;
            }
        }
        return new pdq0(arrayList, text == null ? unr0.h(Text.Companion, dzh0.ybsdk_deposit_psdk_payment_selection_title) : text, null, null, num, 16);
    }

    public static /* synthetic */ pdq0 c(Context context, String str, String str2, uda0 uda0Var, Text.Resource resource, int i) {
        if ((i & 16) != 0) {
            resource = null;
        }
        return b(context, str, str2, uda0Var, resource, null);
    }
}
