package com.yandex.go.scooters.misc.api.support;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/scooters/misc/api/support/ScootersSupportEntryPoint;", "", "", "screenName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DETAILED_ORDER", "FINISH_INFO", "COMPLETION_PHOTO", "PHOTO_CONTROL", "COMPLETION_ACCEPTANCE", "DISCOVERY", "CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersSupportEntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersSupportEntryPoint[] $VALUES;
    public static final ScootersSupportEntryPoint CARD;
    public static final ScootersSupportEntryPoint COMPLETION_ACCEPTANCE;
    public static final ScootersSupportEntryPoint COMPLETION_PHOTO;
    public static final ScootersSupportEntryPoint DETAILED_ORDER;
    public static final ScootersSupportEntryPoint DISCOVERY;
    public static final ScootersSupportEntryPoint FINISH_INFO;
    public static final ScootersSupportEntryPoint PHOTO_CONTROL;
    private final String screenName;

    static {
        ScootersSupportEntryPoint scootersSupportEntryPoint = new ScootersSupportEntryPoint("DETAILED_ORDER", 0, "detailed_order");
        DETAILED_ORDER = scootersSupportEntryPoint;
        ScootersSupportEntryPoint scootersSupportEntryPoint2 = new ScootersSupportEntryPoint("FINISH_INFO", 1, "finish_info");
        FINISH_INFO = scootersSupportEntryPoint2;
        ScootersSupportEntryPoint scootersSupportEntryPoint3 = new ScootersSupportEntryPoint("COMPLETION_PHOTO", 2, "completion_photo");
        COMPLETION_PHOTO = scootersSupportEntryPoint3;
        ScootersSupportEntryPoint scootersSupportEntryPoint4 = new ScootersSupportEntryPoint("PHOTO_CONTROL", 3, "photo_control");
        PHOTO_CONTROL = scootersSupportEntryPoint4;
        ScootersSupportEntryPoint scootersSupportEntryPoint5 = new ScootersSupportEntryPoint("COMPLETION_ACCEPTANCE", 4, "completion_acceptance");
        COMPLETION_ACCEPTANCE = scootersSupportEntryPoint5;
        ScootersSupportEntryPoint scootersSupportEntryPoint6 = new ScootersSupportEntryPoint("DISCOVERY", 5, "discovery");
        DISCOVERY = scootersSupportEntryPoint6;
        ScootersSupportEntryPoint scootersSupportEntryPoint7 = new ScootersSupportEntryPoint("CARD", 6, "card");
        CARD = scootersSupportEntryPoint7;
        ScootersSupportEntryPoint[] scootersSupportEntryPointArr = {scootersSupportEntryPoint, scootersSupportEntryPoint2, scootersSupportEntryPoint3, scootersSupportEntryPoint4, scootersSupportEntryPoint5, scootersSupportEntryPoint6, scootersSupportEntryPoint7};
        $VALUES = scootersSupportEntryPointArr;
        $ENTRIES = a.a(scootersSupportEntryPointArr);
    }

    public ScootersSupportEntryPoint(String str, int i, String str2) {
        this.screenName = str2;
    }

    public static ScootersSupportEntryPoint valueOf(String str) {
        return (ScootersSupportEntryPoint) Enum.valueOf(ScootersSupportEntryPoint.class, str);
    }

    public static ScootersSupportEntryPoint[] values() {
        return (ScootersSupportEntryPoint[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }
}
