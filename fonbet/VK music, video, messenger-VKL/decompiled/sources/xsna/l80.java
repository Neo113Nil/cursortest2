package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: ActiveResources.java */
/* loaded from: classes12.dex */
public final class l80 {
    public final ExecutorService a;
    public final HashMap b;
    public final ReferenceQueue<vlp<?>> c;
    public klp d;

    /* compiled from: ActiveResources.java */
    public static final class a extends WeakReference<vlp<?>> {
        public final ady a;
        public final boolean b;

        @Nullable
        public hag0<?> c;

        public a(@NonNull ady adyVar, @NonNull vlp vlpVar, @NonNull ReferenceQueue referenceQueue) {
            super(vlpVar, referenceQueue);
            nr2.r(adyVar, "Argument must not be null");
            this.a = adyVar;
            boolean z = vlpVar.b;
            this.c = null;
            this.b = z;
        }
    }

    public l80() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new j80());
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new k80(this));
    }

    public final synchronized void a(ady adyVar, vlp<?> vlpVar) {
        a aVar = (a) this.b.put(adyVar, new a(adyVar, vlpVar, this.c));
        if (aVar != null) {
            aVar.c = null;
            aVar.clear();
        }
    }

    public final void b(@NonNull a aVar) {
        hag0<?> hag0Var;
        synchronized (this) {
            this.b.remove(aVar.a);
            if (aVar.b && (hag0Var = aVar.c) != null) {
                this.d.a(aVar.a, new vlp<>(hag0Var, true, false, aVar.a, this.d));
            }
        }
    }
}
