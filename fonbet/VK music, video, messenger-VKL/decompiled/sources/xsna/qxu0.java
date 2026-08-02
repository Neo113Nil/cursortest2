package xsna;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.DeniedReason;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectPermissions;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;
import xsna.g0v;
import xsna.p0v;

/* compiled from: VkHealthHealthConnectPermissionsProvider.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthHealthConnectPermissionsProvider$getPermissionsStatus$2", f = "VkHealthHealthConnectPermissionsProvider.kt", l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class qxu0 extends SuspendLambda implements wzs<yvj, spj<? super g0v>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RequestedMiniApp $requestedMiniApp;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: VkHealthHealthConnectPermissionsProvider.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthHealthConnectPermissionsProvider$getPermissionsStatus$2$1", f = "VkHealthHealthConnectPermissionsProvider.kt", l = {120}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super g0v>, Object> {
        final /* synthetic */ czu $healthConnectClient;
        final /* synthetic */ RequestedMiniApp $requestedMiniApp;
        int label;

        /* compiled from: VkHealthHealthConnectPermissionsProvider.kt */
        /* renamed from: xsna.qxu0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3579a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RequestedMiniApp.values().length];
                try {
                    iArr[RequestedMiniApp.VK_STEPS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RequestedMiniApp.VK_WORKOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(czu czuVar, RequestedMiniApp requestedMiniApp, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$healthConnectClient = czuVar;
            this.$requestedMiniApp = requestedMiniApp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$healthConnectClient, this.$requestedMiniApp, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super g0v> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set<String> set;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    sx90 e = this.$healthConnectClient.e();
                    this.label = 1;
                    obj = e.c(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                Set set2 = (Set) obj;
                int i2 = C3579a.$EnumSwitchMapping$0[this.$requestedMiniApp.ordinal()];
                if (i2 == 1) {
                    set = pxu0.c;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    set = pxu0.d;
                }
                boolean containsAll = set2.containsAll(set);
                xgx0.a.getClass();
                xgx0.a("VkHealthHealthConnectPermissionsProvider.getPermissionsStatus() -> result: " + containsAll + "\n granted: " + set2 + "\n required: " + set);
                if (containsAll) {
                    return g0v.b.a;
                }
                if (set2.isEmpty()) {
                    return new g0v.a(DeniedReason.GRANTED_PERMISSION_EMPTY, "Granted permissions are empty");
                }
                Set<String> set3 = set2;
                ArrayList arrayList = new ArrayList(c5g.u(set3, 10));
                for (String str : set3) {
                    Object obj2 = p0v.a;
                    arrayList.add(drm0.D(str, p0v.a.a(fpf0.a(x0l0.class)), false) ? HealthConnectPermissions.STEPS : drm0.D(str, p0v.a.a(fpf0.a(bhn.class)), false) ? HealthConnectPermissions.DISTANCE : drm0.D(str, p0v.a.a(fpf0.a(n4q.class)), false) ? HealthConnectPermissions.WORKOUT : HealthConnectPermissions.UNKNOWN);
                }
                return new g0v.c(arrayList);
            } catch (RemoteException e2) {
                xgx0.a.getClass();
                xgx0.b("VkHealthHealthConnectPermissionsProvider.getPermissionsStatus() -> getGrantedPermissions failed: " + e2);
                return new g0v.a(DeniedReason.EXCEPTION, e2.getMessage());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxu0(Context context, long j, RequestedMiniApp requestedMiniApp, spj<? super qxu0> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.$timeout = j;
        this.$requestedMiniApp = requestedMiniApp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        qxu0 qxu0Var = new qxu0(this.$context, this.$timeout, this.$requestedMiniApp, spjVar);
        qxu0Var.L$0 = obj;
        return qxu0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super g0v> spjVar) {
        return ((qxu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [xsna.czu] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        czu b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            if (Build.VERSION.SDK_INT < 34) {
                pxu0 pxu0Var = pxu0.a;
                if (!pxu0.d(this.$context)) {
                    xgx0.a.getClass();
                    xgx0.b("VkHealthHealthConnectPermissionsProvider.getPermissionsStatus() -> Health Connect not installed");
                    return new g0v.a(DeniedReason.HC_NOT_INSTALLED, "Health Connect not installed");
                }
            }
            czu.b bVar = czu.a;
            Context context = this.$context;
            bVar.getClass();
            int c = czu.b.c(context);
            if (c != 3) {
                xgx0.a.getClass();
                xgx0.b("VkHealthHealthConnectPermissionsProvider.getPermissionsStatus() -> SDK not available: " + c);
                return new g0v.a(DeniedReason.SDK_UNAVAILABLE, 2);
            }
            try {
                pxu0 pxu0Var2 = pxu0.a;
                Context context2 = this.$context;
                Object obj2 = pxu0.b;
                ?? r5 = obj2;
                if (obj2 == null) {
                    synchronized (pxu0Var2) {
                        b = czu.b.b(bVar, context2.getApplicationContext());
                        pxu0.b = b;
                    }
                    r5 = b;
                }
                long j = this.$timeout;
                a aVar = new a(r5, this.$requestedMiniApp, null);
                this.L$0 = yvjVar;
                this.label = 1;
                obj = oxo0.c(j, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                xgx0.a.getClass();
                xgx0.b("VkHealthHealthConnectPermissionsProvider.getPermissionsStatus() -> getOrCreate throws " + th);
                return new g0v.a(DeniedReason.EXCEPTION, th.getMessage());
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        g0v g0vVar = (g0v) obj;
        if (g0vVar != null) {
            return g0vVar;
        }
        xgx0.a.getClass();
        xgx0.b("VkHealthHealthConnectPermissionsProvider.getPermissionsStatus() -> return false case of timeout");
        return new g0v.a(DeniedReason.EXCEPTION, "Denied because of timeout");
    }
}
