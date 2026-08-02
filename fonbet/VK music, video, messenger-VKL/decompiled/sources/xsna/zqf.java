package xsna;

import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.documents.api.di.DocumentsComponent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.media.filters.di.FiltersComponent;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.webrtc.RTCLog;
import xsna.acx;
import xsna.dzh;
import xsna.gfq;
import xsna.q4a0;
import xsna.tsh;
import xsna.wih;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zqf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zqf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RTCLog lambda$new$1;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = ClipsWrapperFragment.Q0;
                return Boolean.valueOf(((zof) ((ClipsWrapperFragment) obj).X.getValue()).H().isEnabled());
            case 1:
                return ((BridgeComponent) obj).id();
            case 2:
                qcy<Object>[] qcyVarArr = CommunityEventsFragment.P;
                return ((CommunityComponent) m7m.d((CommunityEventsFragment) obj).a(fpf0.a(CommunityComponent.class))).ke();
            case 3:
                return Boolean.valueOf(((reh) obj).n.J().X1());
            case 4:
                wih.a aVar = (wih.a) obj;
                bjh bjhVar = aVar.q;
                UserId userId = aVar.n.a;
                Object obj2 = aVar.o.b;
                bjhVar.b(userId);
                return s3q0.a;
            case 5:
                return new ssh(new tsh.a(2, (tsh) obj, tsh.class, "updateStateWithPriorityBlock", "updateStateWithPriorityBlock(Lcom/vk/profile/community/impl/ui/profile/state/CommunityProfileState;Lcom/vk/profile/community/impl/data/model/primaryblock/CommunityPriorityBlockDataModel;)Lcom/vk/profile/community/impl/ui/profile/state/CommunityProfileState;", 0));
            case 6:
                ryh ryhVar = (ryh) obj;
                ryhVar.b.c(dzh.n.c.a);
                dw20 dw20Var = ryhVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 7:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj;
                int i3 = CommunityReviewsFragment.o0;
                c.r.i iVar = c.r.i.b;
                communityReviewsFragment.getClass();
                xn50.a.c(communityReviewsFragment, iVar);
                xn50.a.c(communityReviewsFragment, c.r.j.b);
                return s3q0.a;
            case 8:
                ((esi) obj).onClick(null);
                return s3q0.a;
            case 9:
                c1j c1jVar = (c1j) obj;
                View findViewById = c1jVar.itemView.findViewById(R.id.voip_room_participant_options);
                bwt0.i0(findViewById, new wpg(c1jVar, 5));
                return findViewById;
            case 10:
                lambda$new$1 = ((ConversationFactory) obj).lambda$new$1();
                return lambda$new$1;
            case 11:
                ((puj) obj).x.h();
                return Boolean.TRUE;
            case 12:
                int i4 = CreateChatTransferFragment.F0;
                gpu0 gpu0Var = new gpu0(((CreateChatTransferFragment) obj).requireContext());
                gpu0Var.j = new CreateChatTransferFragment.c();
                return gpu0Var;
            case 13:
                ugl uglVar = (ugl) obj;
                uglVar.A = false;
                uglVar.a(new acx.g(true, false, false));
                return s3q0.a;
            case 14:
                qkr0 qkr0Var = ((zam) obj).h;
                if (qkr0Var != null) {
                    qkr0Var.a();
                }
                return s3q0.a;
            case 15:
                return new com.vk.im.popup.b(((sem) obj).c);
            case 16:
                View view = ((gfm) obj).b.g;
                LinearInterpolator linearInterpolator = gfm.n;
                return new vtt0(view, linearInterpolator, linearInterpolator, 200L, 16);
            case 17:
                RecyclerView recyclerView = ((r3n) obj).a;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures.getClass();
                return com.vk.toggle.b.A.a(smbAdFeatures) ? new x0n(recyclerView) : new v0n(recyclerView);
            case 18:
                kpp kppVar = opp.T;
                return com.vk.registration.funnels.a.d((View) obj);
            case 19:
                gfq gfqVar = ((ffq) obj).a().f;
                PollsWebView pollsWebView = gfqVar.a;
                io.reactivex.rxjava3.subjects.d<gfq.b> dVar = gfqVar.c;
                gfq.b P0 = dVar.P0();
                if (P0 instanceof gfq.b.a) {
                    ExternalNpsCondition externalNpsCondition = ((gfq.b.a) P0).a;
                    dVar.onNext(new gfq.b.d(externalNpsCondition));
                    pollsWebView.setPollsListener(new gfq.a(externalNpsCondition, gfqVar.b, dVar, gfqVar.d));
                    pollsWebView.k(Collections.singletonList(externalNpsCondition.h()));
                }
                return s3q0.a;
            case 20:
                ((com.vk.inappreview.impl.fake.a) obj).dismiss();
                return s3q0.a;
            case 21:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<List<aux>> it = ((jxq) obj).h.b.iterator();
                while (it.hasNext()) {
                    for (aux auxVar : it.next()) {
                        linkedHashMap.put(auxVar.b, auxVar);
                    }
                }
                return linkedHashMap;
            case 22:
                return ((DocumentsComponent) ((k7m) m7m.f((u9r) obj)).mo408a(fpf0.a(DocumentsComponent.class))).P0();
            case 23:
                return ((FiltersComponent) ((k7m) m7m.f((fgr) obj)).mo408a(fpf0.a(FiltersComponent.class))).r7();
            case 24:
                f6s f6sVar = (f6s) obj;
                q6s q6sVar = (q6s) ((zak0) f6sVar.I).getValue();
                if (q6sVar == null) {
                    q6sVar = f6sVar.j7();
                }
                if (q6sVar != null) {
                    f6sVar.p7(q6sVar, new ew3(9, f6sVar, q6sVar)).invoke();
                }
                return s3q0.a;
            case 25:
                int i5 = GamesCatalogFragment.i0;
                return ((GamesCatalogComponent) m7m.d((GamesCatalogFragment) obj).a(fpf0.a(GamesCatalogComponent.class))).V9();
            case 26:
                fzt fztVar = (fzt) obj;
                q4a0.b bVar = fztVar.e;
                if (bVar != null) {
                    int position = fztVar.getPosition();
                    q4a0 q4a0Var = q4a0.this;
                    q4a0Var.m.put(position, true);
                    q4a0Var.c(position);
                }
                return s3q0.a;
            case 27:
                return ((BridgeComponent) ((k7m) m7m.f((GlobalSearchVideoRootVh) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 28:
                int i6 = GoodPreviewFragment.X;
                return new n6u((fy00) ((GoodPreviewFragment) obj).T.getValue());
            default:
                return new czv((und0) obj);
        }
    }
}
