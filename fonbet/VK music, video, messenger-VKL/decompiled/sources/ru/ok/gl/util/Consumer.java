package ru.ok.gl.util;

import androidx.annotation.NonNull;
import ru.ok.gl.util.Consumer;

@FunctionalInterface
/* loaded from: classes9.dex */
public interface Consumer<A> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(Consumer consumer, Object obj) {
        accept(obj);
        consumer.accept(obj);
    }

    void accept(A a);

    default Consumer<A> andThen(@NonNull final Consumer<? super A> consumer) {
        return new Consumer() { // from class: xsna.g7j
            @Override // ru.ok.gl.util.Consumer
            public final void accept(Object obj) {
                Consumer.this.lambda$andThen$0(consumer, obj);
            }
        };
    }
}
