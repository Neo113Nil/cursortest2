package defpackage;

import android.os.Trace;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class aty0 extends e530 implements v0y, pam, gnq0 {
    public xfc A;
    public HashMap B;
    public fc90 C;
    public ety0 D;
    public ysy0 E;
    public zsy0 F;
    public String a;
    public ety0 b;
    public dyr c;
    public int w;
    public boolean x;
    public int y;
    public int z;

    public final fc90 E0() {
        ety0 ety0Var = this.D;
        if (ety0Var == null) {
            ety0Var = this.b;
        }
        ety0 ety0Var2 = ety0Var;
        if (this.C == null) {
            this.C = new fc90(this.a, ety0Var2, this.c, this.w, this.x, this.y, this.z);
        }
        return this.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fc90 F0(k kVar) {
        fc90 E0;
        if (G0(1)) {
            ety0 ety0Var = this.D;
            if (ety0Var == null) {
                ety0Var = this.b;
            }
            E0().f(this.a, ety0Var, this.c, this.w, this.x, this.y, this.z);
        }
        zsy0 zsy0Var = this.F;
        if (zsy0Var != null) {
            if (!zsy0Var.c) {
                zsy0Var = null;
            }
            if (zsy0Var != null) {
                E0 = zsy0Var.d;
            }
        }
        E0 = E0();
        E0.d(kVar);
        return E0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, ety0] */
    public final boolean G0(int i) {
        ety0 ety0Var = this.D;
        ?? r0 = this.b;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = r0;
        dai0.L(this, "StyleOuterNode", new uiy0(17));
        this.D = (ety0) ref$ObjectRef.element;
        if (ety0Var == null) {
            return false;
        }
        return !ety0Var.equals(r0);
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return jlb1.a(F0(lookaheadCapablePlaceable).e(lookaheadCapablePlaceable.getLayoutDirection()).d());
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return jlb1.a(F0(lookaheadCapablePlaceable).e(lookaheadCapablePlaceable.getLayoutDirection()).b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // defpackage.pam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(c1y c1yVar) {
        fc90 E0;
        if (!isAttached()) {
            return;
        }
        zsy0 zsy0Var = this.F;
        if (zsy0Var != null) {
            if (!zsy0Var.c) {
                zsy0Var = null;
            }
            if (zsy0Var != null) {
                E0 = zsy0Var.d;
            }
        }
        E0 = E0();
        gb2 gb2Var = E0.j;
        if (gb2Var == null) {
            lxv.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.C + ", textSubstitution=" + this.F + ')');
            ny61.A();
            return;
        }
        i28 q = c1yVar.a.b.q();
        boolean z = E0.k;
        if (z) {
            float f = (int) (E0.l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            q.save();
            q.b(0.0f, 0.0f, (int) (r3 >> 32), f, 1);
        }
        try {
            G0(2);
            ety0 ety0Var = this.D;
            if (ety0Var == null) {
                ety0Var = this.b;
            }
            bmt0 bmt0Var = ety0Var.a;
            rly0 rly0Var = bmt0Var.m;
            if (rly0Var == null) {
                rly0Var = rly0.b;
            }
            rly0 rly0Var2 = rly0Var;
            bgr0 bgr0Var = bmt0Var.n;
            if (bgr0Var == null) {
                bgr0Var = bgr0.d;
            }
            bgr0 bgr0Var2 = bgr0Var;
            ram ramVar = bmt0Var.p;
            if (ramVar == null) {
                ramVar = i3r.a;
            }
            ram ramVar2 = ramVar;
            ml6 c = bmt0Var.a.c();
            if (c != null) {
                gb2Var.g(q, c, ety0Var.a.a.a(), bgr0Var2, rly0Var2, ramVar2);
            } else {
                xfc xfcVar = this.A;
                long a = xfcVar != null ? xfcVar.a() : ldc.m;
                if (a == 16) {
                    a = ety0Var.b() != 16 ? ety0Var.b() : ldc.b;
                }
                gb2Var.f(q, a, bgr0Var2, rly0Var2, ramVar2);
            }
            if (z) {
                q.n();
            }
        } finally {
        }
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            fc90 F0 = F0(kVar);
            boolean b = F0.b(j, kVar.getLayoutDirection());
            ec90 ec90Var = F0.n;
            if (ec90Var != null) {
                ec90Var.a();
            }
            zqy0 zqy0Var = F0.j.d;
            long j2 = F0.l;
            if (b) {
                qje.N(this, 2).i1();
                HashMap hashMap = this.B;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.B = hashMap;
                }
                hashMap.put(a.a, Integer.valueOf(Math.round(zqy0Var.d(0))));
                hashMap.put(a.b, Integer.valueOf(Math.round(zqy0Var.d(zqy0Var.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            return kVar.w(i, i2, this.B, new q83(x910Var.l0(qje.m(i, i, i2, i2)), 15));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return F0(lookaheadCapablePlaceable).a(i, lookaheadCapablePlaceable.getLayoutDirection());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ysy0] */
    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        ysy0 ysy0Var = this.E;
        ysy0 ysy0Var2 = ysy0Var;
        if (ysy0Var == null) {
            final int i = 0;
            ?? r0 = new tls(this) { // from class: ysy0
                public final /* synthetic */ aty0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
                @Override // defpackage.tls
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    fwi fwiVar;
                    dry0 dry0Var;
                    int i2 = i;
                    aty0 aty0Var = this.b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            fc90 E0 = aty0Var.E0();
                            ety0 ety0Var = aty0Var.b;
                            xfc xfcVar = aty0Var.A;
                            ety0 e = ety0.e(ety0Var, xfcVar != null ? xfcVar.a() : ldc.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                            LayoutDirection layoutDirection = E0.o;
                            dry0 dry0Var2 = null;
                            if (layoutDirection != null && (fwiVar = E0.i) != null) {
                                kk2 kk2Var = new kk2(E0.a);
                                if (E0.j != null && E0.n != null) {
                                    long j = E0.p & (-8589934589L);
                                    int i3 = E0.f;
                                    boolean z = E0.e;
                                    int i4 = E0.d;
                                    dyr dyrVar = E0.c;
                                    EmptyList emptyList = EmptyList.a;
                                    dry0Var = new dry0(new cry0(kk2Var, e, emptyList, i3, z, i4, fwiVar, layoutDirection, dyrVar, j), new hm40(new xv10(kk2Var, e, (List) emptyList, fwiVar, dyrVar), j, E0.f, E0.d), E0.l);
                                    if (dry0Var != null) {
                                        list.add(dry0Var);
                                        dry0Var2 = dry0Var;
                                    }
                                    return Boolean.valueOf(dry0Var2 != null);
                                }
                            }
                            dry0Var = null;
                            if (dry0Var != null) {
                            }
                            return Boolean.valueOf(dry0Var2 != null);
                        case 1:
                            String str = ((kk2) obj).b;
                            zsy0 zsy0Var = aty0Var.F;
                            if (zsy0Var == null) {
                                zsy0 zsy0Var2 = new zsy0(aty0Var.a, str);
                                fc90 fc90Var = new fc90(str, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
                                fc90Var.d(aty0Var.E0().i);
                                zsy0Var2.d = fc90Var;
                                aty0Var.F = zsy0Var2;
                            } else if (!jl40.l(str, zsy0Var.b)) {
                                zsy0Var.b = str;
                                fc90 fc90Var2 = zsy0Var.d;
                                if (fc90Var2 != null) {
                                    fc90Var2.f(str, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
                                }
                            }
                            qje.P(aty0Var).D();
                            qje.P(aty0Var).C();
                            rzo.D(aty0Var);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            zsy0 zsy0Var3 = aty0Var.F;
                            if (zsy0Var3 == null) {
                                r2 = false;
                            } else {
                                zsy0Var3.c = booleanValue;
                                qje.P(aty0Var).D();
                                qje.P(aty0Var).C();
                                rzo.D(aty0Var);
                            }
                            return Boolean.valueOf(r2);
                    }
                }
            };
            this.E = r0;
            ysy0Var2 = r0;
        }
        f.t(mnq0Var, new kk2(this.a));
        zsy0 zsy0Var = this.F;
        if (zsy0Var != null) {
            boolean z = zsy0Var.c;
            g gVar = d.E;
            kgx[] kgxVarArr = f.a;
            kgx kgxVar = kgxVarArr[17];
            mnq0Var.a(gVar, Boolean.valueOf(z));
            kk2 kk2Var = new kk2(zsy0Var.b);
            g gVar2 = d.D;
            kgx kgxVar2 = kgxVarArr[16];
            mnq0Var.a(gVar2, kk2Var);
        }
        final int i2 = 1;
        mnq0Var.a(androidx.compose.ui.semantics.a.l, new ag(null, new tls(this) { // from class: ysy0
            public final /* synthetic */ aty0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
            @Override // defpackage.tls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                fwi fwiVar;
                dry0 dry0Var;
                int i22 = i2;
                aty0 aty0Var = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        fc90 E0 = aty0Var.E0();
                        ety0 ety0Var = aty0Var.b;
                        xfc xfcVar = aty0Var.A;
                        ety0 e = ety0.e(ety0Var, xfcVar != null ? xfcVar.a() : ldc.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                        LayoutDirection layoutDirection = E0.o;
                        dry0 dry0Var2 = null;
                        if (layoutDirection != null && (fwiVar = E0.i) != null) {
                            kk2 kk2Var2 = new kk2(E0.a);
                            if (E0.j != null && E0.n != null) {
                                long j = E0.p & (-8589934589L);
                                int i3 = E0.f;
                                boolean z2 = E0.e;
                                int i4 = E0.d;
                                dyr dyrVar = E0.c;
                                EmptyList emptyList = EmptyList.a;
                                dry0Var = new dry0(new cry0(kk2Var2, e, emptyList, i3, z2, i4, fwiVar, layoutDirection, dyrVar, j), new hm40(new xv10(kk2Var2, e, (List) emptyList, fwiVar, dyrVar), j, E0.f, E0.d), E0.l);
                                if (dry0Var != null) {
                                    list.add(dry0Var);
                                    dry0Var2 = dry0Var;
                                }
                                return Boolean.valueOf(dry0Var2 != null);
                            }
                        }
                        dry0Var = null;
                        if (dry0Var != null) {
                        }
                        return Boolean.valueOf(dry0Var2 != null);
                    case 1:
                        String str = ((kk2) obj).b;
                        zsy0 zsy0Var2 = aty0Var.F;
                        if (zsy0Var2 == null) {
                            zsy0 zsy0Var22 = new zsy0(aty0Var.a, str);
                            fc90 fc90Var = new fc90(str, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
                            fc90Var.d(aty0Var.E0().i);
                            zsy0Var22.d = fc90Var;
                            aty0Var.F = zsy0Var22;
                        } else if (!jl40.l(str, zsy0Var2.b)) {
                            zsy0Var2.b = str;
                            fc90 fc90Var2 = zsy0Var2.d;
                            if (fc90Var2 != null) {
                                fc90Var2.f(str, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
                            }
                        }
                        qje.P(aty0Var).D();
                        qje.P(aty0Var).C();
                        rzo.D(aty0Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        zsy0 zsy0Var3 = aty0Var.F;
                        if (zsy0Var3 == null) {
                            r2 = false;
                        } else {
                            zsy0Var3.c = booleanValue;
                            qje.P(aty0Var).D();
                            qje.P(aty0Var).C();
                            rzo.D(aty0Var);
                        }
                        return Boolean.valueOf(r2);
                }
            }
        }));
        final int i3 = 2;
        mnq0Var.a(androidx.compose.ui.semantics.a.m, new ag(null, new tls(this) { // from class: ysy0
            public final /* synthetic */ aty0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
            @Override // defpackage.tls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                fwi fwiVar;
                dry0 dry0Var;
                int i22 = i3;
                aty0 aty0Var = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        fc90 E0 = aty0Var.E0();
                        ety0 ety0Var = aty0Var.b;
                        xfc xfcVar = aty0Var.A;
                        ety0 e = ety0.e(ety0Var, xfcVar != null ? xfcVar.a() : ldc.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                        LayoutDirection layoutDirection = E0.o;
                        dry0 dry0Var2 = null;
                        if (layoutDirection != null && (fwiVar = E0.i) != null) {
                            kk2 kk2Var2 = new kk2(E0.a);
                            if (E0.j != null && E0.n != null) {
                                long j = E0.p & (-8589934589L);
                                int i32 = E0.f;
                                boolean z2 = E0.e;
                                int i4 = E0.d;
                                dyr dyrVar = E0.c;
                                EmptyList emptyList = EmptyList.a;
                                dry0Var = new dry0(new cry0(kk2Var2, e, emptyList, i32, z2, i4, fwiVar, layoutDirection, dyrVar, j), new hm40(new xv10(kk2Var2, e, (List) emptyList, fwiVar, dyrVar), j, E0.f, E0.d), E0.l);
                                if (dry0Var != null) {
                                    list.add(dry0Var);
                                    dry0Var2 = dry0Var;
                                }
                                return Boolean.valueOf(dry0Var2 != null);
                            }
                        }
                        dry0Var = null;
                        if (dry0Var != null) {
                        }
                        return Boolean.valueOf(dry0Var2 != null);
                    case 1:
                        String str = ((kk2) obj).b;
                        zsy0 zsy0Var2 = aty0Var.F;
                        if (zsy0Var2 == null) {
                            zsy0 zsy0Var22 = new zsy0(aty0Var.a, str);
                            fc90 fc90Var = new fc90(str, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
                            fc90Var.d(aty0Var.E0().i);
                            zsy0Var22.d = fc90Var;
                            aty0Var.F = zsy0Var22;
                        } else if (!jl40.l(str, zsy0Var2.b)) {
                            zsy0Var2.b = str;
                            fc90 fc90Var2 = zsy0Var2.d;
                            if (fc90Var2 != null) {
                                fc90Var2.f(str, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
                            }
                        }
                        qje.P(aty0Var).D();
                        qje.P(aty0Var).C();
                        rzo.D(aty0Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        zsy0 zsy0Var3 = aty0Var.F;
                        if (zsy0Var3 == null) {
                            r2 = false;
                        } else {
                            zsy0Var3.c = booleanValue;
                            qje.P(aty0Var).D();
                            qje.P(aty0Var).C();
                            rzo.D(aty0Var);
                        }
                        return Boolean.valueOf(r2);
                }
            }
        }));
        mnq0Var.a(androidx.compose.ui.semantics.a.n, new ag(null, new oew0(20, this)));
        f.c(mnq0Var, ysy0Var2);
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return F0(lookaheadCapablePlaceable).a(i, lookaheadCapablePlaceable.getLayoutDirection());
    }
}
