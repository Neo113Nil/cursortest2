package xsna;

import com.ironsource.B;
import com.ironsource.C;
import com.ironsource.C4525r6;
import com.ironsource.E;
import com.ironsource.I;
import com.vk.core.tips.Tooltip;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import xsna.ozs0;
import xsna.p2x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hhj0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s, Tooltip.c, E, qa80 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hhj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.ironsource.E
    public B a(C c, I i) {
        B b;
        b = C4525r6.b((C4525r6) this.c, c, i);
        return b;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return ((pwp0) this.c).invoke((Map) obj, obj2);
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        p2x0 p2x0Var = ((s2x0) this.c).b;
        p2x0Var.c.onNext(p2x0.b.a.a);
    }

    @Override // xsna.qa80
    public void g(ru.rustore.sdk.activitylauncher.a aVar) {
        vtj0 vtj0Var = (vtj0) this.c;
        if (aVar.equals(a.C2395a.b)) {
            vtj0Var.a(new RuStoreOutdatedException());
            return;
        }
        if (aVar instanceof a.d ? true : aVar.equals(a.e.b) ? true : aVar.equals(a.f.b)) {
            vtj0Var.a(new RuStoreInstallException(aVar.a()));
            return;
        }
        if (aVar.equals(a.c.b) ? true : aVar.equals(a.b.b)) {
            vtj0Var.b(s3q0.a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        ozs0 ozs0Var = (ozs0) this.c;
        final mm80 O = ozs0Var.O();
        if (O == null) {
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = ozs0Var.h().subscribe(new j990(new exi0(rVar, 24), 17), new u2c0(new lir0(3), 1));
        final ozs0.g gVar = new ozs0.g(ref$ObjectRef, ozs0Var, rVar);
        O.b(gVar);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.gzs0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                mm80 mm80Var = O;
                ozs0.g gVar2 = gVar;
                ((io.reactivex.rxjava3.disposables.c) ref$ObjectRef2.element).dispose();
                synchronized (mm80Var) {
                    mm80Var.e().f.remove(gVar2);
                }
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 4:
                int i2 = UserProfileFragment.p0;
                return ((Boolean) ((svk0) obj2).invoke(obj)).booleanValue();
            case 9:
                return ((Boolean) ((d220) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((mmw0) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (hda) ((ihj0) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.t) ((rxz) this.c).invoke(obj);
            case 2:
                return (String) ((d220) this.c).invoke(obj);
            case 3:
            case 4:
            default:
                return (ncq0) ((mmw0) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((xvl0) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((d220) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((g3s0) this.c).invoke(obj);
        }
    }
}
