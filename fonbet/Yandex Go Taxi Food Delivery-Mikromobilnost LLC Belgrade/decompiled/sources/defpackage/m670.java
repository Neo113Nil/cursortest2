package defpackage;

import android.net.Uri;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class m670 {
    public static DeeplinkAction.OpenOnce a(Uri uri) {
        String o;
        String o2 = bzk0.o(uri, SdkUri$QueryParam.ID);
        if (o2 == null || (o = bzk0.o(uri, SdkUri$QueryParam.ONCE_URL)) == null) {
            return null;
        }
        return new DeeplinkAction.OpenOnce(o2, o, bzk0.o(uri, SdkUri$QueryParam.NEXT_URL));
    }
}
