package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.preference.Preference;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.ironsource.X3;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.util.RecreateActivity;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.friends.impl.followers.presentation.fragments.AllFollowersListFragment;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vk.superapp.api.internal.requests.app.OrdersCancelUserSubscriptionResult;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bld;
import xsna.c8p;
import xsna.drz;
import xsna.e3s;
import xsna.fb7;
import xsna.fit;
import xsna.gss;
import xsna.nv90;
import xsna.tlo0;
import xsna.ub9;
import xsna.va9;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j7 implements io.reactivex.rxjava3.functions.l, AbstractPaginatedView.f, kss, vgp, ProductDetailsResponseListener, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.h, ub9.c, whp, VkSwitchItem.a, Preference.c, pcs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.whp
    public String a() {
        return ((ClipSearchRootVh) this.c).b.getString(R.string.catalog_search_empty_list);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.logic.processor.d) obj2).invoke(obj);
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 17:
            case 19:
            case 20:
            case 21:
            default:
                return (List) ((bqt) obj2).invoke(obj);
            case 3:
                return (String) ((qt0) obj2).invoke(obj);
            case 10:
                return (hda) ((n6a) obj2).invoke(obj);
            case 11:
                return (hda) ((g20) obj2).invoke(obj);
            case 14:
                return (UsersUserFullDto) ((qt0) obj2).invoke(obj);
            case 15:
                return (ClipsPrefetchHelper.a) ((g20) obj2).invoke(obj);
            case 16:
                return (Clips) ((com.vk.movika.sdk.base.logic.processor.d) obj2).invoke(obj);
            case 18:
                return (it80) ((qt) obj2).invoke(obj);
            case 22:
                return (drz.a) ((nvg) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((nvg) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((oa) obj2).invoke(obj);
            case 25:
                qcy<Object>[] qcyVarArr = GameUnavailableFragment.W;
                return (List) ((nvg) obj2).invoke(obj);
            case 26:
                return (OrdersCancelUserSubscriptionResult) ((fit.c) obj2).invoke(obj);
            case 27:
                return (Boolean) ((qt0) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((nvg) obj2).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        String str;
        gs9 gs9Var = (gs9) this.c;
        synchronized (gs9Var.a) {
            obr.f("Release completer expected to be null", gs9Var.n == null);
            gs9Var.n = aVar;
            str = "Release[session=" + gs9Var + X3.j.e;
        }
        return str;
    }

    @Override // com.vk.core.view.components.switch.VkSwitchItem.a
    public void b(boolean z) {
        cld cldVar = new cld(1, ((bld) this.c).d, bld.a.class, "onCamera60fpsSwitched", "onCamera60fpsSwitched(Z)V", 0);
        com.vk.core.preference.Preference.f("clips_camera_settings").edit().putBoolean("clips_camera_60_fps", z).apply();
        cldVar.invoke(Boolean.valueOf(z));
        nf9.f();
    }

    @Override // xsna.kss
    public void c(gss gssVar) {
        AllFollowersListFragment allFollowersListFragment = (AllFollowersListFragment) this.c;
        int i = AllFollowersListFragment.c0;
        if (gssVar instanceof gss.b) {
            xn50.a.c(allFollowersListFragment, new e3s.a.C2775a(true, ((gss.b) gssVar).a, true));
            return;
        }
        if (gssVar instanceof gss.d) {
            xn50.a.c(allFollowersListFragment, new e3s.a.d(true, ((gss.d) gssVar).a, true));
        } else if (gssVar instanceof gss.a) {
            xn50.a.c(allFollowersListFragment, new e3s.a.b(true, ((gss.a) gssVar).a, true));
        } else {
            if (!(gssVar instanceof gss.c)) {
                throw new NoWhenBranchMatchedException();
            }
            xn50.a.c(allFollowersListFragment, new e3s.a.c(((gss.c) gssVar).a));
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 19:
                String[] strArr = DebugDevSettingsFragment.t0;
                int i2 = RecreateActivity.b;
                RecreateActivity.a.b(200L, ((DebugDevSettingsFragment) obj).requireContext());
                break;
            default:
                int i3 = DebugUserSettingsFragment.l0;
                new WebView(((DebugUserSettingsFragment) obj).kn()).clearCache(true);
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (va9.f) ((sa9) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((eb7) this.c).d.b(fb7.e.a);
    }

    @Override // com.vk.lists.AbstractPaginatedView.f
    public View l(Context context) {
        AbstractPaginatedView abstractPaginatedView = (AbstractPaginatedView) this.c;
        int i = AbstractPaginatedView.v;
        return abstractPaginatedView.h(context);
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        ((izs) this.c).invoke(new k27(billingResult, list));
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        zbq zbqVar = (zbq) this.c;
        c8p.n1.getClass();
        EducationParam a = c8p.b.a(bundle);
        nv90.a aVar = zbqVar.a;
        VkPeopleSearchParams a2 = aVar.a();
        a2.g = a;
        aVar.b(a2);
    }

    @Override // xsna.vgp
    public com.vk.core.view.components.paging.list.a provide() {
        wj6 wj6Var = (wj6) this.c;
        tlo0.Companion.getClass();
        return new com.vk.core.view.components.paging.list.a(null, new VkPlaceholder.b((tlo0) null, new tlo0.h(wj6Var.v7()), com.vk.core.compose.component.semantics.b.a(null, new jt(4), 3), 3), null);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 7:
                return ((Boolean) ((qt0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((dsc) this.c).invoke(obj)).booleanValue();
        }
    }
}
