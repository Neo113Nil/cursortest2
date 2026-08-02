package xsna;

import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Playlist;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatInfo;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.g7g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class v3l implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ v3l(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        switch (this.b) {
            case 0:
                String[] strArr = DebugDevSettingsFragment.t0;
                o2l o2lVar = o2l.a;
                String charSequence = ((CharSequence) obj2).toString();
                o2lVar.getClass();
                o2l.j("__dbg_test_xowner_disable_allowed_methods", charSequence);
                return null;
            case 1:
                return new o5t0((VideoAlbum) obj, (UserProfile) obj2);
            case 2:
                ((Integer) obj).intValue();
                MusicPickerListItem musicPickerListItem = (MusicPickerListItem) obj2;
                if (musicPickerListItem instanceof MusicPickerListItem.MusicTrackItem) {
                    return "track" + ((MusicPickerListItem.MusicTrackItem) musicPickerListItem).b.Ib();
                }
                if (musicPickerListItem instanceof MusicPickerListItem.MusicPlaylistItem) {
                    StringBuilder sb = new StringBuilder("playlist");
                    Playlist playlist = ((MusicPickerListItem.MusicPlaylistItem) musicPickerListItem).b;
                    sb.append(playlist.b);
                    sb.append(' ');
                    sb.append(playlist.c);
                    return sb.toString();
                }
                if (musicPickerListItem instanceof MusicPickerListItem.SelectPlaylistItem) {
                    return "select_playlist";
                }
                if (musicPickerListItem instanceof MusicPickerListItem.PlaylistsAndAlbumsItem) {
                    return "playlists";
                }
                if (musicPickerListItem instanceof MusicPickerListItem.EmptyListItem) {
                    return "empty_item";
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                return new g7g0.c((yfx0) obj, (ztz) obj2);
            case 4:
                VideoPlayerState videoPlayerState = (VideoPlayerState) obj2;
                VideoFile videoFile = (VideoFile) ((Optional) obj).orElse(null);
                if (videoFile != null) {
                    VideoPlayerStatInfo videoPlayerStatInfo = videoPlayerState.d;
                    if (epx.f(videoPlayerStatInfo != null ? videoPlayerStatInfo.c : null, videoFile.a1())) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 5:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar.K(-1584543716);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1584543716, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:225)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.K0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar2.K(-1604084838);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1604084838, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:205)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.q0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var2;
        }
    }
}
