package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Storage.kt */
/* loaded from: classes11.dex */
public final class kgl0 {
    public final Map<UserId, List<x9y>> a;
    public final List<Integer> b;
    public final ArrayList<Integer> c;
    public final boolean d;
    public double e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kgl0() {
        this(15, r0, r0);
        ArrayList arrayList = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgl0)) {
            return false;
        }
        kgl0 kgl0Var = (kgl0) obj;
        return epx.f(this.a, kgl0Var.a) && epx.f(this.b, kgl0Var.b) && epx.f(this.c, kgl0Var.c) && this.d == kgl0Var.d;
    }

    public final int hashCode() {
        Map<UserId, List<x9y>> map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<Integer> list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageData(data=");
        sb.append(this.a);
        sb.append(", indexes=");
        sb.append(this.b);
        sb.append(", obsoleteIndexes=");
        sb.append(this.c);
        sb.append(", hitLimit=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ kgl0(int i, ArrayList arrayList, ArrayList arrayList2) {
        this(null, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : arrayList2, false);
    }

    public kgl0(LinkedHashMap linkedHashMap, List list, ArrayList arrayList, boolean z) {
        this.a = linkedHashMap;
        this.b = list;
        this.c = arrayList;
        this.d = z;
    }
}
