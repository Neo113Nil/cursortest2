package xsna;

import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.ShitAttachment;

/* compiled from: AdDescriptionUiDto.kt */
/* loaded from: classes4.dex */
public final class cf0 extends ol60 implements tsx0 {
    public final String h;
    public final ej90 i;
    public final ShitAttachment j;

    public cf0(String str, ej90 ej90Var, ShitAttachment shitAttachment) {
        super(178, 0, 0, 0, null);
        this.h = str;
        this.i = ej90Var;
        this.j = shitAttachment;
    }

    @Override // xsna.tsx0
    public final DisclaimerData N3() {
        return this.j.Z;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    @Override // xsna.tsx0
    public final DisclaimerContent getContentType() {
        return this.j.d0;
    }
}
