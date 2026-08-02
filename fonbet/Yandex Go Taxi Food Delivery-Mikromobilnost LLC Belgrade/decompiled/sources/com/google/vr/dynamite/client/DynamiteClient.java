package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;
import defpackage.k271;
import defpackage.p571;

/* loaded from: classes11.dex */
public final class DynamiteClient {
    public static final ArrayMap a = new ArrayMap();

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            p571 p571Var = new p571(str, str2);
            k271 remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(p571Var);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.b(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.b(context));
                if (newNativeLibraryLoader != null) {
                    return newNativeLibraryLoader.checkVersion(str3);
                }
                String p571Var2 = p571Var.toString();
                StringBuilder sb = new StringBuilder(p571Var2.length() + 72);
                sb.append("Failed to load native library ");
                sb.append(p571Var2);
                sb.append(" from remote package: no loader available.");
                Log.e("DynamiteClient", sb.toString());
                return -1;
            } catch (RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String p571Var3 = p571Var.toString();
                StringBuilder sb2 = new StringBuilder(p571Var3.length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(p571Var3);
                sb2.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb2.toString(), e);
                return -1;
            }
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            return remoteContext.getClassLoader();
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context b;
        synchronized (DynamiteClient.class) {
            p571 p571Var = new p571(str, str2);
            try {
                b = getRemoteLibraryLoaderFromInfo(p571Var).b(context);
            } catch (d e) {
                String p571Var2 = p571Var.toString();
                StringBuilder sb = new StringBuilder(p571Var2.length() + 52);
                sb.append("Failed to get remote Context");
                sb.append(p571Var2);
                sb.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb.toString(), e);
                return null;
            }
        }
        return b;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                return null;
            }
            try {
                return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
            } catch (RuntimeException e) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                return null;
            }
        }
    }

    private static synchronized k271 getRemoteLibraryLoaderFromInfo(p571 p571Var) {
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = a;
            k271 k271Var = (k271) arrayMap.get(p571Var);
            if (k271Var != null) {
                return k271Var;
            }
            k271 k271Var2 = new k271(p571Var);
            arrayMap.put(p571Var, k271Var2);
            return k271Var2;
        }
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            p571 p571Var = new p571(str, str2);
            k271 remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(p571Var);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.b(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.b(context));
                if (newNativeLibraryLoader != null) {
                    return newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
                }
                String p571Var2 = p571Var.toString();
                StringBuilder sb = new StringBuilder(p571Var2.length() + 72);
                sb.append("Failed to load native library ");
                sb.append(p571Var2);
                sb.append(" from remote package: no loader available.");
                Log.e("DynamiteClient", sb.toString());
                return 0L;
            } catch (RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String p571Var3 = p571Var.toString();
                StringBuilder sb2 = new StringBuilder(p571Var3.length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(p571Var3);
                sb2.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb2.toString(), e);
                return 0L;
            }
        }
    }
}
