package defpackage;

import com.yandex.go.scooters.passes.ScootersPassesScreenRoute$Intention;
import com.yandex.go.scooters.passes.ScootersPassesScreenRoute$PassType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ceo0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersPassesScreenRoute$Intention.values().length];
        try {
            iArr[ScootersPassesScreenRoute$Intention.PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPassesScreenRoute$Intention.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersPassesScreenRoute$Intention.ACTIVE_RENEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersPassesScreenRoute$PassType.values().length];
        try {
            iArr2[ScootersPassesScreenRoute$PassType.PACKAGES.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScootersPassesScreenRoute$PassType.SUPERPASSES.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
