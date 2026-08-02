package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class nsz {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public pnt0 h;
    public rnz i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public final mwa0 a = new mwa0();
    public final HashSet b = new HashSet();
    public int o = 0;

    public final void a(String str) {
        lgz.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float c = zw21.c();
        if (c != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap hashMap = this.d;
                String str = (String) entry.getKey();
                wtz wtzVar = (wtz) entry.getValue();
                float f = this.e / c;
                int i = (int) (wtzVar.a * f);
                int i2 = (int) (wtzVar.b * f);
                wtz wtzVar2 = new wtz(i, i2, wtzVar.c, wtzVar.d, wtzVar.e);
                Bitmap bitmap = wtzVar.f;
                if (bitmap != null) {
                    wtzVar2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                hashMap.put(str, wtzVar2);
            }
        }
        this.e = c;
        return this.d;
    }

    public final xw00 d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            xw00 xw00Var = (xw00) this.g.get(i);
            if (xw00Var.a(str)) {
                return xw00Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((mxx) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
