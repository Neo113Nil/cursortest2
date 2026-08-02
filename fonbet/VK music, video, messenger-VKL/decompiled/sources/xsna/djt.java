package xsna;

import com.vk.superapp.api.dto.restore.VkRestoreConfirmInstantResult;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class djt extends FunctionReferenceImpl implements izs<Integer, VkRestoreConfirmInstantResult> {
    @Override // xsna.izs
    public final VkRestoreConfirmInstantResult invoke(Integer num) {
        VkRestoreConfirmInstantResult vkRestoreConfirmInstantResult;
        int intValue = num.intValue();
        ((VkRestoreConfirmInstantResult.a) this.receiver).getClass();
        VkRestoreConfirmInstantResult[] values = VkRestoreConfirmInstantResult.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                vkRestoreConfirmInstantResult = null;
                break;
            }
            vkRestoreConfirmInstantResult = values[i];
            if (intValue == vkRestoreConfirmInstantResult.h()) {
                break;
            }
            i++;
        }
        if (vkRestoreConfirmInstantResult != null) {
            return vkRestoreConfirmInstantResult;
        }
        throw new IllegalArgumentException("Unknown value for restore confirmation result");
    }
}
