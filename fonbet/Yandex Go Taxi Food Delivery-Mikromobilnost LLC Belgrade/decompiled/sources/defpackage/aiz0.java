package defpackage;

import com.yandex.go.taxi.order.models.api.objects.TipsType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class aiz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TipsType.values().length];
        try {
            iArr[TipsType.PERCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TipsType.FLAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
