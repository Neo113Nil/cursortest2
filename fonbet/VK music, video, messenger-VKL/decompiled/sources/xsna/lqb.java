package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: ChatDeleteSnackbar.kt */
/* loaded from: classes2.dex */
public final class lqb {
    public static void a(Context context, gzs gzsVar, boolean z) {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_positive);
        if (!z) {
            tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_chat_deleted_snackbar_title);
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, valueOf, (Size) null, 12);
            aVar.u = new ikv0.d(new ikv0.d.c(h.b(context.getResources()).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            aVar.n();
            return;
        }
        tlo0.f h2 = tq.h(tlo0.Companion, R.string.vkim_chat_deleted_snackbar_title);
        tlo0.f fVar = new tlo0.f(R.string.vkim_cancel);
        ikv0.d.c cVar = new ikv0.d.c(tlo0.b.a(h2, context).toString());
        ikv0.a aVar2 = new ikv0.a(context);
        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, valueOf, (Size) null, 12);
        aVar2.u = new ikv0.d(cVar, (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, fVar.b(context.getResources()).toString(), new kqb(0, gzsVar));
        aVar2.n();
    }
}
