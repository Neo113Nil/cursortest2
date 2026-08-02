package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public interface n7r extends hh70 {
    default LinkedHashMap b() {
        LinkedHashMap b = super.b();
        b.put("original_coordinate", hh70.c(d()));
        return b;
    }

    zzs d();
}
