package xsna;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.live.LiveSpectators;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.libvideo.live.api.base.RecorderStatus;
import com.vk.libvideo.live.api.view.BroadcastContract$State;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.log.L;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/* compiled from: BroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class qh8 implements ne8, w8i {
    public b A;
    public a B;
    public io.reactivex.rxjava3.disposables.c C;
    public io.reactivex.rxjava3.disposables.c D;
    public zjk0 E;
    public l2y0 F;
    public h30 G;
    public com.vk.libvideo.live.impl.views.chat.a H;
    public bk8 I;
    public sxj J;
    public com.vk.libvideo.live.impl.views.stat.a K;
    public fb L;
    public bf8 M;
    public ActionLinks Q;
    public int T;
    public boolean V;
    public boolean X;
    public boolean Y;
    public BroadcastContract$State Z;
    public BroadcastContract$State a0;
    public oe8 b;
    public final e1q b0;
    public th8 c0;
    public boolean d0;
    public int e0;
    public final o2i f;
    public ArrayList f0;
    public final pe8 g;
    public final LiveStatNew g0;
    public liz h;
    public List<String> h0;
    public di10 i;
    public final i000 i0;
    public UserProfile j;
    public final lt00 j0;
    public Group k;
    public rit0 k0;
    public Integer l;
    public VideoFile m;
    public VideoOwner n;
    public String o;
    public String p;
    public String r;
    public Long s;
    public Location t;
    public uh8 u;
    public wh8 v;
    public rh8 w;
    public sh8 x;
    public io.reactivex.rxjava3.disposables.c y;
    public e z;
    public final anz c = fxc0.B().T();
    public final ymz d = ymz.c();
    public final wjz e = wjz.a();
    public UserId q = UserId.d;
    public xur N = null;
    public yjp O = null;
    public kl70 P = null;
    public boolean R = true;
    public boolean S = true;
    public int U = -1;
    public final boolean W = true;

    /* compiled from: BroadcastPresenter.java */
    public class a extends io.reactivex.rxjava3.observers.a<LiveEventModel> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            qh8 qh8Var = qh8.this;
            qh8Var.i0.a("onComplete");
            qh8Var.B = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            qh8 qh8Var = qh8.this;
            qh8Var.i0.a("onError: ", th);
            L.i(th);
            qh8Var.B = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            LiveEventModel liveEventModel = (LiveEventModel) obj;
            qh8 qh8Var = qh8.this;
            pe8 pe8Var = qh8Var.g;
            e1q e1qVar = qh8Var.b0;
            i000 i000Var = qh8Var.i0;
            if (pe8Var != null && liveEventModel != null && e1qVar != null) {
                StringBuilder sb = new StringBuilder("onNext: ");
                i000Var.getClass();
                sb.append(i000.b(liveEventModel));
                i000Var.a(sb.toString());
                e1qVar.b(liveEventModel);
                return;
            }
            StringBuilder sb2 = new StringBuilder("onNext: (check = ");
            sb2.append(qh8Var.g != null);
            sb2.append(" && ");
            sb2.append(liveEventModel != null);
            sb2.append(" && ");
            sb2.append(e1qVar != null);
            sb2.append(") ");
            i000Var.getClass();
            sb2.append(i000.b(liveEventModel));
            i000Var.a(sb2.toString());
        }
    }

    /* compiled from: BroadcastPresenter.java */
    public class b extends io.reactivex.rxjava3.observers.a<Long> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            qh8.this.A = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            qh8.this.A = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            qh8 qh8Var = qh8.this;
            liz lizVar = qh8Var.h;
            if (lizVar != null) {
                lizVar.H();
                LiveStatNew liveStatNew = qh8Var.g0;
                liveStatNew.getClass();
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_EVENT, "heartbeat");
                liveStatNew.b(bundle);
                qyk0.a().e("live_action", bundle);
            }
        }
    }

    /* compiled from: BroadcastPresenter.java */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RecorderStatus.values().length];
            b = iArr;
            try {
                iArr[RecorderStatus.RECORDER_INFO_STREAMING_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[RecorderStatus.RECORDER_INFO_STREAMING_DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BroadcastContract$State.values().length];
            a = iArr2;
            try {
                iArr2[BroadcastContract$State.LIVE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[BroadcastContract$State.UPCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[BroadcastContract$State.PREPARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[BroadcastContract$State.LIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[BroadcastContract$State.END_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[BroadcastContract$State.MODEL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: BroadcastPresenter.java */
    public class d implements io.reactivex.rxjava3.functions.f<Long> {
        public d() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Long l) throws Throwable {
            qh8 qh8Var = qh8.this;
            sit0 sit0Var = new sit0(qh8Var.m.Y6(), qh8Var.m.d7(), qh8Var.m.f2(), qh8Var.m.C3());
            liz lizVar = qh8Var.h;
            rit0 rit0Var = qh8Var.k0;
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_PUBLISHER_STATS;
            videoFeatures.getClass();
            lizVar.C(sit0Var, rit0Var, com.vk.toggle.b.A.a(videoFeatures));
        }
    }

    public qh8(pe8 pe8Var, String str, o2i o2iVar) {
        BroadcastContract$State broadcastContract$State = BroadcastContract$State.NOT_INITED;
        this.Z = broadcastContract$State;
        this.a0 = broadcastContract$State;
        LiveStatNew liveStatNew = new LiveStatNew();
        this.g0 = liveStatNew;
        this.h0 = new ArrayList();
        this.i0 = new i000();
        this.j0 = ((MarketComponent) j6i.b(m7m.f(this), MarketComponent.class)).l7();
        this.g = pe8Var;
        e1q e1qVar = new e1q();
        ymz.c();
        e1qVar.a = new ArrayList();
        this.b0 = e1qVar;
        liveStatNew.d = str;
        this.f = o2iVar;
    }

    @Override // xsna.ne8
    public final void D(String str, UserId userId, String str2, Integer num, Long l, Location location, boolean z, List list, fb fbVar) {
        this.h0 = list;
        this.L = fbVar;
        this.p = str;
        this.q = userId;
        this.r = str2;
        this.l = num;
        this.s = l;
        this.t = location;
        this.d0 = z;
        this.j = o25.a().o().b();
        if (l != null) {
            long longValue = l.longValue();
            xuo0.a.getClass();
            if (longValue > xuo0.a()) {
                Q(BroadcastContract$State.UPCOMING);
                d();
                return;
            }
        }
        Q(BroadcastContract$State.PREPARE);
        d();
    }

    @Override // xsna.ne8
    public final void I(List<Good> list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        List list2 = (List) list.stream().filter(new nh8(i)).map(new oh8(i)).collect(Collectors.toList());
        VideoOwner videoOwner = this.n;
        this.j0.b(new zz00(videoOwner.d, videoOwner.e.b, list2));
        VideoOwner videoOwner2 = this.n;
        UserId userId = videoOwner2.e;
        int i2 = videoOwner2.d;
        tfx tfxVar = new tfx("market.setItemsByVideo", new hq(21), new iq(17));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i2, 0, 0, 12);
        tfxVar.i("item_ids", list2);
        this.C = rsg0.Z(yfb.x(tfxVar)).subscribe(new ph8(this, 0), new jv(this, 8));
    }

    @Override // xsna.ne8
    public final boolean L0() {
        di10 di10Var = this.i;
        if (di10Var == null || !di10Var.s()) {
            return false;
        }
        this.i.A();
        return true;
    }

    @Override // xsna.ne8
    public final void M0(di10 di10Var) {
        this.i = di10Var;
    }

    public final void Q(BroadcastContract$State broadcastContract$State) {
        this.Z = broadcastContract$State;
        oe8 oe8Var = this.b;
        if (oe8Var != null) {
            oe8Var.E(broadcastContract$State);
        }
    }

    @Override // xsna.ne8
    public final void T0() {
        this.g.z();
    }

    @Override // xsna.ne8
    public final void V1(liz lizVar) {
        this.h = lizVar;
    }

    public final void W(long j) {
        io.reactivex.rxjava3.disposables.c cVar = this.y;
        if (cVar != null) {
            cVar.dispose();
            this.y = null;
        }
        if (this.h != null) {
            this.y = io.reactivex.rxjava3.core.q.B0(j, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new d());
        }
    }

    @Override // xsna.ne8
    public final void W1(RecorderStatus recorderStatus) {
        int i = c.b[recorderStatus.ordinal()];
        LiveStatNew liveStatNew = this.g0;
        if (i == 1) {
            this.X = false;
            this.g.r();
            this.h.H();
            liveStatNew.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED);
            liveStatNew.b(bundle);
            qyk0.a().e("live_action", bundle);
            return;
        }
        if (i != 2 || this.V || this.Y) {
            return;
        }
        this.X = true;
        w2();
        b bVar = this.A;
        if (bVar != null) {
            bVar.dispose();
        }
        x2();
        liz lizVar = this.h;
        if (lizVar != null) {
            lizVar.D(false);
        }
        this.h.H();
        liveStatNew.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString(NotificationCompat.CATEGORY_EVENT, "disconnected");
        liveStatNew.b(bundle2);
        qyk0.a().e("live_action", bundle2);
        Q(BroadcastContract$State.LIVE_ERROR);
        d();
    }

    public final void a2() {
        if (this.z == null) {
            VideoOwner videoOwner = this.n;
            UserId userId = videoOwner.e;
            io.reactivex.rxjava3.core.q m = this.c.m(videoOwner.d, userId);
            e eVar = new e();
            m.subscribe(eVar);
            this.z = eVar;
        }
    }

    @Override // xsna.ne8
    public final void b0(String str) {
        this.o = str;
    }

    @Override // xsna.ne8
    public final void b1() {
        this.g.A();
    }

    @Override // xsna.ne8
    public final void close() {
        this.V = true;
        x2();
        w2();
        b bVar = this.A;
        if (bVar != null) {
            bVar.dispose();
        }
        liz lizVar = this.h;
        if (lizVar != null) {
            lizVar.D(true);
        }
        if (this.Z != BroadcastContract$State.LIVE) {
            liz lizVar2 = this.h;
            if (lizVar2 != null) {
                lizVar2.F();
                return;
            }
            return;
        }
        wh8 wh8Var = this.v;
        if (wh8Var != null) {
            wh8Var.dispose();
            this.v = null;
        }
        j2r0 j2r0Var = new j2r0();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.c.r(this.m.o0(), this.m.I0()).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        wh8 wh8Var2 = new wh8(this, j2r0Var);
        a0.subscribe(wh8Var2);
        this.v = wh8Var2;
    }

    public final void d() {
        il70 f4;
        int i = c.a[this.Z.ordinal()];
        pe8 pe8Var = this.g;
        switch (i) {
            case 1:
                BroadcastContract$State broadcastContract$State = this.a0;
                BroadcastContract$State broadcastContract$State2 = BroadcastContract$State.LIVE_ERROR;
                if (broadcastContract$State != broadcastContract$State2) {
                    if (broadcastContract$State != BroadcastContract$State.NOT_INITED) {
                        t();
                    }
                    pe8Var.q2();
                    pe8Var.B2(false);
                    di10 di10Var = this.i;
                    if (di10Var != null) {
                        di10Var.A();
                    }
                    this.a0 = broadcastContract$State2;
                    af8 j1 = pe8Var.j1();
                    bf8 bf8Var = new bf8();
                    this.M = bf8Var;
                    bf8Var.b = this;
                    j1.setPresenter(bf8Var);
                    this.M.getClass();
                    break;
                }
                break;
            case 2:
                BroadcastContract$State broadcastContract$State3 = this.a0;
                BroadcastContract$State broadcastContract$State4 = BroadcastContract$State.UPCOMING;
                if (broadcastContract$State3 != broadcastContract$State4) {
                    if (broadcastContract$State3 != BroadcastContract$State.NOT_INITED) {
                        t();
                    }
                    pe8Var.y2();
                    pe8Var.q2();
                    pe8Var.B2(false);
                    this.a0 = broadcastContract$State4;
                    bk8 bk8Var = new bk8(this.s.longValue(), this.q, this.r, this.p);
                    this.I = bk8Var;
                    ak8 R0 = pe8Var.R0();
                    bk8Var.f = R0;
                    R0.setPresenter(bk8Var);
                    bk8 bk8Var2 = this.I;
                    bk8Var2.getClass();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.r2(io.reactivex.rxjava3.core.q.Q(0L, 1L, timeUnit, asu0.i()).U(new iw3(new com.vk.movika.sdk.base.observable.q(bk8Var2, 9), 1)), new yh1(new com.vk.movika.sdk.base.observable.s(7), 3)).a0(asu0Var.d());
                    x8 x8Var = new x8(new w8(bk8Var2, 15), 6);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    io.reactivex.rxjava3.internal.operators.observable.b0 E = a0.E(x8Var, lVar, kVar, kVar);
                    rh8 rh8Var = this.w;
                    if (rh8Var != null) {
                        rh8Var.dispose();
                        this.w = null;
                    }
                    rh8 rh8Var2 = new rh8(this, 0);
                    this.w = rh8Var2;
                    E.subscribe(rh8Var2);
                    this.I.start();
                    break;
                }
                break;
            case 3:
                BroadcastContract$State broadcastContract$State5 = this.a0;
                BroadcastContract$State broadcastContract$State6 = BroadcastContract$State.PREPARE;
                if (broadcastContract$State5 != broadcastContract$State6) {
                    if (broadcastContract$State5 != BroadcastContract$State.NOT_INITED) {
                        t();
                    }
                    pe8Var.d3();
                    pe8Var.q2();
                    pe8Var.B2(false);
                    this.a0 = broadcastContract$State6;
                    kxj C2 = pe8Var.C2();
                    sxj sxjVar = new sxj();
                    this.J = sxjVar;
                    sxjVar.b = this.h;
                    C2.setPresenter(sxjVar);
                    io.reactivex.rxjava3.core.q<Long> i4 = C2.i4();
                    sh8 sh8Var = this.x;
                    if (sh8Var != null) {
                        sh8Var.dispose();
                        this.x = null;
                    }
                    sh8 sh8Var2 = new sh8(this);
                    this.x = sh8Var2;
                    i4.subscribe(sh8Var2);
                    this.J.getClass();
                    break;
                }
                break;
            case 4:
                BroadcastContract$State broadcastContract$State7 = this.a0;
                BroadcastContract$State broadcastContract$State8 = BroadcastContract$State.LIVE;
                if (broadcastContract$State7 != broadcastContract$State8) {
                    if (broadcastContract$State7 != BroadcastContract$State.NOT_INITED) {
                        t();
                    }
                    h30 h30Var = this.G;
                    e1q e1qVar = this.b0;
                    if (h30Var == null) {
                        Context viewContext = pe8Var.getViewContext();
                        dhr0.a.getClass();
                        h30 h30Var2 = new h30(new l7s(viewContext, dhr0.u().c), this.m, true, this.k, this.j, this.g0, this.o, this.Q);
                        this.G = h30Var2;
                        h30Var2.o = true;
                        e1qVar.d = h30Var2;
                    }
                    this.a0 = broadcastContract$State8;
                    pe8Var.r0();
                    pe8Var.P2();
                    pe8Var.y2();
                    wjk0 v = pe8Var.v(this.R);
                    zjk0 zjk0Var = new zjk0(this.m, this.j, this.k, true, v, null);
                    this.E = zjk0Var;
                    LiveStatNew liveStatNew = this.g0;
                    zjk0Var.e = liveStatNew;
                    v.setPresenter(zjk0Var);
                    this.E.getClass();
                    zjk0 zjk0Var2 = this.E;
                    int i2 = this.T;
                    wjk0 wjk0Var = zjk0Var2.c;
                    if (wjk0Var != null) {
                        wjk0Var.Y2();
                        wjk0Var.setTimeText(i2);
                    }
                    if (this.c0 == null) {
                        io.reactivex.rxjava3.internal.operators.observable.m1 a02 = io.reactivex.rxjava3.core.q.R(1000L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                        th8 th8Var = new th8(this);
                        a02.subscribe(th8Var);
                        this.c0 = th8Var;
                    }
                    f2y0 C = pe8Var.C(this.R);
                    C.F2();
                    c30 c30Var = (c30) C;
                    this.G.t.add(c30Var);
                    l2y0 l2y0Var = new l2y0(this.m, this.j, this.k, true, C);
                    this.F = l2y0Var;
                    l2y0Var.y = this.i;
                    l2y0Var.z = this.h;
                    C.setPresenter(l2y0Var);
                    c30Var.setActionLinksPresenter(this.G);
                    this.F.start();
                    e1qVar.c = this.F;
                    if (this.W && (f4 = pe8Var.f4(this.R)) != null) {
                        kl70 kl70Var = new kl70(this, f4);
                        this.P = kl70Var;
                        f4.setPresenter(kl70Var);
                    }
                    uur J = pe8Var.J();
                    xur xurVar = new xur(this.j, J);
                    this.N = xurVar;
                    J.setPresenter(xurVar);
                    this.N.getClass();
                    e1qVar.e = this.N;
                    rpb K = pe8Var.K();
                    com.vk.libvideo.live.impl.views.chat.a aVar = new com.vk.libvideo.live.impl.views.chat.a(this.n, this.j, this.k, K);
                    this.H = aVar;
                    aVar.m = liveStatNew;
                    boolean z = aVar.o;
                    iu4 iu4Var = new iu4(this, 4);
                    aVar.o = z;
                    aVar.d.b1(z, false);
                    aVar.p = iu4Var;
                    K.setPresenter(this.H);
                    K.setActionLinksPresenter(this.G);
                    this.G.t.add((c30) K);
                    this.H.start();
                    com.vk.libvideo.live.impl.views.chat.a aVar2 = this.H;
                    e1qVar.b = aVar2;
                    l2y0 l2y0Var2 = this.F;
                    l2y0Var2.v = this.N;
                    l2y0Var2.w = aVar2;
                    aVar2.W(l2y0Var2);
                    l2y0 l2y0Var3 = this.F;
                    boolean z2 = this.S;
                    f2y0 f2y0Var = l2y0Var3.u;
                    if (!z2 || l2y0Var3.y == null) {
                        f2y0Var.setMaskButtonState(false);
                    } else {
                        f2y0Var.setMaskButtonState(true);
                        l2y0Var3.y.z();
                    }
                    this.R = false;
                    a2();
                    v2();
                    u2(false);
                    break;
                }
                break;
            case 5:
                BroadcastContract$State broadcastContract$State9 = this.a0;
                BroadcastContract$State broadcastContract$State10 = BroadcastContract$State.END_SCREEN;
                if (broadcastContract$State9 != broadcastContract$State10) {
                    if (broadcastContract$State9 != BroadcastContract$State.NOT_INITED) {
                        t();
                    }
                    pe8Var.B2(true);
                    pe8Var.d3();
                    this.a0 = broadcastContract$State10;
                    xjp m1 = pe8Var.m1();
                    yjp yjpVar = new yjp(this.m, this.k, this.c.g(this.n.c), this.h, this.e0, this.f0, this.T, this.U, m1);
                    this.O = yjpVar;
                    yjpVar.k = this;
                    m1.setPresenter(yjpVar);
                    this.O.start();
                    break;
                }
                break;
            case 6:
                release();
                close();
                cvk.u(R.string.live_broadcast_model_error, false);
                break;
        }
    }

    @Override // xsna.ne8
    public final void f2(boolean z) {
        this.S = z;
    }

    @Override // xsna.ne8
    public final void g2(oe8 oe8Var) {
        this.b = oe8Var;
    }

    @Override // xsna.pk6
    public final void pause() {
        this.Y = true;
        w2();
        b bVar = this.A;
        if (bVar != null) {
            bVar.dispose();
        }
        x2();
        liz lizVar = this.h;
        if (lizVar != null) {
            lizVar.D(false);
        }
        BroadcastContract$State broadcastContract$State = this.Z;
        if (broadcastContract$State == BroadcastContract$State.NOT_INITED || broadcastContract$State == BroadcastContract$State.PREPARE) {
            release();
            close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ne8
    public final void q() {
        pe8 pe8Var = this.g;
        prk0 D3 = pe8Var.D3();
        VideoOwner videoOwner = this.n;
        com.vk.libvideo.live.impl.views.stat.a aVar = new com.vk.libvideo.live.impl.views.stat.a(videoOwner.d, videoOwner.e, this.Z != BroadcastContract$State.END_SCREEN, this.e0, D3);
        this.K = aVar;
        aVar.d(this.T);
        pe8Var.Y3((ViewGroup) D3, pe8Var.getViewContext().getString(R.string.live_viewers_general_title));
        this.K.start();
    }

    @Override // xsna.ne8
    public final boolean q1() {
        return this.Z == BroadcastContract$State.LIVE;
    }

    @Override // xsna.pk6
    public final void release() {
        sh8 sh8Var = this.x;
        if (sh8Var != null) {
            sh8Var.dispose();
            this.x = null;
        }
        uh8 uh8Var = this.u;
        if (uh8Var != null) {
            uh8Var.dispose();
            this.u = null;
        }
        th8 th8Var = this.c0;
        if (th8Var != null) {
            th8Var.dispose();
            this.c0 = null;
        }
        wh8 wh8Var = this.v;
        if (wh8Var != null) {
            wh8Var.dispose();
            this.v = null;
        }
        e eVar = this.z;
        if (eVar != null) {
            eVar.dispose();
            this.z = null;
        }
        if (this.B != null) {
            this.i0.a("release: dispose");
            this.B.dispose();
            this.B = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.y;
        if (cVar != null) {
            cVar.dispose();
            this.y = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.D;
        if (cVar2 != null) {
            cVar2.dispose();
            this.D = null;
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.C;
        if (cVar3 != null) {
            cVar3.dispose();
            this.C = null;
        }
    }

    @Override // xsna.pk6
    public final void resume() {
        this.Y = false;
        if (this.Z != BroadcastContract$State.LIVE || this.X) {
            return;
        }
        a2();
        v2();
        u2(false);
        W(1200L);
    }

    @Override // xsna.pk6
    public final void start() {
        this.g0.a = LiveStatNew.UserType.author;
    }

    public final void t() {
        this.g.x();
        this.H = null;
        this.N = null;
        this.F = null;
        this.E = null;
        this.I = null;
        this.J = null;
        w2();
        b bVar = this.A;
        if (bVar != null) {
            bVar.dispose();
        }
        x2();
        rh8 rh8Var = this.w;
        if (rh8Var != null) {
            rh8Var.dispose();
            this.w = null;
        }
        sh8 sh8Var = this.x;
        if (sh8Var != null) {
            sh8Var.dispose();
            this.x = null;
        }
        uh8 uh8Var = this.u;
        if (uh8Var != null) {
            uh8Var.dispose();
            this.u = null;
        }
    }

    public final void u2(boolean z) {
        com.vk.libvideo.live.impl.views.chat.a aVar = this.H;
        boolean z2 = (aVar == null || aVar.o) ? false : true;
        if (this.B != null || z2) {
            return;
        }
        if (z && this.D == null) {
            VideoOwner videoOwner = this.n;
            this.D = this.c.T(videoOwner.d, videoOwner.e).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).K().subscribe(new v8(this, 9), new ph3(this, 7));
        }
        VideoOwner videoOwner2 = this.n;
        io.reactivex.rxjava3.internal.operators.observable.z2 b2 = this.e.b(videoOwner2.d, videoOwner2.e);
        a aVar2 = new a();
        b2.subscribe(aVar2);
        this.B = aVar2;
    }

    public final void v2() {
        b bVar = this.A;
        if (bVar != null) {
            bVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = io.reactivex.rxjava3.core.q.P(10000L, 10000L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        b bVar2 = new b();
        a0.subscribe(bVar2);
        this.A = bVar2;
    }

    public final void w2() {
        e eVar = this.z;
        if (eVar != null) {
            eVar.dispose();
            this.z = null;
            VideoOwner videoOwner = this.n;
            if (videoOwner.f != null) {
                this.c.B(videoOwner.d, videoOwner.e).subscribe(new f());
            }
        }
    }

    public final void x2() {
        if (this.B != null) {
            this.i0.a("stopQueue: dispose");
            this.B.dispose();
            this.B = null;
        }
    }

    /* compiled from: BroadcastPresenter.java */
    public class e extends io.reactivex.rxjava3.observers.a<LiveSpectators> {
        public e() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            LiveSpectators liveSpectators = (LiveSpectators) obj;
            qh8 qh8Var = qh8.this;
            kl70 kl70Var = qh8Var.P;
            if (kl70Var != null) {
                ArrayList arrayList = liveSpectators.f;
                ArrayList arrayList2 = kl70Var.e;
                arrayList2.clear();
                gl70 gl70Var = kl70Var.d;
                arrayList2.addAll(gl70Var.f);
                ArrayList<UserProfile> arrayList3 = gl70Var.f;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                jl70 jl70Var = new jl70();
                jl70Var.b = arrayList3;
                jl70Var.c = arrayList2;
                androidx.recyclerview.widget.m.a(jl70Var, true).b(gl70Var);
                kl70Var.c.p4(arrayList3.size());
            }
            zjk0 zjk0Var = qh8Var.E;
            if (zjk0Var != null) {
                zjk0Var.t(liveSpectators);
                ArrayList arrayList4 = liveSpectators.f;
                if (arrayList4 != null) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        qh8Var.c.V((UserProfile) it.next(), qh8Var.n.c);
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
        }
    }

    /* compiled from: BroadcastPresenter.java */
    public class f extends io.reactivex.rxjava3.observers.a<Boolean> {
        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
        }
    }
}
