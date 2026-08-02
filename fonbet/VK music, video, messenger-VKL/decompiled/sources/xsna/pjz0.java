package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class pjz0 extends njz0 {
    public final int b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public int h = 10;
    public int i = -1;

    public pjz0(String str) {
        this.c = str;
        switch (str) {
            case "preroll":
                this.b = 1;
                break;
            case "postroll":
                this.b = 3;
                break;
            case "pauseroll":
                this.b = 4;
                break;
            case "midroll":
                this.b = 2;
                break;
            default:
                this.b = 0;
                break;
        }
    }

    @Override // xsna.njz0
    public final int a() {
        return this.d.size();
    }

    public final ArrayList b(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            lgz0 lgz0Var = (lgz0) obj;
            if (lgz0Var.s0 == f) {
                arrayList.add(lgz0Var);
            }
        }
        return arrayList;
    }

    public final void c(lgz0 lgz0Var) {
        lgz0Var.u0 = this.b;
        this.d.add(lgz0Var);
    }

    public final void d(lgz0 lgz0Var, int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        if (i < 0 || i > size) {
            gu8.c(null, "MediaSection: can't add banner, wrong position");
            return;
        }
        lgz0Var.u0 = this.b;
        arrayList.add(i, lgz0Var);
        ArrayList arrayList2 = this.g;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            i2++;
            jkz0 jkz0Var = (jkz0) obj;
            int i3 = jkz0Var.o;
            if (i3 >= i) {
                jkz0Var.e(i3 + 1);
            }
        }
    }

    public final void e(pjz0 pjz0Var) {
        ArrayList arrayList = pjz0Var.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c((lgz0) obj);
        }
        this.e.addAll(pjz0Var.e);
        this.f.addAll(pjz0Var.f);
    }

    public final void f(jkz0 jkz0Var) {
        if (jkz0Var.v) {
            this.f.add(jkz0Var);
        } else if (jkz0Var.u) {
            this.e.add(jkz0Var);
        } else {
            this.g.add(jkz0Var);
        }
    }

    public final ArrayList g(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jkz0 jkz0Var = (jkz0) obj;
            if (jkz0Var.s == f) {
                arrayList.add(jkz0Var);
            }
        }
        if (arrayList.size() > 0) {
            arrayList2.removeAll(arrayList);
        }
        return arrayList;
    }

    public final void h() {
        this.g.clear();
    }

    public final List i() {
        return Collections.unmodifiableList(this.d);
    }

    public final List j() {
        return Collections.unmodifiableList(this.f);
    }

    public final boolean k() {
        return "midroll".equals(this.c);
    }
}
