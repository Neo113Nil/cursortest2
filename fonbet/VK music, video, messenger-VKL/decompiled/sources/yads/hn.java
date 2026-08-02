package yads;

import android.util.Base64;
import java.nio.charset.Charset;
import xsna.emb;

/* loaded from: classes10.dex */
public final class hn {
    public static String a(String str) {
        Charset charset = emb.b;
        byte[] bytes = str.getBytes(charset);
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            return new String(bytes, emb.b);
        }
    }

    public static String b(String str) {
        Charset charset = emb.b;
        try {
            return new String(Base64.decode(str.getBytes(charset), 0), charset);
        } catch (Exception unused) {
            return null;
        }
    }
}
