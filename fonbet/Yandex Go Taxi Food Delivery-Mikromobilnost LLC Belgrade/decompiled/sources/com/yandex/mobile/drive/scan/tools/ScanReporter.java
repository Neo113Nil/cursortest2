package com.yandex.mobile.drive.scan.tools;

import android.util.Size;
import defpackage.g8e;
import defpackage.h2b1;
import defpackage.k4o;
import defpackage.qgn0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.enums.a;

/* loaded from: classes15.dex */
public final class ScanReporter {
    public Map a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/drive/scan/tools/ScanReporter$CaptureStrategy;", "", "VideoAndImage", "AnalysisAndFfmpeg", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CaptureStrategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CaptureStrategy[] $VALUES;
        public static final CaptureStrategy AnalysisAndFfmpeg;
        public static final CaptureStrategy VideoAndImage;

        static {
            CaptureStrategy captureStrategy = new CaptureStrategy("VideoAndImage", 0);
            VideoAndImage = captureStrategy;
            CaptureStrategy captureStrategy2 = new CaptureStrategy("AnalysisAndFfmpeg", 1);
            AnalysisAndFfmpeg = captureStrategy2;
            CaptureStrategy[] captureStrategyArr = {captureStrategy, captureStrategy2};
            $VALUES = captureStrategyArr;
            $ENTRIES = a.a(captureStrategyArr);
        }

        public static CaptureStrategy valueOf(String str) {
            return (CaptureStrategy) Enum.valueOf(CaptureStrategy.class, str);
        }

        public static CaptureStrategy[] values() {
            return (CaptureStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/mobile/drive/scan/tools/ScanReporter$PhotoSource;", "", "ImageCapture", "Analysis", "Surface", "Texture", "Screenshot", "DrawingCache", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhotoSource {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PhotoSource[] $VALUES;
        public static final PhotoSource Analysis;
        public static final PhotoSource DrawingCache;
        public static final PhotoSource ImageCapture;
        public static final PhotoSource Screenshot;
        public static final PhotoSource Surface;
        public static final PhotoSource Texture;

        static {
            PhotoSource photoSource = new PhotoSource("ImageCapture", 0);
            ImageCapture = photoSource;
            PhotoSource photoSource2 = new PhotoSource("Analysis", 1);
            Analysis = photoSource2;
            PhotoSource photoSource3 = new PhotoSource("Surface", 2);
            Surface = photoSource3;
            PhotoSource photoSource4 = new PhotoSource("Texture", 3);
            Texture = photoSource4;
            PhotoSource photoSource5 = new PhotoSource("Screenshot", 4);
            Screenshot = photoSource5;
            PhotoSource photoSource6 = new PhotoSource("DrawingCache", 5);
            DrawingCache = photoSource6;
            PhotoSource[] photoSourceArr = {photoSource, photoSource2, photoSource3, photoSource4, photoSource5, photoSource6};
            $VALUES = photoSourceArr;
            $ENTRIES = a.a(photoSourceArr);
        }

        public static PhotoSource valueOf(String str) {
            return (PhotoSource) Enum.valueOf(PhotoSource.class, str);
        }

        public static PhotoSource[] values() {
            return (PhotoSource[]) $VALUES.clone();
        }
    }

    public static void c(PhotoSource photoSource) {
        Map z = g8e.z("source", photoSource.name());
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("debug_video_capture_photo", z);
        }
    }

    public final void a(CaptureStrategy captureStrategy, Size size) {
        Pair pair = new Pair("strategy", captureStrategy.name());
        String size2 = size != null ? size.toString() : null;
        if (size2 == null) {
            size2 = "";
        }
        Map i = b.i(pair, new Pair("resolution", size2));
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("video_create_started", i);
        }
        this.a = i;
    }

    public final void b(String str, String str2, Throwable th) {
        Pair pair = new Pair("name", str);
        Pair pair2 = new Pair("error_message", str2);
        String th2 = th != null ? th.toString() : null;
        if (th2 == null) {
            th2 = "";
        }
        HashMap h = b.h(pair, pair2, new Pair("error_cause", th2));
        Map map = this.a;
        if (map == null) {
            map = b.f();
        }
        LinkedHashMap n = b.n(h, map);
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("video_create_failed", n);
        }
        this.a = null;
    }
}
