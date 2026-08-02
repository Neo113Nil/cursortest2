package xsna;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.products_selection.api.di.ProductsSelectionComponent;
import com.vk.ecomm.products_selection.api.model.ProductsSelectionContextContent;
import com.vk.ecomm.products_selection.api.model.ProductsSelectionRefSource;
import com.vk.libvideo.live.api.view.WriteContract$State;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import xsna.itd0;

/* compiled from: WritePresenter.java */
/* loaded from: classes3.dex */
public final class l2y0 implements e2y0, w8i {
    public v710 B;
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public m2y0 j;
    public io.reactivex.rxjava3.disposables.c k;
    public final VideoFile l;
    public UserProfile m;
    public final Group n;
    public final boolean o;
    public boolean p;
    public WriteContract$State t;
    public final f2y0 u;
    public xur v;
    public qpb w;
    public io.reactivex.rxjava3.disposables.c x;
    public di10 y;
    public liz z;
    public final anz b = fxc0.B().T();
    public final byp c = byp.b();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List<Good> q = new ArrayList();
    public final ntd0 r = ((ProductsSelectionComponent) j6i.b(m7m.f(this), ProductsSelectionComponent.class)).a();
    public final h7v s = ((BridgeComponent) j6i.b(m7m.f(this), BridgeComponent.class)).t().b();
    public long A = System.currentTimeMillis();

