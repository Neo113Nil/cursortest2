package io.appmetrica.analytics.impl;

import xsna.epx;
import xsna.ho8;

/* loaded from: classes8.dex */
public final class C5 {
    public final String a;

    public C5(String str) {
        this.a = str;
    }

    public final C5 a(String str) {
        return new C5(str);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5) && epx.f(this.a, ((C5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.a, ')');
    }

    public final String a() {
        return this.a;
    }

    public static C5 a(C5 c5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5.a;
        }
        c5.getClass();
        return new C5(str);
    }
}
