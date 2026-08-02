package xsna;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes8.dex */
public final class eby extends aby {
    public final JsonObject k;
    public final List<String> l;
    public final int m;
    public int n;

    public eby(j8y j8yVar, JsonObject jsonObject) {
        super(j8yVar, jsonObject, (String) null, 12);
        this.k = jsonObject;
        List<String> O0 = j5g.O0(jsonObject.b.keySet());
        this.l = O0;
        this.m = O0.size() * 2;
        this.n = -1;
    }

    @Override // xsna.aby, xsna.au50
    public final String Q(SerialDescriptor serialDescriptor, int i) {
        return this.l.get(i / 2);
    }

    @Override // xsna.aby, xsna.bf
    public final JsonElement U(String str) {
        return this.n % 2 == 0 ? c9y.b(str) : (JsonElement) pn00.h(str, this.k);
    }

    @Override // xsna.aby, xsna.bf
    public final JsonElement W() {
        return this.k;
    }

    @Override // xsna.aby
    /* renamed from: Z */
    public final JsonObject W() {
        return this.k;
    }

    @Override // xsna.aby, xsna.ssi
    public final int m(SerialDescriptor serialDescriptor) {
        int i = this.n;
        if (i >= this.m - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.n = i2;
        return i2;
    }

    @Override // xsna.aby, xsna.bf, xsna.ssi
    public final void e(SerialDescriptor serialDescriptor) {
    }
}
