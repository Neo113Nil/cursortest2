package xsna;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SbpLaunchInfo.kt */
/* loaded from: classes4.dex */
public final class a3h0 {
    public static final Intent a(q2h0 q2h0Var, Uri uri) {
        if (q2h0Var instanceof r2h0) {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri.buildUpon().scheme(((r2h0) q2h0Var).b).build());
        }
        if (!(q2h0Var instanceof s2h0)) {
            if (q2h0Var == null) {
                return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
            }
            throw new NoWhenBranchMatchedException();
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
        s2h0 s2h0Var = (s2h0) q2h0Var;
        intent.setComponent(ComponentName.createRelative(s2h0Var.a, s2h0Var.b));
        return intent;
    }
}
