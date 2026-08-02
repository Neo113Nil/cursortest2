package xsna;

import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment.c;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.tool.view.CommunityProfileTabsContainerLayout;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xsna.gij;
import xsna.hv5;
import xsna.k7h0;
import xsna.ox30;
import xsna.s8z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class did0 implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.a0, Toolbar.h, e380, hv5.a, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.m, SwipeRefreshLayout.e, Preference.c, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ did0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean a() {
        boolean z;
        ViewPager2 viewPager2;
        RecyclerView recyclerView = ((com.vk.profile.user.impl.ui.i) this.c).f;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        CommunityProfileTabsContainerLayout communityProfileTabsContainerLayout = (CommunityProfileTabsContainerLayout) recyclerView.findViewById(R.id.vp_community_profile_content_layout);
        if (communityProfileTabsContainerLayout != null && (viewPager2 = communityProfileTabsContainerLayout.t) != null) {
            int currentItem = viewPager2.getCurrentItem();
            CommunityProfileTabsContainerLayout.a aVar = communityProfileTabsContainerLayout.u;
            if (aVar != null) {
                z = aVar.m0(currentItem);
                return canScrollVertically || z;
            }
        }
        z = false;
        if (canScrollVertically) {
            return true;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (com.vk.auth.modal.qrwithcode.c) ((ow60) this.c).invoke(obj);
            case 5:
                return (it80) ((ow60) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((ow60) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((q3m0) this.c).invoke(obj);
            case 12:
                return (List) ((ow60) this.c).invoke(obj);
            case 13:
                return (fo0) ((eyp0) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((ysq) this.c).invoke(obj);
            case 16:
                return (hda) ((a.b) this.c).invoke(obj);
            default:
                return (Boolean) ((eyp0) this.c).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        boolean a;
        a = ru.mail.libverify.k.a.a((ru.mail.libverify.k.a) this.c, preference);
        return a;
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((tjz0) this.c).x = z9z0Var;
    }

    @Override // xsna.e380
    public void onComplete(Throwable th) {
        ((CountDownLatch) this.c).countDown();
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        SimpleDialogsFilterFragment simpleDialogsFilterFragment = (SimpleDialogsFilterFragment) this.c;
        qcy<Object>[] qcyVarArr = SimpleDialogsFilterFragment.Y;
        if (menuItem.getItemId() != R.id.search) {
            return false;
        }
        ox30.a aVar = ox30.a.b;
        rw30 rw30Var = simpleDialogsFilterFragment.U;
        if (rw30Var == null) {
            ViewGroup viewGroup = (ViewGroup) simpleDialogsFilterFragment.requireView();
            a1w a1wVar = simpleDialogsFilterFragment.Q;
            simpleDialogsFilterFragment.P.d().getClass();
            rw30 rw30Var2 = new rw30(a1wVar, k9u0.a, simpleDialogsFilterFragment.kn(), aVar, null, 112);
            rw30Var2.w = simpleDialogsFilterFragment.new c();
            rw30Var2.D0(simpleDialogsFilterFragment.requireContext(), viewGroup, (ViewStub) viewGroup.findViewById(R.id.im_dialogs_search_container), null);
            simpleDialogsFilterFragment.U = rw30Var2;
            rw30Var = rw30Var2;
        }
        rw30.i1(rw30Var, null, 3);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        lsg0 lsg0Var = (lsg0) this.c;
        d5o0<AppUpdateInfo> a = ((wqg0) lsg0Var.e.getValue()).a();
        a.b(null, new fe60(yVar, 9));
        a.b(new orj(lsg0Var, yVar), null);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((mga0) this.c).invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.bd70, xsna.vaq0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final p870 p870Var = (p870) this.c;
        final ?? r1 = new bd70() { // from class: xsna.vaq0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                kb60 kb60Var = (kb60) obj;
                if (kb60Var == null) {
                    return;
                }
                UserId userId = kb60Var.a.m;
                PostingCreationEntryPoint.a aVar = PostingCreationEntryPoint.Companion;
                String str = kb60Var.b;
                aVar.getClass();
                io.reactivex.rxjava3.core.r.this.onNext(new gij.b(userId, PostingCreationEntryPoint.a.a(str)));
            }
        };
        p870Var.b(157, r1);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.waq0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                p870.this.g(r1);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (Pair) ((od1) this.c).invoke(obj, obj2);
            default:
                return (k7h0.b) ((ed4) this.c).invoke(obj, obj2);
        }
    }
}
