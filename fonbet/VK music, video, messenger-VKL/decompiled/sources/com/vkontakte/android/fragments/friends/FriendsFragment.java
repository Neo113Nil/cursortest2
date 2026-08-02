package com.vkontakte.android.fragments.friends;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.users.UsersSearch;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.aus;
import xsna.baf0;
import xsna.cn70;
import xsna.dgm;
import xsna.dhr0;
import xsna.ds4;
import xsna.e3m;
import xsna.e43;
import xsna.eko;
import xsna.eqq;
import xsna.f4m;
import xsna.fgm;
import xsna.fkq0;
import xsna.foi;
import xsna.g9e0;
import xsna.gbh;
import xsna.gzs;
import xsna.h3p0;
import xsna.hd6;
import xsna.hvt0;
import xsna.j9k;
import xsna.jjc;
import xsna.k6k;
import xsna.lpj;
import xsna.m1i;
import xsna.m3g;
import xsna.maj;
import xsna.mos;
import xsna.msy;
import xsna.n1i;
import xsna.nrs;
import xsna.o25;
import xsna.op80;
import xsna.oz50;
import xsna.ozf;
import xsna.qhh0;
import xsna.sbg;
import xsna.tbg;
import xsna.tlo0;
import xsna.tmg;
import xsna.uth0;
import xsna.uts;
import xsna.w1z;
import xsna.wzf;
import xsna.y1z;

