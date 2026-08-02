package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Lambda;
import xsna.s8y0;

/* compiled from: VKCaptcha.kt */
/* loaded from: classes.dex */
public final class var0 {
    public static volatile bbr0 b;
    public static volatile String c;
    public static volatile String d;
    public static final var0 a = new var0();
    public static final bpn0 e = new bpn0(a.i);
    public static final AtomicReference<Context> f = new AtomicReference<>();
    public static final AtomicReference<Locale> g = new AtomicReference<>(null);

    /* compiled from: VKCaptcha.kt */
    public static final class a extends Lambda implements gzs<l9y0> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final l9y0 invoke() {
            return new l9y0();
        }
    }

    public static void a(j9y0 j9y0Var) {
        ((yty0) s8y0.d.a().b.getValue()).a();
        zar0.a(j9y0Var);
    }

    public static void b(Context context) {
        f.set(context.getApplicationContext());
        Context applicationContext = context.getApplicationContext();
        if (s8y0.h == null) {
            synchronized (s8y0.class) {
                try {
                    if (s8y0.h == null) {
                        s8y0.h = new s8y0(applicationContext);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0078, code lost:
    
        if (r0.equals("ru") == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @SuppressLint({"UseKtx"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, String str2, bbr0 bbr0Var) {
        Locale locale = g.get();
        int i = 0;
        if (locale == null) {
            Context context = f.get();
            if (context == null) {
                throw new IllegalStateException("Required value was null.");
            }
            locale = context.getResources().getConfiguration().getLocales().get(0);
        }
        String language = locale.getLanguage();
        if (language != null) {
            int hashCode = language.hashCode();
            if (hashCode != 3201) {
                if (hashCode == 3241) {
                    language.equals("en");
                } else if (hashCode != 3246) {
                    if (hashCode != 3276) {
                        if (hashCode != 3580) {
                            if (hashCode != 3651) {
                                if (hashCode != 3710) {
                                    if (hashCode == 3734 && language.equals("uk")) {
                                        i = 1;
                                    }
                                } else if (language.equals("tr")) {
                                    i = 82;
                                }
                            }
                        } else if (language.equals("pl")) {
                            i = 15;
                        }
                    } else if (language.equals("fr")) {
                        i = 16;
                    }
                } else if (language.equals("es")) {
                    i = 4;
                }
            } else if (language.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                i = 6;
            }
            String uri = Uri.parse(str2).buildUpon().appendQueryParameter("lang_id", String.valueOf(i)).build().toString();
            synchronized (this) {
                b = bbr0Var;
                c = str;
                d = uri;
                s8y0.d.a().g = true;
                s3q0 s3q0Var = s3q0.a;
            }
            Context context2 = f.get();
            if (context2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Context context3 = context2;
            Intent intent = new Intent(context3, (Class<?>) VKCaptchaWebViewActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("VK_CAPTCHA_URL_KEY", uri);
            intent.putExtra("VK_CAPTCHA_CHALLENGE_DOMAIN_URL_KEY", str);
            context3.startActivity(intent);
            return;
        }
        i = 3;
        String uri2 = Uri.parse(str2).buildUpon().appendQueryParameter("lang_id", String.valueOf(i)).build().toString();
        synchronized (this) {
        }
    }
}
