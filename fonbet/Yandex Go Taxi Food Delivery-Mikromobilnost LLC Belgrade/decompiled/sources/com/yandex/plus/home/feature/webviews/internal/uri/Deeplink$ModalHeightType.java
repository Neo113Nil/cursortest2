package com.yandex.plus.home.feature.webviews.internal.uri;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/feature/webviews/internal/uri/Deeplink$ModalHeightType", "", "Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$ModalHeightType;", "PERCENT", "FIXED", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Deeplink$ModalHeightType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Deeplink$ModalHeightType[] $VALUES;
    public static final Deeplink$ModalHeightType FIXED;
    public static final Deeplink$ModalHeightType PERCENT;

    static {
        Deeplink$ModalHeightType deeplink$ModalHeightType = new Deeplink$ModalHeightType("PERCENT", 0);
        PERCENT = deeplink$ModalHeightType;
        Deeplink$ModalHeightType deeplink$ModalHeightType2 = new Deeplink$ModalHeightType("FIXED", 1);
        FIXED = deeplink$ModalHeightType2;
        Deeplink$ModalHeightType[] deeplink$ModalHeightTypeArr = {deeplink$ModalHeightType, deeplink$ModalHeightType2};
        $VALUES = deeplink$ModalHeightTypeArr;
        $ENTRIES = kotlin.enums.a.a(deeplink$ModalHeightTypeArr);
    }

    public static Deeplink$ModalHeightType valueOf(String str) {
        return (Deeplink$ModalHeightType) Enum.valueOf(Deeplink$ModalHeightType.class, str);
    }

    public static Deeplink$ModalHeightType[] values() {
        return (Deeplink$ModalHeightType[]) $VALUES.clone();
    }
}
