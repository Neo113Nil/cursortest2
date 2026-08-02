package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import xsna.u11;

/* loaded from: classes8.dex */
public final class Ck implements Uc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        C4955k7 c4955k7;
        Bk bk = new Bk();
        Ak ak = new Ak();
        C5178sn c5178sn = new C5178sn(ak, ak, new Ba(false), new u11(14));
        Ik B = C5342za.I.B();
        synchronized (B) {
            C5007m7 c5007m7 = B.a;
            c4955k7 = new C4955k7(context, new C4981l7(c5007m7.a, c5007m7.b, false).a(context, bk), c5178sn, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new C4796e3(new Al(c4955k7), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C5342za.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Uc
    public final void a(Context context) {
        AbstractC4739bn abstractC4739bn = (AbstractC4739bn) Zm.a(C5203tm.class);
        ProtobufStateStorage<Object> a = abstractC4739bn.a(context, abstractC4739bn.b(context));
        C5203tm c5203tm = (C5203tm) a.read();
        C5177sm a2 = c5203tm.a(c5203tm.m);
        a2.o = 0L;
        a.save(new C5203tm(a2));
        b(context);
    }
}
