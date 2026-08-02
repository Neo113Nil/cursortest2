package xsna;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import com.vk.log.L;

/* compiled from: FrescoImageViewBackend.kt */
/* loaded from: classes2.dex */
public final class ghs extends fc6<mjw> {
    public final /* synthetic */ fhs c;

    public ghs(fhs fhsVar) {
        this.c = fhsVar;
    }

    @Override // xsna.fc6, xsna.kqj
    public final void b(String str, Throwable th) {
        fhs fhsVar = this.c;
        b780 b780Var = fhsVar.z;
        if (b780Var != null) {
            b780Var.b(str, th);
        }
        fhsVar.y = false;
        io.reactivex.rxjava3.disposables.c cVar = fhsVar.p;
        if (cVar == null) {
            fhsVar.o = 1;
            SystemClock.elapsedRealtime();
            com.vk.core.utils.newtork.b.a.getClass();
            fhsVar.p = com.vk.core.utils.newtork.b.f().t0(1L).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wn(new l2k(fhsVar, 13), 29));
        } else if (fhsVar.o < fhsVar.F) {
            cVar.dispose();
            fhsVar.o++;
            com.vk.core.utils.newtork.b.a.getClass();
            fhsVar.p = com.vk.core.utils.newtork.b.f().x0().t0(1L).L(new r41(new lbe(fhsVar, 25), 24), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new t00(new t3h(fhsVar, 21), 29));
        } else {
            fhsVar.o = 0;
        }
        fhsVar.w = 0;
        fhsVar.x = 0;
        if (th instanceof NullPointerException) {
            L.f("VKImageView", "Can't load image", new NullPointerException(th.getMessage()));
        } else {
            L.f("VKImageView", "Can't load image", th);
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void d(String str) {
        b780 b780Var = this.c.z;
        if (b780Var != null) {
            b780Var.onCancel(str);
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void e(String str, Object obj, Animatable animatable) {
        com.vk.imageloader.stat.a aVar;
        mjw mjwVar = (mjw) obj;
        int width = mjwVar != null ? mjwVar.getWidth() : 0;
        fhs fhsVar = this.c;
        fhsVar.w = width;
        int height = mjwVar != null ? mjwVar.getHeight() : 0;
        fhsVar.x = height;
        b780 b780Var = fhsVar.z;
        if (b780Var != null) {
            b780Var.t(fhsVar.w, height, str);
        }
        fhsVar.y = true;
        fhsVar.o = 0;
        gkw gkwVar = fhsVar.l;
        com.vk.imageloader.stat.a aVar2 = gkwVar.b;
        if ((aVar2 != null ? aVar2.e() : null) != null || (aVar = gkwVar.b) == null) {
            return;
        }
        aVar.g(SystemClock.elapsedRealtime());
    }

    @Override // xsna.fc6, xsna.kqj
    public final void f(Object obj, String str) {
        fhs fhsVar = this.c;
        b780 b780Var = fhsVar.z;
        if (b780Var != null) {
            b780Var.g(str);
        }
        fhsVar.y = false;
    }
}
