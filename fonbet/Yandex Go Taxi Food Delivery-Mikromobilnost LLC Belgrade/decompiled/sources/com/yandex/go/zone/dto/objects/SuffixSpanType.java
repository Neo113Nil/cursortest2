package com.yandex.go.zone.dto.objects;

import defpackage.c3u0;
import defpackage.e4v0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SuffixSpanType;", "", "Companion", "e4v0", "CHEVRON", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuffixSpanType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuffixSpanType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SuffixSpanType CHEVRON;
    public static final e4v0 Companion;

    static {
        SuffixSpanType suffixSpanType = new SuffixSpanType("CHEVRON", 0);
        CHEVRON = suffixSpanType;
        SuffixSpanType[] suffixSpanTypeArr = {suffixSpanType};
        $VALUES = suffixSpanTypeArr;
        $ENTRIES = kotlin.enums.a.a(suffixSpanTypeArr);
        Companion = new e4v0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(23));
    }

    public static SuffixSpanType valueOf(String str) {
        return (SuffixSpanType) Enum.valueOf(SuffixSpanType.class, str);
    }

    public static SuffixSpanType[] values() {
        return (SuffixSpanType[]) $VALUES.clone();
    }
}
