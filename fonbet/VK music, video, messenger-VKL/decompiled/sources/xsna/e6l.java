package xsna;

import com.vk.debug.design.MockType;
import com.vk.debug.internal.ApiResponseMocks;

/* compiled from: DebugMockApiResponsesFragment.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class e6l {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ApiResponseMocks.Mock.Type.values().length];
        try {
            iArr[ApiResponseMocks.Mock.Type.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApiResponseMocks.Mock.Type.FILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[MockType.values().length];
        try {
            iArr2[MockType.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MockType.FILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
