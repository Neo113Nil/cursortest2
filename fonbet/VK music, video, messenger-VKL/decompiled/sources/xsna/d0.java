package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.fragment.app.FragmentManager;
import com.ironsource.Aa;
import com.ironsource.B2;
import com.ironsource.adapters.mintegral.banner.MintegralBannerAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.preference.Preference;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vk.video.ui.discovery.minimizable.s;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import one.video.player.OneVideoPlayer;
import xsna.gx8;
import xsna.pan;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        pan a;
        OneVideoPlayer player;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Aa.b((Aa) obj);
                return;
            case 1:
                B2.a((B2) obj);
                return;
            case 2:
                dw20 dw20Var = ((kq6) obj).b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    return;
                }
                return;
            case 3:
                ((rl9) obj).a.o(true);
                return;
            case 4:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj).getPresenter();
                if (presenter != null) {
                    presenter.X3();
                    return;
                }
                return;
            case 5:
                Iterator<FragmentManager.o> it = ((FragmentManager) obj).n.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                return;
            case 6:
                h03.b((Throwable) obj);
                return;
            case 7:
                MintegralBannerAdapter.destroyAd$lambda$1((MintegralBannerAdapter) obj);
                return;
            case 8:
                ((com.vk.movika.sdk.base.logic.processor.actions.e) obj).invoke();
                return;
            case 9:
                nnd0 nnd0Var = (nnd0) obj;
                ((p870) nnd0Var.G.getValue()).e(148, nnd0Var.q6());
                return;
            case 10:
                c5g0 c5g0Var = (c5g0) obj;
                try {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    Pair pair = new Pair("cache", Long.valueOf(com.vk.core.files.a.I(context.getCacheDir())));
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    Pair pair2 = new Pair("files", Long.valueOf(com.vk.core.files.a.I(context2.getFilesDir())));
                    Context context3 = e43.a;
                    if (context3 == null) {
                        context3 = null;
                    }
                    Pair pair3 = new Pair("data", Long.valueOf(com.vk.core.files.a.I(context3.getDataDir())));
                    Context context4 = e43.a;
                    if (context4 == null) {
                        context4 = null;
                    }
                    File externalCacheDir = context4.getExternalCacheDir();
                    Pair pair4 = new Pair("externalCache", Long.valueOf(externalCacheDir != null ? com.vk.core.files.a.I(externalCacheDir) : 0L));
                    Context context5 = e43.a;
                    if (context5 == null) {
                        context5 = null;
                    }
                    File externalFilesDir = context5.getExternalFilesDir(null);
                    long j = 0;
                    Pair pair5 = new Pair("externalFiles", Long.valueOf(externalFilesDir != null ? com.vk.core.files.a.I(externalFilesDir) : 0L));
                    Context context6 = e43.a;
                    if (context6 == null) {
                        context6 = null;
                    }
                    for (String str : context6.databaseList()) {
                        Context context7 = e43.a;
                        if (context7 == null) {
                            context7 = null;
                        }
                        j += com.vk.core.files.a.I(context7.getDatabasePath(str));
                    }
                    for (Map.Entry entry : pn00.k(pair, pair2, pair3, pair4, pair5, new Pair("db", Long.valueOf(j))).entrySet()) {
                        new phl0((String) entry.getKey(), ((Number) entry.getValue()).longValue()).q();
                    }
                } catch (Exception e) {
                    L.i(e);
                }
                try {
                    for (Map.Entry entry2 : ((CacheComponent) ((k7m) m7m.f(c5g0Var)).a(fpf0.a(CacheComponent.class))).yc().a().entrySet()) {
                        CacheTarget cacheTarget = (CacheTarget) entry2.getKey();
                        List<gx8.a> list = (List) entry2.getValue();
                        String name = cacheTarget.name();
                        for (gx8.a aVar : list) {
                            new qv8(aVar.getDescription(), aVar.u(), name).q();
                        }
                    }
                } catch (Exception e2) {
                    L.i(e2);
                }
                Preference.F(System.currentTimeMillis(), "cache_stat", "last_time_sent_ms");
                return;
            case 11:
                znj0 znj0Var = (znj0) obj;
                RecyclerPaginatedView recyclerPaginatedView = znj0Var.h().b;
                recyclerPaginatedView.setAdapter((qoj0) znj0Var.l.getValue());
                recyclerPaginatedView.o = true;
                recyclerPaginatedView.setSwipeRefreshEnabled(false);
                recyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
                AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
                dVar.f = 1;
                dVar.a();
                HorizontalRecyclerPaginationView a2 = znj0Var.h().a();
                if (a2 != null) {
                    a2.setAdapter(znj0Var.g());
                    if (fxc0.B().J().f1().e) {
                        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.topMargin = a2.getResources().getDimensionPixelSize(R.dimen.video_discovery_catalog_tabs_height);
                        a2.setLayoutParams(layoutParams2);
                    }
                    a = new pan.a().a(a2.getRecyclerView(), CommonVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE, (r4 & 4) != 0 ? 0.5f : 0.8f, null);
                    znj0Var.j = a;
                }
                Iterator it2 = znj0Var.o.iterator();
                while (it2.hasNext()) {
                    ((gzs) it2.next()).invoke();
                }
                s.e eVar = znj0Var.n;
                if (eVar != null) {
                    znj0Var.e(eVar);
                    return;
                }
                return;
            case 12:
                player = SimpleVideoView.this.getPlayer();
                if (player != null) {
                    player.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                }
                return;
            case 13:
                ?? r0 = l4o0.this.h;
                if (r0 != 0) {
                    r0.c0();
                    return;
                }
                return;
            case 14:
                bst0 bst0Var = (bst0) obj;
                SeekBar seekBar = bst0Var.j;
                (seekBar != null ? seekBar : null).setProgress((int) bst0Var.g.d());
                bst0Var.o.postDelayed(new d0(bst0Var, 14), 16L);
                return;
            default:
                ((com.monetization.ads.exo.source.dash.i) obj).h();
                return;
        }
    }
}
