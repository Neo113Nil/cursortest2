package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.reactions.ItemReactions;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.reactions.fragments.ReactionsFragment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i230 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i230(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.feed.core.models.news.NewsEntry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.vk.feed.core.models.news.NewsEntry, java.lang.Object] */
    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        e6f0 e6f0Var;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ModalReactionsFragment modalReactionsFragment = (ModalReactionsFragment) obj2;
                ?? r6 = (NewsEntry) obj;
                int i4 = ModalReactionsFragment.G0;
                if (i == 102 && (e6f0Var = modalReactionsFragment.T) != null) {
                    ReactionsFragment reactionsFragment = e6f0Var.b;
                    ?? r1 = e6f0Var.n;
                    if (r1 != 0) {
                        if (r1.equals(r6) || ((r1 instanceof PromoPost) && epx.f(((PromoPost) r1).n, r6))) {
                            if (!(r6 instanceof c6z) || !(r1 instanceof c6z)) {
                                PromoPost promoPost = r6;
                                if (r1 instanceof PromoPost) {
                                    boolean z = r6 instanceof Post;
                                    promoPost = r6;
                                    if (z) {
                                        promoPost = PromoPost.Eb((PromoPost) r1, (Post) r6);
                                    }
                                }
                                e6f0Var.n = promoPost;
                                if (promoPost instanceof o2f0) {
                                    ItemReactions K = promoPost.K();
                                    reactionsFragment.Ve(K != null ? K.e : null);
                                    break;
                                }
                            } else {
                                ((c6z) r1).M2((c6z) r6);
                                if ((r1 instanceof o2f0) && (r6 instanceof o2f0)) {
                                    o2f0 o2f0Var = (o2f0) r1;
                                    o2f0Var.S9((o2f0) r6);
                                    ItemReactions K2 = o2f0Var.K();
                                    reactionsFragment.Ve(K2 != null ? K2.e : null);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                qvl0 qvl0Var = (qvl0) obj2;
                List list = (List) obj;
                if (list != null) {
                    u5p0 u5p0Var = qvl0Var.i;
                    (u5p0Var != null ? u5p0Var : null).invoke(new UserProfileAction.s.g.c(list));
                    break;
                }
                break;
        }
    }
}
