package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class jdi0 implements rjs0 {
    public final wis0 a;

    public jdi0(wis0 wis0Var) {
        this.a = wis0Var;
    }

    @Override // defpackage.rjs0
    public final Object a(Continuation continuation) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jdi0) {
            return this.a.equals(((jdi0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
