package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import ru.ok.android.commons.util.Promise;

/* loaded from: classes9.dex */
final class SimpleJsonReaderContext implements JsonReaderContext {
    private final JsonReaderContext parent;
    private final HashMap<Object, Promise.Keeper<Object>> refs;

    public SimpleJsonReaderContext() {
        this(null);
    }

    @NonNull
    private Promise.Keeper<Object> keeper(@NonNull Object obj) {
        Promise.Keeper<Object> keeper = this.refs.get(obj);
        if (keeper != null) {
            return keeper;
        }
        Promise.Keeper<Object> keeper2 = new Promise.Keeper<>();
        this.refs.put(obj, keeper2);
        return keeper2;
    }

    @Override // ru.ok.android.api.json.JsonReaderContext
    @Nullable
    public JsonReaderContext getParentContext() {
        return this.parent;
    }

    @Override // ru.ok.android.api.json.JsonReaderContext
    @NonNull
    public <T> Promise<T> refer(@NonNull Object obj, @NonNull Class<? extends T> cls) {
        return (Promise<T>) keeper(obj).promise;
    }

    @Override // ru.ok.android.api.json.JsonReaderContext
    public <T> void resolve(@NonNull Object obj, @NonNull Class<? super T> cls, T t) {
        keeper(obj).set(t);
    }

    public SimpleJsonReaderContext(@Nullable JsonReaderContext jsonReaderContext) {
        this.refs = new HashMap<>();
        this.parent = jsonReaderContext;
    }
}
