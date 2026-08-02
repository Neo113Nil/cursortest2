package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.axe0;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PresentationOptionsDto$ModalHeight$Type", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PresentationOptionsDto$ModalHeight$Type;", "Companion", "axe0", "PERCENT", "FIXED", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationOptionsDto$ModalHeight$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PresentationOptionsDto$ModalHeight$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final axe0 Companion;
    public static final PresentationOptionsDto$ModalHeight$Type FIXED;
    public static final PresentationOptionsDto$ModalHeight$Type PERCENT;

    static {
        PresentationOptionsDto$ModalHeight$Type presentationOptionsDto$ModalHeight$Type = new PresentationOptionsDto$ModalHeight$Type("PERCENT", 0);
        PERCENT = presentationOptionsDto$ModalHeight$Type;
        PresentationOptionsDto$ModalHeight$Type presentationOptionsDto$ModalHeight$Type2 = new PresentationOptionsDto$ModalHeight$Type("FIXED", 1);
        FIXED = presentationOptionsDto$ModalHeight$Type2;
        PresentationOptionsDto$ModalHeight$Type[] presentationOptionsDto$ModalHeight$TypeArr = {presentationOptionsDto$ModalHeight$Type, presentationOptionsDto$ModalHeight$Type2};
        $VALUES = presentationOptionsDto$ModalHeight$TypeArr;
        $ENTRIES = a.a(presentationOptionsDto$ModalHeight$TypeArr);
        Companion = new axe0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(26));
    }

    public static PresentationOptionsDto$ModalHeight$Type valueOf(String str) {
        return (PresentationOptionsDto$ModalHeight$Type) Enum.valueOf(PresentationOptionsDto$ModalHeight$Type.class, str);
    }

    public static PresentationOptionsDto$ModalHeight$Type[] values() {
        return (PresentationOptionsDto$ModalHeight$Type[]) $VALUES.clone();
    }
}
