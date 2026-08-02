package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* loaded from: classes8.dex */
public final class xo implements Wa {
    @Override // io.appmetrica.analytics.impl.Wa
    public final String a(Context context) {
        C5203tm c5203tm;
        try {
            InterfaceC4713an a = Zm.a(C5203tm.class);
            if (a == null) {
                return null;
            }
            AbstractC4739bn abstractC4739bn = (AbstractC4739bn) a;
            ProtobufStateStorage<Object> a2 = abstractC4739bn.a(context, abstractC4739bn.a(context));
            if (a2 == null || (c5203tm = (C5203tm) a2.read()) == null) {
                return null;
            }
            return c5203tm.a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
