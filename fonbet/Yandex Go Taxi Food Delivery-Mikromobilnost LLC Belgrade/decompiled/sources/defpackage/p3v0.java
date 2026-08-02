package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment;

/* loaded from: classes2.dex */
public final class p3v0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuccessFragment b;

    public /* synthetic */ p3v0(SuccessFragment successFragment, int i) {
        this.a = i;
        this.b = successFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        SuccessFragment successFragment = this.b;
        switch (i) {
        }
        return successFragment.getViewLifecycleOwner().getLifecycle();
    }
}
