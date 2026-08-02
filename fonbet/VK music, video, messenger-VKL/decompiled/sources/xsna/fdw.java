package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: ImSnackbarHelper.kt */
/* loaded from: classes2.dex */
public final class fdw {
    public static void a(Context context, tlo0 tlo0Var, tlo0.f fVar, gzs gzsVar) {
        ikv0.d.c cVar = new ikv0.d.c(tlo0Var.a(context).toString());
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
        aVar.u = new ikv0.d(cVar, (ikv0.d.b) null, (ikv0.d.a) null, 4);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, tlo0.b.a(fVar, context).toString(), new ddw(0, gzsVar));
        aVar.n();
    }
}
