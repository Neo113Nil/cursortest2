package com.yandex.passport.sloth.ui.dependencies;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class f implements g {
    public final int a;

    public f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Lottie(lottieAnimationResId="), this.a, ')');
    }
}
