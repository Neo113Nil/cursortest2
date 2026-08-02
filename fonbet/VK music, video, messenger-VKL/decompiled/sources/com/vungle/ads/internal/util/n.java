package com.vungle.ads.internal.util;

import android.webkit.URLUtil;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.l;
import xsna.drm0;
import xsna.e43;
import xsna.emb;
import xsna.m2o0;
import xsna.nbr;

/* loaded from: classes7.dex */
public abstract class n {
    public static m a = new m2o0(7);
    public static final List b = e43.l(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    public static final ObjectInputStream a(InputStream inputStream) {
        return new x(inputStream, b);
    }

    public static final void b(File file, Set set) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            a(file2, set);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0027: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:40), block:B:48:0x0027 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.vungle.ads.internal.util.m] */
    public static final Object c(File file) {
        Closeable closeable;
        Closeable closeable2;
        ObjectInputStream objectInputStream;
        Closeable closeable3;
        ?? exists = file.exists();
        Closeable closeable4 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
                try {
                    objectInputStream = a.a(exists);
                    try {
                        Object readObject = objectInputStream.readObject();
                        a((Closeable) objectInputStream);
                        a((Closeable) exists);
                        return readObject;
                    } catch (IOException e) {
                        e = e;
                        boolean z = u.a;
                        t.b("FileUtility", "IOException: " + e.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        try {
                            a(file, (Set) null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        boolean z2 = u.a;
                        t.b("FileUtility", "ClassNotFoundException: " + e.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        a(file, (Set) null);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        boolean z3 = u.a;
                        t.b("FileUtility", "cannot read serializable " + e.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        a(file, (Set) null);
                        return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectInputStream = null;
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    objectInputStream = null;
                } catch (Exception e6) {
                    e = e6;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable4;
                    closeable4 = exists;
                    a(closeable2);
                    a(closeable4);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e9) {
                e = e9;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = null;
                a(closeable2);
                a(closeable4);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable4 = closeable;
        }
    }

    public static String d(File file) {
        if (!file.exists()) {
            return null;
        }
        try {
            return nbr.r(file, emb.b);
        } catch (IOException e) {
            boolean z = u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("IOException: ");
            a2.append(e.getMessage());
            t.b("FileUtility", a2.toString());
            return null;
        } catch (Exception e2) {
            boolean z2 = u.a;
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("cannot read string ");
            a3.append(e2.getMessage());
            t.b("FileUtility", a3.toString());
            return null;
        }
    }

    public static final void a(File file, Set set) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            boolean z = u.a;
                            t.a("FileUtility", "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        b(file, set);
                    }
                    if (set != null && set.contains(file.getName())) {
                        boolean z2 = u.a;
                        t.a("FileUtility", "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    boolean z3 = u.a;
                    t.a("FileUtility", "Failed to delete file: " + file);
                }
            } catch (Exception e) {
                boolean z4 = u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Failed to delete file: ");
                a2.append(e.getLocalizedMessage());
                t.b("FileUtility", a2.toString());
            }
        }
    }

    public static final void b(File file) {
        try {
            Files.delete(file.toPath());
        } catch (Exception e) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Failed to delete ");
            a2.append(file.getName());
            a2.append(" with error :");
            a2.append(e.getMessage());
            new AssetFailedToDeleteError(a2.toString()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void a(File file, Serializable serializable) {
        Throwable th;
        ?? r2;
        IOException e;
        FileOutputStream fileOutputStream;
        Closeable closeable;
        if (file.exists()) {
            b(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                r2 = new ObjectOutputStream(fileOutputStream);
            } catch (IOException e2) {
                e = e2;
                r2 = 0;
            } catch (Throwable th2) {
                th = th2;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            r2 = 0;
        } catch (Throwable th3) {
            th = th3;
            r2 = 0;
            fileOutputStream = fileOutputStream2;
            fileOutputStream2 = r2;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
        try {
            r2.writeObject(serializable);
            r2.reset();
            closeable = r2;
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            r2 = r2;
            try {
                boolean z = u.a;
                t.b("FileUtility", String.valueOf(e.getMessage()));
                fileOutputStream = fileOutputStream2;
                closeable = r2;
                a(closeable);
                a(fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
                fileOutputStream2 = r2;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream2 = r2;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
        a(closeable);
        a(fileOutputStream);
    }

    public static void a(File file, String str) {
        if (str == null) {
            return;
        }
        try {
            nbr.w(file, str, emb.b);
        } catch (IOException e) {
            boolean z = u.a;
            t.b("FileUtility", String.valueOf(e.getMessage()));
        }
    }

    public static boolean a(String str) {
        if (str != null) {
            try {
                if (!drm0.N(str)) {
                    okhttp3.l lVar = null;
                    try {
                        l.a aVar = new l.a();
                        aVar.e(null, str);
                        lVar = aVar.b();
                    } catch (IllegalArgumentException unused) {
                    }
                    if (lVar != null) {
                        return true;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    public static String a(String str, String str2) {
        return URLUtil.guessFileName(str, null, str2);
    }
}
