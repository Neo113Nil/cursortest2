package com.yandex.mob.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/mob/data/MobVpnChangeTracker$VpnState", "", "Lcom/yandex/mob/data/MobVpnChangeTracker$VpnState;", "On", "Off", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MobVpnChangeTracker$VpnState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobVpnChangeTracker$VpnState[] $VALUES;
    public static final MobVpnChangeTracker$VpnState Off;
    public static final MobVpnChangeTracker$VpnState On;

    static {
        MobVpnChangeTracker$VpnState mobVpnChangeTracker$VpnState = new MobVpnChangeTracker$VpnState("On", 0);
        On = mobVpnChangeTracker$VpnState;
        MobVpnChangeTracker$VpnState mobVpnChangeTracker$VpnState2 = new MobVpnChangeTracker$VpnState("Off", 1);
        Off = mobVpnChangeTracker$VpnState2;
        MobVpnChangeTracker$VpnState[] mobVpnChangeTracker$VpnStateArr = {mobVpnChangeTracker$VpnState, mobVpnChangeTracker$VpnState2};
        $VALUES = mobVpnChangeTracker$VpnStateArr;
        $ENTRIES = kotlin.enums.a.a(mobVpnChangeTracker$VpnStateArr);
    }

    public static MobVpnChangeTracker$VpnState valueOf(String str) {
        return (MobVpnChangeTracker$VpnState) Enum.valueOf(MobVpnChangeTracker$VpnState.class, str);
    }

    public static MobVpnChangeTracker$VpnState[] values() {
        return (MobVpnChangeTracker$VpnState[]) $VALUES.clone();
    }
}
