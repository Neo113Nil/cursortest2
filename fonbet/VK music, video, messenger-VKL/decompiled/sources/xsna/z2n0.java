package xsna;

import android.content.Context;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import java.util.List;

/* compiled from: AdapterDataProvider.kt */
/* loaded from: classes5.dex */
public interface z2n0 {
    void L(StickerItem stickerItem);

    List<AutoSuggestStickersPopupWindow.b> getItems();

    void p(StickerItem stickerItem, boolean z, Context context);
}
