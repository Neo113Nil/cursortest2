package xsna;

import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: CitiesRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class lec implements gz20, m901 {
    public final Object b;

    public /* synthetic */ lec(Object obj) {
        this.b = obj;
    }

    @Override // xsna.m901
    public void e(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((qj01) this.b).m(str, i, th, bArr, map);
    }

    @Override // xsna.gz20
    public void onCancel() {
        ga50 ga50Var = (ga50) this.b;
        gzs<s3q0> gzsVar = ga50Var.l;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        ga50Var.getClass();
    }

    public lec(kec kecVar, dz5 dz5Var) {
        this.b = kecVar;
    }

    public lec(int i) {
        switch (i) {
            case 2:
                this.b = new LinkedHashSet();
                break;
            default:
                this.b = new sdy();
                break;
        }
    }
}
