package defpackage;

/* loaded from: classes8.dex */
public final class pa00 implements ghf {
    public final jc00 a;

    public pa00(jc00 jc00Var) {
        this.a = jc00Var;
    }

    @Override // defpackage.ghf
    public final String a() {
        return this.a.a() ? "taxi_main" : "pickup_location";
    }

    @Override // defpackage.ghf
    public final String b() {
        return this.a.a() ? "TaxiMain" : "Main";
    }

    public final String c() {
        return this.a.a() ? "taxi_main" : "main";
    }
}
