package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vkontakte.android.LinkRedirActivity;

/* compiled from: DeferredDeeplinkProcessor.kt */
/* loaded from: classes17.dex */
public final class bsl implements csl {
    @Override // xsna.csl
    public final boolean a(Context context, String str) {
        String str2 = xwk.d().g().c(context, str).b;
        if (str2.length() == 0) {
            return false;
        }
        uc00.d = null;
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2));
        intent.setComponent(new ComponentName(context, (Class<?>) LinkRedirActivity.class));
        intent.addFlags(268435456);
        intent.putExtra("no_browser", true);
        context.startActivity(intent);
        return true;
    }
}
