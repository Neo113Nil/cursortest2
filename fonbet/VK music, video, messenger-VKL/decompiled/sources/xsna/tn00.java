package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.device.Vendor;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: MapsUtils.java */
/* loaded from: classes3.dex */
public final class tn00 {
    public static void a(final Activity activity) {
        if ((dy2.i("com.google.android.apps.maps") && pmr0.a(activity)) || pmr0.b(activity)) {
            return;
        }
        boolean a = Vendor.AMAZON.a(false);
        Vendor vendor = Vendor.HUAWEI;
        vendor.getClass();
        boolean a2 = vendor.a(true);
        h7u0.a aVar = new h7u0.a(activity);
        aVar.g0(R.string.maps_not_available);
        aVar.U((a || a2) ? R.string.sync_not_supported : R.string.maps_not_available_descr);
        aVar.W(R.string.close, null);
        if (!a && !a2) {
            aVar.setPositiveButton(R.string.open_google_play, new DialogInterface.OnClickListener() { // from class: xsna.sn00
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
                    intent.addFlags(268435456);
                    activity.startActivity(intent);
                }
            });
        } else if (a2) {
            aVar.setPositiveButton(R.string.open_huawei_app_gallery, new hbh(activity, 1));
        }
        aVar.create().show();
    }
}
