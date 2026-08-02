package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.adjust.sdk.Constants;

/* loaded from: classes10.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean b() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && Build.DEVICE.equalsIgnoreCase("m55xq");
    }
}
