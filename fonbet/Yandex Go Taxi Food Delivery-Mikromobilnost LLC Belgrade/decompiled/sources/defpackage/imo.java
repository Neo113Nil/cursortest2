package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes6.dex */
public final class imo {
    public static final hmo Companion = new hmo();
    public final String a;
    public final String b;

    public /* synthetic */ imo(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gmo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void b(imo imoVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, imoVar.a);
        yjdVar.o(serialDescriptor, 1, imoVar.b);
    }

    public final String a() {
        return this.a;
    }

    public imo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
