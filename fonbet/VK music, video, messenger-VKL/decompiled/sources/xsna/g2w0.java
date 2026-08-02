package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkworkout.WorkoutMiniAppIds;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.pvj;

/* compiled from: VkWorkoutManagerImpl.kt */
/* loaded from: classes11.dex */
public final class g2w0 implements f2w0 {
    public static final ArrayList j;
    public final s2w0 a;
    public final gpt b;
    public final ipt c;
    public final cut d;
    public final zpw e;
    public final k0v f;
    public final x1w0 g;
    public final hpj h = zvj.a(d.a.a(whn0.a(), dgn0.f().getDefault()).plus(new c(pvj.a.b)));
    public yok0 i;

    /* compiled from: VkWorkoutManagerImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectedDataSource.values().length];
            try {
                iArr[SelectedDataSource.GOOGLE_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedDataSource.HEALTH_CONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VkWorkoutManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.VkWorkoutManagerImpl$getSelectedDataSource$1", f = "VkWorkoutManagerImpl.kt", l = {Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "invokeSuspend")
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
            return g2w0.this.new b(this.$context, this.$callback, spjVar);
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
                cut cutVar = g2w0.this.d;
                Context context = this.$context;
                this.label = 1;
                obj = cutVar.a(context, this);
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
            String str = "VkWorkoutManagerImpl CoroutineExceptionHandler handle error: " + th.getMessage() + ", " + mnh0.A(th);
            xgx0Var.getClass();
            xgx0.b(str);
        }
    }

    /* compiled from: VkWorkoutManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.VkWorkoutManagerImpl$updateWorkouts$1", f = "VkWorkoutManagerImpl.kt", l = {87, 97, 100}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ izs<Throwable, s3q0> $errorCallback;
        final /* synthetic */ SelectedDataSource $selectedDataSource;
        final /* synthetic */ ton0 $syncWorkoutData;
        final /* synthetic */ bvo0 $timeRange;
        final /* synthetic */ yzs<Integer, String, Long, s3q0> $workoutsSuccessfullySentCallback;
        int label;
        final /* synthetic */ g2w0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ton0 ton0Var, g2w0 g2w0Var, Context context, bvo0 bvo0Var, SelectedDataSource selectedDataSource, yzs<? super Integer, ? super String, ? super Long, s3q0> yzsVar, izs<? super Throwable, s3q0> izsVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$syncWorkoutData = ton0Var;
            this.this$0 = g2w0Var;
            this.$context = context;
            this.$timeRange = bvo0Var;
            this.$selectedDataSource = selectedDataSource;
            this.$workoutsSuccessfullySentCallback = yzsVar;
            this.$errorCallback = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$syncWorkoutData, this.this$0, this.$context, this.$timeRange, this.$selectedDataSource, this.$workoutsSuccessfullySentCallback, this.$errorCallback, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(1:2)|(1:(1:(1:(4:7|8|9|10)(2:12|13))(9:14|15|(1:17)|18|(2:20|21)(1:37)|22|23|24|25))(1:38))(2:48|(2:50|(1:52)))|39|(1:41)|42|43|44|(3:46|47|27)|15|(0)|18|(0)(0)|22|23|24|25|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|2|(1:(1:(1:(4:7|8|9|10)(2:12|13))(9:14|15|(1:17)|18|(2:20|21)(1:37)|22|23|24|25))(1:38))(2:48|(2:50|(1:52)))|39|(1:41)|42|43|44|(3:46|47|27)|15|(0)|18|(0)(0)|22|23|24|25|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
        
