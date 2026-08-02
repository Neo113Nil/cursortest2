package ru.rustore.sdk.activitylauncher;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import xsna.v90;

/* compiled from: RuStoreActivityLauncher.kt */
/* loaded from: classes9.dex */
public final class RuStoreActivityLauncher extends Activity {
    public static final /* synthetic */ int d = 0;
    public ResultReceiver b;
    public v90 c;

    public final void a(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver == null) {
            resultReceiver = null;
        }
        resultReceiver.send(i, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            a(i2, intent != null ? intent.getExtras() : null);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        Object parcelableExtra2;
        RuStoreActivityLauncher ruStoreActivityLauncher;
        RuStoreActivityLauncher ruStoreActivityLauncher2;
        RuStoreActivityLauncher ruStoreActivityLauncher3;
        super.onCreate(bundle);
        this.c = new v90(getApplicationContext());
        Intent intent = getIntent();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableExtra = intent.getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, ResultReceiver.class);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            parcelableExtra = intent.getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.b = (ResultReceiver) parcelableExtra;
        if (bundle == null) {
            Intent intent2 = getIntent();
            if (i >= 33) {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.class);
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT");
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            try {
            } catch (ActivityNotFoundException e) {
                e = e;
                ruStoreActivityLauncher3 = this;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                ruStoreActivityLauncher2 = this;
            } catch (Exception e3) {
                e = e3;
                ruStoreActivityLauncher = this;
            }
            try {
                startIntentSenderForResult(((PendingIntent) parcelableExtra2).getIntentSender(), 0, null, 0, 0, 0);
            } catch (ActivityNotFoundException e4) {
                e = e4;
                ruStoreActivityLauncher3 = this;
                v90 v90Var = ruStoreActivityLauncher3.c;
                if (v90Var == null) {
                    v90Var = null;
                }
                v90Var.a(e);
                a(2, null);
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                ruStoreActivityLauncher2 = this;
                v90 v90Var2 = ruStoreActivityLauncher2.c;
                if (v90Var2 == null) {
                    v90Var2 = null;
                }
                v90Var2.a(e);
                a(9901, null);
            } catch (Exception e6) {
                e = e6;
                ruStoreActivityLauncher = this;
                v90 v90Var3 = ruStoreActivityLauncher.c;
                if (v90Var3 == null) {
                    v90Var3 = null;
                }
                v90Var3.a(e);
                a(9902, null);
            }
        }
    }
}
