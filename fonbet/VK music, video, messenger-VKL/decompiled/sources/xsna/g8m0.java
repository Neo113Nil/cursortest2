package xsna;

import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerAttachTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerCameraTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerEffectDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerFilterPhotoDto;
import com.vk.dto.stories.model.StoryUploadParams;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StoryPhotoUploadMapper.kt */
/* loaded from: classes3.dex */
public final class g8m0 {

    /* compiled from: StoryPhotoUploadMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryUploadParams.CameraType.values().length];
            try {
                iArr[StoryUploadParams.CameraType.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryUploadParams.CameraType.FRONT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryUploadParams.CameraType.GALLERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryUploadParams.CameraType.GALLERY_MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryUploadParams.CameraType.BACK_MULTI_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryUploadParams.CameraType.FRONT_MULTI_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryUploadParams.CameraType.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoryUploadParams.CameraType.AVATAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StoryUploadParams.CameraType.STORY_BOX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StoryUploadParams.CameraType.REPOST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static StoriesGetPhotoUploadServerEffectDto a(String str) {
        Object obj;
        Iterator<E> it = StoriesGetPhotoUploadServerEffectDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((StoriesGetPhotoUploadServerEffectDto) obj).j(), str)) {
                break;
            }
        }
        return (StoriesGetPhotoUploadServerEffectDto) obj;
    }

    public static StoriesGetPhotoUploadServerFilterPhotoDto b(String str) {
        Object obj;
        Iterator<E> it = StoriesGetPhotoUploadServerFilterPhotoDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((StoriesGetPhotoUploadServerFilterPhotoDto) obj).j(), str)) {
                break;
            }
        }
        return (StoriesGetPhotoUploadServerFilterPhotoDto) obj;
    }

    public static StoriesGetPhotoUploadServerCameraTypeDto c(StoryUploadParams.CameraType cameraType) {
        switch (a.$EnumSwitchMapping$0[cameraType.ordinal()]) {
            case 1:
                return StoriesGetPhotoUploadServerCameraTypeDto.BACK;
            case 2:
                return StoriesGetPhotoUploadServerCameraTypeDto.FRONT;
            case 3:
                return StoriesGetPhotoUploadServerCameraTypeDto.GALLERY;
            case 4:
                return StoriesGetPhotoUploadServerCameraTypeDto.GALLERY_MULTI;
            case 5:
                return StoriesGetPhotoUploadServerCameraTypeDto.BACK_MULTI_VIDEO;
            case 6:
                return StoriesGetPhotoUploadServerCameraTypeDto.FRONT_MULTI_VIDEO;
            case 7:
                return StoriesGetPhotoUploadServerCameraTypeDto.UNDEFINED;
            case 8:
                return StoriesGetPhotoUploadServerCameraTypeDto.AVATAR;
            case 9:
                return StoriesGetPhotoUploadServerCameraTypeDto.STORYBOX;
            case 10:
                return StoriesGetPhotoUploadServerCameraTypeDto.REPOST;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static StoriesGetPhotoUploadServerAttachTypeDto d(int i) {
        if (i == 5) {
            return StoriesGetPhotoUploadServerAttachTypeDto.AUDIO;
        }
        if (i == 18) {
            return StoriesGetPhotoUploadServerAttachTypeDto.PHOTO;
        }
        if (i != 30) {
            return null;
        }
        return StoriesGetPhotoUploadServerAttachTypeDto.VIDEO;
    }
}
