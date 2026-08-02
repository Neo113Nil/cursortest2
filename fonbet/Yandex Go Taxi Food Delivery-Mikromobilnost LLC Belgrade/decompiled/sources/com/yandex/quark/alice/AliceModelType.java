package com.yandex.quark.alice;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/alice/AliceModelType;", "", "BASE", "PRO", "UNKNOWN", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AliceModelType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AliceModelType[] $VALUES;
    public static final AliceModelType BASE;
    public static final AliceModelType PRO;
    public static final AliceModelType UNKNOWN;

    static {
        AliceModelType aliceModelType = new AliceModelType("BASE", 0);
        BASE = aliceModelType;
        AliceModelType aliceModelType2 = new AliceModelType("PRO", 1);
        PRO = aliceModelType2;
        AliceModelType aliceModelType3 = new AliceModelType("UNKNOWN", 2);
        UNKNOWN = aliceModelType3;
        AliceModelType[] aliceModelTypeArr = {aliceModelType, aliceModelType2, aliceModelType3};
        $VALUES = aliceModelTypeArr;
        $ENTRIES = a.a(aliceModelTypeArr);
    }

    public static AliceModelType valueOf(String str) {
        return (AliceModelType) Enum.valueOf(AliceModelType.class, str);
    }

    public static AliceModelType[] values() {
        return (AliceModelType[]) $VALUES.clone();
    }
}
