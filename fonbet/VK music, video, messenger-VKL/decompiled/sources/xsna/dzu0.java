package xsna;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.g;
import com.vk.log.L;
import java.util.HashMap;

/* compiled from: VkHostResolver.kt */
/* loaded from: classes.dex */
public abstract class dzu0 implements g.b {
    public final HashMap b = new HashMap();

    /* compiled from: VkHostResolver.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Url(host=");
            sb.append(this.a);
            sb.append(", path=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public static String b(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        int indexOf = uri.getPathSegments().indexOf(str);
        if (indexOf < 0 || indexOf > uri.getPathSegments().size() - 2) {
            return null;
        }
        return uri.getPathSegments().get(indexOf + 1);
    }

    public static boolean c(Uri uri) {
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        if (!o260Var.h().isEnabled()) {
            return false;
        }
        o260 o260Var2 = d260.a;
        return !TextUtils.isEmpty((o260Var2 != null ? o260Var2 : null).h().getHost()) && e(uri, ".mp4") == null;
    }

    public static a e(Uri uri, String str) {
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            return null;
        }
        if (!brm0.v(lastPathSegment, str, false)) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        int size = uri.getPathSegments().size() - 1;
        for (int i = 0; i < size; i++) {
            builder.appendPath(uri.getPathSegments().get(i));
        }
        return new a(host, builder.build().getEncodedPath());
    }

    public final Uri f(Uri uri, String str) {
        HashMap hashMap = this.b;
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            L.G("should not happen: restoring original host, but no host found for this key");
            str2 = (String) hashMap.values().iterator().next();
        }
        return uri.buildUpon().authority(str2).build();
    }
}
