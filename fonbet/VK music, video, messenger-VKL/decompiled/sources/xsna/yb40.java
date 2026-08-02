package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.h7u0;
import xsna.k840;
import xsna.wb40;

/* compiled from: MusicBigPlayerTrackListClickListener.kt */
/* loaded from: classes3.dex */
public final class yb40 implements fsv<PlayerTrack> {
    public final Context b;
    public final g9o c;
    public final u2b0 d;
    public final izs<PlayerTrack, MusicBottomSheetLaunchPoint> e;
    public final io.reactivex.rxjava3.disposables.b f;

    public yb40(Context context, g9o g9oVar, u2b0 u2b0Var, com.vk.music.track.a aVar, izs izsVar, wb40.d dVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = context;
        this.c = g9oVar;
        this.d = u2b0Var;
        this.e = izsVar;
        this.f = bVar;
    }

    @Override // xsna.fsv
    public final void Ig(int i, PlayerTrack playerTrack) {
        com.vk.music.player.f H;
        PlayerTrack o0;
        PlayerTrack playerTrack2 = playerTrack;
        Context context = this.b;
        u2b0 u2b0Var = this.d;
        if (i == R.id.tv_create_playlist) {
            if (u2b0Var.g().size() <= 500) {
                a();
                return;
            }
            String string = context.getString(R.string.music_create_playlist_from_player_dialog_message, String.valueOf(500));
            h7u0.a aVar = new h7u0.a(context);
            aVar.g0(R.string.confirm);
            aVar.a.f = string;
            aVar.c0(R.string.yes, new s7o(this, 1));
            aVar.W(R.string.no, null);
            aVar.m();
            return;
        }
        if (i == R.id.audio_menu) {
            Activity h = e3m.h(context);
            if (h == null || playerTrack2 == null) {
                return;
            }
            ic40.r(lyd.g().w(), h, this.e.invoke(playerTrack2), playerTrack2.b, MusicPlaybackLaunchContext.A, null, false, false, null, null, 496);
            return;
        }
        if (playerTrack2 == null || (H = u2b0Var.H()) == null || (o0 = u2b0Var.o0()) == null) {
            return;
        }
        if (epx.f(o0.f, playerTrack2.f)) {
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        if (H.n()) {
            if (playerTrack2.b.Pb()) {
                com.vk.core.utils.newtork.b.a.getClass();
                if (!com.vk.core.utils.newtork.b.d()) {
                    com.vk.music.notifications.restriction.a aVar2 = k840.a.d;
                    (aVar2 != null ? aVar2 : null).j();
                    return;
                }
            }
            u2b0.v0(u2b0Var, playerTrack2, null, 14);
        }
    }

    public final void a() {
        List<PlayerTrack> g = this.d.g();
        List<PlayerTrack> list = g;
        int size = g.size();
        if (size > 500) {
            size = 500;
        }
        List H0 = j5g.H0(list, size);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlayerTrack) it.next()).b.Ib());
        }
        this.f.b(hg1.m(rsg0.y0(new mm4(o25.a().c(), c9b0.e(this.b), MusicPlaybackLaunchContext.A.t(), j5g.y0(arrayList)), null, null, 3), this.b, 0L, false, 62).subscribe(new b0y(new el30(this, 3), 9), new eiy(new com(17), 5)));
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }
}
