package xsna;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.h7u0;

/* compiled from: RemoveFromMyMusicDialog.kt */
/* loaded from: classes3.dex */
public final class fxf0 {
    public final a630 a;
    public final MusicBottomSheetActionTracker b;

    public fxf0(a630 a630Var, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
        this.a = a630Var;
        this.b = musicBottomSheetActionTracker;
    }

    public static void b(Context context, MusicTrack musicTrack, DialogInterface.OnClickListener onClickListener) {
        int i = (musicTrack.S4() || musicTrack.Pb()) ? R.string.music_remove_from_my_music_cached : R.string.music_alert_remove_audio_message;
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.g0(R.string.confirm);
        c.U(i);
        c.c0(R.string.delete, onClickListener);
        c.W(R.string.cancel, new f30(3));
        c.m();
    }

    public final void a(final FragmentActivity fragmentActivity, final MusicTrack musicTrack, final Playlist playlist) {
        Playlist Bb = playlist.Bb(o25.a().c());
        if (!xx1.w(Bb) || xx1.x(Bb)) {
            return;
        }
        b(fragmentActivity, musicTrack, new DialogInterface.OnClickListener() { // from class: xsna.dxf0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                fxf0 fxf0Var = fxf0.this;
                a630 a630Var = fxf0Var.a;
                MusicTrack musicTrack2 = musicTrack;
                Playlist playlist2 = playlist;
                io.reactivex.rxjava3.internal.operators.observable.b0 J = l370.J(a630Var.V(musicTrack2, playlist2), R.string.music_toast_audio_removal_from_playlist_done);
                m3y m3yVar = new m3y(new zkk(fxf0Var, fragmentActivity, musicTrack2, playlist2, 4), 17);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                itg0.m(J.E(m3yVar, lVar, kVar, kVar));
            }
        });
    }
}
