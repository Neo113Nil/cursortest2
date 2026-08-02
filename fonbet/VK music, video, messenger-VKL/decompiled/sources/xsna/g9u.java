package xsna;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.Result;

/* compiled from: GoogleFitDataProvider.kt */
/* loaded from: classes6.dex */
public final class g9u implements OnFailureListener {
    public final /* synthetic */ lq9 a;

    public g9u(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        xgx0 xgx0Var = xgx0.a;
        String str = "GoogleFitDataProvider.readData() -> Error while reading data from History API: " + exc.getMessage();
        xgx0Var.getClass();
        xgx0.b(str);
        this.a.resumeWith(new Result.Failure(exc));
    }
}
