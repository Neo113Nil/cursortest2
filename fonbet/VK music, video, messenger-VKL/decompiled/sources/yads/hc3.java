package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* loaded from: classes10.dex */
public final class hc3 {
    public final gc3 a;

    public hc3() {
        this(new gc3());
    }

    public final boolean a(Context context, String str) {
        try {
            this.a.getClass();
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public hc3(gc3 gc3Var) {
        this.a = gc3Var;
    }
}
