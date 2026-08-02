package defpackage;

import ru.yandex.logistics.sdk.cargo_form.core.api.models.ScaleType;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.SlotLeadModel$LeadIcon$IconStyle;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.SlotModel$Size;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class hv8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ScaleType.values().length];
        try {
            iArr[ScaleType.ASPECT_FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScaleType.SCALE_TO_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScaleType.ASPECT_FIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScaleType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SlotModel$Size.values().length];
        try {
            iArr2[SlotModel$Size.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SlotModel$Size.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SlotModel$Size.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SlotModel$Size.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SlotModel$Size.XL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SlotModel$Size.XXL.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[SlotLeadModel$LeadIcon$IconStyle.values().length];
        try {
            iArr3[SlotLeadModel$LeadIcon$IconStyle.ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[SlotLeadModel$LeadIcon$IconStyle.PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[SlotLeadModel$LeadIcon$IconStyle.BRAND.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[SlotLeadModel$LeadIcon$IconStyle.BRANDXS.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[SlotLeadModel$LeadIcon$IconStyle.USERPIC.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[SlotLeadModel$LeadIcon$IconStyle.SERVICE.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[SlotLeadModel$LeadIcon$IconStyle.IMAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr3;
    }
}
