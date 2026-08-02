package com.yandex.passport.api;

/* loaded from: classes15.dex */
public final class s0 implements t0 {
    public final int a;
    public final /* synthetic */ int b;

    public s0(int i) {
        this.b = i;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof t0)) {
            if (this.b == ((t0) obj).getInteger()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.passport.api.t0
    public final int getInteger() {
        return this.a;
    }

    public final int hashCode() {
        return this.b;
    }
}
