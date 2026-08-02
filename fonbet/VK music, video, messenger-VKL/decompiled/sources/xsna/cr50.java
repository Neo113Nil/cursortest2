package xsna;

import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vkontakte.android.attachments.DisclaimerData;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: MyTargetInternalNativeAdDisclaimerUiDto.kt */
/* loaded from: classes4.dex */
public final class cr50 extends ol60 implements tsx0 {
    public final String h;
    public final MyTargetNativeAdEntry i;

    public cr50(MyTargetNativeAdEntry myTargetNativeAdEntry, String str) {
        super(ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION, 0, 0, 0, null);
        this.h = str;
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
