package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.O6;
import com.vk.api.friends.FriendsGetRecommendations;
import com.vk.contacts.ContactsManager;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.user.ProfileActionButton;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.toggle.data.RecommendationsItemBackgroundStyle;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.bwy;
import xsna.c3q;
import xsna.gd60;
import xsna.ikv0;
import xsna.z0e0;

/* compiled from: BaseProfilesRecommendationsHolder.kt */
/* loaded from: classes4.dex */
public abstract class ol6 extends rp6<n1e0, ProfilesRecommendations> implements View.OnClickListener, c.m<FriendsGetRecommendations.Result> {
    public static final /* synthetic */ qcy<Object>[] L = {new MutablePropertyReference1Impl(ol6.class, "profilesCarouselTransformer", "getProfilesCarouselTransformer()Lcom/vk/newsfeed/common/recycler/holders/profiles/ProfilesCarouselTransformer;", 0), p5j.a(0, ol6.class, O6.G1, "getAdapter()Lcom/vk/newsfeed/common/recycler/adapters/ProfilesRecommendationsAdapter;", fpf0.a)};
    public final RecyclerPaginatedView E;
    public final nbf0 F;
    public final nf3 G;
    public final nf3 H;
    public final c I;
    public com.vk.lists.c J;
    public boolean K;

    /* compiled from: BaseProfilesRecommendationsHolder.kt */
    public static final class a implements io.reactivex.rxjava3.functions.f<Integer> {
        public final RecommendedProfile b;
        public final boolean c;
        public final WeakReference<j1e0> d;
        public final WeakReference<vif0<?>> e;
        public final WeakReference<ol6> f;

        public a(RecommendedProfile recommendedProfile, boolean z, j1e0 j1e0Var, ol6 ol6Var, vif0<?> vif0Var) {
            this.b = recommendedProfile;
            this.c = z;
            this.d = new WeakReference<>(j1e0Var);
            this.e = new WeakReference<>(vif0Var);
            this.f = new WeakReference<>(ol6Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Integer num) {
            int hashCode;
            int intValue = num.intValue();
            RecommendedProfile recommendedProfile = this.b;
            UserProfile d = recommendedProfile.d();
            d.s.putInt("friend_request_status", this.c ? 1 : 0);
            vif0<?> vif0Var = this.e.get();
            if (vif0Var != null) {
                vif0Var.o6();
                Context context = vif0Var.itemView.getContext();
                j1e0 j1e0Var = this.d.get();
                String str = j1e0Var != null ? j1e0Var.e : null;
                if (!d.z && (intValue == 1 || intValue == 4)) {
                    Object[] objArr = recommendedProfile.d().v == 2;
                    Object[] objArr2 = recommendedProfile.d().e0 == SocialButtonType.FOLLOW;
                    if (objArr2 == true && objArr != true) {
                        zls.o(ams.a(), context, true, 2);
                    } else if ((str != null && ((hashCode = str.hashCode()) == -266144228 ? str.equals("user_rec") : !(hashCode == 3498242 ? !str.equals("inline_user_rec") : !(hashCode == 1958763691 && str.equals("synthetic_friends_profile_redesign"))))) || (objArr2 != false && objArr != false)) {
                        zls.o(ams.a(), context, false, 6);
                    }
                }
            }
            i0q0.d(1100L, new a72(this, 2));
        }
    }

    /* compiled from: BaseProfilesRecommendationsHolder.kt */
    public static final class b implements io.reactivex.rxjava3.functions.f<Throwable> {
        public final RecommendedProfile b;
        public final boolean c;
        public final String d;
        public final WeakReference<vif0<?>> e;

        public b(RecommendedProfile recommendedProfile, boolean z, String str, vif0<?> vif0Var) {
            this.b = recommendedProfile;
            this.c = z;
            this.d = str;
            this.e = new WeakReference<>(vif0Var);
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Throwable th) {
            Throwable th2 = th;
            this.b.d().s.putInt("friend_request_status", !this.c ? 1 : 0);
            vif0<?> vif0Var = this.e.get();
            if (vif0Var != null) {
                vif0Var.o6();
                Context context = vif0Var.itemView.getContext();
                String g = j03.g(context, th2, epx.f(this.d, "authors_rec") ? R.string.profile_recommendations_subscribe_failed_message : R.string.profile_recommendations_request_failed_message);
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
                aVar.u = new ikv0.d(new ikv0.d.c(g, 5), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                pkv0.d(aVar.b(), context, g);
            }
        }
    }

