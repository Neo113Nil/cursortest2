package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.a;

/* loaded from: classes11.dex */
public final class ax91 extends q391 {
    public final /* synthetic */ a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax91(a aVar, int i, Bundle bundle) {
        super(aVar, i, bundle);
        this.g = aVar;
    }

    @Override // defpackage.q391
    public final boolean a() {
        this.g.H.a(ConnectionResult.RESULT_SUCCESS);
        return true;
    }

    @Override // defpackage.q391
    public final void b(ConnectionResult connectionResult) {
        a aVar = this.g;
        aVar.getClass();
        aVar.H.a(connectionResult);
        aVar.n(connectionResult);
    }
}
