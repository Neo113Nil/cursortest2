package androidx.compose.ui.node;

import defpackage.m3t0;
import defpackage.n3t0;
import defpackage.tls;
import defpackage.wz40;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w {
    public final n3t0 a;
    public final tls b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.w;
    public final tls c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.w;
    public final tls d = OwnerSnapshotObserver$onCommitAffectingSemantics$1.w;
    public final tls e = OwnerSnapshotObserver$onCommitAffectingLayout$1.w;
    public final tls f = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.w;
    public final tls g = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.w;
    public final tls h = OwnerSnapshotObserver$onCommitAffectingLookahead$1.w;

    public w(tls tlsVar) {
        this.a = new n3t0(tlsVar);
    }

    public final void a() {
        n3t0 n3t0Var = this.a;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = OwnerSnapshotObserver$clearInvalidObservations$1.w;
        synchronized (n3t0Var.g) {
            try {
                wz40 wz40Var = n3t0Var.f;
                int i = wz40Var.c;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Object[] objArr = wz40Var.a;
                    if (i2 < i) {
                        m3t0 m3t0Var = (m3t0) objArr[i2];
                        m3t0Var.d(ownerSnapshotObserver$clearInvalidObservations$1);
                        if (!m3t0Var.f.g()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = wz40Var.a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    } else {
                        int i4 = i - i3;
                        Arrays.fill(objArr, i4, i, (Object) null);
                        wz40Var.c = i4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
