package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.m;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.c;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.f;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.msg_list.c;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.presentation.model.RestorePostingState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bcw0;
import xsna.dg20;
import xsna.l7h0;
import xsna.nov;
import xsna.o8l0;
import xsna.q7h0;
import xsna.q8j0;
import xsna.r070;
import xsna.v810;
import xsna.wf20;
import xsna.xh60;
import xsna.xn50;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e810 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e810(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Collection<ReactionSet> values;
        VkSearchView vkSearchView;
        int i = this.b;
        Boolean bool = null;
        r3 = null;
        ReactionSet reactionSet = null;
        bool = null;
        bool = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((f810) obj2).n.b(new v810.b((Throwable) obj));
                return s3q0.a;
            case 1:
                return l910.a((l910) obj2);
            case 2:
                xn50.a.c(((e910) obj2).a.d, new z710.p(((pno0) obj).d().toString()));
                return s3q0.a;
            case 3:
                eg20 eg20Var = (eg20) obj2;
                wf20 wf20Var = (wf20) obj;
                if (wf20Var instanceof wf20.a) {
                    eg20Var.a(new dg20.e(((wf20.a) wf20Var).a));
                } else {
                    if (!(wf20Var instanceof wf20.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eg20Var.o.onNext(((wf20.b) wf20Var).a);
                }
                return s3q0.a;
            case 4:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.d dVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.d) obj2;
                dVar.T(f.c.b);
                dVar.k.b(new c.a((Throwable) obj));
                return s3q0.a;
            case 5:
                View view = (View) obj;
                View.OnClickListener onClickListener = ((ModernSearchView) obj2).q;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return s3q0.a;
            case 6:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj2;
                Pair pair = (Pair) obj;
                xl30 xl30Var = (xl30) pair.i();
                c.a aVar2 = (c.a) pair.j();
                m.d dVar2 = aVar2.a;
                aVar2.a = null;
                aVar.T1(xl30Var, dVar2, "subscribeToMsgListPresenterNEW");
                xl30 xl30Var2 = (xl30) pair.i();
                if (!aVar.F0) {
                    aVar.F0 = true;
                    aVar.T1(xl30Var2, null, "showReactionSuggest");
                }
                return s3q0.a;
            case 7:
                ns30 ns30Var = (ns30) obj2;
                pk30 pk30Var = ns30Var.m;
                yt30 yt30Var = ns30Var.n;
                Msg msg = yt30Var != null ? yt30Var.E : null;
                Attach attach = yt30Var != null ? yt30Var.G : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.X(attach, msg, yt30Var != null ? yt30Var.F : null);
                    bool = Boolean.TRUE;
                }
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 8:
                mzp0 mzp0Var = ((qd40) obj2).b;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                return s3q0.a;
            case 9:
                ((MusicPageInfoBlockNewVh) obj2).p = null;
                return s3q0.a;
            case 10:
                uj60 uj60Var = (uj60) obj2;
                lu60 lu60Var = (lu60) obj;
                if (epx.f(lu60Var.c(), Boolean.TRUE)) {
                    List<NewsEntry> a = lu60Var.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : a) {
                        Post R = di60.R((NewsEntry) obj3);
                        if ((R != null ? R.C : null) == null || !((Boolean) uj60Var.p.getValue()).booleanValue()) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c0c0 l = kn4.l((NewsEntry) it.next());
                        if (l != null) {
                            arrayList2.add(l);
                        }
                    }
                    Map<String, ReactionSet> map = lu60Var instanceof ew60 ? ((ew60) lu60Var).e : lu60Var instanceof bl60 ? ((bl60) lu60Var).f : null;
                    if (map != null && (values = map.values()) != null) {
                        reactionSet = (ReactionSet) j5g.Z(values);
                    }
                    uj60Var.a(new r070.i.a(arrayList2, reactionSet));
                }
                return s3q0.a;
            case 11:
                ((vl60) obj2).c(new xh60.f.a(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 12:
                tgi0 tgi0Var = (tgi0) obj;
                String str = ((OrdersListItem.Order.a) obj2).c;
                if (str != null) {
                    qgi0.h(tgi0Var, str);
                }
                return s3q0.a;
            case 13:
                t690 t690Var = (t690) obj2;
                t690 t690Var2 = new t690(t690Var.m, t690Var.n, (AnimatedStickerInfo) obj, t690Var.l, null);
                nov.a.b(t690Var, t690Var2);
                return t690Var2;
            case 14:
                c4a0 c4a0Var = (c4a0) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                par0.a.getClass();
                par0.d(th);
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    c4a0Var.f(th);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                c4a0Var.c.invoke(VkPhoneValidationErrorReason.API);
                return s3q0.a;
            case 15:
                ((xia0) obj2).b.q0();
                return s3q0.a;
            case 16:
                ib50 ib50Var = (ib50) obj2;
                zif0 zif0Var = (zif0) obj;
                eib0 eib0Var = zif0Var instanceof eib0 ? (eib0) zif0Var : null;
                MusicTrack musicTrack = eib0Var != null ? eib0Var.a : null;
                MusicTrack musicTrack2 = musicTrack instanceof MusicTrack ? musicTrack : null;
                return Boolean.valueOf(epx.f(musicTrack2 != null ? musicTrack2.Fb() : null, ib50Var.b.Fb()));
            case 17:
                Owner owner = (Owner) obj2;
                UserProfile userProfile = (UserProfile) obj;
                owner.c = userProfile != null ? userProfile.e : null;
                owner.e = userProfile != null ? userProfile.h : null;
                return owner;
            case 18:
                return ((AudienceResearchComponent) ((com.vk.newsfeed.impl.presenters.b) obj2).i.getValue()).b().d((List) obj);
            case 19:
                ((efc0) obj2).C(new PostingAction.Init.RestoreStateLoaded(((RestorePostingState) obj).b));
                return s3q0.a;
            case 20:
                vpc0 vpc0Var = ((qkc0) obj2).d;
                MusicAttachDto musicAttachDto = ((PostingState.Editing) obj).i.l;
                me50 me50Var = vpc0Var.e;
                if (musicAttachDto == null) {
                    return me50Var.a;
                }
                me50Var.getClass();
                if (musicAttachDto instanceof MusicAttachDto.MusicPlaylistDto) {
                    return me50.a(((MusicAttachDto.MusicPlaylistDto) musicAttachDto).b);
                }
                if (musicAttachDto instanceof MusicAttachDto.MusicTracksDto) {
                    return me50.b(((MusicAttachDto.MusicTracksDto) musicAttachDto).b);
                }
                if (musicAttachDto instanceof MusicAttachDto.MusicSnippetDto) {
                    return me50.b(Collections.singletonList(((MusicAttachDto.MusicSnippetDto) musicAttachDto).b));
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                Context context = (Context) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof VKApiExecutionException) {
                    Context context2 = e43.a;
                    j03.i(context2 != null ? context2 : null, (VKApiExecutionException) th2);
                } else {
                    j03.j(context, th2);
                }
                return s3q0.a;
            case 22:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                ((SwipeDrawableRefreshLayout) obj2).setProgressDrawableFactory((d2e0) obj);
                return s3q0.a;
            case 23:
                ((l6n0) obj2).invoke();
                return s3q0.a;
            case 24:
                q7h0.a aVar3 = (q7h0.a) obj;
                return new l7h0.b(aVar3.c, ((c7h0) obj2).l.a(aVar3.a), aVar3.b);
            case 25:
                ixi0 ixi0Var = (ixi0) obj2;
                Integer num = (Integer) obj;
                int i2 = r9i0.j1;
                if (num != null) {
                    ((Toolbar) ixi0Var.g.getValue()).setTitle(num.intValue());
                }
                return s3q0.a;
            case 26:
                afi0 afi0Var = (afi0) obj2;
                afi0Var.z.getClass();
                String str2 = ((bcw0.a) obj).a;
                if (str2 != null && (vkSearchView = afi0Var.i) != null) {
                    vkSearchView.setQuery(str2);
                }
                return s3q0.a;
            case 27:
                return p4g.e((Set) obj, ((q8j0.f) ((q8j0) obj2)).b);
            case 28:
                ((com.vk.sharing.core.view.l) obj2).setToggleFaveActionIsEnabled(true);
                return s3q0.a;
            default:
                b8l0 b8l0Var = (b8l0) obj2;
                o8l0.a aVar4 = b8l0Var.l;
                StickerItem stickerItem = b8l0Var.o;
                aVar4.a(stickerItem != null ? stickerItem : null);
                return s3q0.a;
        }
    }

    public /* synthetic */ e810(uj60 uj60Var, kn4 kn4Var) {
        this.b = 10;
        this.c = uj60Var;
    }
}
