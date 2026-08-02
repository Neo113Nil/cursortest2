package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.my.tracker.MyTracker;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.cxl;
import xsna.e3m;
import xsna.lbv;
import xsna.m5u;
import xsna.nzb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tbg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tbg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 3;
        Object obj = this.c;
        switch (i) {
            case 0:
                Context context = ((ubg) obj).itemView.getContext();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.user_placeholder, context);
            case 1:
                ((nzb.e) obj).invoke();
                return s3q0.a;
            case 2:
                d3h d3hVar = (d3h) obj;
                FragmentImpl fragmentImpl = d3hVar.a;
                return o6h.a(((CommunitySubscriptionComponent) m7m.d(fragmentImpl).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).E5(), fragmentImpl.requireContext(), d3hVar.k, null, null, null, 28);
            case 3:
                ((c.a) ((io.reactivex.rxjava3.core.l) obj)).d();
                return s3q0.a;
            case 4:
                cch cchVar = (cch) obj;
                frg frgVar = cchVar.k;
                if (frgVar != null) {
                    frgVar.invoke(cchVar.g.b);
                }
                return s3q0.a;
            case 5:
                return new zlh(((cih) obj).c);
            case 6:
                ((zth) obj).c.invoke();
                return s3q0.a;
            case 7:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj;
                int i3 = CommunityReviewsFragment.o0;
                return new ryh(communityReviewsFragment.requireContext(), communityReviewsFragment.R, communityReviewsFragment.In(), ((BridgeComponent) m7m.d(communityReviewsFragment).a(fpf0.a(BridgeComponent.class))).p(), (h7v) communityReviewsFragment.V.getValue(), ((ReviewsComponent) m7m.d(communityReviewsFragment).a(fpf0.a(ReviewsComponent.class))).qb());
            case 8:
                return (ClipEditComponent) ((n0i) obj).a.a(fpf0.a(ClipEditComponent.class));
            case 9:
                o1i o1iVar = (o1i) obj;
                return new cwh(o1iVar.b, o1iVar.k, new qzg(o1iVar, i2), o1iVar.l, bwd0.i(o1iVar.c), o1iVar.p);
            case 10:
                return ((paj) obj).itemView.getContext().getString(R.string.vkim_contact_invite);
            case 11:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) obj;
                return new ddj(cVar.v, cVar.u, cVar.k, cVar.q);
            case 12:
                ntj ntjVar = (ntj) obj;
                int i4 = ntj.E;
                ViewGroup.LayoutParams layoutParams = ntjVar.C.getLayoutParams();
                if (layoutParams == null) {
                    return s3q0.a;
                }
                if (layoutParams.width != -1 || layoutParams.height != i4) {
                    layoutParams.width = -1;
                    layoutParams.height = i4;
                    ntjVar.C.requestLayout();
                }
                return s3q0.a;
            case 13:
                ((mxl) obj).a.invoke(cxl.t.b);
                return s3q0.a;
            case 14:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<plm> it = ((flm) obj).a.iterator();
                while (it.hasNext()) {
                    linkedHashMap.putAll(it.next().c());
                }
                return linkedHashMap;
            case 15:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return ((DiscoverMediaTabFragment2) obj).On();
            case 16:
                rdi.y((ydo) obj, new com(i2));
                return s3q0.a;
            case 17:
                return (AudienceResearchComponent) ((k7m) m7m.f((mqp) obj)).a(fpf0.a(AudienceResearchComponent.class));
            case 18:
                FragmentActivity activity = ((zuq) obj).a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 19:
                return Boolean.valueOf(!((FriendsFragment) obj).c0);
            case 20:
                return ((y4u) obj).g.U1();
            case 21:
                ((z5u) obj).l.invoke(m5u.c.b);
                return s3q0.a;
            case 22:
                Context context2 = ((kku) obj).b;
                VkGroupHeader vkGroupHeader = new VkGroupHeader(context2, null, 6);
                vkGroupHeader.setSize(VkGroupHeader.Size.Small);
                kku.l(vkGroupHeader, " ", iah0.z(context2));
                return Integer.valueOf(vkGroupHeader.getMeasuredHeight());
            case 23:
                ((cbv) obj).p.onNext(lbv.b.a);
                return s3q0.a;
            case 24:
                androidx.lifecycle.f fVar = (FragmentImpl) obj;
                ((pds) fVar).o1();
                if (fVar instanceof dw60) {
                    ((dw60) fVar).Nb(false);
                }
                return s3q0.a;
            case 25:
                return ((l4y) obj).n(VkStepsBridgeDelegatesFactory.DelegateType.GET_STEPS_PERMISSION_GF);
            case 26:
                return ((r6y) obj).l;
            case 27:
                ((d1z) obj).e.bk(zgt0.a);
                return s3q0.a;
            case 28:
                return LayoutInflater.from(((whz) obj).w).inflate(R.layout.lite_interactive_player_view, (ViewGroup) null);
            default:
                MyTracker.handleDeeplink((Intent) obj);
                return s3q0.a;
        }
    }
}
