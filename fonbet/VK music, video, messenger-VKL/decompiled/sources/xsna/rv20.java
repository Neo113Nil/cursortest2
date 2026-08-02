package xsna;

import com.vk.superapp.api.dto.qr.ModalAuthFlowType;

/* compiled from: ModalAuthFragmentFactory.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class rv20 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ModalAuthFlowType.values().length];
        try {
            iArr[ModalAuthFlowType.QrAuthFlow.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalAuthFlowType.TvCodeAuthFlow.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ModalAuthFlowType.MvkAuthFlow.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
