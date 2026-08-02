package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.nv3;
import xsna.xv3;
import xsna.yv3;

/* compiled from: VoipCallViewAsrRecordDelegate.kt */
/* loaded from: classes7.dex */
public final class vjw0 {
    public final l7s a;
    public final ov3 b;
    public final com.vk.voip.ui.hint.a c;
    public final xjw0 d;
    public final yjw0 e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();

    public vjw0(l7s l7sVar, ov3 ov3Var, com.vk.voip.ui.hint.a aVar, mjw0 mjw0Var) {
        this.a = l7sVar;
        this.b = ov3Var;
        this.c = aVar;
        this.d = new xjw0(l7sVar, ov3Var, (ViewGroup) mjw0Var.findViewById(R.id.asr_preview_extended_container));
        this.e = new yjw0(l7sVar, ov3Var, mjw0Var);
    }

    public final void a(boolean z) {
        yjw0 yjw0Var = this.e;
        io.reactivex.rxjava3.disposables.b bVar = yjw0Var.d;
        if (z) {
            ov3 ov3Var = yjw0Var.b;
            ov3Var.b();
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(ov3Var.c.a0(asu0.a.d()).b0(yv3.d.class), new awi0(new p9w0(3), 15)).subscribe(new uk40(new u5p0(yjw0Var, 18), 29)));
        } else {
            bVar.e();
            ikv0 ikv0Var = yjw0Var.e;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            yjw0Var.e = null;
        }
        xjw0 xjw0Var = this.d;
        io.reactivex.rxjava3.disposables.b bVar2 = xjw0Var.f;
        if (z) {
            ov3 ov3Var2 = xjw0Var.b;
            ov3Var2.b();
            bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.y(ov3Var2.c.a0(asu0.a.d()).U(new o860(new epj0(15), 16)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new epq0(new iyd0(xjw0Var, 25), 9)));
        } else {
            bVar2.e();
            xjw0Var.a();
        }
        io.reactivex.rxjava3.disposables.b bVar3 = this.f;
        if (!z) {
            bVar3.e();
            return;
        }
        com.vk.voip.ui.c.b.getClass();
        io.reactivex.rxjava3.subjects.f<nv3> fVar = com.vk.voip.ui.c.G().i;
        asu0 asu0Var = asu0.a;
        bVar3.b(fVar.a0(asu0Var.d()).b0(nv3.a.class).subscribe(new j720(new l9v0(this, 5), 20)));
        bVar3.b(this.b.b.a0(asu0Var.d()).b0(xv3.a.class).subscribe(new y730(new ftu0(this, 6), 26)));
    }
}
