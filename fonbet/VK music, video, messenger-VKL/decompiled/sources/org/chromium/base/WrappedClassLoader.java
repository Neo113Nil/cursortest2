package org.chromium.base;

import dalvik.system.BaseDexClassLoader;

/* loaded from: classes8.dex */
public class WrappedClassLoader extends ClassLoader {
    private final ClassLoader mPrimaryClassLoader;
    private final ClassLoader mSecondaryClassLoader;

    public WrappedClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        this.mPrimaryClassLoader = classLoader;
        this.mSecondaryClassLoader = classLoader2;
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        try {
            return this.mPrimaryClassLoader.loadClass(str);
        } catch (ClassNotFoundException e) {
            try {
                return this.mSecondaryClassLoader.loadClass(str);
            } catch (ClassNotFoundException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public String findLibrary(String str) {
        String str2;
        ClassLoader classLoader = this.mPrimaryClassLoader;
        if (classLoader instanceof BaseDexClassLoader) {
            str2 = ((BaseDexClassLoader) classLoader).findLibrary(str);
            if (str2 != null) {
                return str2;
            }
        } else {
            str2 = null;
        }
        ClassLoader classLoader2 = this.mSecondaryClassLoader;
        return classLoader2 instanceof BaseDexClassLoader ? ((BaseDexClassLoader) classLoader2).findLibrary(str) : str2;
    }
}
