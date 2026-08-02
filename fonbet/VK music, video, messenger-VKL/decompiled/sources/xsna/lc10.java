package xsna;

import android.util.TypedValue;
import java.util.List;
import xsna.lrv0;
import xsna.se10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lc10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ lc10(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [xsna.lrv0$a, xsna.pe10] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        final wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                List<T> list = ((wow) wh50Var.getValue()).b;
                wow wowVar = new wow(list);
                ((rry) obj).a(list.size(), null, new qc10(wowVar), new jai(-1117249557, new rc10(wowVar, wh50Var), true));
                return s3q0.a;
            case 1:
                ?? r7 = new lrv0.a() { // from class: xsna.pe10
                    @Override // xsna.lrv0.a
                    public final void xb() {
                        wh50 wh50Var2 = wh50.this;
                        TypedValue typedValue = krv0.a;
                        wh50Var2.setValue(Boolean.valueOf(epx.f(krv0.i(krv0.b != null ? dhr0.E() : null), Boolean.FALSE)));
                    }
                };
                TypedValue typedValue = krv0.a;
                krv0.a(r7);
                return new se10.a(r7);
            default:
                wh50Var.setValue(jgz.j((tny) obj, true));
                return s3q0.a;
        }
    }
}
