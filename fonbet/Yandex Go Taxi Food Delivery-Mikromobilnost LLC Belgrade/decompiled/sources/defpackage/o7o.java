package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment;

/* loaded from: classes2.dex */
public final class o7o implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ErrorFragment b;

    public /* synthetic */ o7o(ErrorFragment errorFragment, int i) {
        this.a = i;
        this.b = errorFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        ErrorFragment errorFragment = this.b;
        switch (i) {
        }
        return errorFragment.getViewLifecycleOwner().getLifecycle();
    }
}
