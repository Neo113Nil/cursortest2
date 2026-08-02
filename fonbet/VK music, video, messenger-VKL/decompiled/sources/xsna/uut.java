package xsna;

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
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vksteps.StepsMiniAppIds;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.infrastructure.exceptions.UnknownAccountException;
import com.vk.superapp.vksteps.ui.dialogs.AccountRevokePermissionDialogProvider$DialogResult;
import com.vk.superapp.vksteps.utils.enums.AccountSyncState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStepsGoogleFitDelegate.kt */
/* loaded from: classes6.dex */
public final class uut implements guq<GetSteps$Parameters> {
    public static final zrp j = StepsMiniAppIds.h();
    public final com.vk.superapp.base.js.bridge.b b;
    public final bfm c;
    public final wvp d;
    public final ayu0 e;
    public final hmv0 f;
    public final gmv0 g;
    public final env0 h;
    public int i;

    /* compiled from: GetStepsGoogleFitDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelectedDataSource.values().length];
            try {
                iArr[SelectedDataSource.GOOGLE_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedDataSource.HUAWEI_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectedDataSource.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountSyncState.values().length];
            try {
                iArr2[AccountSyncState.NEW_VK_RUN_ACCOUNT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountSyncState.NEW_USER_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountSyncState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AccountSyncState.SYNC_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: GetStepsGoogleFitDelegate.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsGoogleFitDelegate$sendSteps$1", f = "GetStepsGoogleFitDelegate.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ long $endTimestamp;
        final /* synthetic */ String $requestId;
        final /* synthetic */ SelectedDataSource $selectedDataSource;
        final /* synthetic */ long $startTimestamp;
        int label;
        final /* synthetic */ uut this$0;

        /* compiled from: GetStepsGoogleFitDelegate.kt */
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
        public b(long j, long j2, uut uutVar, FragmentActivity fragmentActivity, SelectedDataSource selectedDataSource, String str, spj<? super b> spjVar) {
            super(1, spjVar);
            this.$startTimestamp = j;
            this.$endTimestamp = j2;
            this.this$0 = uutVar;
            this.$activity = fragmentActivity;
            this.$selectedDataSource = selectedDataSource;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new b(this.$startTimestamp, this.$endTimestamp, this.this$0, this.$activity, this.$selectedDataSource, this.$requestId, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((b) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xgx0 xgx0Var = xgx0.a;
                String str = "VkStepsGetStepsGoogleFitDelegate.sendSteps() -> startTimestamp: " + this.$startTimestamp + ", endTimestamp: " + this.$endTimestamp + ", thread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.a(str);
                int i2 = a.$EnumSwitchMapping$1[this.this$0.h.a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xgx0.a("VkStepsGetStepsGoogleFitDelegate.sendSteps() -> isAccountSwitched: false, thread: " + Thread.currentThread().getName());
                    uut.d(this.this$0, this.$activity, this.$requestId, this.$startTimestamp, this.$endTimestamp, this.$selectedDataSource);
                    return s3q0.a;
                }
                xgx0.a("VkStepsGetStepsGoogleFitDelegate.sendSteps() -> isAccountSwitched: true, thread: " + Thread.currentThread().getName());
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
                uut uutVar = this.this$0;
                FragmentActivity fragmentActivity2 = this.$activity;
                long j = this.$startTimestamp;
                long j2 = this.$endTimestamp;
                UnknownAccountException unknownAccountException = new UnknownAccountException(0);
                SelectedDataSource selectedDataSource = this.$selectedDataSource;
                zrp zrpVar = uut.j;
                uutVar.getClass();
                bbs.a(fragmentActivity2, dgn0.f().getMain(), new xut(uutVar, unknownAccountException, j, j2, selectedDataSource, fragmentActivity2, null));
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tw8 tw8Var = this.this$0.h.a;
                qcy<Object> qcyVar = env0.b[0];
                tw8Var.g("");
                uut.d(this.this$0, this.$activity, this.$requestId, this.$startTimestamp, this.$endTimestamp, this.$selectedDataSource);
            }
            return s3q0.a;
        }
    }

    public uut(com.vk.superapp.base.js.bridge.b bVar, bfm bfmVar, wvp wvpVar, ayu0 ayu0Var, hmv0 hmv0Var, gmv0 gmv0Var, env0 env0Var) {
        this.b = bVar;
        this.c = bfmVar;
        this.d = wvpVar;
        this.e = ayu0Var;
        this.f = hmv0Var;
        this.g = gmv0Var;
        this.h = env0Var;
    }

