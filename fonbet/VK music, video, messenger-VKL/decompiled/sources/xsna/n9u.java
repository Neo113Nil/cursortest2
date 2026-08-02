package xsna;

import com.google.android.gms.tasks.OnCanceledListener;

/* compiled from: GoogleFitDataSource.kt */
/* loaded from: classes6.dex */
public final class n9u implements OnCanceledListener {
    public final /* synthetic */ lq9 a;

    public n9u(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        xgx0.a.getClass();
        xgx0.b("GoogleFitDataProvider.readData() -> GF steps sync canceled");
        this.a.z(new Throwable("GoogleFit VkSteps sync canceled"));
    }
}
