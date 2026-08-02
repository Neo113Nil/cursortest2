package xsna;

import java.security.KeyStore;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vlg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vlg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((androidx.room.j) this.c).g = (sin0) obj;
                return s3q0.a;
            default:
                return ((KeyStore) this.c).getCertificate((String) obj);
        }
    }
}
