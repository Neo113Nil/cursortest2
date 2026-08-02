package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.commons.util.Promise;

/* loaded from: classes9.dex */
abstract class AbstractJsonReaderContext implements JsonReader {

    @NonNull
    private final JsonReaderContext context;

    public AbstractJsonReaderContext(@NonNull JsonReaderContext jsonReaderContext) {
        this.context = jsonReaderContext;
    }

    @Override // ru.ok.android.api.json.JsonReaderContext
    @Nullable
    public final JsonReaderContext getParentContext() {
        return this.context.getParentContext();
    }

    @Override // ru.ok.android.api.json.JsonReaderContext
    @NonNull
    public final <T> Promise<T> refer(@NonNull Object obj, @NonNull Class<? extends T> cls) {
        return this.context.refer(obj, cls);
    }

    @Override // ru.ok.android.api.json.JsonReaderContext
    public final <T> void resolve(@NonNull Object obj, @NonNull Class<? super T> cls, T t) {
        this.context.resolve(obj, cls, t);
    }
}
