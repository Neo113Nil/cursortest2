package xsna;

import android.content.Context;
import com.vk.stickers.api.styles.b;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: StoryClickableController.kt */
/* loaded from: classes6.dex */
public final class o0m0 implements w8i {
    public static final bpn0 c;
    public static final bpn0 e;
    public static final o0m0 b = new o0m0();
    public static final bpn0 d = new bpn0(new buc0(7));
    public static final Object f = msy.a(LazyThreadSafetyMode.NONE, new g9l0(1));
    public static final bpn0 g = new bpn0(new kk1(28));

    /* compiled from: StoryClickableController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebStickerType.values().length];
            try {
                iArr[WebStickerType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebStickerType.HASHTAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebStickerType.MENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebStickerType.GEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebStickerType.QUESTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WebStickerType.GIF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WebStickerType.MUSIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WebStickerType.TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WebStickerType.LINK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WebStickerType.MARKET_ITEM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WebStickerType.MARKET_SERVICE_ITEM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WebStickerType.SERVICE_YC_ITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WebStickerType.POLL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[WebStickerType.APP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[WebStickerType.STICKER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[WebStickerType.SITUATIONAL_THEME.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[WebStickerType.SITUATIONAL_TEMPLATE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[WebStickerType.REACTION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[WebStickerType.AUDIO_TRACK.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[WebStickerType.MUSIC_PLAYLIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[WebStickerType.OWNER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[WebStickerType.REPLY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[WebStickerType.PHOTO.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = 8;
        c = new bpn0(new d2c0(i));
        e = new bpn0(new ta50(i));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (dbg0.a(R.font.vk_sans_display_medium, context) == null) {
            Context context2 = e43.a;
            Context context3 = context2 != null ? context2 : null;
            FontFamily fontFamily = FontFamily.DISPLAY_DEMIBOLD;
            Font.Companion.getClass();
            Font.a.a(fontFamily, 13.0f).k(context3);
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        }
    }

    public static int a() {
        int a2 = y8g0.a(R.dimen.story_gradient_edit_view_horizontal_margin) * 2;
        return (iah0.v() - a2) - (y8g0.a(R.dimen.sticker_text_margin_end) + (y8g0.a(R.dimen.sticker_icon_margin_end) + (y8g0.a(R.dimen.sticker_icon_size) + y8g0.a(R.dimen.sticker_icon_margin_start))));
    }

    public static v4m0 b(String str, com.vk.stickers.api.styles.a aVar, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        String U = drm0.U(str, "#");
        if (aVar == null) {
            aVar = b.C1791b.a(bVar, null, c7l0Var, 1);
        }
        return new v4m0(new t4m0(aVar, null, U), new im80(4));
    }

    public static io.reactivex.rxjava3.core.x c(String str, boolean z) {
        return str.length() > 1 ? ((xsl0) c.getValue()).i(str, z).m(io.reactivex.rxjava3.android.schedulers.a.b()) : io.reactivex.rxjava3.core.x.k(new u4m0(EmptyList.b));
    }

    public static final int d(WebStickerType webStickerType) {
        switch (a.$EnumSwitchMapping$0[webStickerType.ordinal()]) {
            case 1:
            case 15:
                return Integer.MAX_VALUE;
            case 2:
                return o25.a().i().n;
            case 3:
                return o25.a().i().o;
            case 4:
            case 5:
            case 8:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
                return 1;
            case 6:
                return 4;
            case 7:
                return o25.a().i().p;
            case 9:
                return Math.min(1, 3);
            case 10:
            case 11:
                return o25.a().i().q;
            case 14:
                return 10;
            default:
                return webStickerType.j() ? 0 : Integer.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(WebStickerType webStickerType) {
        switch (a.$EnumSwitchMapping$0[webStickerType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 8:
            case 9:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 21:
            case 22:
            case 23:
                return true;
            case 4:
                return qxi.a().l();
            case 6:
                return ((evl0) d.getValue()).d();
            case 7:
                StoriesFeatures storiesFeatures = StoriesFeatures.ADDITIONAL_MUSIC_STICKER;
                storiesFeatures.getClass();
                return com.vk.toggle.b.A.a(storiesFeatures);
            case 10:
                g620.f().h().getClass();
                return true;
            case 11:
                g620.f().h().getClass();
                return true;
            case 13:
                return qxi.a().g();
            case 18:
                StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_REACTION_STICKER;
                storiesFeatures2.getClass();
                return com.vk.toggle.b.A.a(storiesFeatures2);
            case 19:
                StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_AUDIO_TRACK;
                storiesFeatures3.getClass();
                return com.vk.toggle.b.A.a(storiesFeatures3);
            case 20:
                return false;
            default:
                if (webStickerType.j()) {
                    return false;
                }
                break;
        }
    }
}
