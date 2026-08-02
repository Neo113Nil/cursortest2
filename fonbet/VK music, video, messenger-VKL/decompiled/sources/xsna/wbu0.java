package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;

/* compiled from: VkAuthErrorsUtils.kt */
/* loaded from: classes15.dex */
public final class wbu0 {

    /* compiled from: VkAuthErrorsUtils.kt */
    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, false), 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkError(text=");
            sb.append(this.a);
            sb.append(", isToast=false, isUnknown=");
            sb.append(this.b);
            sb.append(", shouldSkip=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(Context context, Throwable th, boolean z) {
        boolean z2 = false;
        if ((th instanceof IOException) || ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1)) {
            return new a(context.getString(R.string.vk_auth_load_network_error), false, false);
        }
        boolean z3 = true;
        if (!(th instanceof VKApiExecutionException)) {
            return new a(context.getString(R.string.vk_auth_unknown_error), true, false);
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        String u = vKApiExecutionException.u();
        if (!vKApiExecutionException.x()) {
            if (vKApiExecutionException.s() == 14) {
                u = context.getString(R.string.vk_captcha_code);
            } else if (u == null || drm0.N(u)) {
                u = context.getString(R.string.vk_auth_unknown_api_error);
                z3 = false;
                z2 = true;
            }
            String string = context.getString(R.string.vk_auth_error_code_suffix, String.valueOf(vKApiExecutionException.s()));
            if (!drm0.G(u, JwtParser.SEPARATOR_CHAR)) {
                u = u.concat(".");
            }
            if (!z) {
                u = v1v.a(' ', u, string);
            }
            return new a(u, z2, z3);
        }
        u = vKApiExecutionException.t();
        z3 = false;
        String string2 = context.getString(R.string.vk_auth_error_code_suffix, String.valueOf(vKApiExecutionException.s()));
        if (!drm0.G(u, JwtParser.SEPARATOR_CHAR)) {
        }
        if (!z) {
        }
        return new a(u, z2, z3);
    }
}
