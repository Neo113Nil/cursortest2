package com.yandex.go.preorder.navigation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/preorder/navigation/ModalsVisibility;", "", "SHOW", "HIDE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalsVisibility {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalsVisibility[] $VALUES;
    public static final ModalsVisibility HIDE;
    public static final ModalsVisibility SHOW;

    static {
        ModalsVisibility modalsVisibility = new ModalsVisibility("SHOW", 0);
        SHOW = modalsVisibility;
        ModalsVisibility modalsVisibility2 = new ModalsVisibility("HIDE", 1);
        HIDE = modalsVisibility2;
        ModalsVisibility[] modalsVisibilityArr = {modalsVisibility, modalsVisibility2};
        $VALUES = modalsVisibilityArr;
        $ENTRIES = kotlin.enums.a.a(modalsVisibilityArr);
    }

    public static ModalsVisibility valueOf(String str) {
        return (ModalsVisibility) Enum.valueOf(ModalsVisibility.class, str);
    }

    public static ModalsVisibility[] values() {
        return (ModalsVisibility[]) $VALUES.clone();
    }
}
