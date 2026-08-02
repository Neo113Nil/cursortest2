package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.podcast.PodcastInfo;
import java.util.List;

/* compiled from: DownloadModel.kt */
/* loaded from: classes.dex */
public interface g9o {
    void C(Context context, AudioBook audioBook, AudioBookChapter audioBookChapter);

    io.reactivex.rxjava3.core.a D(int i, String str);

    void E(Context context, Playlist playlist);

    void F(List<MusicTrack> list);

    void G(Playlist playlist, boolean z);

    void J(List<String> list);

    void L(MusicTrack musicTrack);

    io.reactivex.rxjava3.core.a N(UserId userId);

    void Q(MusicTrack musicTrack);

    void R(Context context, MusicTrack musicTrack);

    void T(Context context, Playlist playlist);

    void U(Activity activity, PodcastInfo podcastInfo, MusicTrack musicTrack);

    void V(Playlist playlist);

    void W(Playlist playlist, icz iczVar);

    void X(Context context, Playlist playlist);

    void Y(Playlist playlist);

    void a(Playlist playlist);

    void a0(Playlist playlist);

    void b0();

    void c();

    boolean d(String str);

    void e(Playlist playlist);

    void g();

    boolean o();

    void p();

    void q(MusicTrack musicTrack, Playlist playlist);

    io.reactivex.rxjava3.core.a s(int i);

    void u();

    void v(Playlist playlist);

    void x();
}
