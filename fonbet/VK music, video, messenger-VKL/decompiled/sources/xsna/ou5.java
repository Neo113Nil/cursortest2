package xsna;

import android.net.Uri;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.B2;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.mvp.holder.header.ExpandableVkSearchView;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.im.mediascope.MediaScopeCommand;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vk.photo.editor.markup.view.tools.PipetteView;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.webrtc.EglBase10Impl;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class ou5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView.o layoutManager;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                B2.b((B2) obj);
                break;
            case 1:
                com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) obj;
                f4m.v(cVar.e.getMeasuredHeight(), cVar.l);
                break;
            case 2:
                etv0 etv0Var = (etv0) ((WeakReference) ((Ref$ObjectRef) obj).element).get();
                if (etv0Var != null) {
                    etv0Var.b(false);
                    break;
                }
                break;
            case 3:
                ((EglBase10Impl.EglConnection) obj).lambda$new$0();
                break;
            case 4:
                ExpandableVkSearchView.m5((ExpandableVkSearchView) obj);
                break;
            case 5:
                FastScrollerView fastScrollerView = (FastScrollerView) obj;
                RecyclerView recyclerView2 = fastScrollerView.d;
                if (recyclerView2 != null) {
                    fastScrollerView.d(recyclerView2);
                    break;
                }
                break;
            case 6:
                zx10 zx10Var = (zx10) obj;
                if (zx10Var.d == 0) {
                    zx10Var.c.removeCallbacks(zx10Var.j);
                    io.reactivex.rxjava3.disposables.c cVar2 = zx10Var.g;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    zx10Var.e = false;
                    zx10Var.i.dispose();
                    zx10Var.i = zx10Var.a(MediaScopeCommand.STOP);
                }
                zx10Var.f = false;
                break;
            case 7:
                xv40 xv40Var = (xv40) obj;
                if (xv40Var.c.a()) {
                    xza0 xza0Var = xv40Var.e;
                    if (xza0Var != null) {
                        xza0Var.setVolume(xv40Var.f);
                    }
                } else {
                    float f = xv40Var.h;
                    if (f != -1.0f) {
                        xza0 xza0Var2 = xv40Var.e;
                        if (xza0Var2 != null) {
                            xza0Var2.setVolume(f);
                        }
                        xv40Var.h = -1.0f;
                    }
                }
                if (xv40Var.i) {
                    xv40Var.i = false;
                    xza0 xza0Var3 = xv40Var.e;
                    if (xza0Var3 != null) {
                        xza0Var3.M(true, new PlaybackActionMeta(2, 0L, 2, null), null);
                        break;
                    }
                }
                break;
            case 8:
                int i2 = NewsFeedControlsLayout.D;
                ((NewsFeedControlsLayout) obj).T4();
                break;
            case 9:
                int i3 = PlayerService.t;
                ((PlayerService) obj).l(false);
                break;
            case 10:
                mgw mgwVar = ((vzg0) obj).n1;
                if (mgwVar != null) {
                    Uri.Builder buildUpon = jeq0.g(mgwVar.f).buildUpon();
                    buildUpon.appendQueryParameter("swap_type", "1");
                    mgwVar.c(buildUpon.build(), true);
                    break;
                }
                break;
            case 11:
                ((SimpleVideoView) obj).B.b();
                break;
            case 12:
                z370 z370Var = ((StoryReactionViewGroup) obj).e;
                (z370Var != null ? z370Var : null).setVisibility(4);
                break;
            case 13:
                ((skm0.a) obj).d();
                break;
            case 14:
                PipetteView pipetteView = ((ffo0) obj).j;
                (pipetteView != null ? pipetteView : null).setVisibility(0);
                break;
            case 15:
                VideoPlaylistRootVh videoPlaylistRootVh = (VideoPlaylistRootVh) obj;
                if (videoPlaylistRootVh.M.r instanceof alj) {
                    DisableableViewPager disableableViewPager = videoPlaylistRootVh.x.o;
                    if (disableableViewPager == null) {
                        disableableViewPager = null;
                    }
                    CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = (CatalogRecyclerPaginatedView) disableableViewPager.findViewById(R.id.paginated_list);
                    if (catalogRecyclerPaginatedView != null && (recyclerView = catalogRecyclerPaginatedView.getRecyclerView()) != null) {
                        RecyclerView.Adapter adapter = recyclerView.getAdapter();
                        int itemCount = adapter != null ? adapter.getItemCount() : 0;
                        if (itemCount > 0 && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.getChildCount() == 0) {
                            recyclerView.smoothScrollToPosition(itemCount - 1);
                        }
                    }
                    UIBlockCatalog uIBlockCatalog = videoPlaylistRootVh.z;
                    if (uIBlockCatalog != null) {
                        videoPlaylistRootVh.r0(uIBlockCatalog);
                        boolean n0 = VideoPlaylistRootVh.n0(uIBlockCatalog);
                        View view = videoPlaylistRootVh.A;
                        ((CoordinatorLayout.f) (view != null ? view.getLayoutParams() : null)).c(n0 ? null : videoPlaylistRootVh.B);
                        if (n0) {
                            videoPlaylistRootVh.o0();
                        }
                    }
                }
                videoPlaylistRootVh.C = new rrn0(videoPlaylistRootVh, 20);
                break;
            case 16:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) obj;
                pVar.P(pVar.C, false);
                break;
            default:
                ((io.reactivex.rxjava3.disposables.b) obj).dispose();
                break;
        }
    }
}
