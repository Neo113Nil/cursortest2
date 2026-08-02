package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.cxe0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jee0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PresentationOptionsDto$OpenFormat", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PresentationOptionsDto$OpenFormat;", "Companion", "cxe0", "CARD", "FULL", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationOptionsDto$OpenFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PresentationOptionsDto$OpenFormat[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PresentationOptionsDto$OpenFormat CARD;
    public static final cxe0 Companion;
    public static final PresentationOptionsDto$OpenFormat FULL;

    static {
        PresentationOptionsDto$OpenFormat presentationOptionsDto$OpenFormat = new PresentationOptionsDto$OpenFormat("CARD", 0);
        CARD = presentationOptionsDto$OpenFormat;
        PresentationOptionsDto$OpenFormat presentationOptionsDto$OpenFormat2 = new PresentationOptionsDto$OpenFormat("FULL", 1);
        FULL = presentationOptionsDto$OpenFormat2;
        PresentationOptionsDto$OpenFormat[] presentationOptionsDto$OpenFormatArr = {presentationOptionsDto$OpenFormat, presentationOptionsDto$OpenFormat2};
        $VALUES = presentationOptionsDto$OpenFormatArr;
        $ENTRIES = a.a(presentationOptionsDto$OpenFormatArr);
        Companion = new cxe0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(27));
    }

    public static PresentationOptionsDto$OpenFormat valueOf(String str) {
        return (PresentationOptionsDto$OpenFormat) Enum.valueOf(PresentationOptionsDto$OpenFormat.class, str);
    }

    public static PresentationOptionsDto$OpenFormat[] values() {
        return (PresentationOptionsDto$OpenFormat[]) $VALUES.clone();
    }
}
