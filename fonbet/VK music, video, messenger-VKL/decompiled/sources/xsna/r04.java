package xsna;

import android.util.Log;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

/* compiled from: AtomicFile.java */
/* loaded from: classes11.dex */
public final class r04 implements si01 {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ r04(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    @Override // xsna.si01
    public void a(ZipFile zipFile, HashSet hashSet) throws IOException {
        HashSet hashSet2 = (HashSet) this.a;
        vl01 vl01Var = (vl01) this.c;
        vp01 vp01Var = (vp01) this.b;
        HashSet hashSet3 = new HashSet();
        vl01Var.c(vp01Var, hashSet, new bh01(hashSet3, vp01Var, zipFile));
        hashSet2.addAll(hashSet3);
    }

    public vw7 b(vw7 vw7Var) {
        ArrayList arrayList;
        ow7 ow7Var;
        Collection collection;
        ArrayList arrayList2 = vw7Var.a;
        List list = (List) this.a;
        if (list.isEmpty()) {
            return vw7Var;
        }
        ow7 ow7Var2 = new ow7(-1, (String) this.c, 9999);
        BookingServiceModel bookingServiceModel = (BookingServiceModel) j5g.k0(j5g.D0(new tmk(), arrayList2));
        int i = 0;
        int i2 = bookingServiceModel != null ? bookingServiceModel.m : 0;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (list.contains(Integer.valueOf(((BookingServiceModel) obj).b))) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList4.add(BookingServiceModel.a((BookingServiceModel) next, 0, 0, 0, i + i2 + 1, 2043));
            i = i3;
        }
        if (arrayList4.isEmpty()) {
            int i4 = i2 + 1;
            ow7Var = ow7Var2;
            arrayList = arrayList2;
            collection = Collections.singletonList(new BookingServiceModel(-1, "", -1, 0, 0, 0, null, null, false, 0, null, i4));
        } else {
            arrayList = arrayList2;
            ow7Var = ow7Var2;
            collection = arrayList4;
        }
        ArrayList arrayList5 = new ArrayList(vw7Var.b);
        arrayList5.add(ow7Var);
        ArrayList arrayList6 = new ArrayList(arrayList);
        arrayList6.addAll((List) collection);
        return new vw7(arrayList6, arrayList5, (List) this.b);
    }

    public FileOutputStream d() throws IOException {
        File file = (File) this.b;
        File file2 = (File) this.c;
        if (file2.exists()) {
            c(file2, (File) this.a);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    public r04(vl01 vl01Var, HashSet hashSet, vp01 vp01Var) {
        this.c = vl01Var;
        this.a = hashSet;
        this.b = vp01Var;
    }

    public r04(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }
}
