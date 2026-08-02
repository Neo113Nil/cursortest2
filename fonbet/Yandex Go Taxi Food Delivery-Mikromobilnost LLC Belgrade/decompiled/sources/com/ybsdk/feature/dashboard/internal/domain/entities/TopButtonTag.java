package com.ybsdk.feature.dashboard.internal.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/domain/entities/TopButtonTag;", "", "<init>", "(Ljava/lang/String;I)V", "SUPPORT_URL", "PROFILE", "UNKNOWN", "QR", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopButtonTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TopButtonTag[] $VALUES;
    public static final TopButtonTag SUPPORT_URL = new TopButtonTag("SUPPORT_URL", 0);
    public static final TopButtonTag PROFILE = new TopButtonTag("PROFILE", 1);
    public static final TopButtonTag UNKNOWN = new TopButtonTag("UNKNOWN", 2);
    public static final TopButtonTag QR = new TopButtonTag("QR", 3);

    private static final /* synthetic */ TopButtonTag[] $values() {
        return new TopButtonTag[]{SUPPORT_URL, PROFILE, UNKNOWN, QR};
    }

    static {
        TopButtonTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TopButtonTag(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TopButtonTag valueOf(String str) {
        return (TopButtonTag) Enum.valueOf(TopButtonTag.class, str);
    }

    public static TopButtonTag[] values() {
        return (TopButtonTag[]) $VALUES.clone();
    }
}
