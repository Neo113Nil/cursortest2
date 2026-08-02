package defpackage;

import com.yandex.messaging.internal.entities.MessageTranslation;
import defpackage.bcb;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class ocb implements vpr {
    public final /* synthetic */ pcb a;

    public ocb(pcb pcbVar) {
        this.a = pcbVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        az01 az01Var = (az01) obj;
        long j = az01Var.a;
        if (az01Var.b.equals(MessageTranslation.Status.PENDING.a)) {
            pcb pcbVar = this.a;
            pcbVar.i.d(j, new rfa(21));
            rnz rnzVar = pcbVar.h.b;
            if (((bcb.a) rnzVar.c(j)) == null) {
                rnzVar.h(j, new bcb.a((Long) null, 1));
            }
        }
        return zy11.a;
    }
}
