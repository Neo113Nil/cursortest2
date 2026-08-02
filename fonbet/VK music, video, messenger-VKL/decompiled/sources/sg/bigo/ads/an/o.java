package sg.bigo.ads.an;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import sg.bigo.ads.common.utils.r;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class o {
    public static String a = "";

    public static String a(Context context) {
        String a2;
        if (sg.bigo.ads.bh.d.b() && !r.a((CharSequence) a)) {
            return a;
        }
        if (r.a((CharSequence) a)) {
            if (context == null) {
                a2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getFilesDir());
                a2 = i5s.a(sb, File.separator, "sg_bigo_ad");
            }
            a = a2;
        }
        File file = new File(a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return a;
    }

    public static String b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(j(context));
        return i5s.a(sb, File.separator, "files");
    }

    public static String c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(j(context));
        return i5s.a(sb, File.separator, "vpaid");
    }

    public static String d(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(j(context));
        return i5s.a(sb, File.separator, "thumb");
    }

    public static String e(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return i5s.a(sb, File.separator, "image");
    }

    public static String f(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return i5s.a(sb, File.separator, "icon");
    }

    public static String g(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return i5s.a(sb, File.separator, "omsdk");
    }

    public static String h(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return i5s.a(sb, File.separator, "bannerjs");
    }

    public static String i(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return i5s.a(sb, File.separator, "playable_zip");
    }

    private static String j(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return i5s.a(sb, File.separator, "video");
    }

    @Nullable
    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(d(context));
        return i5s.a(sb, File.separator, str);
    }

    public static String c(Context context, @NonNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i(context));
        return i5s.a(sb, File.separator, str);
    }

    public static boolean a(Context context, String str) {
        return str != null && str.equals(b(context));
    }

    public static boolean a(Context context, @Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !"package.zip".equals(str2)) {
            return false;
        }
        return str.startsWith(i(context) + File.separator);
    }
}
