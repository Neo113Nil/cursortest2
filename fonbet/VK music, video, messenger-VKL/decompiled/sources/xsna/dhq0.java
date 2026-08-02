package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.vjh;
import xsna.wih;

/* compiled from: UserContentViewHolderFactory.kt */
/* loaded from: classes5.dex */
public final class dhq0 implements wlj {
    public final CommunityProfileContent a;
    public final opq0 b;
    public final oqq0 c;
    public final qqq0 d;
    public final q530 e;
    public final f8d f;
    public final qwe g;
    public final s2b h;
    public final NewsFeedComponent i;
    public final boolean j;
    public final mdm0 k;
    public final boolean l;
    public final Object m;

    public dhq0(CommunityProfileContent communityProfileContent, opq0 opq0Var, oqq0 oqq0Var, qqq0 qqq0Var, q530 q530Var, f8d f8dVar, qwe qweVar, s2b s2bVar, NewsFeedComponent newsFeedComponent, boolean z, mdm0 mdm0Var) {
        this.a = communityProfileContent;
        this.b = opq0Var;
        this.c = oqq0Var;
        this.d = qqq0Var;
        this.e = q530Var;
        this.f = f8dVar;
        this.g = qweVar;
        this.h = s2bVar;
        this.i = newsFeedComponent;
        this.j = z;
        this.k = mdm0Var;
        ComFeatures comFeatures = ComFeatures.COM_PROFILE_DONUT_TAB;
        comFeatures.getClass();
        this.l = com.vk.toggle.b.A.a(comFeatures);
        this.m = msy.a(LazyThreadSafetyMode.NONE, new w0o0(1));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wlj
    public final wjh a(ViewGroup viewGroup, int i, wih.a.d dVar) {
        View b;
        wih.a.d dVar2;
        UserProfileFragment userProfileFragment;
        View view;
        CommunityProfileContent communityProfileContent;
        View view2;
        UserProfileFragment userProfileFragment2;
        wjh tlhVar;
        View view3;
        CommunityProfileContent communityProfileContent2;
        opq0 opq0Var = this.b;
        UserProfileFragment userProfileFragment3 = opq0Var.a;
        wjh wjhVar = null;
        if ((i == 0 || i == 11 || i == 16 || i == 17) && ((Boolean) this.m.getValue()).booleanValue()) {
            b = tf3.b(viewGroup, R.layout.profile_feed_item_content_pager_item, viewGroup, false);
        } else {
            b = tf3.b(viewGroup, R.layout.community_item_content_pager_item, viewGroup, false);
            ViewParent parent = b.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(b);
            }
        }
        View view4 = b;
        CommunityProfileContent communityProfileContent3 = this.a;
        if (i != 0) {
            oqq0 oqq0Var = this.c;
            if (i != 1) {
                if (i == 2) {
                    view2 = view4;
                    communityProfileContent = communityProfileContent3;
                    userProfileFragment2 = userProfileFragment3;
                    tlhVar = new tlh(view2, communityProfileContent.a, userProfileFragment2, oqq0Var, dVar, this.g);
                } else if (i == 4) {
                    communityProfileContent = communityProfileContent3;
                    UserId userId = communityProfileContent.a;
                    String str = communityProfileContent.d;
                    if (str == null) {
                        str = "";
                    }
                    wjh cVar = new com.vk.profile.core.tabs.ui.music.c(view4, userId, str, userProfileFragment3, oqq0Var, opq0Var.b, dVar);
                    dVar2 = dVar;
                    wjhVar = cVar;
                    view = view4;
                    userProfileFragment = userProfileFragment3;
                } else if (i == 5) {
                    view2 = view4;
                    communityProfileContent = communityProfileContent3;
                    userProfileFragment2 = userProfileFragment3;
                    tlhVar = new hvd0(view2, communityProfileContent.a, userProfileFragment2, oqq0Var, dVar);
                } else if (i == 7) {
                    view2 = view4;
                    communityProfileContent = communityProfileContent3;
                    userProfileFragment2 = userProfileFragment3;
                    tlhVar = new ogh(view2, communityProfileContent.a, userProfileFragment2, this.f, oqq0Var, dVar, this.h);
                } else if (i != 10) {
                    if (i != 11) {
                        switch (i) {
                            case 16:
                                dVar2 = dVar;
                                view3 = view4;
                                communityProfileContent2 = communityProfileContent3;
                                userProfileFragment = userProfileFragment3;
                                wjhVar = b(view3, dVar2, WallGetMode.ARCHIVED);
                                break;
                            case 17:
                                dVar2 = dVar;
                                view3 = view4;
                                communityProfileContent2 = communityProfileContent3;
                                userProfileFragment = userProfileFragment3;
                                wjhVar = b(view3, dVar2, WallGetMode.MAIN);
                                break;
                            case 18:
                                dVar2 = dVar;
                                view = view4;
                                userProfileFragment = userProfileFragment3;
                                wjhVar = new inq0(view4, communityProfileContent3.a, userProfileFragment3, oqq0Var, this.j, this.k, new ygq0(1, dVar2, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new zgq0(1, dVar2, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new ahq0(1, dVar2, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new bhq0(1, dVar2, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new chq0(1, dVar2, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0));
                                communityProfileContent = communityProfileContent3;
                                break;
                            default:
                                dVar2 = dVar;
                                view = view4;
                                communityProfileContent = communityProfileContent3;
                                userProfileFragment = userProfileFragment3;
                                break;
                        }
                    } else {
                        dVar2 = dVar;
                        view3 = view4;
                        communityProfileContent2 = communityProfileContent3;
                        userProfileFragment = userProfileFragment3;
                        if (this.l) {
                            wjhVar = b(view3, dVar2, WallGetMode.DONUT);
                        }
                    }
                    communityProfileContent = communityProfileContent2;
                    view = view3;
                } else {
                    dVar2 = dVar;
                    userProfileFragment = userProfileFragment3;
                    communityProfileContent = communityProfileContent3;
                    view = view4;
                    wjhVar = new tud0(view4, communityProfileContent3.a, userProfileFragment, oqq0Var, new tgq0(1, dVar2, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new ugq0(1, dVar2, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new vgq0(1, dVar2, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new wgq0(1, dVar2, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new xgq0(1, dVar2, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0));
                }
                dVar2 = dVar;
                wjhVar = tlhVar;
                view = view2;
                userProfileFragment = userProfileFragment2;
            } else {
                communityProfileContent = communityProfileContent3;
                wjh gkhVar = new gkh(view4, communityProfileContent.a, userProfileFragment3, oqq0Var, dVar, opq0Var.c);
                view = view4;
                userProfileFragment = userProfileFragment3;
                dVar2 = dVar;
                wjhVar = gkhVar;
            }
        } else {
            dVar2 = dVar;
            userProfileFragment = userProfileFragment3;
            view = view4;
            communityProfileContent = communityProfileContent3;
            wjhVar = b(view, dVar2, WallGetMode.ALL);
        }
        if (wjhVar == null) {
            return new bsm0(view, communityProfileContent.a, userProfileFragment, new vrm0(1, dVar2, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new wrm0(1, dVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new xrm0(1, dVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new yrm0(1, dVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new zrm0(1, dVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        }
        return wjhVar;
    }

    public final foq0 b(View view, vjh.b bVar, WallGetMode wallGetMode) {
        opq0 opq0Var = this.b;
        return new foq0(view, opq0Var.a, bVar, this.a, wallGetMode, this.d, opq0Var.d, opq0Var.e, this.i);
    }
}
