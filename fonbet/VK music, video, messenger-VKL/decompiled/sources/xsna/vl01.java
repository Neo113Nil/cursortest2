package xsna;

import android.os.Build;
import java.io.File;
import java.io.IOException;
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

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class vl01 {
    public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final t801 a;

    public vl01(t801 t801Var) throws IOException {
        this.a = t801Var;
    }

    public static void b(vp01 vp01Var, si01 si01Var) throws IOException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(vp01Var.a());
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
                        set.add(new vk01(nextElement, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(str)) {
                        for (vk01 vk01Var : (Set) hashMap.get(str)) {
                            String str2 = vk01Var.a;
                            if (!hashMap2.containsKey(str2)) {
                                hashMap2.put(str2, vk01Var);
                            }
                        }
                    }
                }
                si01Var.a(zipFile, new HashSet(hashMap2.values()));
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

    public final HashSet a() throws IOException {
        t801 t801Var = this.a;
        HashSet a = t801Var.a();
        ArrayList arrayList = new ArrayList();
        File file = new File(t801Var.g(), "native-libraries");
        t801.e(file);
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
            Iterator it2 = a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    File file3 = new File(t801Var.g(), "native-libraries");
                    t801.e(file3);
                    File d = t801.d(file3, str);
                    t801.e(d);
                    t801.c(d);
                    break;
                }
                if (((vp01) it2.next()).b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            vp01 vp01Var = (vp01) it3.next();
            HashSet hashSet2 = new HashSet();
            b(vp01Var, new r04(this, hashSet2, vp01Var));
            String b2 = vp01Var.b();
            HashSet hashSet3 = new HashSet();
            File file4 = new File(t801Var.g(), "native-libraries");
            t801.e(file4);
            File d2 = t801.d(file4, b2);
            t801.e(d2);
            File[] listFiles2 = d2.listFiles();
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
                    file6.getAbsolutePath();
                    vp01Var.a().getAbsolutePath();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(t801Var.g(), "native-libraries");
                    t801.e(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    t801.c(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(vp01 vp01Var, HashSet hashSet, dk01 dk01Var) throws IOException {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vk01 vk01Var = (vk01) it.next();
            String b2 = vp01Var.b();
            String str = vk01Var.a;
            t801 t801Var = this.a;
            t801Var.getClass();
            File file = new File(t801Var.g(), "native-libraries");
            t801.e(file);
            File d = t801.d(file, b2);
            t801.e(d);
            File d2 = t801.d(d, str);
            boolean z = false;
            if (d2.exists() && d2.length() == vk01Var.b.getSize() && !d2.canWrite()) {
                z = true;
            }
            dk01Var.f(vk01Var, d2, z);
        }
    }
}
