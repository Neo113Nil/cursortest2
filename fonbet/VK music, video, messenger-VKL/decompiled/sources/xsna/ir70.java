package xsna;

import xsna.q630;

/* compiled from: ObserverModifierNode.kt */
/* loaded from: classes11.dex */
public final class ir70 {
    public static final <T extends q630.c & hr70> void a(T t, gzs<s3q0> gzsVar) {
        jr70 jr70Var = t.h;
        if (jr70Var == null) {
            jr70Var = new jr70(t);
            t.h = jr70Var;
        }
        t590 snapshotObserver = itl.g(t).getSnapshotObserver();
        snapshotObserver.a.d(jr70Var, jr70.c, gzsVar);
    }
}
