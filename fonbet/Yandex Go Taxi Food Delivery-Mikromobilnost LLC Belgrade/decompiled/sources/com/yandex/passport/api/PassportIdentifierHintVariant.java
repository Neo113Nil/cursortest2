package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/api/PassportIdentifierHintVariant;", "", "LOGIN_OR_PHONE", "LOGIN", "PHONE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportIdentifierHintVariant {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportIdentifierHintVariant[] $VALUES;
    public static final PassportIdentifierHintVariant LOGIN;
    public static final PassportIdentifierHintVariant LOGIN_OR_PHONE;
    public static final PassportIdentifierHintVariant PHONE;

    static {
        PassportIdentifierHintVariant passportIdentifierHintVariant = new PassportIdentifierHintVariant("LOGIN_OR_PHONE", 0);
        LOGIN_OR_PHONE = passportIdentifierHintVariant;
        PassportIdentifierHintVariant passportIdentifierHintVariant2 = new PassportIdentifierHintVariant("LOGIN", 1);
        LOGIN = passportIdentifierHintVariant2;
        PassportIdentifierHintVariant passportIdentifierHintVariant3 = new PassportIdentifierHintVariant("PHONE", 2);
        PHONE = passportIdentifierHintVariant3;
        PassportIdentifierHintVariant[] passportIdentifierHintVariantArr = {passportIdentifierHintVariant, passportIdentifierHintVariant2, passportIdentifierHintVariant3};
        $VALUES = passportIdentifierHintVariantArr;
        $ENTRIES = kotlin.enums.a.a(passportIdentifierHintVariantArr);
    }

    public static PassportIdentifierHintVariant valueOf(String str) {
        return (PassportIdentifierHintVariant) Enum.valueOf(PassportIdentifierHintVariant.class, str);
    }

    public static PassportIdentifierHintVariant[] values() {
        return (PassportIdentifierHintVariant[]) $VALUES.clone();
    }
}
