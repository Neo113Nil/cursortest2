package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class ao7 {
    public final HashMap a;
    public final ArrayList b;
    public int c;
    public int d;

    public ao7(HashMap hashMap) {
        this.a = hashMap;
        this.b = new ArrayList(hashMap.keySet());
        for (Integer num : hashMap.values()) {
            this.c = num.intValue() + this.c;
        }
    }

    public void a(int i) {
        this.b.add(Integer.valueOf(i));
    }

    public ao7() {
        this.b = new ArrayList();
        this.a = new HashMap();
        this.c = 1;
    }

    public ao7(int i, int i2, ArrayList arrayList, HashMap hashMap) {
        this.c = i;
        this.d = i2;
        this.a = hashMap;
        this.b = arrayList;
    }
}
