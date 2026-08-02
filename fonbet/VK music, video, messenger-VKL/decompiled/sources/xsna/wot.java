package xsna;

/* compiled from: GesturesFeedbackDelegate.kt */
/* loaded from: classes7.dex */
public final class wot {
    public final com.vk.voip.b a;
    public final u4x0 b;
    public final jzm0 c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final cpt e;
    public final io.reactivex.rxjava3.disposables.c f;
    public final yot g;

    public wot(com.vk.voip.b bVar, io.reactivex.rxjava3.core.q qVar, u4x0 u4x0Var, su9 su9Var, boolean z, jzm0 jzm0Var) {
        this.a = bVar;
        this.b = u4x0Var;
        this.c = jzm0Var;
        this.e = new cpt(z);
        this.g = new yot(jzm0Var, new fbh(this, 21), new dnh(this, 25), su9Var, new l35(12));
        if (((Boolean) jzm0Var.invoke()).booleanValue()) {
            io.reactivex.rxjava3.disposables.c cVar = this.f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f = qVar.a0(asu0.a.d()).subscribe(new om1(new dhh(this, 17), 21));
        }
    }
}
