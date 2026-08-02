package androidx.compose.ui;

import defpackage.bts;
import defpackage.bvf0;
import defpackage.c530;
import defpackage.cid;
import defpackage.d530;
import defpackage.f530;
import defpackage.fid;
import defpackage.tls;
import defpackage.wls;
import defpackage.ym11;
import defpackage.zls;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class b {
    public static final f530 a(f530 f530Var, tls tlsVar, zls zlsVar) {
        return f530Var.k(new cid(tlsVar, zlsVar));
    }

    public static final f530 c(fid fidVar, f530 f530Var) {
        if (f530Var.h(ComposedModifierKt$materializeImpl$1.w)) {
            return f530Var;
        }
        final bts btsVar = (bts) fidVar;
        btsVar.f0(1219399079);
        f530 f530Var2 = (f530) f530Var.b(c530.a, new wls() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                f530 f530Var3 = (f530) obj;
                f530 f530Var4 = (d530) obj2;
                if (f530Var4 instanceof cid) {
                    zls zlsVar = ((cid) f530Var4).b;
                    ym11.e(3, zlsVar);
                    f530Var4 = b.c(fid.this, (f530) zlsVar.invoke(c530.a, fid.this, 0));
                }
                return f530Var3.k(f530Var4);
            }
        });
        btsVar.t(false);
        return f530Var2;
    }

    public static final f530 d(fid fidVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(439770924);
        f530 c = c(btsVar, f530Var);
        btsVar.t(false);
        return c;
    }

    public static final Object e(AtomicReference atomicReference, tls tlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        return bvf0.n(new SessionMutex$withSessionCancellingPrevious$2(tlsVar, atomicReference, wlsVar, null), continuationImpl);
    }
}