    /* compiled from: BaseProfilesRecommendationsHolder.kt */
    public final class c implements jzd0 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.jzd0
        public final void a() {
            ol6 ol6Var = ol6.this;
            ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) ol6Var.q6();
            if (profilesRecommendations != null) {
                ProfilesRecommendations.Footer footer = profilesRecommendations.o;
                Action action = footer != null ? footer.c : null;
                if (action != null) {
                    di60.w(action, ol6Var.itemView.getContext(), null, null, null, null, 62);
                } else {
                    hd60.a().B0(ol6Var.itemView.getContext(), profilesRecommendations.i);
                }
            }
        }

        @Override // xsna.jzd0
        public final void b() {
            ol6 ol6Var = ol6.this;
            int itemCount = ol6Var.b7().getItemCount();
            for (int i = 0; i < itemCount; i++) {
                if (ol6Var.b7().c(i) instanceof z0e0.a) {
                    j1e0 b7 = ol6Var.b7();
                    ArrayList arrayList = new ArrayList(b7.getCurrentList());
                    if (i < 0 || i >= arrayList.size()) {
                        return;
                    }
                    arrayList.remove(i);
                    b7.submitList(arrayList);
                    return;
                }
            }
        }

        @Override // xsna.jzd0
        public final void c(final int i, Context context) {
            ContactsManager contactsManager = com.vk.contacts.d.a;
            final ol6 ol6Var = ol6.this;
            ContactsManager.R0(contactsManager, context, false, null, null, new gzs() { // from class: xsna.pl6
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.gzs
                public final Object invoke() {
                    ol6 ol6Var2 = ol6.this;
                    j1e0 b7 = ol6Var2.b7();
                    ArrayList arrayList = new ArrayList(b7.getCurrentList());
                    int i2 = i;
                    if (i2 >= 0 && i2 < arrayList.size()) {
                        arrayList.remove(i2);
                        b7.submitList(arrayList);
                    }
                    ol6Var2.K = true;
                    ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) ol6Var2.q6();
                    if (profilesRecommendations != null) {
                        j1e0 b72 = ol6Var2.b7();
                        String str = profilesRecommendations.k;
                        b72.submitList(a1e0.a(profilesRecommendations, (str == null || str.length() == 0 || profilesRecommendations.l.isEmpty()) ? false : true, ol6Var2.K));
                    }
                    return s3q0.a;
                }
            }, 30);
        }

        @Override // xsna.jzd0
        public final void d(RecommendedProfile recommendedProfile, String str) {
            UserProfile d = recommendedProfile.d();
            hd60.a().L(ol6.this.itemView.getContext(), d.c, str, d.J, new gd60.b(d.e, d.h, d.Y, d.T, null, null, 112));
        }

        @Override // xsna.jzd0
        public final void e(Context context) {
            ams.a().e(context);
        }

        @Override // xsna.jzd0
        public final void f(RecommendedProfile recommendedProfile) {
            ol6.this.c7(recommendedProfile);
        }

