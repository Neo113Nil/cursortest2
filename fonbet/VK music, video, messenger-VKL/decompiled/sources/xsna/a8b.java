package xsna;

import android.content.Context;
import android.util.Size;
import android.view.Window;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: ChannelPayoutNotificationManager.kt */
/* loaded from: classes16.dex */
public final class a8b {
    public final Context a;
    public final Window b;
    public final j9 c;
    public ikv0 d;
    public ikv0 e;

    public a8b(Context context, Window window, j9 j9Var) {
        this.a = context;
        this.b = window;
        this.c = j9Var;
    }

    public final ikv0 a(ikv0.d dVar, ikv0.e.a aVar, gzs gzsVar) {
        Window window = this.b;
        if (window == null) {
            return null;
        }
        ikv0.a aVar2 = new ikv0.a(this.a);
        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
        aVar2.u = dVar;
        if (aVar != null) {
            aVar2.s = aVar;
        }
        aVar2.i = FloatingViewGesturesHelper.SwipeDirection.None;
        aVar2.e = -1L;
        aVar2.h = new s9(gzsVar, 13);
        return aVar2.p(window);
    }
}
