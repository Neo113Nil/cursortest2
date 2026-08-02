package xsna;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ekl implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ekl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                fkl fklVar = (fkl) this.c;
                if (fklVar.a == null) {
                    fklVar.a = Long.valueOf(SystemClock.elapsedRealtime());
                }
                return s3q0.a;
            default:
                return ((qi40) this.c).c;
        }
    }
}
