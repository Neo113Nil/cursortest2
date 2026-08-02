package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5083p5 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public C5083p5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final Sa a(C4747c5 c4747c5, B4 b4, InterfaceC4698a8 interfaceC4698a8, HashMap hashMap) {
        Sa sa = (Sa) hashMap.get(c4747c5.toString());
        if (sa != null) {
            sa.a(b4);
            return sa;
        }
        Sa a = interfaceC4698a8.a(this.c, c4747c5, b4);
        hashMap.put(c4747c5.toString(), a);
        return a;
    }
}
