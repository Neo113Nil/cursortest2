package xsna;

import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.ServiceStickerStyle;

/* compiled from: StoryServicePreviewContract.kt */
/* loaded from: classes16.dex */
public abstract class hdm0 {
    public final ServiceStickerStyle a;
    public final StoryServiceItemInfo.Style b;

    /* compiled from: StoryServicePreviewContract.kt */
    public static final class a extends hdm0 {
        public static final a c = new a(ServiceStickerStyle.Sticker, StoryServiceItemInfo.Style.Sticker);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 492885801;
        }

        public final String toString() {
            return "OnlyStickerStyle";
        }
    }

    /* compiled from: StoryServicePreviewContract.kt */
    public static final class b extends hdm0 {
        public static final b c = new b(ServiceStickerStyle.Sticker, StoryServiceItemInfo.Style.StickerAndCta);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 821351580;
        }

        public final String toString() {
            return "StickerAndButtonStyle";
        }
    }

    public hdm0(ServiceStickerStyle serviceStickerStyle, StoryServiceItemInfo.Style style) {
        this.a = serviceStickerStyle;
        this.b = style;
    }
}
