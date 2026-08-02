package xsna;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes12.dex */
public final class i700 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public wik0<r4s> h;
    public x500<Layer> i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public final ix90 a = new ix90();
    public final HashSet<String> b = new HashSet<>();
    public int o = 0;

    public final void a(String str) {
        n100.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) ((c() / this.n) * 1000.0f);
    }

    public final float c() {
        return this.m - this.l;
    }

    public final Map<String, q800> d() {
        float c = b3r0.c();
        if (c != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap hashMap = this.d;
                String str = (String) entry.getKey();
                q800 q800Var = (q800) entry.getValue();
                float f = this.e / c;
                int i = (int) (q800Var.a * f);
                int i2 = (int) (q800Var.b * f);
                q800 q800Var2 = new q800(i, i2, q800Var.c, q800Var.d, q800Var.e);
                Bitmap bitmap = q800Var.f;
                if (bitmap != null) {
                    q800Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                hashMap.put(str, q800Var2);
            }
        }
        this.e = c;
        return this.d;
    }

    @Nullable
    public final go00 e(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            go00 go00Var = (go00) this.g.get(i);
            String str2 = go00Var.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return go00Var;
            }
        }
        return null;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((Layer) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
