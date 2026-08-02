package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/api/PassportScreenOrientation;", "", "Portrait", "Landscape", "None", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportScreenOrientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportScreenOrientation[] $VALUES;
    public static final PassportScreenOrientation Landscape;
    public static final PassportScreenOrientation None;
    public static final PassportScreenOrientation Portrait;

    static {
        PassportScreenOrientation passportScreenOrientation = new PassportScreenOrientation("Portrait", 0);
        Portrait = passportScreenOrientation;
        PassportScreenOrientation passportScreenOrientation2 = new PassportScreenOrientation("Landscape", 1);
        Landscape = passportScreenOrientation2;
        PassportScreenOrientation passportScreenOrientation3 = new PassportScreenOrientation("None", 2);
        None = passportScreenOrientation3;
        PassportScreenOrientation[] passportScreenOrientationArr = {passportScreenOrientation, passportScreenOrientation2, passportScreenOrientation3};
        $VALUES = passportScreenOrientationArr;
        $ENTRIES = kotlin.enums.a.a(passportScreenOrientationArr);
    }

    public static PassportScreenOrientation valueOf(String str) {
        return (PassportScreenOrientation) Enum.valueOf(PassportScreenOrientation.class, str);
    }

    public static PassportScreenOrientation[] values() {
        return (PassportScreenOrientation[]) $VALUES.clone();
    }
}
