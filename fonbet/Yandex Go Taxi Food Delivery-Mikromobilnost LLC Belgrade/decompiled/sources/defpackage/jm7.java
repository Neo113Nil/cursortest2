package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class jm7 implements zqw {
    public final kr7 b;
    public final Object a = new Object();
    public HashMap d = new HashMap();
    public HashSet e = new HashSet();
    public final ArrayList f = new ArrayList();
    public int g = 0;
    public final ArrayList c = new ArrayList();

    public jm7(kr7 kr7Var) {
        this.b = kr7Var;
        try {
            a(Arrays.asList(kr7Var.b()));
        } catch (CameraAccessExceptionCompat | CameraUpdateException e) {
            sgb1.e("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e);
        }
    }

    @Override // defpackage.zqw
    public final void a(List list) {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.b.a.j()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (wdb1.j(this.b, str) && wdb1.j(this.b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!hashMap.containsKey(str)) {
                                    hashMap.put(str, new ArrayList());
                                }
                                ((List) hashMap.get(str)).add(str2);
                                if (!hashMap.containsKey(str2)) {
                                    hashMap.put(str2, new ArrayList());
                                }
                                ((List) hashMap.get(str2)).add(str);
                            }
                        } catch (InitializationException unused) {
                            sgb1.g(3, "Camera2CameraCoordinator");
                        }
                    }
                }
            }
            synchronized (this.a) {
                this.d = hashMap;
                this.e = hashSet;
                Objects.toString(hashMap);
                sgb1.g(3, "Camera2CameraCoordinator");
            }
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info.", e);
        }
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            i = this.g;
        }
        return i;
    }

    public final String c(String str) {
        synchronized (this.a) {
            try {
                if (!this.d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(pm7.a((ar7) it.next()).a.a)) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
