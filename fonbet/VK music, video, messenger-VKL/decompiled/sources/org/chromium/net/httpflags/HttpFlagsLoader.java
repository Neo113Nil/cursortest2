package org.chromium.net.httpflags;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetManifest;

/* loaded from: classes11.dex */
public final class HttpFlagsLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String FLAGS_FILE_DIR_NAME = "app_httpflags";
    static final String FLAGS_FILE_NAME = "flags.binarypb";
    static final String FLAGS_FILE_PROVIDER_INTENT_ACTION = "android.net.http.FLAGS_FILE_PROVIDER";
    public static final String LOG_FLAG_NAME = "Cronet_log_me";
    public static final String TAG = "HttpFlagsLoader";
    private static ResolvedFlags sHttpFlags;
    private static final Object sLock = new Object();
    private static String sVersion;

    private HttpFlagsLoader() {
    }

    public static void flushHttpFlags() {
        sHttpFlags = null;
        sVersion = null;
    }

    private static File getFlagsFileFromProvider(ApplicationInfo applicationInfo) {
        return new File(new File(new File(applicationInfo.deviceProtectedDataDir), FLAGS_FILE_DIR_NAME), FLAGS_FILE_NAME);
    }

    public static ResolvedFlags getHttpFlags(Context context, String str, boolean z, boolean z2) {
        synchronized (sLock) {
            try {
                String str2 = sVersion;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
                }
                ResolvedFlags resolvedFlags = sHttpFlags;
                if (resolvedFlags != null) {
                    return resolvedFlags;
                }
                sVersion = str;
                ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("HttpFlagsLoader#getHttpFlags loading flags");
                try {
                    Flags load = !CronetManifest.shouldReadHttpFlags(context) ? null : load(context);
                    if (load == null) {
                        load = Flags.newBuilder().build();
                    }
                    ResolvedFlags resolve = ResolvedFlags.resolve(load, context.getPackageName(), str, z2);
                    sHttpFlags = resolve;
                    ResolvedFlags.Value value = resolve.flags().get(LOG_FLAG_NAME);
                    if (value != null) {
                        String str3 = z ? "API" : "Impl";
                        String stringValue = value.getStringValue();
                        StringBuilder sb = new StringBuilder("HTTP flags log line (");
                        sb.append(str3);
                        sb.append("): ");
                        sb.append(stringValue);
                    }
                    ResolvedFlags resolvedFlags2 = sHttpFlags;
                    if (scoped != null) {
                        scoped.close();
                    }
                    return resolvedFlags2;
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static ApplicationInfo getProviderApplicationInfo(Context context) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("HttpFlagsLoader#getProviderApplicationInfo");
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent(FLAGS_FILE_PROVIDER_INTENT_ACTION), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            if (resolveService == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return null;
            }
            ApplicationInfo applicationInfo = resolveService.serviceInfo.applicationInfo;
            if (scoped != null) {
                scoped.close();
            }
            return applicationInfo;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Nullable
    public static Flags load(Context context) {
        try {
            ApplicationInfo providerApplicationInfo = getProviderApplicationInfo(context);
            if (providerApplicationInfo == null) {
                return null;
            }
            new StringBuilder("Found application exporting HTTP flags: ").append(providerApplicationInfo.packageName);
            File flagsFileFromProvider = getFlagsFileFromProvider(providerApplicationInfo);
            new StringBuilder("HTTP flags file path: ").append(flagsFileFromProvider.getAbsolutePath());
            Flags loadFlagsFile = loadFlagsFile(flagsFileFromProvider);
            if (loadFlagsFile == null) {
                return null;
            }
            new StringBuilder("Successfully loaded HTTP flags: ").append(loadFlagsFile);
            return loadFlagsFile;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Nullable
    private static Flags loadFlagsFile(File file) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("HttpFlagsLoader#loadFlagsFile");
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    Flags parseDelimitedFrom = Flags.parseDelimitedFrom(fileInputStream);
                    fileInputStream.close();
                    if (scoped != null) {
                        scoped.close();
                    }
                    return parseDelimitedFrom;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            String path = file.getPath();
            StringBuilder sb = new StringBuilder("HTTP flags file `");
            sb.append(path);
            sb.append("` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.");
            if (scoped == null) {
                return null;
            }
            scoped.close();
            return null;
        } catch (IOException e) {
            throw new RuntimeException("Unable to read HTTP flags file", e);
        }
    }
}
