package xsna;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class jpz0 implements Runnable {
    public final epz0 b;
    public final /* synthetic */ mpz0 c;

    public jpz0(mpz0 mpz0Var, epz0 epz0Var) {
        this.c = mpz0Var;
        this.b = epz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mpz0 mpz0Var = this.c;
        if (mpz0Var.b) {
            epz0 epz0Var = this.b;
            ConnectionResult connectionResult = epz0Var.b;
            int i = connectionResult.c;
            GoogleApiAvailability googleApiAvailability = mpz0Var.e;
            googleApiAvailability.getClass();
            if (i != 9) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        switch (i) {
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                break;
                            default:
                                "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(connectionResult));
                                mpz0Var.a(connectionResult, epz0Var.a);
                                break;
                        }
                }
            }
            if (connectionResult.i()) {
                t4z t4zVar = mpz0Var.mLifecycleFragment;
                Activity activity = mpz0Var.getActivity();
                PendingIntent pendingIntent = connectionResult.d;
                exc0.i(pendingIntent);
                t4zVar.startActivityForResult(GoogleApiActivity.a(activity, pendingIntent, epz0Var.a, false), 1);
                return;
            }
            if (googleApiAvailability.b(mpz0Var.getActivity(), connectionResult.c, null) != null) {
                googleApiAvailability.g(mpz0Var.getActivity(), mpz0Var.mLifecycleFragment, connectionResult.c, mpz0Var);
                googleApiAvailability.i(mpz0Var.getActivity().getApplicationContext(), connectionResult, true);
                return;
            }
            if (connectionResult.c != 18) {
                mpz0Var.a(connectionResult, epz0Var.a);
                return;
            }
            Activity activity2 = mpz0Var.getActivity();
            ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
            builder.setView(progressBar);
            builder.setMessage(coz0.c(18, activity2));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            GoogleApiAvailability.k(activity2, create, "GooglePlayServicesUpdatingDialog", mpz0Var);
            GoogleApiAvailability.j(mpz0Var.getActivity().getApplicationContext(), new gpz0(this, create));
            googleApiAvailability.i(mpz0Var.getActivity().getApplicationContext(), connectionResult, true);
        }
    }
}
