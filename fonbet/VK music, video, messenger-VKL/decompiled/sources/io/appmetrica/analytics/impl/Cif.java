package io.appmetrica.analytics.impl;

import xsna.i5s;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes8.dex */
public final class Cif {
    public final String a;
    public final String b;

    public Cif(String str, String str2) {
        this.a = str;
        this.b = a(str2);
    }

    public final String a(String str) {
        return str != null ? i5s.a(new StringBuilder(), this.a, str) : this.a;
    }
}
