package com.yandex.messaging.contacts.sync;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.ContactsContract;
import com.yandex.messaging.internal.authorized.sync.d;
import com.yandex.messaging.internal.authorized.sync.g;
import com.yandex.messaging.internal.v;
import defpackage.aqb1;
import defpackage.awu;
import defpackage.bi91;
import defpackage.cce;
import defpackage.dd21;
import defpackage.gd21;
import defpackage.h0x0;
import defpackage.jdf0;
import defpackage.k020;
import defpackage.kgx;
import defpackage.lqo;
import defpackage.ny61;
import defpackage.op3;
import defpackage.p1z;
import defpackage.qa2;
import defpackage.qoi0;
import defpackage.rz10;
import defpackage.s2x0;
import defpackage.s7m;
import defpackage.tje;
import defpackage.to3;
import defpackage.tz10;
import defpackage.u9e;
import defpackage.vff0;
import defpackage.vwc;
import defpackage.w1x0;
import defpackage.wff0;
import defpackage.wor0;
import defpackage.x22;
import defpackage.x4b0;
import defpackage.xdf0;
import defpackage.xi3;
import defpackage.xo3;
import defpackage.ydz;
import defpackage.z83;
import defpackage.zq60;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class b implements vff0 {
    public static final /* synthetic */ kgx[] S;
    public final u9e A;
    public final cce B;
    public final Handler C;
    public final Executor D;
    public final x22 E;
    public final v F;
    public final d G;
    public final rz10 H;
    public final lqo I;
    public final ContentResolver J;
    public final SyncContactController$observer$1 L;
    public gd21 M;
    public gd21 N;
    public String P;
    public Long Q;
    public SyncContactController$SyncState R;
    public final to3 a;
    public final k020 b;
    public final wff0 c;
    public final String w;
    public final s2x0 x;
    public final w1x0 y;
    public final p1z z;
    public final zq60 K = new zq60();
    public final op3 O = new op3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("clearQuery", 0, "getClearQuery()Lcom/yandex/messaging/Cancelable;", b.class);
        qoi0.a.getClass();
        S = new kgx[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.messaging.contacts.sync.SyncContactController$observer$1] */
    public b(Context context, to3 to3Var, k020 k020Var, wff0 wff0Var, String str, s2x0 s2x0Var, w1x0 w1x0Var, p1z p1zVar, u9e u9eVar, cce cceVar, final Handler handler, Executor executor, x22 x22Var, v vVar, d dVar, rz10 rz10Var, lqo lqoVar, xdf0 xdf0Var) {
        this.a = to3Var;
        this.b = k020Var;
        this.c = wff0Var;
        this.w = str;
        this.x = s2x0Var;
        this.y = w1x0Var;
        this.z = p1zVar;
        this.A = u9eVar;
        this.B = cceVar;
        this.C = handler;
        this.D = executor;
        this.E = x22Var;
        this.F = vVar;
        this.G = dVar;
        this.H = rz10Var;
        this.I = lqoVar;
        this.J = context.getContentResolver();
        this.L = new ContentObserver(handler) { // from class: com.yandex.messaging.contacts.sync.SyncContactController$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                b bVar = b.this;
                kgx[] kgxVarArr = b.S;
                bVar.j();
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                b bVar = b.this;
                kgx[] kgxVarArr = b.S;
                bVar.j();
            }
        };
        wff0Var.a(this);
        tje.N(xdf0Var, null, null, new SyncContactController$1(this, null), 3);
        this.R = SyncContactController$SyncState.IDLE;
    }

    public final gd21 a() {
        return new gd21(this.C, this.D, this.w, this.a, this.x, this.y, this.z, new wor0(this), this.E, this.G, this.I, this.b.f(), f());
    }

    @Override // defpackage.vff0
    public final void b() {
        this.c.c(this);
        this.K.clear();
        i();
    }

    public final void c(boolean z) {
        if (e()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long l = this.Q;
            this.Q = null;
            long f = this.b.f();
            aqb1.d(this.E, "sync_download_init", kotlin.collections.b.i(new Pair("uuid", this.w), new Pair("version", Long.valueOf(f))));
            h0x0 h0x0Var = new h0x0(this, l, elapsedRealtime, f, z);
            u9e u9eVar = this.A;
            u9eVar.E = h0x0Var;
            u9eVar.G = 0;
            s7m a = u9eVar.a();
            if (u9eVar.C != null) {
                u9eVar.D.offer(a);
            } else {
                a.c();
                u9eVar.C = a;
            }
        }
    }

    public final void d() {
        if (g()) {
            if (g()) {
                ContentResolver contentResolver = this.J;
                SyncContactController$observer$1 syncContactController$observer$1 = this.L;
                contentResolver.unregisterContentObserver(syncContactController$observer$1);
                contentResolver.registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, syncContactController$observer$1);
                if (ydz.a.a()) {
                    ydz.a();
                }
            }
            j();
        }
    }

    public final boolean e() {
        return !this.c.d.get() && this.H.c == null && this.I.a(tz10.k);
    }

    public final String f() {
        return (this.b.f() == 0 ? SyncContactController$SyncType.FULL : SyncContactController$SyncType.INCREMENT).getValue();
    }

    public final boolean g() {
        if (!e() || !this.I.a(tz10.A) || !((Boolean) this.G.k.a.getValue()).booleanValue() || !bi91.f(this.B.a)) {
            return false;
        }
        z83.g(null, Looper.myLooper(), this.C.getLooper());
        if (this.P == null) {
            x4b0 A = this.b.A();
            this.P = A != null ? A.g : null;
        }
        return "U".equals(this.P);
    }

    public final void h(SyncContactController$SyncState syncContactController$SyncState) {
        boolean z;
        if (this.R == syncContactController$SyncState) {
            return;
        }
        if (ydz.a.a()) {
            Objects.toString(this.R);
            syncContactController$SyncState.toString();
            ydz.a();
        }
        this.R = syncContactController$SyncState;
        zq60 zq60Var = this.K;
        zq60Var.getClass();
        ArrayList arrayList = zq60Var.a;
        zq60Var.b++;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((g) arrayList.get(i)).getClass();
                i++;
            }
        }
    }

    public final void i() {
        this.J.unregisterContentObserver(this.L);
        qa2 qa2Var = ydz.a;
        if (qa2Var.a()) {
            ydz.a();
        }
        this.A.d();
        this.N = null;
        gd21 gd21Var = this.M;
        if (gd21Var != null) {
            gd21Var.n.set(true);
            xo3 xo3Var = gd21Var.p;
            if (xo3Var != null) {
                xo3Var.cancel();
            }
            gd21Var.p = null;
            gd21Var.h = null;
        }
        this.M = null;
        kgx kgxVar = S[0];
        this.O.b(null);
        h(SyncContactController$SyncState.IDLE);
        if (qa2Var.a()) {
            ydz.a();
        }
    }

    public final void j() {
        if (!g()) {
            this.Q = null;
            return;
        }
        gd21 gd21Var = this.N;
        gd21 gd21Var2 = this.M;
        if (gd21Var != null) {
            z83.d(gd21Var2, null);
            this.N = a();
        } else if (gd21Var2 != null) {
            this.N = a();
            gd21 gd21Var3 = this.M;
            if (gd21Var3 != null) {
                xo3 xo3Var = gd21Var3.p;
                if (xo3Var != null) {
                    z83.g(null, xo3Var.x.a, Looper.myLooper());
                    xi3 xi3Var = xo3Var.c;
                    if (xi3Var != null) {
                        xi3Var.close();
                        xo3Var.c = null;
                    }
                    jdf0 jdf0Var = xo3Var.w;
                    if (jdf0Var != null) {
                        jdf0Var.c.c.c(jdf0Var);
                        vwc vwcVar = jdf0Var.b;
                        if (vwcVar != null) {
                            vwcVar.o();
                            awu awuVar = vwcVar.x;
                            if (awuVar != null) {
                                awuVar.d();
                            }
                        }
                    }
                }
                gd21Var3.n.set(true);
            }
        } else {
            this.Q = Long.valueOf(SystemClock.elapsedRealtime());
            aqb1.d(this.E, "sync_upload_init", kotlin.collections.b.i(new Pair("uuid", this.w), new Pair("version", Long.valueOf(this.b.f())), new Pair("type", f())));
            gd21 a = a();
            if (a.b(0, 1)) {
                a.b.execute(new dd21(a));
            }
            this.M = a;
        }
        h(SyncContactController$SyncState.UPLOADING);
    }
}
