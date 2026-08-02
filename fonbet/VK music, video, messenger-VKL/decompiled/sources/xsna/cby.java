package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes8.dex */
public final class cby extends bf {
    public final JsonArray g;
    public final int h;
    public int i;

    public cby(j8y j8yVar, JsonArray jsonArray) {
        super(j8yVar, jsonArray, null);
        this.g = jsonArray;
        this.h = jsonArray.b.size();
        this.i = -1;
    }

    @Override // xsna.au50
    public final String Q(SerialDescriptor serialDescriptor, int i) {
        return String.valueOf(i);
    }

    @Override // xsna.bf
    public final JsonElement U(String str) {
        return this.g.b.get(Integer.parseInt(str));
    }

    @Override // xsna.bf
    public final JsonElement W() {
        return this.g;
    }

    @Override // xsna.ssi
    public final int m(SerialDescriptor serialDescriptor) {
        int i = this.i;
        if (i >= this.h - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.i = i2;
        return i2;
    }
}
