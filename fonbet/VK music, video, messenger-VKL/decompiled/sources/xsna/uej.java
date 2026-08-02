package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: ContactsSyncedSnackbar.kt */
/* loaded from: classes18.dex */
public final class uej {
    public static void a(Context context, gzs gzsVar, boolean z) {
        if (z) {
            fdw.a(context, tq.h(tlo0.Companion, R.string.vkim_search_sync_snack_text), new tlo0.f(R.string.vkim_search_sync_snack_button), new nm7(1, gzsVar));
            return;
        }
        tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_search_sync_snack_not_found_text);
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_secondary), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.n();
    }
}
