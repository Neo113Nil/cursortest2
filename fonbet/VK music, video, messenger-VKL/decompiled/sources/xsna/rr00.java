package xsna;

import android.content.Context;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vkontakte.android.R;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: MarketAlbumEditExitConfirmationActionSheet.kt */
/* loaded from: classes18.dex */
public final class rr00 {
    public static void a(Context context, gzs gzsVar) {
        a.C0785a c0785a = new a.C0785a();
        ListBuilder e = e43.e();
        e.add(new xu20(context.getString(R.string.market_album_confirmation_message), null, 0, null, 14));
        e.add(new ModalActionSheetListItem(0, ModalActionSheetListItem.Appearance.Negative, context.getString(R.string.market_album_exit_button), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
        c0785a.b = e.g();
        c0785a.c = new x7f(1, gzsVar);
        c0785a.f = true;
        c0785a.a(context, null);
    }
}
