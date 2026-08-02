package com.yandex.messaging.miniapps.view;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/messaging/miniapps/view/MiniAppBrick$SizeSource", "", "Lcom/yandex/messaging/miniapps/view/MiniAppBrick$SizeSource;", "SIZE", "HEIGHT", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class MiniAppBrick$SizeSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MiniAppBrick$SizeSource[] $VALUES;
    public static final MiniAppBrick$SizeSource HEIGHT;
    public static final MiniAppBrick$SizeSource SIZE;

    static {
        MiniAppBrick$SizeSource miniAppBrick$SizeSource = new MiniAppBrick$SizeSource("SIZE", 0);
        SIZE = miniAppBrick$SizeSource;
        MiniAppBrick$SizeSource miniAppBrick$SizeSource2 = new MiniAppBrick$SizeSource("HEIGHT", 1);
        HEIGHT = miniAppBrick$SizeSource2;
        MiniAppBrick$SizeSource[] miniAppBrick$SizeSourceArr = {miniAppBrick$SizeSource, miniAppBrick$SizeSource2};
        $VALUES = miniAppBrick$SizeSourceArr;
        $ENTRIES = kotlin.enums.a.a(miniAppBrick$SizeSourceArr);
    }

    public static MiniAppBrick$SizeSource valueOf(String str) {
        return (MiniAppBrick$SizeSource) Enum.valueOf(MiniAppBrick$SizeSource.class, str);
    }

    public static MiniAppBrick$SizeSource[] values() {
        return (MiniAppBrick$SizeSource[]) $VALUES.clone();
    }
}
