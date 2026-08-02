package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.Lifecycle;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.util.NoLocation;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.im.ui.views.DialogListInfoBarView;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PlacesLoadingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.community.details.impl.name_history.c;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.List;
import xsna.isc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dsc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dsc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        wzs<? super InfoBar, ? super InfoBar.Button, s3q0> wzsVar;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                isc iscVar = (isc) obj2;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = isc.t1;
                g47Var.e(tci.l(iscVar.fo()), isc.b.b);
                g47Var.a(tci.k(iscVar.fo()));
                g47Var.d(new isc.c(iscVar.fo()));
                break;
            case 1:
                ((nad) obj2).V0((String) obj);
                break;
            case 2:
                ((rgd) obj2).e();
                break;
            case 3:
                mid midVar = (mid) obj2;
                List list = (List) obj;
                if (list.isEmpty()) {
                    L.l("ClipsAuthorsSelectorPresenter", "not authors to display! this should not happened");
                    rhh0 rhh0Var = midVar.d;
                    if (rhh0Var != null) {
                        rhh0Var.k();
                    }
                } else {
                    qid a = qid.a(midVar.f, list, null, false, 6);
                    midVar.f = a;
                    midVar.a.setState(a);
                }
                break;
            case 4:
                Throwable th = (Throwable) obj;
                ((bnd) obj2).T(ClipsCoauthorsSelectorPatch.a.b.b);
                j03.l(th);
                L.i(th);
                break;
            case 5:
                break;
            case 6:
                ((hjc) obj2).onClick();
                break;
            case 7:
                ((ClipsVideoAttachmentPickerFragment) obj2).S.setItems((VKList) obj);
                break;
            case 8:
                ((tdu) obj).n(((Number) ((a4g) obj2).e().getValue()).floatValue());
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                zhf0 zhf0Var = (zhf0) obj2;
                break;
            case 12:
                ((com.vk.profile.community.details.impl.name_history.b) obj2).T(new c.AbstractC1560c.a((Throwable) obj));
                break;
            case 13:
                fih fihVar = (fih) obj2;
                ay00 ay00Var = (ay00) obj;
                UserId q = ay00Var.q();
                if (!epx.f(q != null ? fkq0.a(q) : null, fkq0.a(fihVar.a)) || (!(ay00Var instanceof by00) ? !(ay00Var instanceof cy00) ? !(ay00Var instanceof dy00) && (!(ay00Var instanceof MarketEventGoodCreated) ? !(ay00Var instanceof iy00) && (!(ay00Var instanceof jy00) || ((jy00) ay00Var).a.V) : ((MarketEventGoodCreated) ay00Var).a.V) : ((cy00) ay00Var).a.h == 1 : ((by00) ay00Var).a.h == 1)) {
                    r3 = false;
                }
                break;
            case 14:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) obj2;
                int i3 = CommunityProfileFragment.k0;
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                if ((uiTrackingScreen != null ? uiTrackingScreen.a : null) == MobileOfficialAppsCoreNavStat$EventScreen.GROUP && communityProfileFragment.getViewLifecycleOwner().getLifecycle().getCurrentState().a(Lifecycle.State.RESUMED)) {
                    com.vk.profile.community.impl.ui.profile.f fVar = communityProfileFragment.S;
                    (fVar == null ? null : fVar).H.b();
                } else {
                    com.vk.profile.community.impl.ui.profile.f fVar2 = communityProfileFragment.S;
                    (fVar2 == null ? null : fVar2).H.a();
                }
                break;
            case 15:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj2;
                if (((Boolean) obj).booleanValue()) {
                    int i4 = CommunityReviewsFragment.o0;
                } else {
                    CommunityReviewsView communityReviewsView = communityReviewsFragment.a0;
                    if (communityReviewsView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = communityReviewsView.b;
                        (swipeRefreshLayout == null ? null : swipeRefreshLayout).setRefreshing(false);
                    }
                }
                break;
            case 16:
                pno0 pno0Var = (pno0) obj;
                int i5 = ContactsListFragmentRedesign.q0;
                com.vk.im.ui.components.contacts.a aVar = ((ContactsListFragmentRedesign) obj2).Z;
                (aVar != null ? aVar : null).a1(pno0Var.d());
                break;
            case 17:
                Uri uri = (Uri) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                break;
            case 18:
                mm50 mm50Var = (mm50) obj2;
                g47 g47Var2 = (g47) obj;
                l370.o(g47Var2, new wnh(mm50Var, 3), f9t.z(mm50Var), new a60(22));
                l370.m(g47Var2, f9t.w(mm50Var));
                g47Var2.d(new rbk(mm50Var));
                break;
            case 19:
                ocl oclVar = (ocl) obj2;
                oclVar.f = 0;
                oclVar.i.r(true);
                break;
            case 20:
                ((uil) obj2).h6();
                break;
            case 21:
                DialogListInfoBarView dialogListInfoBarView = (DialogListInfoBarView) obj2;
                InfoBar.Button button = (InfoBar.Button) obj;
                InfoBar infoBar = dialogListInfoBarView.z;
                if (infoBar != null && (wzsVar = dialogListInfoBarView.D) != null) {
                    wzsVar.invoke(infoBar, button);
                }
                break;
            case 22:
                hkp hkpVar = ((tim) obj2).p;
                if (hkpVar != null) {
                    pim pimVar = (pim) hkpVar.b;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    pimVar.i.D(pimVar, new cvm(Peer.a.b(pimVar.l.a.e), false, pim.r));
                }
                break;
            case 23:
                ImageList imageList = (ImageList) obj2;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                ChatSettings chatSettings = bVar.z;
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                opp oppVar = (opp) obj2;
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = oppVar.t;
                if (vkAuthErrorStatedEditText == null) {
                    vkAuthErrorStatedEditText = null;
                }
                vkAuthErrorStatedEditText.setErrorState(false);
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = oppVar.u;
                if (vkAuthErrorStatedEditText2 == null) {
                    vkAuthErrorStatedEditText2 = null;
                }
                vkAuthErrorStatedEditText2.setErrorState(false);
                TextView textView = oppVar.w;
                f4m.j(textView != null ? textView : null);
                View view = oppVar.v;
                if (view != null) {
                    view.setBackgroundColor(e3m.f(R.attr.vk_ui_field_border_alpha, oppVar.requireContext()));
                }
                break;
            case 27:
                break;
            case 28:
                m6r m6rVar = (m6r) obj2;
                Location location = (Location) obj;
                if (epx.f(location, NoLocation.b)) {
                    m6rVar.a.a(new com.vk.newsfeed.posting.impl.domain.model.f(PlacesLoadingState.Idle));
                } else {
                    m6rVar.a.d(new PostingAction.Fetch.LoadPlacesByLocation(location));
                }
                break;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                ((nvy) obj).e(snapshotStateList.size(), new yfr(0, snapshotStateList, new ot(24)), new zfr(i2, snapshotStateList, new pt(29)), new jai(802480018, new agr(i2, snapshotStateList, snapshotStateList), true));
                break;
        }
        return s3q0.a;
    }
}
