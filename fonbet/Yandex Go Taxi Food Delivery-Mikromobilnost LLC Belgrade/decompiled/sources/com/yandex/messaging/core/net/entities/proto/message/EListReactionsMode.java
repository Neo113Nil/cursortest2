package com.yandex.messaging.core.net.entities.proto.message;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/EListReactionsMode;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "OnlyReactions", "OnlyReadTimestamps", "All", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EListReactionsMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EListReactionsMode[] $VALUES;
    public static final EListReactionsMode All;
    public static final EListReactionsMode OnlyReactions;
    public static final EListReactionsMode OnlyReadTimestamps;
    private final int value;

    static {
        EListReactionsMode eListReactionsMode = new EListReactionsMode("OnlyReactions", 0, 0);
        OnlyReactions = eListReactionsMode;
        EListReactionsMode eListReactionsMode2 = new EListReactionsMode("OnlyReadTimestamps", 1, 1);
        OnlyReadTimestamps = eListReactionsMode2;
        EListReactionsMode eListReactionsMode3 = new EListReactionsMode("All", 2, 2);
        All = eListReactionsMode3;
        EListReactionsMode[] eListReactionsModeArr = {eListReactionsMode, eListReactionsMode2, eListReactionsMode3};
        $VALUES = eListReactionsModeArr;
        $ENTRIES = a.a(eListReactionsModeArr);
    }

    public EListReactionsMode(String str, int i, int i2) {
        this.value = i2;
    }

    public static EListReactionsMode valueOf(String str) {
        return (EListReactionsMode) Enum.valueOf(EListReactionsMode.class, str);
    }

    public static EListReactionsMode[] values() {
        return (EListReactionsMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
