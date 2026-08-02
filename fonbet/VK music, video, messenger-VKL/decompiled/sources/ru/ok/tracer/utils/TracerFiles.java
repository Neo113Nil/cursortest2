package ru.ok.tracer.utils;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.IOException;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.base.process.ProcessUtils;
import xsna.epx;
import xsna.nbr;

/* compiled from: TracerFiles.kt */
/* loaded from: classes11.dex */
public final class TracerFiles {
    public static final TracerFiles INSTANCE = new TracerFiles();

    private TracerFiles() {
    }

    public static /* synthetic */ File createTempFile$default(TracerFiles tracerFiles, Context context, String str, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = String.valueOf(System.nanoTime());
        }
        return tracerFiles.createTempFile(context, str);
    }

    public static /* synthetic */ File getNewSampleFile$default(TracerFiles tracerFiles, Context context, TracerFeature tracerFeature, String str, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            str = ".bin";
        }
        return tracerFiles.getNewSampleFile(context, tracerFeature, str);
    }

    public final File createTempFile(Context context, String str) throws IOException {
        return nbr.t(FileUtils.mkdirsChecked(getTracerDir(context)), str.concat(".tmp"));
    }

    public final File getNewSampleFile(Context context, TracerFeature tracerFeature, String str) throws IOException {
        return nbr.t(FileUtils.mkdirsChecked(getTracerDir(context)), tracerFeature.getName() + BundleUtil.UNDERLINE_TAG + System.currentTimeMillis() + str);
    }

    public final File getTracerDir(Context context) {
        String str;
        String processName = ProcessUtils.getProcessName(context);
        if (epx.f(processName, context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + ((Object) Uri.encode(processName.replace(':', '-')));
        }
        return new File(context.getCacheDir(), str);
    }
}
