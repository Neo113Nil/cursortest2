package xsna;

import android.content.Context;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.friends.impl.di.FeedFriendsComponentImpl;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dme;
import xsna.dzh;
import xsna.qfs;
import xsna.wih;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sje implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sje(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.disposables.c cVar;
        UserId userId;
        int i;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = (ClipsLinksControllerRootFragment) obj;
                dw20 dw20Var = clipsLinksControllerRootFragment.O;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                clipsLinksControllerRootFragment.O = null;
                break;
            case 1:
                ((dme.a) obj).i.d.invoke();
                break;
            case 2:
                break;
            case 3:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i3 = ClipsWrapperFragment.Q0;
                mtf Pf = clipsWrapperFragment.io().Pf();
                Context requireContext = clipsWrapperFragment.requireContext();
                Pf.getClass();
                break;
            case 4:
                break;
            case 5:
                ((wlg) obj).c.invoke(new a.f(false));
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                gzs<s3q0> gzsVar = ((wih.a) obj).s;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 9:
                vuh vuhVar = (vuh) obj;
                break;
            case 10:
                ((CommunityReviewsFragment) obj).R.c(dzh.a.a);
                break;
            case 11:
                ((y89) obj).invoke(CommunityProfileAction.e.i.d.b);
                break;
            case 12:
                break;
            case 13:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj;
                break;
            case 14:
                dw20 dw20Var2 = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                break;
            case 15:
                int i4 = CreateChatTransferFragment.F0;
                Object obj2 = ((CreateChatTransferFragment) obj).m0;
                ((d7k) (obj2 != null ? obj2 : null)).n();
                break;
            case 16:
                qcy<Object>[] qcyVarArr = fck.t1;
                break;
            case 17:
                qkr0 qkr0Var = ((zam) obj).h;
                if (qkr0Var != null && (cVar = qkr0Var.a.s) != null) {
                    cVar.dispose();
                }
                break;
            case 18:
                break;
            case 19:
                edw.k(edw.a, ((com.vk.im.ui.components.dialogs_list.c) obj).f, R.string.vkim_enable_private_message_notifications_snackbar_desc);
                break;
            case 20:
                RecyclerView recyclerView = ((r3n) obj).a;
                elg0 elg0Var = new elg0(recyclerView);
                ren renVar = new ren(recyclerView, elg0Var);
                sen senVar = new sen(recyclerView, renVar, elg0Var);
                FeedRecyclerView feedRecyclerView = (FeedRecyclerView) recyclerView;
                feedRecyclerView.e.b.add(renVar);
                feedRecyclerView.setDisplayItemsRippleEffectTouchListener(senVar);
                break;
            case 21:
                qcy<Object>[] qcyVarArr2 = DiscoverSimilarFeedFragment.s0;
                break;
            case 22:
                int i5 = DisplayMusicPlaylistFragment.b0;
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                int i6 = EntriesListFragment.m0;
                break;
            case 26:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj;
                break;
            case 27:
                FeedFriendsComponentImpl feedFriendsComponentImpl = (FeedFriendsComponentImpl) obj;
                break;
            case 28:
                f6s f6sVar = (f6s) obj;
                q6s j7 = f6sVar.j7();
                if (j7 != null) {
                    NewsEntry newsEntry = j7.h0;
                    c6z Q = di60.Q(newsEntry);
                    Badgeable badgeable = Q instanceof Badgeable ? (Badgeable) Q : null;
                    if (badgeable != null) {
                        Post R = di60.R(newsEntry);
                        if (R == null || (userId = R.m) == null) {
                            Post post = badgeable instanceof Post ? (Post) badgeable : null;
                            if (post != null) {
                                userId = post.m;
                            }
                        }
                        if (R != null) {
                            i = R.n;
                        } else {
                            Post post2 = badgeable instanceof Post ? (Post) badgeable : null;
                            if (post2 != null) {
                                i = post2.n;
                            }
                        }
                        f6sVar.E.c(f6sVar.itemView.getContext(), badgeable, userId, i);
                    }
                }
                break;
            default:
                qfs.a aVar2 = ((ufs) obj).e;
                qfs.this.l.s(aVar2.a);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sje(ufs ufsVar, Size size) {
        this.b = 29;
        this.c = ufsVar;
    }
}
