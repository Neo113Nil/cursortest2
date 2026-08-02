package com.yandex.go.taxi.order.bubble.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/bubble/model/Bubble$Type", "", "Lcom/yandex/go/taxi/order/bubble/model/Bubble$Type;", "DEFAULT", "CHAIN", "COMBO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Bubble$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Bubble$Type[] $VALUES;
    public static final Bubble$Type CHAIN;
    public static final Bubble$Type COMBO;
    public static final Bubble$Type DEFAULT;

    static {
        Bubble$Type bubble$Type = new Bubble$Type("DEFAULT", 0);
        DEFAULT = bubble$Type;
        Bubble$Type bubble$Type2 = new Bubble$Type("CHAIN", 1);
        CHAIN = bubble$Type2;
        Bubble$Type bubble$Type3 = new Bubble$Type("COMBO", 2);
        COMBO = bubble$Type3;
        Bubble$Type[] bubble$TypeArr = {bubble$Type, bubble$Type2, bubble$Type3};
        $VALUES = bubble$TypeArr;
        $ENTRIES = a.a(bubble$TypeArr);
    }

    public static Bubble$Type valueOf(String str) {
        return (Bubble$Type) Enum.valueOf(Bubble$Type.class, str);
    }

    public static Bubble$Type[] values() {
        return (Bubble$Type[]) $VALUES.clone();
    }
}
