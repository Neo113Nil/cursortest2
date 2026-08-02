package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PurchaseDetails;

/* compiled from: StickersBridge.kt */
/* loaded from: classes5.dex */
public interface n8l0 {
    void a(Context context);

    void c(Activity activity, PurchaseDetails purchaseDetails, gzs<s3q0> gzsVar);

    String d();

    void e(boolean z);

    default void b(Context context, UserId userId, long j) {
    }
}
