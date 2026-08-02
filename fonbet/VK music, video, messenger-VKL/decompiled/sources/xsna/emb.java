package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* compiled from: Charsets.kt */
/* loaded from: classes11.dex */
public final class emb {
    public static final emb a = new emb();
    public static final Charset b = Charset.forName(C.UTF8_NAME);
    public static final Charset c = Charset.forName(C.UTF16_NAME);
    public static final Charset d;
    public static volatile Charset e;
    public static volatile Charset f;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName(C.ASCII_NAME);
        d = Charset.forName("ISO-8859-1");
    }
}
