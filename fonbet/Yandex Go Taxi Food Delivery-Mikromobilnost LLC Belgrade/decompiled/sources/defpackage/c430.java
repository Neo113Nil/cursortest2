package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class c430 {
    public final Mode a;
    public final b b;
    public final un0 c;

    public /* synthetic */ c430(Mode mode, b bVar, int i) {
        this(mode, (i & 2) != 0 ? null : bVar, (un0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c430)) {
            return false;
        }
        c430 c430Var = (c430) obj;
        return this.a == c430Var.a && jl40.l(this.b, c430Var.b) && jl40.l(this.c, c430Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        un0 un0Var = this.c;
        return hashCode2 + (un0Var != null ? un0Var.hashCode() : 0);
    }

    public c430(Mode mode, b bVar, un0 un0Var) {
        this.a = mode;
        this.b = bVar;
        this.c = un0Var;
    }
}
