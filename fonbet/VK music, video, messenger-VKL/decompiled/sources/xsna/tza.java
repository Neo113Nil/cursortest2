package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.sza;

/* compiled from: ChannelHeaderInfoStateSource.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class tza extends FunctionReferenceImpl implements izs<sza.c, mrb> {
    @Override // xsna.izs
    public final mrb invoke(sza.c cVar) {
        mrb b;
        sza.c cVar2 = cVar;
        sza szaVar = (sza) this.receiver;
        synchronized (szaVar) {
            try {
                sza.b bVar = cVar2.a;
                if (bVar instanceof sza.b.a) {
                    b = szaVar.a();
                } else {
                    if (bVar instanceof sza.b.c) {
                        sza.a aVar = cVar2.b;
                        if (aVar instanceof sza.a.b) {
                            b = szaVar.c(((sza.b.c) bVar).a, ((sza.a.b) aVar).a, cVar2.c, cVar2.d, cVar2.e, cVar2.f);
                        }
                    }
                    b = szaVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
