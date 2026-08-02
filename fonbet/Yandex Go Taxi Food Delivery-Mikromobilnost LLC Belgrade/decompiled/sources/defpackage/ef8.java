package defpackage;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ef8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbCardStatusEntity.values().length];
        try {
            iArr[YbCardStatusEntity.FROZEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbCardStatusEntity.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YbCardStatusEntity.REISSUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[YbCardStatusEntity.DELETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[YbCardStatusEntity.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[YbCardStatusEntity.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
