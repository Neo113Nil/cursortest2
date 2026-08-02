package xsna;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.bridges.dto.analytics.HealthSyncState;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.StepsMiniAppIds;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.domain.GoogleServicesDataSource;
import com.vk.superapp.vksteps.infrastructure.exceptions.SyncAlreadyInProgressException;
import com.vk.superapp.vksteps.utils.enums.VkStepsStoreSyncReason;
import com.vk.superapp.vksteps.utils.enums.VkStepsUpdateStrategy;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.pvj;
import xsna.sji0;
import xsna.tji0;

/* compiled from: VkStepsManagerImpl.kt */
/* loaded from: classes11.dex */
public final class imv0 implements hmv0 {
    public static final ArrayList q;
    public final env0 a;
    public final tji0 b;
    public final qwt c;
    public final ywt d;
    public final d9q0 e;
    public final ayu0 f;
    public final rwt g;
    public final vwt h;
    public final twt i;
    public final Set<w0l0> j = tj0.c();
    public final c k;
    public hpj l;
    public yok0 m;
    public yok0 n;
    public yok0 o;
    public long p;

    /* compiled from: VkStepsManagerImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VkStepsUpdateStrategy.values().length];
            try {
                iArr[VkStepsUpdateStrategy.MONTHLY_SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkStepsUpdateStrategy.PARTIAL_MONTHLY_SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkStepsUpdateStrategy.SYNC_FROM_EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkStepsUpdateStrategy.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SelectedDataSource.values().length];
            try {
                iArr2[SelectedDataSource.GOOGLE_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SelectedDataSource.HEALTH_CONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[GoogleServicesDataSource.values().length];
            try {
                iArr3[GoogleServicesDataSource.GOOGLE_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[GoogleServicesDataSource.HEALTH_CONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: VkStepsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vksteps.VkStepsManagerImpl$getSelectedDataSource$1", f = "VkStepsManagerImpl.kt", l = {Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<SelectedDataSource, s3q0> $callback;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, izs<? super SelectedDataSource, s3q0> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.$callback = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return imv0.this.new b(this.$context, this.$callback, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                vwt vwtVar = imv0.this.h;
                Context context = this.$context;
                this.label = 1;
                obj = vwtVar.a(context, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$callback.invoke((SelectedDataSource) obj);
            return s3q0.a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class c extends kotlin.coroutines.a implements pvj {
        @Override // xsna.pvj
        public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
            xgx0 xgx0Var = xgx0.a;
            String str = "VkStepManagerImpl CoroutineExceptionHandler handle error: " + th.getMessage() + ", " + mnh0.A(th);
            xgx0Var.getClass();
            xgx0.b(str);
        }
    }

    /* compiled from: VkStepsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vksteps.VkStepsManagerImpl$updateSteps$1", f = "VkStepsManagerImpl.kt", l = {138, 139}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ e9q0 $payload;
        int label;
        final /* synthetic */ imv0 this$0;

