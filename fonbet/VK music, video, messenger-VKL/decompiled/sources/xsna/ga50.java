package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.ec40;
import xsna.k840;

/* compiled from: MusicTrackBottomSheet.kt */
/* loaded from: classes3.dex */
public final class ga50 implements dcn {
    public final MusicBottomSheetLaunchPoint b;
    public final MusicPlaybackLaunchContext c;
    public final a630 d;
    public final g9o e;
    public final u2b0 f;
    public final MusicTrack g;
    public final fy2 h;
    public final boolean i;
    public final ec40.a<MusicTrack> j;
    public final MusicBottomSheetActionTracker k;
    public final gzs<s3q0> l;
    public final boolean m;
    public dw20 n;
    public int o;
    public final bpn0 p;

    public ga50(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, a630 a630Var, g9o g9oVar, u2b0 u2b0Var, MusicTrack musicTrack, fy2 fy2Var, ec40.a aVar, MusicBottomSheetActionTracker musicBottomSheetActionTracker, gkc0 gkc0Var, boolean z, int i) {
        fy2Var = (i & 64) != 0 ? new fy2(0) : fy2Var;
        boolean z2 = (i & 128) != 0;
        ec40.a aVar2 = (i & 256) != 0 ? null : aVar;
        MusicBottomSheetActionTracker musicBottomSheetActionTracker2 = (i & 512) != 0 ? null : musicBottomSheetActionTracker;
        gkc0 gkc0Var2 = (i & 1024) == 0 ? gkc0Var : null;
        boolean z3 = (i & 2048) == 0 ? z : false;
        this.b = musicBottomSheetLaunchPoint;
        this.c = musicPlaybackLaunchContext;
        this.d = a630Var;
        this.e = g9oVar;
        this.f = u2b0Var;
        this.g = musicTrack;
        this.h = fy2Var;
        this.i = z2;
        this.j = aVar2;
        this.k = musicBottomSheetActionTracker2;
        this.l = gkc0Var2;
        this.m = z3;
        this.p = new bpn0(new v3n(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Activity activity) {
        boolean z;
        qb50 qb50Var;
        boolean z2;
        int i;
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            q010 q010Var = new q010(appCompatActivity, 6);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            Lazy a = msy.a(lazyThreadSafetyMode, q010Var);
            Lazy a2 = msy.a(lazyThreadSafetyMode, new nwk(appCompatActivity, 23));
            MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = this.b;
            MusicBottomSheetLaunchPoint.Playlist playlist = musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist ? (MusicBottomSheetLaunchPoint.Playlist) musicBottomSheetLaunchPoint : null;
            Playlist playlist2 = playlist != null ? playlist.b : null;
            a630 a630Var = this.d;
            ms1 ms1Var = a630Var instanceof ms1 ? (ms1) a630Var : null;
            if (ms1Var == null) {
                ms1Var = new ms1(a630Var, new r66(0, (g950) a2.getValue(), g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0, 3));
            }
            g9o g9oVar = this.e;
            u2b0 u2b0Var = this.f;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.c;
            MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint2 = this.b;
            ia50 ia50Var = new ia50(musicPlaybackLaunchContext, playlist2, musicBottomSheetLaunchPoint2, ms1Var, g9oVar, u2b0Var);
            ec40.a ze5Var = this.i ? new ze5(new ha50(appCompatActivity, ia50Var, a, this.j, this.k, this.m), this) : new ha50(appCompatActivity, ia50Var, a, this.j, this.k, this.m);
            ea50 ea50Var = (ea50) this.p.getValue();
            MusicTrack musicTrack = this.g;
            gc40 a3 = ea50Var.a(musicTrack, ia50Var);
            ArrayList arrayList = new ArrayList();
            EmptyList c = a3.c();
            if (musicTrack.Qb()) {
                com.vk.music.player.d dVar = k840.a.f;
                if (dVar == null) {
                    dVar = null;
                }
                if (!dVar.b()) {
                    z = true;
                    boolean z3 = !musicTrack.B() && musicTrack.S4();
                    if (!z || (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Delete) || z3) {
                        qb50Var = null;
                    } else {
                        boolean z4 = !com.vk.core.apps.a.b() && musicTrack.Vb() && (musicBottomSheetLaunchPoint2 instanceof MusicBottomSheetLaunchPoint.Player);
                        if (musicTrack.Qb()) {
                            i = R.layout.music_bottom_sheet_header_external_audio;
                        } else if (musicTrack.Vb()) {
                            i = R.layout.music_bottom_sheet_header_podcast_redesign;
                        } else {
                            if (!(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Stories)) {
                                throw new IllegalStateException("No layout for current state!");
                            }
                            i = R.layout.music_bottom_sheet_header_stories;
                        }
                        qb50Var = new qb50(musicTrack, i, ze5Var, z4, c);
                    }
                    if (qb50Var == null) {
                        arrayList.add(qb50Var);
                    } else {
                        this.o = iah0.a(8);
                    }
                    z2 = this.m;
                    fc40 fc40Var = new fc40(ze5Var, z2);
                    fc40Var.setItems(a3.a());
                    arrayList.add(fc40Var);
                    RecyclerView.Adapter[] adapterArr = (RecyclerView.Adapter[]) arrayList.toArray(new RecyclerView.Adapter[0]);
                    d920 y0 = d920.y0((RecyclerView.Adapter[]) Arrays.copyOf(adapterArr, adapterArr.length));
                    Context context = appCompatActivity;
                    if (z2) {
                        context = bwt0.u(appCompatActivity);
                    }
                    this.n = new dw20.b(context, null).i(y0, true, false).f0(new bgy(this, 14)).Y(new lec(this)).I0(musicBottomSheetLaunchPoint.getClass().getSimpleName());
                }
            }
            z = false;
            if (musicTrack.B()) {
            }
            if (z) {
            }
            qb50Var = null;
            if (qb50Var == null) {
            }
            z2 = this.m;
            fc40 fc40Var2 = new fc40(ze5Var, z2);
            fc40Var2.setItems(a3.a());
            arrayList.add(fc40Var2);
            RecyclerView.Adapter[] adapterArr2 = (RecyclerView.Adapter[]) arrayList.toArray(new RecyclerView.Adapter[0]);
            d920 y02 = d920.y0((RecyclerView.Adapter[]) Arrays.copyOf(adapterArr2, adapterArr2.length));
            Context context2 = appCompatActivity;
            if (z2) {
            }
            this.n = new dw20.b(context2, null).i(y02, true, false).f0(new bgy(this, 14)).Y(new lec(this)).I0(musicBottomSheetLaunchPoint.getClass().getSimpleName());
        }
    }

    @Override // xsna.dcn
    public final void dismiss() {
        dw20 dw20Var = this.n;
        if (dw20Var != null) {
            dw20Var.tn();
        }
        gzs<s3q0> gzsVar = this.l;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }
}
