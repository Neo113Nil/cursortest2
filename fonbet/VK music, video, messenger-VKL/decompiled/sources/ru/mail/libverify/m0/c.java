package ru.mail.libverify.m0;

import java.util.HashMap;
import java.util.Timer;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class c implements a {
    private static c b;
    private final HashMap<String, Timer> a = new HashMap<>();

    @Override // ru.mail.libverify.m0.a
    public final boolean b(String str) {
        return this.a.containsKey(str);
    }

    @Override // ru.mail.libverify.m0.a
    public final String a(String str, ru.mail.libverify.p0.b bVar, long j, Runnable runnable) {
        if (this.a.containsKey(str)) {
            a(str);
        }
        Timer timer = new Timer(str, false);
        timer.schedule(new b(this, str, bVar, runnable), j);
        this.a.put(str, timer);
        return str;
    }

    @Override // ru.mail.libverify.m0.a
    public final boolean a(String str) {
        Timer timer = this.a.get(str);
        if (timer == null) {
            return false;
        }
        timer.cancel();
        this.a.remove(str);
        return true;
    }

    @Override // ru.mail.libverify.m0.a
    public final String a(ru.mail.libverify.p0.b bVar, long j, Runnable runnable) {
        UUID randomUUID;
        do {
            randomUUID = UUID.randomUUID();
        } while (this.a.containsKey(randomUUID.toString()));
        return a(randomUUID.toString(), bVar, j, runnable);
    }
}
