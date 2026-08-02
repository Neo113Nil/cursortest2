package xsna;

import android.content.Context;
import com.vk.api.generated.actionLinks.dto.ActionLinksSaveLinksTagDto;
import com.vk.cameraui.impl.a;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.actionlinks.CheckLinkResponse;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.BaseItem;
import com.vkontakte.android.actionlinks.SourceType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ShowCollectionPresenter.kt */
/* loaded from: classes7.dex */
public final class uhj0 implements cc6, dm0 {
    public izs<? super ActionLinks, s3q0> b;
    public com.vk.movika.sdk.base.observable.k c;
    public boolean d;
    public boolean f;
    public boolean g;
    public boolean h;
    public io.reactivex.rxjava3.disposables.c i;
    public a.j j;
    public xhj0 k;
    public ActionLinks l;
    public String n;
    public ActionLink o;
    public ActionLink p;
    public b r;
    public io.reactivex.rxjava3.disposables.c s;
    public ActionLink t;
    public final com.vkontakte.android.actionlinks.c w;
    public final c x;
    public UserId e = UserId.d;
    public boolean m = true;
    public final io.reactivex.rxjava3.disposables.b q = new io.reactivex.rxjava3.disposables.b();
    public final HashSet u = new HashSet();
    public final svx v = new svx();

    /* compiled from: ShowCollectionPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((uhj0) this.receiver).g0();
            return s3q0.a;
        }
    }

    /* compiled from: ShowCollectionPresenter.kt */
    public final class b extends io.reactivex.rxjava3.observers.a<CheckLinkResponse> {
        public final /* synthetic */ RecyclerPaginatedView d;

        public b(RecyclerPaginatedView recyclerPaginatedView) {
            this.d = recyclerPaginatedView;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            RecyclerPaginatedView recyclerPaginatedView = this.d;
            uhj0 uhj0Var = uhj0.this;
            uhj0Var.d0(recyclerPaginatedView);
            uhj0Var.r = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            RecyclerPaginatedView recyclerPaginatedView = this.d;
            uhj0 uhj0Var = uhj0.this;
            uhj0Var.d0(recyclerPaginatedView);
            uhj0Var.r = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            uhj0.this.o = ((CheckLinkResponse) obj).d;
        }
    }

