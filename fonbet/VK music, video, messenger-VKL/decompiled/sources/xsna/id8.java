package xsna;

import android.graphics.Color;
import com.vk.dto.common.Image;
import com.vk.dto.photo.Photo;
import kotlin.Result;
import xsna.aiq0;
import xsna.hr5;
import xsna.ir5;
import xsna.o2k;
import xsna.pta;

/* compiled from: BroadcastActionHandler.kt */
/* loaded from: classes5.dex */
public final class id8 implements s40<aiq0> {
    public final /* synthetic */ s40<aiq0> b;
    public final pta c;
    public final ouq0 d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final lyd0 f;

    public id8(pta ptaVar, ouq0 ouq0Var, io.reactivex.rxjava3.disposables.b bVar, lyd0 lyd0Var, liq0 liq0Var) {
        this.b = liq0Var;
        this.c = ptaVar;
        this.d = ouq0Var;
        this.e = bVar;
        this.f = lyd0Var;
    }

    public final void a() {
        io.reactivex.rxjava3.internal.operators.observable.b0 o = this.d.o(true);
        defpackage.z zVar = new defpackage.z(new com.vk.movika.sdk.base.data.a(this, 12), 8);
        int i = kwg0.a;
        this.e.b(o.subscribe(zVar, new hwg0()));
    }

    @Override // xsna.s40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void e2(aiq0 aiq0Var) {
        this.b.e2(aiq0Var);
    }

    public final void c(Image image) {
        pta.a.C3530a c3530a = new pta.a.C3530a(image != null ? new ir5.c(new hr5.a(image)) : new ir5.a(0));
        pta ptaVar = pta.this;
        if (epx.f(ptaVar.c.a, ptaVar.b.a)) {
            e2(new aiq0.d.a(c3530a));
        }
        e2(new aiq0.d.b(c3530a));
    }

    public final void d(Photo photo, String str) {
        Object failure;
        this.f.f().e();
        o2k.c.a aVar = null;
        o2k bVar = photo != null ? new o2k.c.b(new hea0(photo)) : null;
        if (str != null) {
            try {
                failure = Integer.valueOf(Color.parseColor("#FF".concat(drm0.U(str, "#"))));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Integer num = (Integer) failure;
            if (num != null) {
                aVar = new o2k.c.a(num.intValue());
            }
        }
        if (bVar == null) {
            bVar = aVar != null ? aVar : o2k.a.a;
        }
        pta.a.b bVar2 = new pta.a.b(bVar);
        pta ptaVar = pta.this;
        if (epx.f(ptaVar.c.b, ptaVar.b.b)) {
            e2(new aiq0.d.a(bVar2));
        }
        e2(new aiq0.d.b(bVar2));
    }
}
