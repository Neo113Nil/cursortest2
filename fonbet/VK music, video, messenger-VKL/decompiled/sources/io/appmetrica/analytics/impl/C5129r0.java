package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5129r0 {
    public final C4920io a;
    public volatile Boolean b;
    public Na c;
    public Oa d;

    public C5129r0() {
        this(new C4920io());
    }

    public final synchronized Na a(Context context, C4772d4 c4772d4) {
        try {
            if (this.c == null) {
                if (a(context)) {
                    this.c = new C5232v0();
                } else {
                    this.c = new C5104q0(context, c4772d4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public C5129r0(C4920io c4920io) {
        this.a = c4920io;
    }

    public final boolean a(Context context) {
        Boolean bool = this.b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.b;
                    if (bool == null) {
                        this.a.getClass();
                        boolean a = C4920io.a(context);
                        bool = Boolean.valueOf(!a);
                        this.b = bool;
                        if (!a) {
                            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }
}
