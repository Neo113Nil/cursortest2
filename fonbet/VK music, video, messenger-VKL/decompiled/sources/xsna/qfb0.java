package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import xsna.gp4;

/* compiled from: PlaylistsLoader.java */
/* loaded from: classes3.dex */
public final class qfb0 extends Fragment {
    public io.reactivex.rxjava3.disposables.c h;
    public final aa40 i;
    public int j;
    public UserId k;
    public boolean l;
    public ArrayList<Playlist> m;
    public String n;
    public ArrayList o;

    /* compiled from: PlaylistsLoader.java */
    public interface a {
        void F7(@NonNull qfb0 qfb0Var);

        void Fc(@NonNull qfb0 qfb0Var);

        void mm(@NonNull qfb0 qfb0Var, @NonNull VKList vKList);
    }

    public qfb0() {
        pn40 pn40Var = k840.a;
        this.i = new aa40();
        this.k = UserId.d;
        this.l = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            this.j = bundle.getInt("PlaylistsLoader.key.offset");
            this.l = bundle.getBoolean("PlaylistsLoader.key.canLoadMore");
            Bundle bundle2 = bundle.getBundle("PlaylistsLoader.key.playlists");
            this.i.getClass();
            this.m = aa40.a(Playlist.class, bundle2, "PlaylistsLoader.key.playlists");
            this.n = bundle.getString("PlaylistsLoader.key.reason");
            this.k = (UserId) bundle.getParcelable("PlaylistsLoader.key.ownerId");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
            this.h = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("PlaylistsLoader.key.offset", this.j);
        bundle.putBoolean("PlaylistsLoader.key.canLoadMore", this.l);
        ArrayList<Playlist> arrayList = this.m;
        this.i.getClass();
        bundle.putBundle("PlaylistsLoader.key.playlists", aa40.b("PlaylistsLoader.key.playlists", arrayList));
        bundle.putString("PlaylistsLoader.key.reason", this.n);
        bundle.putParcelable("PlaylistsLoader.key.ownerId", un());
    }

    public final void tn(int i, int i2) {
        if (this.h != null) {
            return;
        }
        gp4.a aVar = new gp4.a(un());
        aVar.c = i;
        aVar.d = i2;
        if (aVar.b == null) {
            aVar.b = "all";
        }
        this.h = new jx2(new gp4(aVar), new pfb0(this, i, i2)).a();
    }

    public final UserId un() {
        UserId c = o25.a().c();
        if (this.k.b == 0) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                this.k = c;
            } else {
                if (arguments.getParcelable("PlaylistsLoader.key.ownerId") != null) {
                    c = (UserId) arguments.getParcelable("PlaylistsLoader.key.ownerId");
                }
                this.k = c;
            }
        }
        return this.k;
    }
}
