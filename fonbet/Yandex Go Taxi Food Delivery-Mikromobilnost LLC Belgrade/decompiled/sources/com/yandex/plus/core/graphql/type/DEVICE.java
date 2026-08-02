package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import defpackage.yqf;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/core/graphql/type/DEVICE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "yqf", "APP", "DESKTOP", "PAD", "TOUCH", "TV", "TVAPP", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DEVICE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DEVICE[] $VALUES;
    public static final DEVICE APP;
    public static final yqf Companion;
    public static final DEVICE DESKTOP;
    public static final DEVICE PAD;
    public static final DEVICE TOUCH;
    public static final DEVICE TV;
    public static final DEVICE TVAPP;
    public static final DEVICE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        DEVICE device = new DEVICE("APP", 0, "APP");
        APP = device;
        DEVICE device2 = new DEVICE("DESKTOP", 1, "DESKTOP");
        DESKTOP = device2;
        DEVICE device3 = new DEVICE("PAD", 2, "PAD");
        PAD = device3;
        DEVICE device4 = new DEVICE("TOUCH", 3, "TOUCH");
        TOUCH = device4;
        DEVICE device5 = new DEVICE("TV", 4, "TV");
        TV = device5;
        DEVICE device6 = new DEVICE("TVAPP", 5, "TVAPP");
        TVAPP = device6;
        DEVICE device7 = new DEVICE("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = device7;
        DEVICE[] deviceArr = {device, device2, device3, device4, device5, device6, device7};
        $VALUES = deviceArr;
        $ENTRIES = a.a(deviceArr);
        Companion = new yqf();
        scc.g("APP", "DESKTOP", "PAD", "TOUCH", "TV", "TVAPP");
        type = new p4o("DEVICE");
    }

    public DEVICE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static DEVICE valueOf(String str) {
        return (DEVICE) Enum.valueOf(DEVICE.class, str);
    }

    public static DEVICE[] values() {
        return (DEVICE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
