package xsna;

import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;

/* compiled from: EventConsumerImpl.kt */
/* loaded from: classes2.dex */
public final class kyp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final xam b;

    public kyp(xam xamVar) {
        this.b = xamVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        sxp sxpVar2 = sxpVar;
        xam xamVar = this.b;
        io.reactivex.rxjava3.disposables.b bVar = xamVar.n;
        a1w a1wVar = xamVar.j;
        if (sxpVar2 instanceof p680) {
            ktk0 ktk0Var = xamVar.t;
            if (ktk0Var.b) {
                DialogExt dialogExt = ktk0Var.a;
                xamVar.d1();
                xamVar.c1(dialogExt);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            if (a1wVar.u()) {
                ktk0 ktk0Var2 = xamVar.t;
                if (ktk0Var2.c) {
                    return;
                }
                bVar.b(a1wVar.F(xamVar, new roz(ktk0Var2.a.e, xam.z)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ea(new i37(xamVar, 7), 25), new mp0(new j37(xamVar, 4), 17)));
                return;
            }
            return;
        }
        if (sxpVar2 instanceof r480) {
            wpp<Long, Dialog> wppVar = ((r480) sxpVar2).c;
            ktk0 ktk0Var3 = xamVar.t;
            long j = ktk0Var3.a.e;
            if (ktk0Var3.c || !wppVar.b(Long.valueOf(j))) {
                return;
            }
            Dialog Cb = xamVar.t.a.Cb();
            InfoBar zb = Cb != null ? Cb.zb() : null;
            Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(j));
            if (epx.f(zb, dialog != null ? dialog.zb() : null)) {
                return;
            }
            xamVar.t.a.Hb(wppVar.e(Long.valueOf(j)));
            xamVar.X0();
            xamVar.e1();
            xamVar.a1(xamVar.t.a());
            return;
        }
        if (sxpVar2 instanceof l980) {
            long j2 = ((l980) sxpVar2).c;
            ktk0 ktk0Var4 = xamVar.t;
            if (j2 != ktk0Var4.a.e || ktk0Var4.h) {
                return;
            }
            ktk0Var4.h = true;
            if (ktk0Var4.g != null) {
                ktk0Var4.g = null;
                xamVar.a1(ktk0Var4.a());
            }
            Dialog Cb2 = xamVar.t.a.Cb();
            if (Cb2 == null || !Cb2.t1() || Cb2.Jc()) {
                return;
            }
            bVar.b(a1wVar.F(xamVar, new yim(Cb2.Zb())).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new vl0(new a2a(xamVar, 5), 18)));
        }
    }
}
