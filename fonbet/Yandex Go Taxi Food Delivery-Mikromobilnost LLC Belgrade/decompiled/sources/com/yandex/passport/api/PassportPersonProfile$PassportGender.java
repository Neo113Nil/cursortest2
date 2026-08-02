package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/passport/api/PassportPersonProfile$PassportGender", "", "Lcom/yandex/passport/api/PassportPersonProfile$PassportGender;", "", "", "variants", "[Ljava/lang/String;", "a", "()[Ljava/lang/String;", "Factory", "com/yandex/passport/api/t1", "MALE", "FEMALE", "UNKNOWN", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportPersonProfile$PassportGender {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportPersonProfile$PassportGender[] $VALUES;
    public static final PassportPersonProfile$PassportGender FEMALE;
    public static final t1 Factory;
    public static final PassportPersonProfile$PassportGender MALE;
    public static final PassportPersonProfile$PassportGender UNKNOWN;
    private final String[] variants;

    static {
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender = new PassportPersonProfile$PassportGender("MALE", new String[]{"male", "m", "1"}, 0);
        MALE = passportPersonProfile$PassportGender;
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender2 = new PassportPersonProfile$PassportGender("FEMALE", new String[]{"female", "f", "2"}, 1);
        FEMALE = passportPersonProfile$PassportGender2;
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender3 = new PassportPersonProfile$PassportGender("UNKNOWN", new String[]{"unknown", "u", "0"}, 2);
        UNKNOWN = passportPersonProfile$PassportGender3;
        PassportPersonProfile$PassportGender[] passportPersonProfile$PassportGenderArr = {passportPersonProfile$PassportGender, passportPersonProfile$PassportGender2, passportPersonProfile$PassportGender3};
        $VALUES = passportPersonProfile$PassportGenderArr;
        $ENTRIES = kotlin.enums.a.a(passportPersonProfile$PassportGenderArr);
        Factory = new t1();
    }

    public PassportPersonProfile$PassportGender(String str, String[] strArr, int i) {
        this.variants = strArr;
    }

    public static PassportPersonProfile$PassportGender valueOf(String str) {
        return (PassportPersonProfile$PassportGender) Enum.valueOf(PassportPersonProfile$PassportGender.class, str);
    }

    public static PassportPersonProfile$PassportGender[] values() {
        return (PassportPersonProfile$PassportGender[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String[] getVariants() {
        return this.variants;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.variants[0];
    }
}
