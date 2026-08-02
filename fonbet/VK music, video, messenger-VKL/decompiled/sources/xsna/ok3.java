package xsna;

import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: ArrayBasedTraceState.java */
/* loaded from: classes11.dex */
public abstract class ok3 {
    public final void a(BiConsumer<String, String> biConsumer) {
        List<String> b = b();
        for (int i = 0; i < b.size(); i += 2) {
            biConsumer.accept(b.get(i), b.get(i + 1));
        }
    }

    public abstract List<String> b();
}
