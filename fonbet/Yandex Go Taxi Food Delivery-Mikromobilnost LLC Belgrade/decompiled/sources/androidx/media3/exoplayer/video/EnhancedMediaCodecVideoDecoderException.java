package androidx.media3.exoplayer.video;

import android.os.PersistableBundle;
import android.view.Surface;
import defpackage.sb10;

/* loaded from: classes10.dex */
public class EnhancedMediaCodecVideoDecoderException extends MediaCodecVideoDecoderException {
    public final boolean isRecoverable;
    public final boolean isTransient;
    public final PersistableBundle metrics;

    public EnhancedMediaCodecVideoDecoderException(IllegalStateException illegalStateException, sb10 sb10Var, Surface surface, boolean z, boolean z2) {
        super(illegalStateException, sb10Var, surface);
        this.isRecoverable = z;
        this.isTransient = z2;
        this.metrics = null;
    }

    public EnhancedMediaCodecVideoDecoderException(IllegalStateException illegalStateException, sb10 sb10Var, Surface surface, boolean z, boolean z2, PersistableBundle persistableBundle) {
        super(illegalStateException, sb10Var, surface);
        this.isRecoverable = z;
        this.isTransient = z2;
        this.metrics = persistableBundle;
    }
}
