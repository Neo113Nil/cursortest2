package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class a3b1 {
    public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final ndi0 a;

    public a3b1(ndi0 ndi0Var) {
        this.a = ndi0Var;
    }

    public static void b(a891 a891Var, dma1 dma1Var) {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(a891Var.a());
            try {
                HashMap hashMap = new HashMap();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = b.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Set set = (Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new xxa1(nextElement, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(str)) {
                        for (xxa1 xxa1Var : (Set) hashMap.get(str)) {
                            String str2 = xxa1Var.a;
                            if (!hashMap2.containsKey(str2)) {
                                hashMap2.put(str2, xxa1Var);
                            }
                        }
                    }
                }
                dma1Var.a(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
            } catch (IOException e) {
                e = e;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                    }
                }
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            zipFile = null;
        }
    }

    public final HashSet a() {
        ndi0 ndi0Var = this.a;
        HashSet f = ndi0Var.f();
        ArrayList arrayList = new ArrayList();
        File file = new File(ndi0Var.l(), "native-libraries");
        ndi0.j(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Log.i("SplitCompat", "NativeLibraryExtractor: extracted split '" + str + "' has no corresponding split; deleting");
                    File file3 = new File(ndi0Var.l(), "native-libraries");
                    ndi0.j(file3);
                    File i = ndi0.i(file3, str);
                    ndi0.j(i);
                    ndi0.h(i);
                    break;
                }
                if (((a891) it2.next()).b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = f.iterator();
        while (it3.hasNext()) {
            a891 a891Var = (a891) it3.next();
            HashSet hashSet2 = new HashSet();
            b(a891Var, new p891(5, (Serializable) hashSet2, (Object) this, (Object) a891Var));
            String b2 = a891Var.b();
            HashSet hashSet3 = new HashSet();
            File file4 = new File(ndi0Var.l(), "native-libraries");
            ndi0.j(file4);
            File i2 = ndi0.i(file4, b2);
            ndi0.j(i2);
            File[] listFiles2 = i2.listFiles();
            if (listFiles2 != null) {
                for (File file5 : listFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    String absolutePath = file6.getAbsolutePath();
                    String b3 = a891Var.b();
                    String absolutePath2 = a891Var.a().getAbsolutePath();
                    StringBuilder v = b64.v("NativeLibraryExtractor: file '", absolutePath, "' found in split '", b3, "' that is not in the split file '");
                    v.append(absolutePath2);
                    v.append("'; removing");
                    Log.i("SplitCompat", v.toString());
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(ndi0Var.l(), "native-libraries");
                    ndi0.j(file7);
                    if (!parentFile.equals(file7)) {
                        ny61.r("File to remove is not a native library");
                        return null;
                    }
                    ndi0.h(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(a891 a891Var, HashSet hashSet, dsa1 dsa1Var) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            xxa1 xxa1Var = (xxa1) it.next();
            String b2 = a891Var.b();
            String str = xxa1Var.a;
            ndi0 ndi0Var = this.a;
            ndi0Var.getClass();
            File file = new File(ndi0Var.l(), "native-libraries");
            ndi0.j(file);
            File i = ndi0.i(file, b2);
            ndi0.j(i);
            File i2 = ndi0.i(i, str);
            boolean z = false;
            if (i2.exists() && i2.length() == xxa1Var.b.getSize() && !i2.canWrite()) {
                z = true;
            }
            dsa1Var.c(xxa1Var, i2, z);
        }
    }
}
