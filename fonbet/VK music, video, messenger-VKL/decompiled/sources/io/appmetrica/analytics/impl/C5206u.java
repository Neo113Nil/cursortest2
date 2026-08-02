package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import xsna.j5g;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5206u implements InterfaceC5256w {
    public final String a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) j5g.u0(C5030n4.l().m().d, Collections.singletonList(this.a))).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
