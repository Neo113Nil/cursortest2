package ru.ok.gl.util;

import androidx.annotation.NonNull;
import ru.ok.gl.util.Consumer5;

@FunctionalInterface
/* loaded from: classes9.dex */
public interface Consumer5<A1, A2, A3, A4, A5> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(Consumer5 consumer5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        accept(obj, obj2, obj3, obj4, obj5);
        consumer5.accept(obj, obj2, obj3, obj4, obj5);
    }

    void accept(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5);

    default Consumer5<A1, A2, A3, A4, A5> andThen(@NonNull final Consumer5<? super A1, ? super A2, ? super A3, ? super A4, ? super A5> consumer5) {
        return new Consumer5() { // from class: xsna.n7j
            @Override // ru.ok.gl.util.Consumer5
            public final void accept(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                Consumer5.this.lambda$andThen$0(consumer5, obj, obj2, obj3, obj4, obj5);
            }
        };
    }
}
