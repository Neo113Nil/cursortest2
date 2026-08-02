package defpackage;

import com.yandex.go.slot.dto.k2;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public final class lnk0 {
    public final WeakHashMap a = new WeakHashMap();
    public final WeakHashMap b = new WeakHashMap();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(k2 k2Var) {
        boolean z;
        WeakHashMap weakHashMap = this.a;
        if (k2Var != null) {
            n7v a = k2Var.getA();
            if (jl40.l(weakHashMap.get(Integer.valueOf(a != null ? a.hashCode() : 0)), k2Var)) {
                z = true;
                n7v a2 = k2Var == null ? k2Var.getA() : null;
                weakHashMap.put(Integer.valueOf(a2 != null ? a2.hashCode() : 0), k2Var);
                return !z;
            }
        }
        z = false;
        if (k2Var == null) {
        }
        weakHashMap.put(Integer.valueOf(a2 != null ? a2.hashCode() : 0), k2Var);
        return !z;
    }

    public final boolean b(srs0 srs0Var) {
        Integer valueOf = Integer.valueOf(srs0Var.getA().hashCode());
        WeakHashMap weakHashMap = this.b;
        boolean l = jl40.l(weakHashMap.get(valueOf), srs0Var);
        weakHashMap.put(Integer.valueOf(srs0Var.getA().hashCode()), srs0Var);
        return !l;
    }
}
