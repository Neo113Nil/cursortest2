package one.video.errorresolver.asserts;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssertEvent.kt */
/* loaded from: classes8.dex */
public final class AssertEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AssertEvent[] $VALUES;
    public static final AssertEvent RESOLVER_INVALID_RESPONSE_CODE_INFO_IS_NULL;
    public static final AssertEvent RESOLVER_INVALID_RESPONSE_CODE_VALUE;
    public static final AssertEvent RESOLVER_RENDERER_EXCEPTION_IS_NULL;
    public static final AssertEvent RESOLVER_SOURCE_EXCEPTION_IS_NULL;

    static {
        AssertEvent assertEvent = new AssertEvent("RESOLVER_SOURCE_EXCEPTION_IS_NULL", 0);
        RESOLVER_SOURCE_EXCEPTION_IS_NULL = assertEvent;
        AssertEvent assertEvent2 = new AssertEvent("RESOLVER_INVALID_RESPONSE_CODE_INFO_IS_NULL", 1);
        RESOLVER_INVALID_RESPONSE_CODE_INFO_IS_NULL = assertEvent2;
        AssertEvent assertEvent3 = new AssertEvent("RESOLVER_INVALID_RESPONSE_CODE_VALUE", 2);
        RESOLVER_INVALID_RESPONSE_CODE_VALUE = assertEvent3;
        AssertEvent assertEvent4 = new AssertEvent("RESOLVER_RENDERER_EXCEPTION_IS_NULL", 3);
        RESOLVER_RENDERER_EXCEPTION_IS_NULL = assertEvent4;
        AssertEvent[] assertEventArr = {assertEvent, assertEvent2, assertEvent3, assertEvent4};
        $VALUES = assertEventArr;
        $ENTRIES = new asp(assertEventArr);
    }

    public AssertEvent() {
        throw null;
    }

    public static AssertEvent valueOf(String str) {
        return (AssertEvent) Enum.valueOf(AssertEvent.class, str);
    }

    public static AssertEvent[] values() {
        return (AssertEvent[]) $VALUES.clone();
    }
}
