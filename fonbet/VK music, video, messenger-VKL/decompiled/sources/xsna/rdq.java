package xsna;

import androidx.window.core.VerificationMode;
import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: ExtensionsUtil.kt */
/* loaded from: classes12.dex */
public final class rdq {
    public static final rdq a = new rdq();

    static {
        fpf0.a(rdq.class).l();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            int i = hn8.a;
            VerificationMode verificationMode = VerificationMode.STRICT;
            return 0;
        } catch (NullPointerException unused2) {
            int i2 = hn8.a;
            VerificationMode verificationMode2 = VerificationMode.STRICT;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            int i3 = hn8.a;
            VerificationMode verificationMode3 = VerificationMode.STRICT;
            return 0;
        }
    }
}
