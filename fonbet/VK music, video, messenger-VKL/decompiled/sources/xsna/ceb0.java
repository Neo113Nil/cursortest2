package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.music.attach.dto.PlaylistSearchResult;
import java.util.ArrayList;
import java.util.Collections;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PlaylistSearchResultsLoader.java */
/* loaded from: classes3.dex */
public final class ceb0 extends Fragment {
    public String h;
    public io.reactivex.rxjava3.disposables.c i;
    public int j;
    public boolean k = true;
    public PlaylistSearchResult l;
    public String m;
    public ArrayList n;

    /* compiled from: PlaylistSearchResultsLoader.java */
    public interface a {
        void T6();

        void Xb();

        void s4(@NonNull ceb0 ceb0Var, @NonNull PlaylistSearchResult playlistSearchResult);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            this.h = bundle.getString("PlaylistSearchResultsLoader.key.query");
            this.j = bundle.getInt("PlaylistSearchResultsLoader.key.offset");
            this.k = bundle.getBoolean("PlaylistSearchResultsLoader.key.canLoadMore");
            this.l = (PlaylistSearchResult) bundle.getParcelable("PlaylistSearchResultsLoader.key.playlistSearchResult");
            this.m = bundle.getString("PlaylistSearchResultsLoader.key.reason");
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
        bundle.putString("PlaylistSearchResultsLoader.key.query", this.h);
        bundle.putInt("PlaylistSearchResultsLoader.key.offset", this.j);
        bundle.putBoolean("PlaylistSearchResultsLoader.key.canLoadMore", this.k);
        bundle.putParcelable("PlaylistSearchResultsLoader.key.playlistSearchResult", this.l);
        bundle.putString("PlaylistSearchResultsLoader.key.reason", this.m);
    }

    public final void tn() {
        int i = this.j;
        if (i == 0) {
            i = 100;
        }
        un(0, i);
    }

    public final void un(int i, int i2) {
        if (this.i != null) {
            return;
        }
        String str = this.h;
        if (str == null) {
            L.G("vk", "MusicSearchResultsLoader: query is not initialized");
            return;
        }
        UserId.b bVar = UserId.c;
        UserId c = o25.a().c();
        fx4 fx4Var = new fx4("audio.searchPlaylists", Playlist.Q);
        fx4Var.K(CampaignEx.JSON_KEY_AD_Q, str);
        fx4Var.F(c, "owner_id");
        fx4Var.C(i, SignalingProtocol.KEY_OFFSET);
        fx4Var.G("filters", Collections.singletonList("all"));
        fx4Var.C(i2, "count");
        this.i = new jx2(fx4Var, new beb0(this, i, i2)).a();
    }
}
