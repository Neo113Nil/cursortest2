package com.yandex.passport.internal.push;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/push/EnqueueType;", "", "Companion", "com/yandex/passport/internal/push/a", "JOB_INTENT_SERVICE", "COROUTINE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EnqueueType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EnqueueType[] $VALUES;
    public static final EnqueueType COROUTINE;
    public static final a Companion;
    public static final EnqueueType JOB_INTENT_SERVICE;

    static {
        EnqueueType enqueueType = new EnqueueType("JOB_INTENT_SERVICE", 0);
        JOB_INTENT_SERVICE = enqueueType;
        EnqueueType enqueueType2 = new EnqueueType("COROUTINE", 1);
        COROUTINE = enqueueType2;
        EnqueueType[] enqueueTypeArr = {enqueueType, enqueueType2};
        $VALUES = enqueueTypeArr;
        $ENTRIES = kotlin.enums.a.a(enqueueTypeArr);
        Companion = new a();
    }

    public static EnqueueType valueOf(String str) {
        return (EnqueueType) Enum.valueOf(EnqueueType.class, str);
    }

    public static EnqueueType[] values() {
        return (EnqueueType[]) $VALUES.clone();
    }
}
