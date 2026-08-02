package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import yads.rw1;
import yads.t31;
import yads.uw1;
import yads.wk2;
import yads.yr1;

/* loaded from: classes7.dex */
public final class m291 extends i571 {
    public static final op81 Z;
    public final qv81[] S;
    public final yn81[] T;
    public final ArrayList U;
    public final jv71 V;
    public int W;
    public long[][] X;
    public yr1 Y;

    static {
        wp71 wp71Var = new wp71();
        p481 p481Var = t31.b;
        wk2 wk2Var = wk2.x;
        Z = new op81("MergingMediaSource", new dw71(wp71Var), null, new q581(-3.4028235E38f, -3.4028235E38f, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L), oi61.b0, qf81.c);
    }

    public m291(qv81... qv81VarArr) {
        jv71 jv71Var = new jv71();
        this.S = qv81VarArr;
        this.V = jv71Var;
        this.U = new ArrayList(Arrays.asList(qv81VarArr));
        this.W = -1;
        this.T = new yn81[qv81VarArr.length];
        this.X = new long[0][];
        new HashMap();
        ela1.a(8, "expectedKeys");
        r381 r381Var = new r381();
        ela1.a(2, "expectedValuesPerKey");
        Map a = r381Var.a();
        rw1 rw1Var = new rw1();
        uw1 uw1Var = new uw1();
        if (!a.isEmpty()) {
            w511.q();
            throw null;
        }
        uw1Var.w = a;
        uw1Var.y = rw1Var;
    }

    @Override // defpackage.qv81
    public final ra71 a(v281 v281Var, xi71 xi71Var, long j) {
        qv81[] qv81VarArr = this.S;
        int length = qv81VarArr.length;
        ra71[] ra71VarArr = new ra71[length];
        yn81[] yn81VarArr = this.T;
        int a = yn81VarArr[0].a(v281Var.a);
        for (int i = 0; i < length; i++) {
            ra71VarArr[i] = qv81VarArr[i].a(v281Var.b(yn81VarArr[i].a(a)), xi71Var, j - this.X[a][i]);
        }
        return new ft81(this.V, this.X[a], ra71VarArr);
    }

    @Override // defpackage.qv81
    public final op81 c() {
        qv81[] qv81VarArr = this.S;
        return qv81VarArr.length > 0 ? qv81VarArr[0].c() : Z;
    }

    @Override // defpackage.i571, defpackage.qv81
    public final void d() {
        yr1 yr1Var = this.Y;
        if (yr1Var != null) {
            throw yr1Var;
        }
        super.d();
    }

    @Override // defpackage.i571, defpackage.qv81
    public final void e() {
        super.e();
        Arrays.fill(this.T, (Object) null);
        this.W = -1;
        this.Y = null;
        ArrayList arrayList = this.U;
        arrayList.clear();
        Collections.addAll(arrayList, this.S);
    }

    @Override // defpackage.i571
    public final v281 f(Object obj, v281 v281Var) {
        if (((Integer) obj).intValue() == 0) {
            return v281Var;
        }
        return null;
    }

    @Override // defpackage.i571
    public final void h(Object obj, qv81 qv81Var, yn81 yn81Var) {
        Integer num = (Integer) obj;
        if (this.Y != null) {
            return;
        }
        if (this.W == -1) {
            this.W = yn81Var.a();
        } else if (yn81Var.a() != this.W) {
            this.Y = new yr1();
            return;
        }
        int length = this.X.length;
        yn81[] yn81VarArr = this.T;
        if (length == 0) {
            this.X = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.W, yn81VarArr.length);
        }
        ArrayList arrayList = this.U;
        arrayList.remove(qv81Var);
        yn81VarArr[num.intValue()] = yn81Var;
        if (arrayList.isEmpty()) {
            a(yn81VarArr[0]);
        }
    }

    @Override // defpackage.qv81
    public final void a(mr81 mr81Var) {
        this.R = mr81Var;
        this.Q = rf71.i(null);
        int i = 0;
        while (true) {
            qv81[] qv81VarArr = this.S;
            if (i >= qv81VarArr.length) {
                return;
            }
            g(Integer.valueOf(i), qv81VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.qv81
    public final void a(ra71 ra71Var) {
        ft81 ft81Var = (ft81) ra71Var;
        int i = 0;
        while (true) {
            qv81[] qv81VarArr = this.S;
            if (i >= qv81VarArr.length) {
                return;
            }
            qv81 qv81Var = qv81VarArr[i];
            ra71 ra71Var2 = ft81Var.a[i];
            if (ra71Var2 instanceof tm81) {
                ra71Var2 = ((tm81) ra71Var2).a;
            }
            qv81Var.a(ra71Var2);
            i++;
        }
    }
}