    public static final Object c(uut uutVar, String str, long j2, long j3, SelectedDataSource selectedDataSource, SuspendLambda suspendLambda) {
        uutVar.getClass();
        if (new Long(j2).longValue() <= System.currentTimeMillis() && new Long(j3).longValue() <= System.currentTimeMillis()) {
            Object m = uutVar.m(str, j2, j3, selectedDataSource, suspendLambda);
            return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : s3q0.a;
        }
        uutVar.d.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str, 1, null));
        return s3q0.a;
    }

    public static final void d(final uut uutVar, final FragmentActivity fragmentActivity, final String str, final long j2, final long j3, final SelectedDataSource selectedDataSource) {
        uutVar.getClass();
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b2 = fp.b(j2, "VkStepsGetStepsGoogleFitDelegate.updateSteps() -> startTimestamp: ", ", endTimestamp: ");
        b2.append(j3);
        b2.append(", thread: ");
        b2.append(Thread.currentThread().getName());
        String sb = b2.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        uutVar.f.g(new e9q0(fragmentActivity, VkStepsSyncReason.BRIDGE_EVENT, Long.valueOf(j2), Long.valueOf(j3), new izs() { // from class: xsna.sut
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Exception exc = (Exception) obj;
                uut uutVar2 = uut.this;
                uutVar2.getClass();
                ge00 main = dgn0.f().getMain();
                long j4 = j2;
                long j5 = j3;
                SelectedDataSource selectedDataSource2 = selectedDataSource;
                FragmentActivity fragmentActivity2 = fragmentActivity;
                bbs.a(fragmentActivity2, main, new xut(uutVar2, exc, j4, j5, selectedDataSource2, fragmentActivity2, null));
                return s3q0.a;
            }
        }, new gzs() { // from class: xsna.tut
            @Override // xsna.gzs
            public final Object invoke() {
                uut uutVar2 = uut.this;
                uutVar2.getClass();
                bbs.a(fragmentActivity, dgn0.f().getMain(), new wut(j2, j3, uutVar2, str, null));
                return s3q0.a;
            }
        }, new kdn(uutVar, 9), selectedDataSource));
    }

    public static boolean h(FragmentActivity fragmentActivity) {
        return fragmentActivity.isDestroyed() || fragmentActivity.isFinishing();
    }

    @Override // xsna.guq
    public final List<Long> a1() {
        zrp zrpVar = j;
        ArrayList arrayList = new ArrayList(c5g.u(zrpVar, 10));
        Iterator<E> it = zrpVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((StepsMiniAppIds) it.next()).i()));
        }
        return arrayList;
    }

    public final void j() {
        this.d.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), defpackage.j0.b("VKWebAppGetSteps", this.b), 1, null));
    }

    public final void k(String str, long j2, long j3, SelectedDataSource selectedDataSource) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b2 = fp.b(j2, "VkStepsGetStepsGoogleFitDelegate.permissionGranted() -> startTimestamp: ", ", endTimestamp: ");
        b2.append(j3);
        b2.append(", thread: ");
        b2.append(Thread.currentThread().getName());
        String sb = b2.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        l(str, j2, j3, selectedDataSource);
    }

    @Override // xsna.guq
    public final void k1(GetSteps$Parameters getSteps$Parameters) {
        GetSteps$Parameters getSteps$Parameters2 = getSteps$Parameters;
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("VkStepsGetStepsGoogleFitDelegate.execute() -> params: ");
        sb.append(getSteps$Parameters2);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        String b2 = defpackage.j0.b("VKWebAppGetSteps", this.b);
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        wvp wvpVar = this.d;
        if (fragmentActivity == null || h(fragmentActivity)) {
            wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b2, 1, null));
            return;
        }
        MobileServicesType h = this.e.h(fragmentActivity);
        if (h == MobileServicesType.GOOGLE_PLAY || h == MobileServicesType.HUAWEI) {
            bbs.a(fragmentActivity, EmptyCoroutineContext.b, new vut(this, fragmentActivity, getSteps$Parameters2, b2, null));
        } else {
            wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b2, 1, null));
        }
    }

    public final void l(String str, long j2, long j3, SelectedDataSource selectedDataSource) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.invoke();
        if (fragmentActivity != null && !h(fragmentActivity)) {
            bbs.a(fragmentActivity, EmptyCoroutineContext.b, new b(j2, j3, this, fragmentActivity, selectedDataSource, str, null));
        } else {
            this.d.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), str, 1, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, long j2, long j3, SelectedDataSource selectedDataSource, ContinuationImpl continuationImpl) {
        yut yutVar;
        int i;
        FragmentActivity fragmentActivity;
        long j4;
        long j5;
        Object obj;
        String str2;
        SelectedDataSource selectedDataSource2;
        boolean d;
        if (continuationImpl instanceof yut) {
            yutVar = (yut) continuationImpl;
            int i2 = yutVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yutVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = yutVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yutVar.label;
                wvp wvpVar = this.d;
                ayu0 ayu0Var = this.e;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    fragmentActivity = (FragmentActivity) this.c.invoke();
                    if (fragmentActivity == null || h(fragmentActivity)) {
                        wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), str, 1, null));
                        return s3q0.a;
                    }
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                    yutVar.L$0 = str;
                    yutVar.L$1 = selectedDataSource;
                    yutVar.L$2 = fragmentActivity;
                    j4 = j2;
                    yutVar.J$0 = j4;
                    j5 = j3;
                    yutVar.J$1 = j5;
                    yutVar.label = 1;
                    Object b2 = byu0.b(ayu0Var, fragmentActivity, requestedMiniApp, yutVar);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b2;
                    str2 = str;
                    selectedDataSource2 = selectedDataSource;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j6 = yutVar.J$1;
                    long j7 = yutVar.J$0;
                    fragmentActivity = (FragmentActivity) yutVar.L$2;
                    SelectedDataSource selectedDataSource3 = (SelectedDataSource) yutVar.L$1;
                    str2 = (String) yutVar.L$0;
                    kotlin.a.a(obj2);
                    obj = obj2;
                    selectedDataSource2 = selectedDataSource3;
                    j4 = j7;
                    j5 = j6;
                }
                iyu0 iyu0Var = (iyu0) obj;
                int[] iArr = a.$EnumSwitchMapping$0;
                int i3 = iArr[selectedDataSource2.ordinal()];
                d = i3 == 1 ? i3 != 2 ? false : jyu0.d(iyu0Var) : jyu0.b(iyu0Var);
                mft0.a(new StringBuilder("VkStepsGetStepsGoogleFitDelegate.trySendSteps() -> thread: "), xgx0.a);
                if (d) {
                    final long j8 = j4;
                    final long j9 = j5;
                    xgx0.a("VkStepsGetStepsGoogleFitDelegate.trySendSteps() -> isVkStepsPermissionsGrantedSuspended: false, thread: " + Thread.currentThread().getName());
                    int i4 = iArr[selectedDataSource2.ordinal()];
                    if (i4 == 1) {
                        kxu0 kxu0Var = new kxu0();
                        kxu0Var.b = fragmentActivity;
                        final String str3 = str2;
                        ayu0Var.e(kxu0Var, new gzs() { // from class: xsna.qut
                            @Override // xsna.gzs
                            public final Object invoke() {
                                uut.this.k(str3, j8, j9, SelectedDataSource.GOOGLE_FIT);
                                return s3q0.a;
                            }
                        }, new x3i(this, 13), RequestedMiniApp.VK_STEPS);
                    } else if (i4 == 2) {
                        kxu0 kxu0Var2 = new kxu0();
                        kxu0Var2.b = fragmentActivity;
                        final String str4 = str2;
                        ayu0Var.c(kxu0Var2, new gzs() { // from class: xsna.rut
                            @Override // xsna.gzs
                            public final Object invoke() {
                                uut.this.k(str4, j8, j9, SelectedDataSource.HUAWEI_HEALTH);
                                return s3q0.a;
                            }
                        }, new x5i(this, 23));
                    } else if (i4 != 3) {
                        wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), str2, 1, null));
                    } else {
                        wvpVar.c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), str2, 1, null));
                    }
                    return s3q0.a;
                }
                xgx0.a("VkStepsGetStepsGoogleFitDelegate.trySendSteps() -> isVkStepsPermissionsGrantedSuspended: true, thread: " + Thread.currentThread().getName());
                l(str2, j4, j5, selectedDataSource2);
                return s3q0.a;
            }
        }
        yutVar = new yut(this, continuationImpl);
        Object obj22 = yutVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yutVar.label;
        wvp wvpVar2 = this.d;
        ayu0 ayu0Var2 = this.e;
        if (i != 0) {
        }
        iyu0 iyu0Var2 = (iyu0) obj;
        int[] iArr2 = a.$EnumSwitchMapping$0;
        int i32 = iArr2[selectedDataSource2.ordinal()];
        if (i32 == 1) {
        }
        mft0.a(new StringBuilder("VkStepsGetStepsGoogleFitDelegate.trySendSteps() -> thread: "), xgx0.a);
        if (d) {
        }
        return s3q0.a;
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
