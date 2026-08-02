package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.Lazy;
import xsna.bpn0;

/* renamed from: io.appmetrica.analytics.impl.pn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5101pn implements InterfaceC5180t {
    public final C5231v b;
    public final C5206u a = new C5206u();
    public final Lazy c = new bpn0(new C5075on(this));

    public C5101pn(Context context) {
        this.b = new C5231v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5180t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) this.c.getValue());
        return map;
    }
}
