package xsna;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.PagerViewBottomSheetBehavior;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.common.links.AwayLink;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.story.viewer.api.models.Gesture;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.webapp.fragments.CommunityManageFragment;
import com.vkontakte.android.R;
import java.util.List;
import org.json.JSONObject;
import xsna.by1;
import xsna.c0e;
import xsna.ihz;
import xsna.irb;
import xsna.m2n;
import xsna.qjc;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c7 implements io.reactivex.rxjava3.functions.l, qjc.a, irb.c, saz, io.reactivex.rxjava3.functions.c, whp, pcs, ihz.a, t680, SwipeDrawableRefreshLayout.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        String str;
        switch (this.b) {
            case 11:
                mxa mxaVar = (mxa) this.c;
                if (awayLink != null && (str = awayLink.b) != null) {
                    g2v.c().k().b(((ViewGroup) mxaVar.a.getValue()).getContext(), str);
                    break;
                }
                break;
            default:
                dw20 dw20Var = ((hce) this.c).n.a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // xsna.whp
    public String a() {
        return ((CommunitiesCatalogRootVh) this.c).b.getString(R.string.catalog_search_empty_list);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) ((bn7) this.c).invoke((List) obj, obj2);
    }

    @Override // xsna.irb.c
    public void b(DialogExt dialogExt, lse0 lse0Var) {
        ((oub) this.c).d.invoke(dialogExt, lse0Var);
    }

    @Override // xsna.t680
    public void f(int i) {
        DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) this.c;
        PagerViewBottomSheetBehavior<?> pagerViewBottomSheetBehavior = deprecatedAttachActivity.E;
        if (pagerViewBottomSheetBehavior == null || pagerViewBottomSheetBehavior.M != 4) {
            return;
        }
        if (i == deprecatedAttachActivity.d0) {
            StoryFragment W1 = deprecatedAttachActivity.W1();
            if (W1 == null) {
                deprecatedAttachActivity.H.setCurrentItem(deprecatedAttachActivity.d0, false);
                W1 = deprecatedAttachActivity.W1();
            }
            if (W1 != null) {
                W1.R = Gesture.TAP;
                W1.eo();
            }
        } else {
            int i2 = deprecatedAttachActivity.f0;
            if (i == i2 && i2 >= 0) {
                g2v.d().a().d(deprecatedAttachActivity, deprecatedAttachActivity.p0, false, "attach", null);
            }
        }
        if (deprecatedAttachActivity.d0 == i || deprecatedAttachActivity.f0 == i) {
            return;
        }
        deprecatedAttachActivity.H.setCurrentItem(i, Math.abs(deprecatedAttachActivity.H.getCurrentItem() - i) <= 1);
        deprecatedAttachActivity.f2();
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) this.c;
        qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
        ks60 ks60Var = discoverMediaTabFragment2.fo().b().o;
        if (ks60Var != null) {
            ks60Var.c(true);
        }
        itg0.m(com.vkontakte.android.data.b.d());
        ((n2n) discoverMediaTabFragment2.T.getValue()).a(new m2n.d(xn60.d.b.b));
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        mfu0 jo;
        CommunityManageFragment communityManageFragment = (CommunityManageFragment) this.c;
        int i = CommunityManageFragment.i0;
        if (!"invite_friends_result".equals(str) || (jo = communityManageFragment.jo()) == null) {
            return;
        }
        jo.n(JsApiMethodType.APP_UPDATE_INFO, new JSONObject());
    }

    public /* synthetic */ c7(by1.a aVar, Object obj, long j) {
        this.b = 25;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((b7) obj2).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.disposables.c) ((b7) obj2).invoke(obj);
            case 2:
                return (it80) ((am0) obj2).invoke(obj);
            case 3:
                return (VKList) ((i50) obj2).invoke(obj);
            case 4:
                return (List) ((ym1) obj2).invoke(obj);
            case 5:
                return (Boolean) ((am0) obj2).invoke(obj);
            case 6:
                return (s3q0) ((i50) obj2).invoke(obj);
            case 7:
                return (Boolean) ((am0) obj2).invoke(obj);
            case 8:
                return (Boolean) ((am0) obj2).invoke(obj);
            case 9:
                return (List) ((am0) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((am0) obj2).invoke(obj);
            case 11:
            case 13:
            case 15:
            case 16:
            case 19:
            case 21:
            case 25:
            case 26:
            case 27:
            default:
                return (qih0) ((eqq) obj2).invoke(obj);
            case 12:
                ChatFragment.d dVar = ChatFragment.w1;
                return Boolean.valueOf(((ChatFragment.n) obj2).b);
            case 14:
                return (c0e.a) ((a0e) obj2).invoke(obj);
            case 17:
                return (List) ((wh6) obj2).invoke(obj);
            case 18:
                return (bl60) ((i50) obj2).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((i50) obj2).invoke(obj);
            case 22:
                return (e.j.b) ((am0) obj2).invoke(obj);
            case 23:
                return (ncq0) ((d0k) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((v63) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.q) ((d0k) obj2).invoke(obj);
        }
    }
}
