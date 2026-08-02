package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import java.util.ArrayList;

/* compiled from: PlaylistMusicLoader.java */
/* loaded from: classes3.dex */
public final class qbb0 extends Fragment {
    public Playlist h;
    public io.reactivex.rxjava3.disposables.c i;
    public final aa40 j;
    public int k;
    public boolean l;
    public ArrayList<MusicTrack> m;
    public String n;
    public ArrayList o;

    /* compiled from: PlaylistMusicLoader.java */
    public interface a {
        void A5(@NonNull qbb0 qbb0Var, @NonNull ArrayList arrayList);

        void Q8(@NonNull qbb0 qbb0Var);

        void dd(@NonNull qbb0 qbb0Var);
    }

    public qbb0() {
        pn40 pn40Var = k840.a;
        this.j = new aa40();
        this.l = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            this.h = (Playlist) bundle.getParcelable("PlaylistMusicLoader.key.playlist");
            this.k = bundle.getInt("PlaylistMusicLoader.key.offset");
            this.l = bundle.getBoolean("PlaylistMusicLoader.key.canLoadMore");
            Bundle bundle2 = bundle.getBundle("PlaylistMusicLoader.key.musicTracks");
            this.j.getClass();
            this.m = aa40.a(MusicTrack.class, bundle2, "PlaylistMusicLoader.key.musicTracks");
            this.n = bundle.getString("PlaylistMusicLoader.key.reason");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
            this.i = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("PlaylistMusicLoader.key.playlist", this.h);
        bundle.putInt("PlaylistMusicLoader.key.offset", this.k);
        bundle.putBoolean("PlaylistMusicLoader.key.canLoadMore", this.l);
        ArrayList<MusicTrack> arrayList = this.m;
        this.j.getClass();
        bundle.putBundle("PlaylistMusicLoader.key.musicTracks", aa40.b("PlaylistMusicLoader.key.musicTracks", arrayList));
        bundle.putString("PlaylistMusicLoader.key.reason", this.n);
    }

    public final void tn(int i, int i2) {
        if (this.i != null) {
            return;
        }
        Playlist playlist = this.h;
        if (playlist == null) {
            L.G("vk", "PlaylistMusicLoader: playlist is not initialized");
        } else {
            this.i = new jx2(yfb.x(new ix4().q(playlist.c, Integer.valueOf(playlist.b), Integer.valueOf(i), Integer.valueOf(i2), Boolean.TRUE, this.h.x, null)), new pbb0(this, i, i2)).a();
        }
    }
}
