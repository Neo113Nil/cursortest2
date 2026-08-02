package defpackage;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class lz81 extends vz81 {
    public final a b;

    public lz81(int i, a aVar) {
        super(i);
        cvw.m(aVar, "Null methods are not runnable.");
        this.b = aVar;
    }

    @Override // defpackage.vz81
    public final void a(Status status) {
        try {
            this.b.n(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.vz81
    public final void b(Exception exc) {
        try {
            this.b.n(new Status(10, g8e.p(exc.getClass().getSimpleName(), Extension.COLON_SPACE, exc.getLocalizedMessage())));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.vz81
    public final void c(jy81 jy81Var) {
        try {
            a aVar = this.b;
            om2 om2Var = jy81Var.b;
            aVar.getClass();
            try {
                aVar.m(om2Var);
            } catch (DeadObjectException e) {
                aVar.n(new Status(8, e.getLocalizedMessage(), (PendingIntent) null));
                throw e;
            } catch (RemoteException e2) {
                aVar.n(new Status(8, e2.getLocalizedMessage(), (PendingIntent) null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.vz81
    public final void d(rx81 rx81Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = rx81Var.a;
        a aVar = this.b;
        map.put(aVar, valueOf);
        aVar.d(new qx81(rx81Var, aVar));
    }
}
