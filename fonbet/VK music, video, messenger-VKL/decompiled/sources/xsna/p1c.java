package xsna;

import android.os.Bundle;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.checkaccess.VkCheckAccessRequiredData;
import xsna.ta6;

/* compiled from: CheckUserActionHelper.kt */
/* loaded from: classes15.dex */
public final class p1c {
    public static Bundle a(VkCheckAccessRequiredData vkCheckAccessRequiredData) {
        String str = vkCheckAccessRequiredData.d;
        if (str == null) {
            str = "";
        }
        return ta6.a.a(str, "", new CheckPresenterInfo.Validation("", false, vkCheckAccessRequiredData.b, false, 8, null), new CodeState.CheckAccess(0L, 0L, 3, null), null, null, 0, false, vkCheckAccessRequiredData.b, vkCheckAccessRequiredData.e, null, 1264);
    }
}
