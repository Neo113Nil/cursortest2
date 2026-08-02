package xsna;

import android.view.MotionEvent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogExt;
import kotlin.NoWhenBranchMatchedException;
import xsna.rub;
import xsna.uub;

/* compiled from: ChatPreviewFeature.kt */
/* loaded from: classes18.dex */
public final class mub extends di6<vub, rub, uub, pub> {
    public final tum h;

    public mub(tum tumVar) {
        super(new vub(0));
        this.h = tumVar;
    }

    @Override // xsna.di6
    public final void d(rub rubVar) {
        rub rubVar2 = rubVar;
        if (rubVar2 instanceof rub.c) {
            rub.c cVar = (rub.c) rubVar2;
            Peer peer = cVar.b;
            io.reactivex.rxjava3.core.q<MotionEvent> qVar = cVar.c;
            tum tumVar = this.h;
            di6.l(this, tumVar.a.C("DialogsListRepositoryImpl", new tqm(peer, Source.ACTUAL)).l(new ju1(new l2i(peer, 5), 22)).q(tumVar.b).m(io.reactivex.rxjava3.schedulers.a.b()), new lub(this, qVar), 1);
        } else if (rubVar2.equals(rub.a.b)) {
            q(new xx0(11));
        } else {
            if (!(rubVar2 instanceof rub.b)) {
                throw new NoWhenBranchMatchedException();
            }
            lse0 lse0Var = ((rub.b) rubVar2).c;
            DialogExt dialogExt = g().a;
            u8m b = ajm.b(lse0Var);
            if (dialogExt != null && b != null) {
                n(new uub.a(dialogExt, b));
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
