package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.PinnedMsg;
import java.util.Collection;

/* compiled from: EventConsumerImpl.kt */
/* loaded from: classes2.dex */
public final class nyp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final j140 b;

    public nyp(j140 j140Var) {
        this.b = j140Var;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        Dialog dialog;
        PinnedMsg dc;
        sxp sxpVar2 = sxpVar;
        j140 j140Var = this.b;
        a1w a1wVar = j140Var.k;
        DialogExt dialogExt = j140Var.j;
        if (sxpVar2 instanceof p680) {
            ctk0 ctk0Var = j140Var.Q;
            if (ctk0Var.a) {
                Msg msg = ctk0Var.c;
                ProfilesInfo profilesInfo = ctk0Var.d;
                j140Var.c1();
                j140Var.b1(msg, profilesInfo);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            j140Var.Y0(Source.CACHE);
            return;
        }
        if (sxpVar2 instanceof p980) {
            Collection<Integer> collection = ((p980) sxpVar2).d.get(Long.valueOf(dialogExt.e));
            if (collection == null || collection.isEmpty()) {
                return;
            }
            j140Var.I0(io.reactivex.rxjava3.kotlin.c.e(a1wVar.E(j140Var, new dj30(MsgIdType.LOCAL_ID, collection, null, null, false, null, 60)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new wh1(25), new cww(j140Var, 16)));
            return;
        }
        if (sxpVar2 instanceof f280) {
            f280 f280Var = (f280) sxpVar2;
            if (dialogExt.e == f280Var.b) {
                k28 k28Var = j140Var.F;
                (k28Var != null ? k28Var : null).X0(f280Var);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof e280) {
            Throwable th = ((e280) sxpVar2).b;
            k28 k28Var2 = j140Var.F;
            (k28Var2 != null ? k28Var2 : null).getClass();
            zk70.e(th);
            return;
        }
        if (!(sxpVar2 instanceof r480) || (dialog = (Dialog) ((r480) sxpVar2).c.c.get(Long.valueOf(dialogExt.e))) == null || (dc = dialog.dc()) == null) {
            return;
        }
        long j = dc.b;
        Msg msg2 = j140Var.Q.c;
        if (j == msg2.c && dc.c == msg2.d) {
            j140Var.a1(new MsgFromUser(dc, a1wVar.q().d), dialogExt.b);
        }
    }
}
