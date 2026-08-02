package xsna;

import com.vk.dto.podcast.PodcastInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: VkPodcastPageBottomSheetActionFactory.kt */
/* loaded from: classes3.dex */
public final class ndv0 implements gc40<Integer> {
    public final PodcastInfo b;
    public final u2b0 c;
    public final boolean d;

    public ndv0(PodcastInfo podcastInfo, u2b0 u2b0Var, boolean z) {
        this.b = podcastInfo;
        this.c = u2b0Var;
        this.d = z;
    }

    @Override // xsna.gc40
    public final List<ec40<Integer>> a() {
        ArrayList arrayList = new ArrayList();
        boolean z = this.d;
        PodcastInfo podcastInfo = this.b;
        if (podcastInfo != null && podcastInfo.l) {
            Pair pair = z ? new Pair(Integer.valueOf(R.string.music_remove_from_my_collection), Integer.valueOf(R.drawable.vk_icon_delete_outline_24)) : new Pair(Integer.valueOf(R.string.music_podcast_bottomsheet_unsubscribe), Integer.valueOf(R.drawable.vk_icon_unblock_outline_24));
            arrayList.add(new ec40(R.id.music_action_podcast_unsubscribe, Integer.valueOf(R.id.music_action_podcast_unsubscribe), ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), false, false, 480));
        }
        if (podcastInfo == null) {
            arrayList.add(new ec40(R.id.music_action_go_to_community, Integer.valueOf(R.id.music_action_go_to_community), R.string.music_podcast_action_to_community, R.drawable.vk_icon_podcast_24, false, false, 480));
        }
        arrayList.add(new ec40(z ? R.id.music_action_copy_link : R.id.music_action_share, Integer.valueOf(R.id.music_action_share), R.string.music_share, R.drawable.vk_icon_share_outline_24, false, false, 480));
        if (!z) {
            arrayList.add(new ec40(R.id.music_action_copy_link, Integer.valueOf(R.id.music_action_copy_link), R.string.copy_link, R.drawable.vk_icon_copy_24, false, false, 480));
        }
        if (!this.c.m0().i()) {
            arrayList.add(new ec40(R.id.music_action_setting_player_timer, Integer.valueOf(R.id.music_action_setting_player_timer), R.string.music_sleep_timer, R.drawable.vk_icon_recent_outline_24, false, false, 480));
        }
        return arrayList;
    }

    @Override // xsna.gc40
    public final EmptyList c() {
        return EmptyList.b;
    }
}
