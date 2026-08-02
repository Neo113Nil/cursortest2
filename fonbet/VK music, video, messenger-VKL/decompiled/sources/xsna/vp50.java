package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import java.util.Collections;

/* compiled from: MyTargetExt.kt */
/* loaded from: classes17.dex */
public final class vp50 {
    public static final SdkImages a(ehx ehxVar) {
        return new SdkImages(Collections.singletonList(new ImageUrl(ehxVar.getUrl(), Math.max(ehxVar.getWidth(), ehxVar.getHeight()), false, 4, null)), null, 2, null);
    }
}
