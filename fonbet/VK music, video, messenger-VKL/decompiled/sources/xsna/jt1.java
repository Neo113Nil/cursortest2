package xsna;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes11.dex */
public abstract class jt1 {
    public final tra0 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public kt1 h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    /* compiled from: LayoutNodeAlignmentLines.kt */
    public static final class a extends Lambda implements izs<kt1, s3q0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [xsna.kt1, xsna.tra0] */
        @Override // xsna.izs
        public final s3q0 invoke(kt1 kt1Var) {
            kt1 kt1Var2 = kt1Var;
            if (kt1Var2.x() != Integer.MAX_VALUE) {
                if (kt1Var2.q().b) {
                    kt1Var2.K();
                }
                HashMap hashMap = kt1Var2.q().i;
                jt1 jt1Var = jt1.this;
                for (Map.Entry entry : hashMap.entrySet()) {
                    jt1.a(jt1Var, (gt1) entry.getKey(), ((Number) entry.getValue()).intValue(), kt1Var2.L());
                }
                for (androidx.compose.ui.node.o oVar = kt1Var2.L().u; !epx.f(oVar, jt1.this.a.L()); oVar = oVar.u) {
                    Set<gt1> keySet = jt1.this.c(oVar).keySet();
                    jt1 jt1Var2 = jt1.this;
                    for (gt1 gt1Var : keySet) {
                        jt1.a(jt1Var2, gt1Var, jt1Var2.d(oVar, gt1Var), oVar);
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jt1(kt1 kt1Var) {
        this.a = (tra0) kt1Var;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.kt1, xsna.tra0] */
    public static final void a(jt1 jt1Var, gt1 gt1Var, int i, androidx.compose.ui.node.o oVar) {
        long j;
        HashMap hashMap = jt1Var.i;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            j = floatToRawIntBits | floatToRawIntBits2;
            do {
                j = jt1Var.b(oVar, j);
                oVar = oVar.u;
                if (epx.f(oVar, jt1Var.a.L())) {
                    break loop0;
                }
            } while (!jt1Var.c(oVar).containsKey(gt1Var));
            float d = jt1Var.d(oVar, gt1Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(d);
            long floatToRawIntBits4 = Float.floatToRawIntBits(d);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
        int round = Math.round(gt1Var instanceof icv ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
        if (hashMap.containsKey(gt1Var)) {
            int intValue = ((Number) pn00.h(gt1Var, hashMap)).intValue();
            icv icvVar = ht1.a;
            round = gt1Var.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round)).intValue();
        }
        hashMap.put(gt1Var, Integer.valueOf(round));
    }

    public abstract long b(androidx.compose.ui.node.o oVar, long j);

    public abstract Map<gt1, Integer> c(androidx.compose.ui.node.o oVar);

    public abstract int d(androidx.compose.ui.node.o oVar, gt1 gt1Var);

    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean f() {
        i();
        return this.h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.kt1, xsna.tra0] */
    public final void g() {
        this.b = true;
        ?? r0 = this.a;
        kt1 c0 = r0.c0();
        if (c0 == null) {
            return;
        }
        if (this.c) {
            c0.W();
        } else if (this.e || this.d) {
            c0.requestLayout();
        }
        if (this.f) {
            r0.W();
        }
        if (this.g) {
            r0.requestLayout();
        }
        c0.q().g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.kt1, xsna.tra0] */
    public final void h() {
        HashMap hashMap = this.i;
        hashMap.clear();
        a aVar = new a();
        ?? r2 = this.a;
        r2.H(aVar);
        hashMap.putAll(c(r2.L()));
        this.b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.kt1, xsna.tra0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        jt1 q;
        jt1 q2;
        boolean e = e();
        ?? r1 = this.a;
        kt1 kt1Var = r1;
        if (!e) {
            kt1 c0 = r1.c0();
            if (c0 == null) {
                return;
            }
            kt1 kt1Var2 = c0.q().h;
            if (kt1Var2 != null) {
                boolean e2 = kt1Var2.q().e();
                kt1Var = kt1Var2;
            }
            kt1 kt1Var3 = this.h;
            if (kt1Var3 == null || kt1Var3.q().e()) {
                return;
            }
            kt1 c02 = kt1Var3.c0();
            if (c02 != null && (q2 = c02.q()) != null) {
                q2.i();
            }
            kt1 c03 = kt1Var3.c0();
            kt1Var = (c03 == null || (q = c03.q()) == null) ? null : q.h;
        }
        this.h = kt1Var;
    }
}
