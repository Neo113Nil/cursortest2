package com.vkontakte.android.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParseFrom.kt */
/* loaded from: classes7.dex */
public final class ParseFrom {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ParseFrom[] $VALUES;
    public static final ParseFrom CLIPS;
    public static final ParseFrom NEWSFEED;
    public static final ParseFrom NONE;

    static {
        ParseFrom parseFrom = new ParseFrom("NEWSFEED", 0);
        NEWSFEED = parseFrom;
        ParseFrom parseFrom2 = new ParseFrom("CLIPS", 1);
        CLIPS = parseFrom2;
        ParseFrom parseFrom3 = new ParseFrom("NONE", 2);
        NONE = parseFrom3;
        ParseFrom[] parseFromArr = {parseFrom, parseFrom2, parseFrom3};
        $VALUES = parseFromArr;
        $ENTRIES = new asp(parseFromArr);
    }

    public ParseFrom() {
        throw null;
    }

    public static ParseFrom valueOf(String str) {
        return (ParseFrom) Enum.valueOf(ParseFrom.class, str);
    }

    public static ParseFrom[] values() {
        return (ParseFrom[]) $VALUES.clone();
    }
}
