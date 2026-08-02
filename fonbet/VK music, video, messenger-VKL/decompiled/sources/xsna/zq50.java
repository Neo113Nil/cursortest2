package xsna;

import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vkontakte.android.attachments.DisclaimerData;

/* compiled from: MyTargetInternalNativeAdDescriptionUiDto.kt */
/* loaded from: classes4.dex */
public final class zq50 extends ol60 implements tsx0 {
    public final ej90 h;
    public final MyTargetNativeAdEntry i;

    public zq50(ej90 ej90Var, MyTargetNativeAdEntry myTargetNativeAdEntry) {
        super(372, 0, 0, 0, null);
        this.h = ej90Var;
        this.i = myTargetNativeAdEntry;
    }

    @Override // xsna.tsx0
    public final DisclaimerData N3() {
        return this.i.q;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    @Override // xsna.tsx0
    public final DisclaimerContent getContentType() {
        return this.i.r;
    }
}
