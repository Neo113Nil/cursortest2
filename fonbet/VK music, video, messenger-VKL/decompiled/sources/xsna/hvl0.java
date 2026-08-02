package xsna;

import com.vk.stickers.api.styles.AccentStyleColor;
import com.vk.stickers.api.styles.StickerCommonStyle;
import java.util.List;

/* compiled from: StoriesStickerStyleProviderImpl.kt */
/* loaded from: classes6.dex */
public final class hvl0 implements com.vk.stickers.api.styles.b {
    public static final List<StickerCommonStyle> a = e43.l(StickerCommonStyle.DARK, StickerCommonStyle.LIGHT, StickerCommonStyle.ACCENT);

    public static StickerCommonStyle e(StickerCommonStyle stickerCommonStyle, List list) {
        if (stickerCommonStyle != null) {
            if (!list.contains(stickerCommonStyle)) {
                stickerCommonStyle = null;
            }
            if (stickerCommonStyle != null) {
                return stickerCommonStyle;
            }
        }
        return StickerCommonStyle.DARK;
    }

    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a a(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        List<StickerCommonStyle> list = a;
        return new etm0(e(stickerCommonStyle, list), list, AccentStyleColor.HASHTAG, c7l0Var != null ? c7l0Var.a : null);
    }

    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a b(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        List<StickerCommonStyle> list = a;
        return new etm0(e(stickerCommonStyle, list), list, AccentStyleColor.GEO_PLACE, c7l0Var != null ? c7l0Var.a : null);
    }

    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a c(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        List<StickerCommonStyle> list = a;
        return new etm0(e(stickerCommonStyle, list), list, AccentStyleColor.MENTION, c7l0Var != null ? c7l0Var.a : null);
    }

    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a d(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        List<StickerCommonStyle> list = a;
        return new etm0(e(stickerCommonStyle, list), list, AccentStyleColor.LINK, c7l0Var != null ? c7l0Var.a : null);
    }
}
