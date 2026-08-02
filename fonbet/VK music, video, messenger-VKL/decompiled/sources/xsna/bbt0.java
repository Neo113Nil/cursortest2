package xsna;

import android.util.SparseArray;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import xsna.hbt0;

/* compiled from: VideoRecyclerPreloaderImpl.kt */
/* loaded from: classes2.dex */
public final class bbt0 {
    public final ai5 a;
    public final db80 b;
    public final boolean c;
    public final String d;
    public int e;
    public final hbt0.b f;
    public final SparseArray<yg5> g = new SparseArray<>();
    public final SparseArray<a> h = new SparseArray<>();
    public final ArrayList<Integer> i = new ArrayList<>();

    /* compiled from: VideoRecyclerPreloaderImpl.kt */
    public static final class a {
        public final yg5 a;
        public final int b;
        public final int c;

        public a(yg5 yg5Var, int i, int i2) {
            this.a = yg5Var;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AutoPlayWrapper(autoPlay=");
            sb.append(this.a);
            sb.append(", outerIndex=");
            sb.append(this.b);
            sb.append(", innerIndex=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public bbt0(ai5 ai5Var, db80 db80Var, boolean z, String str) {
        this.a = ai5Var;
        this.b = db80Var;
        this.c = z;
        this.d = str;
        this.f = new hbt0.b(ai5Var);
        new SparseArray();
    }

    public final void a(yg5 yg5Var, int i, int i2) {
        if (i2 != -1) {
            i = i2;
        }
        this.g.put(i, yg5Var);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        HashMap<yg5, Set<String>> hashMap = a2.w;
        HashSet<String> hashSet = a2.v;
        String str = this.d;
        if (hashSet.contains(str)) {
            Set<String> set = hashMap.get(yg5Var);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(str);
            hashMap.put(yg5Var, set);
        } else {
            L.l("Helper is not attached to do add operation");
        }
        boolean z = false;
        boolean z2 = yg5Var.isPrepared() || yg5Var.d();
        if (yg5Var.A().T3() && (yg5Var.p0() || this.c)) {
            z = true;
        }
        if (z2 || !z || yg5Var.D0()) {
            return;
        }
        yg5Var.G0(true);
    }

    public final void b(SparseArray<yg5> sparseArray, int i) {
        yg5 yg5Var = sparseArray.get(i);
        if (yg5Var != null) {
            yg5Var.pause();
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
            HashSet<String> hashSet = a2.v;
            String str = this.d;
            if (hashSet.contains(str)) {
                Set<String> set = a2.w.get(yg5Var);
                if (set != null && set.remove(str) && set.isEmpty()) {
                    a2.k(str, yg5Var);
                }
            } else {
                L.l("Helper is not attached to do remove operation");
            }
            sparseArray.remove(i);
        }
    }

    public final void c() {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
        ArrayList<Integer> arrayList = this.i;
        arrayList.clear();
        SparseArray<yg5> sparseArray = this.g;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            yg5 valueAt = sparseArray.valueAt(i);
            if (valueAt != null && valueAt != yg5Var) {
                arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b(sparseArray, arrayList.get(i2).intValue());
        }
    }
}
