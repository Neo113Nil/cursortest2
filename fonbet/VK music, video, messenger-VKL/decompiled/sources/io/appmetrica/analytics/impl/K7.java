package io.appmetrica.analytics.impl;

import xsna.epx;

/* loaded from: classes8.dex */
public final class K7 {
    public final Ua a;
    public String b = "";

    public K7(Ua ua) {
        this.a = ua;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || epx.f(this.b, str)) {
                return;
            }
            this.b = str;
            this.a.a(str, z);
        }
    }
}
