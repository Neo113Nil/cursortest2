package xsna;

import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import xsna.aex0;

/* compiled from: VkUiLeaveGroupCommand.kt */
/* loaded from: classes6.dex */
public final class mwv0 implements aex0.b {
    public final /* synthetic */ pwv0 a;
    public final /* synthetic */ WebGroupShortInfo b;

    public mwv0(pwv0 pwv0Var, WebGroupShortInfo webGroupShortInfo) {
        this.a = pwv0Var;
        this.b = webGroupShortInfo;
    }

    @Override // xsna.aex0.b
    public final void a() {
        long j = this.b.b.b;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 e = vdx0Var.j().e(j);
        pwv0 pwv0Var = this.a;
        io.reactivex.rxjava3.disposables.c subscribe = e.subscribe(new qtq0(new ujm0(pwv0Var, 17), 5), new dfr0(new skj0(pwv0Var, 22), 6));
        io.reactivex.rxjava3.disposables.b b = pwv0Var.b();
        if (b != null) {
            b.b(subscribe);
        }
    }
}
