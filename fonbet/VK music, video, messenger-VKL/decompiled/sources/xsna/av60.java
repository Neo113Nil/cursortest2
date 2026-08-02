package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class av60 implements izs {
    public final /* synthetic */ wzs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ dv60 d;

    public /* synthetic */ av60(wzs wzsVar, long j, dv60 dv60Var) {
        this.b = wzsVar;
        this.c = j;
        this.d = dv60Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        zvq zvqVar = new zvq();
        dv60 dv60Var = this.d;
        jw60 jw60Var = new jw60(this.c, (lu0) dv60Var.i.getValue(), zvqVar, dv60Var.o);
        return (io.reactivex.rxjava3.core.b0) this.b.invoke((iw60) obj, jw60Var);
    }
}
