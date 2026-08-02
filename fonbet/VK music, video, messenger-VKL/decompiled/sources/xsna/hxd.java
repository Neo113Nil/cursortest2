package xsna;

import android.net.Uri;
import android.util.SparseArray;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.clips.music.MusicCatalogInfoEditor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.music.Thumb;

/* compiled from: ClipsEditorDataMapper.kt */
/* loaded from: classes18.dex */
public final class hxd {
    public static final ClipsEditorMusicInfo a(StoryMusicInfo storyMusicInfo) {
        ClipsEditorMusicTrack b = b(storyMusicInfo.b);
        String str = storyMusicInfo.c;
        int i = storyMusicInfo.d;
        int i2 = storyMusicInfo.e;
        int i3 = storyMusicInfo.f;
        int i4 = storyMusicInfo.i;
        boolean z = storyMusicInfo.k;
        String str2 = storyMusicInfo.g;
        boolean z2 = storyMusicInfo.j;
        AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = storyMusicInfo.l;
        return new ClipsEditorMusicInfo(b, str, i, i2, i3, str2, i4, z2, z, audioFromMusicCatalogInfo != null ? new MusicCatalogInfoEditor(audioFromMusicCatalogInfo.b, audioFromMusicCatalogInfo.c, audioFromMusicCatalogInfo.d, audioFromMusicCatalogInfo.e, audioFromMusicCatalogInfo.f) : null, storyMusicInfo.m);
    }

    public static final ClipsEditorMusicTrack b(MusicTrack musicTrack) {
        String Kb = musicTrack.Kb(ClipsEditorMusicTrack.m);
        int i = musicTrack.b;
        UserId userId = musicTrack.c;
        String str = musicTrack.d;
        int i2 = musicTrack.c0;
        String str2 = musicTrack.h;
        String str3 = musicTrack.i;
        String str4 = musicTrack.y;
        Uri uri = null;
        if (Kb != null) {
            if (drm0.N(Kb)) {
                Kb = null;
            }
            if (Kb != null) {
                uri = Uri.parse(Kb);
            }
        }
        return new ClipsEditorMusicTrack(i, userId, str, i2, str2, str3, str4, uri, musicTrack.R, musicTrack.K, musicTrack.X);
    }

    public static final MusicTrack c(ClipsEditorMusicTrack clipsEditorMusicTrack) {
        SparseArray sparseArray;
        AlbumLink albumLink;
        Uri uri = clipsEditorMusicTrack.i;
        if (uri != null) {
            sparseArray = new SparseArray();
            int i = ClipsEditorMusicTrack.m;
            sparseArray.put(ClipsEditorMusicTrack.m, uri);
        } else {
            sparseArray = null;
        }
        int i2 = clipsEditorMusicTrack.b;
        UserId userId = clipsEditorMusicTrack.c;
        String str = clipsEditorMusicTrack.d;
        int i3 = clipsEditorMusicTrack.e / 1000;
        String str2 = clipsEditorMusicTrack.f;
        String str3 = clipsEditorMusicTrack.g;
        String str4 = clipsEditorMusicTrack.h;
        if (sparseArray != null) {
            albumLink = new AlbumLink(0, UserId.d, null, null, new Thumb((SparseArray<Uri>) sparseArray), null, 32, null);
        } else {
            albumLink = null;
        }
        return new MusicTrack(i2, userId, str, null, i3, 0, str2, str3, null, 0, false, false, 0, null, false, albumLink, null, false, null, null, null, null, null, str4, 0L, 0, false, 0L, null, false, false, false, null, null, null, clipsEditorMusicTrack.k, false, false, 0, null, false, 0, clipsEditorMusicTrack.j, null, null, false, 0, null, clipsEditorMusicTrack.l, null, null, null, -8421592, 982007, null);
    }

    public static final StoryMusicInfo d(ClipsEditorMusicInfo clipsEditorMusicInfo) {
        MusicTrack c = c(clipsEditorMusicInfo.b);
        String str = clipsEditorMusicInfo.c;
        int i = clipsEditorMusicInfo.d;
        int i2 = clipsEditorMusicInfo.e;
        int i3 = clipsEditorMusicInfo.f;
        int i4 = clipsEditorMusicInfo.h;
        boolean z = clipsEditorMusicInfo.j;
        String str2 = clipsEditorMusicInfo.g;
        boolean z2 = clipsEditorMusicInfo.i;
        MusicCatalogInfoEditor musicCatalogInfoEditor = clipsEditorMusicInfo.k;
        return new StoryMusicInfo(c, str, i, i2, i3, str2, false, i4, z2, z, musicCatalogInfoEditor != null ? new AudioFromMusicCatalogInfo(musicCatalogInfoEditor.b, musicCatalogInfoEditor.c, musicCatalogInfoEditor.d, musicCatalogInfoEditor.e, musicCatalogInfoEditor.f) : null, clipsEditorMusicInfo.l, false, 4160, null);
    }
}
