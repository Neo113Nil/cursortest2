package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.d6v0;
import xsna.h7u0;
import xsna.i940;
import xsna.k840;
import xsna.mc50;

/* compiled from: MusicTrackMenuDialogs.kt */
/* loaded from: classes3.dex */
public final class nc50 {
    public final a630 a;
    public final com.vk.music.player.d b;
    public final MusicBottomSheetActionTracker c;
    public final fl4 d;
    public final gxh e;
    public final MusicBottomSheetLaunchPoint f;
    public final i940 g;
    public final boolean h;
    public final MusicRestrictionPopupDisplayer i;
    public final ms1 j;

    public nc50(com.vk.music.track.a aVar, com.vk.music.player.d dVar, MusicBottomSheetActionTracker musicBottomSheetActionTracker, fl4 fl4Var, gxh gxhVar, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, i940 i940Var, boolean z) {
        this.a = aVar;
        this.b = dVar;
        this.c = musicBottomSheetActionTracker;
        this.d = fl4Var;
        this.e = gxhVar;
        this.f = musicBottomSheetLaunchPoint;
        this.g = i940Var;
        this.h = z;
        com.vk.music.notifications.restriction.a aVar2 = k840.a.d;
        this.i = aVar2 == null ? null : aVar2;
        this.j = new ms1(aVar, new k9b(k840.a.i, 4));
    }

    public final void a(mc50 mc50Var, FragmentActivity fragmentActivity, boolean z) {
        if (mc50Var instanceof mc50.a) {
            mc50.a aVar = (mc50.a) mc50Var;
            Playlist playlist = aVar.b;
            this.g.b(fragmentActivity, new i940.b(Long.valueOf(playlist != null ? playlist.Db() : -1L).longValue(), aVar.a, aVar.c));
            return;
        }
        if (mc50Var instanceof mc50.c) {
            new lh8(this.e).a(fragmentActivity);
            return;
        }
        if (mc50Var instanceof mc50.f) {
            List<Long> list = d6v0.d;
            com.vk.music.player.d dVar = this.b;
            new e6v0(d6v0.a.a(dVar), dVar, false).d(fragmentActivity);
            return;
        }
        boolean z2 = mc50Var instanceof mc50.j;
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.c;
        a630 a630Var = this.a;
        if (z2) {
            mc50.j jVar = (mc50.j) mc50Var;
            new fxf0(a630Var, musicBottomSheetActionTracker).a(fragmentActivity, jVar.a, jVar.b);
            return;
        }
        if (mc50Var instanceof mc50.i) {
            fxf0 fxf0Var = new fxf0(a630Var, musicBottomSheetActionTracker);
            MusicTrack musicTrack = ((mc50.i) mc50Var).a;
            fxf0.b(fragmentActivity, musicTrack, new exf0(fxf0Var, musicTrack, fragmentActivity));
            return;
        }
        boolean z3 = mc50Var instanceof mc50.b;
        ms1 ms1Var = this.j;
        if (z3) {
            ms1Var.M(fragmentActivity, ((mc50.b) mc50Var).a);
            return;
        }
        if (mc50Var instanceof mc50.h) {
            a630.d1(ms1Var, fragmentActivity, ((mc50.h) mc50Var).a, true);
            return;
        }
        if (mc50Var instanceof mc50.d) {
            MusicRestrictionPopupDisplayer.e(this.i, fragmentActivity, "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
            return;
        }
        boolean z4 = mc50Var instanceof mc50.e;
        final MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = this.f;
        if (z4) {
            this.d.w().i(fragmentActivity, musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player, z, this.h, true);
            return;
        }
        if (!(mc50Var instanceof mc50.g)) {
            throw new NoWhenBranchMatchedException();
        }
        final int i = ((mc50.g) mc50Var).a;
        final sxf0 sxf0Var = new sxf0(a630Var);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: xsna.rxf0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                MusicPlaybackLaunchContext musicPlaybackLaunchContext;
                if (MusicBottomSheetLaunchPoint.this instanceof MusicBottomSheetLaunchPoint.Player) {
                    musicPlaybackLaunchContext = MusicPlaybackLaunchContext.A.zb();
                    musicPlaybackLaunchContext.b.putString("__META_PLAYER_TYPE", "radio_player");
                } else {
                    musicPlaybackLaunchContext = null;
                }
                itg0.m(a630.h0(sxf0Var.a, i, musicPlaybackLaunchContext, 2));
            }
        };
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(fragmentActivity);
        c.h0(fragmentActivity.getString(R.string.music_dialog_radio_remove));
        c.c0(R.string.music_dialog_radio_remove_button, onClickListener);
        c.W(R.string.cancel, new ie50(1));
        c.m();
    }
}
