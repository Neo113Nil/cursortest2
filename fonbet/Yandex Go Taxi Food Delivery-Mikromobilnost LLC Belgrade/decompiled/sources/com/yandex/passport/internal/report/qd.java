package com.yandex.passport.internal.report;

import defpackage.j73;
import defpackage.uza;
import java.security.MessageDigest;
import java.util.Set;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public abstract class qd {
    public static final Set a = j73.f0(new String[]{"track_id", "task_id"});

    public static final String a(Iterable iterable) {
        return kotlin.collections.a.X(iterable, Extension.FIX_SPACE, "[", "]", new com.yandex.passport.internal.core.announcing.f(2), 24);
    }

    public static final String b(String str) {
        return j73.K(MessageDigest.getInstance(JCP.DIGEST_SHA_256).digest(str.getBytes(uza.a)), "", new com.yandex.passport.internal.core.announcing.f(3), 30);
    }
}
