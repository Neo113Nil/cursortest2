package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class e0 implements n0 {
    public final y1 a;

    public e0(y1 y1Var) {
        this.a = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.a.equals(((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowRoundabout(roundabout=" + this.a + ')';
    }
}
