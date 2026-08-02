package com.yandex.passport.internal.push;

import android.os.Bundle;
import defpackage.kgx;
import defpackage.qoi0;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes8.dex */
public final class e0 {
    public static final /* synthetic */ kgx[] b;
    public final com.yandex.passport.internal.util.storage.b a = new com.yandex.passport.internal.util.storage.b("passport_push_payload_storage", new com.yandex.passport.internal.flags.c(2), new com.yandex.passport.internal.flags.c(3));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PolicyMappingsExtension.MAP, 0, "getMap()Lcom/yandex/passport/internal/util/storage/PersistableMap;", e0.class);
        qoi0.a.getClass();
        b = new kgx[]{propertyReference1Impl};
    }

    public final Bundle a() {
        if (b().a.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : b().a.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public final com.yandex.passport.internal.util.storage.a b() {
        return (com.yandex.passport.internal.util.storage.a) this.a.getValue(this, b[0]);
    }
}
