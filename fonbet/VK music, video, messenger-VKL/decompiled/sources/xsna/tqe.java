package xsna;

import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import com.vk.clips.playlists.ui.picker.f;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: ClipsPlaylistPickerMultiSelectMapper.kt */
/* loaded from: classes16.dex */
public final class tqe {
    public static f.d a(ClipsPlaylistPickerState clipsPlaylistPickerState) {
        boolean z = clipsPlaylistPickerState instanceof ClipsPlaylistPickerState.b;
        f.d.a aVar = f.d.a.a;
        if (z) {
            return aVar;
        }
        if (!(clipsPlaylistPickerState instanceof ClipsPlaylistPickerState.Content)) {
            if (clipsPlaylistPickerState instanceof ClipsPlaylistPickerState.a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        ClipsPlaylistPickerState.Content content = (ClipsPlaylistPickerState.Content) clipsPlaylistPickerState;
        boolean z2 = content.h;
        ClipsPlaylistPickerState.c cVar = content.b;
        boolean z3 = false;
        if (cVar instanceof ClipsPlaylistPickerState.c.b.a) {
            int size = ((ClipsPlaylistPickerState.c.b.a) cVar).b.size();
            tlo0.f h = tq.h(tlo0.Companion, R.string.clips_playlist_add_clips_button);
            if (size != 0 && !z2) {
                z3 = true;
            }
            return new f.d.b(new f.d.b.a(nqe.b, h, z3, size != 0 ? Integer.valueOf(size) : null));
        }
        if (!(cVar instanceof ClipsPlaylistPickerState.c.b.C0630b)) {
            if (cVar instanceof ClipsPlaylistPickerState.c.a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        int size2 = ((ClipsPlaylistPickerState.c.b.C0630b) cVar).a.size();
        tlo0.f h2 = tq.h(tlo0.Companion, R.string.clips_playlist_remove_clips_button);
        if (size2 != 0 && !z2) {
            z3 = true;
        }
        return new f.d.b(new f.d.b.a(pqe.b, h2, z3, null));
    }
}
