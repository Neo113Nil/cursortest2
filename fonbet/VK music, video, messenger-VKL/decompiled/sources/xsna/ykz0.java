package xsna;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class ykz0 implements xlz0 {
    public final amz0 a;
    public boolean b = false;

    public ykz0(amz0 amz0Var) {
        this.a = amz0Var;
    }

    @Override // xsna.xlz0
    public final boolean l() {
        if (this.b) {
            return false;
        }
        amz0 amz0Var = this.a;
        HashSet hashSet = amz0Var.p.x;
        if (hashSet == null || hashSet.isEmpty()) {
            amz0Var.i(null);
            return true;
        }
        this.b = true;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((knz0) it.next()).getClass();
        }
        return false;
    }

    @Override // xsna.xlz0
    public final void n() {
        if (this.b) {
            this.b = false;
            wkz0 wkz0Var = new wkz0(this, this);
            zlz0 zlz0Var = this.a.g;
            zlz0Var.sendMessage(zlz0Var.obtainMessage(1, wkz0Var));
        }
    }

    @Override // xsna.xlz0
    public final com.google.android.gms.common.api.internal.a o(com.google.android.gms.common.api.internal.a aVar) {
        amz0 amz0Var = this.a;
        try {
            nlz0 nlz0Var = amz0Var.p;
            mnz0 mnz0Var = nlz0Var.y;
            mnz0Var.a.add(aVar);
            aVar.zan(mnz0Var.b);
            a.f fVar = (a.f) nlz0Var.p.get(aVar.getClientKey());
            exc0.j(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !amz0Var.i.containsKey(aVar.getClientKey())) {
                aVar.run(fVar);
                return aVar;
            }
            aVar.setFailedResult(new Status(17));
            return aVar;
        } catch (DeadObjectException unused) {
            vkz0 vkz0Var = new vkz0(this, this);
            zlz0 zlz0Var = amz0Var.g;
            zlz0Var.sendMessage(zlz0Var.obtainMessage(1, vkz0Var));
            return aVar;
        }
    }

    @Override // xsna.xlz0
    public final com.google.android.gms.common.api.internal.a p(com.google.android.gms.common.api.internal.a aVar) {
        o(aVar);
        return aVar;
    }

    @Override // xsna.xlz0
    public final void s(int i) {
        amz0 amz0Var = this.a;
        amz0Var.i(null);
        amz0Var.q.e(i, this.b);
    }

    @Override // xsna.xlz0
    public final void m() {
    }

    @Override // xsna.xlz0
    public final void q(@Nullable Bundle bundle) {
    }

    @Override // xsna.xlz0
    public final void r(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
    }
}
