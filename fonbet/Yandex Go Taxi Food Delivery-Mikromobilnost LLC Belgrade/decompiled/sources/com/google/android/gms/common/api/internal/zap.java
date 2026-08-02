package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.base.zau;
import defpackage.a091;
import defpackage.dey;
import defpackage.uw51;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zap extends b implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final com.google.android.gms.common.a zac;
    private final Handler zad;

    public zap(dey deyVar, com.google.android.gms.common.a aVar) {
        super(deyVar);
        this.zab = new AtomicReference(null);
        this.zad = new zau(Looper.getMainLooper());
        this.zac = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(ConnectionResult connectionResult, int i) {
        this.zab.set(null);
        zab(connectionResult, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zad() {
        this.zab.set(null);
        zac();
    }

    private static final int zae(a091 a091Var) {
        if (a091Var == null) {
            return -1;
        }
        return a091Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onActivityResult(int i, int i2, Intent intent) {
        a091 a091Var = (a091) this.zab.get();
        if (i != 1) {
            if (i == 2) {
                int d = this.zac.d(getActivity(), com.google.android.gms.common.b.a);
                if (d == 0) {
                    zad();
                    return;
                } else {
                    if (a091Var == null) {
                        return;
                    }
                    if (a091Var.b().getErrorCode() == 18 && d == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            zad();
            return;
        } else if (i2 == 0) {
            if (a091Var != null) {
                zaa(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, a091Var.b().toString()), zae(a091Var));
                return;
            }
            return;
        }
        if (a091Var != null) {
            zaa(a091Var.b(), a091Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), zae((a091) this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new a091(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onSaveInstanceState(Bundle bundle) {
        a091 a091Var = (a091) this.zab.get();
        if (a091Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", a091Var.a());
        bundle.putInt("failed_status", a091Var.b().getErrorCode());
        bundle.putParcelable("failed_resolution", a091Var.b().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.b
    public void onStart() {
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public void onStop() {
        this.zaa = false;
    }

    public abstract void zab(ConnectionResult connectionResult, int i);

    public abstract void zac();

    public final void zah(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        a091 a091Var = new a091(connectionResult, i);
        do {
            atomicReference = this.zab;
            if (uw51.B(atomicReference, a091Var)) {
                this.zad.post(new f(this, a091Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
