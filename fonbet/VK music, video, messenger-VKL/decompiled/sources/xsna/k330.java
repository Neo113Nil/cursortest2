package xsna;

import com.vk.api.generated.account.dto.AccountGetModelsResponseDto;
import com.vk.music.bottomsheets.domain.model.ConsumeReason;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k330 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k330(int i, izs izsVar, z7w z7wVar) {
        this.b = 2;
        this.c = i;
        this.d = z7wVar;
        this.e = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.ml.b) this.d).j(((AccountGetModelsResponseDto) obj).d(), this.c, (per) this.e, null);
                return s3q0.a;
            case 1:
                final b6e0 b6e0Var = (b6e0) this.d;
                final ConsumeReason consumeReason = (ConsumeReason) this.e;
                if (((Boolean) obj).booleanValue()) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                final int i = this.c;
                return new io.reactivex.rxjava3.internal.operators.completable.m(new Callable(b6e0Var, i, consumeReason) { // from class: xsna.a6e0
                    public final /* synthetic */ int b;
                    public final /* synthetic */ ConsumeReason c;

                    {
                        this.b = i;
                        this.c = consumeReason;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        wsl b = uh.b.b();
                        int i2 = this.b;
                        String a = lhg.a(i2, "ConsumePromoJob");
                        fyx fyxVar = new fyx();
                        JSONObject jSONObject = fyxVar.a;
                        jSONObject.put("KEY_PROMO_ID", i2);
                        jSONObject.put("KEY_REASON", this.c.h());
                        s3q0 s3q0Var = s3q0.a;
                        ((xsl) b).a(a, new c7j(fyxVar), usl.a(usl.h, null, 251));
                        return s3q0.a;
                    }
                });
            case 2:
                z7w z7wVar = (z7w) this.d;
                izs izsVar = (izs) this.e;
                int i2 = this.c;
                return ((io.reactivex.rxjava3.core.q) obj).L0(io.reactivex.rxjava3.core.q.e0(1, i2), new utg0(new ccm(i2, izsVar, z7wVar), 0)).L(new s11(new av70(11), 25), false);
            default:
                zhf0 zhf0Var = (zhf0) this.d;
                return new h9x((an10.b(zhf0Var.a) << 32) | (((((w4p0) this.e).d ? an10.b(zhf0Var.b) : an10.b(zhf0Var.d)) - this.c) & 4294967295L));
        }
    }

    public /* synthetic */ k330(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    public /* synthetic */ k330(zhf0 zhf0Var, w4p0 w4p0Var, int i) {
        this.b = 3;
        this.d = zhf0Var;
        this.e = w4p0Var;
        this.c = i;
    }
}
