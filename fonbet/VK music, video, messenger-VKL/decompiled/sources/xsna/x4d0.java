package xsna;

import com.vk.clips.models.VideoUrlPack;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.util.List;

/* compiled from: PreviewPickerMode.kt */
/* loaded from: classes17.dex */
public interface x4d0 {

    /* compiled from: PreviewPickerMode.kt */
    public static final class a implements x4d0 {
        public final Timeline a;
        public final List<ISerializableStickerSDK> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Timeline timeline, List<? extends ISerializableStickerSDK> list) {
            this.a = timeline;
            this.b = list;
        }
    }

    /* compiled from: PreviewPickerMode.kt */
    public static final class b implements x4d0 {
        public final VideoUrlPack a;
        public final String b;

        public b(VideoUrlPack videoUrlPack, String str) {
            this.a = videoUrlPack;
            this.b = str;
        }
    }
}
