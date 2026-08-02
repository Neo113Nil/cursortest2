package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;

/* compiled from: EventConsumerImpl.kt */
/* loaded from: classes2.dex */
public final class myp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final pim b;

    public myp(pim pimVar) {
        this.b = pimVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        sxp sxpVar2 = sxpVar;
        boolean z = sxpVar2 instanceof p680;
        pim pimVar = this.b;
        if (z) {
            btk0 btk0Var = pimVar.l;
            if (btk0Var.b) {
                DialogExt dialogExt = btk0Var.a;
                pimVar.b1();
                pimVar.a1(dialogExt);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            a1w a1wVar = pimVar.i;
            if (a1wVar.u()) {
                btk0 btk0Var2 = pimVar.l;
                if (btk0Var2.c) {
                    return;
                }
                pimVar.k.b(a1wVar.F(pimVar, new qoz(btk0Var2.a.e, pim.r)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f50(new yp1(pimVar, 7), 26), new ia(new sg3(pimVar, 5), 25)));
                return;
            }
            return;
        }
        if (!(sxpVar2 instanceof r480)) {
            if (sxpVar2 instanceof ka80) {
                ProfilesInfo profilesInfo = ((ka80) sxpVar2).c;
                btk0 btk0Var3 = pimVar.l;
                if (!btk0Var3.c && btk0Var3.a.b.Ib(profilesInfo).g()) {
                    pimVar.X0();
                    pimVar.d1();
                    return;
                }
                return;
            }
            return;
        }
        r480 r480Var = (r480) sxpVar2;
        wpp<Long, Dialog> wppVar = r480Var.c;
        Object obj = r480Var.b;
        btk0 btk0Var4 = pimVar.l;
        if (btk0Var4.c || !wppVar.b(Long.valueOf(btk0Var4.a.e))) {
            return;
        }
        pimVar.Y0(wppVar, epx.f(obj, pim.r));
        DialogExt dialogExt2 = pimVar.l.a;
        long j = dialogExt2.e;
        Dialog Cb = dialogExt2.Cb();
        Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(j));
        boolean f = epx.f(Cb != null ? Cb.dc() : null, dialog != null ? dialog.dc() : null);
        boolean f2 = epx.f(Cb != null ? Boolean.valueOf(Cb.ec()) : null, dialog != null ? Boolean.valueOf(dialog.ec()) : null);
        if (f && f2) {
            return;
        }
        pimVar.l.a.Hb(wppVar.e(Long.valueOf(j)));
        pimVar.X0();
        pimVar.d1();
    }
}
