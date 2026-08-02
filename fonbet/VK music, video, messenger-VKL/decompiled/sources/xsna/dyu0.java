package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.vk.superapp.bridges.dto.analytics.VkRunPermissionItem;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;
import xsna.czu;
import xsna.d1v;
import xsna.g0v;
import xsna.pvj;

/* compiled from: VkHealthPermissionsManagerImpl.kt */
/* loaded from: classes11.dex */
public final class dyu0 implements ayu0 {
    public final ArrayList b = new ArrayList();
    public final hpj c = zvj.a(d.a.a(whn0.a(), dgn0.f().getDefault()).plus(new f(pvj.a.b)));
    public final wi50 d = bay.a();

    /* compiled from: VkHealthPermissionsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1", f = "VkHealthPermissionsManagerImpl.kt", l = {161, 162, 163, 164, 165, 166, 167, 168, 170}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<iyu0, s3q0> $block;
        final /* synthetic */ Context $context;
        final /* synthetic */ izs<Throwable, s3q0> $onError;
        final /* synthetic */ RequestedMiniApp $requestedMiniApp;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        boolean Z$4;
        int label;
        final /* synthetic */ dyu0 this$0;

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.dyu0$a$a, reason: collision with other inner class name */
        public static final class C2770a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ izs<iyu0, s3q0> $block;
            final /* synthetic */ Context $context;
            final /* synthetic */ RequestedMiniApp $requestedMiniApp;
            final /* synthetic */ iyu0 $result;
            int label;
            final /* synthetic */ dyu0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2770a(iyu0 iyu0Var, izs<? super iyu0, s3q0> izsVar, dyu0 dyu0Var, Context context, RequestedMiniApp requestedMiniApp, spj<? super C2770a> spjVar) {
                super(2, spjVar);
                this.$result = iyu0Var;
                this.$block = izsVar;
                this.this$0 = dyu0Var;
                this.$context = context;
                this.$requestedMiniApp = requestedMiniApp;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2770a(this.$result, this.$block, this.this$0, this.$context, this.$requestedMiniApp, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2770a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                xgx0 xgx0Var = xgx0.a;
                String str = "\nVkHealthPermissionsManagerImpl.getPermissionsStatus() ->\nresult: " + this.$result + ",\nthread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.a(str);
                this.$block.invoke(this.$result);
                dyu0 dyu0Var = this.this$0;
                Context context = this.$context;
                iyu0 iyu0Var = this.$result;
                RequestedMiniApp requestedMiniApp = this.$requestedMiniApp;
                ArrayList arrayList = dyu0Var.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zxu0 zxu0Var = (zxu0) ((WeakReference) it.next()).get();
                    if (zxu0Var != null) {
                        arrayList2.add(zxu0Var);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((zxu0) next).a() == requestedMiniApp) {
                        arrayList3.add(next);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((zxu0) it3.next()).c(context, iyu0Var);
                }
                return s3q0.a;
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$healthConnectPermissionsStatus$1", f = "VkHealthPermissionsManagerImpl.kt", l = {146}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super g0v>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ RequestedMiniApp $requestedMiniApp;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, RequestedMiniApp requestedMiniApp, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$context = context;
                this.$requestedMiniApp = requestedMiniApp;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$context, this.$requestedMiniApp, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super g0v> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                pxu0 pxu0Var = pxu0.a;
                Context context = this.$context;
                RequestedMiniApp requestedMiniApp = this.$requestedMiniApp;
                this.label = 1;
                Object b = pxu0.b(context, requestedMiniApp, this);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$healthConnectSdkStatus$1", f = "VkHealthPermissionsManagerImpl.kt", l = {153}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements wzs<yvj, spj<? super HealthConnectSdkStatus>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Context context, spj<? super c> spjVar) {
                super(2, spjVar);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new c(this.$context, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super HealthConnectSdkStatus> spjVar) {
                return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                pxu0 pxu0Var = pxu0.a;
                Context context = this.$context;
                this.label = 1;
                Enum c = pxu0Var.c(context, 4000L, this);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$isActivityRecognitionAvailable$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Context context, spj<? super d> spjVar) {
                super(2, spjVar);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new d(this.$context, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
                return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                Context context = this.$context;
                if (gz80.a(29)) {
                    r1 = anj.a(context, "android.permission.ACTIVITY_RECOGNITION") == 0;
                    xgx0.a.getClass();
                    xgx0.a("VkHealthAndroidPermissionsProvider.hasAndroidPermissionActivityRecognition() -> result: " + r1);
                }
                return Boolean.valueOf(r1);
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$isGoogleFitPermissionsAvailable$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class e extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ RequestedMiniApp $requestedMiniApp;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Context context, RequestedMiniApp requestedMiniApp, spj<? super e> spjVar) {
                super(2, spjVar);
                this.$context = context;
                this.$requestedMiniApp = requestedMiniApp;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new e(this.$context, this.$requestedMiniApp, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
                return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                oxu0 oxu0Var = oxu0.a;
                Context context = this.$context;
                RequestedMiniApp requestedMiniApp = this.$requestedMiniApp;
                oxu0Var.getClass();
                return Boolean.valueOf(oxu0.a(context, requestedMiniApp));
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$isGooglePlayServicesAvailable$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class f extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Context context, spj<? super f> spjVar) {
                super(2, spjVar);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new f(this.$context, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
                return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return Boolean.valueOf(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.$context) == 0);
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$isHuaweiHealthPermissionsAvailable$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class g extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
            int label;

            public g() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new g(2, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
                return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return Boolean.valueOf(yxu0.a.b());
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$isHuaweiServicesAvailable$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class h extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Context context, spj<? super h> spjVar) {
                super(2, spjVar);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new h(this.$context, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
                return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                yxu0 yxu0Var = yxu0.a;
                Context context = this.$context;
                yxu0Var.getClass();
                return Boolean.valueOf(yxu0.c(context));
            }
        }

        /* compiled from: VkHealthPermissionsManagerImpl.kt */
        @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$getPermissionsStatus$1$mobileServicesType$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class i extends SuspendLambda implements wzs<yvj, spj<? super MobileServicesType>, Object> {
            final /* synthetic */ Context $context;
            int label;
            final /* synthetic */ dyu0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(dyu0 dyu0Var, Context context, spj<? super i> spjVar) {
                super(2, spjVar);
                this.this$0 = dyu0Var;
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new i(this.this$0, this.$context, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super MobileServicesType> spjVar) {
                return ((i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return this.this$0.h(this.$context);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(RequestedMiniApp requestedMiniApp, izs<? super Throwable, s3q0> izsVar, Context context, dyu0 dyu0Var, izs<? super iyu0, s3q0> izsVar2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$requestedMiniApp = requestedMiniApp;
            this.$onError = izsVar;
            this.$context = context;
            this.this$0 = dyu0Var;
            this.$block = izsVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$requestedMiniApp, this.$onError, this.$context, this.this$0, this.$block, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x02f1, code lost:
        
            if (xsna.myc0.k(r2, r18, r26) != r0) goto L72;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x02ae  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
        /* JADX WARN: Type inference failed for: r6v13, types: [xsna.zrl] */
        /* JADX WARN: Type inference failed for: r6v17, types: [xsna.zrl] */
        /* JADX WARN: Type inference failed for: r6v9, types: [xsna.zrl] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            zrl b2;
            zrl b3;
            zrl b4;
            asl b5;
            zrl b6;
            Object J;
            zrl zrlVar;
            zrl zrlVar2;
            Object H;
            zrl zrlVar3;
            boolean z;
            zrl zrlVar4;
            Object H2;
            boolean z2;
            boolean z3;
            Object H3;
            boolean z4;
            boolean z5;
            zrl zrlVar5;
            zrl zrlVar6;
            Object H4;
            boolean z6;
            zrl zrlVar7;
            boolean z7;
            boolean z8;
            zrl zrlVar8;
            zrl zrlVar9;
            boolean z9;
            Object H5;
            zrl zrlVar10;
            boolean z10;
            g0v g0vVar;
            Object H6;
            Object H7;
            HealthConnectSdkStatus healthConnectSdkStatus;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            g0v g0vVar2;
            boolean z15;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            try {
            } catch (Throwable th) {
                xgx0 xgx0Var = xgx0.a;
                String str = "\nVkHealthPermissionsManagerImpl.getPermissionsStatus() -> Error dew to method evaluation. This could cause a bug for WebApps\nthrowable: " + th + ",\nstackTrace: " + mnh0.A(th) + ",\nthread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.b(str);
                izs<Throwable, s3q0> izsVar = this.$onError;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
            }
            switch (this.label) {
                case 0:
                    kotlin.a.a(obj);
                    yvj yvjVar = (yvj) this.L$0;
                    xgx0 xgx0Var2 = xgx0.a;
                    String str2 = "VkHealthPermissionsManagerImpl.getPermissionsStatus() -> requested mini app: " + this.$requestedMiniApp.name();
                    xgx0Var2.getClass();
                    xgx0.a(str2);
                    asl b7 = myc0.b(yvjVar, null, null, new d(this.$context, null), 3);
                    asl b8 = myc0.b(yvjVar, null, null, new e(this.$context, this.$requestedMiniApp, null), 3);
                    b2 = myc0.b(yvjVar, null, null, new f(this.$context, null), 3);
                    b3 = myc0.b(yvjVar, null, null, new h(this.$context, null), 3);
                    b4 = myc0.b(yvjVar, null, null, new g(2, null), 3);
                    asl b9 = myc0.b(yvjVar, null, null, new b(this.$context, this.$requestedMiniApp, null), 3);
                    b5 = myc0.b(yvjVar, null, null, new c(this.$context, null), 3);
                    b6 = myc0.b(yvjVar, null, null, new i(this.this$0, this.$context, null), 3);
                    this.L$0 = b8;
                    this.L$1 = b2;
                    this.L$2 = b3;
                    this.L$3 = b4;
                    this.L$4 = b9;
                    this.L$5 = b5;
                    this.L$6 = b6;
                    this.label = 1;
                    J = b7.J(this);
                    if (J != coroutineSingletons) {
                        zrlVar = b8;
                        zrlVar2 = b9;
                        boolean booleanValue = ((Boolean) J).booleanValue();
                        this.L$0 = zrlVar;
                        this.L$1 = b3;
                        this.L$2 = b4;
                        this.L$3 = zrlVar2;
                        this.L$4 = b5;
                        this.L$5 = b6;
                        this.L$6 = null;
                        this.Z$0 = booleanValue;
                        this.label = 2;
                        H = b2.H(this);
                        if (H == coroutineSingletons) {
                            zrlVar3 = b6;
                            z = booleanValue;
                            zrlVar4 = zrlVar;
                            boolean booleanValue2 = ((Boolean) H).booleanValue();
                            this.L$0 = b3;
                            this.L$1 = b4;
                            this.L$2 = zrlVar2;
                            this.L$3 = b5;
                            this.L$4 = zrlVar3;
                            this.L$5 = null;
                            this.Z$0 = z;
                            this.Z$1 = booleanValue2;
                            this.label = 3;
                            H2 = zrlVar4.H(this);
                            if (H2 == coroutineSingletons) {
                                z2 = z;
                                z3 = booleanValue2;
                                boolean booleanValue3 = ((Boolean) H2).booleanValue();
                                this.L$0 = b4;
                                this.L$1 = zrlVar2;
                                this.L$2 = b5;
                                this.L$3 = zrlVar3;
                                this.L$4 = null;
                                this.Z$0 = z2;
                                this.Z$1 = z3;
                                this.Z$2 = booleanValue3;
                                this.label = 4;
                                H3 = b3.H(this);
                                if (H3 == coroutineSingletons) {
                                    z4 = z3;
                                    z5 = booleanValue3;
                                    zrlVar5 = zrlVar2;
                                    zrlVar6 = b5;
                                    boolean booleanValue4 = ((Boolean) H3).booleanValue();
                                    this.L$0 = zrlVar5;
                                    this.L$1 = zrlVar6;
                                    this.L$2 = zrlVar3;
                                    this.L$3 = null;
                                    this.Z$0 = z2;
                                    this.Z$1 = z4;
                                    this.Z$2 = z5;
                                    this.Z$3 = booleanValue4;
                                    this.label = 5;
                                    H4 = b4.H(this);
                                    if (H4 == coroutineSingletons) {
                                        boolean z16 = z2;
                                        z6 = z5;
                                        zrlVar7 = zrlVar3;
                                        z7 = z4;
                                        z8 = booleanValue4;
                                        zrlVar8 = zrlVar5;
                                        zrlVar9 = zrlVar6;
                                        z9 = z16;
                                        boolean booleanValue5 = ((Boolean) H4).booleanValue();
                                        this.L$0 = zrlVar9;
                                        this.L$1 = zrlVar7;
                                        this.L$2 = null;
                                        this.Z$0 = z9;
                                        this.Z$1 = z7;
                                        this.Z$2 = z6;
                                        this.Z$3 = z8;
                                        this.Z$4 = booleanValue5;
                                        this.label = 6;
                                        H5 = zrlVar8.H(this);
                                        if (H5 == coroutineSingletons) {
                                            zrlVar10 = zrlVar7;
                                            z10 = booleanValue5;
                                            g0vVar = (g0v) H5;
                                            this.L$0 = zrlVar10;
                                            this.L$1 = g0vVar;
                                            this.Z$0 = z9;
                                            this.Z$1 = z7;
                                            this.Z$2 = z6;
                                            this.Z$3 = z8;
                                            this.Z$4 = z10;
                                            this.label = 7;
                                            H6 = zrlVar9.H(this);
                                            if (H6 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            HealthConnectSdkStatus healthConnectSdkStatus2 = (HealthConnectSdkStatus) H6;
                                            this.L$0 = g0vVar;
                                            this.L$1 = healthConnectSdkStatus2;
                                            this.Z$0 = z9;
                                            this.Z$1 = z7;
                                            this.Z$2 = z6;
                                            this.Z$3 = z8;
                                            this.Z$4 = z10;
                                            this.label = 8;
                                            H7 = zrlVar10.H(this);
                                            if (H7 != coroutineSingletons) {
                                                healthConnectSdkStatus = healthConnectSdkStatus2;
                                                z11 = z10;
                                                z12 = z8;
                                                z13 = z6;
                                                z14 = z7;
                                                g0vVar2 = g0vVar;
                                                z15 = z9;
                                                iyu0 iyu0Var = new iyu0(z15, z14, z13, z12, z11, g0vVar2, healthConnectSdkStatus, (MobileServicesType) H7);
                                                ge00 main = dgn0.f().getMain();
                                                C2770a c2770a = new C2770a(iyu0Var, this.$block, this.this$0, this.$context, this.$requestedMiniApp, null);
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.label = 9;
                                                break;
                                            } else {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    return coroutineSingletons;
                                }
                            } else {
                                return coroutineSingletons;
                            }
                        } else {
                            return coroutineSingletons;
                        }
                    } else {
                        return coroutineSingletons;
                    }
                case 1:
                    b6 = (zrl) this.L$6;
                    ?? r6 = (zrl) this.L$5;
                    zrlVar2 = (zrl) this.L$4;
                    b4 = (zrl) this.L$3;
                    b3 = (zrl) this.L$2;
                    b2 = (zrl) this.L$1;
                    zrlVar = (zrl) this.L$0;
                    kotlin.a.a(obj);
                    b5 = r6;
                    J = obj;
                    boolean booleanValue6 = ((Boolean) J).booleanValue();
                    this.L$0 = zrlVar;
                    this.L$1 = b3;
                    this.L$2 = b4;
                    this.L$3 = zrlVar2;
                    this.L$4 = b5;
                    this.L$5 = b6;
                    this.L$6 = null;
                    this.Z$0 = booleanValue6;
                    this.label = 2;
                    H = b2.H(this);
                    if (H == coroutineSingletons) {
                    }
                    break;
                case 2:
                    z = this.Z$0;
                    zrl zrlVar11 = (zrl) this.L$5;
                    ?? r62 = (zrl) this.L$4;
                    zrlVar2 = (zrl) this.L$3;
                    b4 = (zrl) this.L$2;
                    b3 = (zrl) this.L$1;
                    zrlVar4 = (zrl) this.L$0;
                    kotlin.a.a(obj);
                    b5 = r62;
                    zrlVar3 = zrlVar11;
                    H = obj;
                    boolean booleanValue22 = ((Boolean) H).booleanValue();
                    this.L$0 = b3;
                    this.L$1 = b4;
                    this.L$2 = zrlVar2;
                    this.L$3 = b5;
                    this.L$4 = zrlVar3;
                    this.L$5 = null;
                    this.Z$0 = z;
                    this.Z$1 = booleanValue22;
                    this.label = 3;
                    H2 = zrlVar4.H(this);
                    if (H2 == coroutineSingletons) {
                    }
                    break;
                case 3:
                    z3 = this.Z$1;
                    boolean z17 = this.Z$0;
                    zrl zrlVar12 = (zrl) this.L$4;
                    ?? r63 = (zrl) this.L$3;
                    zrlVar2 = (zrl) this.L$2;
                    b4 = (zrl) this.L$1;
                    b3 = (zrl) this.L$0;
                    kotlin.a.a(obj);
                    b5 = r63;
                    zrlVar3 = zrlVar12;
                    z2 = z17;
                    H2 = obj;
                    boolean booleanValue32 = ((Boolean) H2).booleanValue();
                    this.L$0 = b4;
                    this.L$1 = zrlVar2;
                    this.L$2 = b5;
                    this.L$3 = zrlVar3;
                    this.L$4 = null;
                    this.Z$0 = z2;
                    this.Z$1 = z3;
                    this.Z$2 = booleanValue32;
                    this.label = 4;
                    H3 = b3.H(this);
                    if (H3 == coroutineSingletons) {
                    }
                    break;
                case 4:
                    z5 = this.Z$2;
                    z4 = this.Z$1;
                    z2 = this.Z$0;
                    zrlVar3 = (zrl) this.L$3;
                    zrlVar6 = (zrl) this.L$2;
                    zrl zrlVar13 = (zrl) this.L$1;
                    zrl zrlVar14 = (zrl) this.L$0;
                    kotlin.a.a(obj);
                    zrlVar5 = zrlVar13;
                    b4 = zrlVar14;
                    H3 = obj;
                    boolean booleanValue42 = ((Boolean) H3).booleanValue();
                    this.L$0 = zrlVar5;
                    this.L$1 = zrlVar6;
                    this.L$2 = zrlVar3;
                    this.L$3 = null;
                    this.Z$0 = z2;
                    this.Z$1 = z4;
                    this.Z$2 = z5;
                    this.Z$3 = booleanValue42;
                    this.label = 5;
                    H4 = b4.H(this);
                    if (H4 == coroutineSingletons) {
                    }
                    break;
                case 5:
                    boolean z18 = this.Z$3;
                    boolean z19 = this.Z$2;
                    boolean z20 = this.Z$1;
                    boolean z21 = this.Z$0;
                    zrl zrlVar15 = (zrl) this.L$2;
                    zrl zrlVar16 = (zrl) this.L$1;
                    zrlVar8 = (zrl) this.L$0;
                    kotlin.a.a(obj);
                    z8 = z18;
                    zrlVar7 = zrlVar15;
                    z9 = z21;
                    z7 = z20;
                    z6 = z19;
                    zrlVar9 = zrlVar16;
                    H4 = obj;
                    boolean booleanValue52 = ((Boolean) H4).booleanValue();
                    this.L$0 = zrlVar9;
                    this.L$1 = zrlVar7;
                    this.L$2 = null;
                    this.Z$0 = z9;
                    this.Z$1 = z7;
                    this.Z$2 = z6;
                    this.Z$3 = z8;
                    this.Z$4 = booleanValue52;
                    this.label = 6;
                    H5 = zrlVar8.H(this);
                    if (H5 == coroutineSingletons) {
                    }
                    break;
                case 6:
                    z10 = this.Z$4;
                    z8 = this.Z$3;
                    z6 = this.Z$2;
                    z7 = this.Z$1;
                    z9 = this.Z$0;
                    zrlVar10 = (zrl) this.L$1;
                    zrl zrlVar17 = (zrl) this.L$0;
                    kotlin.a.a(obj);
                    zrlVar9 = zrlVar17;
                    H5 = obj;
                    g0vVar = (g0v) H5;
                    this.L$0 = zrlVar10;
                    this.L$1 = g0vVar;
                    this.Z$0 = z9;
                    this.Z$1 = z7;
                    this.Z$2 = z6;
                    this.Z$3 = z8;
                    this.Z$4 = z10;
                    this.label = 7;
                    H6 = zrlVar9.H(this);
                    if (H6 == coroutineSingletons) {
                    }
                    HealthConnectSdkStatus healthConnectSdkStatus22 = (HealthConnectSdkStatus) H6;
                    this.L$0 = g0vVar;
                    this.L$1 = healthConnectSdkStatus22;
                    this.Z$0 = z9;
                    this.Z$1 = z7;
                    this.Z$2 = z6;
                    this.Z$3 = z8;
                    this.Z$4 = z10;
                    this.label = 8;
                    H7 = zrlVar10.H(this);
                    if (H7 != coroutineSingletons) {
                    }
                    break;
                case 7:
                    z10 = this.Z$4;
                    z8 = this.Z$3;
                    z6 = this.Z$2;
                    z7 = this.Z$1;
                    z9 = this.Z$0;
                    g0v g0vVar3 = (g0v) this.L$1;
                    zrl zrlVar18 = (zrl) this.L$0;
                    kotlin.a.a(obj);
                    g0vVar = g0vVar3;
                    zrlVar10 = zrlVar18;
                    H6 = obj;
                    HealthConnectSdkStatus healthConnectSdkStatus222 = (HealthConnectSdkStatus) H6;
                    this.L$0 = g0vVar;
                    this.L$1 = healthConnectSdkStatus222;
                    this.Z$0 = z9;
                    this.Z$1 = z7;
                    this.Z$2 = z6;
                    this.Z$3 = z8;
                    this.Z$4 = z10;
                    this.label = 8;
                    H7 = zrlVar10.H(this);
                    if (H7 != coroutineSingletons) {
                    }
                    break;
                case 8:
                    boolean z22 = this.Z$4;
                    boolean z23 = this.Z$3;
                    boolean z24 = this.Z$2;
                    boolean z25 = this.Z$1;
                    boolean z26 = this.Z$0;
                    HealthConnectSdkStatus healthConnectSdkStatus3 = (HealthConnectSdkStatus) this.L$1;
                    g0v g0vVar4 = (g0v) this.L$0;
                    kotlin.a.a(obj);
                    healthConnectSdkStatus = healthConnectSdkStatus3;
                    H7 = obj;
                    z11 = z22;
                    z12 = z23;
                    z13 = z24;
                    z14 = z25;
                    z15 = z26;
                    g0vVar2 = g0vVar4;
                    iyu0 iyu0Var2 = new iyu0(z15, z14, z13, z12, z11, g0vVar2, healthConnectSdkStatus, (MobileServicesType) H7);
                    ge00 main2 = dgn0.f().getMain();
                    C2770a c2770a2 = new C2770a(iyu0Var2, this.$block, this.this$0, this.$context, this.$requestedMiniApp, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 9;
                    break;
                case 9:
                    kotlin.a.a(obj);
                    return s3q0.a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: VkHealthPermissionsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$onActivityResult$1", f = "VkHealthPermissionsManagerImpl.kt", l = {398, JsonToken.BEGIN_ARRAY, 92}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i, int i2, Intent intent, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.$requestCode = i;
            this.$resultCode = i2;
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return dyu0.this.new b(this.$context, this.$requestCode, this.$resultCode, this.$data, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            ui50 ui50Var;
            Context context;
            Intent intent;
            Context context2;
            ui50 ui50Var2;
            yxu0 yxu0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    kotlin.a.a(obj);
                    wi50 wi50Var = dyu0.this.d;
                    Context context3 = this.$context;
                    int i4 = this.$requestCode;
                    int i5 = this.$resultCode;
                    Intent intent2 = this.$data;
                    this.L$0 = wi50Var;
                    this.L$1 = context3;
                    this.L$2 = intent2;
                    this.I$0 = i4;
                    this.I$1 = i5;
                    this.label = 1;
                    if (wi50Var.b(this) != coroutineSingletons) {
                        i = i4;
                        i2 = i5;
                        ui50Var = wi50Var;
                        context = context3;
                        intent = intent2;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var2 = (ui50) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            s3q0 s3q0Var = s3q0.a;
                            ui50Var2.c(null);
                            return s3q0.a;
                        } catch (Throwable th) {
                            th = th;
                            ui50Var2.c(null);
                            throw th;
                        }
                    }
                    int i6 = this.I$1;
                    int i7 = this.I$0;
                    Intent intent3 = (Intent) this.L$2;
                    Context context4 = (Context) this.L$1;
                    ui50 ui50Var3 = (ui50) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        ui50Var = ui50Var3;
                        intent = intent3;
                        i = i7;
                        context2 = context4;
                        i2 = i6;
                        yxu0Var = yxu0.a;
                        this.L$0 = ui50Var;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (yxu0Var.d(context2, i, i2, intent, this) != coroutineSingletons) {
                            ui50Var2 = ui50Var;
                            s3q0 s3q0Var2 = s3q0.a;
                            ui50Var2.c(null);
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        ui50Var2 = ui50Var3;
                        ui50Var2.c(null);
                        throw th;
                    }
                }
                int i8 = this.I$1;
                i = this.I$0;
                Intent intent4 = (Intent) this.L$2;
                Context context5 = (Context) this.L$1;
                ui50Var = (ui50) this.L$0;
                kotlin.a.a(obj);
                i2 = i8;
                context = context5;
                intent = intent4;
                oxu0 oxu0Var = oxu0.a;
                this.L$0 = ui50Var;
                this.L$1 = context;
                this.L$2 = intent;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 2;
                context2 = context;
                if (oxu0Var.b(context2, i, i2, intent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                yxu0Var = yxu0.a;
                this.L$0 = ui50Var;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (yxu0Var.d(context2, i, i2, intent, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                ui50Var2 = ui50Var;
                ui50Var2.c(null);
                throw th;
            }
        }
    }

    /* compiled from: VkHealthPermissionsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$requestGoogleFitPermissions$1", f = "VkHealthPermissionsManagerImpl.kt", l = {230, 234, 238}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kxu0 $componentWrapper;
        final /* synthetic */ gzs<s3q0> $onDenied;
        final /* synthetic */ gzs<s3q0> $onGranted;
        final /* synthetic */ RequestedMiniApp $requestedMiniApp;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ dyu0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kxu0 kxu0Var, dyu0 dyu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$componentWrapper = kxu0Var;
            this.this$0 = dyu0Var;
            this.$onGranted = gzsVar;
            this.$onDenied = gzsVar2;
            this.$requestedMiniApp = requestedMiniApp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = new c(this.$componentWrapper, this.this$0, this.$onGranted, this.$onDenied, this.$requestedMiniApp, spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00df, code lost:
        
            if (xsna.dyu0.p(r3, r4, r5, r6, r7, r8, r9) == r2) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00cc A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:13:0x00ab, B:15:0x00cc, B:20:0x00e2, B:35:0x008b, B:39:0x0098), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e2 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:13:0x00ab, B:15:0x00cc, B:20:0x00e2, B:35:0x008b, B:39:0x0098), top: B:2:0x000c }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            Context context;
            c cVar;
            int i;
            Context context2;
            Object E;
            boolean booleanValue;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                xgx0 xgx0Var = xgx0.a;
                String str = "\nVkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> Error dew to method evaluation. This could cause a bug for WebApps\nthrowable: " + th + ",\nstackTrace: " + mnh0.A(th) + ",\nthread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.b(str);
                return s3q0.a;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        Context context3 = (Context) this.L$0;
                        kotlin.a.a(obj);
                        E = obj;
                        i = 3;
                        context2 = context3;
                        cVar = this;
                        booleanValue = ((Boolean) E).booleanValue();
                        xgx0.a.getClass();
                        xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> isPermissionGranted: " + booleanValue);
                        dyu0.r(cVar.this$0, booleanValue);
                        if (booleanValue) {
                            xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> onDenied.invoke()");
                            cVar.$onDenied.invoke();
                        } else {
                            dyu0 dyu0Var = cVar.this$0;
                            kxu0 kxu0Var = cVar.$componentWrapper;
                            gzs<s3q0> gzsVar = cVar.$onGranted;
                            gzs<s3q0> gzsVar2 = cVar.$onDenied;
                            RequestedMiniApp requestedMiniApp = cVar.$requestedMiniApp;
                            cVar.L$0 = null;
                            cVar.label = i;
                        }
                        return s3q0.a;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            try {
                kxu0 kxu0Var2 = this.$componentWrapper;
                context = kxu0Var2.b;
                if (context == null) {
                    Fragment fragment = kxu0Var2.a;
                    context = fragment != null ? fragment.mo2getContext() : null;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                xgx0 xgx0Var2 = xgx0.a;
                String str2 = "\nVkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> Error dew to method evaluation. This could cause a bug for WebApps\nthrowable: " + th + ",\nstackTrace: " + mnh0.A(th) + ",\nthread: " + Thread.currentThread().getName();
                xgx0Var2.getClass();
                xgx0.b(str2);
                return s3q0.a;
            }
            if (context == null) {
                gzs<s3q0> gzsVar3 = this.$onDenied;
                xgx0.a.getClass();
                xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() ->  onDenied.invoke() in case on null context");
                gzsVar3.invoke();
                return s3q0.a;
            }
            boolean r = xx1.r(context);
            xgx0.a.getClass();
            xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> isActivityRecognitionAvailable: " + r);
            if (r) {
                Context context4 = context;
                dyu0 dyu0Var2 = this.this$0;
                kxu0 kxu0Var3 = this.$componentWrapper;
                gzs<s3q0> gzsVar4 = this.$onGranted;
                gzs<s3q0> gzsVar5 = this.$onDenied;
                RequestedMiniApp requestedMiniApp2 = this.$requestedMiniApp;
                this.label = 1;
                if (dyu0.p(dyu0Var2, kxu0Var3, context4, gzsVar4, gzsVar5, requestedMiniApp2, this) == coroutineSingletons) {
                }
                return s3q0.a;
            }
            cVar = this;
            i = 3;
            context2 = context;
            xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> call requestActivityRecognitionPermission()");
            cVar.L$0 = context2;
            cVar.label = 2;
            E = xx1.E(context2, this);
            if (E == coroutineSingletons) {
            }
            booleanValue = ((Boolean) E).booleanValue();
            xgx0.a.getClass();
            xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> isPermissionGranted: " + booleanValue);
            dyu0.r(cVar.this$0, booleanValue);
            if (booleanValue) {
            }
            return s3q0.a;
            return coroutineSingletons;
        }
    }

    /* compiled from: VkHealthPermissionsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$requestHealthConnectPermissions$1", f = "VkHealthPermissionsManagerImpl.kt", l = {269, 273, 277}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kxu0 $componentWrapper;
        final /* synthetic */ gzs<s3q0> $onDenied;
        final /* synthetic */ gzs<s3q0> $onGranted;
        final /* synthetic */ RequestedMiniApp $requestedMiniApp;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ dyu0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kxu0 kxu0Var, dyu0 dyu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$componentWrapper = kxu0Var;
            this.this$0 = dyu0Var;
            this.$onGranted = gzsVar;
            this.$onDenied = gzsVar2;
            this.$requestedMiniApp = requestedMiniApp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            d dVar = new d(this.$componentWrapper, this.this$0, this.$onGranted, this.$onDenied, this.$requestedMiniApp, spjVar);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00d4, code lost:
        
            if (xsna.dyu0.q(r1, r2, r3, r4, r5, r6, r7) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            if (xsna.dyu0.q(r6, r7, r8, r9, r10, r11, r13) == r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Context context;
            d dVar;
            Context context2;
            boolean booleanValue;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        context2 = (Context) this.L$0;
                        kotlin.a.a(obj);
                        dVar = this;
                        booleanValue = ((Boolean) obj).booleanValue();
                        xgx0.a.getClass();
                        xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> isPermissionGranted: " + booleanValue);
                        dyu0.r(dVar.this$0, booleanValue);
                        if (booleanValue) {
                            xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> onDenied.invoke()");
                            dVar.$onDenied.invoke();
                        } else {
                            Context context3 = context2;
                            dyu0 dyu0Var = dVar.this$0;
                            kxu0 kxu0Var = dVar.$componentWrapper;
                            gzs<s3q0> gzsVar = dVar.$onGranted;
                            gzs<s3q0> gzsVar2 = dVar.$onDenied;
                            RequestedMiniApp requestedMiniApp = dVar.$requestedMiniApp;
                            dVar.L$0 = null;
                            dVar.label = 3;
                        }
                        return s3q0.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            kxu0 kxu0Var2 = this.$componentWrapper;
            Context context4 = kxu0Var2.b;
            if (context4 == null) {
                Fragment fragment = kxu0Var2.a;
                if (fragment != null) {
                    context4 = fragment.mo2getContext();
                } else {
                    context = null;
                    if (context != null) {
                        gzs<s3q0> gzsVar3 = this.$onDenied;
                        xgx0.a.getClass();
                        xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() ->  onDenied.invoke() in case on null context");
                        gzsVar3.invoke();
                        return s3q0.a;
                    }
                    boolean r = xx1.r(context);
                    xgx0.a.getClass();
                    xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> isActivityRecognitionAvailable: " + r);
                    if (r) {
                        dyu0 dyu0Var2 = this.this$0;
                        kxu0 kxu0Var3 = this.$componentWrapper;
                        gzs<s3q0> gzsVar4 = this.$onGranted;
                        gzs<s3q0> gzsVar5 = this.$onDenied;
                        RequestedMiniApp requestedMiniApp2 = this.$requestedMiniApp;
                        this.label = 1;
                    } else {
                        dVar = this;
                        xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> call requestActivityRecognitionPermission()");
                        dVar.L$0 = context;
                        dVar.label = 2;
                        obj = xx1.E(context, this);
                        if (obj != coroutineSingletons) {
                            context2 = context;
                            booleanValue = ((Boolean) obj).booleanValue();
                            xgx0.a.getClass();
                            xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> isPermissionGranted: " + booleanValue);
                            dyu0.r(dVar.this$0, booleanValue);
                            if (booleanValue) {
                            }
                            return s3q0.a;
                        }
                    }
                }
            }
            context = context4;
            if (context != null) {
            }
            return coroutineSingletons;
        }
    }

    /* compiled from: VkHealthPermissionsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$requestHuaweiHealthPermissions$1", f = "VkHealthPermissionsManagerImpl.kt", l = {350}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kxu0 $componentWrapper;
        final /* synthetic */ gzs<s3q0> $onDenied;
        final /* synthetic */ gzs<s3q0> $onGranted;
        int label;
        final /* synthetic */ dyu0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, dyu0 dyu0Var, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$componentWrapper = kxu0Var;
            this.$onGranted = gzsVar;
            this.$onDenied = gzsVar2;
            this.this$0 = dyu0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new e(this.$componentWrapper, this.$onGranted, this.$onDenied, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                kxu0 kxu0Var = this.$componentWrapper;
                Context context = kxu0Var.b;
                if (context == null) {
                    Fragment fragment = kxu0Var.a;
                    context = fragment != null ? fragment.mo2getContext() : null;
                }
                if (context == null) {
                    return s3q0.a;
                }
                if (xx1.r(context)) {
                    yxu0.a.e(this.$componentWrapper, this.$onGranted, this.$onDenied);
                    return s3q0.a;
                }
                this.label = 1;
                obj = xx1.E(context, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            dyu0.r(this.this$0, booleanValue);
            if (booleanValue) {
                yxu0.a.e(this.$componentWrapper, this.$onGranted, this.$onDenied);
            } else {
                this.$onDenied.invoke();
            }
            return s3q0.a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class f extends kotlin.coroutines.a implements pvj {
        @Override // xsna.pvj
        public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
            xgx0 xgx0Var = xgx0.a;
            String str = "VkHealthPermissionsManagerImpl CoroutineExceptionHandler handle error: " + th.getMessage() + ", " + mnh0.A(th);
            xgx0Var.getClass();
            xgx0.b(str);
        }
    }

    /* compiled from: VkHealthPermissionsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$tryToProcessFitnessError$1", f = "VkHealthPermissionsManagerImpl.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th, spj<? super g> spjVar) {
            super(2, spjVar);
            this.$throwable = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new g(this.$throwable, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object k;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Throwable th = this.$throwable;
                this.label = 1;
                if (th instanceof ApiException) {
                    xgx0 xgx0Var = xgx0.a;
                    StringBuilder sb = new StringBuilder("VkHealthGoogleFitAvailabilityStorage.tryToProcessFitnessError() -> statusCode: ");
                    ApiException apiException = (ApiException) th;
                    sb.append(apiException.g());
                    String sb2 = sb.toString();
                    xgx0Var.getClass();
                    xgx0.a(sb2);
                    int g = apiException.g();
                    if (g == 4 || g == 5000) {
                        k = myc0.k(dgn0.f().getIo(), new lxu0(false, null), this);
                        if (k != obj2) {
                            k = s3q0.a;
                        }
                        if (k != obj2) {
                            k = s3q0.a;
                        }
                    } else {
                        k = s3q0.a;
                    }
                } else {
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

    public static final Object p(dyu0 dyu0Var, kxu0 kxu0Var, Context context, gzs gzsVar, gzs gzsVar2, RequestedMiniApp requestedMiniApp, c cVar) {
        dyu0Var.getClass();
        oxu0.a.getClass();
        boolean a2 = oxu0.a(context, requestedMiniApp);
        xgx0.a.getClass();
        xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> isGoogleFitPermissionsAvailable: " + a2);
        if (!a2) {
            xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> call VkHealthGoogleFitPermissionsProviderNew.requestGoogleFitPermissions()");
            Object c2 = oxu0.c(kxu0Var, requestedMiniApp, new fyu0(dyu0Var, context, requestedMiniApp, gzsVar, null), new gyu0(gzsVar2, null), cVar);
            return c2 == CoroutineSingletons.COROUTINE_SUSPENDED ? c2 : s3q0.a;
        }
        xgx0.a("VkHealthPermissionsManagerImpl.requestGoogleFitPermissions() -> onGranted.invoke()");
        dyu0Var.s(context, requestedMiniApp);
        gzsVar.invoke();
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r12 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(dyu0 dyu0Var, kxu0 kxu0Var, Context context, gzs gzsVar, gzs gzsVar2, RequestedMiniApp requestedMiniApp, ContinuationImpl continuationImpl) {
        hyu0 hyu0Var;
        int i;
        boolean f2;
        Context context2;
        gzs gzsVar3;
        RequestedMiniApp requestedMiniApp2;
        dyu0Var.getClass();
        if (continuationImpl instanceof hyu0) {
            hyu0Var = (hyu0) continuationImpl;
            int i2 = hyu0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hyu0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = hyu0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hyu0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    pxu0 pxu0Var = pxu0.a;
                    hyu0Var.L$0 = kxu0Var;
                    hyu0Var.L$1 = context;
                    hyu0Var.L$2 = gzsVar;
                    hyu0Var.L$3 = gzsVar2;
                    hyu0Var.L$4 = requestedMiniApp;
                    hyu0Var.label = 1;
                    obj = pxu0.b(context, requestedMiniApp, hyu0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        requestedMiniApp2 = (RequestedMiniApp) hyu0Var.L$3;
                        gzsVar3 = (gzs) hyu0Var.L$2;
                        gzsVar = (gzs) hyu0Var.L$1;
                        context2 = (Context) hyu0Var.L$0;
                        kotlin.a.a(obj);
                        f2 = ((Boolean) obj).booleanValue();
                        Context context3 = context2;
                        gzsVar2 = gzsVar3;
                        context = context3;
                        requestedMiniApp = requestedMiniApp2;
                        if (f2) {
                            xgx0.a.getClass();
                            xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> onGranted.invoke()");
                            dyu0Var.s(context, requestedMiniApp);
                            gzsVar.invoke();
                        } else {
                            xgx0.a.getClass();
                            xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> onDenied.invoke()");
                            gzsVar2.invoke();
                        }
                        return s3q0.a;
                    }
                    requestedMiniApp = (RequestedMiniApp) hyu0Var.L$4;
                    gzsVar2 = (gzs) hyu0Var.L$3;
                    gzsVar = (gzs) hyu0Var.L$2;
                    context = (Context) hyu0Var.L$1;
                    kxu0Var = (kxu0) hyu0Var.L$0;
                    kotlin.a.a(obj);
                }
                g0v g0vVar = (g0v) obj;
                xgx0.a.getClass();
                xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> healthConnectPermissionsStatus: " + g0vVar);
                f2 = epx.f(g0vVar, g0v.b.a);
                if (!f2) {
                    pxu0 pxu0Var2 = pxu0.a;
                    hyu0Var.L$0 = context;
                    hyu0Var.L$1 = gzsVar;
                    hyu0Var.L$2 = gzsVar2;
                    hyu0Var.L$3 = requestedMiniApp;
                    hyu0Var.L$4 = null;
                    hyu0Var.label = 2;
                    obj = pxu0.e(kxu0Var, requestedMiniApp, hyu0Var);
                    if (obj != coroutineSingletons) {
                        gzs gzsVar4 = gzsVar2;
                        context2 = context;
                        gzsVar3 = gzsVar4;
                        requestedMiniApp2 = requestedMiniApp;
                        f2 = ((Boolean) obj).booleanValue();
                        Context context32 = context2;
                        gzsVar2 = gzsVar3;
                        context = context32;
                        requestedMiniApp = requestedMiniApp2;
                    }
                    return coroutineSingletons;
                }
                if (f2) {
                }
                return s3q0.a;
            }
        }
        hyu0Var = new hyu0(dyu0Var, continuationImpl);
        Object obj2 = hyu0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hyu0Var.label;
        if (i != 0) {
        }
        g0v g0vVar2 = (g0v) obj2;
        xgx0.a.getClass();
        xgx0.a("VkHealthPermissionsManagerImpl.requestHealthConnectPermissions() -> healthConnectPermissionsStatus: " + g0vVar2);
        f2 = epx.f(g0vVar2, g0v.b.a);
        if (!f2) {
        }
        if (f2) {
        }
        return s3q0.a;
    }

    public static final void r(dyu0 dyu0Var, boolean z) {
        dyu0Var.getClass();
        List<VkRunPermissionItem> singletonList = Collections.singletonList(new VkRunPermissionItem(VkRunPermissionItem.VkRunPermission.ACTIVITY_RECOGNITION, z));
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        udx0Var.e(singletonList);
    }

    @Override // xsna.ayu0
    public final Set<String> a(RequestedMiniApp requestedMiniApp) {
        if (!gz80.a(26)) {
            return EmptySet.b;
        }
        pxu0 pxu0Var = pxu0.a;
        return pxu0.a(requestedMiniApp);
    }

    @Override // xsna.ayu0
    public final boolean b(Context context) {
        return gcd0.n(context);
    }

    @Override // xsna.ayu0
    public final void c(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        myc0.h(this.c, null, null, new e(kxu0Var, gzsVar, gzsVar2, this, null), 3);
    }

    @Override // xsna.ayu0
    public final void d(d1v.b bVar) {
        this.b.add(new WeakReference(bVar));
    }

    @Override // xsna.ayu0
    public final void e(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp) {
        myc0.h(this.c, null, null, new c(kxu0Var, this, gzsVar, gzsVar2, requestedMiniApp, null), 3);
    }

    @Override // xsna.ayu0
    public final void f(Throwable th) {
        myc0.h(this.c, null, null, new g(th, null), 3);
    }

    @Override // xsna.ayu0
    public final Intent g() {
        if (!gz80.a(26)) {
            return new Intent("android.settings.SETTINGS");
        }
        czu.a.getClass();
        return new Intent(czu.b.a());
    }

    @Override // xsna.ayu0
    public final MobileServicesType h(Context context) {
        if (gcd0.n(context)) {
            return MobileServicesType.GOOGLE_PLAY;
        }
        yxu0.a.getClass();
        return yxu0.c(context) ? MobileServicesType.HUAWEI : MobileServicesType.NONE;
    }

    @Override // xsna.ayu0
    public final void i(Context context, xgb0 xgb0Var) {
        myc0.h(this.c, null, null, new eyu0(context, xgb0Var, null), 3);
    }

    @Override // xsna.ayu0
    public final void j(Context context, RequestedMiniApp requestedMiniApp, izs<? super Throwable, s3q0> izsVar, izs<? super iyu0, s3q0> izsVar2) {
        myc0.h(this.c, null, null, new a(requestedMiniApp, izsVar, context, this, izsVar2, null), 3);
    }

    @Override // xsna.ayu0
    public final boolean k(Throwable th) {
        if (yxu0.a.a(th)) {
            return true;
        }
        return mxu0.a(th);
    }

    @Override // xsna.ayu0
    public final void l(Context context, ee8 ee8Var) {
        myc0.h(this.c, null, null, new cyu0(context, ee8Var, null), 3);
    }

    @Override // xsna.ayu0
    public final void m(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp) {
        myc0.h(this.c, null, null, new d(kxu0Var, this, gzsVar, gzsVar2, requestedMiniApp, null), 3);
    }

    @Override // xsna.ayu0
    public final void n(kxu0 kxu0Var, cg1 cg1Var, xm6 xm6Var) {
        yxu0.a.f(kxu0Var, cg1Var, xm6Var);
    }

    @Override // xsna.ayu0
    public final void o(Context context, int i, Intent intent, int i2) {
        myc0.h(this.c, null, null, new b(context, i, i2, intent, null), 3);
    }

    public final void s(Context context, RequestedMiniApp requestedMiniApp) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            zxu0 zxu0Var = (zxu0) ((WeakReference) it.next()).get();
            if (zxu0Var != null) {
                arrayList.add(zxu0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((zxu0) next).a() == requestedMiniApp) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((zxu0) it3.next()).b(context);
        }
    }
}
