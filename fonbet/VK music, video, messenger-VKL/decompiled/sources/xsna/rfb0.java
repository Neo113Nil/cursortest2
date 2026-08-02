package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaylistsModel.java */
/* loaded from: classes3.dex */
public interface rfb0 extends i80 {

    /* compiled from: PlaylistsModel.java */
    public interface a {
        void a(@NonNull Playlist playlist);

        void b();

        void c(@NonNull rfb0 rfb0Var, @NonNull Playlist playlist);

        void d(@NonNull rfb0 rfb0Var, @NonNull VKApiExecutionException vKApiExecutionException);

        void e(@NonNull rfb0 rfb0Var, @NonNull Playlist playlist);

        void f(@NonNull VKApiExecutionException vKApiExecutionException);

        void g(@NonNull rfb0 rfb0Var, @NonNull VKList vKList);

        void h(@NonNull rfb0 rfb0Var, @NonNull Playlist playlist, boolean z);
    }

    void A1();

    @Nullable
    PlaylistOwner C();

    void H1(int i);

    boolean O();

    boolean R0();

    String S0();

    int W0();

    boolean a();

    boolean a1();

    void b0(@NonNull a aVar);

    void c();

    Long c0();

    @Nullable
    ArrayList d0();

    @Nullable
    String getError();

    @Nullable
    List<MusicTrack> k1();

    boolean n();

    void r1(@NonNull a aVar);

    void refresh();

    boolean t();
}
