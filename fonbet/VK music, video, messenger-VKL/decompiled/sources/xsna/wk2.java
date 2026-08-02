package xsna;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AnimatedImageResult.java */
/* loaded from: classes12.dex */
public final class wk2 {
    public final pk2 a;
    public final String b;
    public uvf<Bitmap> c;
    public ArrayList d;

    public wk2(xk2 xk2Var) {
        ArrayList arrayList;
        pk2 pk2Var = (pk2) xk2Var.a;
        pk2Var.getClass();
        this.a = pk2Var;
        this.c = uvf.o((uvf) xk2Var.b);
        ArrayList arrayList2 = (ArrayList) xk2Var.c;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(uvf.o((uvf) it.next()));
            }
            arrayList = arrayList3;
        }
        this.d = arrayList;
        this.b = (String) xk2Var.d;
    }

    public final pk2 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public wk2(pk2 pk2Var) {
        pk2Var.getClass();
        this.a = pk2Var;
    }
}
