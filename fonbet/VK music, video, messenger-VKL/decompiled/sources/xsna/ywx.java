package xsna;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: JSONObjectGsonReader.kt */
/* loaded from: classes17.dex */
public final class ywx implements Iterator<Map.Entry<? extends String, ? extends Object>>, gcy {
    public final /* synthetic */ Iterator<String> b;
    public final /* synthetic */ JSONObject c;

    public ywx(Iterator<String> it, JSONObject jSONObject) {
        this.b = it;
        this.c = jSONObject;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<? extends String, ? extends Object> next() {
        String next = this.b.next();
        return new xwx(next, this.c.get(next));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
