package xsna;

import xsna.qyj;

/* compiled from: AnimatedFrameCache.java */
/* loaded from: classes12.dex */
public final class rj2 implements qyj.b<ww8> {
    public final /* synthetic */ sj2 a;

    public rj2(sj2 sj2Var) {
        this.a = sj2Var;
    }

    public final void a(Object obj, boolean z) {
        ww8 ww8Var = (ww8) obj;
        sj2 sj2Var = this.a;
        synchronized (sj2Var) {
            try {
                if (z) {
                    sj2Var.d.add(ww8Var);
                } else {
                    sj2Var.d.remove(ww8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
