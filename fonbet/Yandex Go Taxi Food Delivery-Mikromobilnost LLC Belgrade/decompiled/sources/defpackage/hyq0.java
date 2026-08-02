package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class hyq0 extends cyq0 {
    public final aow0 j = new aow0();
    public boolean k = true;
    public final StringBuilder l = new StringBuilder();
    public boolean m = false;
    public final ArrayList n = new ArrayList();

    public final void a(jyq0 jyq0Var) {
        s38 s38Var = jyq0Var.g;
        int i = s38Var.c;
        r38 r38Var = this.b;
        if (i != -1) {
            this.m = true;
            int i2 = r38Var.c;
            List list = jyq0.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            r38Var.c = i;
        }
        Range a = s38Var.a();
        Range range = lru0.a;
        boolean equals = a.equals(range);
        StringBuilder sb = this.l;
        if (!equals) {
            yy40 yy40Var = r38Var.b;
            x34 x34Var = s38.k;
            boolean equals2 = ((Range) yy40Var.g(x34Var, range)).equals(range);
            yy40 yy40Var2 = r38Var.b;
            if (equals2) {
                yy40Var2.w(x34Var, a);
            } else if (!((Range) yy40Var2.g(x34Var, range)).equals(a)) {
                this.k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) r38Var.b.g(x34Var, range)) + ", new = " + a;
                sgb1.d("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        int c = s38Var.c();
        if (c != 0) {
            r38Var.getClass();
            if (c != 0) {
                r38Var.b.w(xi21.u4, Integer.valueOf(c));
            }
        }
        int d = s38Var.d();
        if (d != 0) {
            r38Var.getClass();
            if (d != 0) {
                r38Var.b.w(xi21.w4, Integer.valueOf(d));
            }
        }
        q6x0 q6x0Var = s38Var.g;
        rz40 rz40Var = r38Var.g;
        HashSet hashSet = r38Var.a;
        rz40Var.a.putAll((Map) q6x0Var.a);
        this.c.addAll(jyq0Var.c);
        this.d.addAll(jyq0Var.d);
        r38Var.a(s38Var.e);
        this.e.addAll(jyq0Var.e);
        fyq0 fyq0Var = jyq0Var.f;
        if (fyq0Var != null) {
            this.n.add(fyq0Var);
        }
        InputConfiguration inputConfiguration = jyq0Var.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = jyq0Var.a;
        LinkedHashSet<gyq0> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(s38Var.a));
        ArrayList arrayList2 = new ArrayList();
        for (gyq0 gyq0Var : linkedHashSet) {
            arrayList2.add(gyq0Var.f());
            Iterator it = gyq0Var.e().iterator();
            while (it.hasNext()) {
                arrayList2.add((DeferrableSurface) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            sgb1.g(3, "ValidatingBuilder");
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = jyq0Var.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            sgb1.g(3, "ValidatingBuilder");
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        gyq0 gyq0Var2 = jyq0Var.b;
        if (gyq0Var2 != null) {
            gyq0 gyq0Var3 = this.i;
            if (gyq0Var3 == gyq0Var2 || gyq0Var3 == null) {
                this.i = gyq0Var2;
            } else {
                sgb1.g(3, "ValidatingBuilder");
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        r38Var.c(s38Var.b);
    }

    public final jyq0 b() {
        if (!this.k) {
            ny61.g("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.a);
        aow0 aow0Var = this.j;
        if (aow0Var.a) {
            Collections.sort(arrayList, new oe7(13, aow0Var));
        }
        int i = this.h;
        int i2 = 3;
        r38 r38Var = this.b;
        if (i == 1) {
            new jju();
            if (arrayList.size() == 2 && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (jl40.l(((gyq0) it.next()).f().j, MediaCodec.class)) {
                        HashSet hashSet = r38Var.a;
                        if (!hashSet.isEmpty()) {
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                if (jl40.l(((DeferrableSurface) it2.next()).j, MediaCodec.class)) {
                                    break;
                                }
                            }
                        }
                        yy40 yy40Var = r38Var.b;
                        x34 x34Var = s38.k;
                        Range range = (Range) yy40Var.g(x34Var, lru0.a);
                        if (range != null) {
                            if (((Number) range.getUpper()).intValue() < 120 || !jl40.l(range.getLower(), range.getUpper())) {
                                range = null;
                            }
                            if (range != null) {
                                Range range2 = new Range(30, range.getUpper());
                                range.toString();
                                range2.toString();
                                sgb1.g(3, "HighSpeedFpsModifier");
                                r38Var.b.w(x34Var, range2);
                            }
                        }
                    }
                }
            }
        }
        return new jyq0(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), r38Var.e(), this.n.isEmpty() ? null : new p8v(i2, this), this.g, this.h, this.i);
    }

    public final boolean c() {
        return this.m && this.k;
    }
}
