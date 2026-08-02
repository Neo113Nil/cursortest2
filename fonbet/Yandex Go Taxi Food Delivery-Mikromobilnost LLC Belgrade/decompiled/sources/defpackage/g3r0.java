package defpackage;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.actions.SetHeaderClickable;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class g3r0 {
    public static SetHeaderClickable a(Uri uri) {
        return new SetHeaderClickable(uri, bzk0.i(uri, SdkUri$QueryParam.IS_CLICKABLE, true));
    }
}
