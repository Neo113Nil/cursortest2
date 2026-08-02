package xsna;

import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.o6j;
import xsna.q630;
import xsna.v4s;

/* compiled from: TextStringSimpleNode.kt */
/* loaded from: classes11.dex */
public final class mmo0 extends q630.c implements noy, lio, fgi0 {
    public ap30 A;
    public a B;
    public String p;
    public nmo0 q;
    public v4s.a r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public o7g w;
    public HashMap x;
    public eh90 y;
    public nmo0 z;

    /* compiled from: TextStringSimpleNode.kt */
    public static final class a {
        public final String a;
        public String b;
        public boolean c = false;
        public eh90 d = null;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            eh90 eh90Var = this.d;
            return b + (eh90Var == null ? 0 : eh90Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.d);
            sb.append(", isShowingSubstitution=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            eh90 j2 = j2(ep10Var);
            boolean b = j2.b(j, ep10Var.getLayoutDirection());
            ch90 ch90Var = j2.n;
            if (ch90Var != null) {
                ch90Var.b();
            }
            s3q0 s3q0Var = s3q0.a;
            ya2 ya2Var = j2.j;
            long j3 = j2.l;
            if (b) {
                itl.d(this, 2).P1();
                HashMap hashMap = this.x;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.x = hashMap;
                }
                hashMap.put(ht1.a, Integer.valueOf(Math.round(ya2Var.b())));
                hashMap.put(ht1.b, Integer.valueOf(Math.round(ya2Var.d())));
            }
            int i = (int) (j3 >> 32);
            int i2 = (int) (j3 & 4294967295L);
            dp10 Q = ep10Var.Q(i, i2, this.x, new cim0(zo10Var.N(o6j.a.b(i, i, i2, i2)), 4));
            Trace.endSection();
            return Q;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final eh90 i2() {
        nmo0 nmo0Var = this.z;
        if (nmo0Var == null) {
            nmo0Var = this.q;
        }
        nmo0 nmo0Var2 = nmo0Var;
        if (this.y == null) {
            this.y = new eh90(this.p, nmo0Var2, this.r, this.s, this.t, this.u, this.v);
        }
        return this.y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eh90 j2(ep10 ep10Var) {
        eh90 i2;
        if (k2(1)) {
            nmo0 nmo0Var = this.z;
            if (nmo0Var == null) {
                nmo0Var = this.q;
            }
            i2().f(this.p, nmo0Var, this.r, this.s, this.t, this.u, this.v);
        }
        a aVar = this.B;
        if (aVar != null) {
            if (!aVar.c) {
                aVar = null;
            }
            if (aVar != null) {
                i2 = aVar.d;
            }
        }
        i2 = i2();
        i2.d(ep10Var);
        return i2;
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return j2(fVar).a(i, fVar.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, xsna.nmo0] */
    public final boolean k2(int i) {
        nmo0 nmo0Var = this.z;
        ?? r0 = this.q;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = r0;
        hr80.H(this, "StyleOuterNode", new mcl0(7));
        this.z = (nmo0) ref$ObjectRef.element;
        if (nmo0Var == null) {
            return false;
        }
        return !nmo0Var.equals(r0);
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        ap30 ap30Var = this.A;
        if (ap30Var == null) {
            ap30Var = new ap30(this, 22);
            this.A = ap30Var;
        }
        qgi0.s(tgi0Var, new us2(this.p));
        a aVar = this.B;
        if (aVar != null) {
            boolean z = aVar.c;
            sgi0<Boolean> sgi0Var = ngi0.E;
            qcy<Object>[] qcyVarArr = qgi0.a;
            qcy<Object> qcyVar = qcyVarArr[17];
            tgi0Var.a(sgi0Var, Boolean.valueOf(z));
            us2 us2Var = new us2(aVar.b);
            sgi0<us2> sgi0Var2 = ngi0.D;
            qcy<Object> qcyVar2 = qcyVarArr[16];
            tgi0Var.a(sgi0Var2, us2Var);
        }
        tgi0Var.a(wfi0.l, new ck(null, new mmm0(this, 5)));
        tgi0Var.a(wfi0.m, new ck(null, new zyl0(this, 8)));
        tgi0Var.a(wfi0.n, new ck(null, new yei0(this, 6)));
        qgi0.b(tgi0Var, ap30Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // xsna.lio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(toy toyVar) {
        eh90 i2;
        if (this.o) {
            a aVar = this.B;
            if (aVar != null) {
                if (!aVar.c) {
                    aVar = null;
                }
                if (aVar != null) {
                    i2 = aVar.d;
                }
            }
            i2 = i2();
            ya2 ya2Var = i2.j;
            if (ya2Var == null) {
                xzw.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.y + ", textSubstitution=" + this.B + ')');
                throw new KotlinNothingValueException();
            }
            yq9 a2 = toyVar.b.c.a();
            boolean z = i2.k;
            if (z) {
                long j = i2.l;
                a2.e();
                a2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                k2(2);
                nmo0 nmo0Var = this.z;
                if (nmo0Var == null) {
                    nmo0Var = this.q;
                }
                hik0 hik0Var = nmo0Var.a;
                pdo0 pdo0Var = hik0Var.m;
                if (pdo0Var == null) {
                    pdo0Var = pdo0.b;
                }
                pdo0 pdo0Var2 = pdo0Var;
                v4j0 v4j0Var = hik0Var.n;
                if (v4j0Var == null) {
                    v4j0Var = v4j0.d;
                }
                v4j0 v4j0Var2 = v4j0Var;
                qio qioVar = hik0Var.p;
                if (qioVar == null) {
                    qioVar = qbr.a;
                }
                qio qioVar2 = qioVar;
                yk8 e = hik0Var.a.e();
                if (e != null) {
                    ya2Var.j(a2, e, nmo0Var.a.a.a(), v4j0Var2, pdo0Var2, qioVar2);
                } else {
                    o7g o7gVar = this.w;
                    long a3 = o7gVar != null ? o7gVar.a() : l5g.k;
                    if (a3 == 16) {
                        a3 = nmo0Var.b() != 16 ? nmo0Var.b() : l5g.b;
                    }
                    ya2Var.i(a2, a3, v4j0Var2, pdo0Var2, qioVar2);
                }
                if (z) {
                    a2.a();
                }
            } catch (Throwable th) {
                if (z) {
                    a2.a();
                }
                throw th;
            }
        }
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return tdo0.a(j2(fVar).e(fVar.getLayoutDirection()).c());
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return j2(fVar).a(i, fVar.getLayoutDirection());
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return tdo0.a(j2(fVar).e(fVar.getLayoutDirection()).a());
    }
}
