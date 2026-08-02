package xsna;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DebugFileMetrics.kt */
/* loaded from: classes.dex */
public final class x5l {
    public final SimpleDateFormat a = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss", Locale.US);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public FileOutputStream c;

    public x5l(File file) {
    }
}
