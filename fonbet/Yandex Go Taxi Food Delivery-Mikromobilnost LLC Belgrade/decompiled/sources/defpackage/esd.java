package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class esd implements urq0 {
    public final urq0 a;
    public final ImmutableList b;

    public esd(urq0 urq0Var, List list) {
        this.a = urq0Var;
        this.b = ImmutableList.l(list);
    }

    @Override // defpackage.urq0
    public final long g() {
        return this.a.g();
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        this.a.h(j);
    }

    @Override // defpackage.urq0
    public final long i() {
        return this.a.i();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        return this.a.n(xzyVar);
    }
}
