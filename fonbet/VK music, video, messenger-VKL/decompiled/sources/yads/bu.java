package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public abstract class bu {
    public static final Charset a = Charset.forName(C.ASCII_NAME);
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final Charset c = Charset.forName(C.UTF8_NAME);
    public static final Charset d;
    public static final Charset e;

    static {
        Charset.forName("UTF-16BE");
        d = Charset.forName("UTF-16LE");
        e = Charset.forName(C.UTF16_NAME);
    }
}
