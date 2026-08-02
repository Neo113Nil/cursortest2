package com.yandex.mapkit.navigation.transport.layer;

import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes15.dex */
public final class BalloonTypes {
    private static final /* synthetic */ BalloonTypes[] $VALUES;
    public static final BalloonTypes ALL;
    public static final BalloonTypes MANOEUVRE;
    public static final BalloonTypes MASSTRANSIT_GET_OFF;
    public static final BalloonTypes MASSTRANSIT_GET_ON;
    public static final BalloonTypes MASSTRANSIT_STOP;
    public static final BalloonTypes MASSTRANSIT_TRANSFER;
    public static final BalloonTypes NONE = new BalloonTypes(JCP.RAW_PREFIX, 0, 0);
    public static final BalloonTypes ROUTE_SUMMARY;
    public final int value;

    private static /* synthetic */ BalloonTypes[] $values() {
        return new BalloonTypes[]{NONE, MANOEUVRE, ROUTE_SUMMARY, MASSTRANSIT_STOP, MASSTRANSIT_GET_ON, MASSTRANSIT_GET_OFF, MASSTRANSIT_TRANSFER, ALL};
    }

    static {
        BalloonTypes balloonTypes = new BalloonTypes("MANOEUVRE", 1, 1);
        MANOEUVRE = balloonTypes;
        BalloonTypes balloonTypes2 = new BalloonTypes("ROUTE_SUMMARY", 2, 2);
        ROUTE_SUMMARY = balloonTypes2;
        BalloonTypes balloonTypes3 = new BalloonTypes("MASSTRANSIT_STOP", 3, 4);
        MASSTRANSIT_STOP = balloonTypes3;
        BalloonTypes balloonTypes4 = new BalloonTypes("MASSTRANSIT_GET_ON", 4, 8);
        MASSTRANSIT_GET_ON = balloonTypes4;
        BalloonTypes balloonTypes5 = new BalloonTypes("MASSTRANSIT_GET_OFF", 5, 16);
        MASSTRANSIT_GET_OFF = balloonTypes5;
        BalloonTypes balloonTypes6 = new BalloonTypes("MASSTRANSIT_TRANSFER", 6, 32);
        MASSTRANSIT_TRANSFER = balloonTypes6;
        ALL = new BalloonTypes("ALL", 7, balloonTypes.value | balloonTypes2.value | balloonTypes3.value | balloonTypes4.value | balloonTypes5.value | balloonTypes6.value);
        $VALUES = $values();
    }

    private BalloonTypes(String str, int i, int i2) {
        this.value = i2;
    }

    public static BalloonTypes valueOf(String str) {
        return (BalloonTypes) Enum.valueOf(BalloonTypes.class, str);
    }

    public static BalloonTypes[] values() {
        return (BalloonTypes[]) $VALUES.clone();
    }
}
