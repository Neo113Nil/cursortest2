package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vkontakte.android.attachments.GeoAttachment;

/* compiled from: MapRouterImpl.kt */
/* loaded from: classes4.dex */
public final class zl00 {
    public static void a(Context context, double d, double d2) {
        try {
            context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("geo:" + d + ',' + d2 + "?z=18&q=" + d + ',' + d2)));
        } catch (Throwable unused) {
            tn00.a(d3r0.a(context));
        }
    }

    public static void b(Context context, GeoAttachment geoAttachment) {
        if (geoAttachment.k > 0) {
            new GeoPostsFragment.a(geoAttachment.k).k(context);
        } else {
            a(context, geoAttachment.f, geoAttachment.g);
        }
    }
}
