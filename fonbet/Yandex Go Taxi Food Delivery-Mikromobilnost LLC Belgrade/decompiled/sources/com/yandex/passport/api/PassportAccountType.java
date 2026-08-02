package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/passport/api/PassportAccountType;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "com/yandex/passport/api/l", "PORTAL", "LITE", "SOCIAL", "PDD", "PHONISH", "MAILISH", "MUSIC_PHONISH", "CHILDISH", "UNDEFINED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportAccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportAccountType[] $VALUES;
    public static final PassportAccountType CHILDISH;
    public static final l Companion;
    public static final PassportAccountType LITE;
    public static final PassportAccountType MAILISH;
    public static final PassportAccountType MUSIC_PHONISH;
    public static final PassportAccountType PDD;
    public static final PassportAccountType PHONISH;
    public static final PassportAccountType PORTAL;
    public static final PassportAccountType SOCIAL;
    public static final PassportAccountType UNDEFINED;
    private final int value = ordinal();

    static {
        PassportAccountType passportAccountType = new PassportAccountType("PORTAL", 0);
        PORTAL = passportAccountType;
        PassportAccountType passportAccountType2 = new PassportAccountType("LITE", 1);
        LITE = passportAccountType2;
        PassportAccountType passportAccountType3 = new PassportAccountType("SOCIAL", 2);
        SOCIAL = passportAccountType3;
        PassportAccountType passportAccountType4 = new PassportAccountType("PDD", 3);
        PDD = passportAccountType4;
        PassportAccountType passportAccountType5 = new PassportAccountType("PHONISH", 4);
        PHONISH = passportAccountType5;
        PassportAccountType passportAccountType6 = new PassportAccountType("MAILISH", 5);
        MAILISH = passportAccountType6;
        PassportAccountType passportAccountType7 = new PassportAccountType("MUSIC_PHONISH", 6);
        MUSIC_PHONISH = passportAccountType7;
        PassportAccountType passportAccountType8 = new PassportAccountType("CHILDISH", 7);
        CHILDISH = passportAccountType8;
        PassportAccountType passportAccountType9 = new PassportAccountType("UNDEFINED", 8);
        UNDEFINED = passportAccountType9;
        PassportAccountType[] passportAccountTypeArr = {passportAccountType, passportAccountType2, passportAccountType3, passportAccountType4, passportAccountType5, passportAccountType6, passportAccountType7, passportAccountType8, passportAccountType9};
        $VALUES = passportAccountTypeArr;
        $ENTRIES = kotlin.enums.a.a(passportAccountTypeArr);
        Companion = new l();
    }

    public PassportAccountType(String str, int i) {
    }

    public static PassportAccountType valueOf(String str) {
        return (PassportAccountType) Enum.valueOf(PassportAccountType.class, str);
    }

    public static PassportAccountType[] values() {
        return (PassportAccountType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
