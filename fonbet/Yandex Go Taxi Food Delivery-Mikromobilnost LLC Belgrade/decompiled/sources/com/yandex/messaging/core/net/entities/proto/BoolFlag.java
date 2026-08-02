package com.yandex.messaging.core.net.entities.proto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/BoolFlag;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "UNKNOWN", "SET", "UNSET", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BoolFlag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BoolFlag[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BoolFlag SET;
    public static final BoolFlag UNKNOWN;
    public static final BoolFlag UNSET;
    private final int value;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/BoolFlag$Companion;", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        BoolFlag boolFlag = new BoolFlag("UNKNOWN", 0, 0);
        UNKNOWN = boolFlag;
        BoolFlag boolFlag2 = new BoolFlag("SET", 1, 1);
        SET = boolFlag2;
        BoolFlag boolFlag3 = new BoolFlag("UNSET", 2, 2);
        UNSET = boolFlag3;
        BoolFlag[] boolFlagArr = {boolFlag, boolFlag2, boolFlag3};
        $VALUES = boolFlagArr;
        $ENTRIES = a.a(boolFlagArr);
        INSTANCE = new Companion();
    }

    public BoolFlag(String str, int i, int i2) {
        this.value = i2;
    }

    public static BoolFlag valueOf(String str) {
        return (BoolFlag) Enum.valueOf(BoolFlag.class, str);
    }

    public static BoolFlag[] values() {
        return (BoolFlag[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