/* compiled from: FriendsFragment.kt */
/* loaded from: classes11.dex */
public class FriendsFragment extends FragmentImpl implements hd6.a, qhh0, w1z {
    public static final /* synthetic */ int q0 = 0;
    public op80 N;
    public nrs O;
    public VkTopBar P;
    public VkTabs Q;
    public ViewPager2 R;
    public View S;
    public View T;
    public boolean W;
    public boolean X;
    public UserId[] Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public final c g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final b k0;
    public final b l0;
    public final b m0;
    public final wzf n0;
    public final eqq o0;
    public final fgm p0;
    public final mos U = new View.OnLayoutChangeListener() { // from class: xsna.mos
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = FriendsFragment.q0;
            FriendsFragment.this.fo();
        }
    };
    public UserId V = UserId.d;
    public int d0 = -1;
    public final HashSet<uts> e0 = new HashSet<>();
    public final ArrayList<uts> f0 = new ArrayList<>();

    /* compiled from: FriendsFragment.kt */
    /* loaded from: classes7.dex */
    public static class a extends oz50 {
        public final void A() {
            this.j.putBoolean("select", true);
        }

        public final void B(String str) {
            this.j.putString("title", str);
        }

        public final void C(UserId userId) {
            this.j.putParcelable("uid", userId);
        }

        public final void D(boolean z) {
            this.j.putBoolean("withoutAdd", z);
        }

        public final void y() {
            this.j.putBoolean("global_search", false);
        }

        public final void z() {
            this.j.putBoolean("multiselect", true);
        }
    }

    /* compiled from: FriendsFragment.kt */
    /* loaded from: classes7.dex */
    public final class b extends g9e0<uts> {
        public gzs<Boolean> d;

        public b(gzs<uts> gzsVar) {
            super(gzsVar);
        }

        @Override // xsna.g9e0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final uts b() {
            gzs<Boolean> gzsVar = this.d;
            if (gzsVar != null && !gzsVar.invoke().booleanValue()) {
                return null;
            }
            uts utsVar = (uts) super.b();
            if (utsVar != null) {
                FriendsFragment.this.e0.add(utsVar);
            }
            return utsVar;
        }

        public final void f(gzs<Boolean> gzsVar) {
            this.d = gzsVar;
        }
    }

    /* compiled from: FriendsFragment.kt */
    /* loaded from: classes7.dex */
    public static final class c extends FragmentImpl.b {
        public c(FriendsFragment friendsFragment) {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.mos] */
    public FriendsFragment() {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.g0 = new c(this);
        maj majVar = new maj(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h0 = msy.a(lazyThreadSafetyMode, majVar);
        int i2 = 7;
        this.i0 = msy.a(lazyThreadSafetyMode, new foi(this, i2));
        this.j0 = msy.a(lazyThreadSafetyMode, new n1i(this, i2));
        int i3 = 19;
        b bVar = new b(new sbg(this, i3));
        bVar.f(new tbg(this, i3));
        this.k0 = bVar;
        b bVar2 = new b(new m3g(this, 17));
        bVar2.f(new ozf(this, 29));
        this.l0 = bVar2;
        b bVar3 = new b(new gbh(this, 16));
        bVar3.f(new k6k(this, 14));
        this.m0 = bVar3;
        this.n0 = new wzf(this, 20);
        this.o0 = new eqq(this, 4);
        this.p0 = new fgm(this, 10);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.g0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        return false;
    }

    public UsersSearch.Entrypoint eo() {
        return null;
    }

    public final void fo() {
        VkTabs vkTabs = this.Q;
        boolean z = vkTabs != null && vkTabs.getVisibility() == 0;
        int d = e3m.d(R.attr.actionBarSize, requireContext());
        VkTabs vkTabs2 = this.Q;
        if (vkTabs2 != null) {
            f4m.t(d, vkTabs2);
        }
        ViewPager2 viewPager2 = this.R;
        if (viewPager2 != null) {
            f4m.t(d + (z ? cn70.b(52) : 0), viewPager2);
        }
        View view = this.T;
        if (view != null) {
            f4m.t(0, view);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return getActivity();
    }

    public final void go(uts... utsVarArr) {
        aus b2;
        ArrayList<uts> arrayList = this.f0;
        arrayList.clear();
        for (uts utsVar : utsVarArr) {
            if (utsVar != null) {
                arrayList.add(utsVar);
                op80 op80Var = this.N;
                if (op80Var != null && (b2 = op80Var.b()) != null) {
                    utsVar.d(b2);
                }
            }
        }
        nrs nrsVar = this.O;
        if (nrsVar != null) {
            nrsVar.J0(arrayList);
        }
        VkTabs vkTabs = this.Q;
        if (vkTabs != null) {
            vkTabs.setVisibility(arrayList.size() <= 1 ? 8 : 0);
        }
        fo();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        super.onCreate(bundle);
        this.W = requireArguments().getBoolean("select");
        this.X = requireArguments().getBoolean("multiselect");
        boolean z = true;
        this.a0 = requireArguments().getBoolean("global_search", true);
        UserId userId2 = (UserId) requireArguments().getParcelable("uid");
        if (userId2 == null) {
            userId2 = o25.a().c();
        }
        this.V = userId2;
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("selectedUsers");
        if (parcelableArrayList == null) {
            parcelableArrayList = null;
        }
        this.Y = parcelableArrayList != null ? (UserId[]) parcelableArrayList.toArray(new UserId[0]) : null;
        this.c0 = requireArguments().getBoolean("only muted", false);
        this.d0 = requireArguments().getInt("initial_tab", -1);
        this.Z = requireArguments().getBoolean("withoutAdd", this.Z);
        if (fkq0.c(this.V) && !o25.a().a(this.V)) {
            z = false;
        }
        this.b0 = z;
        this.N = new op80(this, this.V);
        if (!this.W) {
            boolean z2 = this.X;
        }
        if (eo() == UsersSearch.Entrypoint.InviteToGroup && (userId = (UserId) requireArguments().getParcelable("group_id")) != null) {
            ((InviteFriendsAnalytics) this.i0.getValue()).a(Math.abs(userId.b), InviteFriendsAnalytics.InviteFriendsSource.MAIN);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.friends_fragment, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        uth0 uth0Var = (uth0) this.j0.getValue();
        if (uth0Var != null) {
            uth0Var.onDestroyView();
        }
        VkTopBar vkTopBar = this.P;
        mos mosVar = this.U;
        if (vkTopBar != null) {
            vkTopBar.removeOnLayoutChangeListener(mosVar);
        }
        VkTabs vkTabs = this.Q;
        if (vkTabs != null) {
            vkTabs.removeOnLayoutChangeListener(mosVar);
        }
        this.S = null;
        this.T = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        uth0 uth0Var = (uth0) this.j0.getValue();
        if (uth0Var != null) {
            uth0Var.onPause();
        }
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        uth0 uth0Var = (uth0) this.j0.getValue();
        if (uth0Var != null) {
            uth0Var.onResume();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ViewPager2 viewPager2 = this.R;
        bundle.putInt("tab_position", viewPager2 != null ? viewPager2.getCurrentItem() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VkTabs.c f;
        nrs nrsVar;
        int itemCount;
        VkTopBar.a.c.f fVar;
        VkTopBar.a.b.C0877b c0877b;
        String string;
        super.onViewCreated(view, bundle);
        this.P = (VkTopBar) view.findViewById(R.id.toolbar);
        this.Q = (VkTabs) view.findViewById(R.id.tab_layout);
        this.R = (ViewPager2) view.findViewById(R.id.pager);
        this.S = view.findViewById(R.id.search_query_view_container);
        this.T = view.findViewById(R.id.search_feature_overlay_container);
        VkTopBar vkTopBar = this.P;
        int i = 1;
        if (vkTopBar != null) {
            String string2 = getString(R.string.friends);
            if (requireArguments().containsKey("title") && (string = requireArguments().getString("title")) != null) {
                string2 = string;
            }
            dgm dgmVar = new dgm(this, 8);
            tlo0.Companion.getClass();
            vkTopBar.setBack(new VkTopBar.b(dgmVar, tlo0.a.b(R.string.back), null, null, null, 28));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0.a.d(string2), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new tmg(string2, 2), 3), 14), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            baf0 b2 = this.X ? dhr0.t.b(R.drawable.vk_icon_done_24, R.attr.vk_ui_icon_accent_themed) : null;
            baf0 b3 = !this.Z ? dhr0.t.b(R.drawable.vk_icon_add_24, R.attr.vk_ui_icon_accent_themed) : null;
            m1i m1iVar = new m1i(this, 14);
            baf0 baf0Var = b2 == null ? b3 : b2;
            Object[] objArr = b3 != null && b2 == null;
            if (b2 == null || b3 == null) {
                b3 = null;
            }
            if (baf0Var != null) {
                VkTopBar.a.c.f fVar2 = new VkTopBar.a.c.f(eko.b(baf0Var), tlo0.a.b(objArr != false ? R.string.add : R.string.done), objArr != false ? m1iVar : null, null, null, null, 56);
                if (b3 != null) {
                    fVar = fVar2;
                    c0877b = new VkTopBar.a.b.C0877b(eko.b(b3), tlo0.a.b(R.string.add), m1iVar, null, null, null, 56);
                } else {
                    fVar = fVar2;
                    c0877b = null;
                }
                vkTopBar.setAfter(VkTopBar.a.C0875a.a(fVar, c0877b, 4));
            }
            h3p0.d(this, vkTopBar);
        }
        VkTabs vkTabs = this.Q;
        if (vkTabs != null && (nrsVar = this.O) != null && 1 <= (itemCount = nrsVar.getItemCount())) {
            while (true) {
                vkTabs.b(vkTabs.g(), true);
                if (i == itemCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = bundle != null ? bundle.getInt("tab_position", 0) : 0;
        ViewPager2 viewPager2 = this.R;
        VkTabs vkTabs2 = this.Q;
        if (viewPager2 != null && vkTabs2 != null) {
            this.O = new nrs(viewPager2, this, this.D, In().a);
            boolean c2 = fkq0.c(this.V);
            b bVar = this.l0;
            b bVar2 = this.k0;
            if (!c2 || o25.a().a(this.V)) {
                go(bVar2.b(), bVar.b());
            } else {
                boolean z = this.c0;
                b bVar3 = this.m0;
                if (z) {
                    go(bVar3.b());
                } else {
                    go(bVar2.b(), bVar.b(), bVar3.b());
                }
            }
            if (this.d0 != -1) {
                Iterator<uts> it = this.f0.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    uts next = it.next();
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (next.c() == this.d0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                Integer valueOf = i3 != -1 ? Integer.valueOf(i3) : null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    VkTabs vkTabs3 = this.Q;
                    if (vkTabs3 != null && (f = vkTabs3.f(intValue)) != null) {
                        VkTabs.k(vkTabs3, f);
                    }
                }
            }
            viewPager2.setAdapter(this.O);
            viewPager2.setOffscreenPageLimit(3);
            viewPager2.setSaveEnabled(false);
            if (i2 >= 0) {
                nrs nrsVar2 = this.O;
                if (i2 < (nrsVar2 != null ? nrsVar2.getItemCount() : 0)) {
                    viewPager2.e(i2, false);
                }
            }
            new e(vkTabs2, viewPager2, new e.d() { // from class: xsna.nos
                @Override // com.vk.core.view.components.tabs.e.d
                public final void a(VkTabs.c cVar, int i4) {
                    int i5 = FriendsFragment.q0;
                    com.vk.core.view.components.tabs.d dVar = cVar.a;
                    FriendsFragment friendsFragment = FriendsFragment.this;
                    dVar.setId(friendsFragment.f0.get(i4).b);
                    dVar.Y4(friendsFragment.f0.get(i4).b(friendsFragment.requireContext()), null);
                }
            }).a();
        }
        op80 op80Var = this.N;
        if (op80Var != null) {
            op80Var.d();
        }
        VkTopBar vkTopBar2 = this.P;
        if (vkTopBar2 != null) {
            jjc.g(vkTopBar2, new j9k(this, 14));
        }
        VkTopBar vkTopBar3 = this.P;
        mos mosVar = this.U;
        if (vkTopBar3 != null) {
            vkTopBar3.addOnLayoutChangeListener(mosVar);
        }
        VkTabs vkTabs4 = this.Q;
        if (vkTabs4 != null) {
            vkTabs4.addOnLayoutChangeListener(mosVar);
        }
        view.post(new ds4(this, 3));
    }

    @Override // xsna.qhh0
    public final boolean s() {
        AppBarLayout appBarLayout;
        View view = getView();
        if (view != null && (appBarLayout = (AppBarLayout) hvt0.c(R.id.app_bar_layout, view)) != null) {
            appBarLayout.g(true, true, true);
        }
        Iterator<uts> it = this.e0.iterator();
        while (it.hasNext()) {
            f a2 = it.next().a();
            if (a2 instanceof qhh0) {
                ((qhh0) a2).s();
            }
        }
        return true;
    }
}
