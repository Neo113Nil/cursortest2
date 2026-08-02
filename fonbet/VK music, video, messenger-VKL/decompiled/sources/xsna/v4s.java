package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: FontFamily.kt */
/* loaded from: classes11.dex */
public abstract class v4s {
    public static final afl b = new afl();
    public static final qjt c = new qjt(C.SANS_SERIF_NAME, "FontFamily.SansSerif");

    /* compiled from: FontFamily.kt */
    public interface a {
        oup0 a(v4s v4sVar, b6s b6sVar, int i, int i2);
    }

    static {
        new qjt(C.SERIF_NAME, "FontFamily.Serif");
        new qjt("monospace", "FontFamily.Monospace");
        new qjt("cursive", "FontFamily.Cursive");
    }
}
