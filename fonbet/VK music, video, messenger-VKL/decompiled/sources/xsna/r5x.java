package xsna;

import android.app.Activity;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class r5x implements izs<Boolean, s3q0> {
    public final /* synthetic */ q5x b;
    public final /* synthetic */ Activity c;

    public r5x(q5x q5xVar, Activity activity) {
        this.b = q5xVar;
        this.c = activity;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        boolean booleanValue = bool2.booleanValue();
        q5x q5xVar = this.b;
        q5xVar.a = booleanValue;
        ((zak0) b4m.a).setValue(bool2);
        q5x.a(q5xVar, this.c);
        return s3q0.a;
    }
}
