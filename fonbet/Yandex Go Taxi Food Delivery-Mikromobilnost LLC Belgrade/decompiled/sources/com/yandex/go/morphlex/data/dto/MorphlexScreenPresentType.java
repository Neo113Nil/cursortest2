package com.yandex.go.morphlex.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l830;
import defpackage.um20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexScreenPresentType;", "", "Companion", "l830", "FULLSCREEN", "CARD", "POPUP", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MorphlexScreenPresentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MorphlexScreenPresentType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MorphlexScreenPresentType CARD;
    public static final l830 Companion;
    public static final MorphlexScreenPresentType FULLSCREEN;
    public static final MorphlexScreenPresentType POPUP;
    public static final MorphlexScreenPresentType UNSUPPORTED;

    static {
        MorphlexScreenPresentType morphlexScreenPresentType = new MorphlexScreenPresentType("FULLSCREEN", 0);
        FULLSCREEN = morphlexScreenPresentType;
        MorphlexScreenPresentType morphlexScreenPresentType2 = new MorphlexScreenPresentType("CARD", 1);
        CARD = morphlexScreenPresentType2;
        MorphlexScreenPresentType morphlexScreenPresentType3 = new MorphlexScreenPresentType("POPUP", 2);
        POPUP = morphlexScreenPresentType3;
        MorphlexScreenPresentType morphlexScreenPresentType4 = new MorphlexScreenPresentType("UNSUPPORTED", 3);
        UNSUPPORTED = morphlexScreenPresentType4;
        MorphlexScreenPresentType[] morphlexScreenPresentTypeArr = {morphlexScreenPresentType, morphlexScreenPresentType2, morphlexScreenPresentType3, morphlexScreenPresentType4};
        $VALUES = morphlexScreenPresentTypeArr;
        $ENTRIES = kotlin.enums.a.a(morphlexScreenPresentTypeArr);
        Companion = new l830();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(22));
    }

    public static MorphlexScreenPresentType valueOf(String str) {
        return (MorphlexScreenPresentType) Enum.valueOf(MorphlexScreenPresentType.class, str);
    }

    public static MorphlexScreenPresentType[] values() {
        return (MorphlexScreenPresentType[]) $VALUES.clone();
    }
}
