package com.yandex.go.shortcuts.dto.request;

import defpackage.fet0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z7u0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/Status;", "", "Companion", "z7u0", "COMPLETE", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Status COMPLETE;
    public static final z7u0 Companion;
    public static final Status UNKNOWN;

    static {
        Status status = new Status("COMPLETE", 0);
        COMPLETE = status;
        Status status2 = new Status("UNKNOWN", 1);
        UNKNOWN = status2;
        Status[] statusArr = {status, status2};
        $VALUES = statusArr;
        $ENTRIES = kotlin.enums.a.a(statusArr);
        Companion = new z7u0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(23));
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
