package xsna;

import android.content.Context;
import com.vk.superapp.vkworkout.widget.api.VkWorkoutSmallWidgetUiState;
import com.vk.superapp.vkworkout.widget.impl.infrastructure.services.VkWorkoutWidgetService;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.pvj;

/* compiled from: VkWorkoutWidgetManagerImpl.kt */
/* loaded from: classes11.dex */
public final class u2w0 implements t2w0 {
    public final w6r a;
    public final bxt b;
    public final i3w0 c;
    public final i7o0 d;
    public final hpj e = zvj.a(d.a.a(whn0.a(), hqu0.a()).plus(new g(pvj.a.b)));

    /* compiled from: VkWorkoutWidgetManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.widget.impl.VkWorkoutWidgetManagerImpl$fetchHealthCommonClientConfig$1", f = "VkWorkoutWidgetManagerImpl.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = u2w0.this.new a(spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    w6r w6rVar = u2w0.this.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    if (w6rVar.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            u2w0 u2w0Var = u2w0.this;
            if (!(failure instanceof Result.Failure)) {
                xgx0.a.getClass();
                xgx0.a("VkWorkoutWidgetManagerImpl.fetchHealthCommonClientConfig() -> SUCCESS");
                u2w0Var.c(0L);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                xgx0.a.getClass();
                xgx0.c("VkWorkoutWidgetManagerImpl.fetchHealthCommonClientConfig() -> ERROR", a);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkWorkoutWidgetManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.widget.impl.VkWorkoutWidgetManagerImpl$fetchWidgetStats$1", f = "VkWorkoutWidgetManagerImpl.kt", l = {59, 62}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = u2w0.this.new b(this.$context, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object failure;
            Object obj2;
            Throwable a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (i == 0) {
                kotlin.a.a(obj);
                u2w0 u2w0Var = u2w0.this;
                Context context = this.$context;
                bxt bxtVar = u2w0Var.b;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = bxtVar.a(context, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$1;
                    kotlin.a.a(obj);
                    failure = obj2;
                    u2w0 u2w0Var2 = u2w0.this;
                    Context context2 = this.$context;
                    a = Result.a(failure);
                    if (a != null) {
                        xgx0 xgx0Var = xgx0.a;
                        String str = "VkWorkoutWidgetManagerImpl.fetchWidgetStats() ->\nonFailure: " + a.getMessage();
                        xgx0Var.getClass();
                        xgx0.b(str);
                        i7o0 i7o0Var = u2w0Var2.d;
                        i7o0.j(a);
                        u2w0Var2.b(context2);
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            failure = (VkWorkoutSmallWidgetUiState) obj;
            u2w0 u2w0Var3 = u2w0.this;
            Context context3 = this.$context;
            if (!(failure instanceof Result.Failure)) {
                i7o0 i7o0Var2 = u2w0Var3.d;
                i7o0.j(null);
                this.L$0 = null;
                this.L$1 = failure;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 2;
                if (u2w0.i(u2w0Var3, context3, (VkWorkoutSmallWidgetUiState) failure, this) != coroutineSingletons) {
                    obj2 = failure;
                    failure = obj2;
                }
                return coroutineSingletons;
            }
            u2w0 u2w0Var22 = u2w0.this;
            Context context22 = this.$context;
            a = Result.a(failure);
            if (a != null) {
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkWorkoutWidgetManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.widget.impl.VkWorkoutWidgetManagerImpl$onPermissionsDenied$1", f = "VkWorkoutWidgetManagerImpl.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return u2w0.this.new c(this.$context, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState = new VkWorkoutSmallWidgetUiState(0, 0, VkWorkoutSmallWidgetUiState.State.ACCESS_ERROR);
                u2w0 u2w0Var = u2w0.this;
                Context context = this.$context;
                this.L$0 = null;
                this.label = 1;
                if (u2w0.i(u2w0Var, context, vkWorkoutSmallWidgetUiState, this) == coroutineSingletons) {
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

    /* compiled from: VkWorkoutWidgetManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.widget.impl.VkWorkoutWidgetManagerImpl$onPermissionsGranted$1", f = "VkWorkoutWidgetManagerImpl.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* compiled from: VkWorkoutWidgetManagerImpl.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkWorkoutSmallWidgetUiState.State.values().length];
                try {
                    iArr[VkWorkoutSmallWidgetUiState.State.ACCESS_ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VkWorkoutSmallWidgetUiState.State.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VkWorkoutSmallWidgetUiState.State.COMMON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VkWorkoutSmallWidgetUiState.State.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return u2w0.this.new d(this.$context, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                i3w0 i3w0Var = u2w0.this.c;
                this.label = 1;
                obj = myc0.k(hqu0.b(), new e3w0(i3w0Var, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState = (VkWorkoutSmallWidgetUiState) obj;
            xgx0 xgx0Var = xgx0.a;
            String str = "VkWorkoutWidgetManagerImpl.onPermissionsGranted() -> previousState: " + vkWorkoutSmallWidgetUiState.d;
            xgx0Var.getClass();
            xgx0.a(str);
            int i2 = a.$EnumSwitchMapping$0[vkWorkoutSmallWidgetUiState.d.ordinal()];
            if (i2 == 1 || i2 == 2) {
                u2w0.this.g(this.$context);
            } else if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkWorkoutWidgetManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.widget.impl.VkWorkoutWidgetManagerImpl$saveVkWorkoutWidgetSyncBackgroundConfig$1", f = "VkWorkoutWidgetManagerImpl.kt", l = {38}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ List<String> $schedule;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, List<String> list, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$isEnabled = z;
            this.$schedule = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return u2w0.this.new e(this.$isEnabled, this.$schedule, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                i3w0 i3w0Var = u2w0.this.c;
                boolean z = this.$isEnabled;
                List<String> list = this.$schedule;
                this.label = 1;
                Object k = myc0.k(hqu0.b(), new h3w0(i3w0Var, z, list, null), this);
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
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkWorkoutWidgetManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkworkout.widget.impl.VkWorkoutWidgetManagerImpl$showWidgetErrorState$1", f = "VkWorkoutWidgetManagerImpl.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return u2w0.this.new f(this.$context, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xgx0.a.getClass();
                xgx0.b("VkWorkoutWidgetManagerImpl showWidgetErrorState");
                VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState = new VkWorkoutSmallWidgetUiState(0, 0, VkWorkoutSmallWidgetUiState.State.ERROR);
                u2w0 u2w0Var = u2w0.this;
                Context context = this.$context;
                this.L$0 = null;
                this.label = 1;
                if (u2w0.i(u2w0Var, context, vkWorkoutSmallWidgetUiState, this) == coroutineSingletons) {
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

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class g extends kotlin.coroutines.a implements pvj {
        @Override // xsna.pvj
        public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
            xgx0 xgx0Var = xgx0.a;
            String str = "VkWorkoutWidgetManagerImpl CoroutineExceptionHandler handle error: " + th.getMessage();
            xgx0Var.getClass();
            xgx0.b(str);
        }
    }

    public u2w0(w6r w6rVar, bxt bxtVar, i3w0 i3w0Var, i7o0 i7o0Var) {
        this.a = w6rVar;
        this.b = bxtVar;
        this.c = i3w0Var;
        this.d = i7o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(u2w0 u2w0Var, Context context, VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState, ContinuationImpl continuationImpl) {
        v2w0 v2w0Var;
        int i;
        u2w0Var.getClass();
        if (continuationImpl instanceof v2w0) {
            v2w0Var = (v2w0) continuationImpl;
            int i2 = v2w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = v2w0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = v2w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    xgx0.a.getClass();
                    xgx0.a("VkWorkoutWidgetManagerImpl populateWidgetState -> uiState = " + vkWorkoutSmallWidgetUiState);
                    i3w0 i3w0Var = u2w0Var.c;
                    v2w0Var.L$0 = context;
                    v2w0Var.L$1 = null;
                    v2w0Var.label = 1;
                    Object k = myc0.k(hqu0.b(), new g3w0(i3w0Var, vkWorkoutSmallWidgetUiState, null), v2w0Var);
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
                    context = (Context) v2w0Var.L$0;
                    kotlin.a.a(obj);
                }
                int i3 = VkWorkoutWidgetService.d;
                VkWorkoutWidgetService.a.a(context);
                return s3q0.a;
            }
        }
        v2w0Var = new v2w0(u2w0Var, continuationImpl);
        Object obj3 = v2w0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = v2w0Var.label;
        if (i != 0) {
        }
        int i32 = VkWorkoutWidgetService.d;
        VkWorkoutWidgetService.a.a(context);
        return s3q0.a;
    }

    @Override // xsna.t2w0
    public final void a() {
        wsl b2 = uh.b.b();
        j3w0.e.a();
        ((xsl) b2).c("j3w0");
    }

    @Override // xsna.t2w0
    public final void b(Context context) {
        myc0.h(this.e, null, null, new f(context, null), 3);
    }

    @Override // xsna.t2w0
    public final void c(long j) {
        j3w0.e.b(j);
    }

    @Override // xsna.t2w0
    public final void d(Context context) {
        myc0.h(this.e, null, null, new c(context, null), 3);
    }

    @Override // xsna.t2w0
    public final void e(Context context) {
        myc0.h(this.e, null, null, new d(context, null), 3);
    }

    @Override // xsna.t2w0
    public final void f() {
        myc0.h(this.e, null, null, new a(null), 3);
    }

    @Override // xsna.t2w0
    public final void g(Context context) {
        myc0.h(this.e, null, null, new b(context, null), 3);
    }

    @Override // xsna.t2w0
    public final void h(List list, boolean z) {
        myc0.h(this.e, null, null, new e(z, list, null), 3);
    }
}
