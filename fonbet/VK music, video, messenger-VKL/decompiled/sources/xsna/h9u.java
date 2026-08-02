package xsna;

import com.google.android.gms.tasks.OnCanceledListener;

/* compiled from: GoogleFitDataProvider.kt */
/* loaded from: classes6.dex */
public final class h9u implements OnCanceledListener {
    public final /* synthetic */ lq9 a;

    public h9u(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        xgx0.a.getClass();
        xgx0.b("GoogleFitDataProvider.readData() -> GF workouts sync canceled");
        this.a.z(null);
    }
}
