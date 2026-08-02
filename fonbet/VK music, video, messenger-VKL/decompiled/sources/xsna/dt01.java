package xsna;

import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class dt01 extends gn01 {
    public final /* synthetic */ g0a a;

    public /* synthetic */ dt01(g0a g0aVar) {
        this.a = g0aVar;
    }

    @Override // xsna.gn01
    public final void a() {
        g0a g0aVar = this.a;
        if (g0aVar.e == null) {
            return;
        }
        try {
            lvf0 lvf0Var = g0aVar.j;
            if (lvf0Var != null) {
                lvf0Var.A();
            }
            g0aVar.e.p0();
        } catch (RemoteException unused) {
            g0a.n.b("Unable to call %s on %s.", "onConnected", oxz0.class.getSimpleName());
        }
        pp01 pp01Var = g0aVar.m;
        if (pp01Var != null) {
            pp01Var.zza();
        }
    }

    @Override // xsna.gn01
    public final void b(int i) {
        oxz0 oxz0Var = this.a.e;
        if (oxz0Var == null) {
            return;
        }
        try {
            oxz0Var.o(new ConnectionResult(i));
        } catch (RemoteException unused) {
            g0a.n.b("Unable to call %s on %s.", "onConnectionFailed", oxz0.class.getSimpleName());
        }
    }

    @Override // xsna.gn01
    public final void c(int i) {
        oxz0 oxz0Var = this.a.e;
        if (oxz0Var == null) {
            return;
        }
        try {
            oxz0Var.zzf(i);
        } catch (RemoteException unused) {
            g0a.n.b("Unable to call %s on %s.", "onConnectionSuspended", oxz0.class.getSimpleName());
        }
    }

    @Override // xsna.gn01
    public final void d(int i) {
        oxz0 oxz0Var = this.a.e;
        if (oxz0Var == null) {
            return;
        }
        try {
            oxz0Var.o(new ConnectionResult(i));
        } catch (RemoteException unused) {
            g0a.n.b("Unable to call %s on %s.", "onDisconnected", oxz0.class.getSimpleName());
        }
    }
}
