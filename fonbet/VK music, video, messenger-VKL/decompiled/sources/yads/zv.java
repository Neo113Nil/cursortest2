package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class zv implements m0 {
    public final String a;

    public zv(String str) {
        this.a = str;
    }

    @Override // yads.m0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv) && epx.f(this.a, ((zv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("CloseAction(actionType=", this.a, ")");
    }
}
