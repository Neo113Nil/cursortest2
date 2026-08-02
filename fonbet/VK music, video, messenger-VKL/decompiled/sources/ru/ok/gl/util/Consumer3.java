package ru.ok.gl.util;

import androidx.annotation.NonNull;
import xsna.m7j;

@FunctionalInterface
/* loaded from: classes9.dex */
public interface Consumer3<A1, A2, A3> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(Consumer3 consumer3, Object obj, Object obj2, Object obj3) {
        accept(obj, obj2, obj3);
        consumer3.accept(obj, obj2, obj3);
    }

    void accept(A1 a1, A2 a2, A3 a3);

    default Consumer3<A1, A2, A3> andThen(@NonNull Consumer3<? super A1, ? super A2, ? super A3> consumer3) {
        return new m7j(this, consumer3);
    }
}
