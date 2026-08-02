package defpackage;

import com.yandex.go.safety.center.instructions.a;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final /* synthetic */ class msl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ msl0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                ppl0 ppl0Var = aVar.y.a;
                ppl0Var.a.a("SafetyCenter.InstructionList.Shown", tse0.o(ppl0Var), 1, new HashMap());
                break;
            case 1:
                ppl0 ppl0Var2 = aVar.y.a;
                ppl0Var2.a.a("SafetyCenter.InstructionList.Closed", tse0.o(ppl0Var2), 1, new HashMap());
                break;
            default:
                aVar.onBackPressed();
                break;
        }
    }
}
