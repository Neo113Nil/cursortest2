package defpackage;

import com.yandex.plus.core.graphql.type.UPSALE_STEP_VIEW;
import com.yandex.plus.core.graphql.type.UPSALE_TYPE_VIEW;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class hm0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[UPSALE_STEP_VIEW.values().length];
        try {
            iArr[UPSALE_STEP_VIEW.CHECKOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UPSALE_STEP_VIEW.UPSALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UPSALE_STEP_VIEW.PRESALE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UPSALE_STEP_VIEW.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[UPSALE_TYPE_VIEW.values().length];
        try {
            iArr2[UPSALE_TYPE_VIEW.ADDITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[UPSALE_TYPE_VIEW.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[UPSALE_TYPE_VIEW.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[UpsaleStep.values().length];
        try {
            iArr3[UpsaleStep.CHECKOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[UpsaleStep.UPSALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[UpsaleStep.PRESALE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
