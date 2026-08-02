package xsna;

import xsna.kug;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o70(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.d;
                izs izsVar = (izs) this.e;
                gzsVar.invoke();
                izsVar.invoke(new g9o0(this.c));
                break;
            default:
                eug eugVar = (eug) this.d;
                kug.a aVar = (kug.a) this.e;
                eugVar.getOnOpenUrl().invoke(new pug(aVar.e, Integer.valueOf(aVar.a), Integer.valueOf(this.c)));
                break;
        }
        return s3q0.a;
    }
}
