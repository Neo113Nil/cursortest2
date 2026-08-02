package ru.ok.gl.util;

import androidx.annotation.NonNull;
import xsna.rr2;

@FunctionalInterface
/* loaded from: classes9.dex */
public interface Consumer4<A1, A2, A3, A4> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(Consumer4 consumer4, Object obj, Object obj2, Object obj3, Object obj4) {
        accept(obj, obj2, obj3, obj4);
        consumer4.accept(obj, obj2, obj3, obj4);
    }

    void accept(A1 a1, A2 a2, A3 a3, A4 a4);

    default Consumer4<A1, A2, A3, A4> andThen(@NonNull Consumer4<? super A1, ? super A2, ? super A3, ? super A4> consumer4) {
        return new rr2(this, consumer4);
    }
}
