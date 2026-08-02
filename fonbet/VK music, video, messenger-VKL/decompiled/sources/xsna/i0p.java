package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.track.MusicTrackId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EditPlaylistModel.kt */
/* loaded from: classes3.dex */
public interface i0p extends i80 {

    /* compiled from: EditPlaylistModel.kt */
    public interface a {
        void a(VKApiExecutionException vKApiExecutionException);

        void b(i0p i0pVar, List<MusicTrack> list);

        void d(VKApiExecutionException vKApiExecutionException);

        void l(VKApiExecutionException vKApiExecutionException);

        void o(i0p i0pVar, Playlist playlist);
    }

    String A();

    void D1();

    void F1(boolean z);

    List<Thumb> I(List<MusicTrack> list);

    void K(MusicTrack musicTrack);

    void K1(ArrayList arrayList);

    ArrayList L();

    String O0();

    MusicTrack Q0(MusicTrackId musicTrackId);

    void S(int i, int i2);

    boolean T(String str, String str2);

    ArrayList X();

    ArrayList Z();

    Playlist Z0();

    boolean a();

    void a0(f0p f0pVar);

    void c();

    void e0(MusicTrack musicTrack);

    boolean f0();

    boolean g0();

    boolean g1();

    String getDescription();

    String getTitle();

    void k0(MusicTrackId musicTrackId);

    void l1(f0p f0pVar);

    void load();

    void m(String str);

    UserId q();

    u2b0 r();

    void s1(String str);

    void setDescription(String str);

    boolean v(MusicTrack musicTrack);

    void w();

    Thumb x();
}
