package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.media.MediaUtils;
import java.io.File;

/* compiled from: ClipsEditorInputMapper.kt */
/* loaded from: classes16.dex */
public final class jyd {
    public static final ClipsEditorInputVideoItem a(ClipsProcessedItem clipsProcessedItem) {
        File file = new File(clipsProcessedItem.b);
        long j = clipsProcessedItem.c;
        TranscodingState transcodingState = clipsProcessedItem.d;
        MediaUtils.AudioConfigLight audioConfigLight = clipsProcessedItem.e;
        return new ClipsEditorInputVideoItem(file, 0L, j, null, null, null, transcodingState, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, clipsProcessedItem.g, null, audioConfigLight != null ? new AudioConfigEditor(audioConfigLight.b, audioConfigLight.c) : null, null, clipsProcessedItem.f, null, 87994, null);
    }
}
