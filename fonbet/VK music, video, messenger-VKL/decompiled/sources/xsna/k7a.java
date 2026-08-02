package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.core.view.components.picture.VkImage;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;

/* compiled from: CatalogImageUtils.kt */
/* loaded from: classes16.dex */
public final class k7a {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: CatalogImageUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentType.values().length];
            try {
                iArr[ContentType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentType.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentType.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContentType.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContentType.CONCERT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContentType.ARTIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ContentType.ARTIST_BIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ContentType.CURATOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ContentType.AUDIO_PLAYLISTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ContentType.AUDIO_ALBUMS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String e(float f, CatalogDataType catalogDataType, CatalogViewType catalogViewType, Integer num) {
        StringBuilder sb = new StringBuilder();
        sb.append(catalogDataType.getId());
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(catalogViewType.getId());
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (num != null) {
            sb.append(String.valueOf(num.intValue()));
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        sb.append(f);
        return sb.toString();
    }

    public final void a(VkImage vkImage, ContentType contentType, CatalogDataType catalogDataType, CatalogViewType catalogViewType, float f) {
        switch (contentType == null ? -1 : a.$EnumSwitchMapping$0[contentType.ordinal()]) {
            case 1:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_users_24, catalogDataType, catalogViewType, f));
                vkImage.setBackgroundImage(null);
                break;
            case 2:
            case 3:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_user_24, catalogDataType, catalogViewType, f));
                vkImage.setBackgroundImage(null);
                break;
            case 4:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_videos_32, catalogDataType, catalogViewType, f));
                vkImage.setBackgroundImage(null);
                break;
            case 5:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_calendar_outline_28, catalogDataType, catalogViewType, f));
                break;
            case 6:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_music_mic_24, catalogDataType, catalogViewType, f));
                break;
            case 7:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_music_mic_outline_36, catalogDataType, catalogViewType, f));
                vkImage.setBackgroundImage(null);
                break;
            case 8:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_user_outline_24, catalogDataType, catalogViewType, f));
                break;
            case 9:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_playlist_outline_24, catalogDataType, catalogViewType, f));
                break;
            case 10:
                vkImage.setEmptyImagePlaceholder(g(vkImage.getContext(), R.drawable.vk_icon_vinyl_outline_24, catalogDataType, catalogViewType, f));
                break;
            default:
                vkImage.setEmptyImagePlaceholder(f(vkImage.getContext(), catalogDataType, catalogViewType, f));
                vkImage.setBackgroundImage(null);
                break;
        }
    }

    public final void b(VKImageView vKImageView, ContentType contentType, CatalogDataType catalogDataType, CatalogViewType catalogViewType, float f) {
        switch (contentType == null ? -1 : a.$EnumSwitchMapping$0[contentType.ordinal()]) {
            case 1:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_users_24, catalogDataType, catalogViewType, f));
                vKImageView.setBackgroundImage(null);
                break;
            case 2:
            case 3:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_user_24, catalogDataType, catalogViewType, f));
                vKImageView.setBackgroundImage(null);
                break;
            case 4:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_videos_32, catalogDataType, catalogViewType, f));
                vKImageView.setBackgroundImage(null);
                break;
            case 5:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_calendar_outline_28, catalogDataType, catalogViewType, f));
                break;
            case 6:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_music_mic_24, catalogDataType, catalogViewType, f));
                break;
            case 7:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_music_mic_outline_36, catalogDataType, catalogViewType, f));
                vKImageView.setBackgroundImage(null);
                break;
            case 8:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_user_outline_24, catalogDataType, catalogViewType, f));
                break;
            case 9:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_playlist_outline_24, catalogDataType, catalogViewType, f));
                break;
            case 10:
                vKImageView.setEmptyImagePlaceholder(g(vKImageView.getContext(), R.drawable.vk_icon_vinyl_outline_24, catalogDataType, catalogViewType, f));
                break;
            default:
                vKImageView.setEmptyImagePlaceholder(f(vKImageView.getContext(), catalogDataType, catalogViewType, f));
                vKImageView.setBackgroundImage(null);
                break;
        }
    }

    public final void d(VKImageView vKImageView, CatalogDataType catalogDataType, CatalogViewType catalogViewType, float f) {
        vKImageView.setPlaceholderImage(f(vKImageView.getContext(), catalogDataType, catalogViewType, f));
    }

    public final Drawable f(Context context, CatalogDataType catalogDataType, CatalogViewType catalogViewType, float f) {
        String e = e(f, catalogDataType, catalogViewType, null);
        LinkedHashMap linkedHashMap = this.a;
        Drawable drawable = (Drawable) linkedHashMap.get(e);
        if (drawable != null) {
            return drawable;
        }
        hny hnyVar = new hny(context);
        hnyVar.c(f, R.attr.vk_ui_image_placeholder);
        linkedHashMap.put(e, hnyVar);
        return hnyVar;
    }

    public final Drawable g(Context context, int i, CatalogDataType catalogDataType, CatalogViewType catalogViewType, float f) {
        String e = e(f, catalogDataType, catalogViewType, Integer.valueOf(i));
        LinkedHashMap linkedHashMap = this.a;
        Drawable drawable = (Drawable) linkedHashMap.get(e);
        if (drawable != null) {
            return drawable;
        }
        hny hnyVar = new hny(context);
        hnyVar.d(i, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        hnyVar.c(f, R.attr.vk_ui_image_placeholder);
        linkedHashMap.put(e, hnyVar);
        return hnyVar;
    }
}
