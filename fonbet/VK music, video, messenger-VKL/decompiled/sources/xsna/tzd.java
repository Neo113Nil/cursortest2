package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsEditorStateDurationsMaintainerImpl.kt */
/* loaded from: classes16.dex */
public final class tzd {
    public final ClipsEditorAudioItem a(ClipsEditorAudioItem clipsEditorAudioItem, List<com.vk.clips.editor.state.model.c> list) {
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        if (clipsEditorAudioItem == null || (clipsEditorMusicInfo = clipsEditorAudioItem.a) == null) {
            return null;
        }
        int i = clipsEditorMusicInfo.d;
        int i2 = clipsEditorMusicInfo.e;
        if (clipsEditorAudioItem.e) {
            return clipsEditorAudioItem;
        }
        Iterator<T> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((com.vk.clips.editor.state.model.c) it.next()).getDurationMs();
        }
        int min = Math.min(i2, (i - clipsEditorMusicInfo.f) + ((int) j));
        if (min - i < bzd.z) {
            return null;
        }
        if (i2 != min) {
            clipsEditorMusicInfo = ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, null, 0, min, 0, null, 0, 2039);
        }
        ClipsEditorMusicInfo clipsEditorMusicInfo2 = clipsEditorMusicInfo;
        int b = (int) clipsEditorAudioItem.b();
        int i3 = clipsEditorMusicInfo2.e;
        int i4 = clipsEditorMusicInfo2.d;
        if (i3 <= i4) {
            i3 = clipsEditorMusicInfo2.b.e;
        }
        return ClipsEditorAudioItem.a(clipsEditorAudioItem, ClipsEditorMusicInfo.zb(clipsEditorMusicInfo2, null, null, 0, swe0.g(i3 - i4, 0, b) + i4, 0, null, 0, 2039), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
    }
}