    /* compiled from: ShowCollectionPresenter.kt */
    public static final class c implements c.l<ActionLinks> {
        public c() {
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<ActionLinks> hj(com.vk.lists.c cVar, boolean z) {
            UserId userId = uhj0.this.e;
            long j = fkq0.b(userId) ? -userId.b : 0L;
            z20 z20Var = new z20("actionLinks.getByTag", 0);
            z20Var.K("tag", "live");
            if (j != 0) {
                z20Var.D(j, "group_id");
            }
            return rsg0.y0(z20Var, null, null, 3);
        }

        @Override // com.vk.lists.c.l
        public final io.reactivex.rxjava3.core.q<ActionLinks> ui(int i, com.vk.lists.c cVar) {
            UserId userId = uhj0.this.e;
            long j = fkq0.b(userId) ? -userId.b : 0L;
            z20 z20Var = new z20("actionLinks.getByTag", 0);
            z20Var.K("tag", "live");
            if (j != 0) {
                z20Var.D(j, "group_id");
            }
            return rsg0.y0(z20Var, null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<ActionLinks> qVar, boolean z, com.vk.lists.c cVar) {
            cVar.l(Integer.MIN_VALUE);
            uhj0 uhj0Var = uhj0.this;
            io.reactivex.rxjava3.disposables.c cVar2 = uhj0Var.i;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            uhj0Var.i = qVar.subscribe(new ca10(new b8j0(uhj0Var, 1), 20));
        }
    }

    public uhj0() {
        com.vkontakte.android.actionlinks.c cVar = new com.vkontakte.android.actionlinks.c(BaseItem.Type.ADD);
        cVar.e = R.string.collection_add_object;
        cVar.f = false;
        cVar.b = new a(0, this, uhj0.class, "showAddSelection", "showAddSelection()V", 0);
        this.w = cVar;
        this.x = new c();
    }

    public final void Z(ActionLink actionLink) {
        com.vkontakte.android.actionlinks.a aVar = new com.vkontakte.android.actionlinks.a(actionLink, 6);
        aVar.c = new j3(24, this, aVar);
        aVar.b = new xk(28, this, aVar);
        aVar.f = !this.d;
        aVar.d = this.m;
        svx svxVar = this.v;
        svxVar.z0(((ListDataSet) svxVar.c).v(this.w) + 1, aVar);
    }

    @Override // xsna.dm0
    public final void b(ActionLink actionLink) {
        String str = actionLink.c;
        String str2 = actionLink.d;
        String str3 = actionLink.e;
        UserId userId = this.e;
        long j = fkq0.b(userId) ? -userId.b : 0L;
        a30 a30Var = new a30("actionLinks.save");
        a30Var.K("tag", "live");
        if (j != 0) {
            a30Var.D(j, "group_id");
        }
        if (str3 != null) {
            a30Var.K("url", str3);
        }
        if (str != null) {
            a30Var.K("object_type", str);
        }
        if (str2 != null) {
            a30Var.K("object_id", str2);
        }
        io.reactivex.rxjava3.core.q<R> L = rsg0.y0(a30Var, null, null, 3).L(new r2v(new n7b0(this, 7), 15), false);
        xhj0 xhj0Var = this.k;
        io.reactivex.rxjava3.core.q m = hg1.m(L, (xhj0Var != null ? xhj0Var : null).b, 0L, false, 62);
        vhj0 vhj0Var = new vhj0(this);
        m.subscribe(vhj0Var);
        this.s = vhj0Var;
    }

    public final void d0(RecyclerPaginatedView recyclerPaginatedView) {
        recyclerPaginatedView.setAdapter(this.v);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.f0();
        c.h hVar = new c.h(this.x);
        hVar.i = 10;
        hVar.q = true;
        com.vk.lists.f.a(hVar, recyclerPaginatedView);
    }

    public final void e0(BaseItem baseItem) {
        if (baseItem instanceof com.vkontakte.android.actionlinks.a) {
            com.vkontakte.android.actionlinks.a aVar = (com.vkontakte.android.actionlinks.a) baseItem;
            ActionLink actionLink = aVar.e;
            int i = actionLink.b;
            int i2 = actionLink.b;
            Integer valueOf = Integer.valueOf(i);
            HashSet hashSet = this.u;
            if (hashSet.contains(valueOf)) {
                return;
            }
            hashSet.add(Integer.valueOf(i2));
            UserId userId = this.e;
            long j = fkq0.b(userId) ? -userId.b : 0L;
            x20 x20Var = new x20("actionLinks.delete");
            x20Var.K("tag", "live");
            x20Var.C(i2, "link_id");
            if (j != 0) {
                x20Var.D(j, "group_id");
            }
            io.reactivex.rxjava3.core.q<R> L = rsg0.y0(x20Var, null, null, 3).L(new cxd0(new qt5(27, this, aVar), 5), false);
            xhj0 xhj0Var = this.k;
            io.reactivex.rxjava3.core.q m = hg1.m(L, (xhj0Var != null ? xhj0Var : null).b, 0L, false, 62);
            whj0 whj0Var = new whj0(this);
            m.subscribe(whj0Var);
            this.q.b(whj0Var);
        }
    }

    public final void f0(ActionLink actionLink) {
        svx svxVar = this.v;
        Iterator it = ((ArrayList) svxVar.y0()).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            BaseItem baseItem = (BaseItem) next;
            if (baseItem instanceof com.vkontakte.android.actionlinks.a) {
                com.vkontakte.android.actionlinks.a aVar = (com.vkontakte.android.actionlinks.a) baseItem;
                aVar.g = false;
                if (epx.f(aVar.e.e, actionLink.e)) {
                    aVar.g = true;
                    this.t = aVar.e;
                    svxVar.notifyItemChanged(i);
                }
            }
            i = i2;
        }
    }

