package xsna;

import com.vk.clips.design.view.actionlinks.holders.tip.ItemTipView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinksResponse;
import com.vk.dto.common.id.UserId;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.log.L;
import com.vkontakte.android.actionlinks.BaseItem;
import com.vkontakte.android.actionlinks.views.fragments.wall.AddWall$Type;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AddWallPresenter.kt */
/* loaded from: classes7.dex */
public final class rp0 implements cc6 {
    public boolean b;
    public boolean c;
    public Integer d;
    public Integer e;
    public Integer f;
    public gkc0 g;
    public qp0 j;
    public dm0 k;
    public a.C3618a l;
    public AddWall$Type h = AddWall$Type.POST;
    public UserId i = UserId.d;
    public final fvx m = new fvx();
    public final svx n = new svx();
    public final a o = new a();

    public final void b(RecyclerPaginatedView recyclerPaginatedView) {
        recyclerPaginatedView.setAdapter(this.n);
        recyclerPaginatedView.setSwipeRefreshEnabled(true);
        c.h hVar = new c.h(this.o);
        hVar.i = 20;
        hVar.l = true;
        hVar.q = true;
        hVar.g = true;
        com.vk.lists.f.a(hVar, recyclerPaginatedView);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    /* compiled from: AddWallPresenter.kt */
    public static final class a implements c.m<ActionLinksResponse> {
        public a() {
        }

        @Override // com.vk.lists.c.m
        public final io.reactivex.rxjava3.core.q<ActionLinksResponse> O9(String str, com.vk.lists.c cVar) {
            rp0 rp0Var = rp0.this;
            UserId userId = rp0Var.i;
            String h = rp0Var.h.h();
            int k = cVar.k();
            long j = fkq0.b(userId) ? -userId.b : 0L;
            qns0 qns0Var = new qns0("actionLinks.getAvailableItems", 1);
            qns0Var.K("object_type", h);
            qns0Var.C(k, "count");
            if (str != null && str.length() != 0) {
                qns0Var.K("start_from", str);
            }
            if (j != 0) {
                qns0Var.D(j, "group_id");
            }
            return rsg0.y0(qns0Var, null, null, 3).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<ActionLinksResponse> hj(com.vk.lists.c cVar, boolean z) {
            rp0 rp0Var = rp0.this;
            C3618a c3618a = rp0Var.l;
            if (c3618a != null) {
                c3618a.dispose();
            }
            UserId userId = rp0Var.i;
            String h = rp0Var.h.h();
            int k = cVar.k();
            long j = fkq0.b(userId) ? -userId.b : 0L;
            qns0 qns0Var = new qns0("actionLinks.getAvailableItems", 1);
            qns0Var.K("object_type", h);
            qns0Var.C(k, "count");
            if (j != 0) {
                qns0Var.D(j, "group_id");
            }
            return rsg0.y0(qns0Var, null, null, 3).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<ActionLinksResponse> qVar, boolean z, com.vk.lists.c cVar) {
            rp0 rp0Var = rp0.this;
            C3618a c3618a = new C3618a(z, rp0Var, cVar);
            qVar.subscribe(c3618a);
            rp0Var.l = c3618a;
        }

        /* compiled from: AddWallPresenter.kt */
        /* renamed from: xsna.rp0$a$a, reason: collision with other inner class name */
        public static final class C3618a extends io.reactivex.rxjava3.observers.a<ActionLinksResponse> {
            public final /* synthetic */ boolean c;
            public final /* synthetic */ rp0 d;
            public final /* synthetic */ com.vk.lists.c e;

            public C3618a(boolean z, rp0 rp0Var, com.vk.lists.c cVar) {
                this.c = z;
                this.d = rp0Var;
                this.e = cVar;
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onError(Throwable th) {
                L.i(th);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onNext(Object obj) {
                ActionLinksResponse actionLinksResponse = (ActionLinksResponse) obj;
                boolean z = this.c;
                rp0 rp0Var = this.d;
                if (z) {
                    rp0Var.n.clear();
                }
                this.e.s(actionLinksResponse.j());
                ArrayList arrayList = new ArrayList();
                Iterator<ActionLink> it = actionLinksResponse.iterator();
                while (it.hasNext()) {
                    ActionLink next = it.next();
                    BaseItem bVar = epx.f(next.c, AddWall$Type.PRODUCT.h()) ? new com.vkontakte.android.actionlinks.b(next) : new com.vkontakte.android.actionlinks.a(next, 4);
                    bVar.b = new com.vk.movika.sdk.base.ui.r0(3, rp0Var, next);
                    arrayList.add(bVar);
                }
                if (!arrayList.isEmpty()) {
                    qp0 qp0Var = rp0Var.j;
                    (qp0Var != null ? qp0Var : null).Pd();
                    rp0Var.n.n0(arrayList);
                    return;
                }
                fvx fvxVar = rp0Var.m;
                if (rp0Var.c) {
                    qp0 qp0Var2 = rp0Var.j;
                    ItemTipView Ni = (qp0Var2 != null ? qp0Var2 : null).Ni();
                    Ni.setPresenter((ItemTipView) fvxVar);
                    fvxVar.b = Ni;
                    dvx.v6(rp0Var.m, rp0Var.e, rp0Var.d, rp0Var.f, rp0Var.g, 8);
                }
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onComplete() {
            }
        }
    }
}
