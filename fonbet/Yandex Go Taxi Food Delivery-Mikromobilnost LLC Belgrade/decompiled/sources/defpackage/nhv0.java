package defpackage;

import com.yandex.go.summary.interactor.core.t;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.VerticalMode;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class nhv0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ nhv0(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                ((x8) tVar.g).e(tVar.e.a.x);
                break;
            case 1:
                ((qht0) this.b.b0).c((f4e) obj);
                break;
            case 2:
                this.b.X.a(pfv0.a);
                break;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t tVar2 = this.b;
                if (booleanValue) {
                    tVar2.b.a(null, tVar2.c);
                } else {
                    tVar2.b.b(null, tVar2.c);
                }
                break;
            case 4:
                if (jl40.l(((fnx0) obj).d, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    fnx0 fnx0Var = ((k) this.b.a).j.g;
                    if (!jl40.l(fnx0Var != null ? fnx0Var.d : null, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY) && !((Boolean) this.b.d0.a.b()).booleanValue()) {
                        t tVar3 = this.b;
                        pcm pcmVar = tVar3.c0;
                        fnx0 fnx0Var2 = ((k) tVar3.a).j.g;
                        ((qcm) pcmVar).a(fnx0Var2 != null ? fnx0Var2.d : null);
                    }
                }
                break;
            case 5:
                t tVar4 = this.b;
                tVar4.getClass();
                mi31 mi31Var = ((ik31) obj).b;
                tVar4.i.a(mi31Var);
                tVar4.n.a(mi31Var);
                tVar4.D.b(mi31Var.f);
                break;
            case 6:
                this.b.k.a((ird) obj);
                break;
            case 7:
                this.b.o.b((k610) obj);
                break;
            case 8:
                this.b.l.b((r6d0) obj);
                break;
            default:
                VerticalMode verticalMode = (VerticalMode) obj;
                t tVar5 = this.b;
                tVar5.getClass();
                VerticalMode verticalMode2 = VerticalMode.SELECTOR;
                hk31 hk31Var = tVar5.s;
                if (verticalMode == verticalMode2) {
                    hk31Var.b();
                } else {
                    hk31Var.a();
                }
                break;
        }
        return zy11.a;
    }
}
