package xsna;

import java.util.ArrayList;

/* compiled from: AnimatedImageVector.kt */
/* loaded from: classes11.dex */
public final class yk2 {
    public final imw a;
    public final ArrayList b;
    public final int c;

    /* compiled from: AnimatedImageVector.kt */
    public static final class a {
    }

    public yk2(imw imwVar, ArrayList arrayList) {
        Object obj;
        this.a = imwVar;
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int c = ((jm2) obj).b.c();
            int h = e43.h(arrayList);
            int i = 1;
            if (1 <= h) {
                while (true) {
                    Object obj2 = arrayList.get(i);
                    int c2 = ((jm2) obj2).b.c();
                    if (c < c2) {
                        obj = obj2;
                        c = c2;
                    }
                    if (i == h) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        jm2 jm2Var = (jm2) obj;
        this.c = jm2Var != null ? jm2Var.b.c() : 0;
    }
}
