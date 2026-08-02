package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.newtab;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/newtab/NewTabPolicy;", "", "Disabled", "ExternalBrowser", "CustomTabs", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NewTabPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NewTabPolicy[] $VALUES;
    public static final NewTabPolicy CustomTabs;
    public static final NewTabPolicy Disabled;
    public static final NewTabPolicy ExternalBrowser;

    static {
        NewTabPolicy newTabPolicy = new NewTabPolicy("Disabled", 0);
        Disabled = newTabPolicy;
        NewTabPolicy newTabPolicy2 = new NewTabPolicy("ExternalBrowser", 1);
        ExternalBrowser = newTabPolicy2;
        NewTabPolicy newTabPolicy3 = new NewTabPolicy("CustomTabs", 2);
        CustomTabs = newTabPolicy3;
        NewTabPolicy[] newTabPolicyArr = {newTabPolicy, newTabPolicy2, newTabPolicy3};
        $VALUES = newTabPolicyArr;
        $ENTRIES = a.a(newTabPolicyArr);
    }

    public static NewTabPolicy valueOf(String str) {
        return (NewTabPolicy) Enum.valueOf(NewTabPolicy.class, str);
    }

    public static NewTabPolicy[] values() {
        return (NewTabPolicy[]) $VALUES.clone();
    }
}
