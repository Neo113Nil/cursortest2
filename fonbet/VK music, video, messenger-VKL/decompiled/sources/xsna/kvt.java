package xsna;

import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Parameters;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import com.vk.superapp.vksteps.StepsMiniAppIds;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.infrastructure.exceptions.UnknownAccountException;
import com.vk.superapp.vksteps.ui.dialogs.AccountRevokePermissionDialogProvider$DialogResult;
import com.vk.superapp.vksteps.utils.enums.AccountSyncState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.czu;
import xsna.g0v;
import xsna.p0v;

/* compiled from: GetStepsHealthConnectDelegate.kt */
/* loaded from: classes6.dex */
public final class kvt implements guq<GetSteps$Parameters> {
    public static final zrp o = StepsMiniAppIds.h();
    public final com.vk.superapp.base.js.bridge.b b;
    public xwv0 c;
    public final bfm d;
    public final wvp e;
    public final ayu0 f;
    public final hmv0 g;
    public final gmv0 h;
    public final env0 i;
    public int j;
    public long k;
    public long l;
    public final Set<String> m;
    public final gvt n;

    /* compiled from: GetStepsHealthConnectDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSyncState.values().length];
            try {
                iArr[AccountSyncState.NEW_VK_RUN_ACCOUNT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSyncState.NEW_USER_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountSyncState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountSyncState.SYNC_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: GetStepsHealthConnectDelegate.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsHealthConnectDelegate$checkHealthConnectPermissions$1", f = "GetStepsHealthConnectDelegate.kt", l = {358}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ String $requestId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FragmentActivity fragmentActivity, String str, spj<? super b> spjVar) {
            super(1, spjVar);
            this.$activity = fragmentActivity;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return kvt.this.new b(this.$activity, this.$requestId, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((b) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Intent a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ayu0 ayu0Var = kvt.this.f;
                FragmentActivity fragmentActivity = this.$activity;
                RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                this.label = 1;
                obj = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            if (epx.f(((iyu0) obj).f, g0v.b.a)) {
                kvt kvtVar = kvt.this;
                kvtVar.l(kvtVar.k, kvtVar.l, this.$requestId);
            } else {
                if (Build.VERSION.SDK_INT >= 34) {
                    czu.a.getClass();
                    a = new Intent(czu.b.b);
                } else {
                    a = new t0v().a(this.$activity, kvt.this.m);
                }
                kvt kvtVar2 = kvt.this;
                FragmentActivity fragmentActivity2 = this.$activity;
                xwv0 xwv0Var = kvtVar2.c;
                if (xwv0Var != null) {
                    xwv0Var.D1(kvtVar2.n);
                }
                fragmentActivity2.startActivityForResult(a, 101);
            }
            return s3q0.a;
        }
    }

    /* compiled from: GetStepsHealthConnectDelegate.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsHealthConnectDelegate$sendSteps$1", f = "GetStepsHealthConnectDelegate.kt", l = {202}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ long $endTimestamp;
        final /* synthetic */ String $requestId;
        final /* synthetic */ long $startTimestamp;
        int label;
        final /* synthetic */ kvt this$0;

