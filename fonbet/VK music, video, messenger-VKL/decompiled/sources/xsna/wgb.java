package xsna;

import com.vk.channels.api.ChannelFilter;
import com.vk.im.engine.models.ProfilesInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import xsna.ogb;

/* compiled from: ChannelsListLoaderWorker.kt */
/* loaded from: classes16.dex */
public final class wgb {
    public final ChannelFilter a;
    public final gz9 b;
    public final io.reactivex.rxjava3.core.w c;
    public final io.reactivex.rxjava3.core.w d;
    public final com.vk.im.engine.models.c e;
    public final rfb f;
    public final rfb g;
    public final bib h;
    public final uvf0 i;
    public final io.reactivex.rxjava3.subjects.d<b> j;
    public final io.reactivex.rxjava3.subjects.d k;
    public final AtomicBoolean l;
    public final io.reactivex.rxjava3.subjects.f<ogb.b> m;
    public final io.reactivex.rxjava3.subjects.f n;
    public final io.reactivex.rxjava3.disposables.c o;
    public final io.reactivex.rxjava3.subjects.d<izs<b, s3q0>> p;
    public final io.reactivex.rxjava3.disposables.c q;
    public final io.reactivex.rxjava3.subjects.d<io.reactivex.rxjava3.functions.a> r;
    public final String s;

    /* compiled from: ChannelsListLoaderWorker.kt */
    public static final class a {
        public final rfb a;
        public final rfb b;
        public final bib c;
        public final uvf0 d;

        public a(rfb rfbVar, rfb rfbVar2, bib bibVar, uvf0 uvf0Var) {
            this.a = rfbVar;
            this.b = rfbVar2;
            this.c = bibVar;
            this.d = uvf0Var;
        }
    }

    /* compiled from: ChannelsListLoaderWorker.kt */
    public static final class b {
        public final qfb a;
        public final ProfilesInfo b;
        public final List<dcf0> c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public b() {
            this(0);
        }

        public static b a(b bVar, qfb qfbVar, ProfilesInfo profilesInfo, List list, int i, boolean z, boolean z2, boolean z3, int i2) {
            if ((i2 & 1) != 0) {
                qfbVar = bVar.a;
            }
            qfb qfbVar2 = qfbVar;
            if ((i2 & 2) != 0) {
                profilesInfo = bVar.b;
            }
            ProfilesInfo profilesInfo2 = profilesInfo;
            if ((i2 & 4) != 0) {
                list = bVar.c;
            }
            List list2 = list;
            if ((i2 & 8) != 0) {
                i = bVar.d;
            }
            int i3 = i;
            boolean z4 = (i2 & 16) != 0 ? bVar.e : true;
            if ((i2 & 32) != 0) {
                z = bVar.f;
            }
            boolean z5 = z;
            if ((i2 & 64) != 0) {
                z2 = bVar.g;
            }
            boolean z6 = z2;
            boolean z7 = (i2 & 128) != 0 ? bVar.h : z3;
            bVar.getClass();
            return new b(qfbVar2, profilesInfo2, list2, i3, z4, z5, z6, z7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
        }

        public final int hashCode() {
            int b = ur.b(this.b, this.a.hashCode() * 31, 31);
            List<dcf0> list = this.c;
            return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(shy.a(this.d, (b + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WorkerState(history=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", recommendations=");
            sb.append(this.c);
            sb.append(", recommendationsVersion=");
            sb.append(this.d);
            sb.append(", initLoaded=");
            sb.append(this.e);
            sb.append(", isNetworkLoad=");
            sb.append(this.f);
            sb.append(", isUpdatingExpired=");
            sb.append(this.g);
            sb.append(", isRecommendationsLoading=");
            return defpackage.q0.a(sb, this.h, ')');
        }

        public b(int i) {
            this(new qfb(EmptyList.b, jgp.b, true, false, false, false), new ProfilesInfo(), null, 0, false, false, false, false);
        }

        public b(qfb qfbVar, ProfilesInfo profilesInfo, List<dcf0> list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = qfbVar;
            this.b = profilesInfo;
            this.c = list;
            this.d = i;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }
    }

    public wgb(ChannelFilter channelFilter, a aVar, gz9 gz9Var, io.reactivex.rxjava3.core.w wVar, io.reactivex.rxjava3.core.w wVar2, cau0 cau0Var) {
        this.a = channelFilter;
        this.b = gz9Var;
        this.c = wVar;
        this.d = wVar2;
        this.e = cau0Var;
        this.f = aVar.a;
        this.g = aVar.b;
        this.h = aVar.c;
        this.i = aVar.d;
        io.reactivex.rxjava3.subjects.d<b> O0 = io.reactivex.rxjava3.subjects.d.O0(new b(0));
        this.j = O0;
        this.k = O0;
        this.l = new AtomicBoolean(false);
        io.reactivex.rxjava3.subjects.f<ogb.b> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.m = fVar;
        this.n = fVar;
        io.reactivex.rxjava3.subjects.d<izs<b, s3q0>> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.o = io.reactivex.rxjava3.kotlin.c.g(new io.reactivex.rxjava3.internal.operators.observable.b1(N0.a0(wVar).U(new kb(new qu(this, 15), 12))), new lb(this, 18), null, 2);
        this.p = N0;
        io.reactivex.rxjava3.subjects.d<io.reactivex.rxjava3.functions.a> N02 = io.reactivex.rxjava3.subjects.d.N0();
        this.q = io.reactivex.rxjava3.kotlin.c.g(new io.reactivex.rxjava3.internal.operators.observable.b1(N02.a0(wVar2).U(new ju1(new x4(11), 10))), new com.vk.movika.sdk.base.observable.m(this, 20), null, 2);
        this.r = N02;
        this.s = "worker " + hashCode();
        gz9Var.a(new mh(this, 17));
    }

    public final void a() {
        this.b.a(new defpackage.e(this, 16));
        this.o.dispose();
        this.q.dispose();
        this.c.f();
        this.d.f();
    }

    public final void b(izs<? super b, s3q0> izsVar) {
        this.p.onNext(izsVar);
    }

    public final void c(b bVar, final sfb sfbVar, aeb aebVar, final boolean z) {
        qfb a2 = yyv.a(bVar.a, sfbVar.a, aebVar);
        ProfilesInfo profilesInfo = bVar.b;
        profilesInfo.Hb(sfbVar.b);
        boolean z2 = bVar.f && !z;
        d();
        e(b.a(bVar, a2, profilesInfo, null, 0, z2, false, false, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        this.b.a(new gzs() { // from class: xsna.vgb
            @Override // xsna.gzs
            public final Object invoke() {
                return wgb.this.s + ": onLoadedNextInternal: finished, loaded=" + sfbVar.a.size() + ", networkResult=" + z;
            }
        });
    }

    public final void d() {
        this.l.set(false);
    }

    public final void e(b bVar) {
        this.j.onNext(bVar);
        b(new ul1(this, 17));
    }
}
