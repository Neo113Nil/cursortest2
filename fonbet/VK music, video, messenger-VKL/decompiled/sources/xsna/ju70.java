package xsna;

import android.net.Uri;

/* compiled from: OfflineMusicCacheKeyFactory.kt */
/* loaded from: classes3.dex */
public final class ju70 implements xw8 {

    /* compiled from: OfflineMusicCacheKeyFactory.kt */
    public static final class a {
        public static String a(Uri uri) {
            return "music_image_".concat(d370.x(qar0.g().f(uri)));
        }

        public static void b(String str) {
            drm0.D(str, "key.pub", true);
        }

        public static boolean c(String str) {
            return drm0.D(str, ".m3u8", true);
        }

        public static boolean d(String str) {
            return brm0.v(str, "music_manifest.m3u8", false);
        }

        public static boolean e(String str) {
            return brm0.B(str, "music_image_", false);
        }

        public static boolean f(String str) {
            return drm0.D(str, ".ts", true);
        }

        public static String g(String str) {
            return str.concat("/music_manifest.m3u8");
        }

        public static String h(String str) {
            return "music_image_".concat(str);
        }
    }

    @Override // xsna.xw8
    public final String k(evk evkVar) {
        Object obj = evkVar.k;
        Uri uri = evkVar.a;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            String str2 = evkVar.i;
            if (str2 == null) {
                str2 = uri.toString();
            }
            str = str2;
        }
        String uri2 = uri.toString();
        return a.c(uri2) ? str.concat("/music_manifest.m3u8") : (qar0.g().c.matcher(uri2).lookingAt() || drm0.D(uri2, ".jpeg", true) || drm0.D(uri2, ".jpg", true)) ? a.a(Uri.parse(uri2)) : uri2;
    }
}
