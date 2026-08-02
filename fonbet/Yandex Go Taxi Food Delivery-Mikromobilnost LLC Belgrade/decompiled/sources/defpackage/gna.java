package defpackage;

import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gna {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersOfferButtonDto.Action.values().length];
        try {
            iArr[ChargersOfferButtonDto.Action.RETURN_CHARGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
