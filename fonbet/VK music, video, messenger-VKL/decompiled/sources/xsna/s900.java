package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: LruResourceCache.java */
/* loaded from: classes12.dex */
public final class s900 extends l900<ady, hag0<?>> {
    public klp d;

    @Override // xsna.l900
    public final int b(@Nullable hag0<?> hag0Var) {
        hag0<?> hag0Var2 = hag0Var;
        if (hag0Var2 == null) {
            return 1;
        }
        return hag0Var2.getSize();
    }

    @Override // xsna.l900
    public final void c(@NonNull ady adyVar, @Nullable hag0<?> hag0Var) {
        hag0<?> hag0Var2 = hag0Var;
        klp klpVar = this.d;
        if (klpVar == null || hag0Var2 == null) {
            return;
        }
        klpVar.e.a(hag0Var2, true);
    }
}
