package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes8.dex */
public final class fby extends bby {
    public String i;
    public boolean j;

    public fby() {
        throw null;
    }

    @Override // xsna.bby, xsna.ef
    public final JsonElement i0() {
        return new JsonObject(this.h);
    }

    @Override // xsna.bby, xsna.ef
    public final void j0(String str, JsonElement jsonElement) {
        if (!this.j) {
            String str2 = this.i;
            if (str2 == null) {
                str2 = null;
            }
            this.h.put(str2, jsonElement);
            this.j = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.i = ((JsonPrimitive) jsonElement).c();
            this.j = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw ne7.b(z9y.b);
            }
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw ne7.b(n8y.b);
        }
    }
}
