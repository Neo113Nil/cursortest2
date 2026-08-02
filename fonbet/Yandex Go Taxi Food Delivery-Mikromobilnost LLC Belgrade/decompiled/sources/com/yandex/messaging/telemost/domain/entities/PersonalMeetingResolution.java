package com.yandex.messaging.telemost.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/PersonalMeetingResolution;", "", "Success", "Declined", "Missed", "CanceledByCaller", "Unknown", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PersonalMeetingResolution {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PersonalMeetingResolution[] $VALUES;
    public static final PersonalMeetingResolution CanceledByCaller;
    public static final PersonalMeetingResolution Declined;
    public static final PersonalMeetingResolution Missed;
    public static final PersonalMeetingResolution Success;
    public static final PersonalMeetingResolution Unknown;

    static {
        PersonalMeetingResolution personalMeetingResolution = new PersonalMeetingResolution("Success", 0);
        Success = personalMeetingResolution;
        PersonalMeetingResolution personalMeetingResolution2 = new PersonalMeetingResolution("Declined", 1);
        Declined = personalMeetingResolution2;
        PersonalMeetingResolution personalMeetingResolution3 = new PersonalMeetingResolution("Missed", 2);
        Missed = personalMeetingResolution3;
        PersonalMeetingResolution personalMeetingResolution4 = new PersonalMeetingResolution("CanceledByCaller", 3);
        CanceledByCaller = personalMeetingResolution4;
        PersonalMeetingResolution personalMeetingResolution5 = new PersonalMeetingResolution("Unknown", 4);
        Unknown = personalMeetingResolution5;
        PersonalMeetingResolution[] personalMeetingResolutionArr = {personalMeetingResolution, personalMeetingResolution2, personalMeetingResolution3, personalMeetingResolution4, personalMeetingResolution5};
        $VALUES = personalMeetingResolutionArr;
        $ENTRIES = kotlin.enums.a.a(personalMeetingResolutionArr);
    }

    public static PersonalMeetingResolution valueOf(String str) {
        return (PersonalMeetingResolution) Enum.valueOf(PersonalMeetingResolution.class, str);
    }

    public static PersonalMeetingResolution[] values() {
        return (PersonalMeetingResolution[]) $VALUES.clone();
    }
}
