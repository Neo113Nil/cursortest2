package defpackage;

import com.yandex.quark.utils.Disposable;

/* loaded from: classes8.dex */
public final class coh implements g38, ugz, khg0 {
    public final zwf0 a;
    public final ymt b;
    public Disposable c;

    public coh() {
        zwf0 zwf0Var = new zwf0();
        this.a = zwf0Var;
        this.b = new ymt(zwf0Var);
    }

    @Override // defpackage.ugz
    public final void d(qgz qgzVar) {
        this.a.a = qgzVar;
    }

    @Override // defpackage.g38
    public final synchronized void n(e8h e8hVar) {
        Object obj = e8hVar.a(this.b).a;
        if (obj != null) {
            this.a.info("YangoFeature", "Success register capability");
            this.c = (Disposable) obj;
        }
    }
}
