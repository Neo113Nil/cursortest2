package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.notifications.list.impl.presentation.base.mvi.common.NotificationCategoryTab;
import com.vk.notifications.list.impl.presentation.model.common.NotificationPageState;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.MobileOfficialAppsNotificationsStat$TypeNotificationItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.NotificationFeatures;
import core.NotificationBannerScheduleRepeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.bc70;
import xsna.ha70;
import xsna.kb70;
import xsna.oa70;
import xsna.wb70;

/* compiled from: NotificationListFeatureV2.kt */
/* loaded from: classes4.dex */
public final class wa70 extends wl50 {
    public final vb70 f;
    public final ExtendedProfilesRepository g;
    public final mzp0 h;
    public final va70 i;
    public final f4z j;
    public final hpj k;
    public final s101 l;
    public final mi70 m;
    public final Object n;
    public final ua70 o;
    public final qb70 p;

    /* compiled from: NotificationListFeatureV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationBannerScheduleRepeat.values().length];
            try {
                iArr[NotificationBannerScheduleRepeat.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationBannerScheduleRepeat.REPEAT_LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationBannerScheduleRepeat.CYCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: NotificationListFeatureV2.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<wb70, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(wb70 wb70Var) {
            ((wa70) this.receiver).T(wb70Var);
            return s3q0.a;
        }
    }

    /* compiled from: NotificationListFeatureV2.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<oa70, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(oa70 oa70Var) {
            ((wa70) this.receiver).C(oa70Var);
            return s3q0.a;
        }
    }

    /* compiled from: NotificationListFeatureV2.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<wb70, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(wb70 wb70Var) {
            ((wa70) this.receiver).T(wb70Var);
            return s3q0.a;
        }
    }

    /* compiled from: NotificationListFeatureV2.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$reloadData$1", f = "NotificationListFeatureV2.kt", l = {329}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $forceSkeleton;
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ int $markAsReadBeforeTime;
        final /* synthetic */ o870 $page;
        final /* synthetic */ int $pageIndex;
        final /* synthetic */ NotificationCategoryTab $pendingCategoryId;
        final /* synthetic */ dc70 $state;
        int I$0;
        int I$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, dc70 dc70Var, boolean z, boolean z2, o870 o870Var, NotificationCategoryTab notificationCategoryTab, int i2, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$pageIndex = i;
            this.$state = dc70Var;
            this.$isRefresh = z;
            this.$forceSkeleton = z2;
            this.$page = o870Var;
            this.$pendingCategoryId = notificationCategoryTab;
            this.$markAsReadBeforeTime = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wa70.this.new e(this.$pageIndex, this.$state, this.$isRefresh, this.$forceSkeleton, this.$page, this.$pendingCategoryId, this.$markAsReadBeforeTime, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Throwable th;
            Result.Failure failure;
            Object obj2;
            TimeoutCancellationException timeoutCancellationException;
            Throwable a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                wa70 wa70Var = wa70.this;
                int i2 = this.$pageIndex;
                dc70 dc70Var = this.$state;
                boolean z = this.$isRefresh;
                boolean z2 = this.$forceSkeleton;
                wa70Var.getClass();
                xl50 tVar = z ? new wb70.t(i2) : (dc70Var.d.get(i2).d.isEmpty() || z2) ? new wb70.s(i2) : null;
                if (tVar != null) {
                    wa70Var.T(tVar);
                }
                wa70 wa70Var2 = wa70.this;
                dc70 dc70Var2 = this.$state;
                int i3 = this.$pageIndex;
                o870 o870Var = this.$page;
                NotificationCategoryTab notificationCategoryTab = this.$pendingCategoryId;
                boolean z3 = this.$isRefresh;
                int i4 = this.$markAsReadBeforeTime;
                try {
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    eVar = this;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    eVar = this;
                    timeoutCancellationException = e;
                    failure = new Result.Failure(timeoutCancellationException);
                    obj2 = failure;
                    wa70 wa70Var3 = wa70.this;
                    int i5 = eVar.$pageIndex;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    wa70.this.T(new wb70.y(eVar.$pageIndex, false));
                    return s3q0.a;
                } catch (CancellationException e2) {
                    e = e2;
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    eVar = this;
                    th = th;
                    failure = new Result.Failure(th);
                    obj2 = failure;
                    wa70 wa70Var32 = wa70.this;
                    int i52 = eVar.$pageIndex;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    wa70.this.T(new wb70.y(eVar.$pageIndex, false));
                    return s3q0.a;
                }
                try {
                    if (wa70.V(wa70Var2, dc70Var2, i3, o870Var, notificationCategoryTab, z3, i4, eVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (TimeoutCancellationException e3) {
                    e = e3;
                    timeoutCancellationException = e;
                    failure = new Result.Failure(timeoutCancellationException);
                    obj2 = failure;
                    wa70 wa70Var322 = wa70.this;
                    int i522 = eVar.$pageIndex;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    wa70.this.T(new wb70.y(eVar.$pageIndex, false));
                    return s3q0.a;
                } catch (CancellationException e4) {
                    e = e4;
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    failure = new Result.Failure(th);
                    obj2 = failure;
                    wa70 wa70Var3222 = wa70.this;
                    int i5222 = eVar.$pageIndex;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    wa70.this.T(new wb70.y(eVar.$pageIndex, false));
                    return s3q0.a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    kotlin.a.a(obj);
                    eVar = this;
                } catch (TimeoutCancellationException e5) {
                    timeoutCancellationException = e5;
                    eVar = this;
                    failure = new Result.Failure(timeoutCancellationException);
                    obj2 = failure;
                    wa70 wa70Var32222 = wa70.this;
                    int i52222 = eVar.$pageIndex;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    wa70.this.T(new wb70.y(eVar.$pageIndex, false));
                    return s3q0.a;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th4) {
                    th = th4;
                    eVar = this;
                    failure = new Result.Failure(th);
                    obj2 = failure;
                    wa70 wa70Var322222 = wa70.this;
                    int i522222 = eVar.$pageIndex;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    wa70.this.T(new wb70.y(eVar.$pageIndex, false));
                    return s3q0.a;
                }
            }
            obj2 = s3q0.a;
            wa70 wa70Var3222222 = wa70.this;
            int i5222222 = eVar.$pageIndex;
            a = Result.a(obj2);
            if (a != null) {
                mzp0 mzp0Var = wa70Var3222222.h;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                com.vk.metrics.eventtracking.b.a.a(new Throwable("Notifications list loading error", a));
                wa70Var3222222.T(new wb70.f(i5222222));
            }
            wa70.this.T(new wb70.y(eVar.$pageIndex, false));
            return s3q0.a;
        }
    }

    public wa70(boolean z, vb70 vb70Var, ExtendedProfilesRepository extendedProfilesRepository, mzp0 mzp0Var, va70 va70Var) {
        super(oa70.b.b, new xb70());
        this.f = vb70Var;
        this.g = extendedProfilesRepository;
        this.h = mzp0Var;
        this.i = va70Var;
        this.j = new f4z();
        hpj a2 = zvj.a(hqu0.a());
        this.k = a2;
        s101 s101Var = new s101();
        this.l = s101Var;
        this.m = new mi70();
        this.n = msy.a(LazyThreadSafetyMode.NONE, new n1(28));
        this.o = new ua70(s101Var, Y(), new b(1, this, wa70.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new c(1, this, wa70.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.p = new qb70(a2, s101Var, new d(1, this, wa70.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0));
        if (z) {
            Y().getClass();
            Preference.C("notification_prefs", "notification_current_source");
            Y().getClass();
            Preference.C("notification_prefs", "notification_current_source_title");
        }
    }

    public static final Object V(wa70 wa70Var, dc70 dc70Var, int i, o870 o870Var, NotificationCategoryTab notificationCategoryTab, boolean z, int i2, e eVar) {
        wa70Var.getClass();
        Object d2 = zvj.d(new xa70(dc70Var, o870Var, wa70Var, i, notificationCategoryTab, i2, z, null), eVar);
        return d2 == CoroutineSingletons.COROUTINE_SUSPENDED ? d2 : s3q0.a;
    }

    public static final zi70 W(wa70 wa70Var, dc70 dc70Var) {
        wa70Var.Y().getClass();
        if (!he70.b() || dc70Var.h.isEmpty()) {
            return null;
        }
        return (zi70) j5g.b0(dc70Var.i, dc70Var.h);
    }

    public static boolean b0(dc70 dc70Var) {
        Object obj;
        Iterator<T> it = dc70Var.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o870) obj).j) {
                break;
            }
        }
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(dc70 dc70Var, oa70 oa70Var) {
        String str;
        Object obj;
        Integer num;
        String str2;
        String s;
        String str3;
        String s2;
        dc70 dc70Var2 = dc70Var;
        oa70 oa70Var2 = oa70Var;
        boolean z = true;
        if (oa70Var2.equals(oa70.b.b)) {
            Y().getClass();
            if (Preference.v("notification_prefs", "notification_current_source_title")) {
                s2 = Preference.s("notification_prefs", "notification_current_source_title", new String());
                str3 = s2;
            } else {
                str3 = null;
            }
            Y().getClass();
            Long a2 = he70.a();
            Y().getClass();
            boolean b2 = he70.b();
            boolean X = X();
            LinkedHashMap linkedHashMap = jja.a;
            Y().getClass();
            List list = (List) jja.a.get(he70.a());
            Y().getClass();
            T(new wb70.h(str3, a2, b2, he70.b() ? list : null, X));
            if (this.g.L0(o25.a().c()) == null) {
                myc0.h(this.k, null, null, new fb70(this, null), 3);
            }
            C(new oa70.f(0, 30));
            return;
        }
        if (oa70Var2 instanceof oa70.n) {
            oa70.n nVar = (oa70.n) oa70Var2;
            NotificationCategoryTab notificationCategoryTab = nVar.b;
            boolean z2 = nVar.c;
            int i = nVar.d;
            ua70 ua70Var = this.o;
            Y().getClass();
            Object[] objArr = he70.b() != dc70Var2.j;
            Y().getClass();
            boolean f = epx.f(he70.a(), dc70Var2.c);
            if (objArr == true || !f) {
                LinkedHashMap linkedHashMap2 = jja.a;
                Y().getClass();
                List list2 = (List) jja.a.get(he70.a());
                Y().getClass();
                if (!he70.b()) {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                if (notificationCategoryTab == null || list2.isEmpty()) {
                    num = null;
                } else {
                    ua70Var.getClass();
                    num = Integer.valueOf(ua70.a(list2, notificationCategoryTab));
                }
                Y().getClass();
                if (Preference.v("notification_prefs", "notification_current_source_title")) {
                    s = Preference.s("notification_prefs", "notification_current_source_title", new String());
                    str2 = s;
                } else {
                    str2 = null;
                }
                Y().getClass();
                Long a3 = he70.a();
                Y().getClass();
                T(new wb70.v(str2, a3, he70.b(), list2, num));
                if (f) {
                    Y().getClass();
                    if (!he70.b()) {
                        T(new wb70.p(0));
                        C(new oa70.f(0, 26));
                        return;
                    }
                }
                ua70Var.getClass();
                uoz uozVar = (notificationCategoryTab == null || !list2.isEmpty()) ? notificationCategoryTab != null ? new uoz(ua70.a(list2, notificationCategoryTab), null) : new uoz(dc70Var2.i, null) : new uoz(0, notificationCategoryTab);
                C(new oa70.f(uozVar.a, z2, !z2, uozVar.b, i));
                return;
            }
            return;
        }
        if (oa70Var2.equals(oa70.h.b)) {
            Y().getClass();
            if (he70.a() == null) {
                this.j.b(bc70.b.a);
                return;
            }
            T(wb70.o.b);
            Y().getClass();
            Preference.C("notification_prefs", "notification_current_source");
            Y().getClass();
            Preference.C("notification_prefs", "notification_current_source_title");
            C(new oa70.n(NotificationCategoryTab.ALL, true, (int) qni0.b()));
            return;
        }
        if (oa70Var2.equals(oa70.j.b)) {
            Z(dc70Var2);
            this.j.b(bc70.c.a);
            return;
        }
        if (oa70Var2 instanceof oa70.d) {
            Z(dc70Var2);
            return;
        }
        if (oa70Var2 instanceof oa70.e) {
            T(new wb70.l(X()));
            o870 o870Var = dc70Var2.d.get(dc70Var2.i);
            List<kb70> list3 = o870Var.d;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (((kb70) it.next()) instanceof kb70.c) {
                        break;
                    }
                }
            }
            z = false;
            Iterator<T> it2 = o870Var.d.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (obj instanceof kb70.c) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            kb70.c cVar = (kb70.c) (obj instanceof kb70.c ? obj : null);
            int i2 = cVar != null ? cVar.d : 0;
            int i3 = g620.g;
            if (o870Var.i) {
                NotificationFeatures notificationFeatures = NotificationFeatures.NOTIFICATION_RELOAD_FIX;
                notificationFeatures.getClass();
                if (!com.vk.toggle.b.A.a(notificationFeatures)) {
                    d0(dc70Var2.i, dc70Var2, true, false, null, 0);
                    return;
                }
            }
            if (!z || i3 == i2) {
                return;
            }
            g620.s(0);
            T(new wb70.x(dc70Var2.i));
            return;
        }
        if (oa70Var2 instanceof oa70.f) {
            oa70.f fVar = (oa70.f) oa70Var2;
            d0(fVar.b, dc70Var2, fVar.c, fVar.d, fVar.e, fVar.f);
            return;
        }
        if (oa70Var2.equals(oa70.l.b)) {
            d0(dc70Var2.i, dc70Var2, true, false, null, 0);
            return;
        }
        if (oa70Var2.equals(oa70.a.b)) {
            T(wb70.d.b);
            return;
        }
        if (oa70Var2 instanceof oa70.g) {
            oa70.g gVar = (oa70.g) oa70Var2;
            o870 o870Var2 = dc70Var2.d.get(gVar.b);
            if (o870Var2.d.isEmpty() || (str = o870Var2.e) == null || str.length() == 0 || o870Var2.g) {
                return;
            }
            T(new wb70.y(gVar.b, true));
            T(new wb70.l(X()));
            myc0.h(this.k, null, null, new za70(this, gVar, o870Var2, dc70Var2, null), 3);
            return;
        }
        if (oa70Var2 instanceof oa70.o) {
            T(new wb70.z(((oa70.o) oa70Var2).b));
            return;
        }
        if (oa70Var2 instanceof oa70.i) {
            for (kb70 kb70Var : ((oa70.i) oa70Var2).b) {
                if (kb70Var instanceof kb70.d) {
                    mi70 mi70Var = this.m;
                    String str4 = ((kb70.d) kb70Var).a;
                    LinkedHashSet<String> linkedHashSet = mi70Var.b;
                    if (!linkedHashSet.contains(str4)) {
                        linkedHashSet.add(str4);
                        mi70Var.a.add(str4);
                    }
                }
            }
            return;
        }
        if (oa70Var2 instanceof oa70.m) {
            String str5 = ((oa70.m) oa70Var2).b;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.NOTIFICATIONS, null, null, null, null, null, 62, null), new MobileOfficialAppsNotificationsStat$TypeNotificationItemClick("cell", str5), 2)).q();
            return;
        }
        if (oa70Var2 instanceof oa70.k) {
            int i4 = ((oa70.k) oa70Var2).b;
            T(new wb70.p(i4));
            if (dc70Var2.d.get(i4).c != NotificationPageState.CONTENT) {
                C(new oa70.f(i4, 26));
                return;
            }
            return;
        }
        if (!(oa70Var2 instanceof oa70.c)) {
            throw new NoWhenBranchMatchedException();
        }
        ha70 ha70Var = ((oa70.c) oa70Var2).b;
        f4z f4zVar = this.j;
        qb70 qb70Var = this.p;
        CoreFeatures coreFeatures = CoreFeatures.NOTIF_OFFLINE_CLICK;
        coreFeatures.getClass();
        if (!com.vk.toggle.b.A.a(coreFeatures) || !(ha70Var instanceof ha70.s)) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                ha70Var = ha70.y.a;
            }
        }
        if (ha70Var instanceof ha70.x) {
            ha70.x xVar = (ha70.x) ha70Var;
            qb70Var.c.invoke(new wb70.q(new t770(xVar.a, xVar.b, xVar.c, xVar.d, new oa70.c(xVar.e))));
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (ha70Var instanceof ha70.f) {
            ha70.f fVar2 = (ha70.f) ha70Var;
            myc0.h(qb70Var.a, null, null, new lb70(fVar2.c, qb70Var, fVar2.a, fVar2.b, null), 3);
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (ha70Var instanceof ha70.y) {
            T(wb70.r.b);
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        if (ha70Var instanceof ha70.c) {
            myc0.h(qb70Var.a, null, null, new nb70(qb70Var, (ha70.c) ha70Var, null), 3);
            s3q0 s3q0Var4 = s3q0.a;
            return;
        }
        if (ha70Var instanceof ha70.d) {
            myc0.h(qb70Var.a, null, null, new ob70(qb70Var, (ha70.d) ha70Var, null), 3);
            s3q0 s3q0Var5 = s3q0.a;
            return;
        }
        if (ha70Var instanceof ha70.b) {
            myc0.h(qb70Var.a, null, null, new mb70(qb70Var, (ha70.b) ha70Var, dc70Var2, null), 3);
            s3q0 s3q0Var6 = s3q0.a;
            return;
        }
        if (ha70Var instanceof ha70.w) {
            myc0.h(qb70Var.a, null, null, new pb70(qb70Var, (ha70.w) ha70Var, null), 3);
            s3q0 s3q0Var7 = s3q0.a;
            return;
        }
        if (!(ha70Var instanceof ha70.g)) {
            if (!(ha70Var instanceof ha70.a)) {
                if (ha70Var instanceof ha70.e) {
                    X();
                    return;
                } else if (ha70Var instanceof ha70.z) {
                    zqn0.a.i();
                    s3q0 s3q0Var8 = s3q0.a;
                    return;
                } else {
                    f4zVar.b(new bc70.a(ha70Var));
                    s3q0 s3q0Var9 = s3q0.a;
                    return;
                }
            }
            he70 Y = Y();
            Y().getClass();
            long m = Preference.v("notification_prefs", "notification_resubscribe_banner_count_closed") ? Preference.m(0L, "notification_prefs", "notification_resubscribe_banner_count_closed") : 0L;
            Y.getClass();
            Preference.F(m + 1, "notification_prefs", "notification_resubscribe_banner_count_closed");
            he70 Y2 = Y();
            long currentTimeMillis = System.currentTimeMillis();
            Y2.getClass();
            Preference.F(currentTimeMillis, "notification_prefs", "notification_resubscribe_banner_data_closed");
            T(new wb70.l(X()));
            s3q0 s3q0Var10 = s3q0.a;
            return;
        }
        ua70 ua70Var2 = this.o;
        ua70Var2.getClass();
        if (ha70Var != null) {
            ha70.g gVar2 = (ha70.g) ha70Var;
            long j = gVar2.c;
            String str6 = gVar2.a;
            NotificationCategoryTab.a aVar = NotificationCategoryTab.Companion;
            String str7 = gVar2.b;
            aVar.getClass();
            NotificationCategoryTab notificationCategoryTab2 = str7.equals("comments") ? NotificationCategoryTab.COMMENTS : str7.equals("all") ? NotificationCategoryTab.ALL : NotificationCategoryTab.ALL;
            c cVar2 = ua70Var2.d;
            ua70Var2.b.getClass();
            if (str6 == null) {
                Preference.C("notification_prefs", "notification_current_source_title");
            } else {
                Preference.H("notification_prefs", "notification_current_source_title", str6);
            }
            Preference.F(j, "notification_prefs", "notification_current_source");
            LinkedHashMap linkedHashMap3 = jja.a;
            List list4 = (List) jja.a.get(Long.valueOf(j));
            if (list4 != null) {
                int a4 = notificationCategoryTab2 != null ? ua70.a(list4, notificationCategoryTab2) : 0;
                ua70Var2.c.invoke(new wb70.v(Preference.v("notification_prefs", "notification_current_source_title") ? Preference.s("notification_prefs", "notification_current_source_title", new String()) : null, he70.a(), he70.b(), list4, Integer.valueOf(a4)));
                cVar2.invoke(new oa70.f(a4, 18));
            } else {
                cVar2.invoke(new oa70.n(6, notificationCategoryTab2));
            }
        } else {
            f4zVar.b(new bc70.a(ha70Var));
        }
        s3q0 s3q0Var11 = s3q0.a;
    }

    @Override // xsna.wl50
    public final wj50<bc70> U() {
        return this.j;
    }

    public final boolean X() {
        if (zqn0.a.f()) {
            return false;
        }
        va70 va70Var = this.i;
        List<Integer> list = va70Var.a;
        if (list.isEmpty()) {
            return false;
        }
        Y().getClass();
        int m = (int) (Preference.v("notification_prefs", "notification_resubscribe_banner_count_closed") ? Preference.m(0L, "notification_prefs", "notification_resubscribe_banner_count_closed") : 0L);
        int i = a.$EnumSwitchMapping$0[va70Var.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                m %= list.size();
            } else if (m >= list.size()) {
                m = e43.h(list);
            }
        } else if (m < 0 || m >= list.size()) {
            return false;
        }
        int intValue = list.get(m).intValue();
        Y().getClass();
        return System.currentTimeMillis() >= TimeUnit.DAYS.toMillis((long) intValue) + (Preference.v("notification_prefs", "notification_resubscribe_banner_data_closed") ? Preference.m(0L, "notification_prefs", "notification_resubscribe_banner_data_closed") : 0L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final he70 Y() {
        return (he70) this.n.getValue();
    }

    public final void Z(dc70 dc70Var) {
        List<o870> list = dc70Var.d;
        int i = dc70Var.i;
        if (list.get(i).h && b0(dc70Var)) {
            int b2 = (int) qni0.b();
            Integer num = dc70Var.d.get(i).f;
            if ((num != null ? num.intValue() : 0) > 0) {
                myc0.h(q1u.b, null, null, new eb70(this, b2, null), 3);
            }
            T(new wb70.a0(b2));
        }
        this.m.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(String str, boolean z, String str2, int i, boolean z2, ContinuationImpl continuationImpl) {
        ab70 ab70Var;
        int i2;
        boolean z3;
        boolean z4;
        if (continuationImpl instanceof ab70) {
            ab70Var = (ab70) continuationImpl;
            int i3 = ab70Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ab70Var.label = i3 - Integer.MIN_VALUE;
                ab70 ab70Var2 = ab70Var;
                Object obj = ab70Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = ab70Var2.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b2 = hqu0.b();
                    bb70 bb70Var = new bb70(i, z, this, str, str2, null);
                    ab70Var2.L$0 = null;
                    ab70Var2.L$1 = null;
                    ab70Var2.Z$0 = z;
                    ab70Var2.I$0 = i;
                    z3 = z2;
                    ab70Var2.Z$1 = z3;
                    ab70Var2.label = 1;
                    obj = myc0.k(b2, bb70Var, ab70Var2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z4 = z;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = ab70Var2.Z$1;
                    z4 = ab70Var2.Z$0;
                    kotlin.a.a(obj);
                }
                T(new wb70.b0(((NotificationsNotificationListRedesignResponseDto) obj).i()));
                if (z3 && z4) {
                    myc0.h(this.k, null, null, new cb70(this, null), 3);
                }
                return obj;
            }
        }
        ab70Var = new ab70(this, continuationImpl);
        ab70 ab70Var22 = ab70Var;
        Object obj2 = ab70Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ab70Var22.label;
        if (i2 != 0) {
        }
        T(new wb70.b0(((NotificationsNotificationListRedesignResponseDto) obj2).i()));
        if (z3) {
            myc0.h(this.k, null, null, new cb70(this, null), 3);
        }
        return obj2;
    }

    public final void d0(int i, dc70 dc70Var, boolean z, boolean z2, NotificationCategoryTab notificationCategoryTab, int i2) {
        o870 o870Var = (o870) j5g.b0(i, dc70Var.d);
        if (o870Var == null || o870Var.g) {
            return;
        }
        mzp0 mzp0Var = this.h;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        T(new wb70.y(i, true));
        T(new wb70.l(X()));
        myc0.h(this.k, null, null, new e(i, dc70Var, z, z2, o870Var, notificationCategoryTab, i2, null), 3);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        zvj.c(this.k, null);
    }
}
