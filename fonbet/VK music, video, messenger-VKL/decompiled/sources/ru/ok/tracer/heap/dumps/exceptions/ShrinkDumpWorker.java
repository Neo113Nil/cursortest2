package ru.ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import ru.ok.tracer.heap.dumps.FEATURE_HEAP_DUMPKt;
import ru.ok.tracer.upload.SampleUploader;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.i7o0;
import xsna.ozl;
import xsna.qlb0;
import xsna.ro;
import xsna.zcl;

/* compiled from: ShrinkDumpWorker.kt */
/* loaded from: classes9.dex */
public final class ShrinkDumpWorker extends Worker {
    public static final Companion Companion = new Companion(null);
    private static final int MINIMUM_DUMP_SIZE = 1048576;
    public static final String PARAM_DUMP_PATH = "param_dump_path";
    private static final String PARAM_TAG = "param_tag";

    /* compiled from: ShrinkDumpWorker.kt */
    @ozl
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        @ozl
        public final Data createInputData(File file) {
            return createInputData$tracer_heap_dumps_release(file, null);
        }

        public final Data createInputData$tracer_heap_dumps_release(File file, String str) {
            Data.a aVar = new Data.a();
            String path = file.getPath();
            LinkedHashMap linkedHashMap = aVar.a;
            linkedHashMap.put(ShrinkDumpWorker.PARAM_DUMP_PATH, path);
            linkedHashMap.put(ShrinkDumpWorker.PARAM_TAG, str);
            return aVar.a();
        }

        private Companion() {
        }

        @ozl
        public static /* synthetic */ void getPARAM_DUMP_PATH$annotations() {
        }
    }

    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @ozl
    public static final Data createInputData(File file) {
        return Companion.createInputData(file);
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.work.Worker
    public b.a doWork() {
        String d = getInputData().d(PARAM_DUMP_PATH);
        if (d == null || d.length() == 0) {
            return new b.a.C0092a();
        }
        String d2 = getInputData().d(PARAM_TAG);
        File file = new File(d);
        long length = file.length();
        if (length < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            Logger.d$default(qlb0.a(length, "Dump has not interesting size ", " < 1048576"), null, 2, null);
            file.delete();
            return new b.a.c();
        }
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 2, null)) {
            Logger.d$default("Not able to run dump shrinking", null, 2, null);
            file.delete();
            return new b.a.c();
        }
        try {
            File newSampleFile$default = TracerFiles.getNewSampleFile$default(TracerFiles.INSTANCE, getApplicationContext(), FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 4, null);
            try {
                HprofFastInputStream deflate = HprofFastInputStream.deflate(new BufferedInputStream(new FileInputStream(file)));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newSampleFile$default));
                    try {
                        i7o0.b(deflate, bufferedOutputStream, 8192);
                        bufferedOutputStream.close();
                        ro.e(deflate, null);
                        file.delete();
                        SampleUploader.upload$default(SampleUploader.INSTANCE, getApplicationContext(), FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), newSampleFile$default, false, d2, Long.valueOf(length), null, null, 200, null);
                        return new b.a.c();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                file.delete();
                throw th;
            }
        } catch (IOException unused) {
            return new b.a.C0092a();
        }
    }
}
