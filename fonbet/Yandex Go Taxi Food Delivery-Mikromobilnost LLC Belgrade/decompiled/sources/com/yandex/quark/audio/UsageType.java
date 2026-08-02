package com.yandex.quark.audio;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/audio/UsageType;", "", DefaultErrorCategoryProvider.MEDIA, "ASSISTANT", "VOICE_COMMUNICATION", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UsageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UsageType[] $VALUES;
    public static final UsageType ASSISTANT;
    public static final UsageType MEDIA;
    public static final UsageType VOICE_COMMUNICATION;

    static {
        UsageType usageType = new UsageType(DefaultErrorCategoryProvider.MEDIA, 0);
        MEDIA = usageType;
        UsageType usageType2 = new UsageType("ASSISTANT", 1);
        ASSISTANT = usageType2;
        UsageType usageType3 = new UsageType("VOICE_COMMUNICATION", 2);
        VOICE_COMMUNICATION = usageType3;
        UsageType[] usageTypeArr = {usageType, usageType2, usageType3};
        $VALUES = usageTypeArr;
        $ENTRIES = a.a(usageTypeArr);
    }

    public static UsageType valueOf(String str) {
        return (UsageType) Enum.valueOf(UsageType.class, str);
    }

    public static UsageType[] values() {
        return (UsageType[]) $VALUES.clone();
    }
}
