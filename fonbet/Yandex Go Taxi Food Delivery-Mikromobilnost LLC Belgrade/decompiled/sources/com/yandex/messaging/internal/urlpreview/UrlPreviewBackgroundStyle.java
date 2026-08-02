package com.yandex.messaging.internal.urlpreview;

import defpackage.k4o;
import defpackage.zel0;
import defpackage.zls;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R,\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/messaging/internal/urlpreview/UrlPreviewBackgroundStyle;", "", "Lkotlin/Function3;", "", "", "patternCalculator", "Lzls;", "LowHalfCorners", "FullCornered", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewBackgroundStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UrlPreviewBackgroundStyle[] $VALUES;
    public static final UrlPreviewBackgroundStyle FullCornered;
    public static final UrlPreviewBackgroundStyle LowHalfCorners;
    private final zls patternCalculator;

    static {
        UrlPreviewBackgroundStyle urlPreviewBackgroundStyle = new UrlPreviewBackgroundStyle("LowHalfCorners", 0, new zel0(2));
        LowHalfCorners = urlPreviewBackgroundStyle;
        UrlPreviewBackgroundStyle urlPreviewBackgroundStyle2 = new UrlPreviewBackgroundStyle("FullCornered", 1, new zel0(3));
        FullCornered = urlPreviewBackgroundStyle2;
        UrlPreviewBackgroundStyle[] urlPreviewBackgroundStyleArr = {urlPreviewBackgroundStyle, urlPreviewBackgroundStyle2};
        $VALUES = urlPreviewBackgroundStyleArr;
        $ENTRIES = kotlin.enums.a.a(urlPreviewBackgroundStyleArr);
    }

    public UrlPreviewBackgroundStyle(String str, int i, zls zlsVar) {
        this.patternCalculator = zlsVar;
    }

    public static UrlPreviewBackgroundStyle valueOf(String str) {
        return (UrlPreviewBackgroundStyle) Enum.valueOf(UrlPreviewBackgroundStyle.class, str);
    }

    public static UrlPreviewBackgroundStyle[] values() {
        return (UrlPreviewBackgroundStyle[]) $VALUES.clone();
    }

    public final int[] a(boolean z, boolean z2, boolean z3) {
        return (int[]) this.patternCalculator.invoke(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }
}
