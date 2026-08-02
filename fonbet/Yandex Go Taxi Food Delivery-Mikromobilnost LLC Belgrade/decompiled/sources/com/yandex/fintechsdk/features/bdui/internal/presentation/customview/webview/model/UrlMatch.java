package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model;

import defpackage.fh21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z121;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/model/UrlMatch;", "", "Companion", "fh21", "CONTAINING", "EXACT", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UrlMatch {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UrlMatch[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final UrlMatch CONTAINING;
    public static final fh21 Companion;
    public static final UrlMatch EXACT;

    static {
        UrlMatch urlMatch = new UrlMatch("CONTAINING", 0);
        CONTAINING = urlMatch;
        UrlMatch urlMatch2 = new UrlMatch("EXACT", 1);
        EXACT = urlMatch2;
        UrlMatch[] urlMatchArr = {urlMatch, urlMatch2};
        $VALUES = urlMatchArr;
        $ENTRIES = a.a(urlMatchArr);
        Companion = new fh21();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(22));
    }

    public static UrlMatch valueOf(String str) {
        return (UrlMatch) Enum.valueOf(UrlMatch.class, str);
    }

    public static UrlMatch[] values() {
        return (UrlMatch[]) $VALUES.clone();
    }
}
