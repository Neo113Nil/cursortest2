package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: SupportReason.kt */
/* loaded from: classes15.dex */
public abstract class pin0 {
    public final boolean a;

    /* compiled from: SupportReason.kt */
    public static final class a extends pin0 {
        @Override // xsna.pin0
        public final Uri a(Uri.Builder builder) {
            return builder.appendQueryParameter("from", "phone_banned").build();
        }
    }

    /* compiled from: SupportReason.kt */
    public static final class b {
        public static Uri a() {
            return jeq0.g("https://" + a0a.d + "/faq19118");
        }
    }

    public pin0(boolean z) {
        this.a = z;
    }

    public abstract Uri a(Uri.Builder builder);

    public final Uri b(String str) {
        return a(new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(str).appendEncodedPath("support/").appendQueryParameter("act", "new"));
    }

    public final boolean c() {
        return this.a;
    }
}
