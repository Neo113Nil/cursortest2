package xsna;

import java.util.function.BiConsumer;

/* compiled from: ReadWriteLogRecord.java */
/* loaded from: classes8.dex */
public interface o7f0 {
    /* synthetic */ default void a(i94 i94Var, Object obj) {
        b();
    }

    o7f0 b();

    m000 c();

    default void d(q94 q94Var) {
        if (q94Var == null || q94Var.isEmpty()) {
            return;
        }
        q94Var.forEach(new BiConsumer() { // from class: xsna.n7f0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                o7f0.this.a((i94) obj, obj2);
            }
        });
    }
}
