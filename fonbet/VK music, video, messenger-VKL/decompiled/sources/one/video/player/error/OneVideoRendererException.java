package one.video.player.error;

import one.video.player.FormatSupport;
import xsna.er10;

/* compiled from: OneVideoRendererException.kt */
/* loaded from: classes8.dex */
public class OneVideoRendererException extends Exception {
    private final String codecInfo;
    private final boolean isDecoderException;
    private final boolean isDecoderInitializationException;
    private final String mimeType;
    private final er10 rendererFormat;
    private final FormatSupport rendererFormatSupport;
    private final int rendererIndex;
    private final String rendererName;

    public OneVideoRendererException(Exception exc) {
        super(exc);
        this.rendererFormatSupport = FormatSupport.UNKNOWN;
        this.rendererIndex = -1;
    }

    public String d() {
        return this.codecInfo;
    }

    public String g() {
        return this.mimeType;
    }

    public er10 h() {
        return this.rendererFormat;
    }

    public FormatSupport i() {
        return this.rendererFormatSupport;
    }

    public int j() {
        return this.rendererIndex;
    }

    public String k() {
        return this.rendererName;
    }

    public boolean l() {
        return this.isDecoderInitializationException;
    }
}
