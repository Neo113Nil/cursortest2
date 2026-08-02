package xsna;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.core.preference.Preference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l8i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0((ComponentActivity) this.c);
                break;
            case 1:
                n3w n3wVar = (n3w) this.c;
                n3wVar.n = new dsi(n3wVar);
                break;
            default:
                Context context = (Context) this.c;
                boolean z = pmr0.a;
                Preference.I("vendor", "play_services_available", GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0);
                break;
        }
    }
}
