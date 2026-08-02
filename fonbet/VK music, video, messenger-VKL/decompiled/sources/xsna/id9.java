package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.voip.ui.VoipViewModelState;
import xsna.dd9;

/* compiled from: CallsQueueUserIdSupportAnonymsDelegate.kt */
/* loaded from: classes7.dex */
public final class id9 {
    public final pd9 a;
    public final cd9 b;
    public final fnw0 c;
    public io.reactivex.rxjava3.disposables.c d;
    public final io.reactivex.rxjava3.subjects.d<dd9.a> e;

    public id9(pd9 pd9Var, cd9 cd9Var, io.reactivex.rxjava3.core.w wVar, fnw0 fnw0Var) {
        this.a = pd9Var;
        this.b = cd9Var;
        this.c = fnw0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.e = io.reactivex.rxjava3.subjects.d.N0();
        bVar.b(((dvm0) fnw0Var.invoke()).b.a0(wVar).subscribe(new xf1(new com.vk.movika.sdk.base.observable.a(this, 12), 5)));
        bVar.b(pd9Var.a.c().U(new ju1(new x4(7), 7)).subscribe(new az(new com.vk.movika.sdk.base.observable.c(this, 16), 6)));
    }

    public final void a() {
        yqe0 yqe0Var = ((dvm0) this.c.invoke()).a;
        if (yqe0Var == null || yqe0Var.b != VoipViewModelState.InCall) {
            return;
        }
        L.e("CallsQueueUserIdDelegateSupportAnonyms", "observeAnonymousEvents id = " + new UserId(Long.parseLong(s1v.j().b)) + ", secretHash = " + s1v.j().g);
        this.d = this.b.b(new ey0(yqe0Var, 6), new eb(yqe0Var, 7)).subscribe(new fu0(new fb(this, 9), 6));
    }

    public final void b(boolean z) {
        fnw0 fnw0Var = this.c;
        if (!z) {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            if (cVar != null) {
                cVar.dispose();
            }
            this.d = null;
            if (((dvm0) fnw0Var.invoke()).a != null) {
                a();
                return;
            }
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.d = null;
        yqe0 yqe0Var = ((dvm0) fnw0Var.invoke()).a;
        if (yqe0Var != null ? yqe0Var.c : false) {
            a();
        } else {
            L.e("CallsQueueUserIdDelegateSupportAnonyms", "observeUserEvents");
            this.d = this.b.d(this.a.a.f()).subscribe(new h60(new a8(this, 13), 7));
        }
    }
}
