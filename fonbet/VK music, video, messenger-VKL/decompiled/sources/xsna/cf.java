package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes8.dex */
public final class cf extends de {
    public final /* synthetic */ ef b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SerialDescriptor d;

    public cf(ef efVar, String str, SerialDescriptor serialDescriptor) {
        this.b = efVar;
        this.c = str;
        this.d = serialDescriptor;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final de c() {
        return this.b.c.b;
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void r(String str) {
        this.b.j0(this.c, new o9y(str, false, this.d));
    }
}