        /* compiled from: GetStepsHealthConnectDelegate.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccountRevokePermissionDialogProvider$DialogResult.values().length];
                try {
                    iArr[AccountRevokePermissionDialogProvider$DialogResult.NEGATIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountRevokePermissionDialogProvider$DialogResult.POSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, kvt kvtVar, FragmentActivity fragmentActivity, String str, spj<? super c> spjVar) {
            super(1, spjVar);
            this.$startTimestamp = j;
            this.$endTimestamp = j2;
            this.this$0 = kvtVar;
            this.$activity = fragmentActivity;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new c(this.$startTimestamp, this.$endTimestamp, this.this$0, this.$activity, this.$requestId, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((c) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xgx0 xgx0Var = xgx0.a;
                String str = "VkStepsGetStepsHealthConnectDelegate.sendSteps() -> startTimestamp: " + this.$startTimestamp + ", endTimestamp: " + this.$endTimestamp + ", thread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.a(str);
                int i2 = a.$EnumSwitchMapping$0[this.this$0.i.a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xgx0.a("VkStepsGetStepsHealthConnectDelegate.sendSteps() -> isAccountSwitched: false, thread: " + Thread.currentThread().getName());
                    kvt.d(this.this$0, this.$activity, this.$requestId, this.$startTimestamp, this.$endTimestamp);
                    return s3q0.a;
                }
                xgx0.a("VkStepsGetStepsHealthConnectDelegate.sendSteps() -> isAccountSwitched: true, thread: " + Thread.currentThread().getName());
                FragmentActivity fragmentActivity = this.$activity;
                this.label = 1;
                gzg0 gzg0Var = new gzg0(s7s0.c(this));
                d.a aVar = new d.a(fragmentActivity);
                aVar.c(R.string.vk_run_change_account_title);
                aVar.a(false);
                aVar.setPositiveButton(android.R.string.ok, new xp(gzg0Var)).setNegativeButton(android.R.string.cancel, new yp(gzg0Var)).create().show();
                obj = gzg0Var.a();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            int i3 = a.$EnumSwitchMapping$0[((AccountRevokePermissionDialogProvider$DialogResult) obj).ordinal()];
            if (i3 == 1) {
                kvt kvtVar = this.this$0;
                FragmentActivity fragmentActivity2 = this.$activity;
                long j = this.$startTimestamp;
                long j2 = this.$endTimestamp;
                UnknownAccountException unknownAccountException = new UnknownAccountException(0);
                zrp zrpVar = kvt.o;
                kvtVar.getClass();
                bbs.a(fragmentActivity2, dgn0.f().getMain(), new nvt(kvtVar, unknownAccountException, j, j2, fragmentActivity2, null));
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tw8 tw8Var = this.this$0.i.a;
                qcy<Object> qcyVar = env0.b[0];
                tw8Var.g("");
                kvt.d(this.this$0, this.$activity, this.$requestId, this.$startTimestamp, this.$endTimestamp);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [xsna.gvt] */
    public kvt(com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar, wvp wvpVar, ayu0 ayu0Var, hmv0 hmv0Var, gmv0 gmv0Var, env0 env0Var) {
        this.b = bVar;
        this.c = xwv0Var;
        this.d = bfmVar;
        this.e = wvpVar;
        this.f = ayu0Var;
        this.g = hmv0Var;
        this.h = gmv0Var;
        this.i = env0Var;
        Object obj = p0v.a;
        this.m = rl3.y0(new String[]{p0v.a.a(fpf0.a(x0l0.class)), p0v.a.a(fpf0.a(bhn.class))});
        this.n = new tb0() { // from class: xsna.gvt
            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
                kvt kvtVar = kvt.this;
                ayu0 ayu0Var2 = kvtVar.f;
                bfm bfmVar2 = kvtVar.d;
                com.vk.superapp.base.js.bridge.b bVar2 = kvtVar.b;
                if (i == 101) {
                    FragmentActivity fragmentActivity = (FragmentActivity) bfmVar2.invoke();
                    if (fragmentActivity != null) {
                        ayu0Var2.j(fragmentActivity, RequestedMiniApp.VK_STEPS, null, new rte(kvtVar, defpackage.j0.b("VKWebAppGetSteps", bVar2), fragmentActivity, 2));
                    }
                } else if (i == 102) {
                    String b2 = defpackage.j0.b("VKWebAppGetSteps", bVar2);
                    FragmentActivity fragmentActivity2 = (FragmentActivity) bfmVar2.invoke();
                    if (fragmentActivity2 == null) {
                        kvtVar.e.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b2, 1, null));
                    } else {
                        ayu0Var2.j(fragmentActivity2, RequestedMiniApp.VK_STEPS, null, new il7(6, kvtVar, b2));
                    }
                }
                xwv0 xwv0Var2 = kvtVar.c;
                if (xwv0Var2 != null) {
                    xwv0Var2.e3(kvtVar.n);
                }
            }
        };
    }

    public static final Object c(kvt kvtVar, String str, long j, long j2, SuspendLambda suspendLambda) {
        kvtVar.getClass();
        if (new Long(j).longValue() > System.currentTimeMillis() || new Long(j2).longValue() > System.currentTimeMillis()) {
            kvtVar.e.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str, 1, null));
            return s3q0.a;
        }
        kvtVar.k = j;
        kvtVar.l = j2;
        Object n = kvtVar.n(str, j, j2, suspendLambda);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    public static final void d(final kvt kvtVar, final FragmentActivity fragmentActivity, final String str, final long j, final long j2) {
        kvtVar.getClass();
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b2 = fp.b(j, "VkStepsGetStepsHealthConnectDelegate.updateSteps() -> startTimestamp: ", ", endTimestamp: ");
        b2.append(j2);
        b2.append(", thread: ");
        b2.append(Thread.currentThread().getName());
        String sb = b2.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        kvtVar.g.g(new e9q0(fragmentActivity, VkStepsSyncReason.BRIDGE_EVENT, Long.valueOf(j), Long.valueOf(j2), new izs() { // from class: xsna.hvt
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Exception exc = (Exception) obj;
                kvt kvtVar2 = kvt.this;
                kvtVar2.getClass();
                ge00 main = dgn0.f().getMain();
                long j3 = j;
                long j4 = j2;
                FragmentActivity fragmentActivity2 = fragmentActivity;
                bbs.a(fragmentActivity2, main, new nvt(kvtVar2, exc, j3, j4, fragmentActivity2, null));
                return s3q0.a;
            }
        }, new gzs() { // from class: xsna.ivt
            @Override // xsna.gzs
            public final Object invoke() {
                kvt kvtVar2 = kvt.this;
                kvtVar2.getClass();
                bbs.a(fragmentActivity, dgn0.f().getMain(), new mvt(j, j2, kvtVar2, str, null));
                return s3q0.a;
            }
        }, new zxo(kvtVar, 10), SelectedDataSource.HEALTH_CONNECT));
    }

    public static boolean j(FragmentActivity fragmentActivity) {
        return fragmentActivity.isDestroyed() || fragmentActivity.isFinishing();
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        zrp zrpVar = o;
        ArrayList arrayList = new ArrayList(c5g.u(zrpVar, 10));
        Iterator<E> it = zrpVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((StepsMiniAppIds) it.next()).i()));
        }
        return arrayList;
    }

    public final void h() {
        FragmentActivity fragmentActivity = (FragmentActivity) this.d.invoke();
        if (fragmentActivity == null) {
            return;
        }
        bbs.a(fragmentActivity, EmptyCoroutineContext.b, new b(fragmentActivity, defpackage.j0.b("VKWebAppGetSteps", this.b), null));
    }

    public final void k() {
        this.e.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), defpackage.j0.b("VKWebAppGetSteps", this.b), 1, null));
    }

    @Override // xsna.guq
    public final void k1(GetSteps$Parameters getSteps$Parameters) {
        GetSteps$Parameters getSteps$Parameters2 = getSteps$Parameters;
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("VkStepsGetStepsHealthConnectDelegate.execute() -> params: ");
        sb.append(getSteps$Parameters2);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b2 = defpackage.j0.b("VKWebAppGetSteps", this.b);
        FragmentActivity fragmentActivity = (FragmentActivity) this.d.invoke();
        wvp wvpVar = this.e;
        if (fragmentActivity == null || j(fragmentActivity)) {
            wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b2, 1, null));
        } else if (this.f.h(fragmentActivity) != MobileServicesType.GOOGLE_PLAY) {
            wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b2, 1, null));
        } else {
            bbs.a(fragmentActivity, EmptyCoroutineContext.b, new lvt(this, getSteps$Parameters2, b2, null));
        }
    }

    public final void l(long j, long j2, String str) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b2 = fp.b(j, "VkStepsGetStepsHealthConnectDelegate.permissionGranted() -> startTimestamp: ", ", endTimestamp: ");
        b2.append(j2);
        b2.append(", thread: ");
        b2.append(Thread.currentThread().getName());
        String sb = b2.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        m(j, j2, str);
    }

    public final void m(long j, long j2, String str) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.d.invoke();
        if (fragmentActivity != null && !j(fragmentActivity)) {
            bbs.a(fragmentActivity, EmptyCoroutineContext.b, new c(j, j2, this, fragmentActivity, str, null));
        } else {
            this.e.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), str, 1, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, long j, long j2, ContinuationImpl continuationImpl) {
        pvt pvtVar;
        int i;
        wvp wvpVar;
        FragmentActivity fragmentActivity;
        long j3;
        long j4;
        String str2;
        iyu0 iyu0Var;
        PermissionsResult.a aVar;
        if (continuationImpl instanceof pvt) {
            pvtVar = (pvt) continuationImpl;
            int i2 = pvtVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pvtVar.label = i2 - Integer.MIN_VALUE;
                Object obj = pvtVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pvtVar.label;
                wvpVar = this.e;
                ayu0 ayu0Var = this.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    fragmentActivity = (FragmentActivity) this.d.invoke();
                    if (fragmentActivity == null || j(fragmentActivity)) {
                        wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), str, 1, null));
                        return s3q0.a;
                    }
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                    pvtVar.L$0 = str;
                    pvtVar.L$1 = fragmentActivity;
                    j3 = j;
                    pvtVar.J$0 = j3;
                    j4 = j2;
                    pvtVar.J$1 = j4;
                    pvtVar.label = 1;
                    obj = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, pvtVar);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    PermissionsResult.a aVar2 = (PermissionsResult.a) pvtVar.L$0;
                    kotlin.a.a(obj);
                    aVar = aVar2;
                    PermissionsResult permissionsResult = (PermissionsResult) obj;
                    int i3 = 0;
                    int i4 = 0;
                    kun kunVar = new kun(i4, this, kvt.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", i3, 1);
                    mij mijVar = new mij(i4, this, kvt.class, "permissionDenied", "permissionDenied()V", i3, 2);
                    aVar.getClass();
                    PermissionsResult.a.a(permissionsResult, kunVar, mijVar);
                    return s3q0.a;
                }
                long j5 = pvtVar.J$1;
                long j6 = pvtVar.J$0;
                fragmentActivity = (FragmentActivity) pvtVar.L$1;
                String str3 = (String) pvtVar.L$0;
                kotlin.a.a(obj);
                str2 = str3;
                j4 = j5;
                j3 = j6;
                iyu0Var = (iyu0) obj;
                if (iyu0Var.g == HealthConnectSdkStatus.AVAILABLE || !iyu0Var.b) {
                    wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), str2, 1, null));
                    mft0.a(new StringBuilder("VkStepsGetStepsHealthConnectDelegate.trySendSteps() health connect services unavailable. thread: "), xgx0.a);
                    return s3q0.a;
                }
                mft0.a(new StringBuilder("VkStepsGetStepsHealthConnectDelegate.trySendSteps() -> thread: "), xgx0.a);
                if (iyu0Var.a) {
                    if (epx.f(iyu0Var.f, g0v.b.a)) {
                        xgx0.a("VkStepsGetStepsHealthConnectDelegate.trySendSteps() -> permission granted, thread: " + Thread.currentThread().getName());
                        m(j3, j4, str2);
                    } else {
                        h();
                    }
                    return s3q0.a;
                }
                PermissionsResult.a aVar3 = PermissionsResult.Companion;
                pvtVar.L$0 = aVar3;
                pvtVar.L$1 = null;
                pvtVar.label = 2;
                Object c2 = byu0.c(ayu0Var, fragmentActivity, pvtVar);
                if (c2 != coroutineSingletons) {
                    aVar = aVar3;
                    obj = c2;
                    PermissionsResult permissionsResult2 = (PermissionsResult) obj;
                    int i32 = 0;
                    int i42 = 0;
                    kun kunVar2 = new kun(i42, this, kvt.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", i32, 1);
                    mij mijVar2 = new mij(i42, this, kvt.class, "permissionDenied", "permissionDenied()V", i32, 2);
                    aVar.getClass();
                    PermissionsResult.a.a(permissionsResult2, kunVar2, mijVar2);
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        pvtVar = new pvt(this, continuationImpl);
        Object obj2 = pvtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pvtVar.label;
        wvpVar = this.e;
        ayu0 ayu0Var2 = this.f;
        if (i != 0) {
        }
        iyu0Var = (iyu0) obj2;
        if (iyu0Var.g == HealthConnectSdkStatus.AVAILABLE) {
        }
        wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), str2, 1, null));
        mft0.a(new StringBuilder("VkStepsGetStepsHealthConnectDelegate.trySendSteps() health connect services unavailable. thread: "), xgx0.a);
        return s3q0.a;
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.c = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.g.h();
        this.c = null;
    }
}
