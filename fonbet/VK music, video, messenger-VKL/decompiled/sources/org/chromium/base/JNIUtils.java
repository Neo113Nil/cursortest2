package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes11.dex */
public class JNIUtils {
    private static final String TAG = "JNIUtils";
    private static final JniClassLoader sJniClassLoader = new JniClassLoader();

    public static class JniClassLoader extends ClassLoader {
        ClassLoader mDelegate;

        public JniClassLoader() {
            super(JNIUtils.class.getClassLoader());
        }

        @Override // java.lang.ClassLoader
        public Class<?> findClass(String str) throws ClassNotFoundException {
            ClassLoader classLoader = this.mDelegate;
            return classLoader != null ? classLoader.loadClass(str) : super.findClass(str);
        }
    }

    @CalledByNative
    private static ClassLoader getSplitClassLoader(String str) {
        if (!str.isEmpty()) {
            boolean isIsolatedSplitInstalled = BundleUtils.isIsolatedSplitInstalled(str);
            Log.i(TAG, "Init JNI Classloader for %s. isInstalled=%b", str, Boolean.valueOf(isIsolatedSplitInstalled));
            if (isIsolatedSplitInstalled) {
                return BundleUtils.getOrCreateSplitClassLoader(str);
            }
        }
        return sJniClassLoader;
    }

    public static void setDefaultClassLoader(ClassLoader classLoader) {
        sJniClassLoader.mDelegate = classLoader;
    }
}
