package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.bnv;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.smv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$PurchaseProductClick$Type", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$PurchaseProductClick$Type;", "Companion", "bnv", "BUTTON", "CARD", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InMessage$PurchaseProductClick$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InMessage$PurchaseProductClick$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final InMessage$PurchaseProductClick$Type BUTTON;
    public static final InMessage$PurchaseProductClick$Type CARD;
    public static final bnv Companion;

    static {
        InMessage$PurchaseProductClick$Type inMessage$PurchaseProductClick$Type = new InMessage$PurchaseProductClick$Type("BUTTON", 0);
        BUTTON = inMessage$PurchaseProductClick$Type;
        InMessage$PurchaseProductClick$Type inMessage$PurchaseProductClick$Type2 = new InMessage$PurchaseProductClick$Type("CARD", 1);
        CARD = inMessage$PurchaseProductClick$Type2;
        InMessage$PurchaseProductClick$Type[] inMessage$PurchaseProductClick$TypeArr = {inMessage$PurchaseProductClick$Type, inMessage$PurchaseProductClick$Type2};
        $VALUES = inMessage$PurchaseProductClick$TypeArr;
        $ENTRIES = a.a(inMessage$PurchaseProductClick$TypeArr);
        Companion = new bnv();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new smv(6));
    }

    public static InMessage$PurchaseProductClick$Type valueOf(String str) {
        return (InMessage$PurchaseProductClick$Type) Enum.valueOf(InMessage$PurchaseProductClick$Type.class, str);
    }

    public static InMessage$PurchaseProductClick$Type[] values() {
        return (InMessage$PurchaseProductClick$Type[]) $VALUES.clone();
    }
}
