package com.yandex.passport.common.ui.progress;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class b implements c {
    public final int a;

    public b(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Lottie(lottieAnimationResId="), this.a, ')');
    }
}
