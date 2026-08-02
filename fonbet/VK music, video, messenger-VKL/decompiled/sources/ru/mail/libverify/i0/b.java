package ru.mail.libverify.i0;

import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class b implements a {
    private final KeyValueStorage a;

    public b(KeyValueStorage keyValueStorage) {
        this.a = keyValueStorage;
    }

    @Override // ru.mail.libverify.i0.a
    public final long a() {
        long currentTimeMillis = System.currentTimeMillis();
        Long longValue = this.a.getLongValue("api_server_diff", null);
        return longValue == null ? currentTimeMillis : longValue.longValue() + currentTimeMillis;
    }

    @Override // ru.mail.libverify.i0.a
    public final long b() {
        return System.currentTimeMillis();
    }

    public final boolean a(Long l, long j, long j2) {
        if (l == null || l.longValue() <= 0 || j <= 0 || j2 <= 0 || j2 <= j) {
            return false;
        }
        long longValue = l.longValue() - (((j2 - j) / 2) + j);
        this.a.putValue("api_server_diff", longValue).commit();
        FileLog.d("ru.mail.libverify.i0.b", "Difference with server time: %dms", Long.valueOf(longValue));
        return true;
    }
}
