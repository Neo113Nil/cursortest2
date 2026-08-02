package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.utils.enums.AccountSyncState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonToken;
import xsna.bex0;

/* compiled from: GetStepsCommand.kt */
/* loaded from: classes6.dex */
public class kut extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;
    public final hmv0 g;
    public int h;
    public long i;
    public long j;
    public final bpn0 k = new bpn0(new r(12));
    public final bpn0 l = new bpn0(new gu0(19));

    /* compiled from: GetStepsCommand.kt */
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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountSyncState.values().length];
            try {
                iArr2[AccountSyncState.NEW_VK_RUN_ACCOUNT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AccountSyncState.NEW_USER_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountSyncState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountSyncState.SYNC_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: GetStepsCommand.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsCommand$execute$1", f = "GetStepsCommand.kt", l = {JsonToken.BEGIN_ARRAY, JsonToken.END_ARRAY}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ String $data;
        Object L$0;
        int label;
        final /* synthetic */ kut this$0;

        /* compiled from: GetStepsCommand.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MobileServicesType.values().length];
                try {
                    iArr[MobileServicesType.GOOGLE_PLAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MobileServicesType.HUAWEI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MobileServicesType.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, kut kutVar, spj<? super b> spjVar) {
            super(1, spjVar);
            this.$data = str;
            this.this$0 = kutVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new b(this.$data, this.this$0, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((b) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x010f, code lost:
        
            if (r3.e(r4, r6, r8, r10) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0111, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
        
            if (r11.a(r1, r10) == r0) goto L42;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SelectedDataSource selectedDataSource;
            SelectedDataSource selectedDataSource2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xgx0 xgx0Var = xgx0.a;
                String str = "VkStepsGetStepsCommand.execute() -> data: " + this.$data + ", thread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.a(str);
                if (this.this$0.f()) {
                    r6y r6yVar = this.this$0.b;
                    if (r6yVar != null) {
                        bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                    }
                } else if (this.this$0.g()) {
                    r6y r6yVar2 = this.this$0.b;
                    if (r6yVar2 != null) {
                        bex0.a.a(r6yVar2, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                    }
                } else if (this.this$0.h()) {
                    r6y r6yVar3 = this.this$0.b;
                    if (r6yVar3 != null) {
                        bex0.a.a(r6yVar3, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                    }
                } else {
                    kut kutVar = this.this$0;
                    int i2 = a.$EnumSwitchMapping$0[kutVar.f.h(kutVar.e.requireContext()).ordinal()];
                    if (i2 == 1) {
                        selectedDataSource = SelectedDataSource.GOOGLE_FIT;
                    } else if (i2 == 2) {
                        selectedDataSource = SelectedDataSource.HUAWEI_HEALTH;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        selectedDataSource = SelectedDataSource.UNKNOWN;
                    }
                    selectedDataSource2 = selectedDataSource;
                    gmv0 gmv0Var = (gmv0) this.this$0.k.getValue();
                    this.L$0 = selectedDataSource2;
                    this.label = 1;
                }
                return s3q0.a;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            selectedDataSource2 = (SelectedDataSource) this.L$0;
            kotlin.a.a(obj);
            SelectedDataSource selectedDataSource3 = selectedDataSource2;
            kut kutVar2 = this.this$0;
            String str2 = this.$data;
            kutVar2.getClass();
            Pair i3 = kut.i(str2);
            long longValue = ((Number) i3.d()).longValue();
            long longValue2 = ((Number) i3.g()).longValue();
            kut kutVar3 = this.this$0;
            this.L$0 = null;
            this.label = 2;
        }
    }

    public kut(FragmentImpl fragmentImpl, ayu0 ayu0Var, hmv0 hmv0Var) {
        this.e = fragmentImpl;
        this.f = ayu0Var;
        this.g = hmv0Var;
    }

    public static final void d(final kut kutVar, final long j, final long j2, final SelectedDataSource selectedDataSource, Context context) {
        kutVar.getClass();
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b2 = fp.b(j, "VkStepsGetStepsCommand.updateSteps() -> startTimestamp: ", ", endTimestamp: ");
        b2.append(j2);
        b2.append(", thread: ");
        b2.append(Thread.currentThread().getName());
        String sb = b2.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        kutVar.g.g(new e9q0(context, VkStepsSyncReason.BRIDGE_EVENT, Long.valueOf(j), Long.valueOf(j2), new izs() { // from class: xsna.iut
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Exception exc = (Exception) obj;
                kut kutVar2 = kut.this;
                FragmentImpl fragmentImpl = kutVar2.e;
                myc0.h(g5z.a(fragmentImpl), dgn0.f().getMain(), null, new zas(new mut(exc, kutVar2, j, j2, selectedDataSource, null), null), 2);
                return s3q0.a;
            }
        }, new gzs() { // from class: xsna.jut
            @Override // xsna.gzs
            public final Object invoke() {
                kut kutVar2 = kut.this;
                FragmentImpl fragmentImpl = kutVar2.e;
                myc0.h(g5z.a(fragmentImpl), dgn0.f().getMain(), null, new zas(new lut(j, j2, kutVar2, null), null), 2);
                return s3q0.a;
            }
        }, new xv2(1, kutVar, kut.class, "handleStepsReceivedFromDataSource", "handleStepsReceivedFromDataSource(Ljava/util/List;)V", 0, 11), selectedDataSource));
    }

    public static Pair i(String str) {
        long g;
        long currentTimeMillis;
        Long i = str != null ? qvo0.i(qvo0.a, new JSONObject(str).optString("date")) : null;
        if (i != null) {
            qvo0 qvo0Var = qvo0.a;
            long longValue = i.longValue();
            qvo0Var.getClass();
            currentTimeMillis = qvo0.b(longValue);
            g = qvo0.e(i.longValue());
            if (currentTimeMillis > System.currentTimeMillis()) {
                currentTimeMillis = System.currentTimeMillis();
            }
        } else {
            qvo0.a.getClass();
            g = qvo0.g();
            currentTimeMillis = System.currentTimeMillis();
        }
        return new Pair(Long.valueOf(g), Long.valueOf(currentTimeMillis));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m(kut kutVar, long j, long j2, SelectedDataSource selectedDataSource, ContinuationImpl continuationImpl) {
        out outVar;
        int i;
        long j3;
        SelectedDataSource selectedDataSource2;
        long j4;
        kut kutVar2;
        r6y r6yVar;
        boolean d;
        kut kutVar3 = kutVar;
        try {
            if (continuationImpl instanceof out) {
                outVar = (out) continuationImpl;
                int i2 = outVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    outVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = outVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = outVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        Context mo2getContext = kutVar3.e.mo2getContext();
                        if (mo2getContext == null) {
                            r6y r6yVar2 = kutVar3.b;
                            if (r6yVar2 != null) {
                                bex0.a.a(r6yVar2, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                            }
                            return s3q0.a;
                        }
                        try {
                            ayu0 ayu0Var = kutVar3.f;
                            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                            outVar.L$0 = kutVar3;
                            outVar.L$1 = selectedDataSource;
                            outVar.J$0 = j;
                            j3 = j2;
                            outVar.J$1 = j3;
                            outVar.label = 1;
                            obj = byu0.b(ayu0Var, mo2getContext, requestedMiniApp, outVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            selectedDataSource2 = selectedDataSource;
                            j4 = j;
                            kutVar2 = kutVar3;
                        } catch (Throwable th) {
                            th = th;
                            String str = "VkStepsGetStepsCommand.trySendSteps() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
                            xgx0.a.getClass();
                            xgx0.b(str);
                            r6yVar = kutVar3.b;
                            if (r6yVar != null) {
                            }
                            return s3q0.a;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j5 = outVar.J$1;
                        j4 = outVar.J$0;
                        SelectedDataSource selectedDataSource3 = (SelectedDataSource) outVar.L$1;
                        kut kutVar4 = (kut) outVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            selectedDataSource2 = selectedDataSource3;
                            kutVar2 = kutVar4;
                            j3 = j5;
                        } catch (Throwable th2) {
                            th = th2;
                            kutVar3 = kutVar4;
                            String str2 = "VkStepsGetStepsCommand.trySendSteps() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
                            xgx0.a.getClass();
                            xgx0.b(str2);
                            r6yVar = kutVar3.b;
                            if (r6yVar != null) {
                            }
                            return s3q0.a;
                        }
                    }
                    iyu0 iyu0Var = (iyu0) obj;
                    int[] iArr = a.$EnumSwitchMapping$0;
                    int i3 = iArr[selectedDataSource2.ordinal()];
                    d = i3 == 1 ? i3 != 2 ? false : jyu0.d(iyu0Var) : jyu0.b(iyu0Var);
                    mft0.a(new StringBuilder("VkStepsGetStepsCommand.trySendSteps() -> thread: "), xgx0.a);
                    if (d) {
                        final long j6 = j4;
                        final kut kutVar5 = kutVar2;
                        xgx0.a("VkStepsGetStepsCommand.trySendSteps() -> isVkStepsPermissionsGrantedSuspended: false, thread: " + Thread.currentThread().getName());
                        int i4 = iArr[selectedDataSource2.ordinal()];
                        if (i4 == 1) {
                            ayu0 ayu0Var2 = kutVar5.f;
                            FragmentImpl fragmentImpl = kutVar5.e;
                            kxu0 kxu0Var = new kxu0();
                            kxu0Var.a = fragmentImpl;
                            final long j7 = j3;
                            ayu0Var2.e(kxu0Var, new gzs() { // from class: xsna.hut
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    kut.this.k(j6, j7, SelectedDataSource.GOOGLE_FIT);
                                    return s3q0.a;
                                }
                            }, new put(0, kutVar5, kut.class, "permissionDenied", "permissionDenied()V", 0, 0), RequestedMiniApp.VK_STEPS);
                        } else if (i4 != 2) {
                            r6y r6yVar3 = kutVar5.b;
                            if (r6yVar3 != null) {
                                bex0.a.a(r6yVar3, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                            }
                        } else {
                            ayu0 ayu0Var3 = kutVar5.f;
                            FragmentImpl fragmentImpl2 = kutVar5.e;
                            kxu0 kxu0Var2 = new kxu0();
                            kxu0Var2.a = fragmentImpl2;
                            ayu0Var3.c(kxu0Var2, new nol(kutVar5, j6, 1, j3), new fa6(0, kutVar5, kut.class, "permissionDenied", "permissionDenied()V", 0, 2));
                        }
                    } else {
                        xgx0.a("VkStepsGetStepsCommand.trySendSteps() -> isVkStepsPermissionsGrantedSuspended: true, thread: " + Thread.currentThread().getName());
                        bbs.b(kutVar2.e, new nut(kutVar2, j4, j3, selectedDataSource2, null));
                    }
                    return s3q0.a;
                }
            }
            iyu0 iyu0Var2 = (iyu0) obj;
            int[] iArr2 = a.$EnumSwitchMapping$0;
            int i32 = iArr2[selectedDataSource2.ordinal()];
            if (i32 == 1) {
            }
            mft0.a(new StringBuilder("VkStepsGetStepsCommand.trySendSteps() -> thread: "), xgx0.a);
            if (d) {
            }
            return s3q0.a;
        } catch (Throwable th3) {
            th = th3;
            kutVar3 = kutVar2;
            String str22 = "VkStepsGetStepsCommand.trySendSteps() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
            xgx0.a.getClass();
            xgx0.b(str22);
            r6yVar = kutVar3.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.CUSTOM_ERROR, str22, null, null, 56);
            }
            return s3q0.a;
        }
        outVar = new out(kutVar3, continuationImpl);
        Object obj2 = outVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = outVar.label;
        if (i != 0) {
        }
    }

    @Override // xsna.dvv0
    public void a(String str) {
        bbs.b(this.e, new b(str, this, null));
    }

    @Override // xsna.dvv0
    public final void c(int i, int i2, Intent intent) {
        Context mo2getContext = this.e.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        this.f.o(mo2getContext, i, intent, i2);
    }

    public final Object e(long j, long j2, SelectedDataSource selectedDataSource, SuspendLambda suspendLambda) {
        if (new Long(j).longValue() <= System.currentTimeMillis() && new Long(j2).longValue() <= System.currentTimeMillis()) {
            this.i = j;
            this.j = j2;
            Object l = l(j, j2, selectedDataSource, suspendLambda);
            return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : s3q0.a;
        }
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
        }
        return s3q0.a;
    }

    public final boolean f() {
        boolean z;
        fvv0 M;
        r6y r6yVar = this.b;
        Long valueOf = (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId());
        ArrayList arrayList = imv0.q;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (valueOf != null && valueOf.longValue() == longValue) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return (BuildInfo.h() || z) ? false : true;
    }

    public final boolean g() {
        FragmentActivity activity;
        FragmentActivity activity2;
        FragmentImpl fragmentImpl = this.e;
        return fragmentImpl.mo2getContext() == null || ((activity = fragmentImpl.getActivity()) != null && activity.isDestroyed()) || ((activity2 = fragmentImpl.getActivity()) != null && activity2.isFinishing());
    }

    public boolean h() {
        MobileServicesType h = this.f.h(this.e.requireContext());
        return !(h == MobileServicesType.GOOGLE_PLAY || h == MobileServicesType.HUAWEI);
    }

    public final void j() {
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        }
    }

    public final void k(long j, long j2, SelectedDataSource selectedDataSource) {
        xgx0 xgx0Var = xgx0.a;
        StringBuilder b2 = fp.b(j, "VkStepsGetStepsCommand.permissionGranted() -> startTimestamp: ", ", endTimestamp: ");
        b2.append(j2);
        b2.append(", thread: ");
        b2.append(Thread.currentThread().getName());
        String sb = b2.toString();
        xgx0Var.getClass();
        xgx0.a(sb);
        FragmentImpl fragmentImpl = this.e;
        if (fragmentImpl.getActivity() != null) {
            bbs.b(fragmentImpl, new nut(this, j, j2, selectedDataSource, null));
            return;
        }
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
        }
    }

    public Object l(long j, long j2, SelectedDataSource selectedDataSource, spj<? super s3q0> spjVar) {
        return m(this, j, j2, selectedDataSource, (ContinuationImpl) spjVar);
    }
}
