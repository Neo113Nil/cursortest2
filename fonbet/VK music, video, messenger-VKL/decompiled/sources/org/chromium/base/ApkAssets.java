package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;

/* loaded from: classes8.dex */
public class ApkAssets {
    private static final String TAG = "ApkAssets";
    private static String sLastError;

    public static boolean exists(String str) {
        try {
            AssetFileDescriptor openNonAssetFd = ContextUtils.getApplicationContext().getAssets().openNonAssetFd(maybeAddSuffix(str));
            if (openNonAssetFd != null) {
                openNonAssetFd.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @CalledByNative
    public static long[] open(String str, String str2) {
        String maybeAddSuffix = maybeAddSuffix(str);
        AssetFileDescriptor assetFileDescriptor = null;
        sLastError = null;
        try {
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (!TextUtils.isEmpty(str2) && BundleUtils.isIsolatedSplitInstalled(str2)) {
                    applicationContext = BundleUtils.createIsolatedSplitContext(str2);
                }
                assetFileDescriptor = applicationContext.getAssets().openNonAssetFd(maybeAddSuffix);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                    return jArr;
                } catch (IOException e) {
                    Log.e(TAG, "Unable to close AssetFileDescriptor", (Throwable) e);
                    return jArr;
                }
            } catch (Throwable th) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e2) {
                        Log.e(TAG, "Unable to close AssetFileDescriptor", (Throwable) e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            sLastError = "Error while loading asset " + maybeAddSuffix + " from " + str2 + ": " + String.valueOf(e3);
            if (!TextUtils.isEmpty(e3.getMessage()) && !e3.getMessage().equals(maybeAddSuffix)) {
                Log.e(TAG, sLastError);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    Log.e(TAG, "Unable to close AssetFileDescriptor", (Throwable) e4);
                }
            }
            return jArr2;
        }
    }

    @CalledByNative
    private static String takeLastErrorString() {
        String str = sLastError;
        sLastError = null;
        return str;
    }

    private static String maybeAddSuffix(String str) {
        return str;
    }
}
