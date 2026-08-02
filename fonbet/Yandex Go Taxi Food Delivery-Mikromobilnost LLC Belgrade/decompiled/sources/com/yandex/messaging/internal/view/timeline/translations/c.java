package com.yandex.messaging.internal.view.timeline.translations;

import android.database.Cursor;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ReplyData;
import com.yandex.messaging.internal.entities.Suggest;
import com.yandex.messaging.internal.translator.k;
import defpackage.acb;
import defpackage.bcb;
import defpackage.c9v;
import defpackage.ccb;
import defpackage.dcb;
import defpackage.e5b;
import defpackage.ecb;
import defpackage.evu0;
import defpackage.ez01;
import defpackage.f5b;
import defpackage.g0c;
import defpackage.g8e;
import defpackage.h3y;
import defpackage.ike;
import defpackage.iw10;
import defpackage.j3b;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.kz01;
import defpackage.kz10;
import defpackage.lqo;
import defpackage.mw10;
import defpackage.nw10;
import defpackage.nz01;
import defpackage.op3;
import defpackage.oyr;
import defpackage.p4t;
import defpackage.pv10;
import defpackage.pw10;
import defpackage.pzt0;
import defpackage.qbz0;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.qw10;
import defpackage.rp3;
import defpackage.rw10;
import defpackage.sz01;
import defpackage.tcc;
import defpackage.tga1;
import defpackage.tje;
import defpackage.tz10;
import defpackage.vse;
import defpackage.w511;
import defpackage.wab;
import defpackage.ww10;
import defpackage.x08;
import defpackage.xkb1;
import defpackage.xyz;
import defpackage.yab;
import defpackage.z83;
import defpackage.zf0;
import defpackage.zy01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class c {
    public static final /* synthetic */ kgx[] R = {new MutablePropertyReference1Impl("pendingUpdateJob", 0, "getPendingUpdateJob()Lkotlinx/coroutines/Job;", c.class), oyr.B(qoi0.a, c.class, "translatingSubscription", "getTranslatingSubscription()Lcom/yandex/messaging/Cancelable;", 0), new MutablePropertyReference1Impl("pollingSubscription", 0, "getPollingSubscription()Lcom/yandex/alicekit/core/Disposable;", c.class)};
    public Boolean A;
    public Boolean B;
    public Boolean C;
    public ReplyData D;
    public String E;
    public String F;
    public wab G;
    public wab H;
    public Pair I;
    public j3b J;
    public String N;
    public String O;
    public nw10 Q;
    public final p4t a;
    public final com.yandex.messaging.domain.personal.a b;
    public final k c;
    public final nz01 d;
    public final qbz0 e;
    public final kz10 f;
    public final pv10 g;
    public final zf0 h;
    public final lqo i;
    public final h3y j;
    public final g k;
    public final ez01 l;
    public final kz01 m;
    public boolean n;
    public final ike o;
    public final List p;
    public iw10 q;
    public mw10 r;
    public bcb s;
    public ww10 t;
    public com.yandex.messaging.internal.translator.b u;
    public String v;
    public ServerMessageRef w;
    public String x;
    public Long y;
    public Long z;
    public final rp3 K = new rp3();
    public final op3 L = new op3();
    public final qp3 M = new qp3();
    public xkb1 P = pw10.c;

    public c(sz01 sz01Var, p4t p4tVar, com.yandex.messaging.domain.personal.a aVar, k kVar, nz01 nz01Var, vse vseVar, qbz0 qbz0Var, kz10 kz10Var, pv10 pv10Var, zf0 zf0Var, lqo lqoVar, h3y h3yVar, g gVar, ez01 ez01Var, kz01 kz01Var) {
        this.a = p4tVar;
        this.b = aVar;
        this.c = kVar;
        this.d = nz01Var;
        this.e = qbz0Var;
        this.f = kz10Var;
        this.g = pv10Var;
        this.h = zf0Var;
        this.i = lqoVar;
        this.j = h3yVar;
        this.k = gVar;
        this.l = ez01Var;
        this.m = kz01Var;
        this.o = vseVar.c(true);
        this.p = sz01Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yab yabVar, mw10 mw10Var, iw10 iw10Var, acb acbVar) {
        Object valueOf;
        String str;
        wab wabVar;
        ArrayList A0;
        Class cls;
        Pair pair;
        Object valueOf2;
        String str2;
        Object valueOf3;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        Object valueOf4;
        String str4;
        Object valueOf5;
        String str5;
        this.r = mw10Var;
        this.q = iw10Var;
        this.s = acbVar.l;
        this.t = acbVar.m;
        this.u = acbVar.n;
        this.x = yabVar.R().text;
        this.w = yabVar.v0();
        this.D = yabVar.n0();
        this.B = Boolean.valueOf(yabVar.R0());
        this.C = Boolean.valueOf(yabVar.Q0());
        this.E = yabVar.k();
        this.A = Boolean.valueOf(yabVar.a1());
        this.y = yabVar.D0();
        this.z = Long.valueOf(yabVar.z0());
        yabVar.F0();
        this.G = yabVar.F0();
        Cursor cursor = yabVar.a;
        boolean isNull = cursor.isNull(25);
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Short.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Long.TYPE;
        if (isNull) {
            str = null;
        } else {
            g0c a = qoi0.a(String.class);
            if (a.equals(qoi0.a(String.class))) {
                valueOf = cursor.getString(25);
            } else if (a.equals(qoi0.a(cls7))) {
                valueOf = Long.valueOf(cursor.getLong(25));
            } else if (a.equals(qoi0.a(cls6))) {
                valueOf = Integer.valueOf(cursor.getInt(25));
            } else if (a.equals(qoi0.a(cls5))) {
                valueOf = Short.valueOf(cursor.getShort(25));
            } else if (a.equals(qoi0.a(cls4))) {
                valueOf = Float.valueOf(cursor.getFloat(25));
            } else if (a.equals(qoi0.a(cls3))) {
                valueOf = Double.valueOf(cursor.getDouble(25));
            } else if (a.equals(qoi0.a(byte[].class))) {
                valueOf = cursor.getBlob(25);
            } else {
                if (!a.equals(qoi0.a(cls2))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return;
                }
                valueOf = Boolean.valueOf(cursor.getInt(25) != 0);
            }
            str = (String) valueOf;
        }
        if (str != null) {
            if (cursor.isNull(26)) {
                str4 = null;
            } else {
                g0c a2 = qoi0.a(String.class);
                if (a2.equals(qoi0.a(String.class))) {
                    valueOf4 = cursor.getString(26);
                } else if (a2.equals(qoi0.a(cls7))) {
                    valueOf4 = Long.valueOf(cursor.getLong(26));
                } else if (a2.equals(qoi0.a(cls6))) {
                    valueOf4 = Integer.valueOf(cursor.getInt(26));
                } else if (a2.equals(qoi0.a(cls5))) {
                    valueOf4 = Short.valueOf(cursor.getShort(26));
                } else if (a2.equals(qoi0.a(cls4))) {
                    valueOf4 = Float.valueOf(cursor.getFloat(26));
                } else if (a2.equals(qoi0.a(cls3))) {
                    valueOf4 = Double.valueOf(cursor.getDouble(26));
                } else if (a2.equals(qoi0.a(byte[].class))) {
                    valueOf4 = cursor.getBlob(26);
                } else {
                    if (!a2.equals(qoi0.a(cls2))) {
                        qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                        return;
                    }
                    valueOf4 = Boolean.valueOf(cursor.getInt(26) != 0);
                }
                str4 = (String) valueOf4;
            }
            if (str4 != null) {
                if (cursor.isNull(22)) {
                    str5 = null;
                } else {
                    g0c a3 = qoi0.a(String.class);
                    if (a3.equals(qoi0.a(String.class))) {
                        valueOf5 = cursor.getString(22);
                    } else if (a3.equals(qoi0.a(cls7))) {
                        valueOf5 = Long.valueOf(cursor.getLong(22));
                    } else if (a3.equals(qoi0.a(cls6))) {
                        valueOf5 = Integer.valueOf(cursor.getInt(22));
                    } else if (a3.equals(qoi0.a(cls5))) {
                        valueOf5 = Short.valueOf(cursor.getShort(22));
                    } else if (a3.equals(qoi0.a(cls4))) {
                        valueOf5 = Float.valueOf(cursor.getFloat(22));
                    } else if (a3.equals(qoi0.a(cls3))) {
                        valueOf5 = Double.valueOf(cursor.getDouble(22));
                    } else if (a3.equals(qoi0.a(byte[].class))) {
                        valueOf5 = cursor.getBlob(22);
                    } else {
                        if (!a3.equals(qoi0.a(cls2))) {
                            qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                            return;
                        }
                        valueOf5 = Boolean.valueOf(cursor.getInt(22) != 0);
                    }
                    str5 = (String) valueOf5;
                }
                if (str5 != null) {
                    wabVar = new wab(str5, str, str4);
                    this.H = wabVar;
                    A0 = yabVar.A0();
                    if (A0 == null) {
                        List<List<Suggest>> list = yabVar.R().layoutSuggestsRows;
                        List<Suggest> list2 = yabVar.R().regularSuggests;
                        if (list != null) {
                            List<List<Suggest>> list3 = list;
                            arrayList = new ArrayList(tcc.n(list3, 10));
                            Iterator it = list3.iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                List list4 = (List) it.next();
                                int i3 = i2;
                                Class cls8 = cls2;
                                ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                                Iterator it3 = list4.iterator();
                                while (true) {
                                    i = i3;
                                    if (it3.hasNext()) {
                                        i3 = i + 1;
                                        arrayList3.add((String) kotlin.collections.a.S(i, A0));
                                    }
                                }
                                arrayList.add(arrayList3);
                                it = it2;
                                i2 = i;
                                cls2 = cls8;
                            }
                            cls = cls2;
                        } else {
                            cls = cls2;
                            if (list2 != null) {
                                List<Suggest> list5 = list2;
                                arrayList2 = new ArrayList(tcc.n(list5, 10));
                                int i4 = 0;
                                for (Suggest suggest : list5) {
                                    arrayList2.add((String) kotlin.collections.a.S(i4, A0));
                                    i4++;
                                }
                                arrayList = null;
                                if (((arrayList == null || arrayList2 != null) ? this : null) != null) {
                                    pair = new Pair(arrayList, arrayList2);
                                    this.I = pair;
                                    if (cursor.isNull(28)) {
                                        str2 = null;
                                    } else {
                                        g0c a4 = qoi0.a(String.class);
                                        if (a4.equals(qoi0.a(String.class))) {
                                            valueOf2 = cursor.getString(28);
                                        } else if (a4.equals(qoi0.a(cls7))) {
                                            valueOf2 = Long.valueOf(cursor.getLong(28));
                                        } else if (a4.equals(qoi0.a(cls6))) {
                                            valueOf2 = Integer.valueOf(cursor.getInt(28));
                                        } else if (a4.equals(qoi0.a(cls5))) {
                                            valueOf2 = Short.valueOf(cursor.getShort(28));
                                        } else if (a4.equals(qoi0.a(cls4))) {
                                            valueOf2 = Float.valueOf(cursor.getFloat(28));
                                        } else if (a4.equals(qoi0.a(cls3))) {
                                            valueOf2 = Double.valueOf(cursor.getDouble(28));
                                        } else if (a4.equals(qoi0.a(byte[].class))) {
                                            valueOf2 = cursor.getBlob(28);
                                        } else {
                                            if (!a4.equals(qoi0.a(cls))) {
                                                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                                                return;
                                            }
                                            valueOf2 = Boolean.valueOf(cursor.getInt(28) != 0);
                                        }
                                        str2 = (String) valueOf2;
                                    }
                                    this.N = str2;
                                    if (cursor.isNull(29)) {
                                        str3 = null;
                                    } else {
                                        g0c a5 = qoi0.a(String.class);
                                        if (a5.equals(qoi0.a(String.class))) {
                                            valueOf3 = cursor.getString(29);
                                        } else if (a5.equals(qoi0.a(cls7))) {
                                            valueOf3 = Long.valueOf(cursor.getLong(29));
                                        } else if (a5.equals(qoi0.a(cls6))) {
                                            valueOf3 = Integer.valueOf(cursor.getInt(29));
                                        } else if (a5.equals(qoi0.a(cls5))) {
                                            valueOf3 = Short.valueOf(cursor.getShort(29));
                                        } else if (a5.equals(qoi0.a(cls4))) {
                                            valueOf3 = Float.valueOf(cursor.getFloat(29));
                                        } else if (a5.equals(qoi0.a(cls3))) {
                                            valueOf3 = Double.valueOf(cursor.getDouble(29));
                                        } else if (a5.equals(qoi0.a(byte[].class))) {
                                            valueOf3 = cursor.getBlob(29);
                                        } else {
                                            if (!a5.equals(qoi0.a(cls))) {
                                                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                                                return;
                                            }
                                            valueOf3 = Boolean.valueOf(cursor.getInt(29) != 0);
                                        }
                                        str3 = (String) valueOf3;
                                    }
                                    this.O = str3;
                                    i();
                                    tje.N(this.o, null, null, new MessageTextTranslationHelper$bind$2(this, acbVar, null), 3);
                                }
                            } else {
                                arrayList = null;
                            }
                        }
                        arrayList2 = null;
                        if (((arrayList == null || arrayList2 != null) ? this : null) != null) {
                        }
                    } else {
                        cls = cls2;
                    }
                    pair = null;
                    this.I = pair;
                    if (cursor.isNull(28)) {
                    }
                    this.N = str2;
                    if (cursor.isNull(29)) {
                    }
                    this.O = str3;
                    i();
                    tje.N(this.o, null, null, new MessageTextTranslationHelper$bind$2(this, acbVar, null), 3);
                }
            }
        }
        wabVar = null;
        this.H = wabVar;
        A0 = yabVar.A0();
        if (A0 == null) {
        }
        pair = null;
        this.I = pair;
        if (cursor.isNull(28)) {
        }
        this.N = str2;
        if (cursor.isNull(29)) {
        }
        this.O = str3;
        i();
        tje.N(this.o, null, null, new MessageTextTranslationHelper$bind$2(this, acbVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nw10 b(LayoutInflater layoutInflater) {
        c cVar;
        Boolean bool;
        if (((zy01) this.j.get()).c) {
            if (this.r == null && this.q == null) {
                z83.i();
            }
            Boolean bool2 = this.A;
            Boolean bool3 = Boolean.FALSE;
            if (jl40.l(bool2, bool3)) {
                Pair pair = this.I;
                if (pair != null) {
                    List list = (List) pair.getFirst();
                    List list2 = (List) pair.getSecond();
                    boolean z = true;
                    if ((list == null || !(!list.isEmpty())) && (list2 == null || !(!list2.isEmpty()))) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                if ((!jl40.l(this.B, bool3) || this.D != null || g() || jl40.l(bool, Boolean.TRUE)) && ((!jl40.l(this.B, Boolean.TRUE) || f()) && (this.D == null || h()))) {
                    j3b j3bVar = this.J;
                    if (j3bVar != null ? this.d.b(j3bVar) : false) {
                        cVar = this;
                        if (cVar != null) {
                            return null;
                        }
                        nw10 nw10Var = this.Q;
                        if (nw10Var != null) {
                            return nw10Var;
                        }
                        nw10 nw10Var2 = new nw10(layoutInflater, new MessageTextTranslationHelper$getTranslationButton$2$1(0, this, c.class, "isTranslationRequested", "isTranslationRequested()Z", 0), new MessageTextTranslationHelper$getTranslationButton$2$2(0, this, c.class, "requestOriginalText", "requestOriginalText()V", 0), new MessageTextTranslationHelper$getTranslationButton$2$3(0, this, c.class, "requestTranslationByButton", "requestTranslationByButton()V", 0));
                        this.Q = nw10Var2;
                        return nw10Var2;
                    }
                }
            }
        }
        cVar = null;
        if (cVar != null) {
        }
    }

    public final boolean c() {
        String str;
        if ((!g() && !f()) || (str = this.F) == null) {
            return true;
        }
        wab wabVar = this.G;
        if (wabVar == null) {
            return false;
        }
        return str.equals(wabVar.a);
    }

    public final boolean d() {
        String str;
        if (!h() || (str = this.F) == null) {
            return true;
        }
        wab wabVar = this.H;
        if (wabVar == null) {
            return false;
        }
        return str.equals(wabVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(xkb1 xkb1Var) {
        pw10 pw10Var;
        int i;
        mw10 mw10Var;
        String str;
        String str2;
        mw10 mw10Var2;
        Long l;
        int i2;
        LongSparseArray longSparseArray;
        e5b e5bVar;
        x08 x08Var;
        mw10 mw10Var3;
        e5b e5bVar2;
        float f;
        pw10 pw10Var2 = pw10.b;
        pw10 pw10Var3 = pw10.f;
        pw10 pw10Var4 = pw10.e;
        pw10 pw10Var5 = pw10.d;
        pw10 pw10Var6 = pw10.a;
        if (jl40.l(this.P, xkb1Var)) {
            return;
        }
        xkb1 xkb1Var2 = this.P;
        pw10 pw10Var7 = pw10.c;
        boolean l2 = jl40.l(xkb1Var2, pw10Var7);
        qbz0 qbz0Var = this.e;
        op3 op3Var = this.L;
        qp3 qp3Var = this.M;
        kgx[] kgxVarArr = R;
        zf0 zf0Var = this.h;
        pv10 pv10Var = this.g;
        if (!l2 && !jl40.l(xkb1Var2, pw10Var6) && !jl40.l(xkb1Var2, pw10Var5)) {
            if (jl40.l(xkb1Var2, pw10Var4)) {
                kgx kgxVar = kgxVarArr[2];
                qp3Var.b(null);
                kgx kgxVar2 = kgxVarArr[1];
                op3Var.b(null);
            } else if (jl40.l(xkb1Var2, pw10Var3)) {
                mw10 mw10Var4 = this.r;
                if (mw10Var4 != null) {
                    mw10Var4.a.setAlpha(1.0f);
                }
                if (pv10Var != null) {
                    pv10Var.c(1.0f);
                }
            } else if (xkb1Var2 instanceof rw10) {
                mw10 mw10Var5 = this.r;
                if (mw10Var5 != null) {
                    f = 1.0f;
                    mw10Var5.a.setAlpha(1.0f);
                } else {
                    f = 1.0f;
                }
                if (pv10Var != null) {
                    pv10Var.c(f);
                }
                RecyclerView recyclerView = qbz0Var.a;
                if (recyclerView != null) {
                    recyclerView.invalidate();
                }
                this.n = false;
                kgx kgxVar3 = kgxVarArr[1];
                op3Var.b(null);
            } else if (xkb1Var2 instanceof qw10) {
                iw10 iw10Var = this.q;
                if (iw10Var != null) {
                    iw10Var.a(null, null);
                }
                mw10 mw10Var6 = this.r;
                if (mw10Var6 != null) {
                    mw10Var6.f(null);
                }
                if (pv10Var != null) {
                    pv10Var.R = null;
                    if (pv10Var.K != null) {
                        qp3 qp3Var2 = pv10Var.M;
                        kgx kgxVar4 = pv10.T[1];
                        qp3Var2.b(null);
                        pv10Var.d();
                    }
                }
            } else {
                if (!jl40.l(xkb1Var2, pw10Var2)) {
                    w511.b();
                    return;
                }
                kgx kgxVar5 = kgxVarArr[2];
                qp3Var.b(null);
                zf0Var.b = false;
                zf0Var.g = null;
                zf0Var.b();
            }
        }
        if (!xkb1Var.equals(pw10Var7) && !xkb1Var.equals(pw10Var6) && !xkb1Var.equals(pw10Var5)) {
            boolean equals = xkb1Var.equals(pw10Var4);
            kz10 kz10Var = this.f;
            if (equals) {
                Long l3 = this.y;
                if (l3 != null) {
                    long longValue = l3.longValue();
                    bcb bcbVar = this.s;
                    if (bcbVar != null) {
                        ecb a = bcbVar.a(longValue);
                        if (a instanceof ccb) {
                            pw10Var = pw10Var5;
                            pzt0 N = tje.N(this.o, null, null, new MessageTextTranslationHelper$updateUiStateDelayed$1(((ccb) a).a, this, null), 3);
                            i = 0;
                            kgx kgxVar6 = kgxVarArr[0];
                            this.K.a(N);
                            ww10 ww10Var = this.t;
                            x08 a2 = ww10Var != null ? ww10Var.a(longValue) : null;
                            kgx kgxVar7 = kgxVarArr[1];
                            op3Var.b(a2);
                        } else {
                            pw10Var = pw10Var5;
                            i = 0;
                            if (!a.equals(dcb.a)) {
                                w511.b();
                                return;
                            }
                            ServerMessageRef serverMessageRef = this.w;
                            if (serverMessageRef != null) {
                                f5b a3 = kz10Var.a(serverMessageRef);
                                z83.g(null, Looper.myLooper(), a3.c.getLooper());
                                e5bVar2 = new e5b(a3, serverMessageRef, null);
                            } else {
                                e5bVar2 = null;
                            }
                            kgx kgxVar8 = kgxVarArr[2];
                            qp3Var.b(e5bVar2);
                        }
                    }
                }
            } else {
                pw10Var = pw10Var5;
                i = 0;
                if (xkb1Var.equals(pw10Var3)) {
                    mw10 mw10Var7 = this.r;
                    if (mw10Var7 != null) {
                        mw10Var7.a.setAlpha(0.0f);
                    }
                    if (pv10Var != null) {
                        pv10Var.c(0.0f);
                    }
                } else if (xkb1Var instanceof rw10) {
                    rw10 rw10Var = (rw10) xkb1Var;
                    if (rw10Var.a && (mw10Var3 = this.r) != null) {
                        mw10Var3.a.setAlpha(0.0f);
                    }
                    if (rw10Var.b && pv10Var != null) {
                        pv10Var.c(0.0f);
                    }
                    RecyclerView recyclerView2 = qbz0Var.a;
                    if (recyclerView2 != null) {
                        recyclerView2.invalidate();
                    }
                    this.n = true;
                    Long l4 = this.y;
                    if (l4 != null) {
                        long longValue2 = l4.longValue();
                        com.yandex.messaging.internal.translator.b bVar = this.u;
                        if (bVar != null) {
                            bVar.c(longValue2);
                        }
                        ww10 ww10Var2 = this.t;
                        if (ww10Var2 != null) {
                            x08Var = ww10Var2.a(longValue2);
                            kgx kgxVar9 = kgxVarArr[1];
                            op3Var.b(x08Var);
                        }
                    }
                    x08Var = null;
                    kgx kgxVar92 = kgxVarArr[1];
                    op3Var.b(x08Var);
                } else if (xkb1Var instanceof qw10) {
                    Long l5 = this.y;
                    if (l5 != null) {
                        long longValue3 = l5.longValue();
                        com.yandex.messaging.internal.translator.b bVar2 = this.u;
                        if (bVar2 != null) {
                            bVar2.g(longValue3);
                        }
                    }
                    iw10 iw10Var2 = this.q;
                    if (iw10Var2 != null) {
                        Pair pair = ((qw10) xkb1Var).c;
                        iw10Var2.a(pair != null ? (List) pair.c() : null, pair != null ? (List) pair.f() : null);
                    }
                    mw10 mw10Var8 = this.r;
                    if (mw10Var8 != null) {
                        String str3 = ((qw10) xkb1Var).a;
                        if (str3 == null || evu0.J(str3)) {
                            str3 = null;
                        }
                        mw10Var8.f(str3);
                    }
                    if (pv10Var != null) {
                        String str4 = ((qw10) xkb1Var).b;
                        if (str4 == null || evu0.J(str4)) {
                            str4 = null;
                        }
                        pv10Var.R = str4;
                        if (pv10Var.K != null) {
                            qp3 qp3Var3 = pv10Var.M;
                            kgx kgxVar10 = pv10.T[1];
                            qp3Var3.b(null);
                            pv10Var.d();
                        }
                    }
                } else {
                    if (!xkb1Var.equals(pw10Var2)) {
                        w511.b();
                        return;
                    }
                    ServerMessageRef serverMessageRef2 = this.w;
                    if (serverMessageRef2 != null) {
                        c9v c9vVar = new c9v(25, this, serverMessageRef2);
                        f5b a4 = kz10Var.a(serverMessageRef2);
                        z83.g(null, Looper.myLooper(), a4.c.getLooper());
                        e5bVar = new e5b(a4, serverMessageRef2, c9vVar);
                    } else {
                        e5bVar = null;
                    }
                    kgx kgxVar11 = kgxVarArr[2];
                    qp3Var.b(e5bVar);
                    xyz xyzVar = new xyz(26, this);
                    zf0Var.b = true;
                    zf0Var.g = xyzVar;
                    zf0Var.b();
                }
            }
            mw10Var = this.r;
            if (mw10Var != null && (l = this.z) != null) {
                long longValue4 = l.longValue();
                if (((!xkb1Var.equals(pw10Var7) || xkb1Var.equals(pw10Var3)) ? i : 1) != 0) {
                    AppCompatTextView appCompatTextView = mw10Var.a;
                    ViewParent parent = appCompatTextView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    int height = viewGroup != null ? viewGroup.getHeight() : i;
                    if (appCompatTextView.getBottom() > 0 && appCompatTextView.getTop() < height) {
                        i2 = 1;
                        if (!xkb1Var.equals(pw10Var6) && !xkb1Var.equals(pw10Var)) {
                            i = 1;
                        }
                        boolean z = xkb1Var instanceof qw10;
                        g gVar = this.k;
                        longSparseArray = gVar.b;
                        if (i2 != 0 || i == 0) {
                            longSparseArray.remove(longValue4);
                        } else {
                            longSparseArray.put(longValue4, Boolean.valueOf(z));
                        }
                        tje.N(gVar.a, null, null, new TranslationsViewStateHolder$setMessageBubbleState$1(gVar, null), 3);
                    }
                }
                i2 = i;
                if (!xkb1Var.equals(pw10Var6)) {
                    i = 1;
                }
                boolean z2 = xkb1Var instanceof qw10;
                g gVar2 = this.k;
                longSparseArray = gVar2.b;
                if (i2 != 0) {
                }
                longSparseArray.remove(longValue4);
                tje.N(gVar2.a, null, null, new TranslationsViewStateHolder$setMessageBubbleState$1(gVar2, null), 3);
            }
            str = this.N;
            if (str != null && (mw10Var2 = this.r) != null) {
                mw10Var2.f(str);
            }
            str2 = this.O;
            if (str2 != null && pv10Var != null) {
                pv10Var.R = str2;
                if (pv10Var.K != null) {
                    qp3 qp3Var4 = pv10Var.M;
                    kgx kgxVar12 = pv10.T[1];
                    qp3Var4.b(null);
                    pv10Var.d();
                }
            }
            this.P = xkb1Var;
        }
        pw10Var = pw10Var5;
        i = 0;
        mw10Var = this.r;
        if (mw10Var != null) {
            long longValue42 = l.longValue();
            if (((!xkb1Var.equals(pw10Var7) || xkb1Var.equals(pw10Var3)) ? i : 1) != 0) {
            }
            i2 = i;
            if (!xkb1Var.equals(pw10Var6)) {
            }
            boolean z22 = xkb1Var instanceof qw10;
            g gVar22 = this.k;
            longSparseArray = gVar22.b;
            if (i2 != 0) {
            }
            longSparseArray.remove(longValue42);
            tje.N(gVar22.a, null, null, new TranslationsViewStateHolder$setMessageBubbleState$1(gVar22, null), 3);
        }
        str = this.N;
        if (str != null) {
            mw10Var2.f(str);
        }
        str2 = this.O;
        if (str2 != null) {
            pv10Var.R = str2;
            if (pv10Var.K != null) {
            }
        }
        this.P = xkb1Var;
    }

    public final boolean f() {
        Boolean bool;
        String str = this.x;
        if (str == null || (bool = this.B) == null) {
            return false;
        }
        boolean booleanValue = bool.booleanValue();
        String str2 = this.v;
        if (str2 == null) {
            return false;
        }
        boolean l = jl40.l(this.E, str2);
        if (!booleanValue || l || evu0.J(str)) {
            return false;
        }
        mw10 mw10Var = this.r;
        return mw10Var == null || !mw10Var.A;
    }

    public final boolean g() {
        Boolean bool;
        String str = this.x;
        if (str != null && (bool = this.A) != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.B;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                Boolean bool3 = this.C;
                if (bool3 != null) {
                    boolean booleanValue3 = bool3.booleanValue();
                    if (booleanValue2 || booleanValue || evu0.J(str)) {
                        return false;
                    }
                    mw10 mw10Var = this.r;
                    return (mw10Var == null || !mw10Var.A) && !booleanValue3;
                }
            }
        }
        return false;
    }

    public final boolean h() {
        String text;
        ReplyData replyData;
        String authorGuid;
        String str;
        ReplyData replyData2 = this.D;
        return (replyData2 == null || (text = replyData2.getText()) == null || (replyData = this.D) == null || (authorGuid = replyData.getAuthorGuid()) == null || (str = this.v) == null || str.equals(authorGuid) || evu0.J(text)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean contains;
        String text;
        wab wabVar;
        String str;
        List list;
        wab wabVar2;
        wab wabVar3;
        kgx[] kgxVarArr = R;
        kgx kgxVar = kgxVarArr[0];
        rp3 rp3Var = this.K;
        String str2 = null;
        rp3Var.a(null);
        xkb1 xkb1Var = pw10.a;
        pw10 pw10Var = pw10.f;
        pw10 pw10Var2 = pw10.d;
        Long l = this.y;
        bcb bcbVar = this.s;
        if (!jl40.l(this.B, Boolean.FALSE) || this.D != null || g()) {
            if (this.v != null) {
                if ((!jl40.l(this.B, Boolean.TRUE) || f()) && (this.D == null || h() || g())) {
                    j3b j3bVar = this.J;
                    if (j3bVar != null) {
                        if (j3bVar == null ? false : this.d.b(j3bVar)) {
                            h3y h3yVar = this.j;
                            boolean z = ((zy01) h3yVar.get()).c;
                            lqo lqoVar = this.i;
                            if (!z && this.F == null && tga1.d(lqoVar) && ((this.G == null || !(g() || f())) && (this.H == null || !h()))) {
                                xkb1Var = pw10.e;
                            } else if (((zy01) h3yVar.get()).c || this.F != null) {
                                if (bcbVar != null && l != null) {
                                    if (((zy01) h3yVar.get()).c) {
                                        ServerMessageRef serverMessageRef = this.w;
                                        contains = serverMessageRef != null ? this.m.a.contains(serverMessageRef) : false;
                                    } else {
                                        contains = true;
                                    }
                                    if (contains) {
                                        if (c() && d()) {
                                            boolean g = g();
                                            List list2 = this.p;
                                            if ((g || f()) && c()) {
                                                List list3 = list2;
                                                wab wabVar4 = this.G;
                                                if (!kotlin.collections.a.G(list3, wabVar4 != null ? wabVar4.b : null) && (wabVar = this.G) != null) {
                                                    str = wabVar.c;
                                                    if (h() && d()) {
                                                        list = list2;
                                                        wabVar2 = this.H;
                                                        if (!kotlin.collections.a.G(list, wabVar2 == null ? wabVar2.b : null) && (wabVar3 = this.H) != null) {
                                                            str2 = wabVar3.c;
                                                        }
                                                    }
                                                    xkb1Var = new qw10(str, str2, this.I);
                                                }
                                            }
                                            str = null;
                                            if (h()) {
                                                list = list2;
                                                wabVar2 = this.H;
                                                if (!kotlin.collections.a.G(list, wabVar2 == null ? wabVar2.b : null)) {
                                                    str2 = wabVar3.c;
                                                }
                                            }
                                            xkb1Var = new qw10(str, str2, this.I);
                                        } else {
                                            ecb a = bcbVar.a(l.longValue());
                                            if (a instanceof ccb) {
                                                pzt0 N = tje.N(this.o, null, null, new MessageTextTranslationHelper$updateUiStateDelayed$1(((ccb) a).a, this, null), 3);
                                                kgx kgxVar2 = kgxVarArr[0];
                                                rp3Var.a(N);
                                                xkb1Var = new rw10(!c(), !d());
                                            } else {
                                                if (!a.equals(dcb.a)) {
                                                    w511.b();
                                                    return;
                                                }
                                                if (lqoVar.a(tz10.w)) {
                                                    String str3 = this.N;
                                                    if (str3 == null) {
                                                        String str4 = this.x;
                                                        str3 = str4 != null ? "**Translated** : ".concat(str4) : null;
                                                    }
                                                    String str5 = this.O;
                                                    if (str5 == null) {
                                                        ReplyData replyData = this.D;
                                                        str5 = (replyData == null || (text = replyData.getText()) == null) ? null : "__Translated__ : ".concat(text);
                                                    }
                                                    xkb1Var = new qw10(str3, str5, null);
                                                } else {
                                                    xkb1Var = pw10.b;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e(xkb1Var);
                    }
                }
            }
            xkb1Var = pw10Var;
            e(xkb1Var);
        }
        xkb1Var = pw10Var2;
        e(xkb1Var);
    }
}
