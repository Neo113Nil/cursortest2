package com.yandex.go.zone.model;

import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class h {
    public static boolean a(String str) {
        return str == null || str.length() == 0 || "default".equalsIgnoreCase(str);
    }

    public final KSerializer serializer() {
        return ZoneMode$$serializer.INSTANCE;
    }
}
