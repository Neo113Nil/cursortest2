package xsna;

/* compiled from: EditablePlaylist.kt */
/* loaded from: classes8.dex */
public class b2p extends y6b0 {
    public void b(gzs<s3q0> gzsVar) {
        this.a.clear();
        gzsVar.invoke();
    }

    public void c(int i, gzs<s3q0> gzsVar) {
        this.a.remove(i);
        gzsVar.invoke();
    }

    public void d(int i, sht0 sht0Var, gzs<s3q0> gzsVar) {
        this.a.set(i, sht0Var);
        ((ww) gzsVar).invoke();
    }
}
