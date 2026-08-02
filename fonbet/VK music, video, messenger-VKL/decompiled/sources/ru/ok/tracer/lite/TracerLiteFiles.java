package ru.ok.tracer.lite;

import android.content.Context;
import java.io.File;
import xsna.nbr;

/* compiled from: TracerLiteFiles.kt */
/* loaded from: classes9.dex */
public final class TracerLiteFiles {
    public static final TracerLiteFiles INSTANCE = new TracerLiteFiles();

    private TracerLiteFiles() {
    }

    public final File getTracerLiteDir$tracer_lite_commons_release(Context context, String str) {
        return nbr.t(context.getCacheDir(), "tracer-lite-".concat(str));
    }
}
