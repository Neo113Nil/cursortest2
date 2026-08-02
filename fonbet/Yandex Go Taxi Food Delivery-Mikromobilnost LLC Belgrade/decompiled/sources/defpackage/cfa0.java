package defpackage;

import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class cfa0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddSbpTokenButtonDto.StateType.values().length];
        try {
            iArr[AddSbpTokenButtonDto.StateType.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddSbpTokenButtonDto.StateType.BUSY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddSbpTokenButtonDto.StateType.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
