package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;

/* compiled from: CatalogHintRenderer.kt */
/* loaded from: classes16.dex */
public interface b7a {
    static /* synthetic */ dcn c(b7a b7aVar, Context context, Rect rect, UIBlockHint uIBlockHint, gzs gzsVar, gzs gzsVar2, int i) {
        if ((i & 8) != 0) {
            gzsVar = new com.vk.movika.tools.controls.seekbar.n(9);
        }
        gzs gzsVar3 = gzsVar;
        if ((i & 16) != 0) {
            gzsVar2 = new r(4);
        }
        return b7aVar.f(context, rect, uIBlockHint, gzsVar3, gzsVar2);
    }

    boolean a(String str);

    dcn e(Activity activity, Rect rect, String str, com.vk.movika.sdk.base.model.props.d dVar);

    dcn f(Context context, Rect rect, UIBlockHint uIBlockHint, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);

    default void b(gzs<String> gzsVar) {
    }
}
