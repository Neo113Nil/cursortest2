package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.dxe0;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PresentationOptionsDto$ToolbarNavigationType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PresentationOptionsDto$ToolbarNavigationType;", "Companion", "dxe0", "CROSS_AND_ARROW", "ONLY_ARROW", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationOptionsDto$ToolbarNavigationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PresentationOptionsDto$ToolbarNavigationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PresentationOptionsDto$ToolbarNavigationType CROSS_AND_ARROW;
    public static final dxe0 Companion;
    public static final PresentationOptionsDto$ToolbarNavigationType ONLY_ARROW;

    static {
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType = new PresentationOptionsDto$ToolbarNavigationType("CROSS_AND_ARROW", 0);
        CROSS_AND_ARROW = presentationOptionsDto$ToolbarNavigationType;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType2 = new PresentationOptionsDto$ToolbarNavigationType("ONLY_ARROW", 1);
        ONLY_ARROW = presentationOptionsDto$ToolbarNavigationType2;
        PresentationOptionsDto$ToolbarNavigationType[] presentationOptionsDto$ToolbarNavigationTypeArr = {presentationOptionsDto$ToolbarNavigationType, presentationOptionsDto$ToolbarNavigationType2};
        $VALUES = presentationOptionsDto$ToolbarNavigationTypeArr;
        $ENTRIES = a.a(presentationOptionsDto$ToolbarNavigationTypeArr);
        Companion = new dxe0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(28));
    }

    public static PresentationOptionsDto$ToolbarNavigationType valueOf(String str) {
        return (PresentationOptionsDto$ToolbarNavigationType) Enum.valueOf(PresentationOptionsDto$ToolbarNavigationType.class, str);
    }

    public static PresentationOptionsDto$ToolbarNavigationType[] values() {
        return (PresentationOptionsDto$ToolbarNavigationType[]) $VALUES.clone();
    }
}
