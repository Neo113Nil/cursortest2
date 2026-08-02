package xsna;

import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class jkz0 {
    public Boolean A;
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public fwy J;
    public wty0 K;
    public final String a;
    public ArrayList e;
    public ArrayList f;
    public jkz0 g;
    public String h;
    public String i;
    public String j;
    public y5z0 k;
    public String l;
    public int m;
    public boolean u;
    public boolean v;
    public Boolean x;
    public Boolean y;
    public Boolean z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final e5z0 d = e5z0.a(giy0.d, null);
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public float s = -1.0f;
    public float t = -1.0f;
    public float w = -1.0f;

    public jkz0(String str, String str2) {
        this.a = str;
    }

    public final float a() {
        return this.s;
    }

    public final float b() {
        return this.t;
    }

    public final ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            z1z0 z1z0Var = (z1z0) obj;
            if (str.equals(z1z0Var.a)) {
                arrayList.add(z1z0Var);
            }
        }
        return arrayList;
    }

    public final void d(float f) {
        this.s = f;
    }

    public final void e(int i) {
        this.o = i;
        jkz0 jkz0Var = this.g;
        if (jkz0Var != null) {
            jkz0Var.e(i);
        }
    }

    public final int f() {
        return this.n;
    }
}
