package xsna;

import xsna.ttf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dqf implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ dqf(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (ttf.a) this.c.invoke(obj);
            case 1:
                return (String) this.c.invoke(obj);
            default:
                return (fhx0) this.c.invoke(obj);
        }
    }
}
