package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.stickers.dto.StickersUnSubscribePackAuthorRefDto;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.stickers.details.AuthorSubscriptionRef;

/* compiled from: StickerDetailsContract.kt */
/* loaded from: classes6.dex */
public interface i3l0 extends gm6, y5l0 {
    void B(StickerStockItem stickerStockItem);

    void N(StickerStockItem stickerStockItem, AuthorSubscriptionRef authorSubscriptionRef);

    void N0();

    void R(StickerStockItem stickerStockItem);

    boolean T1();

    void W5(StickerStockItem stickerStockItem, StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto);

    void c5(FragmentActivity fragmentActivity, boolean z);

    void g1(StickerStockItem stickerStockItem, VmojiAvatarModel vmojiAvatarModel);

    void j0(StickerStockItem stickerStockItem);
}
