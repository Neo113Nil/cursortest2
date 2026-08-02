package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5274wh extends AbstractC4733bh {
    public final Df b;
    public final Ho c;
    public final SafePackageManager d;
    public final TimeProvider e;

    public C5274wh(@NonNull C4927j5 c4927j5) {
        this(c4927j5, c4927j5.u(), C5342za.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        C4927j5 c4927j5 = this.a;
        if (this.c.d()) {
            return false;
        }
        C4722b6 a = ((C5224uh) c4927j5.k.a()).e ? C4722b6.a(c4722b6, EnumC5037nb.EVENT_TYPE_APP_UPDATE) : C4722b6.a(c4722b6, EnumC5037nb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.d.getInstallerPackageName(c4927j5.a, c4927j5.b.a), ""));
            Df df = this.b;
            df.h.a(df.a);
            jSONObject.put("preloadInfo", ((Af) df.c()).b());
        } catch (Throwable unused) {
        }
        a.setValue(jSONObject.toString());
        C5266w9 c5266w9 = c4927j5.n;
        c5266w9.a(a, C4737bl.a(c5266w9.c.b(a), a.i));
        Ho ho = this.c;
        synchronized (ho) {
            Io io2 = ho.a;
            io2.a(io2.a().put("init_event_done", true));
        }
        this.c.a(this.e.currentTimeMillis());
        return false;
    }

    public C5274wh(C4927j5 c4927j5, Ho ho, Df df, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c4927j5);
        this.c = ho;
        this.b = df;
        this.d = safePackageManager;
        this.e = systemTimeProvider;
    }
}
