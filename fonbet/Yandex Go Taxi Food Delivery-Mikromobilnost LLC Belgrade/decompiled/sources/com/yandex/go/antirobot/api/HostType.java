package com.yandex.go.antirobot.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/antirobot/api/HostType;", "", "Narwhal", "Taxi", "go-client-android.features.antirobot:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HostType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HostType[] $VALUES;
    public static final HostType Narwhal;
    public static final HostType Taxi;

    static {
        HostType hostType = new HostType("Narwhal", 0);
        Narwhal = hostType;
        HostType hostType2 = new HostType("Taxi", 1);
        Taxi = hostType2;
        HostType[] hostTypeArr = {hostType, hostType2};
        $VALUES = hostTypeArr;
        $ENTRIES = a.a(hostTypeArr);
    }

    public static HostType valueOf(String str) {
        return (HostType) Enum.valueOf(HostType.class, str);
    }

    public static HostType[] values() {
        return (HostType[]) $VALUES.clone();
    }
}
