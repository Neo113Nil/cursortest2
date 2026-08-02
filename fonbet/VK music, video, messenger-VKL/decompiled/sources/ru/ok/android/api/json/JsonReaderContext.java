package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.commons.util.Promise;

/* loaded from: classes9.dex */
public interface JsonReaderContext {
    @Nullable
    default JsonReaderContext getParentContext() {
        return null;
    }

    @NonNull
    <T> Promise<T> refer(@NonNull Object obj, @NonNull Class<? extends T> cls);

    <T> void resolve(@NonNull Object obj, @NonNull Class<? super T> cls, T t);
}
