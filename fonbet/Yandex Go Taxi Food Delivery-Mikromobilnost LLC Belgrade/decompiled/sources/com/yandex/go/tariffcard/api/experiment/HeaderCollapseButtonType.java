package com.yandex.go.tariffcard.api.experiment;

import defpackage.gmt;
import defpackage.gsq0;
import defpackage.h9u;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/tariffcard/api/experiment/HeaderCollapseButtonType;", "", "Companion", "h9u", "CROSS", "BACK_ARROW", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HeaderCollapseButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HeaderCollapseButtonType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final HeaderCollapseButtonType BACK_ARROW;
    public static final HeaderCollapseButtonType CROSS;
    public static final h9u Companion;

    static {
        HeaderCollapseButtonType headerCollapseButtonType = new HeaderCollapseButtonType("CROSS", 0);
        CROSS = headerCollapseButtonType;
        HeaderCollapseButtonType headerCollapseButtonType2 = new HeaderCollapseButtonType("BACK_ARROW", 1);
        BACK_ARROW = headerCollapseButtonType2;
        HeaderCollapseButtonType[] headerCollapseButtonTypeArr = {headerCollapseButtonType, headerCollapseButtonType2};
        $VALUES = headerCollapseButtonTypeArr;
        $ENTRIES = kotlin.enums.a.a(headerCollapseButtonTypeArr);
        Companion = new h9u();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gmt(22));
    }

    public static HeaderCollapseButtonType valueOf(String str) {
        return (HeaderCollapseButtonType) Enum.valueOf(HeaderCollapseButtonType.class, str);
    }

    public static HeaderCollapseButtonType[] values() {
        return (HeaderCollapseButtonType[]) $VALUES.clone();
    }
}
