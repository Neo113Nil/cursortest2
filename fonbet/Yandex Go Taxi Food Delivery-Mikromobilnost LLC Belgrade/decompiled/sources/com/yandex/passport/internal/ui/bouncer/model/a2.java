package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class a2 implements c2 {
    public final boolean a;
    public final com.yandex.passport.biometric.ui.verification.a b;

    public a2(boolean z, com.yandex.passport.biometric.ui.verification.a aVar) {
        this.a = z;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            return this.a == a2Var.a && this.b == a2Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WaitConnection(hideCLoseButton=" + this.a + ", interactor=" + this.b + ')';
    }
}
