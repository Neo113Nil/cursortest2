package com.ybsdk.screens.divbottomsheet;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/screens/divbottomsheet/TargetType;", "", "", "target", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "QR_CREDLIM_PAYMENT_TERM", "CUSTOM", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TargetType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TargetType[] $VALUES;
    public static final TargetType CUSTOM;
    public static final TargetType QR_CREDLIM_PAYMENT_TERM;
    private final String target;

    static {
        TargetType targetType = new TargetType("QR_CREDLIM_PAYMENT_TERM", 0, "qr_payment_term");
        QR_CREDLIM_PAYMENT_TERM = targetType;
        TargetType targetType2 = new TargetType("CUSTOM", 1, null);
        CUSTOM = targetType2;
        TargetType[] targetTypeArr = {targetType, targetType2};
        $VALUES = targetTypeArr;
        $ENTRIES = kotlin.enums.a.a(targetTypeArr);
    }

    public TargetType(String str, int i, String str2) {
        this.target = str2;
    }

    public static TargetType valueOf(String str) {
        return (TargetType) Enum.valueOf(TargetType.class, str);
    }

    public static TargetType[] values() {
        return (TargetType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTarget() {
        return this.target;
    }
}