            if (r5.a(r6, r7, r8, r10, r11, r12) != r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
        
            r14 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
        
            r0 = xsna.xgx0.a;
            r1 = "VkWorkoutManagerImpl.updateWorkouts() -> " + r14.getMessage();
            r0.getClass();
            xsna.xgx0.b(r1);
            r0 = r12.$errorCallback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
        
            if (r0 != null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
        
            r0.invoke(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
        
            r12 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0050, code lost:
        
            if (r14 == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x009d A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:7:0x0010, B:14:0x0023, B:17:0x009d, B:20:0x00a4), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:7:0x0010, B:14:0x0023, B:17:0x009d, B:20:0x00a4), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            yok0 yok0Var;
            Long l;
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (Throwable th) {
                Throwable th2 = th;
                dVar = this;
            }
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$syncWorkoutData.b) {
                    s2w0 s2w0Var = this.this$0.a;
                    this.label = 1;
                    Object k = myc0.k(dgn0.f().getIo(), new n2w0(), this);
                    if (k != coroutineSingletons) {
                        k = s3q0.a;
                    }
                }
            } else if (i == 1) {
                kotlin.a.a(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                List list = (List) obj;
                k0v k0vVar = this.this$0.f;
                yok0Var = k0vVar.b;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                l = k0vVar.a;
                if (l == null) {
                    j = System.currentTimeMillis() - l.longValue();
                } else {
                    j = 0;
                }
                k0vVar.a = null;
                x1w0.b(this.this$0.g, this.$context, j);
                zpw zpwVar = this.this$0.e;
                Context context = this.$context;
                yzs<Integer, String, Long, s3q0> yzsVar = this.$workoutsSuccessfullySentCallback;
                izs<Throwable, s3q0> izsVar = this.$errorCallback;
                this.label = 3;
                dVar = this;
            }
            g2w0 g2w0Var = this.this$0;
            k0v k0vVar2 = g2w0Var.f;
            pp7 pp7Var = new pp7(g2w0Var, this.$context, this.$workoutsSuccessfullySentCallback, 1);
            k0vVar2.a = Long.valueOf(System.currentTimeMillis());
            yok0 yok0Var2 = k0vVar2.b;
            if (yok0Var2 != null) {
                yok0Var2.b(null);
            }
            k0vVar2.b = myc0.h(k0vVar2.c, null, null, new j0v(pp7Var, null), 3);
            g2w0 g2w0Var2 = this.this$0;
            Context context2 = this.$context;
            bvo0 bvo0Var = this.$timeRange;
            SelectedDataSource selectedDataSource = this.$selectedDataSource;
            this.label = 2;
            obj = g2w0.e(g2w0Var2, context2, bvo0Var, selectedDataSource, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            List list2 = (List) obj;
            k0v k0vVar3 = this.this$0.f;
            yok0Var = k0vVar3.b;
            if (yok0Var != null) {
            }
            l = k0vVar3.a;
            if (l == null) {
            }
            k0vVar3.a = null;
            x1w0.b(this.this$0.g, this.$context, j);
            zpw zpwVar2 = this.this$0.e;
            Context context3 = this.$context;
            yzs<Integer, String, Long, s3q0> yzsVar2 = this.$workoutsSuccessfullySentCallback;
            izs<Throwable, s3q0> izsVar2 = this.$errorCallback;
            this.label = 3;
            dVar = this;
        }
    }

    static {
        zrp<WorkoutMiniAppIds> h = WorkoutMiniAppIds.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<E> it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((WorkoutMiniAppIds) it.next()).i()));
        }
        j = arrayList;
    }

    public g2w0(s2w0 s2w0Var, gpt gptVar, ipt iptVar, cut cutVar, zpw zpwVar, k0v k0vVar, x1w0 x1w0Var) {
        this.a = s2w0Var;
        this.b = gptVar;
        this.c = iptVar;
        this.d = cutVar;
        this.e = zpwVar;
        this.f = k0vVar;
        this.g = x1w0Var;
    }

    public static final Object e(g2w0 g2w0Var, Context context, bvo0 bvo0Var, SelectedDataSource selectedDataSource, d dVar) {
        g2w0Var.getClass();
        int i = a.$EnumSwitchMapping$0[selectedDataSource.ordinal()];
        if (i == 1) {
            return g2w0Var.b.a(context, bvo0Var, dVar);
        }
        if (i == 2) {
            return g2w0Var.c.a(context, bvo0Var, dVar);
        }
        throw new IllegalAccessException("Access denied. Can't update data with Selected Data Source: " + selectedDataSource.name());
    }

    @Override // xsna.f2w0
    public final void a() {
        wsl b2 = uh.b.b();
        xji0.e.a();
        ((xsl) b2).c("xji0");
    }

    @Override // xsna.f2w0
    public final void b(Context context, izs<? super SelectedDataSource, s3q0> izsVar) {
        myc0.h(this.h, null, null, new b(context, izsVar, null), 3);
    }

    @Override // xsna.f2w0
    public final void c(String str) {
        xji0.e.b(str);
    }

    @Override // xsna.f2w0
    public final void d(Context context, ton0 ton0Var, bvo0 bvo0Var, izs<? super Throwable, s3q0> izsVar, yzs<? super Integer, ? super String, ? super Long, s3q0> yzsVar, SelectedDataSource selectedDataSource) {
        xgx0 xgx0Var = xgx0.a;
        String str = "VkWorkoutManagerImpl.updateWorkouts -> syncWorkoutReason: " + ton0Var.a().name();
        xgx0Var.getClass();
        xgx0.a(str);
        if (selectedDataSource != SelectedDataSource.UNKNOWN && selectedDataSource != SelectedDataSource.HUAWEI_HEALTH) {
            this.i = myc0.h(this.h, null, null, new d(ton0Var, this, context, bvo0Var, selectedDataSource, yzsVar, izsVar, null), 3);
        } else if (izsVar != null) {
            izsVar.invoke(new IllegalAccessException("Access denied. Can't update data with Selected Data Source: " + selectedDataSource.name()));
        }
    }
}
