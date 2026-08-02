package yads;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class rt1 extends ry {
    public static final gn1 v;
    public final boolean k;
    public final boolean l;
    public final mo[] m;
    public final w73[] n;
    public final ArrayList o;
    public final hc0 p;
    public final HashMap q;
    public final ty1 r;
    public int s;
    public long[][] t;
    public qt1 u;

    static {
        tm1 tm1Var = new tm1();
        s51.g();
        tn2 tn2Var = tn2.f;
        v = new gn1("MergingMediaSource", new vm1(tm1Var), null, new zm1(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), kn1.H, dn1.d);
    }

    public rt1(hc0 hc0Var, mo... moVarArr) {
        this.k = false;
        this.l = false;
        this.m = moVarArr;
        this.p = hc0Var;
        this.o = new ArrayList(Arrays.asList(moVarArr));
        this.s = -1;
        this.n = new w73[moVarArr.length];
        this.t = new long[0][];
        this.q = new HashMap();
        this.r = qy1.a().a().b();
    }

    @Override // yads.mo
    public final qn1 a(zn1 zn1Var, qe qeVar, long j) {
        int length = this.m.length;
        qn1[] qn1VarArr = new qn1[length];
        int a = this.n[0].a(zn1Var.a);
        for (int i = 0; i < length; i++) {
            qn1VarArr[i] = this.m[i].a(zn1Var.a(this.n[i].a(a)), qeVar, j - this.t[a][i]);
        }
        ot1 ot1Var = new ot1(this.p, this.t[a], qn1VarArr);
        if (!this.l) {
            return ot1Var;
        }
        Long l = (Long) this.q.get(zn1Var.a);
        l.getClass();
        tv tvVar = new tv(ot1Var, true, 0L, l.longValue());
        this.r.a(zn1Var.a, tvVar);
        return tvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
    
        r13 = r13 + 1;
     */
    @Override // yads.ry
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, mo moVar, w73 w73Var) {
        w73[] w73VarArr;
        Integer num = (Integer) obj;
        if (this.u != null) {
            return;
        }
        if (this.s == -1) {
            this.s = w73Var.a();
        } else if (w73Var.a() != this.s) {
            this.u = new qt1();
            return;
        }
        if (this.t.length == 0) {
            this.t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.s, this.n.length);
        }
        this.o.remove(moVar);
        this.n[num.intValue()] = w73Var;
        if (this.o.isEmpty()) {
            if (this.k) {
                t73 t73Var = new t73();
                for (int i = 0; i < this.s; i++) {
                    long j = -this.n[0].a(i, t73Var, false).f;
                    int i2 = 1;
                    while (true) {
                        w73[] w73VarArr2 = this.n;
                        if (i2 < w73VarArr2.length) {
                            this.t[i][i2] = j - (-w73VarArr2[i2].a(i, t73Var, false).f);
                            i2++;
                        }
                    }
                }
            }
            w73 w73Var2 = this.n[0];
            if (this.l) {
                t73 t73Var2 = new t73();
                int i3 = 0;
                while (i3 < this.s) {
                    long j2 = Long.MIN_VALUE;
                    int i4 = 0;
                    while (true) {
                        w73VarArr = this.n;
                        if (i4 >= w73VarArr.length) {
                            break;
                        }
                        long j3 = w73VarArr[i4].a(i3, t73Var2, false).e;
                        if (j3 != C.TIME_UNSET) {
                            long j4 = j3 + this.t[i3][i4];
                            if (j2 == Long.MIN_VALUE || j4 < j2) {
                                j2 = j4;
                            }
                        }
                        i4++;
                    }
                    Object a = w73VarArr[0].a(i3);
                    this.q.put(a, Long.valueOf(j2));
                    ty1 ty1Var = this.r;
                    Object obj2 = (Collection) ty1Var.f.get(a);
                    if (obj2 == null) {
                        obj2 = (List) ty1Var.h.get();
                    }
                    List list = (List) obj2;
                    x tVar = list instanceof RandomAccess ? new t(ty1Var, a, list, null) : new z(ty1Var, a, list, null);
                    tVar.c();
                    Collection collection = tVar.c;
                    Iterator a2 = a0.a(collection);
                    while (true) {
                        tVar.c();
                        if (tVar.c != collection) {
                            throw new ConcurrentModificationException();
                        }
                        if (a2.hasNext()) {
                            tVar.c();
                            if (tVar.c != collection) {
                                throw new ConcurrentModificationException();
                            }
                            tv tvVar = (tv) a2.next();
                            tvVar.f = 0L;
                            tvVar.g = j2;
                        }
                    }
                }
                w73Var2 = new pt1(w73Var2, this.q);
            }
            a(w73Var2);
        }
    }

    @Override // yads.mo
    public final gn1 c() {
        mo[] moVarArr = this.m;
        return moVarArr.length > 0 ? moVarArr[0].c() : v;
    }

    @Override // yads.ry, yads.mo
    public final void d() {
        qt1 qt1Var = this.u;
        if (qt1Var != null) {
            throw qt1Var;
        }
        super.d();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        Arrays.fill(this.n, (Object) null);
        this.s = -1;
        this.u = null;
        this.o.clear();
        Collections.addAll(this.o, this.m);
    }

    public rt1(mo[] moVarArr, int i) {
        this(new hc0(), moVarArr);
    }

    @Override // yads.ry
    public final zn1 a(Object obj, zn1 zn1Var) {
        if (((Integer) obj).intValue() == 0) {
            return zn1Var;
        }
        return null;
    }

    @Override // yads.mo
    public final void a(v93 v93Var) {
        this.j = v93Var;
        this.i = mc3.a((Handler.Callback) null);
        for (int i = 0; i < this.m.length; i++) {
            a(Integer.valueOf(i), this.m[i]);
        }
    }

    @Override // yads.mo
    public final void a(qn1 qn1Var) {
        if (this.l) {
            tv tvVar = (tv) qn1Var;
            ty1 ty1Var = this.r;
            c0 c0Var = ty1Var.b;
            if (c0Var == null) {
                c0Var = new c0(ty1Var);
                ty1Var.b = c0Var;
            }
            Iterator it = c0Var.iterator();
            while (true) {
                o oVar = (o) it;
                if (!oVar.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) oVar.next();
                if (((tv) entry.getValue()).equals(tvVar)) {
                    ty1 ty1Var2 = this.r;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ty1Var2.a().get(key);
                    if (collection != null) {
                        collection.remove(value);
                    }
                }
            }
            qn1Var = tvVar.b;
        }
        ot1 ot1Var = (ot1) qn1Var;
        int i = 0;
        while (true) {
            mo[] moVarArr = this.m;
            if (i >= moVarArr.length) {
                return;
            }
            mo moVar = moVarArr[i];
            qn1 qn1Var2 = ot1Var.b[i];
            if (qn1Var2 instanceof mt1) {
                qn1Var2 = ((mt1) qn1Var2).b;
            }
            moVar.a(qn1Var2);
            i++;
        }
    }
}
