package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.vkontakte.android.R;

/* compiled from: LinkUtils.kt */
@ozl
/* loaded from: classes17.dex */
public final class gbz {
    public static boolean a(Context context, String str) {
        if (!brm0.B(str, "tel:", false)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!epx.f(parse.getScheme(), "tel")) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.DIAL", parse);
        if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony") || intent.resolveActivity(context.getPackageManager()) == null) {
            Toast.makeText(context, R.string.tel_link_cant_be_opened, 0).show();
            return true;
        }
        context.startActivity(intent);
        return true;
    }
}
