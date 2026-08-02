package xsna;

import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: JSONObjectGsonReader.kt */
/* loaded from: classes17.dex */
public final class zwx implements Iterator<Object>, gcy {
    public int b;
    public final /* synthetic */ JSONArray c;

    public zwx(JSONArray jSONArray) {
        this.c = jSONArray;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.length();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.c.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
