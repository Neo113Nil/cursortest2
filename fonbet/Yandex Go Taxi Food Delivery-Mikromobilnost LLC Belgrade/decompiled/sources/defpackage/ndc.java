package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class ndc extends c {
    public final /* synthetic */ int b;
    public final List c;
    public final EvaluableType d;
    public final boolean e;
    public final Object f;

    public ndc(ndc ndcVar, byte b) {
        this.b = 3;
        this.f = ndcVar;
        this.c = scc.g(new kms(EvaluableType.STRING, false), new kms(EvaluableType.NUMBER, false));
        this.d = EvaluableType.COLOR;
        this.e = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        int i = this.b;
        Object obj = this.f;
        switch (i) {
            case 0:
                int intValue = ((Number) ((tls) obj).invoke((jdc) a.P(list))).intValue();
                if (intValue >= 0 && intValue < 256) {
                    return Double.valueOf(intValue / 255.0d);
                }
                ny61.g("Value out of channel range 0..255");
                return null;
            case 1:
                int i2 = ((jdc) list.get(0)).a;
                Double d = (Double) list.get(1);
                try {
                    return new jdc(((jdc) ((wls) obj).invoke(new jdc(i2), d)).a);
                } catch (IllegalArgumentException unused) {
                    b.e(this.c(), scc.g(jdc.a(i2), d), "Value out of range 0..1.", null);
                    throw null;
                }
            case 2:
                try {
                    return ((ndc) obj).e(cxq0Var, jdoVar, Collections.singletonList(new jdc(wwg.B((String) a.P(list)))));
                } catch (IllegalArgumentException e) {
                    b.e(this.c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e);
                    throw null;
                }
            default:
                try {
                    return ((ndc) obj).e(cxq0Var, jdoVar, scc.g(new jdc(wwg.B((String) list.get(0))), list.get(1)));
                } catch (IllegalArgumentException e2) {
                    b.e(this.c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e2);
                    throw null;
                }
        }
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        switch (this.b) {
        }
        return this.d;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        switch (this.b) {
        }
        return this.e;
    }

    public ndc(ndc ndcVar) {
        this.b = 2;
        this.f = ndcVar;
        this.c = Collections.singletonList(new kms(EvaluableType.STRING, false));
        this.d = EvaluableType.NUMBER;
        this.e = true;
    }

    public ndc(wls wlsVar) {
        this.b = 1;
        this.f = wlsVar;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.c = scc.g(new kms(evaluableType, false), new kms(EvaluableType.NUMBER, false));
        this.d = evaluableType;
        this.e = true;
    }

    public ndc(tls tlsVar) {
        this.b = 0;
        this.f = tlsVar;
        this.c = Collections.singletonList(new kms(EvaluableType.COLOR, false));
        this.d = EvaluableType.NUMBER;
        this.e = true;
    }
}
