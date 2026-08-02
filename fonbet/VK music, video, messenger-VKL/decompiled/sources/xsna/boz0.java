package xsna;

import android.os.DeadObjectException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class boz0 extends qoz0 {
    public final com.google.android.gms.common.api.internal.a b;

    public boz0(int i, com.google.android.gms.common.api.internal.a aVar) {
        super(i);
        this.b = aVar;
    }

    @Override // xsna.qoz0
    public final void a(@NonNull Status status) {
        try {
            this.b.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // xsna.qoz0
    public final void b(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.setFailedResult(new Status(10, tdj.a(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // xsna.qoz0
    public final void c(@NonNull qkz0 qkz0Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = qkz0Var.a;
        com.google.android.gms.common.api.internal.a aVar = this.b;
        map.put(aVar, valueOf);
        aVar.addStatusListener(new gqz0(qkz0Var, aVar));
    }

    @Override // xsna.qoz0
    public final void d(hmz0 hmz0Var) throws DeadObjectException {
        try {
            this.b.run(hmz0Var.b);
        } catch (RuntimeException e) {
            b(e);
        }
    }
}
