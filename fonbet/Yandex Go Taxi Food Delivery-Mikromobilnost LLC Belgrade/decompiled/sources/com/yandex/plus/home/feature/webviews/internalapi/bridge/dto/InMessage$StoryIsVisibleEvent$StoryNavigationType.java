package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mnv;
import defpackage.smv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$StoryNavigationType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$StoryNavigationType;", "Companion", "mnv", "NEXT", "PREV", "UNDEFINED", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InMessage$StoryIsVisibleEvent$StoryNavigationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InMessage$StoryIsVisibleEvent$StoryNavigationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final mnv Companion;
    public static final InMessage$StoryIsVisibleEvent$StoryNavigationType NEXT;
    public static final InMessage$StoryIsVisibleEvent$StoryNavigationType PREV;
    public static final InMessage$StoryIsVisibleEvent$StoryNavigationType UNDEFINED;

    static {
        InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType = new InMessage$StoryIsVisibleEvent$StoryNavigationType("NEXT", 0);
        NEXT = inMessage$StoryIsVisibleEvent$StoryNavigationType;
        InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType2 = new InMessage$StoryIsVisibleEvent$StoryNavigationType("PREV", 1);
        PREV = inMessage$StoryIsVisibleEvent$StoryNavigationType2;
        InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType3 = new InMessage$StoryIsVisibleEvent$StoryNavigationType("UNDEFINED", 2);
        UNDEFINED = inMessage$StoryIsVisibleEvent$StoryNavigationType3;
        InMessage$StoryIsVisibleEvent$StoryNavigationType[] inMessage$StoryIsVisibleEvent$StoryNavigationTypeArr = {inMessage$StoryIsVisibleEvent$StoryNavigationType, inMessage$StoryIsVisibleEvent$StoryNavigationType2, inMessage$StoryIsVisibleEvent$StoryNavigationType3};
        $VALUES = inMessage$StoryIsVisibleEvent$StoryNavigationTypeArr;
        $ENTRIES = a.a(inMessage$StoryIsVisibleEvent$StoryNavigationTypeArr);
        Companion = new mnv();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new smv(15));
    }

    public static InMessage$StoryIsVisibleEvent$StoryNavigationType valueOf(String str) {
        return (InMessage$StoryIsVisibleEvent$StoryNavigationType) Enum.valueOf(InMessage$StoryIsVisibleEvent$StoryNavigationType.class, str);
    }

    public static InMessage$StoryIsVisibleEvent$StoryNavigationType[] values() {
        return (InMessage$StoryIsVisibleEvent$StoryNavigationType[]) $VALUES.clone();
    }
}
