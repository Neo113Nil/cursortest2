package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class m4o implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ KSerializer b;

    public /* synthetic */ m4o(KSerializer kSerializer, int i) {
        this.a = i;
        this.b = kSerializer;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.getDescriptor().f(((Enum) obj).ordinal());
            default:
                return this.b;
        }
    }
}
