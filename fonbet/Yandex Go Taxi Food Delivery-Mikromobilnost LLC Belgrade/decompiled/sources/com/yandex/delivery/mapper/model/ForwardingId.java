package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/delivery/mapper/model/ForwardingId;", "", "PERFORMER", "INAPP", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ForwardingId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ForwardingId[] $VALUES;
    public static final ForwardingId INAPP;
    public static final ForwardingId PERFORMER;

    static {
        ForwardingId forwardingId = new ForwardingId("PERFORMER", 0);
        PERFORMER = forwardingId;
        ForwardingId forwardingId2 = new ForwardingId("INAPP", 1);
        INAPP = forwardingId2;
        ForwardingId[] forwardingIdArr = {forwardingId, forwardingId2};
        $VALUES = forwardingIdArr;
        $ENTRIES = a.a(forwardingIdArr);
    }

    public static ForwardingId valueOf(String str) {
        return (ForwardingId) Enum.valueOf(ForwardingId.class, str);
    }

    public static ForwardingId[] values() {
        return (ForwardingId[]) $VALUES.clone();
    }
}
