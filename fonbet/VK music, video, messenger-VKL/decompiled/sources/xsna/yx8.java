package xsna;

import android.content.Context;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.log.L;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.text.Regex;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: CacheUtils.java */
/* loaded from: classes7.dex */
public final class yx8 {
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File a(String str) {
        int i;
        File file;
        String num;
        Context context;
        File[] fileArr;
        int i2;
        File file2;
        Context context2 = e43.a;
        File[] externalCacheDirs = context2.getExternalCacheDirs();
        int i3 = 0;
        if (externalCacheDirs == null || externalCacheDirs.length == 0) {
            i = 0;
            file = null;
        } else {
            int length = externalCacheDirs.length;
            int i4 = 0;
            File file3 = null;
            while (true) {
                if (i4 >= length) {
                    Context context3 = context2;
                    i = i3;
                    if (file3 == null) {
                        file3 = context3.getCacheDir();
                    }
                    file = new File(file3, "PlayerProxy");
                } else {
                    file = externalCacheDirs[i4];
                    if (file != null) {
                        try {
                            File[] listFiles = file.listFiles();
                            if (listFiles != null) {
                                ArrayList arrayList = new ArrayList();
                                Collections.addAll(arrayList, listFiles);
                                Collections.sort(arrayList, new xx8(i3));
                                long j = 0;
                                for (int i5 = i3; i5 < arrayList.size(); i5++) {
                                    j += ((File) arrayList.get(i5)).length();
                                }
                                int size = arrayList.size() - 1;
                                while (size >= 0 && (j > 104857600 || size >= 4)) {
                                    File file4 = (File) arrayList.get(size);
                                    if (file4.getName().endsWith(".info")) {
                                        try {
                                            context = context2;
                                        } catch (Exception e) {
                                            e = e;
                                            context = context2;
                                        }
                                        try {
                                            fileArr = externalCacheDirs;
                                            i2 = length;
                                            i = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                            fileArr = externalCacheDirs;
                                            i2 = length;
                                            i = 0;
                                            L.i(e);
                                            Regex regex = com.vk.core.files.a.a;
                                            if (!com.vk.core.files.a.A(file.getAbsolutePath())) {
                                            }
                                            if (file3 != null) {
                                            }
                                            file3 = file;
                                            i4++;
                                            i3 = i;
                                            context2 = context;
                                            length = i2;
                                            externalCacheDirs = fileArr;
                                        }
                                        try {
                                            file2 = new File(file4.getParentFile(), file4.getName().substring(0, file4.getName().length() - 5));
                                        } catch (Exception e3) {
                                            e = e3;
                                            L.i(e);
                                            Regex regex2 = com.vk.core.files.a.a;
                                            if (!com.vk.core.files.a.A(file.getAbsolutePath())) {
                                            }
                                            if (file3 != null) {
                                            }
                                            file3 = file;
                                            i4++;
                                            i3 = i;
                                            context2 = context;
                                            length = i2;
                                            externalCacheDirs = fileArr;
                                        }
                                    } else {
                                        context = context2;
                                        fileArr = externalCacheDirs;
                                        i2 = length;
                                        i = i3;
                                        file2 = new File(file4.getParentFile(), file4.getName() + ".info");
                                    }
                                    j = (j - file4.length()) - file2.length();
                                    file4.delete();
                                    file2.delete();
                                    L.e("Clear audio file", file4);
                                    L.e("Clear audio file", file2);
                                    size--;
                                    i3 = i;
                                    context2 = context;
                                    length = i2;
                                    externalCacheDirs = fileArr;
                                }
                            }
                            context = context2;
                            fileArr = externalCacheDirs;
                            i2 = length;
                            i = i3;
                        } catch (Exception e4) {
                            e = e4;
                            context = context2;
                            fileArr = externalCacheDirs;
                            i2 = length;
                            i = i3;
                        }
                        Regex regex22 = com.vk.core.files.a.a;
                        if (!com.vk.core.files.a.A(file.getAbsolutePath())) {
                            if (file.getUsableSpace() > ServiceProvider.HTTP_CACHE_DISK_SIZE) {
                                break;
                            }
                            if (file.exists()) {
                                File[] listFiles2 = file.listFiles();
                                int length2 = listFiles2.length;
                                for (int i6 = i; i6 < length2; i6++) {
                                    listFiles2[i6].delete();
                                }
                            }
                        }
                        if (file3 != null || file3.getUsableSpace() < file.getUsableSpace()) {
                            file3 = file;
                        }
                    } else {
                        context = context2;
                        fileArr = externalCacheDirs;
                        i2 = length;
                        i = i3;
                    }
                    i4++;
                    i3 = i;
                    context2 = context;
                    length = i2;
                    externalCacheDirs = fileArr;
                }
            }
        }
        if (str == null) {
            num = null;
        } else {
            try {
                byte[] digest = MessageDigest.getInstance("SHA").digest(str.getBytes());
                char[] cArr = new char[digest.length * 2];
                for (int i7 = i; i7 < digest.length; i7++) {
                    byte b = digest[i7];
                    int i8 = (b >>> 4) & 15;
                    int i9 = b & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
                    int i10 = i7 * 2;
                    cArr[i10] = (char) (i8 < 10 ? i8 + 48 : i8 + 87);
                    cArr[i10 + 1] = (char) (i9 < 10 ? i9 + 48 : i9 + 87);
                }
                num = new String(cArr);
            } catch (NoSuchAlgorithmException unused) {
                num = Integer.toString(str.hashCode());
            }
        }
        File file5 = new File(file, num);
        if (str == null || "null".equals(str)) {
            file5.delete();
        }
        return file5;
    }
}
