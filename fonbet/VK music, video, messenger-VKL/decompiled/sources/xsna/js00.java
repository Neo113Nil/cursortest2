package xsna;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.view.components.button.dropdown.VkDropdownButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.log.L;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.photogallery.c;
import com.vk.photoviewer.PhotoViewer;
import com.vk.sharing.core.view.TargetSendActionView;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeEndVideoClick;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import xsna.fxw0;
import xsna.gm50;
import xsna.huw0;
import xsna.nii0;
import xsna.nwb;
import xsna.op90;
import xsna.tww0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class js00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ js00(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Long l;
        int i = this.b;
        boolean z = false;
        z = false;
        int i2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) obj3;
                View view = (View) obj2;
                e.a aVar = (e.a) obj;
                int i3 = MarketAllReviewsFragment.d0;
                mzp0 mzp0Var = marketAllReviewsFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(view);
                }
                marketAllReviewsFragment.On().a();
                SwipeRefreshLayout swipeRefreshLayout = marketAllReviewsFragment.Q;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                swipeRefreshLayout.setRefreshing(false);
                SwipeRefreshLayout swipeRefreshLayout2 = marketAllReviewsFragment.Q;
                if (swipeRefreshLayout2 == null) {
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setEnabled(true);
                NestedScrollView nestedScrollView = marketAllReviewsFragment.U;
                if (nestedScrollView != null) {
                    bwt0.p0(nestedScrollView, false);
                }
                RecyclerView recyclerView = marketAllReviewsFragment.R;
                bwt0.p0(recyclerView != null ? recyclerView : null, true);
                VkSpinner vkSpinner = marketAllReviewsFragment.S;
                if (vkSpinner != null) {
                    bwt0.p0(vkSpinner, false);
                }
                gm50.a.a(marketAllReviewsFragment, aVar.a, new bq00(marketAllReviewsFragment, i2));
                return s3q0.a;
            case 1:
                qy00 qy00Var = (qy00) obj2;
                MarketCatalogFilterVM.b bVar = (MarketCatalogFilterVM.b) j5g.b0((int) ((Float) obj).floatValue(), (List) obj3);
                if (bVar == null || (str = bVar.a) == null) {
                    str = "";
                }
                return qy00Var.a.getString(R.string.market_filter_title_distance_template, str);
            case 2:
                ((MediaExtractor) obj).setDataSource((Context) obj3, (Uri) obj2, (Map<String, String>) null);
                return s3q0.a;
            case 3:
                IconCompat iconCompat = (IconCompat) obj3;
                pa20 pa20Var = (pa20) obj2;
                long longValue = ((Long) obj).longValue();
                if (longValue != 0 && (iconCompat == null || (l = pa20Var.z.B) == null || l.longValue() != longValue)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                pq50 pq50Var = (pq50) obj3;
                pq50Var.D.sa(new NewsfeedExternalAction.d.a(((jr50) obj2).c(), pq50Var.t6(), PostActions.ACTION_CANCEL_HIDE_MY_TARGET_NATIVE_AD.h(), pq50Var.getAbsoluteAdapterPosition()));
                return s3q0.a;
            case 5:
                ((hs50) obj3).d7((View) obj, (cjx) obj2, "DEFAULT", 1);
                return s3q0.a;
            case 6:
                final NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) obj3;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                com.vk.mvi.binder.c.a(cVar, f9t.w(newsfeedCustomFragment2.io()), new iyp() { // from class: xsna.df60
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr2 = NewsfeedCustomFragment2.r0;
                        NewsfeedCustomFragment2 newsfeedCustomFragment22 = NewsfeedCustomFragment2.this;
                        newsfeedCustomFragment22.fo();
                        bf60.a(newsfeedCustomFragment22.fo(), newsfeedCustomFragment22, newsfeedCustomFragment22.getActivity(), newsfeedCustomFragment22.Z, (rf60) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(newsfeedCustomFragment2.io()), new h2w((js60) obj2, 13)), new p5w(newsfeedCustomFragment2, 7));
                return s3q0.a;
            case 7:
                em60 em60Var = (em60) obj3;
                mu60 mu60Var = (mu60) obj2;
                Boolean bool = (Boolean) obj;
                final ss60 ss60Var = em60Var.b;
                final int i4 = mu60Var.b;
                final String str2 = mu60Var.a;
                final boolean booleanValue = bool.booleanValue();
                return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.qs60
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ba90 ba90Var = (ba90) ((bxx) ((NewsFeedBridgeComponent) ss60.this.d.getValue()).Ad().a().a(m6r0.a1));
                        boolean z2 = booleanValue && i4 == 0;
                        if (ba90Var == null) {
                            return Integer.valueOf(z2 ? 20 : 25);
                        }
                        String str3 = str2;
                        boolean z3 = str3 == null || str3.length() == 0;
                        return Integer.valueOf(z2 ? z3 ? ba90Var.b : ba90Var.c : z3 ? ba90Var.d : ba90Var.e);
                    }
                }), new q9(new zgb(em60Var, bool, mu60Var, 4), 23));
            case 8:
                c.b bVar2 = (c.b) obj3;
                PhotoGalleryView photoGalleryView = ((com.vk.photogallery.c) obj2).l;
                PhotoViewer photoViewer = bVar2.b;
                if (photoViewer == null) {
                    return s3q0.a;
                }
                int i5 = photoViewer.r;
                q4t q4tVar = (q4t) j5g.b0(i5, photoGalleryView.getState().c().a);
                if (q4tVar == null) {
                    return s3q0.a;
                }
                photoGalleryView.getSelectionState().c(q4tVar);
                j9a0 j9a0Var = photoGalleryView.j.e;
                if (j9a0Var != null) {
                    j9a0Var.f.b(q4tVar, i5);
                }
                bVar2.b(i5);
                return s3q0.a;
            case 9:
                L.i((Throwable) obj);
                ((tii0) obj3).C(new nii0.i(((nii0.i) obj2).b, TargetSendActionView.State.SEND));
                return s3q0.a;
            case 10:
                ((crj0) obj3).m.n(((nwb.k) obj2).b);
                return Boolean.TRUE;
            case 11:
                vfm0 vfm0Var = (vfm0) obj3;
                ((i070) vfm0Var.f.getValue()).f(true);
                vfm0Var.a().m(((StoryPrivacyType) obj2).j());
                return s3q0.a;
            case 12:
                int i6 = VideoEndView.z;
                ((VideoEndView) obj3).b(MobileOfficialAppsVideoStat$TypeEndVideoClick.EventType.ADD);
                ((View.OnClickListener) obj2).onClick((View) obj);
                return s3q0.a;
            case 13:
                ((bts0) obj3).b((dts0) obj, (yg5) obj2);
                return s3q0.a;
            case 14:
                return Boolean.valueOf(l6v0.a((l6v0) obj3, (MotionEvent) obj2));
            case 15:
                huw0.a aVar2 = (huw0.a) obj2;
                op90.b.a aVar3 = ((op90.b) obj3).b;
                VkDropdownButton vkDropdownButton = aVar2.m;
                int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                vkDropdownButton.getContext();
                e.b bVar3 = new e.b(vkDropdownButton, null, null, l2, 6);
                bVar3.w = R.layout.ds_internal_context_menu_item;
                op90.b.a.AbstractC3462a abstractC3462a = aVar3.b;
                VkContextMenu.c.c(bVar3, R.string.voip_history_past_calls_header_filter_personal, null, abstractC3462a instanceof op90.b.a.AbstractC3462a.d, null, new guw0(aVar2, z ? 1 : 0), 26);
                boolean z2 = aVar3.a;
                boolean z3 = abstractC3462a instanceof op90.b.a.AbstractC3462a.C3464b;
                dtv0 dtv0Var = new dtv0(aVar2, 3);
                if (z2) {
                    VkContextMenu.c.c(bVar3, R.string.voip_history_past_calls_header_filter_from_group, null, z3, null, dtv0Var, 26);
                }
                VkContextMenu.c.c(bVar3, R.string.voip_history_past_calls_header_filter_missed, null, abstractC3462a instanceof op90.b.a.AbstractC3462a.c, null, new yei0(aVar2, 28), 26);
                bVar3.l(false);
                return s3q0.a;
            default:
                fxw0.a aVar4 = (fxw0.a) obj;
                long j = ((tww0.p) ((tww0) obj2)).b;
                long j2 = j - aVar4.e;
                long j3 = ((www0) obj3).g;
                return j2 < j3 ? fxw0.a.a(aVar4, null, null, j, j3, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33554391) : fxw0.a.a(aVar4, null, null, 0L, j2, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33554399);
        }
    }
}
