package xsna;

import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.stickers.api.models.AlbumStickerStyle;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vkontakte.android.R;

/* compiled from: StoryStickerTabStyle.kt */
/* loaded from: classes16.dex */
public final class nim0 {

    /* compiled from: StoryStickerTabStyle.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[PostStickerStyle.values().length];
            try {
                iArr[PostStickerStyle.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostStickerStyle.MINIATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostStickerStyle.FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReplyVideoStickerStyle.values().length];
            try {
                iArr2[ReplyVideoStickerStyle.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ReplyVideoStickerStyle.MINIATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ReplyVideoStickerStyle.FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PhotoStickerStyle.values().length];
            try {
                iArr3[PhotoStickerStyle.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PhotoStickerStyle.FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AlbumStickerStyle.values().length];
            try {
                iArr4[AlbumStickerStyle.Preview.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[AlbumStickerStyle.Miniature.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[MusicStickerStyle.values().length];
            try {
                iArr5[MusicStickerStyle.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[MusicStickerStyle.Album.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[MusicStickerStyle.HeaderMeta.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final Integer a(ReplyVideoStickerStyle replyVideoStickerStyle) {
        int i = a.$EnumSwitchMapping$1[replyVideoStickerStyle.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.string.repost_style_preview);
        }
        if (i == 2) {
            return Integer.valueOf(R.string.repost_style_miniature);
        }
        if (i != 3) {
            return null;
        }
        return Integer.valueOf(R.string.repost_style_fullscreen);
    }

    public static final Integer b(PostStickerStyle postStickerStyle) {
        int i = a.$EnumSwitchMapping$0[postStickerStyle.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.string.repost_style_preview);
        }
        if (i == 2) {
            return Integer.valueOf(R.string.repost_style_miniature);
        }
        if (i != 3) {
            return null;
        }
        return Integer.valueOf(R.string.repost_style_fullscreen);
    }

    public static final Integer c(ReplyVideoStickerStyle replyVideoStickerStyle) {
        int i = a.$EnumSwitchMapping$1[replyVideoStickerStyle.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.vk_icon_square_outline_24);
        }
        if (i == 2) {
            return Integer.valueOf(R.drawable.vk_icon_rectangle_text_outline_24);
        }
        if (i != 3) {
            return null;
        }
        return Integer.valueOf(R.drawable.vk_icon_expand_rectangle_vertical_outline_24);
    }

    public static final Integer d(PostStickerStyle postStickerStyle) {
        int i = a.$EnumSwitchMapping$0[postStickerStyle.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.vk_icon_square_outline_24);
        }
        if (i == 2) {
            return Integer.valueOf(R.drawable.vk_icon_rectangle_text_outline_24);
        }
        if (i != 3) {
            return null;
        }
        return Integer.valueOf(R.drawable.vk_icon_expand_rectangle_vertical_outline_24);
    }
}
