package com.ybsdk.feature.deeplink.api.actions;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSetupAction;", "", "enables", "", "opensEditor", "<init>", "(Ljava/lang/String;IZZ)V", "getEnables", "()Z", "getOpensEditor", "ENABLE", "EDIT", "ENABLE_AND_EDIT", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSetupAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupSetupAction[] $VALUES;
    private final boolean enables;
    private final boolean opensEditor;
    public static final AutoTopupSetupAction ENABLE = new AutoTopupSetupAction("ENABLE", 0, true, false);
    public static final AutoTopupSetupAction EDIT = new AutoTopupSetupAction("EDIT", 1, false, true);
    public static final AutoTopupSetupAction ENABLE_AND_EDIT = new AutoTopupSetupAction("ENABLE_AND_EDIT", 2, true, true);

    private static final /* synthetic */ AutoTopupSetupAction[] $values() {
        return new AutoTopupSetupAction[]{ENABLE, EDIT, ENABLE_AND_EDIT};
    }

    static {
        AutoTopupSetupAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupSetupAction(String str, int i, boolean z, boolean z2) {
        this.enables = z;
        this.opensEditor = z2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupSetupAction valueOf(String str) {
        return (AutoTopupSetupAction) Enum.valueOf(AutoTopupSetupAction.class, str);
    }

    public static AutoTopupSetupAction[] values() {
        return (AutoTopupSetupAction[]) $VALUES.clone();
    }

    public final boolean getEnables() {
        return this.enables;
    }

    public final boolean getOpensEditor() {
        return this.opensEditor;
    }
}
