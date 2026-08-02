package defpackage;

import com.yandex.go.taxi.order.models.api.cancel.ButtonsArrangementDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class jjw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonsArrangementDto.values().length];
        try {
            iArr[ButtonsArrangementDto.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonsArrangementDto.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
