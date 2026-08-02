package ru.ok.gl.util;

import androidx.annotation.NonNull;
import xsna.k7j;

@FunctionalInterface
/* loaded from: classes9.dex */
public interface Consumer2<A1, A2> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(Consumer2 consumer2, Object obj, Object obj2) {
        accept(obj, obj2);
        consumer2.accept(obj, obj2);
    }

    void accept(A1 a1, A2 a2);

    default Consumer2<A1, A2> andThen(@NonNull Consumer2<? super A1, ? super A2> consumer2) {
        return new k7j(this, consumer2);
    }
}
