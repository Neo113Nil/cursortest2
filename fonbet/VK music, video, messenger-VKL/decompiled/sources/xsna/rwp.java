package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: ErrorSnackbar.kt */
/* loaded from: classes18.dex */
public final class rwp {
    public static final ikv0 a(Context context, Exception exc, boolean z) {
        com.vk.ecomm.onlinebooking.impl.common.a c = com.vk.ecomm.onlinebooking.impl.common.b.c(exc);
        String b = com.vk.ecomm.onlinebooking.impl.common.b.b(c, context);
        String a = com.vk.ecomm.onlinebooking.impl.common.b.a(c, context);
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(new ikv0.d.c(b), new ikv0.d.b(a), (ikv0.d.a) null, 4);
        if (z) {
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(cn70.b(28), cn70.b(28)), 8);
        }
        aVar.o = Integer.valueOf(cn70.b(8));
        return aVar.n();
    }
}
