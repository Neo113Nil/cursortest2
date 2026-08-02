package xsna;

import com.vk.stickers.api.styles.AccentStyleColor;
import com.vk.stickers.api.styles.StickerCommonStyle;

/* compiled from: ClipsStickerStyleProviderImpl.kt */
/* loaded from: classes16.dex */
public final class y4f implements com.vk.stickers.api.styles.b {
    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a a(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        if (stickerCommonStyle == null) {
            StickerCommonStyle.Companion.getClass();
            stickerCommonStyle = StickerCommonStyle.ACCENT_CONTENT;
        }
        StickerCommonStyle.Companion.getClass();
        return new etm0(stickerCommonStyle, e43.l(StickerCommonStyle.DARK, StickerCommonStyle.LIGHT, StickerCommonStyle.ACCENT_BACKGROUND, StickerCommonStyle.ACCENT_CONTENT), AccentStyleColor.HASHTAG, c7l0Var != null ? c7l0Var.a : null);
    }

    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a b(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        if (stickerCommonStyle == null) {
            StickerCommonStyle.Companion.getClass();
            stickerCommonStyle = StickerCommonStyle.ACCENT_CONTENT;
        }
        StickerCommonStyle.Companion.getClass();
        return new etm0(stickerCommonStyle, e43.l(StickerCommonStyle.DARK, StickerCommonStyle.LIGHT, StickerCommonStyle.ACCENT_BACKGROUND, StickerCommonStyle.ACCENT_CONTENT, StickerCommonStyle.DARK_WITHOUT_BACKGROUND, StickerCommonStyle.LIGHT_WITHOUT_BACKGROUND, StickerCommonStyle.DARK_UNIQUE, StickerCommonStyle.LIGHT_UNIQUE), AccentStyleColor.GEO_PLACE, c7l0Var != null ? c7l0Var.a : null);
    }

    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a c(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        if (stickerCommonStyle == null) {
            StickerCommonStyle.Companion.getClass();
            stickerCommonStyle = StickerCommonStyle.ACCENT_CONTENT;
        }
        StickerCommonStyle.Companion.getClass();
        return new etm0(stickerCommonStyle, e43.l(StickerCommonStyle.DARK, StickerCommonStyle.LIGHT, StickerCommonStyle.ACCENT_BACKGROUND, StickerCommonStyle.ACCENT_CONTENT), AccentStyleColor.MENTION, c7l0Var != null ? c7l0Var.a : null);
    }

    @Override // com.vk.stickers.api.styles.b
    public final com.vk.stickers.api.styles.a d(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
        if (stickerCommonStyle == null) {
            StickerCommonStyle.Companion.getClass();
            stickerCommonStyle = StickerCommonStyle.ACCENT_CONTENT;
        }
        StickerCommonStyle.Companion.getClass();
        return new etm0(stickerCommonStyle, e43.l(StickerCommonStyle.DARK, StickerCommonStyle.LIGHT, StickerCommonStyle.ACCENT_BACKGROUND, StickerCommonStyle.ACCENT_CONTENT, StickerCommonStyle.DARK_WITHOUT_BACKGROUND, StickerCommonStyle.LIGHT_WITHOUT_BACKGROUND), AccentStyleColor.LINK, c7l0Var != null ? c7l0Var.a : null);
    }
}
