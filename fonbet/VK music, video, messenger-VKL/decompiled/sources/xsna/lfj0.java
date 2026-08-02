package xsna;

import com.vk.clips.sdk.shared.api.deps.dtos.SdkGood;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.ArrayList;

/* compiled from: ShopsMorePositionConfig.kt */
/* loaded from: classes17.dex */
public final class lfj0 {
    public final boolean a;
    public final boolean b;

    public lfj0(ClipFeedTab clipFeedTab, yof yofVar, SdkClipVideoFile sdkClipVideoFile) {
        ArrayList arrayList;
        ArrayList K3 = sdkClipVideoFile.K3();
        if (K3 != null) {
            arrayList = new ArrayList();
            for (Object obj : K3) {
                if (!((SdkGood) obj).P3()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        boolean z = false;
        boolean z2 = (clipFeedTab.Db() || (arrayList == null || arrayList.isEmpty()) || !yofVar.W().a) ? false : true;
        this.a = z2;
        if (z2 && yofVar.L().a) {
            z = true;
        }
        this.b = z;
    }
}
