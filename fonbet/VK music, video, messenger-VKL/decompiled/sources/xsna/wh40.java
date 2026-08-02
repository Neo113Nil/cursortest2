package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.podcast.Podcast;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MusicDownloadManagerController.kt */
/* loaded from: classes.dex */
public interface wh40 {
    ArrayList J();

    void K(UserId userId, AudioBookChapter audioBookChapter, int i, be4 be4Var);

    void L(Playlist playlist);

    boolean M(String str);

    void N(Playlist playlist);

    void O(MusicTrack musicTrack);

    boolean P();

    void Q(UserId userId, MusicTrack musicTrack, String str, jb50 jb50Var);

    void R(boolean z);

    void S(MusicTrack musicTrack);

    void T(AudioBook audioBook);

    void U(MusicTrack musicTrack);

    io.reactivex.rxjava3.core.q<MusicTrack> V(UserId userId, Playlist playlist);

    void W(float f, String str);

    void X(AudioBook audioBook);

    void Y(List<? extends Uri> list, List<? extends Uri> list2);

    ut70 Z(MusicTrack musicTrack, String str);

    void a0(List<MusicTrack> list, List<MusicTrack> list2);

    void b0(Podcast podcast);

    void c0(Playlist playlist);

    void d0(UserId userId, MusicTrack musicTrack, UserId userId2, ifp0 ifp0Var);

    void e(Playlist playlist);

    void e0(AudioBookChapter audioBookChapter);

    List<MusicTrack> f0(Playlist playlist);

    void g0(Podcast podcast);

    void h0(sg40 sg40Var);

    void i0(List<MusicTrack> list);

    void j0(MusicTrack musicTrack, boolean z);

    ArrayList p();

    ArrayList q();
}
