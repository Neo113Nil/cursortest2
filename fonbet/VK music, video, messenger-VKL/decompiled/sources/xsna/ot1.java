package xsna;

import com.vk.dto.common.Source;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;
import xsna.pt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ot1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ot1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        Object obj;
        switch (this.b) {
            case 0:
                pt1.a.remove((pt1.a) this.c);
                return;
            case 1:
                ((com.vk.channels.impl.comments.b) this.c).q(new x4(8));
                return;
            case 2:
                wgb wgbVar = (wgb) this.c;
                wgbVar.b.a(new com.vk.movika.sdk.base.logic.processor.actions.g(wgbVar, 14));
                bib bibVar = wgbVar.h;
                pdg0 n = ((a1w) bibVar.a).n(bibVar, new ofb(Source.ACTUAL, "messenger"));
                if (n instanceof pdg0.a) {
                    obj = new scf0(0);
                } else {
                    if (!(n instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = ((pdg0.b) n).a;
                }
                scf0 scf0Var = (scf0) obj;
                wgbVar.b(new sx4(wgbVar, j5g.O0(scf0Var.b.c.values()), scf0Var, 1));
                return;
            case 3:
                ((cbk) this.c).i = false;
                return;
            case 4:
                xam xamVar = (xam) this.c;
                xamVar.r = null;
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    zamVar.b();
                    return;
                }
                return;
            default:
                ((izd0) this.c).i = false;
                return;
        }
    }
}
