package xsna;

import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerAttachTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerCameraTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerEffectDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerLifetimeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerMemoryTypeDto;
import com.vk.dto.stories.model.StoryUploadParams;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: StoryVideoUploadMapper.kt */
/* loaded from: classes3.dex */
public final class ikm0 {
    public static boolean a(String str) {
        return epx.f(str, "VIDEO_MESSAGE".toLowerCase(Locale.ROOT));
    }

    public static StoriesGetVideoUploadServerCameraTypeDto b(StoryUploadParams.CameraType cameraType) {
        Object obj;
        Iterator<E> it = StoriesGetVideoUploadServerCameraTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((StoriesGetVideoUploadServerCameraTypeDto) obj).j(), cameraType.toString())) {
                break;
            }
        }
        return (StoriesGetVideoUploadServerCameraTypeDto) obj;
    }

    public static StoriesGetVideoUploadServerEffectDto c(String str) {
        Locale locale = Locale.ROOT;
        boolean equals = str.equals("VIDEO_MESSAGE".toLowerCase(locale));
        Object obj = null;
        if (str.length() == 0 || equals) {
            return null;
        }
        if (str.equals("COLLAGE".toLowerCase(locale))) {
            return StoriesGetVideoUploadServerEffectDto.PHOTO;
        }
        Iterator<E> it = StoriesGetVideoUploadServerEffectDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((StoriesGetVideoUploadServerEffectDto) next).j(), str)) {
                obj = next;
                break;
            }
        }
        return (StoriesGetVideoUploadServerEffectDto) obj;
    }

    public static StoriesGetVideoUploadServerLifetimeDto d(int i) {
        return i != 1 ? i != 12 ? i != 48 ? StoriesGetVideoUploadServerLifetimeDto.TYPE_86400 : StoriesGetVideoUploadServerLifetimeDto.TYPE_172800 : StoriesGetVideoUploadServerLifetimeDto.TYPE_43200 : StoriesGetVideoUploadServerLifetimeDto.TYPE_3600;
    }

    public static StoriesGetVideoUploadServerMemoryTypeDto e(String str) {
        Object obj;
        Iterator<E> it = StoriesGetVideoUploadServerMemoryTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((StoriesGetVideoUploadServerMemoryTypeDto) obj).j(), str)) {
                break;
            }
        }
        return (StoriesGetVideoUploadServerMemoryTypeDto) obj;
    }

    public static StoriesGetVideoUploadServerAttachTypeDto f(int i) {
        if (i == 5) {
            return StoriesGetVideoUploadServerAttachTypeDto.AUDIO;
        }
        if (i == 18) {
            return StoriesGetVideoUploadServerAttachTypeDto.PHOTO;
        }
        if (i != 30) {
            return null;
        }
        return StoriesGetVideoUploadServerAttachTypeDto.VIDEO;
    }
}
