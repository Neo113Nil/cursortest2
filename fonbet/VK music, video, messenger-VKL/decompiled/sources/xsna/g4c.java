package xsna;

import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class g4c implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g4c(int i, String str, ArrayList arrayList, izs izsVar, q630 q630Var) {
        this.d = arrayList;
        this.e = str;
        this.c = izsVar;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                i4c.d((l5c) this.d, (v8s) this.e, (xvy) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                String str = (String) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                o7u.a(ne7.I(3073), (androidx.compose.runtime.a) obj, str, arrayList, this.c, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ g4c(l5c l5cVar, v8s v8sVar, xvy xvyVar, izs izsVar, int i) {
        this.d = l5cVar;
        this.e = v8sVar;
        this.f = xvyVar;
        this.c = izsVar;
    }
}
