package com.vkontakte.android.actionlinks;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SourceType.kt */
/* loaded from: classes7.dex */
public final class SourceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SourceType[] $VALUES;
    public static final SourceType Live;
    public static final SourceType Video;

    static {
        SourceType sourceType = new SourceType("Live", 0);
        Live = sourceType;
        SourceType sourceType2 = new SourceType("Video", 1);
        Video = sourceType2;
        SourceType[] sourceTypeArr = {sourceType, sourceType2};
        $VALUES = sourceTypeArr;
        $ENTRIES = new asp(sourceTypeArr);
    }

    public SourceType() {
        throw null;
    }

    public static SourceType valueOf(String str) {
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }

    public static SourceType[] values() {
        return (SourceType[]) $VALUES.clone();
    }
}
