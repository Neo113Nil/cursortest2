package com.google.firebase.installations.local;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PersistedInstallation$RegistrationStatus {
    private static final /* synthetic */ PersistedInstallation$RegistrationStatus[] $VALUES;
    public static final PersistedInstallation$RegistrationStatus ATTEMPT_MIGRATION;
    public static final PersistedInstallation$RegistrationStatus NOT_GENERATED;
    public static final PersistedInstallation$RegistrationStatus REGISTERED;
    public static final PersistedInstallation$RegistrationStatus REGISTER_ERROR;
    public static final PersistedInstallation$RegistrationStatus UNREGISTERED;

    static {
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("ATTEMPT_MIGRATION", 0);
        ATTEMPT_MIGRATION = persistedInstallation$RegistrationStatus;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus2 = new PersistedInstallation$RegistrationStatus("NOT_GENERATED", 1);
        NOT_GENERATED = persistedInstallation$RegistrationStatus2;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus3 = new PersistedInstallation$RegistrationStatus("UNREGISTERED", 2);
        UNREGISTERED = persistedInstallation$RegistrationStatus3;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus4 = new PersistedInstallation$RegistrationStatus("REGISTERED", 3);
        REGISTERED = persistedInstallation$RegistrationStatus4;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus5 = new PersistedInstallation$RegistrationStatus("REGISTER_ERROR", 4);
        REGISTER_ERROR = persistedInstallation$RegistrationStatus5;
        $VALUES = new PersistedInstallation$RegistrationStatus[]{persistedInstallation$RegistrationStatus, persistedInstallation$RegistrationStatus2, persistedInstallation$RegistrationStatus3, persistedInstallation$RegistrationStatus4, persistedInstallation$RegistrationStatus5};
    }

    public static PersistedInstallation$RegistrationStatus valueOf(String str) {
        return (PersistedInstallation$RegistrationStatus) Enum.valueOf(PersistedInstallation$RegistrationStatus.class, str);
    }

    public static PersistedInstallation$RegistrationStatus[] values() {
        return (PersistedInstallation$RegistrationStatus[]) $VALUES.clone();
    }
}
