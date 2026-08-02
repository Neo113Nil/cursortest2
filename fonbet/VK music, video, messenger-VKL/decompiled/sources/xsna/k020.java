package xsna;

import androidx.annotation.NonNull;
import io.jsonwebtoken.JwtParser;
import java.util.Locale;
import kotlin.Pair;

/* compiled from: MediaUtils.kt */
/* loaded from: classes12.dex */
public final class k020 {
    public static final Object a = pn00.k(new Pair("mkv", "video/x-matroska"), new Pair("glb", "model/gltf-binary"));

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    public static final String a(@NonNull String str) {
        int P = drm0.P(str, JwtParser.SEPARATOR_CHAR, 0, 6);
        String substring = (P < 0 || P == str.length() + (-1)) ? null : str.substring(P + 1);
        if (substring == null) {
            return null;
        }
        String lowerCase = substring.toLowerCase(Locale.US);
        String str2 = ho20.c.get(lowerCase);
        if (str2 == null) {
            str2 = ho20.a.getMimeTypeFromExtension(lowerCase);
        }
        return str2 == null ? (String) a.get(lowerCase) : str2;
    }

    public static final boolean b(String str) {
        if (str != null) {
            return brm0.B(str, "video/", false);
        }
        return false;
    }
}
