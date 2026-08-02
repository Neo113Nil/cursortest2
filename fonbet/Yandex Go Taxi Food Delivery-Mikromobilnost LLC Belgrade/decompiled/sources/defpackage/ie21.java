package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment;

/* loaded from: classes2.dex */
public final class ie21 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ UpsaleFragment b;

    public /* synthetic */ ie21(UpsaleFragment upsaleFragment, int i) {
        this.a = i;
        this.b = upsaleFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        UpsaleFragment upsaleFragment = this.b;
        switch (i) {
        }
        return upsaleFragment.getViewLifecycleOwner().getLifecycle();
    }
}
