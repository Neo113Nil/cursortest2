package org.chromium.base;

import android.net.Uri;
import java.io.File;

/* loaded from: classes8.dex */
public abstract class FileProviderUtils {
    private static final String TAG = "FileProviderUtils";
    private static FileProviderUtil sFileProviderUtil;
    private static final Object sLock = new Object();

    public interface FileProviderUtil {
        Uri getContentUriFromFile(File file);
    }

    private FileProviderUtils() {
    }

    public static Uri getContentUriFromFile(File file) {
        synchronized (sLock) {
            try {
                FileProviderUtil fileProviderUtil = sFileProviderUtil;
                if (fileProviderUtil == null) {
                    return null;
                }
                return fileProviderUtil.getContentUriFromFile(file);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setFileProviderUtil(FileProviderUtil fileProviderUtil) {
        synchronized (sLock) {
            sFileProviderUtil = fileProviderUtil;
        }
    }
}
