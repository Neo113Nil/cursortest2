package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: ModernMusicTrackModel.kt */
/* loaded from: classes.dex */
public interface a630 {
    static /* synthetic */ io.reactivex.rxjava3.core.q L1(a630 a630Var, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i2) {
        if ((i2 & 4) != 0) {
            musicPlaybackLaunchContext = null;
        }
        return a630Var.j0(i, true, musicPlaybackLaunchContext);
    }

    static void d1(a630 a630Var, Context context, MusicTrack musicTrack, boolean z) {
        a630Var.W(context, musicTrack, z, EmptyList.b);
    }

    static /* synthetic */ io.reactivex.rxjava3.core.q h0(a630 a630Var, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i2) {
        if ((i2 & 4) != 0) {
            musicPlaybackLaunchContext = null;
        }
        return a630Var.Q(i, true, musicPlaybackLaunchContext);
    }

    boolean D(MusicTrack musicTrack);

    io.reactivex.rxjava3.core.q<Boolean> E(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    io.reactivex.rxjava3.core.q<Pair<int[], Playlist>> F(MusicTrack musicTrack, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    boolean G(MusicTrack musicTrack);

    io.reactivex.rxjava3.core.q<Boolean> J(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    void M(Context context, MusicTrack musicTrack);

    void P(Activity activity, int i, AudioBookChapter audioBookChapter, boolean z);

    io.reactivex.rxjava3.core.q<Boolean> Q(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    io.reactivex.rxjava3.core.q<Playlist> V(MusicTrack musicTrack, Playlist playlist);

    void W(Context context, MusicTrack musicTrack, boolean z, List<String> list);

    io.reactivex.rxjava3.core.q<Boolean> X0(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    io.reactivex.rxjava3.core.q<Integer> e1(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z);

    void f1(Context context, MusicTrack musicTrack, Playlist playlist);

    boolean i(MusicTrack musicTrack);

    boolean i0(MusicTrack musicTrack);

    io.reactivex.rxjava3.core.q<Boolean> j0(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    boolean j1(MusicTrack musicTrack);

    void l0(List<String> list, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, gzs<s3q0> gzsVar);

    io.reactivex.rxjava3.core.q<Boolean> p1(MusicTrack musicTrack, boolean z, boolean z2);

    io.reactivex.rxjava3.core.q<Boolean> q1(MusicTrack musicTrack, boolean z);

    io.reactivex.rxjava3.core.q<List<String>> u1(MusicTrack musicTrack, boolean z);

    boolean y(MusicTrack musicTrack);

    void y1(Activity activity, AudioBook audioBook, AudioBookChapter audioBookChapter);
}
