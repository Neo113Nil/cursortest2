package com.ybsdk.core.utils.ext;

import android.R;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/utils/ext/ViewState;", "", "attrRes", "", "<init>", "(Ljava/lang/String;II)V", "getAttrRes", "()I", "PRESSED", "UNPRESSED", "FOCUSED", "UNFOCUSED", "SELECTED", "UNSELECTED", "ENABLED", "DISABLED", "ACTIVATED", "UNACTIVATED", "CHECKED", "UNCHECKED", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ViewState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ViewState[] $VALUES;
    private final int attrRes;
    public static final ViewState PRESSED = new ViewState("PRESSED", 0, R.attr.state_pressed);
    public static final ViewState UNPRESSED = new ViewState("UNPRESSED", 1, -16842919);
    public static final ViewState FOCUSED = new ViewState("FOCUSED", 2, R.attr.state_focused);
    public static final ViewState UNFOCUSED = new ViewState("UNFOCUSED", 3, -16842908);
    public static final ViewState SELECTED = new ViewState("SELECTED", 4, R.attr.state_selected);
    public static final ViewState UNSELECTED = new ViewState("UNSELECTED", 5, -16842913);
    public static final ViewState ENABLED = new ViewState("ENABLED", 6, R.attr.state_enabled);
    public static final ViewState DISABLED = new ViewState("DISABLED", 7, -16842910);
    public static final ViewState ACTIVATED = new ViewState("ACTIVATED", 8, R.attr.state_activated);
    public static final ViewState UNACTIVATED = new ViewState("UNACTIVATED", 9, -16843518);
    public static final ViewState CHECKED = new ViewState("CHECKED", 10, R.attr.state_checked);
    public static final ViewState UNCHECKED = new ViewState("UNCHECKED", 11, -16842912);

    private static final /* synthetic */ ViewState[] $values() {
        return new ViewState[]{PRESSED, UNPRESSED, FOCUSED, UNFOCUSED, SELECTED, UNSELECTED, ENABLED, DISABLED, ACTIVATED, UNACTIVATED, CHECKED, UNCHECKED};
    }

    static {
        ViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ViewState(String str, int i, int i2) {
        this.attrRes = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ViewState valueOf(String str) {
        return (ViewState) Enum.valueOf(ViewState.class, str);
    }

    public static ViewState[] values() {
        return (ViewState[]) $VALUES.clone();
    }

    public final int getAttrRes() {
        return this.attrRes;
    }
}
