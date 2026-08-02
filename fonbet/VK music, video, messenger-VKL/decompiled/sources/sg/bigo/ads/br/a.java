package sg.bigo.ads.br;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.URL;
import ru.ok.android.commons.http.Http;
import xsna.y57;
import xsna.zr;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: sg.bigo.ads.br.a$a, reason: collision with other inner class name */
    public static class C2444a {

        @Nullable
        public final URL a;

        @Nullable
        public final String b;
        public final int c;

        @NonNull
        public final String d;
        public final int e;

        public C2444a(@Nullable URL url, @Nullable String str, int i, @NonNull String str2, int i2) {
            this.a = url;
            this.b = str;
            this.c = i;
            this.d = str2;
            this.e = i2;
        }
    }

    @Nullable
    private static URL a(@Nullable URL url, @NonNull String str) {
        try {
            return new URL(url, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static C2444a a(int i, @Nullable String str, @NonNull String str2, @Nullable URL url, @Nullable URL url2) {
        if (i == 307 || i == 308) {
            return (str2.equalsIgnoreCase("GET") || str2.equalsIgnoreCase("HEAD")) ? new C2444a(null, str, 0, "", i) : new C2444a(null, str, IronSourceError.ERROR_NT_LOAD_NO_FILL, com.vk.movika.sdk.base.model.history.b.b(i, "redirect code(", ") is only available for GET or HEAD method, current request method is ", str2), i);
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case Http.StatusCode.SEE_OTHER /* 303 */:
                if (TextUtils.isEmpty(str)) {
                    return new C2444a(null, str, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, "empty location.", i);
                }
                URL a = a(url, str);
                if (a == null) {
                    return new C2444a(null, str, 708, zr.a("location->\"", str, "\" is not a network url."), i);
                }
                String url3 = a.toString();
                return (url == null || !TextUtils.equals(url3, url.toString())) ? (url2 == null || !TextUtils.equals(url3, url2.toString())) ? new C2444a(a, str, 0, "", i) : new C2444a(a, str, 704, y57.a("redirect to origin url, location is ", str, ", redirectURL is ", url3), i) : new C2444a(a, str, IronSourceError.ERROR_NT_LOAD_EXCEPTION, y57.a("redirect to the same url, location is ", str, ", redirectURL is ", url3), i);
            default:
                return null;
        }
    }
}
