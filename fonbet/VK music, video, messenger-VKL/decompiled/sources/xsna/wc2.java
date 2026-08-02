package xsna;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.Ya;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVh;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.im.design.view.pagination.pin.ImPinView;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.photoviewer.PhotoViewer;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.screen.StoryCameraFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import com.yandex.div.core.view2.Div2View;
import io.appmetrica.analytics.impl.C5080p2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.topology.server.ServerCallTopology;
import xsna.hzf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wc2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wc2(com.vk.newsfeed.posting.market_picker.presentation.base.view.h hVar, int i) {
        this.b = 12;
        this.c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        dcn e;
        EmptyList emptyList;
        RecyclerView.Adapter adapter;
        a7a a7aVar;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                ActionMode actionMode = ((uc2) obj).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 1:
                l23.I((Context) obj);
                return;
            case 2:
                ArtistInfoVh artistInfoVh = (ArtistInfoVh) obj;
                dcn dcnVar = artistInfoVh.v;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                View view = artistInfoVh.h;
                if (view == null) {
                    view = null;
                }
                Activity h = e3m.h(view.getContext());
                if (h != null) {
                    Rect rect = new Rect();
                    View view2 = artistInfoVh.h;
                    (view2 != null ? view2 : null).getGlobalVisibleRect(rect);
                    e = artistInfoVh.s.e(h, rect, "audio:artist_follow", new com.vk.movika.sdk.base.model.props.d(8));
                    artistInfoVh.v = e;
                    return;
                }
                return;
            case 3:
                Div2View.addNewStateViewWithTransition$lambda$41((Div2View) obj);
                return;
            case 4:
                ((ikv0) obj).a();
                return;
            case 5:
                ObjectAnimator objectAnimator = (ObjectAnimator) obj;
                int i3 = avr.j;
                if (objectAnimator != null) {
                    objectAnimator.start();
                    return;
                }
                return;
            case 6:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) obj;
                int i4 = HighlightEditFragment.h0;
                VkTabs vkTabs = highlightEditFragment.X;
                if (vkTabs == null) {
                    vkTabs = null;
                }
                vkTabs.f(0).a.setEnabled(false);
                ViewPager2 viewPager2 = highlightEditFragment.Y;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                viewPager2.setUserInputEnabled(false);
                VkTabs vkTabs2 = highlightEditFragment.X;
                VkTabs.k(vkTabs2 == null ? null : vkTabs2, (vkTabs2 != null ? vkTabs2 : null).f(1));
                return;
            case 7:
                ((ImPinView) obj).g = false;
                return;
            case 8:
                Iterator it = ((mz50) obj).a.iterator();
                while (it.hasNext()) {
                    ((lz50) it.next()).a();
                }
                return;
            case 9:
                ((com.vk.media.ok.b) obj).G.syncAudioWithVideo();
                return;
            case 10:
                ib80 ib80Var = (ib80) obj;
                sk3<a7a> sk3Var = ib80Var.k;
                RecyclerView recyclerView = ib80Var.f;
                if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
                    emptyList = EmptyList.b;
                } else {
                    ib80Var.e.getClass();
                    lca a = b4a.a(adapter);
                    if (a == null) {
                        emptyList = EmptyList.b;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        List<UIBlock> y0 = a.y0();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = ((ArrayList) y0).iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i5 = i2 + 1;
                            if (i2 < 0) {
                                e43.t();
                                throw null;
                            }
                            UIBlockHint uIBlockHint = ((UIBlock) next).j;
                            if (uIBlockHint != null) {
                                String str = uIBlockHint.y;
                                if (ib80Var.b.a(str)) {
                                    if (!arrayList.isEmpty()) {
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            if (str.equals(((a7a) it3.next()).a.y)) {
                                            }
                                        }
                                    }
                                    if (uIBlockHint.B == CatalogHintType.HIGHLIGHT) {
                                        a7aVar = new a7a(uIBlockHint, i2);
                                        if (a7aVar != null || ib80Var.q.contains(a7aVar.a.y)) {
                                            a7aVar = null;
                                        } else {
                                            arrayList.add(a7aVar);
                                        }
                                        if (a7aVar == null) {
                                            arrayList2.add(a7aVar);
                                        }
                                        i2 = i5;
                                    }
                                }
                            }
                            a7aVar = null;
                            if (a7aVar != null) {
                            }
                            a7aVar = null;
                            if (a7aVar == null) {
                            }
                            i2 = i5;
                        }
                        emptyList = arrayList2;
                    }
                }
                sk3Var.addAll(emptyList);
                ib80Var.o();
                return;
            case 11:
                ((PeerConnectionClient) obj).a();
                return;
            case 12:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.h) obj).e.getClass();
                return;
            case 13:
                ((PhotoViewer) obj).l();
                return;
            case 14:
                ((hzf0.a) obj).onRenderedFirstFrame();
                return;
            case 15:
                ((ServerCallTopology) obj).a();
                return;
            case 16:
                int i6 = SettingsGeneralFragment.z0;
                u1u0.b((com.vk.core.view.components.spinner.c) obj);
                return;
            case 17:
                ((Signaling) obj).dispose();
                return;
            case 18:
                StoryCameraFragment storyCameraFragment = (StoryCameraFragment) obj;
                d0m0 d0m0Var = storyCameraFragment.P;
                if (d0m0Var == null) {
                    d0m0Var = null;
                }
                if (d0m0Var.zk()) {
                    return;
                }
                d0m0 d0m0Var2 = storyCameraFragment.P;
                if (d0m0Var2 == null) {
                    d0m0Var2 = null;
                }
                StoryCameraParams storyCameraParams = storyCameraFragment.O;
                d0m0Var2.v1((storyCameraParams == null ? null : storyCameraParams).c, (storyCameraParams != null ? storyCameraParams : null).b);
                return;
            case 19:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) obj).U;
                if (usersDiscoverListView != null) {
                    RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                    if (usersDiscoverLayoutManager == null) {
                        return;
                    }
                    UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.OnBoardingRight, usersDiscoverLayoutManager);
                    userDiscoverSmoothScroller.setTargetPosition(usersDiscoverLayoutManager.f.f);
                    usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                    return;
                }
                return;
            case 20:
                VideoCategoryRootVh videoCategoryRootVh = (VideoCategoryRootVh) obj;
                g3a.a(videoCategoryRootVh.t, videoCategoryRootVh);
                return;
            case 21:
                Ya.d((Ya) obj);
                return;
            case 22:
                C5080p2.a((C5080p2) obj);
                return;
            case 23:
                com.vungle.ads.internal.presenter.r.e((com.vungle.ads.internal.presenter.r) obj);
                return;
            default:
                yads.wl2.c((yads.wl2) obj);
                return;
        }
    }

    public /* synthetic */ wc2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
