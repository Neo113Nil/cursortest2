package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.actions.ActionOpenUrl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ApiModelTransformer.kt */
/* loaded from: classes4.dex */
public final class qz2 {

    /* compiled from: ApiModelTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseLinkButtonActionTypeDto.values().length];
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ENABLE_TOP_NEWSFEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.GROUPS_ADVERTISEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MARKET_WRITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.HELP_HINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_VKAPP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_GAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_INTERNAL_VKUI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SPECIALS_PERFORM_ACTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.JOIN_GROUP_AND_OPEN_URL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FOLLOW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.UPLOAD_VIDEO.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CREATE_PLAYLIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CREATE_ALBUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_LISTS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_SORT_MODES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ADD_FRIEND.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.QR_CAMERA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_REQUESTS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SCREEN.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SCREEN_LARGE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_MESSAGE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_CALL.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_SEND_GIFT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_LABEL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAY_AUDIOS_FROM_BLOCK.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAY_SHUFFLED_AUDIOS_FROM_BLOCK.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.UNFOLLOW_ARTIST.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CREATE_GROUP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLOSE_NOTIFICATION.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SWITCH_SECTION.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLEAR_RECENT_GROUPS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLOSE_CATALOG_BANNER.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MODAL_PAGE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.LIVE_CATEGORIES.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MOVIE_CATEGORIES.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.TOGGLE_VIDEO_ALBUM_SUBSCRIPTION.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLEAR_VIDEO_HISTORY.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OWNER_BUTTON.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ENTER_EDIT_MODE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAYLISTS_LISTS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.UNFOLLOW_CURATOR.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.REORDER_ITEMS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.EDIT_ITEMS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SELECT_SORTING.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MARKET_ABANDONED_CARTS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Image a(List<PhotosPhotoSizesDto> list) {
        ArrayList arrayList = new ArrayList();
        for (PhotosPhotoSizesDto photosPhotoSizesDto : list) {
            String url = photosPhotoSizesDto.getUrl();
            String d = (url == null || url.length() == 0) ? photosPhotoSizesDto.d() : photosPhotoSizesDto.getUrl();
            int width = photosPhotoSizesDto.getWidth();
            int height = photosPhotoSizesDto.getHeight();
            Boolean valueOf = Boolean.valueOf(photosPhotoSizesDto.e() == PhotosPhotoSizesTypeDto.BASE);
            ImageSizeKey.a aVar = ImageSizeKey.Companion;
            String i = photosPhotoSizesDto.e().i();
            char i2 = ImageSizeKey.SIZE_X_0604.i();
            aVar.getClass();
            arrayList.add(new ImageSize(d, width, height, valueOf, ImageSizeKey.a.c(i, i2), false, 32, null));
        }
        return new Image(arrayList);
    }

    public static final ActionOpenUrl.Target b(BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto) {
        String i = baseOwnerButtonActionTargetDto.i();
        return epx.f(i, BaseOwnerButtonActionTargetDto.INTERNAL.i()) ? ActionOpenUrl.Target.f88internal : epx.f(i, BaseOwnerButtonActionTargetDto.EXTERNAL.i()) ? ActionOpenUrl.Target.external : epx.f(i, BaseOwnerButtonActionTargetDto.AUTHORIZE.i()) ? ActionOpenUrl.Target.authorize : ActionOpenUrl.Target.f30default;
    }
}
