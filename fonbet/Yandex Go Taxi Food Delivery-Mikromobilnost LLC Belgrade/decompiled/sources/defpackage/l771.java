package defpackage;

import yads.ze;

/* loaded from: classes7.dex */
public final class l771 implements vbi0 {
    public volatile tr81 a;
    public volatile boolean b;
    public final /* synthetic */ ze c;

    public l771(ze zeVar) {
        this.c = zeVar;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        tr81 invoke;
        if (this.b) {
            return this.a;
        }
        ze zeVar = this.c;
        synchronized (this) {
            try {
                if (this.b) {
                    invoke = this.a;
                } else {
                    invoke = zeVar.invoke();
                    if (invoke != null) {
                        this.a = invoke;
                        this.b = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return invoke;
    }
}
