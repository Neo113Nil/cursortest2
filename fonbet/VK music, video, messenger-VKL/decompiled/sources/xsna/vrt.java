package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.bex0;
import xsna.f2w0;

/* compiled from: GetGoogleFitWorkoutsCommand.kt */
/* loaded from: classes6.dex */
public final class vrt extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;
    public final f2w0 g;
    public boolean h;
    public final bpn0 i = new bpn0(new d1(16));
    public final bpn0 j = new bpn0(new pd4(12));

    /* compiled from: GetGoogleFitWorkoutsCommand.kt */
    @b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.GetGoogleFitWorkoutsCommand$execute$1", f = "GetGoogleFitWorkoutsCommand.kt", l = {92, 104}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ String $data;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return vrt.this.new a(this.$data, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0111  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FragmentActivity activity;
            FragmentActivity activity2;
            Context context;
            fvv0 M;
            iyu0 iyu0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    r6y r6yVar = vrt.this.b;
                    Long valueOf = (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId());
                    if (BuildInfo.h() || j5g.P(g2w0.j, valueOf)) {
                        wdx0 wdx0Var = e370.f;
                        if ((wdx0Var != null ? wdx0Var : null).k()) {
                            Context mo2getContext = vrt.this.e.mo2getContext();
                            if (mo2getContext == null || (((activity = vrt.this.e.getActivity()) != null && activity.isDestroyed()) || ((activity2 = vrt.this.e.getActivity()) != null && activity2.isFinishing()))) {
                                r6y r6yVar2 = vrt.this.b;
                                if (r6yVar2 != null) {
                                    bex0.a.a(r6yVar2, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                                }
                                return s3q0.a;
                            }
                            String str = this.$data;
                            if (str != null && str.length() != 0) {
                                vrt.this.h = new JSONObject(this.$data).optBoolean("need_resync");
                            }
                            ayu0 ayu0Var = vrt.this.f;
                            RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
                            this.L$0 = mo2getContext;
                            this.label = 1;
                            Object b = byu0.b(ayu0Var, mo2getContext, requestedMiniApp, this);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            context = mo2getContext;
                            obj = b;
                        }
                    }
                    r6y r6yVar3 = vrt.this.b;
                    if (r6yVar3 != null) {
                        bex0.a.a(r6yVar3, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iyu0Var = (iyu0) this.L$1;
                    context = (Context) this.L$0;
                    kotlin.a.a(obj);
                    vrt vrtVar = vrt.this;
                    if (jyu0.e(iyu0Var)) {
                        vrtVar.getClass();
                        if (iyu0Var.h == MobileServicesType.GOOGLE_PLAY) {
                            ayu0 ayu0Var2 = vrtVar.f;
                            FragmentImpl fragmentImpl = vrtVar.e;
                            kxu0 kxu0Var = new kxu0();
                            kxu0Var.a = fragmentImpl;
                            ayu0Var2.e(kxu0Var, new mij(vrtVar, 1), new nij(vrtVar, 1), RequestedMiniApp.VK_WORKOUT);
                        } else {
                            r6y r6yVar4 = vrtVar.b;
                            if (r6yVar4 != null) {
                                bex0.a.a(r6yVar4, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                            }
                        }
                    } else {
                        vrtVar.e(context);
                    }
                    return s3q0.a;
                }
                context = (Context) this.L$0;
                kotlin.a.a(obj);
                iyu0 iyu0Var2 = (iyu0) obj;
                if (!iyu0Var2.b) {
                    r6y r6yVar5 = vrt.this.b;
                    if (r6yVar5 != null) {
                        bex0.a.a(r6yVar5, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                    }
                    return s3q0.a;
                }
                d2w0 d2w0Var = (d2w0) vrt.this.j.getValue();
                SelectedDataSource selectedDataSource = SelectedDataSource.GOOGLE_FIT;
                this.L$0 = context;
                this.L$1 = iyu0Var2;
                this.label = 2;
                if (d2w0Var.a(selectedDataSource, this) != coroutineSingletons) {
                    iyu0Var = iyu0Var2;
                    vrt vrtVar2 = vrt.this;
                    if (jyu0.e(iyu0Var)) {
                    }
                    return s3q0.a;
                }
                return coroutineSingletons;
            } catch (Throwable th) {
                String str2 = "VkWorkout.GetGoogleFitWorkoutsCommand.execute() -> Error message: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
                xgx0.a.getClass();
                xgx0.b(str2);
                r6y r6yVar6 = vrt.this.b;
                if (r6yVar6 != null) {
                    bex0.a.a(r6yVar6, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.CUSTOM_ERROR, str2, null, null, 56);
                }
                return s3q0.a;
            }
        }
    }

    public vrt(FragmentImpl fragmentImpl, ayu0 ayu0Var, f2w0 f2w0Var) {
        this.e = fragmentImpl;
        this.f = ayu0Var;
        this.g = f2w0Var;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        m4s.z(this.e, new a(str, null));
    }

    @Override // xsna.dvv0
    public final void c(int i, int i2, Intent intent) {
        Context mo2getContext = this.e.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        this.f.o(mo2getContext, i, intent, i2);
    }

    public final JSONObject d(Context context, JSONObject jSONObject) {
        bpn0 bpn0Var = this.i;
        ((x1w0) bpn0Var.getValue()).getClass();
        JSONObject put = jSONObject.put("google_fit_version", x1w0.a(context, "com.google.android.apps.fitness"));
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            ((x1w0) bpn0Var.getValue()).getClass();
            put.put("gms_version", x1w0.a(context, "com.google.android.gms"));
        }
        return put;
    }

    public final void e(Context context) {
        ton0 ton0Var = new ton0(SyncWorkoutReason.BRIDGE_EVENT, this.h);
        SelectedDataSource selectedDataSource = SelectedDataSource.GOOGLE_FIT;
        f2w0.b.a(this.g, context, ton0Var, new defpackage.v(12, this, context), new kj6(1, this, context), selectedDataSource, 4);
    }
}
