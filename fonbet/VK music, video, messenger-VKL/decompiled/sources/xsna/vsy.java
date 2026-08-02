package xsna;

import android.os.Bundle;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: LazyLayoutDelegate.kt */
/* loaded from: classes2.dex */
public final class vsy implements gc40 {
    public final Object b;
    public Object c;

    public vsy(nsy nsyVar) {
        this.b = nsyVar;
    }

    public static boolean d() {
        return !i0q0.b();
    }

    @Override // xsna.gc40
    public List a() {
        MusicTrack musicTrack = (MusicTrack) this.b;
        ArrayList arrayList = new ArrayList();
        fy2 fy2Var = (fy2) this.c;
        Bundle bundle = (Bundle) fy2Var.b;
        if (bundle.containsKey("canSkipListening") && bundle.getBoolean("canSkipListening")) {
            arrayList.add(new ec40(R.id.music_action_podcast_mark_listened, (MusicTrack) this.b, R.string.music_podcast_listened, R.string.music_talkback_podcast_listened, R.drawable.vk_icon_headphones_outline_28, R.attr.vk_ui_icon_accent_themed, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
        }
        if (BuildInfo.u() && !jnj.d(musicTrack.V)) {
            arrayList.add(new ec40(R.id.music_action_podcast_episode_download, (MusicTrack) this.b, R.string.music_podcast_episode_download_title, R.string.music_podcast_episode_download_title, R.drawable.vk_icon_download_outline_28, R.attr.vk_ui_icon_accent_themed, 0, 64));
        }
        arrayList.add(new ec40(R.id.music_action_go_to_podcast, (MusicTrack) this.b, R.string.music_go_to_podcast, R.string.music_go_to_podcast, R.drawable.vk_icon_podcast_outline_28, R.attr.vk_ui_icon_accent_themed, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
        if (BuildInfo.s()) {
            Episode episode = musicTrack.w;
            String str = episode != null ? episode.g : null;
            if (str != null && str.length() != 0) {
                arrayList.add(new ec40(R.id.music_action_go_to_post, (MusicTrack) this.b, R.string.music_go_to_post, R.string.music_go_to_post, R.drawable.vk_icon_newsfeed_outline_28, R.attr.vk_ui_icon_accent_themed, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
            }
        }
        arrayList.add(new ec40(((Bundle) fy2Var.b).getBoolean("isKidsModeEnabled") ? R.id.music_action_copy_link : R.id.music_action_share, musicTrack, R.string.music_share, R.string.music_talkback_share_podcast, R.drawable.vk_icon_share_outline_28, musicTrack.B() ? R.attr.vk_ui_icon_secondary : R.attr.vk_ui_icon_accent_themed, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
        return arrayList;
    }

    public void b(Object obj) {
        this.c = obj;
        nsy nsyVar = (nsy) this.b;
        if (nsyVar.a() > 0) {
            nsyVar.c(obj);
        }
    }

    @Override // xsna.gc40
    public EmptyList c() {
        return EmptyList.b;
    }

    public void e(int i) {
        nsy nsyVar = (nsy) this.b;
        if (i == 0 && nsyVar.a() == 0) {
            nsyVar.b();
            Object obj = this.c;
            if (obj != null) {
                nsyVar.c(obj);
            }
        }
    }

    public vsy(MusicTrack musicTrack, fy2 fy2Var) {
        this.b = musicTrack;
        this.c = fy2Var;
    }
}
