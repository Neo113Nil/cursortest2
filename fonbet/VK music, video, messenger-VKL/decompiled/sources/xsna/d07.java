package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.stats.MusicActionTracker;
import com.vk.music.stats.a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BigPlayerActions.kt */
/* loaded from: classes3.dex */
public final class d07 implements MusicBottomSheetActionTracker {
    public final /* synthetic */ c07 a;
    public final /* synthetic */ MusicTrack b;

    public d07(c07 c07Var, MusicTrack musicTrack) {
        this.a = c07Var;
        this.b = musicTrack;
    }

    @Override // com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker
    public final SearchStatsLoggingInfo a() {
        return null;
    }

    @Override // com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker
    public final void b(MusicBottomSheetActionTracker.Action action) {
        MusicActionTracker.Action action2;
        com.vk.music.stats.a aVar = this.a.g;
        if (aVar != null) {
            MusicActionTracker.a.b bVar = new MusicActionTracker.a.b(this.b.y);
            aVar.getClass();
            switch (a.C1356a.$EnumSwitchMapping$1[action.ordinal()]) {
                case 1:
                    action2 = MusicActionTracker.Action.ListenNext;
                    break;
                case 2:
                    action2 = MusicActionTracker.Action.AddToMe;
                    break;
                case 3:
                    action2 = MusicActionTracker.Action.RemoveFromMe;
                    break;
                case 4:
                    action2 = MusicActionTracker.Action.GoToArtist;
                    break;
                case 5:
                    action2 = MusicActionTracker.Action.Download;
                    break;
                case 6:
                    action2 = MusicActionTracker.Action.Share;
                    break;
                case 7:
                    action2 = MusicActionTracker.Action.CopyLink;
                    break;
                case 8:
                    action2 = MusicActionTracker.Action.OpenAlbum;
                    break;
                case 9:
                    action2 = MusicActionTracker.Action.ShowSimilar;
                    break;
                case 10:
                    action2 = MusicActionTracker.Action.AddToPlaylist;
                    break;
                case 11:
                    action2 = MusicActionTracker.Action.SetSleepTimer;
                    break;
                case 12:
                    action2 = MusicActionTracker.Action.Broadcast;
                    break;
                case 13:
                    action2 = MusicActionTracker.Action.Fave;
                    break;
                case 14:
                    action2 = MusicActionTracker.Action.Unfave;
                    break;
                case 15:
                    action2 = MusicActionTracker.Action.AddToStory;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            aVar.a(action2, bVar);
        }
    }
}