        /* compiled from: VkStepsManagerImpl.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SelectedDataSource.values().length];
                try {
                    iArr[SelectedDataSource.HEALTH_CONNECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SelectedDataSource.GOOGLE_FIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SelectedDataSource.HUAWEI_HEALTH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SelectedDataSource.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e9q0 e9q0Var, imv0 imv0Var, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$payload = e9q0Var;
            this.this$0 = imv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$payload, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r1.a(r3, r8, r7) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
        
            if (xsna.imv0.m(r1, r4, r8, r7) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GoogleServicesDataSource googleServicesDataSource;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xgx0 xgx0Var = xgx0.a;
                String str = "VkStepManagerImpl.updateSteps -> stepsSyncReason: " + this.$payload.b.name();
                xgx0Var.getClass();
                xgx0.a(str);
                SelectedDataSource selectedDataSource = this.$payload.h;
                this.this$0.p = System.currentTimeMillis();
                int i2 = a.$EnumSwitchMapping$0[selectedDataSource.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    imv0 imv0Var = this.this$0;
                    e9q0 e9q0Var = this.$payload;
                    imv0Var.getClass();
                    int i3 = a.$EnumSwitchMapping$1[selectedDataSource.ordinal()];
                    if (i3 == 1) {
                        googleServicesDataSource = GoogleServicesDataSource.GOOGLE_FIT;
                    } else {
                        if (i3 != 2) {
                            xgx0.b("VkStepManagerImpl.toGoogleServicesDataSource() -> incorrect data source " + selectedDataSource.name() + " passed");
                            throw new IllegalStateException("VkStepManagerImpl accept only google services source. Current source " + selectedDataSource.name());
                        }
                        googleServicesDataSource = GoogleServicesDataSource.HEALTH_CONNECT;
                    }
                    this.label = 1;
                } else if (i2 == 3) {
                    imv0 imv0Var2 = this.this$0;
                    d9q0 d9q0Var = imv0Var2.e;
                    e9q0 e9q0Var2 = this.$payload;
                    Set<w0l0> set = imv0Var2.j;
                    this.label = 2;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izs<Exception, s3q0> izsVar = this.$payload.e;
                    if (izsVar != null) {
                        izsVar.invoke(new IllegalAccessException("VkStepManagerImpl.updateSteps() -> Selected Data Source unknown"));
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    static {
        zrp<StepsMiniAppIds> h = StepsMiniAppIds.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<E> it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((StepsMiniAppIds) it.next()).i()));
        }
        q = arrayList;
    }

    public imv0(env0 env0Var, tji0 tji0Var, qwt qwtVar, ywt ywtVar, d9q0 d9q0Var, ayu0 ayu0Var, rwt rwtVar, vwt vwtVar, twt twtVar) {
        this.a = env0Var;
        this.b = tji0Var;
        this.c = qwtVar;
        this.d = ywtVar;
        this.e = d9q0Var;
        this.f = ayu0Var;
        this.g = rwtVar;
        this.h = vwtVar;
        this.i = twtVar;
        c cVar = new c(pvj.a.b);
        this.k = cVar;
        this.l = zvj.a(d.a.a(whn0.a(), dgn0.f().getDefault()).plus(cVar));
    }

    public static final VkStepsStoreSyncReason j(imv0 imv0Var, long j, long j2) {
        imv0Var.getClass();
        qvo0.a.getClass();
        long d2 = qvo0.d();
        return (DateUtils.isToday(j2) && j == d2) ? VkStepsStoreSyncReason.SAVE : j >= d2 ? VkStepsStoreSyncReason.UPDATE : VkStepsStoreSyncReason.SKIP;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(imv0 imv0Var, Exception exc, e9q0 e9q0Var, GoogleServicesDataSource googleServicesDataSource, ContinuationImpl continuationImpl) {
        jmv0 jmv0Var;
        int i;
        boolean z;
        iyu0 iyu0Var;
        izs<Exception, s3q0> c2;
        ayu0 ayu0Var = imv0Var.f;
        try {
            if (continuationImpl instanceof jmv0) {
                jmv0Var = (jmv0) continuationImpl;
                int i2 = jmv0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jmv0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = jmv0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = jmv0Var.label;
                    z = true;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ayu0Var.f(exc);
                        xgx0.a.getClass();
                        xgx0.a("VkStepManagerImpl Error while reading data from History API: " + exc);
                        Context a2 = e9q0Var.a();
                        RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                        jmv0Var.L$0 = exc;
                        jmv0Var.L$1 = e9q0Var;
                        jmv0Var.L$2 = googleServicesDataSource;
                        jmv0Var.label = 1;
                        obj = byu0.b(ayu0Var, a2, requestedMiniApp, jmv0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        googleServicesDataSource = (GoogleServicesDataSource) jmv0Var.L$2;
                        e9q0Var = (e9q0) jmv0Var.L$1;
                        exc = (Exception) jmv0Var.L$0;
                        kotlin.a.a(obj);
                    }
                    iyu0Var = (iyu0) obj;
                    if (!jyu0.b(iyu0Var) && !jyu0.f(iyu0Var) && !jyu0.d(iyu0Var)) {
                        z = false;
                    }
                    xgx0 xgx0Var = xgx0.a;
                    String str = "VkStepManagerImpl Is all permissions granted: " + z + ". selected data source: " + e9q0Var.f();
                    xgx0Var.getClass();
                    xgx0.a(str);
                    c2 = e9q0Var.c();
                    if (c2 != null) {
                        c2.invoke(exc);
                    }
                    amv0.a(e9q0Var.a(), HealthSyncState.HEALTH_PROVIDER_ERROR, e9q0Var.h(), n(googleServicesDataSource), exc.getMessage(), 0, imv0Var.p);
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            iyu0Var = (iyu0) obj;
            if (!jyu0.b(iyu0Var)) {
                z = false;
            }
            xgx0 xgx0Var2 = xgx0.a;
            String str2 = "VkStepManagerImpl Is all permissions granted: " + z + ". selected data source: " + e9q0Var.f();
            xgx0Var2.getClass();
            xgx0.a(str2);
            c2 = e9q0Var.c();
            if (c2 != null) {
            }
            amv0.a(e9q0Var.a(), HealthSyncState.HEALTH_PROVIDER_ERROR, e9q0Var.h(), n(googleServicesDataSource), exc.getMessage(), 0, imv0Var.p);
            return s3q0.a;
        } catch (Throwable th) {
            xgx0 xgx0Var3 = xgx0.a;
            String str3 = "VkStepManagerImpl Error while get health status: " + exc + ", \n stackTrace: " + exc.getStackTrace();
            xgx0Var3.getClass();
            xgx0.a(str3);
            izs<Exception, s3q0> c3 = e9q0Var.c();
            if (c3 != null) {
                c3.invoke(new Exception(th));
            }
            return s3q0.a;
        }
        jmv0Var = new jmv0(imv0Var, continuationImpl);
        Object obj2 = jmv0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jmv0Var.label;
        z = true;
    }

    public static final Object l(imv0 imv0Var, Context context, List list, VkStepsSyncReason vkStepsSyncReason, long j, long j2, HealthDataProvider healthDataProvider, VkStepsStoreSyncReason vkStepsStoreSyncReason, List list2, gzs gzsVar, izs izsVar, boolean z, SuspendLambda suspendLambda) {
        Object a2 = imv0Var.b.a(new tji0.a(context, list, list2, vkStepsSyncReason, vkStepsStoreSyncReason, healthDataProvider, j, j2, imv0Var.p, z, imv0Var.j, gzsVar, izsVar), suspendLambda);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(imv0 imv0Var, e9q0 e9q0Var, GoogleServicesDataSource googleServicesDataSource, ContinuationImpl continuationImpl) {
        nmv0 nmv0Var;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        e9q0 e9q0Var2;
        env0 env0Var;
        GoogleServicesDataSource googleServicesDataSource2;
        e9q0 e9q0Var3;
        int i2;
        imv0Var.getClass();
        if (continuationImpl instanceof nmv0) {
            nmv0Var = (nmv0) continuationImpl;
            int i3 = nmv0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nmv0Var.label = i3 - Integer.MIN_VALUE;
                obj = nmv0Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nmv0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    env0 env0Var2 = imv0Var.a;
                    p9u p9uVar = p9u.a;
                    nmv0Var.L$0 = e9q0Var;
                    nmv0Var.L$1 = googleServicesDataSource;
                    nmv0Var.L$2 = env0Var2;
                    nmv0Var.label = 1;
                    p9uVar.getClass();
                    Object a2 = p9u.a(nmv0Var);
                    if (a2 != coroutineSingletons) {
                        e9q0Var2 = e9q0Var;
                        env0Var = env0Var2;
                        obj = a2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    googleServicesDataSource2 = (GoogleServicesDataSource) nmv0Var.L$1;
                    e9q0Var3 = (e9q0) nmv0Var.L$0;
                    kotlin.a.a(obj);
                    i2 = a.$EnumSwitchMapping$0[((VkStepsUpdateStrategy) obj).ordinal()];
                    if (i2 != 1) {
                        yok0 yok0Var = imv0Var.m;
                        if (yok0Var == null || !yok0Var.isActive()) {
                            imv0Var.m = myc0.h(imv0Var.l, null, null, new kmv0(googleServicesDataSource2, null, e9q0Var3, imv0Var), 3);
                        } else {
                            izs<Exception, s3q0> c2 = e9q0Var3.c();
                            if (c2 != null) {
                                c2.invoke(new SyncAlreadyInProgressException());
                            }
                        }
                    } else if (i2 == 2) {
                        yok0 yok0Var2 = imv0Var.n;
                        if (yok0Var2 == null || !yok0Var2.isActive()) {
                            imv0Var.n = myc0.h(imv0Var.l, null, null, new lmv0(googleServicesDataSource2, null, e9q0Var3, imv0Var), 3);
                        } else {
                            izs<Exception, s3q0> c3 = e9q0Var3.c();
                            if (c3 != null) {
                                c3.invoke(new SyncAlreadyInProgressException());
                            }
                        }
                    } else if (i2 == 3) {
                        yok0 yok0Var3 = imv0Var.o;
                        if (yok0Var3 == null || !yok0Var3.isActive()) {
                            imv0Var.o = myc0.h(imv0Var.l, null, null, new mmv0(googleServicesDataSource2, null, e9q0Var3, imv0Var), 3);
                        } else {
                            izs<Exception, s3q0> c4 = e9q0Var3.c();
                            if (c4 != null) {
                                c4.invoke(new SyncAlreadyInProgressException());
                            }
                        }
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        xgx0.a.getClass();
                        xgx0.a("VkStepManagerImpl.updateStepsFromGooglePlayServices() -> no synchronisation strategy selected");
                    }
                    return s3q0.a;
                }
                env0Var = (env0) nmv0Var.L$2;
                googleServicesDataSource = (GoogleServicesDataSource) nmv0Var.L$1;
                e9q0Var2 = (e9q0) nmv0Var.L$0;
                kotlin.a.a(obj);
                env0Var.b((String) obj);
                ywt ywtVar = imv0Var.d;
                nmv0Var.L$0 = e9q0Var2;
                nmv0Var.L$1 = googleServicesDataSource;
                nmv0Var.L$2 = null;
                nmv0Var.label = 2;
                obj = ywtVar.a(e9q0Var2, nmv0Var);
                if (obj != coroutineSingletons) {
                    googleServicesDataSource2 = googleServicesDataSource;
                    e9q0Var3 = e9q0Var2;
                    i2 = a.$EnumSwitchMapping$0[((VkStepsUpdateStrategy) obj).ordinal()];
                    if (i2 != 1) {
                    }
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        nmv0Var = new nmv0(imv0Var, continuationImpl);
        obj = nmv0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nmv0Var.label;
        if (i != 0) {
        }
        env0Var.b((String) obj);
        ywt ywtVar2 = imv0Var.d;
        nmv0Var.L$0 = e9q0Var2;
        nmv0Var.L$1 = googleServicesDataSource;
        nmv0Var.L$2 = null;
        nmv0Var.label = 2;
        obj = ywtVar2.a(e9q0Var2, nmv0Var);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static HealthDataProvider n(GoogleServicesDataSource googleServicesDataSource) {
        int i = a.$EnumSwitchMapping$2[googleServicesDataSource.ordinal()];
        if (i == 1) {
            return HealthDataProvider.GOOGLE_FIT;
        }
        if (i == 2) {
            return HealthDataProvider.HEALTH_CONNECT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.hmv0
    public final void a() {
        sji0.a.a();
    }

    @Override // xsna.hmv0
    public final void b(Context context, izs<? super SelectedDataSource, s3q0> izsVar) {
        myc0.h(this.l, null, null, new b(context, izsVar, null), 3);
    }

    @Override // xsna.hmv0
    public final void c(String str) {
        sji0.e.b(str);
    }

    @Override // xsna.hmv0
    public final void d(com.vk.superapp.ui.a aVar) {
        this.j.add(aVar);
    }

    @Override // xsna.hmv0
    public final void e(com.vk.superapp.ui.a aVar) {
        this.j.remove(aVar);
    }

    @Override // xsna.hmv0
    public final boolean f(com.vk.superapp.ui.a aVar) {
        return this.j.contains(aVar);
    }

    @Override // xsna.hmv0
    public final void g(e9q0 e9q0Var) {
        myc0.h(this.l, null, null, new d(e9q0Var, this, null), 3);
    }

    @Override // xsna.hmv0
    public final void h() {
        zvj.c(this.l, null);
        this.l = zvj.a(d.a.a(whn0.a(), dgn0.f().getDefault()).plus(this.k));
    }

    @Override // xsna.hmv0
    public final ViewGroup i(LayoutInflater layoutInflater, ViewGroup viewGroup, qjo0 qjo0Var) {
        return wmv0.b(layoutInflater, viewGroup, qjo0Var);
    }
}
