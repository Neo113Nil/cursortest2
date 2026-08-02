package defpackage;

import com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment;

/* loaded from: classes2.dex */
public final class dtv implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ InfoFragment b;

    public /* synthetic */ dtv(InfoFragment infoFragment, int i) {
        this.a = i;
        this.b = infoFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        InfoFragment infoFragment = this.b;
        switch (i) {
        }
        return infoFragment.getViewLifecycleOwner().getLifecycle();
    }
}
