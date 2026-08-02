package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.b;
import defpackage.gl7;
import defpackage.hsj0;
import defpackage.qoh;
import defpackage.tls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public abstract class a {
    public static gl7 a(final qoh qohVar) {
        final b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            qohVar.w(new tls() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    b bVar2 = b.this;
                    if (th == null) {
                        bVar2.b(qohVar.c());
                    } else if (th instanceof CancellationException) {
                        bVar2.c();
                    } else {
                        bVar2.d(th);
                    }
                    return zy11.a;
                }
            });
            bVar.a = "Deferred.asListenableFuture";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return gl7Var;
    }
}
