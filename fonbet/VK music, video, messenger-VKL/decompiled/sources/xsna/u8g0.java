package xsna;

import ru.ok.tracer.utils.SimpleFileKeyValueStorage;
import xsna.t8g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u8g0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8g0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                t8g0 t8g0Var = ((t8g0.c) this.c).c;
                if (t8g0Var.g != null) {
                    t8g0Var.a();
                    break;
                }
                break;
            case 1:
                ((SimpleFileKeyValueStorage) this.c).writeMap();
                break;
            default:
                ((com.my.tracker.obfuscated.i2) this.c).f();
                break;
        }
    }
}
