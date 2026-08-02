package xsna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaylistBottomSheet.kt */
/* loaded from: classes3.dex */
public final class f7b0 extends dc40 {
    public final Playlist e;
    public final j7b0 f;
    public final nz8 g;
    public final MusicBottomSheetLaunchPoint h;
    public final MusicBottomSheetActionTracker i;
    public final NewsEntry j;
    public final boolean k;

    public f7b0(Playlist playlist, j7b0 j7b0Var, nz8 nz8Var, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicBottomSheetActionTracker musicBottomSheetActionTracker, NewsEntry newsEntry) {
        super(false);
        this.e = playlist;
        this.f = j7b0Var;
        this.g = nz8Var;
        this.h = musicBottomSheetLaunchPoint;
        this.i = musicBottomSheetActionTracker;
        this.j = newsEntry;
        this.k = true;
    }

    @Override // xsna.dc40
    public final List<RecyclerView.Adapter<?>> a(AppCompatActivity appCompatActivity) {
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.i;
        NewsEntry newsEntry = this.j;
        Playlist playlist = this.e;
        j7b0 j7b0Var = this.f;
        ze5 ze5Var = new ze5(new h7b0(appCompatActivity, playlist, j7b0Var, musicBottomSheetActionTracker, newsEntry), this);
        ArrayList arrayList = new ArrayList();
        boolean B = playlist.B();
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = this.h;
        RecyclerView.Adapter adapter = null;
        List a = ((B && playlist.S4()) ? new t060(playlist, null) : musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Delete ? new t060(playlist, playlist.H) : musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Stories ? new vul(playlist, j7b0Var) : this.g).a();
        if (!(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Delete) && (!playlist.B() || !playlist.S4())) {
            boolean z = musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Stories;
            boolean z2 = this.k;
            adapter = z ? new i7m0(playlist, ze5Var, z2) : new d9b0(ze5Var, z2);
        }
        if (adapter == null || adapter.getItemCount() <= 0) {
            this.d = iah0.a(8);
        } else {
            arrayList.add(adapter);
        }
        fc40 fc40Var = new fc40(ze5Var, this.b);
        fc40Var.setItems(a);
        arrayList.add(fc40Var);
        return arrayList;
    }

    @Override // xsna.dc40
    public final String c() {
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = this.h;
        if (musicBottomSheetLaunchPoint == null) {
            return super.c();
        }
        return super.c() + '_' + musicBottomSheetLaunchPoint.getClass().getSimpleName();
    }
}
