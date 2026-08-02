package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.onboardingpromo.api.OnboardingPromoArguments;
import com.vk.onboardingpromo.impl.data.OnboardingPromoConfig;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideDo;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoArgumentsImpl;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c63;

/* compiled from: OnboardingPromoInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class mg80 implements com.vk.onboardingpromo.api.a {
    public final xg80 a;
    public final hpj b;

    /* compiled from: OnboardingPromoInteractorImpl.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.domain.OnboardingPromoInteractorImpl", f = "OnboardingPromoInteractorImpl.kt", l = {SQLiteStatementType.STATEMENT_OTHER, 100}, m = "clearCache")
    public static final class a extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return mg80.this.a(0L, this);
        }
    }

    /* compiled from: OnboardingPromoInteractorImpl.kt */
    public static final class b extends c63.b {
        public b() {
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            c63 c63Var = c63.a;
            c63.c(this);
            mg80 mg80Var = mg80.this;
            myc0.h(mg80Var.b, null, null, mg80Var.new c(activity, null), 3).E(mg80Var.new d());
        }
    }

    /* compiled from: OnboardingPromoInteractorImpl.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.domain.OnboardingPromoInteractorImpl$preparePromoData$1$1", f = "OnboardingPromoInteractorImpl.kt", l = {41, 42}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Activity $activity;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return mg80.this.new c(this.$activity, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (xsna.mg80.f(r1, r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mg80 mg80Var = mg80.this;
                Activity activity = this.$activity;
                HashSet hashSet = iah0.a;
                boolean d = fnj.d(activity);
                this.label = 1;
                obj = mg80.g(mg80Var, d, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            OnboardingPromoDo onboardingPromoDo = (OnboardingPromoDo) obj;
            if (onboardingPromoDo != null) {
                mg80 mg80Var2 = mg80.this;
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 2;
            }
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoInteractorImpl.kt */
    public static final class d implements izs<Throwable, s3q0> {
        public d() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            zvj.c(mg80.this.b, null);
            return s3q0.a;
        }
    }

    public mg80(xg80 xg80Var) {
        rzv0 rzv0Var = rzv0.a;
        this.a = xg80Var;
        this.b = zvj.a(rzv0.b);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:23|24))(2:25|(2:27|28)(3:29|(1:31)(1:34)|(1:33)))|12|13|(1:15)|16|(1:18)|19|20))|37|6|7|(0)(0)|12|13|(0)|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(mg80 mg80Var, OnboardingPromoDo onboardingPromoDo, ContinuationImpl continuationImpl) {
        lg80 lg80Var;
        int i;
        Object failure;
        Throwable a2;
        OnboardingPromoDo onboardingPromoDo2 = onboardingPromoDo;
        mg80Var.getClass();
        if (continuationImpl instanceof lg80) {
            lg80Var = (lg80) continuationImpl;
            int i2 = lg80Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lg80Var.label = i2 - Integer.MIN_VALUE;
                Object obj = lg80Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lg80Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (onboardingPromoDo2 == null) {
                        return s3q0.a;
                    }
                    L.e("OnboardingPromo", "The caching process for promo " + onboardingPromoDo2.g() + " has begun");
                    xg80 xg80Var = mg80Var.a;
                    lg80Var.L$0 = onboardingPromoDo2;
                    lg80Var.L$1 = null;
                    lg80Var.I$0 = 0;
                    lg80Var.label = 1;
                    Object k = myc0.k(xg80Var.c.getIo(), new vg80(onboardingPromoDo2, xg80Var, null), lg80Var);
                    if (k != obj2) {
                        k = s3q0.a;
                    }
                    if (k == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    onboardingPromoDo2 = (OnboardingPromoDo) lg80Var.L$0;
                    kotlin.a.a(obj);
                }
                failure = s3q0.a;
                if (!(failure instanceof Result.Failure)) {
                    L.e("OnboardingPromo", "Promo " + onboardingPromoDo2.g() + " have been successfully cached");
                    xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.ONBOARDING_DOWNLOADED, null, onboardingPromoDo2.e(), hg80.a((OnboardingPromoSlideDo) j5g.a0(onboardingPromoDo2.j())), 0, 0L, 50));
                }
                a2 = Result.a(failure);
                if (a2 != null) {
                    L.e("OnboardingPromo", "Cache error", a2);
                }
                return s3q0.a;
            }
        }
        lg80Var = new lg80(mg80Var, continuationImpl);
        Object obj3 = lg80Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lg80Var.label;
        if (i != 0) {
        }
        failure = s3q0.a;
        if (!(failure instanceof Result.Failure)) {
        }
        a2 = Result.a(failure);
        if (a2 != null) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(mg80 mg80Var, boolean z, ContinuationImpl continuationImpl) {
        ng80 ng80Var;
        int i;
        Boolean bool;
        dao daoVar;
        Object d2;
        Object obj;
        xg80 xg80Var = mg80Var.a;
        if (continuationImpl instanceof ng80) {
            ng80Var = (ng80) continuationImpl;
            int i2 = ng80Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ng80Var.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ng80Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ng80Var.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    xg80Var.getClass();
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d()) {
                        r6m.a.getClass();
                        NetworkInfo e = r6m.e();
                        if (e != null ? e.isRoaming() : false) {
                            daoVar = y9o.b;
                        } else {
                            Boolean valueOf = Boolean.valueOf(Preference.j().getBoolean("isRoamingState", false));
                            Boolean bool2 = Boolean.TRUE;
                            if (valueOf.equals(bool2)) {
                                daoVar = z9o.b;
                            } else {
                                sr10 sr10Var = dy2.a;
                                if (sr10Var != null) {
                                    NetworkState c2 = com.vk.core.utils.newtork.b.c();
                                    bool = Boolean.valueOf(c2.e.a || c2.d() == NetworkType.MOBILE_2G || sr10Var.c);
                                } else {
                                    bool = null;
                                }
                                daoVar = epx.f(bool, bool2) ? w9o.b : null;
                            }
                        }
                    } else {
                        daoVar = x9o.b;
                    }
                    if (daoVar == null) {
                        if (z) {
                            daoVar = v9o.b;
                        } else {
                            Context context = xg80Var.a;
                            VKApplication vKApplication = com.vk.core.apps.a.a;
                            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
                            if (hasSystemFeature) {
                                L l = L.a;
                                l.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l, L.LogType.d, new Object[]{"OnboardingPromo", zhy0.a("check failed: isDeviceFoldable=", hasSystemFeature)});
                                }
                            }
                            daoVar = hasSystemFeature ? u9o.b : null;
                        }
                        if (daoVar == null) {
                            r6m.a.getClass();
                            try {
                                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                                Context context2 = r6m.e;
                                if (context2 == null) {
                                    context2 = null;
                                }
                                Intent registerReceiver = context2.registerReceiver(null, intentFilter);
                                if ((registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1.0f) / (registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1.0f) <= 0.15d) {
                                    daoVar = aao.b;
                                }
                            } catch (Exception unused) {
                            }
                            r6m.a.getClass();
                            Context context3 = r6m.e;
                            if (context3 == null) {
                                context3 = null;
                            }
                            if (((PowerManager) context3.getSystemService("power")).isPowerSaveMode()) {
                                daoVar = cao.b;
                            } else {
                                Context context4 = r6m.e;
                                if (context4 == null) {
                                    context4 = null;
                                }
                                daoVar = ((PowerManager) context4.getSystemService("power")).isDeviceIdleMode() ? bao.b : null;
                            }
                        }
                    }
                    if (daoVar != null) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"OnboardingPromo", "Promo download skipped. Reason: " + daoVar});
                        }
                    } else {
                        daoVar = null;
                    }
                    if (daoVar != null) {
                        xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.DOWNLOAD_SKIP, daoVar.a, null, null, 0, 0L, 56));
                        return null;
                    }
                    ng80Var.Z$0 = z;
                    ng80Var.label = 1;
                    d2 = xg80Var.d(ng80Var);
                    if (d2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj2);
                    d2 = ((Result) obj2).d();
                }
                obj = d2 instanceof Result.Failure ? null : d2;
                if (((OnboardingPromoDo) obj) == null) {
                    L.e("OnboardingPromo", "There is no active promo campaign at the moment");
                }
                return obj;
            }
        }
        ng80Var = new ng80(mg80Var, continuationImpl);
        Object obj22 = ng80Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ng80Var.label;
        if (i != 0) {
        }
        if (d2 instanceof Result.Failure) {
        }
        if (((OnboardingPromoDo) obj) == null) {
        }
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(3:26|27|28))(3:32|33|(2:35|31)(1:36))|29))|39|6|7|(0)(0)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r7 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0036, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.vk.onboardingpromo.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        int i2;
        mg80 mg80Var;
        Object e;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i3 = aVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.label = i3 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    xg80 xg80Var = this.a;
                    aVar.L$0 = this;
                    aVar.J$0 = j;
                    i2 = 0;
                    aVar.I$0 = 0;
                    aVar.label = 1;
                    if (xg80Var.a(j, aVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mg80Var = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        e = ((Result) obj).d();
                        Object failure = new Result(e);
                        if (!(failure instanceof Result.Failure)) {
                            L.e("OnboardingPromo", "Cache have been successfully cleared");
                        }
                        Throwable a2 = Result.a(failure);
                        if (a2 != null) {
                            L.e("OnboardingPromo", "Failed to clear cache", a2);
                        }
                        return s3q0.a;
                    }
                    int i4 = aVar.I$0;
                    long j2 = aVar.J$0;
                    mg80 mg80Var2 = (mg80) aVar.L$0;
                    kotlin.a.a(obj);
                    i2 = i4;
                    mg80Var = mg80Var2;
                    j = j2;
                }
                aVar.L$0 = null;
                aVar.J$0 = j;
                aVar.I$0 = i2;
                aVar.label = 2;
                e = mg80Var.a.e((int) j, aVar);
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        aVar.L$0 = null;
        aVar.J$0 = j;
        aVar.I$0 = i2;
        aVar.label = 2;
        e = mg80Var.a.e((int) j, aVar);
    }

    @Override // com.vk.onboardingpromo.api.a
    public final void b() {
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if (b2 != null) {
            myc0.h(this.b, null, null, new c(b2, null), 3).E(new d());
        } else {
            c63.a(new b());
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0171  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.onboardingpromo.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z;
        boolean z2;
        boolean z3;
        xg80 xg80Var = this.a;
        OnboardingPromoArgumentsImpl c2 = xg80Var.c();
        if (c2 != null) {
            OnboardingPromoDo onboardingPromoDo = c2.b;
            OnboardingPromoConfig onboardingPromoConfig = (OnboardingPromoConfig) xg80Var.f.getValue();
            long d2 = onboardingPromoConfig != null ? onboardingPromoConfig.d() : 0L;
            yg80 yg80Var = new yg80(2, xg80Var, xg80.class, "clearCache", "clearCache(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            if (onboardingPromoDo.i() == null || System.currentTimeMillis() >= onboardingPromoDo.i().longValue()) {
                boolean z4 = d2 <= 0;
                if (z4) {
                    xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_SKIP, CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.TTL_EXPIRED, onboardingPromoDo.e(), hg80.a((OnboardingPromoSlideDo) j5g.a0(onboardingPromoDo.j())), 0, 0L, 48));
                    hpj a2 = zvj.a(hqu0.b());
                    myc0.h(a2, null, null, new gg80(yg80Var, onboardingPromoDo, null), 3).E(new lxz(a2, 12));
                }
                if (!z4) {
                    long currentTimeMillis = System.currentTimeMillis();
                    z = currentTimeMillis <= onboardingPromoDo.d() + TimeUnit.SECONDS.toMillis(d2) && onboardingPromoDo.d() <= currentTimeMillis;
                    if (!z) {
                        xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_SKIP, CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.TTL_EXPIRED, onboardingPromoDo.e(), hg80.a((OnboardingPromoSlideDo) j5g.a0(onboardingPromoDo.j())), 0, 0L, 48));
                        L.e("OnboardingPromo", "Promo " + onboardingPromoDo.g() + " expired");
                        hpj a3 = zvj.a(hqu0.b());
                        myc0.h(a3, null, null, new fg80(yg80Var, onboardingPromoDo, null), 3).E(new bgy(a3, 20));
                    }
                    if (z) {
                        boolean z5 = xg80Var.b().getBoolean("is_fully_cached", false);
                        if (!z5) {
                            xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_SKIP, CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.INCOMPLETE_DOWNLOAD, onboardingPromoDo.e(), null, 0, 0L, 48));
                        }
                        if (z5) {
                            if (BuildInfo.s()) {
                                bpn0 bpn0Var = o25.a;
                                if (bpn0Var == null) {
                                    bpn0Var = null;
                                }
                                boolean b2 = ((b25) bpn0Var.getValue()).b();
                                VideoFeatures videoFeatures = VideoFeatures.ONBOARDING_PROMO;
                                videoFeatures.getClass();
                                boolean a4 = com.vk.toggle.b.A.a(videoFeatures);
                                z2 = b2 && a4;
                                if (!z2) {
                                    L l = L.a;
                                    l.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l, L.LogType.d, new Object[]{"OnboardingPromo", zy60.c("check failed: isLoggedIn=", ", isFeatureEnabled=", b2, a4)});
                                    }
                                }
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (BuildInfo.q()) {
                                    bpn0 bpn0Var2 = o25.a;
                                    boolean b3 = ((b25) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).b();
                                    VideoFeatures videoFeatures2 = VideoFeatures.ONBOARDING_PROMO_ANON;
                                    videoFeatures2.getClass();
                                    com.vk.toggle.b bVar = com.vk.toggle.b.A;
                                    boolean a5 = bVar.a(videoFeatures2);
                                    VideoFeatures videoFeatures3 = VideoFeatures.ONBOARDING_PROMO;
                                    videoFeatures3.getClass();
                                    boolean a6 = bVar.a(videoFeatures3);
                                    z3 = !b3 ? a5 : a6;
                                    if (!z3) {
                                        L l2 = L.a;
                                        l2.getClass();
                                        if (!L.m(LoggerOutputTarget.NONE)) {
                                            L.u(l2, L.LogType.d, new Object[]{"OnboardingPromo", zy60.c("check failed: isAllowedAnonUsers=", ", isOnboardingPromoEnabled=", a5, a6)});
                                        }
                                    }
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                xe80.c(new ve80(CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW_SKIP, CommonOnboardingStat$TypeOnboardingEvent.EventSubtype.SHOW_TIME_NOT_REACHED, onboardingPromoDo.e(), hg80.a((OnboardingPromoSlideDo) j5g.a0(onboardingPromoDo.j())), 0, 0L, 48));
                L.e("OnboardingPromo", "Show date is in the future – " + new SimpleDateFormat("dd/MM/yyyy, HH:mm", Locale.getDefault()).format(new Date(onboardingPromoDo.i().longValue())) + ", promo will be displayed later");
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    @Override // com.vk.onboardingpromo.api.a
    public final boolean d() {
        return this.a.b().getBoolean("is_promo_seen_once", false);
    }

    @Override // com.vk.onboardingpromo.api.a
    public final OnboardingPromoArguments e() {
        return this.a.c();
    }
}
