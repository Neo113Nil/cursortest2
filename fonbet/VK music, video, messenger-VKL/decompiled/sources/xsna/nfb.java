package xsna;

import java.util.LinkedHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nfb implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nfb(int i, LinkedHashMap linkedHashMap) {
        this.c = i;
        this.d = linkedHashMap;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.a().t(this.c);
                uib a = xgl0Var.a();
                a.S();
                a.m(linkedHashMap);
                break;
            default:
                ((wzs) this.d).invoke(Integer.valueOf(this.c), (String) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nfb(int i, wzs wzsVar) {
        this.d = wzsVar;
        this.c = i;
    }
}
