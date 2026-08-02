package com.yandex.go.design.compose.images;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/design/compose/images/ComposeImageSource;", "", "Cache", "Remote", "const"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposeImageSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ComposeImageSource[] $VALUES;
    public static final ComposeImageSource Cache;
    public static final ComposeImageSource Remote;

    static {
        ComposeImageSource composeImageSource = new ComposeImageSource("Cache", 0);
        Cache = composeImageSource;
        ComposeImageSource composeImageSource2 = new ComposeImageSource("Remote", 1);
        Remote = composeImageSource2;
        ComposeImageSource[] composeImageSourceArr = {composeImageSource, composeImageSource2};
        $VALUES = composeImageSourceArr;
        $ENTRIES = kotlin.enums.a.a(composeImageSourceArr);
    }

    public static ComposeImageSource valueOf(String str) {
        return (ComposeImageSource) Enum.valueOf(ComposeImageSource.class, str);
    }

    public static ComposeImageSource[] values() {
        return (ComposeImageSource[]) $VALUES.clone();
    }
}
