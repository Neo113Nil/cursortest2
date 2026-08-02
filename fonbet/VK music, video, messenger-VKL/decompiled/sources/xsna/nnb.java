package xsna;

import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.e4g0;
import xsna.knb;
import xsna.mnb;

/* compiled from: ChatClipsBottomBarDecorationReducer.kt */
/* loaded from: classes2.dex */
public final class nnb extends dm50<dob, mnb, knb> {
    public final AtomicInteger d;

    public nnb() {
        super(knb.b.b);
        this.d = new AtomicInteger(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean i(Msg msg) {
        aux0 aux0Var = msg instanceof aux0 ? (aux0) msg : null;
        return (aux0Var != null ? aux0Var.R5() : null) != null;
    }

    @Override // xsna.dm50
    public final knb c(knb knbVar, mnb mnbVar) {
        knb knbVar2 = knbVar;
        mnb mnbVar2 = mnbVar;
        if (mnbVar2 instanceof mnb.h) {
            return knbVar2;
        }
        if (mnbVar2 instanceof mnb.a) {
            knb.c cVar = knbVar2 instanceof knb.c ? (knb.c) knbVar2 : null;
            Boolean valueOf = cVar != null ? Boolean.valueOf(cVar.d) : null;
            mnb.a aVar = (mnb.a) mnbVar2;
            DialogExt dialogExt = aVar.b;
            Msg msg = aVar.c;
            boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
            boolean i = i(aVar.c);
            String str = aVar.d;
            e4g0.a aVar2 = e4g0.b;
            return new knb.c(dialogExt, msg, booleanValue, i, str, aVar2 != null ? aVar2.a : null, aVar2 != null ? aVar2.b : null, aVar.e);
        }
        if (mnbVar2 instanceof mnb.g) {
            knb.c cVar2 = knbVar2 instanceof knb.c ? (knb.c) knbVar2 : null;
            return cVar2 != null ? knb.c.a(cVar2, !((knb.c) knbVar2).d, false, null, null, 251) : knbVar2;
        }
        if (mnbVar2 instanceof mnb.d) {
            knb.c cVar3 = knbVar2 instanceof knb.c ? (knb.c) knbVar2 : null;
            return (cVar3 == null || !cVar3.d) ? knbVar2 : knb.c.a((knb.c) knbVar2, false, false, null, null, 251);
        }
        if (mnbVar2 instanceof mnb.f) {
            knb.c cVar4 = knbVar2 instanceof knb.c ? (knb.c) knbVar2 : null;
            if (cVar4 == null) {
                return knbVar2;
            }
            return knb.c.a(cVar4, !i(cVar4.c) && cVar4.d, i(null), null, null, 241);
        }
        if (mnbVar2.equals(mnb.e.b)) {
            this.d.incrementAndGet();
            return knb.b.b;
        }
        if (mnbVar2 instanceof mnb.b) {
            mnb.b bVar = (mnb.b) mnbVar2;
            return new knb.a(bVar.b, bVar.c, bVar.d);
        }
        if (mnbVar2 instanceof mnb.c) {
            knb.a aVar3 = knbVar2 instanceof knb.a ? (knb.a) knbVar2 : null;
            return aVar3 != null ? new knb.a(aVar3.b, aVar3.c, true) : knbVar2;
        }
        if (!(mnbVar2 instanceof mnb.i)) {
            throw new NoWhenBranchMatchedException();
        }
        knb.c cVar5 = knbVar2 instanceof knb.c ? (knb.c) knbVar2 : null;
        if (cVar5 == null) {
            return knbVar2;
        }
        mnb.i iVar = (mnb.i) mnbVar2;
        return knb.c.a(cVar5, false, false, iVar.b, iVar.c, 159);
    }

    @Override // xsna.dm50
    public final dob d() {
        return new dob(e(new io3(4)), e(new n40(this, 18)), e(new qm1(this, 17)));
    }

    @Override // xsna.dm50
    public final void h(knb knbVar, dob dobVar) {
        knb knbVar2 = knbVar;
        dob dobVar2 = dobVar;
        if (knbVar2 instanceof knb.b) {
            f(dobVar2.a, knbVar2);
        } else if (knbVar2 instanceof knb.c) {
            f(dobVar2.b, knbVar2);
        } else {
            if (!(knbVar2 instanceof knb.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(dobVar2.c, knbVar2);
        }
    }
}
