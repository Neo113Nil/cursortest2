package xsna;

import android.content.Context;
import android.util.Base64;
import com.vk.superapp.dating.js.bridge.api.events.ImageShare$Parameters;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImageShareHandler.kt */
/* loaded from: classes6.dex */
public final class olw {
    public final z1n0 a;
    public final uvp b;

    /* compiled from: ImageShareHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageShare$Parameters.App.values().length];
            try {
                iArr[ImageShare$Parameters.App.TELEGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageShare$Parameters.App.WHATSAPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageShare$Parameters.App.INSTAGRAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public olw(z1n0 z1n0Var, uvp uvpVar) {
        this.a = z1n0Var;
        this.b = uvpVar;
    }

    public static File a(Context context, String str) {
        byte[] decode;
        String str2 = (String) j5g.i0(drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6));
        try {
            decode = Base64.decode(str2, 0);
        } catch (IllegalArgumentException unused) {
            decode = Base64.decode(str2, 10);
        }
        File file = new File(context.getExternalCacheDir(), System.currentTimeMillis() + ".png");
        com.vk.core.files.a.O(file, decode);
        return file;
    }

    public static String b(ImageShare$Parameters.App app2, Context context) {
        if (app2 == null) {
            return null;
        }
        int i = a.$EnumSwitchMapping$0[app2.ordinal()];
        if (i == 1) {
            if (context.getPackageManager().getLaunchIntentForPackage("org.telegram.messenger.web") != null) {
                return "org.telegram.messenger.web";
            }
            if (context.getPackageManager().getLaunchIntentForPackage("org.telegram.messenger") != null) {
                return "org.telegram.messenger";
            }
            return null;
        }
        if (i == 2) {
            if (context.getPackageManager().getLaunchIntentForPackage("com.whatsapp") != null) {
                return "com.whatsapp";
            }
            return null;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (context.getPackageManager().getLaunchIntentForPackage("com.instagram.android") != null) {
            return "com.instagram.android";
        }
        return null;
    }
}