    @Override // xsna.dm0
    public final void g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        UserId userId = this.e;
        ActionLinksSaveLinksTagDto actionLinksSaveLinksTagDto = ActionLinksSaveLinksTagDto.LIVE;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Good good = (Good) it.next();
            x9y x9yVar = new x9y();
            x9yVar.o("url", good.k0);
            x9yVar.o("object_type", "product");
            x9yVar.o("object_id", good.Ab().toString());
            arrayList2.add(x9yVar);
        }
        UserId e = fkq0.b(userId) ? fkq0.e(userId) : UserId.d;
        tfx tfxVar = new tfx("actionLinks.saveLinks", new l4(2), new nq(1));
        tfx.o(tfxVar, "tag", actionLinksSaveLinksTagDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "actions", GsonHolder.a().toJson(arrayList2), 0, 0, 12);
        if (e != null) {
            tfx.n(tfxVar, "group_id", e, 0L, 0L, 8);
            tfxVar = tfxVar;
        }
        io.reactivex.rxjava3.core.q<R> L = rsg0.l0(yfb.x(tfxVar), null, 3).U(new v20(new qt(2), 0)).a0(asu0.a.d()).L(new or20(new qz40(this, 24), 13), false);
        zm80 zm80Var = new zm80(this, 1);
        L.getClass();
        io.reactivex.rxjava3.internal.operators.observable.a0 a0Var = new io.reactivex.rxjava3.internal.operators.observable.a0(L, zm80Var);
        xhj0 xhj0Var = this.k;
        this.s = hg1.m(a0Var, (xhj0Var != null ? xhj0Var : null).b, 0L, false, 62).subscribe(new tts(new vlc0(this, 11), 26), new l8w(new fda0(this, 8), 21));
    }

    public final void g0() {
        int i;
        xhj0 xhj0Var = this.k;
        if (xhj0Var == null) {
            xhj0Var = null;
        }
        Context context = xhj0Var.b;
        if (context == null) {
            return;
        }
        UserId userId = this.e;
        SourceType sourceType = SourceType.Live;
        ActionLinks actionLinks = this.l;
        if (actionLinks != null) {
            int i2 = actionLinks.b;
            ArrayList arrayList = actionLinks.d;
            i = i2 - (arrayList != null ? arrayList.size() : 0);
        } else {
            i = 10;
        }
        qbi0.a(context, this, userId, sourceType, null, new sbi0(i), 16);
    }

    public final void h0() {
        svx svxVar = this.v;
        Iterator it = ((ArrayList) svxVar.y0()).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            BaseItem baseItem = (BaseItem) next;
            if (baseItem instanceof com.vkontakte.android.actionlinks.a) {
                com.vkontakte.android.actionlinks.a aVar = (com.vkontakte.android.actionlinks.a) baseItem;
                if (aVar.g) {
                    aVar.g = false;
                    svxVar.notifyItemChanged(i);
                }
            }
            i = i2;
        }
        this.t = null;
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

    public final void x(ActionLink actionLink) {
        if (this.d) {
            h0();
            f0(actionLink);
            if (this.d) {
                xhj0 xhj0Var = this.k;
                (xhj0Var != null ? xhj0Var : null).b(this.t != null);
                return;
            }
            return;
        }
        if (this.g) {
            xhj0 xhj0Var2 = this.k;
            (xhj0Var2 != null ? xhj0Var2 : null).dismiss();
        }
        com.vk.movika.sdk.base.observable.k kVar = this.c;
        if (kVar != null) {
            kVar.invoke(actionLink);
        }
    }

    public final void z(ActionLinks actionLinks) {
        izs<? super ActionLinks, s3q0> izsVar = this.b;
        if (izsVar != null) {
            izsVar.invoke(actionLinks);
        }
        int i = actionLinks.c;
        int i2 = actionLinks.b;
        boolean z = i >= i2;
        com.vkontakte.android.actionlinks.c cVar = this.w;
        cVar.f = z;
        cVar.b = new thj0(z, this, i2);
        svx svxVar = this.v;
        svxVar.notifyItemChanged(((ListDataSet) svxVar.c).v(cVar));
    }
}
