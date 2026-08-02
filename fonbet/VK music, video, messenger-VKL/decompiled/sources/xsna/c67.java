package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c67 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c67(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.disposables.c cVar;
        switch (this.b) {
            case 0:
                k67 k67Var = (k67) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{zhy0.a("BiometricsLock: called with value:", booleanValue)});
                }
                n67 n67Var = k67Var.m;
                io.reactivex.rxjava3.subjects.d<Boolean> dVar = k67Var.k;
                if (o25.a().b() && k67Var.e) {
                    Boolean P0 = n67Var.b().P0();
                    Boolean bool = Boolean.TRUE;
                    if (epx.f(P0, bool) && k67Var.k()) {
                        dVar.onNext(bool);
                        io.reactivex.rxjava3.disposables.c cVar2 = k67Var.j;
                        if (cVar2 != null) {
                            cVar2.dispose();
                        }
                        k67Var.j = k67Var.s.q(asu0.a.d()).subscribe();
                        k67Var.j(k67Var.h);
                        if (k67Var.i && epx.f(n67Var.b().P0(), Boolean.TRUE)) {
                            k67Var.k();
                        }
                        ehe0 ehe0Var = (ehe0) k67Var.o.getValue();
                        ehe0Var.getClass();
                        ((xsl) uh.b.b()).c("HidePushContentJob");
                        Context context = ehe0Var.a;
                        Intent intent = new Intent(context, (Class<?>) HidePushContentService.class);
                        intent.putExtra("DELAY_IN_MS_KEY", ehe0Var.b.a());
                        context.stopService(intent);
                        break;
                    }
                }
                if ((!o25.a().b() || !k67Var.e) && (cVar = k67Var.j) != null) {
                    cVar.dispose();
                }
                dVar.onNext(Boolean.FALSE);
                k67Var.j(k67Var.h);
                if (k67Var.i) {
                    k67Var.k();
                }
                ehe0 ehe0Var2 = (ehe0) k67Var.o.getValue();
                ehe0Var2.getClass();
                ((xsl) uh.b.b()).c("HidePushContentJob");
                Context context2 = ehe0Var2.a;
                Intent intent2 = new Intent(context2, (Class<?>) HidePushContentService.class);
                intent2.putExtra("DELAY_IN_MS_KEY", ehe0Var2.b.a());
                context2.stopService(intent2);
                break;
            case 1:
                nog nogVar = (nog) this.c;
                awd0 awd0Var = (awd0) obj;
                int a = awd0Var.a();
                n3a buzVar = a != 0 ? a != 2 ? a != 5 ? a != 6 ? null : new buz(12, new ot(nogVar), new log(nogVar)) : new u0g0(new db(23)) : new buz(12, new nt(24), new zpb((byte) 0, 2)) : new buz(12, new e15(nogVar, 4), new mog(0, nogVar, (wzd0) awd0Var));
                if (buzVar != null) {
                    nogVar.b.b(buzVar, false);
                }
                break;
            default:
                pev0 pev0Var = (pev0) this.c;
                v9e0 v9e0Var = (v9e0) obj;
                if (!epx.f(pev0Var.h, v9e0Var)) {
                    pev0Var.h = v9e0Var;
                    pev0Var.i.onNext(v9e0Var);
                }
                break;
        }
        return s3q0.a;
    }
}
