package xsna;

import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.dto.common.clips.CoOwnerItem;

/* compiled from: CoOwnerItemAdapter.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class jyf {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[CoOwnerItem.StatusDto.values().length];
        try {
            iArr[CoOwnerItem.StatusDto.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoOwnerItem.StatusDto.APPROVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SdkCoOwnerItem.Status.values().length];
        try {
            iArr2[SdkCoOwnerItem.Status.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SdkCoOwnerItem.Status.APPROVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
