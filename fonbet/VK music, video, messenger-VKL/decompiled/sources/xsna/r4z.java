package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class r4z implements kgn {
    public final /* synthetic */ Lifecycle a;
    public final /* synthetic */ p4z b;

    public r4z(Lifecycle lifecycle, p4z p4zVar) {
        this.a = lifecycle;
        this.b = p4zVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.removeObserver(this.b);
    }
}
