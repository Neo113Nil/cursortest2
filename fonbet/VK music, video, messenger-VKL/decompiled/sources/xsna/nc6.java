package xsna;

import com.vk.toggle.debug.BaseDebugTogglesFragment;

/* compiled from: BaseDebugTogglesFragment.kt */
/* loaded from: classes6.dex */
public final class nc6 {
    public final /* synthetic */ BaseDebugTogglesFragment a;

    public nc6(BaseDebugTogglesFragment baseDebugTogglesFragment) {
        this.a = baseDebugTogglesFragment;
    }

    public final void a() {
        BaseDebugTogglesFragment baseDebugTogglesFragment = this.a;
        String str = baseDebugTogglesFragment.Q;
        bpn0 bpn0Var = cqm0.a;
        if (str == null) {
            str = "";
        }
        itg0.c(new io.reactivex.rxjava3.internal.operators.single.v(new mc6(0, baseDebugTogglesFragment, str)).q(io.reactivex.rxjava3.schedulers.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new x8(new w8(baseDebugTogglesFragment, 7), 2)), baseDebugTogglesFragment);
    }
}
