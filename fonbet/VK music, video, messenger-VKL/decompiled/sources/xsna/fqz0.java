package xsna;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class fqz0 extends com.google.android.gms.common.api.b {
    public static final com.google.android.gms.common.api.a a = new com.google.android.gms.common.api.a("ModuleInstall.API", new poz0(), new a.g());

    public final Task<ModuleAvailabilityResponse> a(ot80... ot80VarArr) {
        exc0.a("Please provide at least one OptionalModuleApi.", ot80VarArr.length > 0);
        for (ot80 ot80Var : ot80VarArr) {
            exc0.j(ot80Var, "Requested API must not be null.");
        }
        ApiFeatureRequest b = ApiFeatureRequest.b(Arrays.asList(ot80VarArr), false);
        if (b.b.isEmpty()) {
            return Tasks.forResult(new ModuleAvailabilityResponse(true, 0));
        }
        f5o0.a a2 = f5o0.a();
        a2.d = new Feature[]{com.google.android.gms.internal.base.zas.zaa};
        a2.e = 27301;
        a2.c = true;
        a2.b = false;
        a2.a = new cks(this, b);
        return doRead(a2.a());
    }
}
