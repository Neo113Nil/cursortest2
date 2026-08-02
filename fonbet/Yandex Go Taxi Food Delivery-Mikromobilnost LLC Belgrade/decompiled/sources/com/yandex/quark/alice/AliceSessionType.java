package com.yandex.quark.alice;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/quark/alice/AliceSessionType;", "", BaseDatabaseHelper.TYPE_TEXT, "VOICE", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AliceSessionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AliceSessionType[] $VALUES;
    public static final AliceSessionType TEXT;
    public static final AliceSessionType VOICE;

    static {
        AliceSessionType aliceSessionType = new AliceSessionType(BaseDatabaseHelper.TYPE_TEXT, 0);
        TEXT = aliceSessionType;
        AliceSessionType aliceSessionType2 = new AliceSessionType("VOICE", 1);
        VOICE = aliceSessionType2;
        AliceSessionType[] aliceSessionTypeArr = {aliceSessionType, aliceSessionType2};
        $VALUES = aliceSessionTypeArr;
        $ENTRIES = a.a(aliceSessionTypeArr);
    }

    public static AliceSessionType valueOf(String str) {
        return (AliceSessionType) Enum.valueOf(AliceSessionType.class, str);
    }

    public static AliceSessionType[] values() {
        return (AliceSessionType[]) $VALUES.clone();
    }
}
