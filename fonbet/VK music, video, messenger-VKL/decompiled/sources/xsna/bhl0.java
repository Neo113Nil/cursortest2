package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Trace;
import com.vk.sqliteext.observer.SQLiteContentChangesListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.xgl0;

/* compiled from: StorageManagerImpl.kt */
/* loaded from: classes.dex */
public final class bhl0 implements xgl0 {
    public final bpn0 A;
    public final bpn0 B;
    public final bpn0 C;
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;
    public final bpn0 H;
    public final bpn0 I;
    public final bpn0 J;
    public final bpn0 K;
    public final Context b;
    public final h0w c;
    public final String d;
    public final b2l e;
    public final ngl0 f;
    public final a67 g;
    public final kb0 h;
    public final n2w i;
    public final bpn0 m;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;
    public final a j = new a();
    public final bpn0 k = new bpn0(new os0(this, 4));
    public final t120 l = new t120(0);
    public final bpn0 n = new bpn0(new qy8(this, 14));

    /* compiled from: StorageManagerImpl.kt */
    public final class a implements SQLiteContentChangesListener {
        public a() {
        }

        @Override // com.vk.sqliteext.observer.SQLiteContentChangesListener
        public final void onChanges(String str, Collection<Long> collection, Collection<Long> collection2, Collection<Long> collection3) {
            ngl0 ngl0Var = bhl0.this.f;
            Trace.beginSection(ndp0.f("StorageManager.onChanges"));
            try {
                if (str.equals("messages")) {
                    Collection<Long> collection4 = collection;
                    ArrayList arrayList = new ArrayList(c5g.u(collection4, 10));
                    Iterator<T> it = collection4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
                    }
                    Collection<Long> collection5 = collection2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(collection5, 10));
                    Iterator<T> it2 = collection5.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf((int) ((Number) it2.next()).longValue()));
                    }
                    Collection<Long> collection6 = collection3;
                    ArrayList arrayList3 = new ArrayList(c5g.u(collection6, 10));
                    Iterator<T> it3 = collection6.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Integer.valueOf((int) ((Number) it3.next()).longValue()));
                    }
                    ngl0Var.getClass();
                    ngl0Var.a.J0(ngl0Var, new c040(arrayList, arrayList2, arrayList3));
                } else if (str.equals(RTCStatsConstants.KEY_CHANNELS)) {
                    ngl0Var.getClass();
                }
                s3q0 s3q0Var = s3q0.a;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public bhl0(Context context, h0w h0wVar, String str, b2l b2lVar, final Iterable iterable, ngl0 ngl0Var, final dil0 dil0Var, final np npVar, a67 a67Var, kb0 kb0Var, n2w n2wVar) {
        this.b = context;
        this.c = h0wVar;
        this.d = str;
        this.e = b2lVar;
        this.f = ngl0Var;
        this.g = a67Var;
        this.h = kb0Var;
        this.i = n2wVar;
        this.m = new bpn0(new gzs() { // from class: xsna.zgl0
            @Override // xsna.gzs
            public final Object invoke() {
                bhl0 bhl0Var = bhl0.this;
                np npVar2 = npVar;
                dil0 dil0Var2 = dil0Var;
                Trace.beginSection(ndp0.f("lazy StorageManager.cacheEnvironment"));
                try {
                    return new ugl0(bhl0Var, bhl0Var.C(), npVar2, dil0Var2);
                } finally {
                    Trace.endSection();
                }
            }
        });
        new bpn0(new j90(this, 9));
        this.o = new bpn0(new ehs(this, 6));
        new bpn0(new fu2(this, 7));
        new bpn0(new vbp(this, 6));
        this.p = new bpn0(new gzs() { // from class: xsna.ahl0
            @Override // xsna.gzs
            public final Object invoke() {
                bhl0 bhl0Var = bhl0.this;
                Iterable iterable2 = iterable;
                Trace.beginSection(ndp0.f("lazy StorageManager.dialogThemesStorage"));
                try {
                    return new flm(bhl0Var.B(), iterable2, bhl0Var.g);
                } finally {
                    Trace.endSection();
                }
            }
        });
        this.q = new bpn0(new a7x(1, this, iterable));
        this.r = new bpn0(new pxv(this, 7));
        this.s = new bpn0(new fat(this, 7));
        this.t = new bpn0(new mu2(this, 7));
        this.u = new bpn0(new gb3(this, 13));
        this.v = new bpn0(new g3o(this, 7));
        this.w = new bpn0(new hy6(this, 11));
        this.x = new bpn0(new rxv(this, 6));
        this.y = new bpn0(new zkv(this, 5));
        this.z = new bpn0(new jb3(this, 7));
        this.A = new bpn0(new bky(this, 6));
        this.B = new bpn0(new vwk(this, 5));
        this.C = new bpn0(new uia(this, 9));
        this.D = new bpn0(new ho4(this, 5));
        this.E = new bpn0(new qx2(this, 6));
        this.F = new bpn0(new rx2(this, 7));
        this.G = new bpn0(new sx2(this, 6));
        this.H = new bpn0(new yaa(this, 5));
        this.I = new bpn0(new cuq(this, 5));
        this.J = new bpn0(new duq(this, 7));
        this.K = new bpn0(new gat(this, 10));
    }

    public static void D(fk fkVar) {
        xgl0.a.getClass();
        Integer num = (Integer) xgl0.a.a().get();
        int hashCode = fkVar.hashCode();
        if (num != null && num.intValue() == hashCode) {
            xgl0.a.a().set(null);
            xgl0.a.b().set(Boolean.FALSE);
        }
    }

    public final void A() {
        Trace.beginSection(ndp0.f("StorageManager.clear"));
        try {
            C().clear();
            Iterator it = ((ArrayList) this.l.b).iterator();
            while (it.hasNext()) {
                ((mtx0) it.next()).Q();
            }
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    public final tgl0 B() {
        return (tgl0) this.m.getValue();
    }

    public final e0w C() {
        return (e0w) this.k.getValue();
    }

    @Override // xsna.xgl0
    public final uib a() {
        return (uib) this.F.getValue();
    }

    @Override // xsna.xgl0
    public final xvm b() {
        return (xvm) this.t.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        throw r3;
     */
    @Override // xsna.xgl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <Result> Result c(izs<? super xgl0, ? extends Result> izsVar) {
        Trace.beginSection(ndp0.f("StorageManager.execTransaction"));
        try {
            Trace.beginSection(ndp0.f("StorageManager.beginTransactionReadonly"));
            C().a();
            s3q0 s3q0Var = s3q0.a;
            try {
                Trace.beginSection(ndp0.f("StorageManager.execTransaction invoke"));
                try {
                    Result invoke = izsVar.invoke(this);
                    Trace.endSection();
                    C().setTransactionSuccessful();
                    Trace.beginSection(ndp0.f("StorageManager.endTransaction"));
                    C().endTransaction();
                    Trace.endSection();
                    return invoke;
                } finally {
                }
            } catch (SQLiteException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                throw e;
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    @Override // xsna.xgl0
    public final x1r0 d() {
        return (x1r0) this.A.getValue();
    }

    @Override // xsna.xgl0
    public final r3b e() {
        return (r3b) this.H.getValue();
    }

    @Override // xsna.xgl0
    public final ncp f() {
        return (ncp) this.u.getValue();
    }

    @Override // xsna.xgl0
    public final String g() {
        return this.d;
    }

    @Override // xsna.xgl0
    public final f7p h() {
        return (f7p) this.o.getValue();
    }

    @Override // xsna.xgl0
    public final elm i() {
        return (elm) this.p.getValue();
    }

    @Override // xsna.xgl0
    public final t7w j() {
        return (t7w) this.K.getValue();
    }

    @Override // xsna.xgl0
    public final rey k() {
        return (rey) this.B.getValue();
    }

    @Override // xsna.xgl0
    public final xi00 l() {
        return (xi00) this.w.getValue();
    }

    @Override // xsna.xgl0
    public final ram m() {
        return (ram) this.r.getValue();
    }

    @Override // xsna.xgl0
    public final bru n() {
        return (bru) this.v.getValue();
    }

    @Override // xsna.xgl0
    public final d040 o() {
        return (d040) this.x.getValue();
    }

    @Override // xsna.xgl0
    public final vsl0 p() {
        return (vsl0) this.J.getValue();
    }

    @Override // xsna.xgl0
    public final v6p q() {
        return (v6p) this.n.getValue();
    }

    @Override // xsna.xgl0
    public final us r() {
        return (us) this.s.getValue();
    }

    @Override // xsna.xgl0
    public final ls8 s() {
        return (ls8) this.E.getValue();
    }

    @Override // xsna.xgl0
    public final frn0 system() {
        return (frn0) this.y.getValue();
    }

    @Override // xsna.xgl0
    public final z9m t() {
        return (z9m) this.q.getValue();
    }

    @Override // xsna.xgl0
    public final <Result> Result u(izs<? super xgl0, ? extends Result> izsVar) {
        fk fkVar = new fk(20, this, izsVar);
        Trace.beginSection(ndp0.f("StorageManager.execTransactionModeImmediate"));
        try {
            try {
                xgl0.a.getClass();
                if (xgl0.a.a().get() == null) {
                    xgl0.a.a().set(Integer.valueOf(fkVar.hashCode()));
                    xgl0.a.b().set(Boolean.TRUE);
                }
                return (Result) fkVar.invoke();
            } finally {
                D(fkVar);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.xgl0
    public final tcq0 upload() {
        return (tcq0) this.z.getValue();
    }

    @Override // xsna.xgl0
    public final czh0 v() {
        return (czh0) this.C.getValue();
    }

    @Override // xsna.xgl0
    public final hdj w() {
        return (hdj) this.D.getValue();
    }

    @Override // xsna.xgl0
    public final its0 x() {
        return (its0) this.I.getValue();
    }

    @Override // xsna.xgl0
    public final r3b y() {
        return (r3b) this.G.getValue();
    }

    public final void z(mtx0 mtx0Var) {
        ((ArrayList) this.l.b).add(mtx0Var);
    }
}
