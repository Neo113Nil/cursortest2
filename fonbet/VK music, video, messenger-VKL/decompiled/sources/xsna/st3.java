package xsna;

import android.content.Intent;
import com.ironsource.C4217a2;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: AskGoogleFitWorkoutPermissionsCommand.kt */
/* loaded from: classes6.dex */
public final class st3 extends dvv0 {
    public final FragmentImpl e;
    public final ayu0 f;

    /* compiled from: AskGoogleFitWorkoutPermissionsCommand.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            r6y r6yVar = ((st3) this.receiver).b;
            if (r6yVar != null) {
                bex0.a.b(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, new JSONObject().put("permission_state", "granted"), null, 12);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AskGoogleFitWorkoutPermissionsCommand.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            r6y r6yVar = ((st3) this.receiver).b;
            if (r6yVar != null) {
                bex0.a.b(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, new JSONObject().put("permission_state", C4217a2.e), null, 12);
            }
            return s3q0.a;
        }
    }

    public st3(FragmentImpl fragmentImpl, ayu0 ayu0Var) {
        this.e = fragmentImpl;
        this.f = ayu0Var;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        fvv0 M;
        r6y r6yVar = this.b;
        Long valueOf = (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId());
        if (BuildInfo.h() || j5g.P(g2w0.j, valueOf)) {
            kxu0 kxu0Var = new kxu0();
            kxu0Var.a = this.e;
            this.f.e(kxu0Var, new a(0, this, st3.class, "permissionGranted", "permissionGranted()V", 0), new b(0, this, st3.class, "permissionDenied", "permissionDenied()V", 0), RequestedMiniApp.VK_WORKOUT);
        } else {
            r6y r6yVar2 = this.b;
            if (r6yVar2 != null) {
                bex0.a.a(r6yVar2, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
            }
        }
    }

    @Override // xsna.dvv0
    public final void c(int i, int i2, Intent intent) {
        this.f.o(this.e.requireContext(), i, intent, i2);
    }
}
