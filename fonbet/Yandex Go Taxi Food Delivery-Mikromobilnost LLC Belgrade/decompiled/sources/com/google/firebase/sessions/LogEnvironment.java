package com.google.firebase.sessions;

import defpackage.k4o;
import defpackage.yn60;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/LogEnvironment;", "Lyn60;", "", "", "number", CA20Status.STATUS_USER_I, "getNumber", "()I", "LOG_ENVIRONMENT_UNKNOWN", "LOG_ENVIRONMENT_AUTOPUSH", "LOG_ENVIRONMENT_STAGING", "LOG_ENVIRONMENT_PROD", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogEnvironment implements yn60 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogEnvironment[] $VALUES;
    public static final LogEnvironment LOG_ENVIRONMENT_AUTOPUSH;
    public static final LogEnvironment LOG_ENVIRONMENT_PROD;
    public static final LogEnvironment LOG_ENVIRONMENT_STAGING;
    public static final LogEnvironment LOG_ENVIRONMENT_UNKNOWN;
    private final int number;

    static {
        LogEnvironment logEnvironment = new LogEnvironment("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        LOG_ENVIRONMENT_UNKNOWN = logEnvironment;
        LogEnvironment logEnvironment2 = new LogEnvironment("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        LOG_ENVIRONMENT_AUTOPUSH = logEnvironment2;
        LogEnvironment logEnvironment3 = new LogEnvironment("LOG_ENVIRONMENT_STAGING", 2, 2);
        LOG_ENVIRONMENT_STAGING = logEnvironment3;
        LogEnvironment logEnvironment4 = new LogEnvironment("LOG_ENVIRONMENT_PROD", 3, 3);
        LOG_ENVIRONMENT_PROD = logEnvironment4;
        LogEnvironment[] logEnvironmentArr = {logEnvironment, logEnvironment2, logEnvironment3, logEnvironment4};
        $VALUES = logEnvironmentArr;
        $ENTRIES = kotlin.enums.a.a(logEnvironmentArr);
    }

    public LogEnvironment(String str, int i, int i2) {
        this.number = i2;
    }

    public static LogEnvironment valueOf(String str) {
        return (LogEnvironment) Enum.valueOf(LogEnvironment.class, str);
    }

    public static LogEnvironment[] values() {
        return (LogEnvironment[]) $VALUES.clone();
    }

    @Override // defpackage.yn60
    public final int getNumber() {
        return this.number;
    }
}
