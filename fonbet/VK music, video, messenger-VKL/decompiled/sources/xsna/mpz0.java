package xsna;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class mpz0 extends c4z implements DialogInterface.OnCancelListener {
    public volatile boolean b;
    public final AtomicReference c;
    public final com.google.android.gms.internal.base.zar d;
    public final GoogleApiAvailability e;

    public mpz0(t4z t4zVar, GoogleApiAvailability googleApiAvailability) {
        super(t4zVar);
        this.c = new AtomicReference(null);
        this.d = new com.google.android.gms.internal.base.zar(Looper.getMainLooper());
        this.e = googleApiAvailability;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.c.set(null);
        b(connectionResult, i);
    }

    public abstract void b(ConnectionResult connectionResult, int i);

    public abstract void c();

    public final void d(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        epz0 epz0Var = new epz0(connectionResult, i);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(null, epz0Var)) {
                this.d.post(new jpz0(this, epz0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // xsna.c4z
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        AtomicReference atomicReference = this.c;
        epz0 epz0Var = (epz0) atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int isGooglePlayServicesAvailable = this.e.isGooglePlayServicesAvailable(getActivity());
                if (isGooglePlayServicesAvailable == 0) {
                    atomicReference.set(null);
                    c();
                    return;
                } else {
                    if (epz0Var == null) {
                        return;
                    }
                    if (epz0Var.b.c == 18 && isGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            c();
            return;
        } else if (i2 == 0) {
            if (epz0Var != null) {
                a(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, epz0Var.b.toString()), epz0Var.a);
                return;
            }
            return;
        }
        if (epz0Var != null) {
            a(epz0Var.b, epz0Var.a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        epz0 epz0Var = (epz0) this.c.get();
        a(connectionResult, epz0Var == null ? -1 : epz0Var.a);
    }

    @Override // xsna.c4z
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new epz0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // xsna.c4z
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        epz0 epz0Var = (epz0) this.c.get();
        if (epz0Var == null) {
            return;
        }
        ConnectionResult connectionResult = epz0Var.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", epz0Var.a);
        bundle.putInt("failed_status", connectionResult.c);
        bundle.putParcelable("failed_resolution", connectionResult.d);
    }

    @Override // xsna.c4z
    public void onStart() {
        super.onStart();
        this.b = true;
    }

    @Override // xsna.c4z
    public void onStop() {
        super.onStop();
        this.b = false;
    }
}
