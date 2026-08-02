package com.yandex.mob.reporting;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/mob/reporting/MobTrigger;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Periodic", "CountryUpdate", "Notification", "RequestRetry", "PendingTrigger", "AddToConfig", "CountryMismatch", "ResumeAfterNotComplete", "VpnChanged", "NetworkTypeChanged", "ContourChanged", "Migration", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobTrigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobTrigger[] $VALUES;
    public static final MobTrigger AddToConfig;
    public static final MobTrigger ContourChanged;
    public static final MobTrigger CountryMismatch;
    public static final MobTrigger CountryUpdate;
    public static final MobTrigger Migration;
    public static final MobTrigger NetworkTypeChanged;
    public static final MobTrigger Notification;
    public static final MobTrigger PendingTrigger;
    public static final MobTrigger Periodic;
    public static final MobTrigger RequestRetry;
    public static final MobTrigger ResumeAfterNotComplete;
    public static final MobTrigger VpnChanged;
    private final String value;

    static {
        MobTrigger mobTrigger = new MobTrigger("Periodic", 0, "periodic");
        Periodic = mobTrigger;
        MobTrigger mobTrigger2 = new MobTrigger("CountryUpdate", 1, "countryUpdate");
        CountryUpdate = mobTrigger2;
        MobTrigger mobTrigger3 = new MobTrigger("Notification", 2, "notification");
        Notification = mobTrigger3;
        MobTrigger mobTrigger4 = new MobTrigger("RequestRetry", 3, "requestRetry");
        RequestRetry = mobTrigger4;
        MobTrigger mobTrigger5 = new MobTrigger("PendingTrigger", 4, "pendingTrigger");
        PendingTrigger = mobTrigger5;
        MobTrigger mobTrigger6 = new MobTrigger("AddToConfig", 5, "addToConfigAction");
        AddToConfig = mobTrigger6;
        MobTrigger mobTrigger7 = new MobTrigger("CountryMismatch", 6, "countryMismatch");
        CountryMismatch = mobTrigger7;
        MobTrigger mobTrigger8 = new MobTrigger("ResumeAfterNotComplete", 7, "resumeAfterNotComplete");
        ResumeAfterNotComplete = mobTrigger8;
        MobTrigger mobTrigger9 = new MobTrigger("VpnChanged", 8, "vpnChanged");
        VpnChanged = mobTrigger9;
        MobTrigger mobTrigger10 = new MobTrigger("NetworkTypeChanged", 9, "networkTypeChanged");
        NetworkTypeChanged = mobTrigger10;
        MobTrigger mobTrigger11 = new MobTrigger("ContourChanged", 10, "contourChanged");
        ContourChanged = mobTrigger11;
        MobTrigger mobTrigger12 = new MobTrigger("Migration", 11, "migration");
        Migration = mobTrigger12;
        MobTrigger[] mobTriggerArr = {mobTrigger, mobTrigger2, mobTrigger3, mobTrigger4, mobTrigger5, mobTrigger6, mobTrigger7, mobTrigger8, mobTrigger9, mobTrigger10, mobTrigger11, mobTrigger12};
        $VALUES = mobTriggerArr;
        $ENTRIES = kotlin.enums.a.a(mobTriggerArr);
    }

    public MobTrigger(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobTrigger valueOf(String str) {
        return (MobTrigger) Enum.valueOf(MobTrigger.class, str);
    }

    public static MobTrigger[] values() {
        return (MobTrigger[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
