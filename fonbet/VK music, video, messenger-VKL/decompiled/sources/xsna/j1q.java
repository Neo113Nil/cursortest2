package xsna;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import ru.ok.tracer.heap.dumps.HeapDumpInitializer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j1q implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                k1q k1qVar = (k1q) this.c;
                ((Number) k1qVar.f.getValue()).longValue();
                long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(2L);
                k1qVar.a().execSQL("DELETE FROM events WHERE date < " + currentTimeMillis);
                break;
            case 1:
                HeapDumpInitializer.create$lambda$0((Context) this.c);
                break;
            default:
                ((File) this.c).delete();
                break;
        }
    }
}
