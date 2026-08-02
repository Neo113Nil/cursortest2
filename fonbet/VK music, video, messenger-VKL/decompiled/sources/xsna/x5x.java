package xsna;

import android.app.Activity;
import android.widget.Toast;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class x5x implements gzs<s3q0> {
    public final /* synthetic */ q5x b;
    public final /* synthetic */ Activity c;

    public x5x(q5x q5xVar, Activity activity) {
        this.b = q5xVar;
        this.c = activity;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.b.f.a = true;
        Toast.makeText(this.c, "Stated", 1).show();
        return s3q0.a;
    }
}
