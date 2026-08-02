package defpackage;

import androidx.compose.foundation.pager.d;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class f890 implements g5y {
    public final d a;

    public f890(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.g5y
    public final int a() {
        int i;
        d dVar = this.a;
        if (dVar.n().a.size() == 0) {
            return 0;
        }
        int i2 = h6u0.i(dVar.n());
        int i3 = dVar.n().b + dVar.n().c;
        if (i3 != 0 && (i = i2 / i3) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.g5y
    public final int b() {
        return Math.max(0, this.a.e);
    }

    @Override // defpackage.g5y
    public final boolean c() {
        return !this.a.n().a.isEmpty();
    }

    @Override // defpackage.g5y
    public final int d() {
        return Math.min(r1.o() - 1, ((da10) ((c790) a.Z(this.a.n().a))).a);
    }

    @Override // defpackage.g5y
    public final int getItemCount() {
        return this.a.o();
    }
}
