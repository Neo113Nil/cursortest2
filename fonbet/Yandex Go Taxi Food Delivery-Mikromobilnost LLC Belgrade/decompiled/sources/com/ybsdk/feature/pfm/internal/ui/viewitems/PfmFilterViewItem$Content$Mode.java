package com.ybsdk.feature.pfm.internal.ui.viewitems;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/pfm/internal/ui/viewitems/PfmFilterViewItem$Content$Mode", "", "Lcom/ybsdk/feature/pfm/internal/ui/viewitems/PfmFilterViewItem$Content$Mode;", "<init>", "(Ljava/lang/String;I)V", "IDLE", "SELECTABLE", "RESETTABLE", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmFilterViewItem$Content$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PfmFilterViewItem$Content$Mode[] $VALUES;
    public static final PfmFilterViewItem$Content$Mode IDLE = new PfmFilterViewItem$Content$Mode("IDLE", 0);
    public static final PfmFilterViewItem$Content$Mode SELECTABLE = new PfmFilterViewItem$Content$Mode("SELECTABLE", 1);
    public static final PfmFilterViewItem$Content$Mode RESETTABLE = new PfmFilterViewItem$Content$Mode("RESETTABLE", 2);

    private static final /* synthetic */ PfmFilterViewItem$Content$Mode[] $values() {
        return new PfmFilterViewItem$Content$Mode[]{IDLE, SELECTABLE, RESETTABLE};
    }

    static {
        PfmFilterViewItem$Content$Mode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PfmFilterViewItem$Content$Mode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PfmFilterViewItem$Content$Mode valueOf(String str) {
        return (PfmFilterViewItem$Content$Mode) Enum.valueOf(PfmFilterViewItem$Content$Mode.class, str);
    }

    public static PfmFilterViewItem$Content$Mode[] values() {
        return (PfmFilterViewItem$Content$Mode[]) $VALUES.clone();
    }
}
