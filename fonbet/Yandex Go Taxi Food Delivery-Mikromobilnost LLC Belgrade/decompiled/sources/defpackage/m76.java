package defpackage;

/* loaded from: classes.dex */
public final class m76 implements k76 {
    public final kdc a;
    public final Float b;

    public m76(edc edcVar, int i) {
        Float valueOf = Float.valueOf(0.041666668f);
        edcVar = (i & 2) != 0 ? null : edcVar;
        valueOf = (i & 4) != 0 ? null : valueOf;
        this.a = edcVar;
        this.b = valueOf;
    }

    public m76() {
        this(null, 7);
    }
}
