package org.chromium.base.memory;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.chromium.base.ContextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.metrics.RecordHistogram;
import xsna.go9;

/* loaded from: classes8.dex */
public class MemoryPressureUma implements ComponentCallbacks2 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static MemoryPressureUma sInstance;
    private final String mHistogramName;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Notification {
        public static final int NUM_ENTRIES = 9;
        public static final int ON_LOW_MEMORY = 8;
        public static final int TRIM_MEMORY_BACKGROUND = 3;
        public static final int TRIM_MEMORY_COMPLETE = 1;
        public static final int TRIM_MEMORY_MODERATE = 2;
        public static final int TRIM_MEMORY_RUNNING_CRITICAL = 5;
        public static final int TRIM_MEMORY_RUNNING_LOW = 6;
        public static final int TRIM_MEMORY_RUNNING_MODERATE = 7;
        public static final int TRIM_MEMORY_UI_HIDDEN = 4;
        public static final int UNKNOWN_TRIM_LEVEL = 0;
    }

    private MemoryPressureUma(String str) {
        this.mHistogramName = go9.b("Android.MemoryPressureNotification.", str);
    }

    public static void initializeForBrowser() {
        initializeInstance("Browser");
    }

    public static void initializeForChildService() {
        initializeInstance("ChildService");
    }

    private static void initializeInstance(String str) {
        ThreadUtils.assertOnUiThread();
        sInstance = new MemoryPressureUma(str);
        ContextUtils.getApplicationContext().registerComponentCallbacks(sInstance);
    }

    private void record(int i) {
        RecordHistogram.recordEnumeratedHistogram(this.mHistogramName, i, 9);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        record(8);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 5) {
            record(7);
            return;
        }
        if (i == 10) {
            record(6);
            return;
        }
        if (i == 15) {
            record(5);
            return;
        }
        if (i == 20) {
            record(4);
            return;
        }
        if (i == 40) {
            record(3);
            return;
        }
        if (i == 60) {
            record(2);
        } else if (i != 80) {
            record(0);
        } else {
            record(1);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
