package xsna;

import androidx.annotation.Nullable;
import xsna.ub9;

/* compiled from: Futures.java */
/* loaded from: classes11.dex */
public final class s0t implements o0t<Object> {
    public final /* synthetic */ ub9.a b;

    public s0t(ub9.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.o0t
    public final void onFailure(Throwable th) {
        this.b.d(th);
    }

    @Override // xsna.o0t
    public final void onSuccess(@Nullable Object obj) {
        ub9.a aVar = this.b;
        try {
            aVar.b(obj);
        } catch (Throwable th) {
            aVar.d(th);
        }
    }
}
