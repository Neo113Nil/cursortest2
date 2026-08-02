package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import defpackage.a091;
import defpackage.cvw;
import defpackage.dey;
import defpackage.hdy;
import defpackage.oyr;
import defpackage.xst;
import defpackage.xz81;
import defpackage.yst;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes11.dex */
public final class zak extends zap {
    private final SparseArray zad;

    private zak(dey deyVar) {
        super(deyVar, com.google.android.gms.common.a.d);
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(hdy hdyVar) {
        dey fragment = b.getFragment(hdyVar);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    private final xz81 zai(int i) {
        if (this.zad.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.zad;
        return (xz81) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zad.size(); i++) {
            xz81 zai = zai(i);
            if (zai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(zai.a);
                printWriter.println(":");
                zai.b.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.b
    public final void onStart() {
        super.onStart();
        if (this.zab.get() == null) {
            for (int i = 0; i < this.zad.size(); i++) {
                xz81 zai = zai(i);
                if (zai != null) {
                    zai.b.b();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.b
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.zad.size(); i++) {
            xz81 zai = zai(i);
            if (zai != null) {
                zai.b.c();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        xz81 xz81Var = (xz81) this.zad.get(i);
        if (xz81Var != null) {
            zae(i);
            xst xstVar = xz81Var.c;
            if (xstVar != null) {
                xstVar.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        for (int i = 0; i < this.zad.size(); i++) {
            xz81 zai = zai(i);
            if (zai != null) {
                zai.b.b();
            }
        }
    }

    public final void zad(int i, yst ystVar, xst xstVar) {
        cvw.m(ystVar, "GoogleApiClient instance cannot be null");
        cvw.n(oyr.i(i, "Already managing a GoogleApiClient with id "), this.zad.indexOfKey(i) < 0);
        a091 a091Var = (a091) this.zab.get();
        xz81 xz81Var = new xz81(this, i, ystVar, xstVar);
        ystVar.m(xz81Var);
        this.zad.put(i, xz81Var);
        if (this.zaa && a091Var == null) {
            ystVar.toString();
            ystVar.b();
        }
    }

    public final void zae(int i) {
        xz81 xz81Var = (xz81) this.zad.get(i);
        this.zad.remove(i);
        if (xz81Var != null) {
            yst ystVar = xz81Var.b;
            ystVar.p(xz81Var);
            ystVar.c();
        }
    }
}
