package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketViewItemItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;
import xsna.hzp0;
import xsna.lnl0;
import xsna.wml0;

/* compiled from: StorefrontServicesActor.kt */
/* loaded from: classes18.dex */
public final class bnl0 extends bl50<mol0, wml0, on50, bwj, dwj, lnl0> implements g530 {
    public final sj50<mol0, on50, ll50<on50, bwj, dwj>, jl50<mol0>, lnl0> c;
    public final dol0 d;
    public final jnl0 e;

    /* compiled from: StorefrontServicesActor.kt */
    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$init$1", f = "StorefrontServicesActor.kt", l = {51}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: StorefrontServicesActor.kt */
        @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$init$1$1", f = "StorefrontServicesActor.kt", l = {55}, m = "invokeSuspend")
        /* renamed from: xsna.bnl0$a$a, reason: collision with other inner class name */
        public static final class C2616a extends SuspendLambda implements wzs<ay00, spj<? super s3q0>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ bnl0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2616a(bnl0 bnl0Var, spj<? super C2616a> spjVar) {
                super(2, spjVar);
                this.this$0 = bnl0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C2616a c2616a = new C2616a(this.this$0, spjVar);
                c2616a.L$0 = obj;
                return c2616a;
            }

            @Override // xsna.wzs
            public final Object invoke(ay00 ay00Var, spj<? super s3q0> spjVar) {
                return ((C2616a) create(ay00Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ay00 ay00Var = (ay00) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if (ay00Var instanceof hy00) {
                        bnl0 bnl0Var = this.this$0;
                        hy00 hy00Var = (hy00) ay00Var;
                        long j = hy00Var.a;
                        Boolean valueOf = Boolean.valueOf(hy00Var.c);
                        bnl0Var.getClass();
                        rdi.y(bnl0Var, new vib(j, valueOf));
                        bnl0 bnl0Var2 = this.this$0;
                        this.L$0 = null;
                        this.label = 1;
                        if (bnl0.m(bnl0Var2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return bnl0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                nb9 a = cdn.a(((fy00) bnl0.this.e.d.getValue()).a());
                C2616a c2616a = new C2616a(bnl0.this, null);
                this.label = 1;
                if (rsr.k(a, c2616a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public bnl0(sj50 sj50Var, dol0 dol0Var, jnl0 jnl0Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = dol0Var;
        this.e = jnl0Var;
        ((q530) jnl0Var.a.getValue()).d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(bnl0 bnl0Var, ContinuationImpl continuationImpl) {
        cnl0 cnl0Var;
        int i;
        Integer num;
        bnl0Var.getClass();
        if (continuationImpl instanceof cnl0) {
            cnl0Var = (cnl0) continuationImpl;
            int i2 = cnl0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cnl0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = cnl0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cnl0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    dol0 dol0Var = bnl0Var.d;
                    cnl0Var.label = 1;
                    obj = dol0Var.a(null, cnl0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                num = (Integer) obj;
                if (num != null) {
                }
                return s3q0.a;
            }
        }
        cnl0Var = new cnl0(bnl0Var, continuationImpl);
        Object obj3 = cnl0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cnl0Var.label;
        if (i != 0) {
        }
        num = (Integer) obj3;
        if (num != null) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(bnl0 bnl0Var, ggr ggrVar, int i, ContinuationImpl continuationImpl) {
        gnl0 gnl0Var;
        int i2;
        Object j;
        bnl0Var.getClass();
        if (continuationImpl instanceof gnl0) {
            gnl0Var = (gnl0) continuationImpl;
            int i3 = gnl0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gnl0Var.label = i3 - Integer.MIN_VALUE;
                gnl0 gnl0Var2 = gnl0Var;
                Object obj = gnl0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = gnl0Var2.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    dol0 dol0Var = bnl0Var.d;
                    String str = ggrVar.e;
                    ServicesSort servicesSort = ggrVar.b;
                    snl0 snl0Var = new snl0(ggrVar.c, ggrVar.d);
                    String str2 = ggrVar.f;
                    gnl0Var2.L$0 = null;
                    gnl0Var2.I$0 = i;
                    gnl0Var2.label = 1;
                    j = dol0Var.j(str, servicesSort, snl0Var, str2, i, gnl0Var2);
                    if (j == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    j = ((Result) obj).d();
                }
                if (j instanceof Result.Failure) {
                    return j;
                }
                return null;
            }
        }
        gnl0Var = new gnl0(bnl0Var, continuationImpl);
        gnl0 gnl0Var22 = gnl0Var;
        Object obj2 = gnl0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = gnl0Var22.label;
        if (i2 != 0) {
        }
        if (j instanceof Result.Failure) {
        }
    }

    @Override // xsna.g530
    public final void H2() {
        rdi.y(this, new bl30(this, 22));
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<mol0, on50, ll50<on50, bwj, dwj>, jl50<mol0>, lnl0> W() {
        return this.c;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new enl0(this, null));
        g3q.a(this, new a(null));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        wml0 wml0Var = (wml0) lj50Var;
        boolean z = wml0Var instanceof wml0.a;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        Object obj = null;
        if (!z) {
            if (wml0Var instanceof wml0.f) {
                el50.a.b(this, new viu(22));
                return;
            }
            if (wml0Var instanceof wml0.d) {
                el50.a.b(this, new mcl0(1));
                g3q.a(this, new enl0(this, null));
                return;
            }
            if (wml0Var instanceof wml0.e) {
                rdi.y(this, new et0(((wml0.e) wml0Var).b, 2));
                g3q.a(this, new zml0(this, null));
                return;
            }
            if (wml0Var instanceof wml0.b) {
                wml0.b bVar = (wml0.b) wml0Var;
                if (epx.f(bVar, wml0.b.C3943b.b)) {
                    rdi.y(this, new c220(22));
                    return;
                }
                if (epx.f(bVar, wml0.b.a.b)) {
                    rdi.y(this, new yml0(0));
                    return;
                } else {
                    if (!(bVar instanceof wml0.b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rdi.y(this, new skj0((wml0.b.c) bVar, 4));
                    g3q.a(this, new zml0(this, null));
                    return;
                }
            }
            if (!(wml0Var instanceof xml0)) {
                if (!wml0Var.equals(wml0.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new zsw(22));
                g3q.a(this, new dnl0(this, null));
                return;
            }
            Pair<uoi0, Integer> h = ((mol0) sj50Var.getCurrentState()).h(((xml0) wml0Var).b);
            if (h == null) {
                return;
            }
            uoi0 d = h.d();
            int intValue = h.g().intValue();
            boolean z2 = d.u;
            UserId userId = d.p;
            long j = d.i;
            if (z2) {
                return;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(userId.b), null, null, null, 56, null);
            UiTrackingScreen b = UiTracker.j.b();
            MobileOfficialAppsMarketStat$TypeMarketView b2 = MobileOfficialAppsMarketStat$TypeMarketView.a.b(b != null ? b.a : null, r(), null, new MobileOfficialAppsMarketStat$TypeMarketViewItemItem(Integer.valueOf((int) j), Long.valueOf(userId.b), null, Integer.valueOf(intValue + 1), null, null, null, null, null, null, 1012, null), 24);
            if (((mol0) sj50Var.getCurrentState()).b.c == null || (mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.SERVICE_ALBUM) == null) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_SERVICE;
            }
            new hzp0.g0(schemeStat$EventItem, b2, mobileOfficialAppsCoreNavStat$EventScreen).a();
            rdi.y(this, new svk0(d, 4));
            return;
        }
        wml0.a aVar = (wml0.a) wml0Var;
        if (aVar instanceof wml0.a.C3942a) {
            gr1 gr1Var = ((mol0) sj50Var.getCurrentState()).d;
            if (gr1Var != null) {
                int i = ((wml0.a.C3942a) aVar).b;
                Iterator<T> it = gr1Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((goi0) next).a == i) {
                        obj = next;
                        break;
                    }
                }
                goi0 goi0Var = (goi0) obj;
                if (goi0Var == null) {
                    return;
                }
                c(new lnl0.a.b(goi0Var));
                return;
            }
            return;
        }
        if (epx.f(aVar, wml0.a.b.b)) {
            c(new lnl0.a.c(((mol0) sj50Var.getCurrentState()).b.b));
            return;
        }
        if (aVar instanceof wml0.a.i) {
            Pair<uoi0, Integer> h2 = ((mol0) sj50Var.getCurrentState()).h(((wml0.a.i) aVar).b);
            if (h2 == null) {
                return;
            }
            uoi0 d2 = h2.d();
            int intValue2 = h2.g().intValue();
            if (((q530) this.e.a.getValue()).b(d2.q, d2.r)) {
                return;
            }
            c(new lnl0.a.e(intValue2, r(), d2));
            return;
        }
        if (aVar instanceof wml0.a.c) {
            wml0.a.c cVar = (wml0.a.c) aVar;
            c(new lnl0.a.h(((mol0) sj50Var.getCurrentState()).b.b, cVar.b, cVar.c));
            return;
        }
        if (aVar instanceof wml0.a.j) {
            Pair<uoi0, Integer> h3 = ((mol0) sj50Var.getCurrentState()).h(((wml0.a.j) aVar).b);
            if (h3 == null) {
                return;
            }
            c(new lnl0.a.i(h3.g().intValue(), r(), h3.d()));
            return;
        }
        if (aVar instanceof wml0.a.f) {
            g3q.a(this, new anl0(this, (wml0.a.f) aVar, null));
            return;
        }
        if (epx.f(aVar, wml0.a.d.b)) {
            if (!((mol0) sj50Var.getCurrentState()).g.b()) {
                c(lnl0.a.C3278a.a);
                return;
            } else {
                rdi.y(this, new yml0(0));
                c(lnl0.b.a.C3279a.a);
                return;
            }
        }
        if (epx.f(aVar, wml0.a.e.b)) {
            c(lnl0.a.d.a);
            return;
        }
        if (epx.f(aVar, wml0.a.g.b)) {
            String str = ((mol0) sj50Var.getCurrentState()).c.a;
            if (str == null) {
                return;
            }
            c(new lnl0.a.f(str));
            return;
        }
        if (epx.f(aVar, wml0.a.h.b)) {
            rdi.y(this, new kpr(24));
            g3q.a(this, new fnl0(this, null));
        } else {
            if (!epx.f(aVar, wml0.a.k.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c(new lnl0.a.g(((mol0) sj50Var.getCurrentState()).b.b));
        }
    }

    public final CommonMarketStat$TypeRefSource r() {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        return (((mol0) this.b.getCurrentState()).b.c == null || (commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_SERVICES) == null) ? CommonMarketStat$TypeRefSource.COMMUNITY_SERVICES : commonMarketStat$TypeRefSource;
    }

    @Override // xsna.g530
    public final void g3() {
    }
}
