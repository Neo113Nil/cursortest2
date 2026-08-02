package xsna;

/* compiled from: Context.java */
/* loaded from: classes11.dex */
public interface wmj {
    static wmj current() {
        wmj current = yxy.b.current();
        return current != null ? current : mk3.b;
    }

    mk3 a(rll rllVar, ohk0 ohk0Var);

    default wmj b(ohk0 ohk0Var) {
        return ohk0Var.b(this);
    }

    <V> V c(rll rllVar);

    default v9h0 makeCurrent() {
        return yxy.b.b(this);
    }
}
