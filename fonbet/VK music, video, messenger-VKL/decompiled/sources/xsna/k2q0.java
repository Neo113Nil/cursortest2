package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: UnarchiveSnackbar.kt */
/* loaded from: classes16.dex */
public final class k2q0 {
    public static void a(Context context, gzs gzsVar) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(new gko(R.drawable.vk_icon_archive_outline_28), new x7g(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channels_archived)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.vkim_channels_unarchive_channel), new hj40(1, gzsVar));
        aVar.n();
    }
}
