package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import xsna.mgn0;
import xsna.y390;

/* compiled from: WebAppCore.kt */
/* loaded from: classes11.dex */
public final class iex0 implements mgn0.e {
    @Override // xsna.mgn0.e
    public final boolean a(String str) {
        if (drm0.N(str)) {
            return false;
        }
        dsw<UserId, v390> dswVar = y390.a;
        return y390.a.a().d(str);
    }

    @Override // xsna.mgn0.e
    public final String b(String str, boolean z) {
        dsw<UserId, v390> dswVar = y390.a;
        v390 a = y390.a.a();
        if (!z || !epx.f(Uri.parse(str).getAuthority(), "static.".concat(a0a.d))) {
            return v390.b(str, a.c(a.d));
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        o2l.a.getClass();
        return buildUpon.authority(v390.b(o2l.c("vkUiHostUri", "static.".concat(a0a.d)), a.c(a.d))).build().toString();
    }
}
