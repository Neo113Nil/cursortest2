package defpackage;

/* loaded from: classes2.dex */
public abstract class flp extends cvw {
    @Override // defpackage.cvw
    public final Object getValue() {
        Object G = G();
        vjg0 m0 = m0();
        if (G == null) {
            return null;
        }
        return m0 != null ? Integer.valueOf(y6i0.d(((Number) G).intValue(), m0.b, m0.c)) : G;
    }

    public abstract vjg0 m0();
}
