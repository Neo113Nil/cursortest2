package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class e8v extends aas {
    public final /* synthetic */ int w = 1;
    public final Object x;

    public e8v(jdv jdvVar, f8v f8vVar) {
        super(jdvVar);
        this.x = new WeakReference(f8vVar);
        a(new d8v(0, this));
    }

    @Override // defpackage.aas, java.lang.AutoCloseable
    public void close() {
        switch (this.w) {
            case 1:
                if (!((AtomicBoolean) this.x).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public e8v(jdv jdvVar) {
        super(jdvVar);
        this.x = new AtomicBoolean(false);
    }
}
