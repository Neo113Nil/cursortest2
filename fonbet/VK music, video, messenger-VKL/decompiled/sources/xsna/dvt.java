package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.vk.core.fragments.FragmentImpl;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$SyncReason;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bex0;
import xsna.g0v;
import xsna.omv0;

/* compiled from: GetStepsHealthConnectCommand.kt */
/* loaded from: classes6.dex */
public final class dvt extends kut {
    public final FragmentImpl m;
    public final ayu0 n;
    public final bpn0 o;
    public Long p;
    public final bpn0 q;
    public final Set<String> r;
    public final hb0<Set<String>> s;
    public final hb0<Intent> t;

    /* compiled from: GetStepsHealthConnectCommand.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsHealthConnectCommand$execute$1", f = "GetStepsHealthConnectCommand.kt", l = {87, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ String $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return dvt.this.new a(this.$data, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
        
            if (r3.e(r4, r6, r8, r10) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00e9, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
        
            if (r11.a(r1, r10) == r0) goto L30;
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
                dvt.this.p = new Long(System.currentTimeMillis());
                xgx0 xgx0Var = xgx0.a;
                String str = "VkStepsGetStepsHealthConnectCommand.execute() -> data: " + this.$data + ", thread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.a(str);
                if (dvt.this.f()) {
                    r6y r6yVar = dvt.this.b;
                    if (r6yVar != null) {
                        bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                    }
                } else if (dvt.this.g()) {
                    r6y r6yVar2 = dvt.this.b;
                    if (r6yVar2 != null) {
                        bex0.a.a(r6yVar2, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                    }
                } else if (dvt.this.h()) {
                    r6y r6yVar3 = dvt.this.b;
                    if (r6yVar3 != null) {
                        bex0.a.a(r6yVar3, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                    }
                } else {
                    gmv0 gmv0Var = (gmv0) dvt.this.q.getValue();
                    SelectedDataSource selectedDataSource = SelectedDataSource.HEALTH_CONNECT;
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
            kotlin.a.a(obj);
            dvt dvtVar = dvt.this;
            String str2 = this.$data;
            dvtVar.getClass();
            Pair i2 = kut.i(str2);
            long longValue = ((Number) i2.d()).longValue();
            long longValue2 = ((Number) i2.g()).longValue();
            dvt dvtVar2 = dvt.this;
            SelectedDataSource selectedDataSource2 = SelectedDataSource.HEALTH_CONNECT;
            this.label = 2;
        }
    }

    /* compiled from: GetStepsHealthConnectCommand.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsHealthConnectCommand$sendPermissionAnalytics$1", f = "GetStepsHealthConnectCommand.kt", l = {171}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(1, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return dvt.this.new b(spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((b) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Context mo2getContext = dvt.this.m.mo2getContext();
                if (mo2getContext == null) {
                    return s3q0.a;
                }
                dvt dvtVar = dvt.this;
                Context requireContext = dvtVar.m.requireContext();
                yu1 yu1Var = new yu1(11, dvt.this, mo2getContext);
                this.L$0 = mo2getContext;
                this.label = 1;
                Object n = dvtVar.n(requireContext, yu1Var, this);
                if (n == coroutineSingletons) {
                    return coroutineSingletons;
                }
                context = mo2getContext;
                obj = n;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) this.L$0;
                kotlin.a.a(obj);
            }
            iyu0 iyu0Var = (iyu0) obj;
            if (iyu0Var != null) {
                dvt dvtVar2 = dvt.this;
                omv0 omv0Var = (omv0) dvtVar2.o.getValue();
                Long l = dvtVar2.p;
                omv0.a aVar = new omv0.a(l != null ? l.longValue() : System.currentTimeMillis(), VkStepsResultPermissionItem$SyncReason.GET_STEPS_COMMAND, iyu0Var, (String) null, 16);
                omv0Var.getClass();
                omv0.a(context, aVar);
            }
            return s3q0.a;
        }
    }

    /* compiled from: GetStepsHealthConnectCommand.kt */
    @b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsHealthConnectCommand", f = "GetStepsHealthConnectCommand.kt", l = {SQLiteStatementType.STATEMENT_OTHER, 108}, m = "trySendSteps")
    public static final class c extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return dvt.this.l(0L, 0L, null, this);
        }
    }

    /* compiled from: GetStepsHealthConnectCommand.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            dvt dvtVar = (dvt) this.receiver;
            bbs.b(dvtVar.m, new cvt(dvtVar, null));
            return s3q0.a;
        }
    }

    /* compiled from: GetStepsHealthConnectCommand.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((dvt) this.receiver).j();
            return s3q0.a;
        }
    }

    public dvt(FragmentImpl fragmentImpl, ayu0 ayu0Var, hmv0 hmv0Var) {
        super(fragmentImpl, ayu0Var, hmv0Var);
        hb0<Set<String>> registerForActivityResult;
        hb0<Intent> registerForActivityResult2;
        lb0 activityResultRegistry;
        lb0 activityResultRegistry2;
        this.m = fragmentImpl;
        this.n = ayu0Var;
        this.o = new bpn0(new sv0(17));
        this.q = new bpn0(new uv0(14));
        t0v t0vVar = new t0v();
        this.r = ayu0Var.a(RequestedMiniApp.VK_STEPS);
        FragmentActivity activity = fragmentImpl.getActivity();
        if (activity == null || (activityResultRegistry2 = activity.getActivityResultRegistry()) == null) {
            registerForActivityResult = fragmentImpl.registerForActivityResult(t0vVar, new ua0() { // from class: xsna.bvt
                @Override // xsna.ua0
                public final void onActivityResult(Object obj) {
                    dvt.this.p((Set) obj);
                }
            });
        } else {
            registerForActivityResult = activityResultRegistry2.c("VkStepsGetStepsHealthConnectCommand.resultRegistry: " + fragmentImpl.hashCode(), fragmentImpl, t0vVar, new ua0() { // from class: xsna.avt
                @Override // xsna.ua0
                public final void onActivityResult(Object obj) {
                    dvt.this.p((Set) obj);
                }
            });
        }
        this.s = registerForActivityResult;
        FragmentActivity activity2 = fragmentImpl.getActivity();
        if (activity2 == null || (activityResultRegistry = activity2.getActivityResultRegistry()) == null) {
            registerForActivityResult2 = fragmentImpl.registerForActivityResult(new cb0(), new pkt(this, 1));
        } else {
            registerForActivityResult2 = activityResultRegistry.c("VkStepsGetStepsHealthConnectCommand.openSettingsResultRegistry: " + fragmentImpl.hashCode(), fragmentImpl, new cb0(), new ua0() { // from class: xsna.zut
                @Override // xsna.ua0
                public final void onActivityResult(Object obj) {
                    dvt.this.o();
                }
            });
        }
        this.t = registerForActivityResult2;
    }

    @Override // xsna.kut, xsna.dvv0
    public final void a(String str) {
        bbs.b(this.m, new a(str, null));
    }

    @Override // xsna.kut
    public final boolean h() {
        return this.n.h(this.m.requireContext()) != MobileServicesType.GOOGLE_PLAY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0060, code lost:
    
        if (r0 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // xsna.kut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j, long j2, SelectedDataSource selectedDataSource, spj<? super s3q0> spjVar) {
        c cVar;
        int i;
        long j3;
        long j4;
        iyu0 iyu0Var;
        PermissionsResult.a aVar;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                FragmentImpl fragmentImpl = this.m;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Context requireContext = fragmentImpl.requireContext();
                    j3 = j;
                    cVar.J$0 = j3;
                    j4 = j2;
                    cVar.J$1 = j4;
                    cVar.label = 1;
                    obj = n(requireContext, null, cVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        PermissionsResult.a aVar2 = (PermissionsResult.a) cVar.L$0;
                        kotlin.a.a(obj);
                        aVar = aVar2;
                        PermissionsResult permissionsResult = (PermissionsResult) obj;
                        d dVar = new d(0, this, dvt.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", 0);
                        e eVar = new e(0, this, dvt.class, "permissionDenied", "permissionDenied()V", 0);
                        aVar.getClass();
                        PermissionsResult.a.a(permissionsResult, dVar, eVar);
                        return s3q0.a;
                    }
                    long j5 = cVar.J$1;
                    long j6 = cVar.J$0;
                    kotlin.a.a(obj);
                    j4 = j5;
                    j3 = j6;
                }
                iyu0Var = (iyu0) obj;
                if (iyu0Var != null) {
                    return s3q0.a;
                }
                if (iyu0Var.g != HealthConnectSdkStatus.AVAILABLE || !iyu0Var.b) {
                    r6y r6yVar = this.b;
                    if (r6yVar != null) {
                        bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                    }
                    mft0.a(new StringBuilder("VkStepsGetStepsHealthConnectCommand.trySendSteps() health connect services unavailable. thread: "), xgx0.a);
                    return s3q0.a;
                }
                mft0.a(new StringBuilder("VkStepsGetStepsHealthConnectCommand.trySendSteps() -> thread: "), xgx0.a);
                if (iyu0Var.a) {
                    if (epx.f(iyu0Var.f, g0v.b.a)) {
                        xgx0.a("VkStepsGetStepsHealthConnectCommand.trySendSteps() -> permission granted, thread: " + Thread.currentThread().getName());
                        bbs.b(this.e, new nut(this, j3, j4, SelectedDataSource.HEALTH_CONNECT, null));
                    } else {
                        bbs.b(fragmentImpl, new cvt(this, null));
                    }
                    return s3q0.a;
                }
                PermissionsResult.a aVar3 = PermissionsResult.Companion;
                Context requireContext2 = fragmentImpl.requireContext();
                cVar.L$0 = aVar3;
                cVar.label = 2;
                Object c2 = byu0.c(this.n, requireContext2, cVar);
                if (c2 != obj2) {
                    aVar = aVar3;
                    obj = c2;
                    PermissionsResult permissionsResult2 = (PermissionsResult) obj;
                    d dVar2 = new d(0, this, dvt.class, "checkHealthConnectPermissions", "checkHealthConnectPermissions()V", 0);
                    e eVar2 = new e(0, this, dvt.class, "permissionDenied", "permissionDenied()V", 0);
                    aVar.getClass();
                    PermissionsResult.a.a(permissionsResult2, dVar2, eVar2);
                    return s3q0.a;
                }
                return obj2;
            }
        }
        cVar = new c((ContinuationImpl) spjVar);
        Object obj3 = cVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        FragmentImpl fragmentImpl2 = this.m;
        if (i != 0) {
        }
        iyu0Var = (iyu0) obj3;
        if (iyu0Var != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r10v5, types: [xsna.izs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Context context, yu1 yu1Var, ContinuationImpl continuationImpl) {
        evt evtVar;
        int i;
        try {
            if (continuationImpl instanceof evt) {
                evtVar = (evt) continuationImpl;
                int i2 = evtVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    evtVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = evtVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = evtVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ayu0 ayu0Var = this.n;
                        RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                        evtVar.L$0 = yu1Var;
                        evtVar.label = 1;
                        obj = byu0.b(ayu0Var, context, requestedMiniApp, evtVar);
                        yu1Var = yu1Var;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r10 = (izs) evtVar.L$0;
                        kotlin.a.a(obj);
                        yu1Var = r10;
                    }
                    return (iyu0) obj;
                }
            }
            if (i != 0) {
            }
            return (iyu0) obj;
        } catch (Throwable th) {
            String str = "VkStepsGetStepsHealthConnectCommand.getVkHealthStatus() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
            xgx0.a.getClass();
            xgx0.b(str);
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.CUSTOM_ERROR, str, null, null, 56);
            }
            if (yu1Var == null) {
                return null;
            }
            yu1Var.invoke(th.getMessage());
            return null;
        }
        evtVar = new evt(this, continuationImpl);
        Object obj2 = evtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = evtVar.label;
    }

    public final void o() {
        Context mo2getContext = this.m.mo2getContext();
        if (mo2getContext == null) {
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            return;
        }
        this.n.j(mo2getContext, RequestedMiniApp.VK_STEPS, new sop(this, 11), new u4e(this, 23));
        q();
    }

    public final void p(Set<String> set) {
        xgx0.a.getClass();
        xgx0.a("VkStepsGetStepsHealthConnectCommand.handlePermissionsResult() -> permission granted " + set);
        Set<String> set2 = this.r;
        if (set.containsAll(set2)) {
            k(this.i, this.j, SelectedDataSource.HEALTH_CONNECT);
            q();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentImpl fragmentImpl = this.m;
        Context requireContext = fragmentImpl.requireContext();
        String[] strArr = (String[]) set2.toArray(new String[0]);
        permissionHelper.getClass();
        if (!PermissionHelper.t(requireContext, strArr)) {
            j();
            q();
            return;
        }
        Context requireContext2 = fragmentImpl.requireContext();
        d.a aVar = new d.a(fragmentImpl.requireContext());
        aVar.a.m = false;
        aVar.c(R.string.vk_permissions_go_to_settings_empty);
        aVar.j(requireContext2.getString(R.string.vk_permissions_go_to_settings_positive), new mv(this, 2));
        aVar.f(requireContext2.getString(R.string.vk_permissions_go_to_settings_negative), new nv(this, 4));
        aVar.m();
    }

    public final void q() {
        bbs.b(this.m, new b(null));
    }
}
