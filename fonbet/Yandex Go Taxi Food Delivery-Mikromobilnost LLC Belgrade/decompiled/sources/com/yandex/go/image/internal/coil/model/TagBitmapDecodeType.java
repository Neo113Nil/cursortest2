package com.yandex.go.image.internal.coil.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/image/internal/coil/model/TagBitmapDecodeType;", "", "NotApplicable", "View", "Compose", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TagBitmapDecodeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TagBitmapDecodeType[] $VALUES;
    public static final TagBitmapDecodeType Compose;
    public static final TagBitmapDecodeType NotApplicable;
    public static final TagBitmapDecodeType View;

    static {
        TagBitmapDecodeType tagBitmapDecodeType = new TagBitmapDecodeType("NotApplicable", 0);
        NotApplicable = tagBitmapDecodeType;
        TagBitmapDecodeType tagBitmapDecodeType2 = new TagBitmapDecodeType("View", 1);
        View = tagBitmapDecodeType2;
        TagBitmapDecodeType tagBitmapDecodeType3 = new TagBitmapDecodeType("Compose", 2);
        Compose = tagBitmapDecodeType3;
        TagBitmapDecodeType[] tagBitmapDecodeTypeArr = {tagBitmapDecodeType, tagBitmapDecodeType2, tagBitmapDecodeType3};
        $VALUES = tagBitmapDecodeTypeArr;
        $ENTRIES = a.a(tagBitmapDecodeTypeArr);
    }

    public static TagBitmapDecodeType valueOf(String str) {
        return (TagBitmapDecodeType) Enum.valueOf(TagBitmapDecodeType.class, str);
    }

    public static TagBitmapDecodeType[] values() {
        return (TagBitmapDecodeType[]) $VALUES.clone();
    }
}
