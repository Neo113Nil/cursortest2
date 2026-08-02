package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;

/* loaded from: classes6.dex */
public final class fr00 implements dr00 {
    public final ah00 a;

    public fr00(ah00 ah00Var) {
        this.a = ah00Var;
    }

    public final void a(BoundingBox boundingBox, boolean z, tls tlsVar) {
        ah00 ah00Var = this.a;
        if (z) {
            ((gh00) ah00Var).B(boundingBox, null, 1000.0f, tlsVar != null ? new er00(0, tlsVar) : null);
        } else {
            ((gh00) ah00Var).g.h(boundingBox, null, null, tlsVar != null ? new er00(1, tlsVar) : null);
        }
    }
}