    /* compiled from: WritePresenter.java */
    public class a implements io.reactivex.rxjava3.functions.f<Long> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Long l) throws Throwable {
            t6g0 t6g0Var = t6g0.b;
            t6g0.d().h();
        }
    }

    /* compiled from: WritePresenter.java */
    public class b implements io.reactivex.rxjava3.functions.f<l4v> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(l4v l4vVar) throws Throwable {
            l2y0.this.u.setRedDot(false);
        }
    }

    /* compiled from: WritePresenter.java */
    public class c implements io.reactivex.rxjava3.functions.f<fjj0> {
        public c() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(fjj0 fjj0Var) throws Throwable {
            l2y0.this.u.setRedDot(true);
        }
    }

    /* compiled from: WritePresenter.java */
    public class d implements io.reactivex.rxjava3.functions.f<lij0> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(lij0 lij0Var) throws Throwable {
            lij0Var.getClass();
            throw null;
        }
    }

    /* compiled from: WritePresenter.java */
    public class e implements io.reactivex.rxjava3.functions.f<x3v> {
        public e() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(x3v x3vVar) throws Throwable {
            l2y0 l2y0Var = l2y0.this;
            l2y0Var.u.g1();
            l2y0Var.u.d0();
        }
    }

    /* compiled from: WritePresenter.java */
    public class f extends io.reactivex.rxjava3.observers.a<Boolean> {
        public f() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            l2y0.this.d.remove(this);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            l2y0.this.d.remove(this);
            L.i(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: WritePresenter.java */
    public class g extends io.reactivex.rxjava3.observers.a<Boolean> {
        public g() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            l2y0.this.d.remove(this);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            l2y0.this.d.remove(this);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: WritePresenter.java */
    public class h extends io.reactivex.rxjava3.observers.a<Integer> {
        public final /* synthetic */ LiveEventModel c;

        public h(LiveEventModel liveEventModel) {
            this.c = liveEventModel;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            l2y0.this.d.remove(this);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            cvk.u(R.string.live_comments_error, false);
            l2y0 l2y0Var = l2y0.this;
            qpb qpbVar = l2y0Var.w;
            if (qpbVar != null) {
                qpbVar.r0(this.c);
            }
            l2y0Var.d.remove(this);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            Integer num = (Integer) obj;
            l2y0 l2y0Var = l2y0.this;
            if (l2y0Var.l.C5()) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g("comment_in_sport_broadcast");
                aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
                bVar.k(aVar.e());
            }
            int intValue = num.intValue();
            LiveEventModel liveEventModel = this.c;
            liveEventModel.m = intValue;
            wjs0.a(new hyr0(liveEventModel));
            qpb qpbVar = l2y0Var.w;
            if (qpbVar instanceof com.vk.libvideo.live.impl.views.chat.a) {
                com.vk.libvideo.live.impl.views.chat.a aVar2 = (com.vk.libvideo.live.impl.views.chat.a) qpbVar;
                if (aVar2.o) {
                    return;
                }
                aVar2.F1();
            }
        }
    }

    public l2y0(VideoFile videoFile, UserProfile userProfile, Group group, boolean z, f2y0 f2y0Var) {
        this.l = videoFile;
        this.m = userProfile;
        this.n = group;
        this.o = z;
        this.u = f2y0Var;
    }

    @Override // xsna.e2y0
    public final void A(int i, final String str) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new cqt(i), null, null, 3);
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.k2y0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                dqt dqtVar = (dqt) obj;
                l2y0 l2y0Var = l2y0.this;
                l2y0Var.u.u2(dqtVar.b, dqtVar.a, str, Collections.singletonList(l2y0Var.l.I0()));
            }
        };
        int i2 = kwg0.a;
        this.i = y0.subscribe(fVar, new hwg0());
    }

    @Override // xsna.e2y0
    public final void A1() {
        this.x = io.reactivex.rxjava3.core.q.B0(1000L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new a());
    }

    @Override // xsna.e2y0
    public final void B() {
        liz lizVar = this.z;
        if (lizVar != null) {
            lizVar.B();
        }
    }

    @Override // xsna.e2y0
    public final void D0(String str) {
        String str2;
        LiveEventModel liveEventModel;
        Group group;
        if (this.p) {
            UserProfile b2 = o25.a().o().b();
            this.m = b2;
            this.w.u1(b2);
        }
        boolean z = false;
        if (System.currentTimeMillis() - this.A < 1000) {
            cvk.u(R.string.live_comments_too_fast, false);
            return;
        }
        this.A = System.currentTimeMillis();
        boolean z2 = this.o;
        VideoFile videoFile = this.l;
        if (!z2 || (group = this.n) == null) {
            str2 = str;
            liveEventModel = new LiveEventModel(str2, 0, this.m, null, videoFile.o0(), videoFile.I0(), System.currentTimeMillis());
        } else {
            liveEventModel = new LiveEventModel(str, 0, null, group, videoFile.o0(), videoFile.I0(), System.currentTimeMillis());
            str2 = str;
        }
        qpb qpbVar = this.w;
        if (qpbVar != null) {
            qpbVar.I0(liveEventModel, true);
            this.u.P0();
        }
        if (this.o && this.n != null) {
            z = true;
        }
        io.reactivex.rxjava3.core.q s = this.b.s(videoFile, str2, z);
        h hVar = new h(liveEventModel);
        s.subscribe(hVar);
        this.d.add(hVar);
    }

    @Override // xsna.e2y0
    public final boolean T() {
        return this.l.aa();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.e2y0
    public final void Z0() {
        if (this.q.isEmpty()) {
            return;
        }
        v710 v710Var = this.B;
        VideoFile videoFile = this.l;
        if (v710Var != null) {
            List list = (List) this.q.stream().map(new oh8(0)).collect(Collectors.toList());
            ((lt00) this.B.c.getValue()).a(new zz00(videoFile.o0(), videoFile.I0().b, list));
        }
        List list2 = (List) this.q.stream().map(new fqk(1)).collect(Collectors.toList());
        this.r.a(this.u.getViewContext(), list2, true, new itd0(ProductsSelectionRefSource.LivesAttachedItems, new itd0.a(ProductsSelectionContextContent.Live, videoFile.o0(), videoFile.I0().b)));
    }

    @Override // xsna.e2y0
    public final UserId c0() {
        VideoFile videoFile = this.l;
        if (fkq0.d(videoFile.I0())) {
            return videoFile.I0();
        }
        return null;
    }

    public final void d() {
        t();
        b bVar = new b();
        byp bypVar = this.c;
        this.g = bypVar.a(l4v.class, bVar);
        this.h = bypVar.a(fjj0.class, new c());
        this.e = bypVar.a(lij0.class, new d());
        this.f = bypVar.a(x3v.class, new e());
        io.reactivex.rxjava3.internal.operators.observable.j1 b0 = wjs0.b.b0(hyr0.class);
        m2y0 m2y0Var = new m2y0(this);
        b0.subscribe(m2y0Var);
        this.j = m2y0Var;
    }

    @Override // xsna.e2y0
    public final WriteContract$State getState() {
        return this.t;
    }

    @Override // xsna.e2y0
    public final String getTitle() {
        return this.l.getTitle();
    }

    @Override // xsna.e2y0
    public final void i1(StickerItem stickerItem) {
        StickerItem stickerItem2;
        xur xurVar = this.v;
        if (xurVar != null) {
            stickerItem2 = stickerItem;
            xurVar.W(this.m.c, stickerItem2, System.currentTimeMillis(), true);
        } else {
            stickerItem2 = stickerItem;
        }
        VideoFile videoFile = this.l;
        io.reactivex.rxjava3.core.q<Boolean> L = this.b.L(videoFile.o0(), videoFile.I0(), stickerItem2.b);
        g gVar = new g();
        L.subscribe(gVar);
        this.d.add(gVar);
    }

    @Override // xsna.e2y0
    public final boolean isStreaming() {
        return this.o;
    }

    @Override // xsna.e2y0
    public final boolean l2() {
        return (!this.q.isEmpty() || Boolean.TRUE.equals(this.l.g4())) && !this.o;
    }

    @Override // xsna.e2y0
    public final void o2() {
        this.s.b(HintId.INFO_LIVESHOPPING_VIEWER.getId());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.e2y0
    public final void p1(ArrayList arrayList) {
        Hint p;
        String str;
        if (this.o) {
            return;
        }
        this.q = arrayList;
        if (this.B != null) {
            List<String> list = (List) arrayList.stream().map(new oh8(0)).collect(Collectors.toList());
            v710 v710Var = this.B;
            VideoFile videoFile = this.l;
            int o0 = videoFile.o0();
            UserId I0 = videoFile.I0();
            if (!list.equals(v710Var.b)) {
                v710Var.b = list;
                ((lt00) v710Var.c.getValue()).g(new zz00(o0, I0.b, list));
            }
        }
        int size = this.q.size();
        f2y0 f2y0Var = this.u;
        f2y0Var.setMarketItemsBadge(size);
        int size2 = this.q.size();
        if (fxc0.B().J().O1() && size2 > 0) {
            HintId hintId = HintId.INFO_LIVESHOPPING_VIEWER;
            h7v h7vVar = this.s;
            if (!h7vVar.m(hintId) || (p = h7vVar.p(hintId.getId())) == null || (str = p.d) == null) {
                return;
            }
            f2y0Var.k0(str);
        }
    }

    @Override // xsna.pk6
    public final void pause() {
        t();
    }

    @Override // xsna.e2y0
    public final void r() {
        di10 di10Var = this.y;
        if (di10Var != null) {
            boolean s = di10Var.s();
            f2y0 f2y0Var = this.u;
            if (s) {
                f2y0Var.setMaskButtonState(false);
                this.y.A();
            } else {
                f2y0Var.setMaskButtonState(true);
                this.y.z();
            }
        }
    }

    @Override // xsna.pk6
    public final void release() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.c) it.next()).dispose();
        }
        copyOnWriteArrayList.clear();
        io.reactivex.rxjava3.disposables.c cVar = this.x;
        if (cVar != null) {
            cVar.dispose();
            this.x = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.dispose();
            this.g = null;
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.h;
        if (cVar3 != null) {
            cVar3.dispose();
            this.h = null;
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.e;
        if (cVar4 != null) {
            cVar4.dispose();
            this.e = null;
        }
        io.reactivex.rxjava3.disposables.c cVar5 = this.f;
        if (cVar5 != null) {
            cVar5.dispose();
            this.f = null;
        }
        io.reactivex.rxjava3.disposables.c cVar6 = this.i;
        if (cVar6 != null) {
            cVar6.dispose();
            this.i = null;
        }
        m2y0 m2y0Var = this.j;
        if (m2y0Var != null) {
            m2y0Var.dispose();
            this.j = null;
        }
        io.reactivex.rxjava3.disposables.c cVar7 = this.k;
        if (cVar7 != null) {
            cVar7.dispose();
            this.k = null;
        }
    }

    @Override // xsna.pk6
    public final void resume() {
        d();
    }

    @Override // xsna.pk6
    public final void start() {
        d();
        boolean z = this.p;
        VideoFile videoFile = this.l;
        boolean z2 = this.o;
        f2y0 f2y0Var = this.u;
        if (z) {
            this.t = WriteContract$State.CLIPS;
        } else if (z2) {
            this.t = WriteContract$State.STREAMING;
        } else {
            if (videoFile.c0()) {
                this.t = WriteContract$State.FULL;
            } else {
                this.t = WriteContract$State.NO_COMMENTS;
            }
            if (this.b.W()) {
                f2y0Var.setRedDot(true);
            }
        }
        f2y0Var.setState(this.t);
        if (Boolean.TRUE.equals(videoFile.g4()) && !z2) {
            UserId I0 = videoFile.I0();
            int o0 = videoFile.o0();
            tfx tfxVar = new tfx("market.getItemsByVideo", new com.vk.movika.sdk.base.model.n(18), new eq(20));
            tfx.n(tfxVar, "owner_id", I0, 0L, 0L, 12);
            tfx.l(tfxVar, "video_id", o0, 0, 0, 12);
            this.k = rsg0.D0(yfb.x(tfxVar)).subscribe(new vks0(this, 6), new rao());
        }
        f2y0Var.Z2();
    }

    public final void t() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
            this.g = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.h;
        if (cVar2 != null) {
            cVar2.dispose();
            this.h = null;
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.e;
        if (cVar3 != null) {
            cVar3.dispose();
            this.e = null;
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.f;
        if (cVar4 != null) {
            cVar4.dispose();
            this.f = null;
        }
        m2y0 m2y0Var = this.j;
        if (m2y0Var != null) {
            m2y0Var.dispose();
            this.j = null;
        }
    }

    @Override // xsna.e2y0
    public final void w0() {
        xur xurVar = this.v;
        if (xurVar != null) {
            xurVar.Q(System.currentTimeMillis(), this.m.c, true);
        }
        VideoFile videoFile = this.l;
        io.reactivex.rxjava3.core.q<Boolean> J = this.b.J(videoFile.o0(), videoFile.I0());
        f fVar = new f();
        J.subscribe(fVar);
        this.d.add(fVar);
    }
}
