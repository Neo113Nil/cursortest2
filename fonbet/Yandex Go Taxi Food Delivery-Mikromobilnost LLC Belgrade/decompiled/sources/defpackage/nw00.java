package defpackage;

import android.net.Uri;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class nw00 {
    public static DeeplinkAction.MarkEventAsRead a(Uri uri) {
        String o;
        String o2 = bzk0.o(uri, SdkUri$QueryParam.EVENT_ID);
        if (o2 == null || (o = bzk0.o(uri, SdkUri$QueryParam.ACTION_ID)) == null) {
            return null;
        }
        return new DeeplinkAction.MarkEventAsRead(o2, o);
    }
}
