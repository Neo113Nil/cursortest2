package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import defpackage.cvw;
import defpackage.fy81;
import defpackage.h091;
import defpackage.i971;
import defpackage.jm2;
import defpackage.om2;
import defpackage.oy81;
import defpackage.t091;
import defpackage.ty81;
import defpackage.ux81;
import defpackage.w53;
import defpackage.wst;
import defpackage.y2c;
import defpackage.zm2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes11.dex */
public final class e implements ty81, wst {
    public final y2c A;
    public final Map B;
    public final jm2 C;
    public volatile fy81 D;
    public int E;
    public final d F;
    public final oy81 G;
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final com.google.android.gms.common.b w;
    public final zabh x;
    public final Map y;
    public final HashMap z = new HashMap();

    public e(Context context, d dVar, Lock lock, Looper looper, com.google.android.gms.common.b bVar, w53 w53Var, y2c y2cVar, w53 w53Var2, jm2 jm2Var, ArrayList arrayList, oy81 oy81Var) {
        this.c = context;
        this.a = lock;
        this.w = bVar;
        this.y = w53Var;
        this.A = y2cVar;
        this.B = w53Var2;
        this.C = jm2Var;
        this.F = dVar;
        this.G = oy81Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h091) arrayList.get(i)).c = this;
        }
        this.x = new zabh(this, looper);
        this.b = lock.newCondition();
        this.D = new i971(19, this);
    }

    @Override // defpackage.ty81
    public final a a(a aVar) {
        aVar.l();
        return this.D.p(aVar);
    }

    @Override // defpackage.ty81
    public final void b() {
        this.D.i();
    }

    @Override // defpackage.ty81
    public final void c() {
    }

    @Override // defpackage.ty81
    public final boolean d(t091 t091Var) {
        return false;
    }

    @Override // defpackage.ty81
    public final void e() {
        if (this.D.l()) {
            this.z.clear();
        }
    }

    @Override // defpackage.ty81
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.D);
        for (zm2 zm2Var : this.B.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) zm2Var.c).println(":");
            om2 om2Var = (om2) this.y.get(zm2Var.b);
            cvw.l(om2Var);
            om2Var.dump(str.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.ty81
    public final boolean g() {
        return this.D instanceof ux81;
    }

    public final void h() {
        this.a.lock();
        try {
            this.D = new i971(19, this);
            this.D.h();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.t4e
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.D.r(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.t4e
    public final void onConnectionSuspended(int i) {
        this.a.lock();
        try {
            this.D.j(i);
        } finally {
            this.a.unlock();
        }
    }
}
