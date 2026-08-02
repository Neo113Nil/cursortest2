package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/api/PushPlatform;", "", "FCM", "HMS", "RuStore", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PushPlatform {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PushPlatform[] $VALUES;
    public static final PushPlatform FCM;
    public static final PushPlatform HMS;
    public static final PushPlatform RuStore;

    static {
        PushPlatform pushPlatform = new PushPlatform("FCM", 0);
        FCM = pushPlatform;
        PushPlatform pushPlatform2 = new PushPlatform("HMS", 1);
        HMS = pushPlatform2;
        PushPlatform pushPlatform3 = new PushPlatform("RuStore", 2);
        RuStore = pushPlatform3;
        PushPlatform[] pushPlatformArr = {pushPlatform, pushPlatform2, pushPlatform3};
        $VALUES = pushPlatformArr;
        $ENTRIES = kotlin.enums.a.a(pushPlatformArr);
    }

    public static PushPlatform valueOf(String str) {
        return (PushPlatform) Enum.valueOf(PushPlatform.class, str);
    }

    public static PushPlatform[] values() {
        return (PushPlatform[]) $VALUES.clone();
    }
}
