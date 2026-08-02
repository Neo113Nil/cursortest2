package ru.mail.libverify.j0;

import androidx.annotation.NonNull;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public final class a implements Gsonable {
    private transient m a;
    public int actionTimeout;
    public int attemptCount;
    public final long createdTimestamp;
    public long lastAttemptTimestamp;

    @NonNull
    private final String requestJson;

    @NonNull
    public final EnumC2206a type;

    /* renamed from: ru.mail.libverify.j0.a$a, reason: collision with other inner class name */
    public enum EnumC2206a {
        UPDATE_SETTINGS(0),
        PUSH_STATUS(1),
        ATTEMPT(2),
        INSTANCE(3),
        EVENTS(4),
        CONTENT(5),
        CALLBACK(6),
        NOTIFY_PUSH_STATUS(7),
        NOTIFY_INAPP_UPDATE(8);

        private final int value;

        EnumC2206a(int i) {
            this.value = i;
        }
    }

    public a(@NonNull EnumC2206a enumC2206a, @NonNull m mVar, long j) {
        this.actionTimeout = 0;
        this.lastAttemptTimestamp = 0L;
        this.attemptCount = 0;
        this.type = enumC2206a;
        this.requestJson = mVar.a;
        this.a = mVar;
        this.createdTimestamp = j;
    }

    @NonNull
    public final m a() {
        if (this.a == null) {
            this.a = new m(this.requestJson);
        }
        return this.a;
    }

    private a() {
        this.actionTimeout = 0;
        this.lastAttemptTimestamp = 0L;
        this.attemptCount = 0;
        this.type = EnumC2206a.UPDATE_SETTINGS;
        this.requestJson = "";
        this.createdTimestamp = 0L;
    }
}
