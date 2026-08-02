package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class bxj0 {
    public final boolean a;
    public byte[] b;
    public final ea20 c;
    public ba20 d;
    public boolean e;
    public boolean f;

    public bxj0(ufg ufgVar, boolean z) {
        ea20 ea20Var = new ea20(ufgVar, "flutter/restoration", wzt0.b, null);
        this.e = false;
        this.f = false;
        v5c0 v5c0Var = new v5c0(29, this);
        this.c = ea20Var;
        this.a = z;
        ea20Var.b(v5c0Var);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(BackendConfig.Restrictions.ENABLED, Boolean.TRUE);
        hashMap.put(Constants.KEY_DATA, bArr);
        return hashMap;
    }
}
