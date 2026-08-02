package defpackage;

import androidx.fragment.app.Fragment;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;

/* loaded from: classes2.dex */
public final class pu5 implements xcy {
    public final /* synthetic */ BindCardActivity a;

    public pu5(BindCardActivity bindCardActivity) {
        this.a = bindCardActivity;
    }

    @Override // defpackage.xcy
    public final ddy E() {
        return new ddy();
    }

    @Override // defpackage.xcy
    public final tc5 a() {
        return this.a.getActivityViewModel();
    }

    @Override // defpackage.xcy
    public final Object b(Fragment fragment, Class cls) {
        return ((y8h) ((p7u) dpb1.c(fragment)).componentDispatcher()).b(xxk.class);
    }

    @Override // defpackage.xcy
    public final void p(boolean z) {
    }

    @Override // defpackage.xcy
    public final void t() {
        this.a.getBinding().b.setVisibility(8);
    }
}
