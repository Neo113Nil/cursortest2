package xsna;

import com.google.android.gms.common.ConnectionResult;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class clz0 extends ylz0 {
    public final /* synthetic */ rd6.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clz0(dlz0 dlz0Var, xlz0 xlz0Var, rd6.c cVar) {
        super(xlz0Var);
        this.b = cVar;
    }

    @Override // xsna.ylz0
    public final void a() {
        this.b.a(new ConnectionResult(16, null));
    }
}
