package com.yandex.mob.api.model;

import defpackage.gsq0;
import defpackage.hq20;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.um20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/mob/api/model/MobPingPolicy;", "", "Companion", "hq20", "Default", "NoAuto", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobPingPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobPingPolicy[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final hq20 Companion;
    public static final MobPingPolicy Default;
    public static final MobPingPolicy NoAuto;

    static {
        MobPingPolicy mobPingPolicy = new MobPingPolicy("Default", 0);
        Default = mobPingPolicy;
        MobPingPolicy mobPingPolicy2 = new MobPingPolicy("NoAuto", 1);
        NoAuto = mobPingPolicy2;
        MobPingPolicy[] mobPingPolicyArr = {mobPingPolicy, mobPingPolicy2};
        $VALUES = mobPingPolicyArr;
        $ENTRIES = a.a(mobPingPolicyArr);
        Companion = new hq20();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(5));
    }

    public static MobPingPolicy valueOf(String str) {
        return (MobPingPolicy) Enum.valueOf(MobPingPolicy.class, str);
    }

    public static MobPingPolicy[] values() {
        return (MobPingPolicy[]) $VALUES.clone();
    }
}
