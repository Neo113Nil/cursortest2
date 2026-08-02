package defpackage;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.flow.r0;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.g;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.h;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.i;

/* loaded from: classes4.dex */
public final class oib0 extends vc5 {
    public final IFlowController E;
    public final bhb0 F;
    public String G;

    public oib0(IVerificationFlowController iVerificationFlowController, bhb0 bhb0Var) {
        super(iVerificationFlowController);
        this.E = iVerificationFlowController;
        this.F = bhb0Var;
        this.G = "";
    }

    @Override // defpackage.yr31
    public final void V() {
        bhb0 bhb0Var = this.F;
        ExecutorService executorService = bhb0Var.e;
        if (executorService != null) {
            executorService.shutdown();
        }
        bhb0Var.a = null;
        bhb0Var.d = null;
        bhb0Var.b = null;
        bhb0Var.c = null;
        bhb0Var.e = null;
        bhb0Var.f = null;
    }

    @Override // defpackage.vc5
    public final tt11 Y() {
        return new lib0(0);
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        if (ys11Var instanceof bib0) {
            tje.N(ds31.a(this), null, null, new g(this, ((bib0) ys11Var).a, null), 3);
            return;
        }
        if (ys11Var instanceof cib0) {
            cib0 cib0Var = (cib0) ys11Var;
            JSONObject jSONObject = cib0Var.a;
            String str = cib0Var.b;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instruction", new JSONObject(String.format("\n                {\n                   \"mnemonic\":\"pre-instructions\",\n                   \"index\":0,\n                   \"actions\":{\n                      \"type\":\"pre\",\n                      \"index\":0,\n                      \"duration\":0,\n                      \"message\":\"%s\"\n                   }\n                }\n            ", Arrays.copyOf(new Object[]{str}, 1))));
            jSONObject2.put("customization", jSONObject);
            lib0 a = lib0.a((lib0) a0(), new ogb0(jSONObject2), null, false, false, false, 0, 62);
            r0 r0Var = (r0) c0();
            r0Var.getClass();
            r0Var.m(null, a);
            return;
        }
        if (ys11Var instanceof eib0) {
            W(g0(3000L, new mib0(this, 0)), "timer_incorrect_html_job");
            return;
        }
        if (ys11Var instanceof fib0) {
            X("timer_incorrect_html_job");
            lib0 a2 = lib0.a((lib0) a0(), pgb0.b, null, false, false, false, 0, 62);
            r0 r0Var2 = (r0) c0();
            r0Var2.getClass();
            r0Var2.m(null, a2);
            return;
        }
        if (ys11Var instanceof hib0) {
            Bitmap bitmap = ((hib0) ys11Var).a;
            W(tje.N(ds31.a(this), this.D, null, new i(this, bitmap, null), 2), "take_photo_job");
            return;
        }
        if (ys11Var instanceof dib0) {
            X("take_photo_job");
            X("timer_incorrect_html_job");
            if (((lib0) a0()).a instanceof lgb0) {
                return;
            }
            lib0 a3 = lib0.a((lib0) a0(), new ngb0(this.G), null, false, false, false, 0, 62);
            r0 r0Var3 = (r0) c0();
            r0Var3.getClass();
            r0Var3.m(null, a3);
            return;
        }
        if (!(ys11Var instanceof gib0)) {
            super.d0(ys11Var);
            return;
        }
        if (((lib0) a0()).c) {
            lib0 a4 = lib0.a((lib0) a0(), null, null, false, false, false, 0, 59);
            r0 r0Var4 = (r0) c0();
            r0Var4.getClass();
            r0Var4.m(null, a4);
            tje.N(ds31.a(this), null, null, new h(this, null), 3);
        }
    }
}
