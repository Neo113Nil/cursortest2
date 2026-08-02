package com.yandex.fintechsdk.core.bdui.api.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/fintechsdk/core/bdui/api/state/BduiStateTag;", "", "", "key", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SEND_TO_BACKEND", "SYNC_WITH_DIVKIT", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BduiStateTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BduiStateTag[] $VALUES;
    public static final BduiStateTag SEND_TO_BACKEND;
    public static final BduiStateTag SYNC_WITH_DIVKIT;
    private final String key;

    static {
        BduiStateTag bduiStateTag = new BduiStateTag("SEND_TO_BACKEND", 0, "send-to-backend");
        SEND_TO_BACKEND = bduiStateTag;
        BduiStateTag bduiStateTag2 = new BduiStateTag("SYNC_WITH_DIVKIT", 1, "sync-with-divkit");
        SYNC_WITH_DIVKIT = bduiStateTag2;
        BduiStateTag[] bduiStateTagArr = {bduiStateTag, bduiStateTag2};
        $VALUES = bduiStateTagArr;
        $ENTRIES = a.a(bduiStateTagArr);
    }

    public BduiStateTag(String str, int i, String str2) {
        this.key = str2;
    }

    public static BduiStateTag valueOf(String str) {
        return (BduiStateTag) Enum.valueOf(BduiStateTag.class, str);
    }

    public static BduiStateTag[] values() {
        return (BduiStateTag[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
