package xsna;

import android.content.Context;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.FillingLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.common.PromoLinkAction;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.network.kbh.state.NetworkState;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.cwb0;
import xsna.hg1;
import xsna.hvw;
import xsna.i5e0;
import xsna.ikv0;
import xsna.jmm;
import xsna.jsm;
import xsna.koa0;
import xsna.koa0.a;
import xsna.num;
import xsna.qgh0;
import xsna.tlo0;
import xsna.ytm;

/* compiled from: DialogsListViewController.kt */
/* loaded from: classes18.dex */
public final class fum extends fi6<oum, ytm> implements DialogsListAdapter.a {
    public static at6 t;
    public final a1w f;
    public final esm g;
    public final jsm.a h;
    public RecyclerView i;
    public FillingLinearLayoutManager j;
    public ztm k;
    public final bpn0 l;
    public asm m;
    public j5e0 n;
    public final io.reactivex.rxjava3.disposables.b o;
    public koa0 p;
    public final io.reactivex.rxjava3.subjects.f<hfz> q;
    public final hvw r;
    public final Object s;

    /* compiled from: DialogsListViewController.kt */
    public final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            fum.this.R();
        }
    }

    /* compiled from: DialogsListViewController.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PromoLinkAction.values().length];
            try {
                iArr[PromoLinkAction.HIDE_PROMO_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fum(int i, a1w a1wVar, cau0 cau0Var, esm esmVar, jsm.a aVar) {
        super(i, null);
        this.f = a1wVar;
        this.g = esmVar;
        this.h = aVar;
        this.l = new bpn0(new gbj(this, 5));
        this.o = new io.reactivex.rxjava3.disposables.b();
        this.q = new io.reactivex.rxjava3.subjects.f<>();
        this.r = new hvw(new gum(1, this, fum.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.s = msy.a(LazyThreadSafetyMode.NONE, new u3k(this, 3));
    }

    @Override // xsna.gm20.a
    public final void C() {
        O(ytm.c0.b);
    }

    @Override // xsna.nq20.a
    public final void D() {
        O(new ytm.t());
    }

    @Override // xsna.pvw
    public final void F(String str) {
        this.r.a.invoke(new ytm.z(str));
    }

    @Override // xsna.qg20.a
    public final void H() {
        O(ytm.k.b);
    }

    @Override // xsna.xur0.a
    public final void I(i5e0.a aVar) {
        j5e0 j5e0Var = this.n;
        if (j5e0Var != null) {
            ((bzb0) j5e0Var.b.getValue()).b(new cwb0.t0(), new by5(12, this, aVar), null);
        }
    }

    @Override // xsna.jmm.a
    public final void K(Peer peer, ImStoryState imStoryState, WeakReference<View> weakReference) {
        if (d6q0.t == NetworkState.UNSTABLE) {
            cvk.t();
        } else {
            O(new ytm.x(peer, imStoryState, weakReference));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.dialogs_recycler_view);
        this.i = recyclerView;
        recyclerView.setAdapter(S());
        qj0.a(S(), recyclerView, new qgh0.a());
        FillingLinearLayoutManager fillingLinearLayoutManager = new FillingLinearLayoutManager(recyclerView.getContext());
        fillingLinearLayoutManager.l = true;
        fillingLinearLayoutManager.r = new mum(2, this, fum.class, "shouldFillViewHolder", "shouldFillViewHolder(Landroidx/recyclerview/widget/LinearLayoutManager;Landroid/view/View;)Z", 0);
        recyclerView.setLayoutManager(fillingLinearLayoutManager);
        this.j = fillingLinearLayoutManager;
        recyclerView.setHasFixedSize(true);
        recyclerView.setRecycledViewPool(null);
        recyclerView.addOnScrollListener(new a());
        recyclerView.setOverScrollMode(2);
        new ifo(recyclerView, new lum(this), S());
        ow90 ow90Var = ow90.a;
        ow90.c(ScrollScreenType.DIALOGS, recyclerView);
        int i = 3;
        this.k = new ztm(recyclerView, new mxj(this, i));
        koa0 koa0Var = new koa0(S());
        RecyclerView recyclerView2 = this.i;
        (recyclerView2 != null ? recyclerView2 : null).addItemDecoration(koa0Var);
        koa0.a aVar = koa0Var.new a();
        koa0Var.b.registerAdapterDataObserver(aVar);
        koa0Var.j = aVar;
        this.p = koa0Var;
        Context context = view.getContext();
        esm esmVar = this.g;
        fo50 d = esmVar.d();
        nsm h = esmVar.h();
        a1w a1wVar = this.f;
        this.m = new asm(context, a1wVar, d, h);
        this.n = new j5e0(view.getContext());
        boolean z = esmVar.c().c;
        int i2 = 21;
        int i3 = 22;
        io.reactivex.rxjava3.subjects.f<hfz> fVar = this.q;
        io.reactivex.rxjava3.disposables.b bVar = this.o;
        if (z) {
            hg1.d1 d1Var = new hg1.d1(hum.b);
            fVar.getClass();
            io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, d1Var).U(new eum(ium.b, 0));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            asu0.a.getClass();
            io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(U.d(2000L, timeUnit, asu0.i(), Integer.MAX_VALUE, new aum()), new e7(new ci3(24), i3));
            sf sfVar = new sf(new qpj(this, 6), i2);
            int i4 = kwg0.a;
            bVar.b(i0Var.subscribe(sfVar, new tp0(new nu2("observeVisibleDialogs stories update in DialogsListViewController:", 2), i3)));
        }
        hg1.d1 d1Var2 = new hg1.d1(l86.d);
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, d1Var2).U(new pa(jum.b, 15));
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        asu0.a.getClass();
        int i5 = 18;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var2 = new io.reactivex.rxjava3.internal.operators.observable.i0(U2.d(60000L, timeUnit2, asu0.i(), Integer.MAX_VALUE, new cum()), new y7(new tb4(i5), i5));
        mp0 mp0Var = new mp0(new wcj(this, 5), 19);
        int i6 = kwg0.a;
        bVar.b(i0Var2.subscribe(mp0Var, new el6(new nu2("observeVisibleDialogs non-friend status update in DialogsListViewController:", 2), i2)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.mixed.q(a1wVar.l.a().b0(x380.class).K(), new ux0(new com.vk.movika.sdk.base.logic.interactor.e(this, 28), i3)).subscribe(new lf1(new vfk(this, i), i3), new zl0(new nu2("observeVisibleDialogs non-friend status update in DialogsListViewController:", 2), i3)));
    }

    public final void R() {
        List<hfz> list = S().h.f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((hfz) it.next()) instanceof zfm) {
                FillingLinearLayoutManager fillingLinearLayoutManager = this.j;
                if (fillingLinearLayoutManager == null) {
                    fillingLinearLayoutManager = null;
                }
                int v = fillingLinearLayoutManager.v();
                FillingLinearLayoutManager fillingLinearLayoutManager2 = this.j;
                int x = (fillingLinearLayoutManager2 != null ? fillingLinearLayoutManager2 : null).x();
                if (v == -1 || x == -1) {
                    return;
                }
                O(new ytm.i(x));
                if (v < 0 || v > x || x > S().h.f.size()) {
                    return;
                }
                Iterator<T> it2 = S().h.f.subList(v, x).iterator();
                while (it2.hasNext()) {
                    this.q.onNext((hfz) it2.next());
                }
                return;
            }
        }
    }

    public final DialogsListAdapter S() {
        return (DialogsListAdapter) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void T() {
        ?? r0 = this.s;
        if (((jtm) r0.getValue()).g()) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int v = linearLayoutManager.v();
            int x = linearLayoutManager.x();
            if (v != -1 || x != -1) {
                ((jtm) r0.getValue()).d((j5g.b0(v, S().h.f) instanceof s990) || (j5g.b0(x, S().h.f) instanceof s990));
            } else {
                RecyclerView recyclerView2 = this.i;
                (recyclerView2 != null ? recyclerView2 : null).post(new z27(this, 2));
            }
        }
    }

    @Override // xsna.pvw, xsna.wls.a
    public final void a(InfoBar infoBar) {
        this.r.a.invoke(new ytm.n(infoBar.b));
    }

    @Override // xsna.pvw
    public final void d(InfoBar infoBar, InfoBar.Button button) {
        int i;
        gum gumVar = this.r.a;
        String str = infoBar.b;
        boolean z = button.h;
        switch (hvw.a.$EnumSwitchMapping$0[button.d.ordinal()]) {
            case 1:
            case 2:
                gumVar.invoke(new ytm.z(button.f));
                if (z) {
                    gumVar.invoke(new ytm.f(str));
                    return;
                }
                return;
            case 3:
                gumVar.invoke(new ytm.r(str, button.g, z));
                return;
            case 4:
                gumVar.invoke(ytm.u.b);
                gumVar.invoke(new ytm.f(str));
                return;
            case 5:
                gumVar.invoke(ytm.c0.b);
                return;
            case 6:
                gumVar.invoke(ytm.w.b);
                if (z) {
                    gumVar.invoke(new ytm.f(str));
                    return;
                }
                return;
            case 7:
                gumVar.invoke(ytm.m.b);
                gumVar.invoke(new ytm.f(str));
                return;
            case 8:
                gumVar.invoke(ytm.b.b);
                return;
            case 9:
                InfoBar.PopUp popUp = button.i;
                if (popUp == null) {
                    return;
                }
                int i2 = hvw.a.$EnumSwitchMapping$1[popUp.b.ordinal()];
                if (i2 == 1) {
                    i = R.drawable.vk_icon_illustration_exceeding_limit_120h;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.drawable.vk_icon_illustration_comments_120h;
                }
                gumVar.invoke(new ytm.y(new InfoModalBottomSheet.Params(i, popUp.c, popUp.d, popUp.e)));
                return;
            default:
                return;
        }
    }

    @Override // xsna.gm20.a
    public final void e() {
        O(ytm.c.b);
    }

    @Override // xsna.pvw, xsna.wls.a
    public final void f(InfoBar infoBar) {
        this.r.a.invoke(new ytm.q(infoBar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.Size, xsna.ikv0$d$a, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        int s;
        int s2;
        num numVar = (num) yn50Var;
        if (numVar instanceof num.g) {
            asm asmVar = this.m;
            if (asmVar != null) {
                asmVar.i(((num.g) yn50Var).a);
                return;
            }
            return;
        }
        if (numVar.equals(num.b.a)) {
            R();
            return;
        }
        if (numVar.equals(num.a.a)) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            O(new ytm.h(linearLayoutManager == null || (s2 = linearLayoutManager.s()) == -1 || s2 == 0));
            return;
        }
        if (numVar.equals(num.f.a)) {
            RecyclerView recyclerView2 = this.i;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            RecyclerView.o layoutManager2 = recyclerView2.getLayoutManager();
            LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager2 == null || (s = linearLayoutManager2.s()) == -1) {
                return;
            }
            if (s < 50) {
                linearLayoutManager2.smoothScrollToPosition(recyclerView2, null, 0);
                return;
            } else {
                linearLayoutManager2.scrollToPosition(50);
                linearLayoutManager2.smoothScrollToPosition(recyclerView2, null, 0);
                return;
            }
        }
        if (numVar.equals(num.e.a)) {
            RecyclerView recyclerView3 = this.i;
            this.o.b(hg1.i(this.h.b((recyclerView3 != null ? recyclerView3 : null).getContext()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new h6g(this, 10)));
            return;
        }
        if (numVar.equals(num.c.a)) {
            RecyclerView recyclerView4 = this.i;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            Context context = recyclerView4.getContext();
            tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_enable_private_message_notifications_snackbar_desc);
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) r4, 12);
            aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) r4, (ikv0.d.a) r4, 6);
            aVar.n();
            return;
        }
        if (numVar instanceof num.h) {
            InfoBar.Payload.GiftsBirthdays giftsBirthdays = (InfoBar.Payload.GiftsBirthdays) ((num.h) yn50Var).a.m;
            g2v.c().getClass();
            RecyclerView recyclerView5 = this.i;
            fnv0.a.c((recyclerView5 != null ? recyclerView5 : null).getContext(), giftsBirthdays);
            return;
        }
        if (!(numVar instanceof num.d)) {
            throw new NoWhenBranchMatchedException();
        }
        o0w b2 = g2v.c().b();
        RecyclerView recyclerView6 = this.i;
        b2.t((recyclerView6 != null ? recyclerView6 : 0).getContext(), ((num.d) yn50Var).a.b, null, "list_all", null);
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        R();
        List<pgm> list = ((oum) ao50Var).a;
        if (list == S().h.f) {
            list = null;
        }
        if (list != null) {
            ztm ztmVar = this.k;
            ztm ztmVar2 = ztmVar != null ? ztmVar : null;
            AtomicBoolean atomicBoolean = ztmVar2.e;
            if (!atomicBoolean.get()) {
                if (ztmVar2.b()) {
                    List<pgm> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((hfz) it.next()) instanceof zfm) {
                                ((jtm) ztmVar2.c.invoke()).a();
                                atomicBoolean.set(true);
                                break;
                            }
                        }
                    }
                } else {
                    ztmVar2.a();
                }
            }
            S().J0(list, new n6f(this, 12));
        }
    }

    @Override // xsna.gm20.a
    public final void m() {
        O(ytm.b.b);
    }

    @Override // xsna.jmm.a
    public final void n(jmm.a.C3126a c3126a) {
        Peer peer = c3126a.a;
        io.reactivex.rxjava3.core.q<MotionEvent> qVar = c3126a.b;
        O(new ytm.a0(peer, qVar));
        this.o.b(new io.reactivex.rxjava3.internal.operators.observable.a0(qVar, new bum(this, 0)).subscribe());
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        asm asmVar = this.m;
        if (asmVar != null) {
            asmVar.g();
        }
        this.m = null;
        j5e0 j5e0Var = this.n;
        if (j5e0Var != null) {
            ((bzb0) j5e0Var.b.getValue()).a();
        }
        this.n = null;
        this.o.e();
        koa0 koa0Var = this.p;
        if (koa0Var != null) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.removeItemDecoration(koa0Var);
            koa0.a aVar = koa0Var.j;
            if (aVar != null) {
                koa0Var.b.unregisterAdapterDataObserver(aVar);
            }
        }
        ztm ztmVar = this.k;
        (ztmVar != null ? ztmVar : null).a();
        super.onDestroyView();
    }

    @Override // xsna.no8.a
    public final void q() {
        O(ytm.a.b);
    }

    @Override // xsna.jmm.a
    public final void s(Peer peer) {
        O(new ytm.e(peer));
    }

    @Override // xsna.xur0.a
    public final void u(i5e0.a aVar) {
        O(new ytm.z(aVar.f));
        O(new ytm.j(aVar.a));
    }

    @Override // xsna.jmm.a
    public final void v(Peer peer) {
        O(new ytm.d(peer));
    }

    @Override // xsna.pvw
    public final void y(UserId userId) {
        this.r.a.invoke(new ytm.s(userId));
    }

    @Override // xsna.p7p.a
    public final void z() {
        throw null;
    }
}
