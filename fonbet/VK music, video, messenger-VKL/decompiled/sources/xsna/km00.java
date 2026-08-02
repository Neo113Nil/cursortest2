package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public class km00 extends FrameLayout {
    public final twz0 b;

    public km00(@NonNull Context context) {
        super(context);
        this.b = new twz0(this, context, null);
        setClickable(true);
    }

    public void d(Bundle bundle) {
        i(bundle);
    }

    public final void h(@NonNull g780 g780Var) {
        exc0.e("getMapAsync() must be called on the main thread");
        twz0 twz0Var = this.b;
        l4z l4zVar = twz0Var.a;
        if (l4zVar == null) {
            twz0Var.i.add(g780Var);
            return;
        }
        try {
            ((iwz0) l4zVar).b.l(new awz0(g780Var));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void i(@Nullable Bundle bundle) {
        twz0 twz0Var = this.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            twz0Var.getClass();
            twz0Var.d(bundle, new xmz0(twz0Var, bundle));
            if (twz0Var.a == null) {
                esl.b(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public km00(@NonNull Context context, @Nullable GoogleMapOptions googleMapOptions) {
        super(context);
        this.b = new twz0(this, context, googleMapOptions);
        setClickable(true);
    }
}
