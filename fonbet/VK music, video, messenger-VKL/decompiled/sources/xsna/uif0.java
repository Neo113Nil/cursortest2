package xsna;

/* compiled from: RecyclerExt.kt */
/* loaded from: classes17.dex */
public final class uif0 {
    public static final void a(m4 m4Var, q8e q8eVar) {
        if (s101.r(q8eVar)) {
            m4Var.invoke();
        } else {
            q8eVar.addOnChildAttachStateChangeListener(new tif0(m4Var, q8eVar));
        }
    }
}
