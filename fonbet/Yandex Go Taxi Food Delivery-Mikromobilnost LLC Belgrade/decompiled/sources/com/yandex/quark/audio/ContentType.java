package com.yandex.quark.audio;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/audio/ContentType;", "", "SPEECH", "MUSIC", "UNKNOWN", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    public static final ContentType MUSIC;
    public static final ContentType SPEECH;
    public static final ContentType UNKNOWN;

    static {
        ContentType contentType = new ContentType("SPEECH", 0);
        SPEECH = contentType;
        ContentType contentType2 = new ContentType("MUSIC", 1);
        MUSIC = contentType2;
        ContentType contentType3 = new ContentType("UNKNOWN", 2);
        UNKNOWN = contentType3;
        ContentType[] contentTypeArr = {contentType, contentType2, contentType3};
        $VALUES = contentTypeArr;
        $ENTRIES = a.a(contentTypeArr);
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }
}
