package xsna;

import java.util.Map;

/* compiled from: JSONObjectGsonReader.kt */
/* loaded from: classes17.dex */
public final class xwx implements Map.Entry<String, Object>, gcy {
    public final String b;
    public final Object c;

    public xwx(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
