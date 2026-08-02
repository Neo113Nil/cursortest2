package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.lnv;
import defpackage.smv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$MiniStoryControlType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$MiniStoryControlType;", "Companion", "lnv", "SWIPE", "TAP", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InMessage$StoryIsVisibleEvent$MiniStoryControlType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InMessage$StoryIsVisibleEvent$MiniStoryControlType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final lnv Companion;
    public static final InMessage$StoryIsVisibleEvent$MiniStoryControlType SWIPE;
    public static final InMessage$StoryIsVisibleEvent$MiniStoryControlType TAP;

    static {
        InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType = new InMessage$StoryIsVisibleEvent$MiniStoryControlType("SWIPE", 0);
        SWIPE = inMessage$StoryIsVisibleEvent$MiniStoryControlType;
        InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType2 = new InMessage$StoryIsVisibleEvent$MiniStoryControlType("TAP", 1);
        TAP = inMessage$StoryIsVisibleEvent$MiniStoryControlType2;
        InMessage$StoryIsVisibleEvent$MiniStoryControlType[] inMessage$StoryIsVisibleEvent$MiniStoryControlTypeArr = {inMessage$StoryIsVisibleEvent$MiniStoryControlType, inMessage$StoryIsVisibleEvent$MiniStoryControlType2};
        $VALUES = inMessage$StoryIsVisibleEvent$MiniStoryControlTypeArr;
        $ENTRIES = a.a(inMessage$StoryIsVisibleEvent$MiniStoryControlTypeArr);
        Companion = new lnv();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new smv(14));
    }

    public static InMessage$StoryIsVisibleEvent$MiniStoryControlType valueOf(String str) {
        return (InMessage$StoryIsVisibleEvent$MiniStoryControlType) Enum.valueOf(InMessage$StoryIsVisibleEvent$MiniStoryControlType.class, str);
    }

    public static InMessage$StoryIsVisibleEvent$MiniStoryControlType[] values() {
        return (InMessage$StoryIsVisibleEvent$MiniStoryControlType[]) $VALUES.clone();
    }
}
