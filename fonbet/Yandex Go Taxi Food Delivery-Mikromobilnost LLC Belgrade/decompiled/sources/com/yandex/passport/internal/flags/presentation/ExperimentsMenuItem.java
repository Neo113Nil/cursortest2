package com.yandex.passport.internal.flags.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/flags/presentation/ExperimentsMenuItem;", "", "OnClearNetworkCache", "OnClearOverrides", "OnUpdateNetworkCache", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExperimentsMenuItem {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExperimentsMenuItem[] $VALUES;
    public static final ExperimentsMenuItem OnClearNetworkCache;
    public static final ExperimentsMenuItem OnClearOverrides;
    public static final ExperimentsMenuItem OnUpdateNetworkCache;

    static {
        ExperimentsMenuItem experimentsMenuItem = new ExperimentsMenuItem("OnClearNetworkCache", 0);
        OnClearNetworkCache = experimentsMenuItem;
        ExperimentsMenuItem experimentsMenuItem2 = new ExperimentsMenuItem("OnClearOverrides", 1);
        OnClearOverrides = experimentsMenuItem2;
        ExperimentsMenuItem experimentsMenuItem3 = new ExperimentsMenuItem("OnUpdateNetworkCache", 2);
        OnUpdateNetworkCache = experimentsMenuItem3;
        ExperimentsMenuItem[] experimentsMenuItemArr = {experimentsMenuItem, experimentsMenuItem2, experimentsMenuItem3};
        $VALUES = experimentsMenuItemArr;
        $ENTRIES = kotlin.enums.a.a(experimentsMenuItemArr);
    }

    public static ExperimentsMenuItem valueOf(String str) {
        return (ExperimentsMenuItem) Enum.valueOf(ExperimentsMenuItem.class, str);
    }

    public static ExperimentsMenuItem[] values() {
        return (ExperimentsMenuItem[]) $VALUES.clone();
    }
}
