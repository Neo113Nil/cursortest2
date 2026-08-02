package xsna;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonExt.kt */
/* loaded from: classes17.dex */
public final class k9y implements Iterator<JSONObject>, gcy {
    public int b;
    public final /* synthetic */ JSONArray c;

    public k9y(JSONArray jSONArray) {
        this.c = jSONArray;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.length();
    }

    @Override // java.util.Iterator
    public final JSONObject next() {
        JSONObject jSONObject = (JSONObject) this.c.get(this.b);
        this.b++;
        return jSONObject;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
