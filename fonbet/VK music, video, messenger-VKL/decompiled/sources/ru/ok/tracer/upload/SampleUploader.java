package ru.ok.tracer.upload;

import android.content.Context;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.c;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.utils.TracerFiles;
import xsna.b560;
import xsna.dwx0;
import xsna.j5g;
import xsna.jgp;
import xsna.ozl;
import xsna.p6j;

/* compiled from: SampleUploader.kt */
/* loaded from: classes9.dex */
public final class SampleUploader {
    public static final SampleUploader INSTANCE = new SampleUploader();

    private SampleUploader() {
    }

    public static /* synthetic */ void upload$default(SampleUploader sampleUploader, Context context, TracerFeature tracerFeature, File file, boolean z, String str, Long l, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        sampleUploader.upload(context, tracerFeature, file, z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : l, (i & 64) != 0 ? jgp.b : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void uploadCopy$default(SampleUploader sampleUploader, Context context, TracerFeature tracerFeature, File file, String str, Long l, Long l2, Map map, int i, Object obj) throws IOException {
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        if ((i & 64) != 0) {
            map = jgp.b;
        }
        sampleUploader.uploadCopy(context, tracerFeature, file, str, l, l2, map);
    }

    @ozl
    public final void upload(Context context, TracerFeature tracerFeature, File file, boolean z, String str, Long l, Map<String, String> map) {
        upload(context, tracerFeature, file, file.length(), file.getName(), z, str, l, null, map);
    }

    public final void uploadCopy(Context context, TracerFeature tracerFeature, File file, String str, Long l, Long l2, Map<String, String> map) throws IOException {
        File newSampleFile = TracerFiles.INSTANCE.getNewSampleFile(Tracer.INSTANCE.getContext(), tracerFeature, "");
        try {
            SampleUtils.gzipTo$default(file, newSampleFile, 0, 2, null);
            upload(context, tracerFeature, newSampleFile, file.length(), file.getName(), false, str, l, l2, map);
        } catch (IOException e) {
            newSampleFile.delete();
            throw e;
        }
    }

    public static /* synthetic */ void upload$default(SampleUploader sampleUploader, Context context, TracerFeature tracerFeature, File file, boolean z, String str, Long l, Long l2, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        sampleUploader.upload(context, tracerFeature, file, z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? jgp.b : map);
    }

    public final void upload(Context context, TracerFeature tracerFeature, File file, boolean z, String str, Long l, Long l2, Map<String, String> map) {
        upload(context, tracerFeature, file, file.length(), file.getName(), z, str, l, l2, map);
    }

    public final void upload(Context context, TracerFeature tracerFeature, File file, long j, String str, boolean z, String str2, Long l, Long l2, Map<String, String> map) {
        boolean z2 = false;
        Data createData$tracer_sample_upload_release = SampleUploadWorker.Companion.createData$tracer_sample_upload_release(tracerFeature, file, Long.valueOf(j), str, z, str2, l, l2, PackageInfoCompat.getLongVersionCodeCompat(PackageManagerCompat.getPackageInfoCompat(context.getPackageManager(), context.getPackageName(), 0)), map);
        b560 b560Var = new b560(null);
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!CoreTracerConfiguration.Companion.get().getDebugUpload()) {
            networkType = NetworkType.UNMETERED;
            b560Var = new b560(null);
            z2 = true;
        }
        boolean z3 = z2;
        c b = new c.a(SampleUploadWorker.class).f(new p6j(b560Var, networkType, false, z3, z3, false, -1L, -1L, j5g.S0(linkedHashSet))).h(createData$tracer_sample_upload_release).b();
        dwx0 h = dwx0.h(context);
        h.getClass();
        h.d(Collections.singletonList(b));
    }
}
