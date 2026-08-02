package com.yandex.passport.internal.ui.webview;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/passport/internal/ui/webview/WebViewDebugOverlay$ScalePreset", "", "Lcom/yandex/passport/internal/ui/webview/WebViewDebugOverlay$ScalePreset;", "", "horizontal", "F", "a", "()F", "vertical", "b", "Full", "Half", "Third", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebViewDebugOverlay$ScalePreset {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewDebugOverlay$ScalePreset[] $VALUES;
    public static final WebViewDebugOverlay$ScalePreset Full;
    public static final WebViewDebugOverlay$ScalePreset Half;
    public static final WebViewDebugOverlay$ScalePreset Third;
    private final float horizontal;
    private final float vertical;

    static {
        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset = new WebViewDebugOverlay$ScalePreset(1.0f, 1.0f, 0, "Full");
        Full = webViewDebugOverlay$ScalePreset;
        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset2 = new WebViewDebugOverlay$ScalePreset(0.5f, 0.5f, 1, "Half");
        Half = webViewDebugOverlay$ScalePreset2;
        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset3 = new WebViewDebugOverlay$ScalePreset(0.33f, 0.33f, 2, "Third");
        Third = webViewDebugOverlay$ScalePreset3;
        WebViewDebugOverlay$ScalePreset[] webViewDebugOverlay$ScalePresetArr = {webViewDebugOverlay$ScalePreset, webViewDebugOverlay$ScalePreset2, webViewDebugOverlay$ScalePreset3};
        $VALUES = webViewDebugOverlay$ScalePresetArr;
        $ENTRIES = kotlin.enums.a.a(webViewDebugOverlay$ScalePresetArr);
    }

    public WebViewDebugOverlay$ScalePreset(float f, float f2, int i, String str) {
        this.horizontal = f;
        this.vertical = f2;
    }

    public static WebViewDebugOverlay$ScalePreset valueOf(String str) {
        return (WebViewDebugOverlay$ScalePreset) Enum.valueOf(WebViewDebugOverlay$ScalePreset.class, str);
    }

    public static WebViewDebugOverlay$ScalePreset[] values() {
        return (WebViewDebugOverlay$ScalePreset[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getHorizontal() {
        return this.horizontal;
    }

    /* renamed from: b, reason: from getter */
    public final float getVertical() {
        return this.vertical;
    }
}
