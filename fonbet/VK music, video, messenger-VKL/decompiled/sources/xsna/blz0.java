package xsna;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class blz0 extends ylz0 {
    public final /* synthetic */ ConnectionResult b;
    public final /* synthetic */ dlz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blz0(dlz0 dlz0Var, xlz0 xlz0Var, ConnectionResult connectionResult) {
        super(xlz0Var);
        this.b = connectionResult;
        this.c = dlz0Var;
    }

    @Override // xsna.ylz0
    public final void a() {
        this.c.d.e(this.b);
    }
}
