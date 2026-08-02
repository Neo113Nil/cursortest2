package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;
import xsna.i5s;

/* loaded from: classes8.dex */
public final class V7 {
    public final Map a;
    public final String b;
    public final String c;

    public V7(String str, HashMap hashMap, String str2) {
        this.b = str;
        this.a = hashMap;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.a);
        sb.append(", mDeeplink='");
        sb.append(this.b);
        sb.append("', mUnparsedReferrer='");
        return i5s.a(sb, this.c, "'}");
    }
}
