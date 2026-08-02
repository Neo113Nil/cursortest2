package xsna;

import xsna.tlo0;

/* compiled from: ImPlaceholder.kt */
/* loaded from: classes2.dex */
public final class maw {
    public final tlo0 a;
    public final tlo0 b;
    public final com.vk.im.design.view.placeholder.b c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public maw() {
        this(r0, r0, 7);
        tlo0.h hVar = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maw)) {
            return false;
        }
        maw mawVar = (maw) obj;
        return epx.f(this.a, mawVar.a) && epx.f(this.b, mawVar.b) && epx.f(this.c, mawVar.c);
    }

    public final int hashCode() {
        tlo0 tlo0Var = this.a;
        int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
        tlo0 tlo0Var2 = this.b;
        int hashCode2 = (hashCode + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
        com.vk.im.design.view.placeholder.b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultMiddle(title=" + this.a + ", subtitle=" + this.b + ", extra=" + this.c + ')';
    }

    public /* synthetic */ maw(tlo0.h hVar, tlo0 tlo0Var, int i) {
        this((i & 1) != 0 ? null : hVar, (i & 2) != 0 ? null : tlo0Var, (com.vk.im.design.view.placeholder.b) null);
    }

    public maw(tlo0 tlo0Var, tlo0 tlo0Var2, com.vk.im.design.view.placeholder.b bVar) {
        this.a = tlo0Var;
        this.b = tlo0Var2;
        this.c = bVar;
    }
}