        @Override // xsna.jzd0
        public final void g(RecommendedProfile recommendedProfile, vif0<?> vif0Var) {
            ProfileActionButton.Action action;
            UserProfile d = recommendedProfile.d();
            if (xo9.s(d)) {
                return;
            }
            boolean z = !(d.s.getInt("friend_request_status", 0) == 1);
            xo9.y(d, true);
            vif0Var.o6();
            ProfileActionButton profileActionButton = d.F;
            UserId userId = (profileActionButton == null || (action = profileActionButton.d) == null) ? d.c : action.c;
            com.vkontakte.android.data.b.l();
            c3q a = c3q.a.a(userId, null, z);
            a.H0(d.J);
            ol6 ol6Var = ol6.this;
            a.F0(ol6Var.u);
            a.K("source", ol6Var.u);
            rsg0.y0(a, null, null, 3).subscribe(new a(recommendedProfile, z, ol6Var.b7(), ol6Var, vif0Var), new b(recommendedProfile, z, ol6Var.b7().e, vif0Var));
        }
    }

    /* compiled from: BaseProfilesRecommendationsHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public ol6(int i, ViewGroup viewGroup, h170 h170Var) {
        super(i, viewGroup);
        nf3 nf3Var = new nf3();
        this.G = nf3Var;
        nf3 nf3Var2 = new nf3();
        this.H = nf3Var2;
        this.I = new c();
        int a2 = gbg0.a(this.itemView.getResources(), 16.0f);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.itemView.findViewById(R.id.recom_friends_list);
        this.E = recyclerPaginatedView;
        a1e0 a1e0Var = new a1e0();
        qcy<Object>[] qcyVarArr = L;
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3Var.c = a1e0Var;
        f4m.v(cn70.b(3), this.itemView);
        sbf0 sbf0Var = sbf0.e;
        j1e0 j1e0Var = new j1e0(sbf0Var, h170Var);
        qcy<Object> qcyVar2 = qcyVarArr[1];
        nf3Var2.c = j1e0Var;
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        recyclerPaginatedView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        nbf0 nbf0Var = new nbf0();
        this.F = nbf0Var;
        recyclerPaginatedView.getRecyclerView().setItemAnimator(new jxq(nbf0Var));
        recyclerPaginatedView.getRecyclerView().addItemDecoration(new ql6(this));
        recyclerPaginatedView.getRecyclerView().addItemDecoration(new r3n0(new rl6(this), new sl6(this)));
        recyclerPaginatedView.getRecyclerView().setPadding(a2, 0, a2, 0);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.getRecyclerView().setClipChildren(false);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setFooterLoadingViewProvider(null);
        recyclerPaginatedView.setFooterErrorViewProvider(null);
        recyclerPaginatedView.setAdapter(b7());
        ee errorView = recyclerPaginatedView.getErrorView();
        if (errorView != null) {
            errorView.setRetryClickListener(new xa80() { // from class: xsna.ml6
                @Override // xsna.xa80
                public final void b() {
                    com.vk.lists.c cVar = ol6.this.J;
                    if (cVar != null) {
                        cVar.p(false);
                    }
                }
            });
        }
        if (sbf0Var.a == RecommendationsItemBackgroundStyle.TRANSPARENT) {
            View view = this.itemView;
            ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
            }
            recyclerPaginatedView.setClipChildren(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<FriendsGetRecommendations.Result> O9(String str, com.vk.lists.c cVar) {
        ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) q6();
        if (profilesRecommendations == null) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        if (profilesRecommendations.e) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        FriendsGetRecommendations friendsGetRecommendations = new FriendsGetRecommendations(profilesRecommendations.i, str, cVar.k());
        String str2 = this.u;
        if (!TextUtils.isEmpty(str2)) {
            friendsGetRecommendations.K("ref", str2);
        }
        String str3 = profilesRecommendations.p;
        if (!TextUtils.isEmpty(str3)) {
            friendsGetRecommendations.K("reason", str3);
        }
        String str4 = profilesRecommendations.q.b;
        if (!TextUtils.isEmpty(str4)) {
            friendsGetRecommendations.K("track_code", str4);
        }
        int i = profilesRecommendations.m;
        if (i != 0) {
            friendsGetRecommendations.C(i, "friend_id");
        }
        return rsg0.y0(friendsGetRecommendations, null, null, 3);
    }

    @Override // xsna.rp6
    public final void R6(n1e0 n1e0Var) {
        final n1e0 n1e0Var2 = n1e0Var;
        final boolean z = false;
        Object c2 = b7().c(0);
        if ((c2 instanceof z0e0.d) && ((z0e0.d) c2).a == n1e0Var2.k) {
            z = true;
        }
        b7().e = n1e0Var2.h;
        b7().f = this.u;
        j1e0 b7 = b7();
        bwy bwyVar = n1e0Var2.o;
        if (!epx.f(b7.i, bwyVar)) {
            b7.i = bwyVar;
            b7.notifyDataSetChanged();
        }
        b7().g = this.I;
        RecyclerPaginatedView recyclerPaginatedView = this.E;
        wjf0.c(recyclerPaginatedView.getRecyclerView(), new gzs() { // from class: xsna.il6
            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2 = z;
                ol6 ol6Var = this;
                if (!z2) {
                    ol6Var.b7().submitList(null);
                }
                com.vk.lists.c cVar = ol6Var.J;
                n1e0 n1e0Var3 = n1e0Var2;
                if (cVar != null) {
                    cVar.s(n1e0Var3.n);
                }
                com.vk.lists.c cVar2 = ol6Var.J;
                if (cVar2 != null) {
                    cVar2.r(n1e0Var3.m);
                }
                ol6Var.b7().submitList(n1e0Var3.i);
                if (ol6Var.J == null) {
                    c.h hVar = new c.h(ol6Var);
                    hVar.l = false;
                    hVar.k = n1e0Var3.n;
                    hVar.i = 20;
                    ol6Var.J = com.vk.lists.f.a(hVar, ol6Var.E);
                }
                return s3q0.a;
            }
        });
        if (n1e0Var2.p) {
            recyclerPaginatedView.g0();
        }
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        NewsEntry.TrackData Cb = u1c0Var.b.Cb();
        Cb.c = u1c0Var.k;
        Cb.h = u1c0Var.l;
        Cb.d = pvo0.a();
        super.a6(u1c0Var);
    }

    public final j1e0 b7() {
        return (j1e0) this.H.getValue(this, L[1]);
    }

    public void c7(RecommendedProfile recommendedProfile) {
        h7(recommendedProfile);
    }

    @Override // xsna.rp6
    /* renamed from: d7, reason: merged with bridge method [inline-methods] */
    public void U6(final ProfilesRecommendations profilesRecommendations) {
        super.U6(profilesRecommendations);
        if (this.C != 0) {
            return;
        }
        b7().e = profilesRecommendations.i;
        b7().f = this.u;
        j1e0 b7 = b7();
        bwy bwyVar = profilesRecommendations.f;
        if (!epx.f(b7.i, bwyVar)) {
            b7.i = bwyVar;
            b7.notifyDataSetChanged();
        }
        b7().g = this.I;
        final boolean z = false;
        Object c2 = b7().c(0);
        if ((c2 instanceof z0e0.d) && ((z0e0.d) c2).a == j5g.a0(profilesRecommendations.l)) {
            z = true;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.E;
        wjf0.c(recyclerPaginatedView.getRecyclerView(), new gzs() { // from class: xsna.ll6
            @Override // xsna.gzs
            public final Object invoke() {
                boolean z2 = z;
                ol6 ol6Var = this;
                if (!z2) {
                    ol6Var.b7().submitList(null);
                }
                com.vk.lists.c cVar = ol6Var.J;
                ProfilesRecommendations profilesRecommendations2 = profilesRecommendations;
                if (cVar != null) {
                    cVar.s(profilesRecommendations2.k);
                }
                String str = profilesRecommendations2.k;
                boolean z3 = (str == null || str.length() == 0 || profilesRecommendations2.l.isEmpty()) ? false : true;
                com.vk.lists.c cVar2 = ol6Var.J;
                if (cVar2 != null) {
                    cVar2.r(z3);
                }
                ol6Var.K = com.vk.contacts.d.a.H0();
                j1e0 b72 = ol6Var.b7();
                b72.submitList(a1e0.a(profilesRecommendations2, z3, ol6Var.K));
                if (ol6Var.J == null) {
                    c.h hVar = new c.h(ol6Var);
                    hVar.l = false;
                    hVar.k = profilesRecommendations2.k;
                    hVar.i = 20;
                    ol6Var.J = com.vk.lists.f.a(hVar, ol6Var.E);
                }
                return s3q0.a;
            }
        });
        if (epx.f(profilesRecommendations.f, bwy.a.a)) {
            recyclerPaginatedView.g0();
        }
    }

    public abstract void e7();

    public abstract void f7(RecommendedProfile recommendedProfile);

    public final void h7(RecommendedProfile recommendedProfile) {
        j1e0 b7 = b7();
        z0e0.d dVar = new z0e0.d(recommendedProfile);
        df6 df6Var = new df6(1, this, recommendedProfile);
        ArrayList arrayList = new ArrayList(b7.getCurrentList());
        if (ttp0.a(arrayList).remove(dVar)) {
            b7.submitList(arrayList, df6Var);
        }
        jps jpsVar = new jps(recommendedProfile.d().c);
        String str = this.u;
        if (!TextUtils.isEmpty(str)) {
            jpsVar.K("ref", str);
        }
        String str2 = recommendedProfile.d().J;
        if (!TextUtils.isEmpty(str2)) {
            jpsVar.K("track_code", str2);
        }
        jpsVar.p();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<FriendsGetRecommendations.Result> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<FriendsGetRecommendations.Result> qVar, boolean z, com.vk.lists.c cVar) {
        ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) q6();
        if (profilesRecommendations == null) {
            return;
        }
        hg1.b(this.itemView, qVar.subscribe(new ji3(new jl6(cVar, profilesRecommendations, this, 0), 3), new kl6(new d(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 0)));
    }
}
