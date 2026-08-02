package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.gsq0;
import defpackage.ht80;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.yi80;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType;", "Companion", "ht80", "NEXT", "PREV", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ht80 Companion;
    public static final OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType NEXT;
    public static final OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType PREV;

    static {
        OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType = new OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType("NEXT", 0);
        NEXT = outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType;
        OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType2 = new OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType("PREV", 1);
        PREV = outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType2;
        OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType[] outMessage$MiniStoryIsShownEvent$MiniStoryNavigationTypeArr = {outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType, outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType2};
        $VALUES = outMessage$MiniStoryIsShownEvent$MiniStoryNavigationTypeArr;
        $ENTRIES = a.a(outMessage$MiniStoryIsShownEvent$MiniStoryNavigationTypeArr);
        Companion = new ht80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(16));
    }

    public static OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType valueOf(String str) {
        return (OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType) Enum.valueOf(OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType.class, str);
    }

    public static OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType[] values() {
        return (OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType[]) $VALUES.clone();
    }
}
