package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;

/* compiled from: EventConsumerImpl.kt */
/* loaded from: classes2.dex */
public final class lyp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final mem b;

    public lyp(mem memVar) {
        this.b = memVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        sxp sxpVar2 = sxpVar;
        mem memVar = this.b;
        io.reactivex.rxjava3.disposables.b bVar = memVar.n;
        if (sxpVar2 instanceof p680) {
            ltk0 ltk0Var = memVar.r;
            if (ltk0Var.a) {
                long j = ltk0Var.b;
                bVar.e();
                memVar.r = new ltk0();
                memVar.b1();
                memVar.Z0(j);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            ltk0 ltk0Var2 = memVar.r;
            if (ltk0Var2.k) {
                return;
            }
            bVar.b(memVar.j.F(memVar, new ooz(ltk0Var2.b)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ji3(new pem(1, memVar, mem.class, "onUpdateAllByCacheSuccess", "onUpdateAllByCacheSuccess(Lcom/vk/im/ui/components/dialog_header/actions/tasks/LoadAllByCacheCmd$Response;)V", 0), 26), new n20(new wv2(memVar, 4), 20)));
            return;
        }
        if (sxpVar2 instanceof r480) {
            wpp<Long, Dialog> wppVar = ((r480) sxpVar2).c;
            ltk0 ltk0Var3 = memVar.r;
            if (ltk0Var3.k) {
                return;
            }
            ltk0Var3.d.l(Long.valueOf(ltk0Var3.b), wppVar);
            memVar.X0();
            memVar.b1();
            return;
        }
        if (sxpVar2 instanceof u480) {
            boolean z = ((u480) sxpVar2).c;
            ltk0 ltk0Var4 = memVar.r;
            if (ltk0Var4.k) {
                return;
            }
            ltk0Var4.e = z;
        }
    }
}
