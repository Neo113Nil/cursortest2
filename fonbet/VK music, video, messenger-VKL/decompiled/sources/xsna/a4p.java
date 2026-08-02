package xsna;

import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.item.VideoRawItem;

/* compiled from: EditorFeatureChecker.kt */
/* loaded from: classes3.dex */
public final class a4p {
    public static final boolean a(VideoItem videoItem) {
        return videoItem.z() != 1.0d || ((Boolean) videoItem.X8().d.getValue()).booleanValue() || (videoItem instanceof VideoRawItem);
    }
}
