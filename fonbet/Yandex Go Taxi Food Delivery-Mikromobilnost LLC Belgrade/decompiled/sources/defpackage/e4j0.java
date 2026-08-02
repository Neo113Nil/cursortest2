package defpackage;

import kotlin.Result;
import ru.yandex.tankerapp.go.domain.error.PluginError;
import ru.yandex.tankerapp.go.models.ReporterEventModel;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class e4j0 implements tsr, ca20 {
    public final jhu0 a;
    public ea20 b;

    public e4j0(jhu0 jhu0Var) {
        this.a = jhu0Var;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "tanker_reporter_channel");
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.b;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        if (jl40.l(x920Var.a, "tanker_reporter_channel/report")) {
            Object a = pv00.a(x920Var.b);
            if (a instanceof Result.Failure) {
                a = null;
            }
            String str = (String) a;
            ReporterEventModel reporterEventModel = str != null ? (ReporterEventModel) icx.a().c(ReporterEventModel.class, str) : null;
            if (reporterEventModel != null) {
                ((j) this.a.a).o(reporterEventModel.getName(), null, reporterEventModel.getParams());
                ((ba20) da20Var).success(null);
            } else {
                PluginError.InvalidArguments invalidArguments = PluginError.InvalidArguments.a;
                ((ba20) da20Var).error(invalidArguments.getErrorCode(), invalidArguments.getErrorMessage(), null);
            }
        }
    }
}
