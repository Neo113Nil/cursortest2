package xsna;

import android.view.View;
import com.ironsource.X3;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.writebar.WriteBar;
import xsna.uum;

/* compiled from: HackedAdsintService.kt */
/* loaded from: classes2.dex */
public final class tsu implements s1y0 {
    public final Object b;

    public /* synthetic */ tsu(Object obj) {
        this.b = obj;
    }

    @Override // xsna.s1y0
    public void a(f1y0 f1y0Var) {
        kz30 kz30Var = (kz30) this.b;
        WriteBar writeBar = kz30Var.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.B.getClass();
        e4w e4wVar = kz30Var.Q;
        View view = kz30Var.y;
        if (e4wVar.b(view != null ? view : null)) {
            return;
        }
        kz30Var.W(ly30.f);
    }

    @Override // xsna.s1y0
    public void b(f1y0 f1y0Var) {
        ((kz30) this.b).W(ly30.f);
    }

    @Override // xsna.s1y0
    public boolean c() {
        kz30 kz30Var = (kz30) this.b;
        return kz30Var.Q(kz30Var.h);
    }

    public dz2 d(String str) {
        dz2 x = yfb.x(zxc0.a((zxc0) this.b, str, null, 2));
        x.j.remove("events");
        x.j("events", X3.j.d + str + ']');
        return x;
    }

    public void e(AvatarAction avatarAction) {
        smb smbVar = ((xyb) this.b).y;
        smbVar.a();
        io.reactivex.rxjava3.disposables.c cVar = smbVar.m;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public void f(long j, boolean z) {
        xyb xybVar = (xyb) this.b;
        if (xybVar.q.f) {
            if (z) {
                j = 0;
            } else if (j >= 0) {
                xuo0.a.getClass();
                j += xuo0.a();
            }
            uum.a aVar = new uum.a();
            aVar.a = xybVar.q.a.f;
            aVar.a(j, z);
            aVar.c = Boolean.valueOf(z);
            xybVar.j.D(xybVar, new uum(aVar));
        }
    }

    public void g(AvatarAction avatarAction) {
        ((xyb) this.b).y.d(avatarAction);
    }
}
