package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import xsna.c63;

/* compiled from: ClipsPlaylistUiBottomSheet.kt */
/* loaded from: classes16.dex */
public final class dre extends c63.b {
    public final /* synthetic */ bre b;
    public final /* synthetic */ ClipsPlaylist c;

    public dre(bre breVar, ClipsPlaylist clipsPlaylist) {
        this.b = breVar;
        this.c = clipsPlaylist;
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        bre breVar = this.b;
        FragmentActivity activity2 = breVar.getActivity();
        if (epx.f(activity2, activity)) {
            FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
            breVar.fo().e().b(activity2, new ClipsPlaylistContentLaunchParams(this.c, null, breVar.eo().d, false, breVar.eo().f, 10, null), supportFragmentManager, new kr6(5));
        }
        c63 c63Var = c63.a;
        c63.c(this);
    }
}
