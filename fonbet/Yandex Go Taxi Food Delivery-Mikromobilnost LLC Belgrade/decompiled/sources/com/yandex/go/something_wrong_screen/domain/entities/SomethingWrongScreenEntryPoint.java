package com.yandex.go.something_wrong_screen.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/something_wrong_screen/domain/entities/SomethingWrongScreenEntryPoint;", "", "ORDER", "DEEPLINK", "go-client-android.features.something_wrong_screen:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SomethingWrongScreenEntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SomethingWrongScreenEntryPoint[] $VALUES;
    public static final SomethingWrongScreenEntryPoint DEEPLINK;
    public static final SomethingWrongScreenEntryPoint ORDER;

    static {
        SomethingWrongScreenEntryPoint somethingWrongScreenEntryPoint = new SomethingWrongScreenEntryPoint("ORDER", 0);
        ORDER = somethingWrongScreenEntryPoint;
        SomethingWrongScreenEntryPoint somethingWrongScreenEntryPoint2 = new SomethingWrongScreenEntryPoint("DEEPLINK", 1);
        DEEPLINK = somethingWrongScreenEntryPoint2;
        SomethingWrongScreenEntryPoint[] somethingWrongScreenEntryPointArr = {somethingWrongScreenEntryPoint, somethingWrongScreenEntryPoint2};
        $VALUES = somethingWrongScreenEntryPointArr;
        $ENTRIES = a.a(somethingWrongScreenEntryPointArr);
    }

    public static SomethingWrongScreenEntryPoint valueOf(String str) {
        return (SomethingWrongScreenEntryPoint) Enum.valueOf(SomethingWrongScreenEntryPoint.class, str);
    }

    public static SomethingWrongScreenEntryPoint[] values() {
        return (SomethingWrongScreenEntryPoint[]) $VALUES.clone();
    }
}
