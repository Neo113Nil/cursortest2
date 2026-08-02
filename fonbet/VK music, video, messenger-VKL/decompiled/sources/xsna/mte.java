package xsna;

import xsna.cue;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mte implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mte(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((pte) this.e).g((cue.a) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                String str = (String) this.e;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                eww.d(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, izsVar, q630Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((hr40) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ich0.j((idh0) this.e, (izs) this.c, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mte(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.e = obj;
        this.c = izsVar;
        this.f = q630Var;
        this.d = i;
    }
}
