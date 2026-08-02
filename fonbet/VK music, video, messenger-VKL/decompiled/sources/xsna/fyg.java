package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.vjh;
import xsna.wih;

/* compiled from: CommunityContentViewHolderFactory.kt */
/* loaded from: classes5.dex */
public final class fyg implements wlj {
    public final CommunityProfileContent a;
    public final com.vk.profile.community.impl.ui.profile.b b;
    public final vph c;
    public final nph d;
    public final q530 e;
    public final io.reactivex.rxjava3.core.q<jvh> f;
    public final f8d g;
    public final qwe h;
    public final ExtendedCommunityProfile i;
    public final io.reactivex.rxjava3.core.q<ajh> j;
    public final wo1 k;

    public fyg(CommunityProfileContent communityProfileContent, com.vk.profile.community.impl.ui.profile.b bVar, vph vphVar, nph nphVar, q530 q530Var, io.reactivex.rxjava3.core.q qVar, f8d f8dVar, qwe qweVar, ExtendedCommunityProfile extendedCommunityProfile, io.reactivex.rxjava3.core.q qVar2, wo1 wo1Var) {
        this.a = communityProfileContent;
        this.b = bVar;
        this.c = vphVar;
        this.d = nphVar;
        this.e = q530Var;
        this.f = qVar;
        this.g = f8dVar;
        this.h = qweVar;
        this.i = extendedCommunityProfile;
        this.j = qVar2;
        this.k = wo1Var;
    }

    @Override // xsna.wlj
    public final wjh a(ViewGroup viewGroup, int i, wih.a.d dVar) {
        View b = tf3.b(viewGroup, R.layout.community_item_content_pager_item, viewGroup, false);
        ViewParent parent = b.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(b);
        }
        vph vphVar = this.c;
        com.vk.profile.community.impl.ui.profile.b bVar = this.b;
        CommunityProfileContent communityProfileContent = this.a;
        if (i == 17) {
            return new dmh(b, communityProfileContent.a, bVar.a, vphVar, WallGetMode.MAIN, dVar, this.f, this.i, this.j);
        }
        nph nphVar = this.d;
        switch (i) {
            case 0:
                return new dmh(b, communityProfileContent.a, bVar.a, vphVar, WallGetMode.ALL, dVar, this.f, this.i, null);
            case 1:
                return new gkh(b, communityProfileContent.a, bVar.a, nphVar, dVar, bVar.c);
            case 2:
                return new tlh(b, communityProfileContent.a, bVar.a, nphVar, dVar, this.h);
            case 3:
                return new jhh(b, communityProfileContent.a, bVar.a, nphVar, dVar);
            case 4:
                UserId userId = communityProfileContent.a;
                String str = communityProfileContent.d;
                if (str == null) {
                    str = "";
                }
                return new com.vk.profile.core.tabs.ui.music.c(b, userId, str, bVar.a, nphVar, bVar.b, dVar);
            case 5:
                return new hvd0(b, communityProfileContent.a, bVar.a, nphVar, dVar);
            case 6:
                return new ufh(b, communityProfileContent.a, bVar.a, nphVar, dVar);
            case 7:
                return new ogh(b, communityProfileContent.a, bVar.a, this.g, nphVar, dVar, this.k);
            case 8:
                return new ukh(b, communityProfileContent.a, bVar.a, nphVar, bVar.b, dVar);
            case 9:
                return new rhh(b, communityProfileContent.a, bVar.a, nphVar, dVar);
            case 10:
                return new tud0(b, communityProfileContent.a, bVar.a, nphVar, new lxg(1, dVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new mxg(1, dVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new nxg(1, dVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new oxg(1, dVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new pxg(1, dVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0));
            case 11:
                return new dmh(b, communityProfileContent.a, bVar.a, vphVar, WallGetMode.DONUT, dVar, this.f, this.i, null);
            case 12:
                return new kih(b, communityProfileContent.a, bVar.a, nphVar, this.e, new jhj(new qxg(1, dVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new rxg(1, dVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new sxg(1, dVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new txg(1, dVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new uxg(1, dVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0)));
            case 13:
                return new elh(b, communityProfileContent.a, bVar.a, nphVar, this.e, new jhj(new vxg(1, dVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new wxg(1, dVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new xxg(1, dVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new yxg(1, dVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new zxg(1, dVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0)));
            case 14:
                return new zhh(b, communityProfileContent.a, bVar.a, nphVar, dVar);
            default:
                return new wjh(b, communityProfileContent.a, bVar.a, new ayg(1, dVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new byg(1, dVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new cyg(1, dVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new dyg(1, dVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new eyg(1, dVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        }
    }
}
