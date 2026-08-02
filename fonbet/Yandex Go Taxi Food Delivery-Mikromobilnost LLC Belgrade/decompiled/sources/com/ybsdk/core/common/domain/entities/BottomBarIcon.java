package com.ybsdk.core.common.domain.entities;

import defpackage.k4o;
import defpackage.nb6;
import defpackage.ob6;
import defpackage.scc;
import defpackage.txg0;
import defpackage.w511;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/BottomBarIcon;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "getHistoryIcon", "()I", "getIconResId", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "nb6", "HOME", "PAY", "HISTORY", "MERCHANTS", "SHOWCASE", "SUPPORT", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BottomBarIcon {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomBarIcon[] $VALUES;
    public static final nb6 Companion;
    private static final List<Integer> HISTORY_ITEM_ICONS;
    private final String id;
    public static final BottomBarIcon HOME = new BottomBarIcon("HOME", 0, "home_icon");
    public static final BottomBarIcon PAY = new BottomBarIcon("PAY", 1, "pay_icon");
    public static final BottomBarIcon HISTORY = new BottomBarIcon("HISTORY", 2, "history_icon");
    public static final BottomBarIcon MERCHANTS = new BottomBarIcon("MERCHANTS", 3, "merchants_icon");
    public static final BottomBarIcon SHOWCASE = new BottomBarIcon("SHOWCASE", 4, "showcase_icon");
    public static final BottomBarIcon SUPPORT = new BottomBarIcon("SUPPORT", 5, "support_icon");

    private static final /* synthetic */ BottomBarIcon[] $values() {
        return new BottomBarIcon[]{HOME, PAY, HISTORY, MERCHANTS, SHOWCASE, SUPPORT};
    }

    static {
        BottomBarIcon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new nb6();
        HISTORY_ITEM_ICONS = scc.g(Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_1), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_2), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_3), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_4), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_5), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_6), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_7), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_8), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_9), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_10), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_11), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_12), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_13), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_14), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_15), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_16), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_17), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_18), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_19), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_20), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_21), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_22), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_23), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_24), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_25), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_26), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_27), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_28), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_29), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_30), Integer.valueOf(txg0.ybsdk_ic_bottom_bar_recent_day_31));
    }

    private BottomBarIcon(String str, int i, String str2) {
        this.id = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    private final int getHistoryIcon() {
        Integer num = (Integer) kotlin.collections.a.S(Calendar.getInstance().get(5) - 1, HISTORY_ITEM_ICONS);
        return num != null ? num.intValue() : txg0.ybsdk_ic_bottom_bar_recent;
    }

    public static BottomBarIcon valueOf(String str) {
        return (BottomBarIcon) Enum.valueOf(BottomBarIcon.class, str);
    }

    public static BottomBarIcon[] values() {
        return (BottomBarIcon[]) $VALUES.clone();
    }

    public final int getIconResId() {
        switch (ob6.a[ordinal()]) {
            case 1:
                return txg0.ybsdk_ic_bottom_bar_home;
            case 2:
                return txg0.ybsdk_ic_bottom_bar_qr;
            case 3:
                return txg0.ybsdk_ic_bottom_bar_merchants;
            case 4:
                return getHistoryIcon();
            case 5:
                return txg0.ybsdk_ic_bottom_bar_showcase;
            case 6:
                return txg0.ybsdk_ic_bottom_bar_support;
            default:
                w511.b();
                return 0;
        }
    }

    public final String getId() {
        return this.id;
    }
}
