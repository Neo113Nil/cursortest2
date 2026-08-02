package com.yandex.go.mainscreen.superapp.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$HeaderTappedElementName", "", "Lcom/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$HeaderTappedElementName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Logo", "FintechWidget", "go-client-android.features.superapp.mainscreen:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuperappMainAnalytics$HeaderTappedElementName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappMainAnalytics$HeaderTappedElementName[] $VALUES;
    public static final SuperappMainAnalytics$HeaderTappedElementName FintechWidget;
    public static final SuperappMainAnalytics$HeaderTappedElementName Logo;
    private final String eventValue;

    static {
        SuperappMainAnalytics$HeaderTappedElementName superappMainAnalytics$HeaderTappedElementName = new SuperappMainAnalytics$HeaderTappedElementName("Logo", 0, "logo");
        Logo = superappMainAnalytics$HeaderTappedElementName;
        SuperappMainAnalytics$HeaderTappedElementName superappMainAnalytics$HeaderTappedElementName2 = new SuperappMainAnalytics$HeaderTappedElementName("FintechWidget", 1, "fintech_widget");
        FintechWidget = superappMainAnalytics$HeaderTappedElementName2;
        SuperappMainAnalytics$HeaderTappedElementName[] superappMainAnalytics$HeaderTappedElementNameArr = {superappMainAnalytics$HeaderTappedElementName, superappMainAnalytics$HeaderTappedElementName2};
        $VALUES = superappMainAnalytics$HeaderTappedElementNameArr;
        $ENTRIES = a.a(superappMainAnalytics$HeaderTappedElementNameArr);
    }

    public SuperappMainAnalytics$HeaderTappedElementName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappMainAnalytics$HeaderTappedElementName valueOf(String str) {
        return (SuperappMainAnalytics$HeaderTappedElementName) Enum.valueOf(SuperappMainAnalytics$HeaderTappedElementName.class, str);
    }

    public static SuperappMainAnalytics$HeaderTappedElementName[] values() {
        return (SuperappMainAnalytics$HeaderTappedElementName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
