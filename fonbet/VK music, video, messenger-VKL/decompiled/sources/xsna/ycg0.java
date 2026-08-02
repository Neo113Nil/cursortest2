package xsna;

import android.content.Context;
import com.vk.clips.sdk.models.SdkRestrictionButton;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vkontakte.android.R;
import xsna.eeu0;

/* compiled from: RestrictionDialogHelper.kt */
/* loaded from: classes17.dex */
public final class ycg0 {
    public final gdg0 a;

    public ycg0(gdg0 gdg0Var) {
        this.a = gdg0Var;
    }

    public final void a(Context context, SdkVideoRestriction sdkVideoRestriction) {
        SdkRestrictionButton sdkRestrictionButton = sdkVideoRestriction.i;
        if (sdkRestrictionButton == null) {
            return;
        }
        eeu0.a aVar = new eeu0.a(context);
        aVar.setTitle(sdkVideoRestriction.c);
        aVar.a.f = sdkVideoRestriction.d;
        aVar.j(sdkRestrictionButton.b, new tv(this, 1));
        aVar.setNegativeButton(R.string.clip_restriction_dialog_close, null);
        aVar.m();
    }
}
