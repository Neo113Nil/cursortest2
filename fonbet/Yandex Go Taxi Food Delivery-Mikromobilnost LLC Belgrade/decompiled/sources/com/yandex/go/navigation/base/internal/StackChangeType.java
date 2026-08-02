package com.yandex.go.navigation.base.internal;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigation/base/internal/StackChangeType;", "", "Push", "Poll", "Clear", "go-client-android.libs.navigation:base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StackChangeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StackChangeType[] $VALUES;
    public static final StackChangeType Clear;
    public static final StackChangeType Poll;
    public static final StackChangeType Push;

    static {
        StackChangeType stackChangeType = new StackChangeType("Push", 0);
        Push = stackChangeType;
        StackChangeType stackChangeType2 = new StackChangeType("Poll", 1);
        Poll = stackChangeType2;
        StackChangeType stackChangeType3 = new StackChangeType("Clear", 2);
        Clear = stackChangeType3;
        StackChangeType[] stackChangeTypeArr = {stackChangeType, stackChangeType2, stackChangeType3};
        $VALUES = stackChangeTypeArr;
        $ENTRIES = a.a(stackChangeTypeArr);
    }

    public static StackChangeType valueOf(String str) {
        return (StackChangeType) Enum.valueOf(StackChangeType.class, str);
    }

    public static StackChangeType[] values() {
        return (StackChangeType[]) $VALUES.clone();
    }
}
