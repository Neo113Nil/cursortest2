package io.appmetrica.analytics.impl;

import xsna.i5s;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4762ck {
    public final String a;
    public final String b;

    public C4762ck(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.a);
        sb.append("', eventValue='");
        return i5s.a(sb, this.b, "')");
    }
}
