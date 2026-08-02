package com.yandex.xplat.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/xplat/common/Encoding;", "", "Utf8", "Base64", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Encoding {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Encoding[] $VALUES;
    public static final Encoding Base64;
    public static final Encoding Utf8;

    static {
        Encoding encoding = new Encoding("Utf8", 0);
        Utf8 = encoding;
        Encoding encoding2 = new Encoding("Base64", 1);
        Base64 = encoding2;
        Encoding[] encodingArr = {encoding, encoding2};
        $VALUES = encodingArr;
        $ENTRIES = kotlin.enums.a.a(encodingArr);
    }

    public static Encoding valueOf(String str) {
        return (Encoding) Enum.valueOf(Encoding.class, str);
    }

    public static Encoding[] values() {
        return (Encoding[]) $VALUES.clone();
    }
}
