package xsna;

import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;

/* compiled from: StoriesGetUploadServer.kt */
/* loaded from: classes15.dex */
public final class qsl0 extends nd6 {

    /* compiled from: StoriesGetUploadServer.kt */
    public static final class a {
        public static qsl0 a(CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
            return new qsl0("stories.getPhotoUploadServer", commonUploadParams, storyUploadParams, null);
        }

        public static qsl0 b(StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, String str) {
            return new qsl0("stories.getVideoUploadServer", commonUploadParams, storyUploadParams, str);
        }
    }

    public qsl0(String str, CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams, String str2) {
        super(str);
        x7m0.a(storyUploadParams, commonUploadParams, str2, true, new phg(this, 7));
    }
}
