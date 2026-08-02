package com.yandex.go.morphlex.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/morphlex/api/MorphlexScreenPayload$PresentType", "", "Lcom/yandex/go/morphlex/api/MorphlexScreenPayload$PresentType;", "FULLSCREEN", "CARD", "POPUP", "go-client-android.features.morphlex:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MorphlexScreenPayload$PresentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MorphlexScreenPayload$PresentType[] $VALUES;
    public static final MorphlexScreenPayload$PresentType CARD;
    public static final MorphlexScreenPayload$PresentType FULLSCREEN;
    public static final MorphlexScreenPayload$PresentType POPUP;

    static {
        MorphlexScreenPayload$PresentType morphlexScreenPayload$PresentType = new MorphlexScreenPayload$PresentType("FULLSCREEN", 0);
        FULLSCREEN = morphlexScreenPayload$PresentType;
        MorphlexScreenPayload$PresentType morphlexScreenPayload$PresentType2 = new MorphlexScreenPayload$PresentType("CARD", 1);
        CARD = morphlexScreenPayload$PresentType2;
        MorphlexScreenPayload$PresentType morphlexScreenPayload$PresentType3 = new MorphlexScreenPayload$PresentType("POPUP", 2);
        POPUP = morphlexScreenPayload$PresentType3;
        MorphlexScreenPayload$PresentType[] morphlexScreenPayload$PresentTypeArr = {morphlexScreenPayload$PresentType, morphlexScreenPayload$PresentType2, morphlexScreenPayload$PresentType3};
        $VALUES = morphlexScreenPayload$PresentTypeArr;
        $ENTRIES = a.a(morphlexScreenPayload$PresentTypeArr);
    }

    public static MorphlexScreenPayload$PresentType valueOf(String str) {
        return (MorphlexScreenPayload$PresentType) Enum.valueOf(MorphlexScreenPayload$PresentType.class, str);
    }

    public static MorphlexScreenPayload$PresentType[] values() {
        return (MorphlexScreenPayload$PresentType[]) $VALUES.clone();
    }
}
