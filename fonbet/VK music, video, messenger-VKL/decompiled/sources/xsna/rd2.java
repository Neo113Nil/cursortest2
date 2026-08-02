package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.jsonwebtoken.JwtParser;

/* compiled from: AndroidUriHandler.android.kt */
/* loaded from: classes11.dex */
public final class rd2 implements keq0 {
    public final Context a;

    public rd2(Context context) {
        this.a = context;
    }

    @Override // xsna.keq0
    public final void a(String str) {
        try {
            this.a.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(air.b(JwtParser.SEPARATOR_CHAR, "Can't open ", str), e);
        }
    }
}
