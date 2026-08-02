package one.video.exo.preload;

import androidx.annotation.Nullable;
import java.io.IOException;
import xsna.kr10;

/* loaded from: classes8.dex */
public final class PreloadException extends Exception {
    public final kr10 mediaItem;

    public PreloadException(kr10 kr10Var, @Nullable IOException iOException) {
        super(null, iOException);
        this.mediaItem = kr10Var;
    }
}
