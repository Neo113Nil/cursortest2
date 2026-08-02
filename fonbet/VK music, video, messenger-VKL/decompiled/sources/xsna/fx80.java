package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.ecomm.orders.impl.common.model.OrderSnackbar;
import com.vkontakte.android.R;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: OrderSnackbarEventHandler.kt */
/* loaded from: classes18.dex */
public final class fx80 {
    public static void a(Context context, OrderSnackbar orderSnackbar) {
        ikv0.a aVar = new ikv0.a(context);
        if (orderSnackbar.b == OrderSnackbar.Style.Error) {
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        }
        aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(orderSnackbar.a, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.n();
    }
}
