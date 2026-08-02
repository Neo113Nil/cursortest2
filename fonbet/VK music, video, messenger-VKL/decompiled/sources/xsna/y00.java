package xsna;

import com.vk.ecomm.catalog.impl.geo.b;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.n;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import kotlin.collections.EmptyList;
import xsna.h2g0;
import xsna.li00;
import xsna.v5r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y00 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((x00) obj2).invoke(obj);
                break;
            case 1:
                ((tl0) obj2).invoke(obj);
                break;
            case 2:
                ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
                break;
            case 3:
                ((t35) obj2).invoke(obj);
                break;
            case 4:
                ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
                break;
            case 5:
                ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
                break;
            case 6:
                ((jp5) obj2).invoke(obj);
                break;
            case 7:
                ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
                break;
            case 8:
                ((ak) obj2).invoke(obj);
                break;
            case 9:
                ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
                break;
            case 10:
                ((b.a) obj2).invoke(obj);
                break;
            case 11:
                ((tnd) obj2).invoke(obj);
                break;
            case 12:
                ((pj1) obj2).invoke(obj);
                break;
            case 13:
                int i2 = CommentsOutherFragment.h0;
                ((x00) obj2).invoke(obj);
                break;
            case 14:
                ((ihb) obj2).invoke(obj);
                break;
            case 15:
                int i3 = z5h.j1;
                ((n1d) obj2).invoke(obj);
                break;
            case 16:
                ((ak) obj2).invoke(obj);
                break;
            case 17:
                ((izs) obj2).invoke(obj);
                break;
            case 18:
                int i4 = DiscoverSearchFragment.s0;
                ((ym1) obj2).invoke(obj);
                break;
            case 19:
                ((k9e) obj2).invoke(obj);
                break;
            case 20:
                ((v5r.b) obj2).invoke(obj);
                break;
            case 21:
                int i5 = FriendRequestsFragment.d0;
                ((mjs) obj2).invoke(obj);
                break;
            case 22:
                ((tnd) obj2).invoke(obj);
                break;
            case 23:
                ((ak) obj2).invoke(obj);
                break;
            case 24:
                ((bp7) obj2).invoke(obj);
                break;
            case 25:
                ((n1d) obj2).invoke(obj);
                break;
            case 26:
                ((dxh) obj2).invoke(obj);
                break;
            case 27:
                ((uuz) obj2).invoke(obj);
                break;
            case 28:
                ((li00.a) obj2).invoke(obj);
                break;
            default:
                com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o oVar = (com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o) obj2;
                b4g0 b4g0Var = (b4g0) obj;
                if (!drm0.N(b4g0Var.b)) {
                    oVar.e(new k.j(false));
                    oVar.c(new h2g0.f(oq.d(tlo0.Companion, b4g0Var.b)));
                    break;
                } else {
                    oVar.e(x210.a);
                    oVar.c(new h2g0.e("", EmptyList.b));
                    oVar.a(n.f.b);
                    oVar.e(k.b.a);
                    break;
                }
        }
    }
}
