package com.yandex.passport.internal.core.accounts;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes15.dex */
public abstract class v {
    public static final Set a = Collections.synchronizedSet(new LinkedHashSet());

    public static void a(String str) {
        a.remove(str);
    }

    public static String b() {
        String uuid = UUID.randomUUID().toString();
        a.add(uuid);
        return uuid;
    }
}
